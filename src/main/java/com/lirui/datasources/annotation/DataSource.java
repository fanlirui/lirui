package com.lirui.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 *
 * @date 2017-09-29
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}
