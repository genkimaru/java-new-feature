package jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @auther guan.c.wang
 * @date 8/2/2018.
 * @see  java.util.stream.Stream
 */
class Foo<T> {
    public Foo(String name) {
        this.name = name;
    }

    public String name;
    public List<T> bars = new ArrayList<T>();
        }
class Bar {
    public Bar(String name) {
        this.name = name;
    }

    public String name;
        }

public class Java8StreamDemo3 {

    public void flatMap(List<Foo<Bar>> foos){
        Stream<Bar> barStream = foos.stream().flatMap(f -> f.bars.stream());


    }

}
