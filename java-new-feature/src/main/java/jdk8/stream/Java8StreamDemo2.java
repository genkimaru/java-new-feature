package jdk8.stream;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @auther guan.c.wang
 * @date 8/2/2018.
 * @see
 */


public class Java8StreamDemo2 {

    public Stream<People> collectAbove18(Stream<People> peoples ){
        return peoples.filter( p -> p.age > 18);
    }


    public Double collectAvgOfAge(Stream<People> peoples ){
       return  peoples.collect(Collectors.averagingInt(p -> p.age));

    }


    public IntSummaryStatistics collectSumOfAge(Stream<People> peoples ){
       return  peoples.collect(Collectors.summarizingInt(p -> p.age));
    }

    public String collectJoinName(Stream<People> peoples ){

      return   peoples.map(p -> p.name ).collect(Collectors.joining(" and " , "Both " , " are chinese "));
    }


    public Map<String, Integer> collectMap(Stream<People> peoples ){
        Map<String, Integer> collect = peoples.collect(Collectors.toMap(p -> p.name, p -> p.age));
        return collect;

    }
}
