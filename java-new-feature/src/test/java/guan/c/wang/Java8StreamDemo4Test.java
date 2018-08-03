package guan.c.wang;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * @auther guan.c.wang
 * @date 8/3/2018.
 * @see
 */
public class Java8StreamDemo4Test {

    @Test
    public void getDefaultParallelThreads() throws Exception {
    }

    private List<People> peoples;
    private Java8StreamDemo4 demo4;

    @Before
    public void setUp() throws Exception {
        demo4 = new Java8StreamDemo4();
        peoples = Arrays.asList(new People("Kevin", 20) ,
                new People("Lucy", 30) ,
                new People( "Lily", 40)

        );
    }
    @Test
    public void getOldAgeByReduce() throws Exception {
        Optional<People> result = demo4.getOldAgeByReduce(peoples);
        assertEquals( peoples.get(2) , result.get());
    }

    @Test
    public void getOldAgePeopleByReduce() throws Exception {
        People result = demo4.getOldAgePeopleByReduce(peoples);
        assertEquals(peoples.get(2) , result);
    }

    @Test
    public void getSumByReduce() throws Exception {
        Integer result = demo4.getSumByReduce(peoples);
        assertEquals(90 , result.intValue());
    }


}