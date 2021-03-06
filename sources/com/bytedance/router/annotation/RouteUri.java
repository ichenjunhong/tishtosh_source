package com.bytedance.router.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface RouteUri {
    String[] permission() default {""};

    String[] testurl() default {""};

    String[] value() default {""};
}
