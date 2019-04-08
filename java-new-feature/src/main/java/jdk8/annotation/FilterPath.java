package jdk8.annotation;

import java.lang.annotation.*;

/**
 * @auther guan.c.wang
 * @date 4/8/2019.
 * @see
 */
//使用Java8新增@Repeatable原注解
@Target({ElementType.TYPE,ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(FilterPaths.class)
@Inherited
public @interface FilterPath {
    String  value();
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface FilterPaths {
    FilterPath[] value();
}
