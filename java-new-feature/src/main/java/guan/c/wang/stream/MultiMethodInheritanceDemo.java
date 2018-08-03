package guan.c.wang.stream;

/**
 * @auther guan.c.wang
 * @date 8/3/2018.
 * @see
 */

interface  Foo1{
   default  public void  show(){
       System.out.print("Foo1");
   };
}

interface  Foo2{
    default  public void  show(){
        System.out.print("Foo2");
    };
}
public class MultiMethodInheritanceDemo  implements  Foo1 , Foo2{

 // when inherit the same name method from multiple interfaces  , the Java compiler will need to override the method .
    @Override
    public void show() {

    }
}
