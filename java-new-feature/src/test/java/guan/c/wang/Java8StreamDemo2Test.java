package guan.c.wang;

import org.junit.Before;
import org.junit.Test;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * @auther guan.c.wang
 * @date 8/2/2018.
 * @see
 */
public class Java8StreamDemo2Test {

    private Stream<People> peoples;
    private Java8StreamDemo2 demo2;

    @Before
    public void setUp() throws Exception {
        demo2 = new Java8StreamDemo2();
        peoples = Stream.of(new People("John", 20), new People("Kevin", 25), new People("Alice", 15));
    }

    @Test
    public void collectAbove18() throws Exception {
        Stream<People> peopleStream = demo2.collectAbove18(peoples);
        long count = peopleStream.count();
        assertEquals(2, count);

    }

    @Test
    public void collectAvgOfAge() throws Exception {
        Double avgOfAge = demo2.collectAvgOfAge(peoples);
        assertEquals(20D , avgOfAge.doubleValue() , 0);
    }

    @Test
    public void collectSumOfAge() throws Exception {
        IntSummaryStatistics ageStat = demo2.collectSumOfAge(peoples);
        double average = ageStat.getAverage();
        assertEquals(20  , average , 0);
    }

    @Test
    public void collectJoinName() throws Exception {
        String joinName = demo2.collectJoinName(peoples);
        System.out.println(joinName);
    }

    @Test
    public void collectMap() throws Exception {
        Map<String, Integer> map = demo2.collectMap(peoples);
        map.forEach((k , v) -> System.out.println(k + " -> " + v));

    }

}