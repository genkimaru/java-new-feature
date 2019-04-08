package jdk8.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @auther guan.c.wang
 * @date 8/2/2018.
 * @see
 */
public class Java8StreamDemoTest {


    private IntStream intStream;
    private Java8StreamDemo demo;
    private Stream stream;
    private Stream stream2;

    @Before
    public void setUp() throws Exception {
        demo = new Java8StreamDemo();
        intStream = IntStream.range(0, 100);
        stream = Stream.of(1,2,3);
        stream2 = Stream.of("a", "b", "c");
    }

    @Test
    public void basicIntStream() throws Exception {
        demo.basicIntStream(intStream);
    }

    @Test
    public void basicStream() throws Exception {
        demo.basicStream(stream);
    }

    @Test
    public void bacicStream2() throws Exception {
        demo.bacicStream2(stream2);
    }

}