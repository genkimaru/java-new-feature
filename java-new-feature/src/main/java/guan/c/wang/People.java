package guan.c.wang;

/**
 * @auther guan.c.wang
 * @date 8/2/2018.
 * @see
 */
public class People {

    public String name ;
    public int age ;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
