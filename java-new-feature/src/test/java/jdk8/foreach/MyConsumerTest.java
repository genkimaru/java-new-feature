package jdk8.foreach;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @auther guan.c.wang
 * @date 8/3/2018.
 * @see
 */
public class MyConsumerTest {

    private List<Integer> list;
    private List<Integer> list2;
    private Predicate<Integer> predicate;

    @Before
    public void setUp() throws Exception {
        list = Arrays.asList( 1 , 2, 3 , 4 ,5);  // Returns a fixed-size list backed by the specified array.
        list2 = new ArrayList<Integer>(list);
        predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if (i % 2 == 0) {
                    return true;
                } else {
                    return false;
                }

            }
        };

    }


    @Test
    public void foreachTest() throws Exception {

        // Consumer can't change the original list element
        list.forEach(new MyUpdate());
        list.forEach(new MyPeek());

        // use the stream api to get the changed list element .
        Stream<Integer> newList = list.stream().map(i -> i + 1);
        newList.forEach(new MyPeek());

    }

    @Test
    public void testCollectionRemoveIf() throws Exception {
        list2.forEach(new MyPeek());
        list2.removeIf(predicate);
        list2.forEach(new MyPeek());
    }
}