package jdk8.functionalinterface;

/**
 * If you notice above interfaces code, you will notice @FunctionalInterface annotation.
 * Functional interfaces are new concept introduced in Java 8.
 * An interface with exactly one abstract method becomes Functional Interface.
 * We don’t need to use @FunctionalInterface annotation to mark an interface as Functional Interface.
 *
 * @FunctionalInterface annotation is a facility to avoid accidental addition of abstract methods in the functional interfaces.
 * You can think of it like @Override annotation and it’s best practice to use it.
 * java.lang.Runnable with single abstract method run() is a great example of functional interface.
 * @auther guan.c.wang
 * @date 8/3/2018.
 * @see
 */

@FunctionalInterface   //single abstract method
interface TestInfterface {

    public  int add(int i);

    default  void print(){
        System.out.print("default method ");
    }

}


public class FunctionalInterfaceDemo {

    private TestInfterface fun_1 = new TestInfterface() {
        @Override
        public int add(int i) {
            return i + 1 ;
        }
    };

    private TestInfterface fun_2 = i -> i + 1;


}
