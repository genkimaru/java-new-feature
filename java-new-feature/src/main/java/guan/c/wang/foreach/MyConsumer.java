package guan.c.wang.foreach;

import java.util.function.Consumer;

/**
 * @auther guan.c.wang
 * @date 8/3/2018.
 * @see
 */
 class MyUpdate implements Consumer<Integer> {


    @Override
    public void accept(Integer i) {
       i = i + 1;
    }
}


 class MyPeek implements Consumer<Integer> {


    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }
}

