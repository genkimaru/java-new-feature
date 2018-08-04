package guan.c.wang.foreach;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * @auther guan.c.wang
 * @date 8/3/2018.
 * @see
 */
public class MyConsumerTest {

    private List<Integer> list;

    @Before
    public void setUp() throws Exception {
        list = Arrays.asList( 1 , 2, 3 , 4 ,5);

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
}