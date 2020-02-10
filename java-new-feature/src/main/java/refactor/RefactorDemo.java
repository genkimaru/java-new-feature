package refactor;

/**
 * @auther guan.c.wang
 * @date 4/17/2019.
 * @see <a href="https://www.jetbrains.com/help/idea/refactoring-source-code.html"></a>
 */
public class RefactorDemo {

    // type psvm to generate the main method automatically.
    // similarly , type sout to generate System.out.print()
    // ctrl + j to view more shortcut key .
    public static void main(String[] args) {

        new RefactorDemo().testExtractParam("start", 0);

        System.out.println("aaa");
    }


    public void test(String abc){
        // to make method and make method object , select the expression at first ,then refactor.
        priint("bbb");
    }


    private void priint(String bbb) {
        System.out.println(bbb);
    }


    //convert a static method to an instance method. ensure the condition that the method is a static one.
    private void testExtractParam(String abc, int count) {

        // put the expression into a method object
        Threads threads = new Threads().invoke();
        Thread t1 = threads.getT1();
        Thread t2 = threads.getT2();
        t1.start();
        t2.start();
        priint(abc);
    }


    private class Threads {
        private Thread t1;
        private Thread t2;

        Thread getT1() {
            return t1;
        }

        Thread getT2() {
            return t2;
        }

        Threads invoke() {
            t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    priint("t1..");
                }
            });
            t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    priint("t2...");
                }
            });
            return this;
        }
    }
}
