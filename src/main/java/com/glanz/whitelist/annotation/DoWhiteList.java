package com.glanz.whitelist.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author GlanzWen
 * @Description 注解类
 * @github
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoWhiteList {
    String key() default "";

    String returnJson() default "";
}
