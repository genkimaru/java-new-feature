package jdk8.stream;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @auther guan.c.wang
 * @date 8/2/2018.
 * @see
 */
public class Java8StreamDemo {


    private final IntPredicate predicate2 = i -> i< 10;
    private final IntPredicate predicate = i -> i > 0;

    private final Predicate<Integer>  predicate_3 = i -> i > 0;

    private final  Predicate<String>    predicate_4 = s -> s.contains("s");

    public void  basicIntStream(IntStream stream){

        stream.filter(predicate).filter(predicate2).count();

    }

    public void basicStream(Stream stream){
        stream.filter(predicate_3).count();

    }

    public void bacicStream2(Stream stream){
        stream.filter(predicate_4).count();
    }


}
