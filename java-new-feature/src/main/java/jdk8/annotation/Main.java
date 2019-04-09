package jdk8.annotation;

/**
 * @auther guan.c.wang
 * @date 4/9/2019.
 * @see
 */
@ConfigAnnotation(path = "C:\\github\\java-new-feature\\java-new-feature\\scripts\\dump_before_kill.sh")
class ReadConfig {


    public static String readConfig() {

        ConfigAnnotation configAnnotation = ReadConfig.class.getAnnotation(ConfigAnnotation.class);

        String path = configAnnotation.path();

        return path;
    }

}

public class Main {

    public static void main(String[] args) {
        String path = ReadConfig.readConfig();

        System.out.println(path);


    }

}
