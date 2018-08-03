package guan.c.wang.stream;

import guan.c.wang.stream.Bar;
import guan.c.wang.stream.Foo;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * @auther guan.c.wang
 * @date 8/3/2018.
 * @see
 */
public class Java8StreamDemo3Test {

    private Stream<Foo> foos;

    @Before
    public void setUp() throws Exception {
        // initilize the foos
        foos = IntStream.range(0, 10).mapToObj(i -> new Foo(" Foo-Name-Id" + i)).peek(f -> {
            IntStream.range(0, 10).mapToObj(i -> new Bar("Bar-name-id " + i)).forEach(f.bars::add);
        });


    }

    @Test
    public void flatMap() throws Exception {
       assertEquals(100 ,foos.flatMap( f -> f.bars.stream()).count() );
    }

}