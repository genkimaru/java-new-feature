package jdk8;

/**
 * @auther guan.c.wang
 * @date 5/28/2019.
 * @see
 */
public class SwitchDemo {

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        String s  = "ONE" ;
        switch (s) {
            case "ZERO":
                System.out.println("ZERO");
                break;
            case "ONE":
                System.out.println("ONE");
                break;
            case "TWO":
                System.out.println("TWO");
                break;
            default:
                System.out.println("default");
        }

    }
}
