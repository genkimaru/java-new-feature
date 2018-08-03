package guan.c.wang;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

/**
 * @auther guan.c.wang
 * @date 8/3/2018.
 * @doc this is program to show how to use parallel stream and reduce operator on the stream.
 * the parallel operation is performing with the base on the ForkJoinPool
 *
 * @see
 */
public class Java8StreamDemo4 {


    public Stream<People> getParallelStream(List<People> peoples) {
        return peoples.stream().parallel();

    }

    public Stream<People> getParallelStream2(List<People> peoples) {
        return peoples.parallelStream();
    }

    // the first reduce method -- get one element from the list
    public Optional<People> getOldAgeByReduce(List<People> peoples) {
        return this.getParallelStream(peoples).reduce(
                (p1, p2) -> p1.age > p2.age ? p1 : p2
        );
    }

    // the second reduce method  -- get one element from the list , but set an initial value (sometimes as default value )
    public People getOldAgePeopleByReduce(List<People> peoples){
        return this.getParallelStream(peoples).reduce(
                new People("" ,0) ,
                (p1 , p2 ) -> p1.age >p2.age? p1 : p2
        );
    }

    // the third reduce method  -- get any other type value as the reture value . provide three prarmeters.
    public Integer getSumByReduce(List<People> peoples) {
        return this.getParallelStream(peoples).reduce(0,
                (sum, p) -> sum + p.age,
                (sum1, sum2) -> sum1 + sum2

        );

    }


    public int getDefaultParallelThreads(){

        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        return commonPool.getParallelism();
    }

}
