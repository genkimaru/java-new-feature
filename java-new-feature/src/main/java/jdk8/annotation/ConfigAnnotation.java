package jdk8.annotation;

import java.lang.annotation.*;

/**
 * @auther guan.c.wang
 * @date 4/9/2019.
 * @see
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ConfigAnnotation {

    String path() ;
}
