package jdk8.annotation;

/**
 * @auther guan.c.wang
 * @date 4/8/2019.
 * @see
 */
@FilterPath("/web/list")
class CC { }



@FilterPaths({@FilterPath("/db/aa") ,@FilterPath("/db/bb") , @FilterPath("/db/cc")})
class BB{ }


@FilterPath("/web/update")
@FilterPath("/web/add")
@FilterPath("/web/delete")
class AA extends CC {

}

public class RepeatableTest{

    public static void main(String[] args) {

        Class<?> clazz = AA.class;
        //通过getAnnotationsByType方法获取所有重复注解
        FilterPath[] annotationsByType = clazz.getAnnotationsByType(FilterPath.class);
        FilterPath[] annotationsByType2 = clazz.getDeclaredAnnotationsByType(FilterPath.class);
        if (annotationsByType != null) {
            for (FilterPath filter : annotationsByType) {
                System.out.println("1:" + filter.value());
            }
        }

        System.out.println("-----------------");

        if (annotationsByType2 != null) {
            for (FilterPath filter : annotationsByType2) {
                System.out.println("2:" + filter.value());
            }
        }


        System.out.println("使用getAnnotation的结果:" + clazz.getAnnotation(FilterPath.class));

    }
}
