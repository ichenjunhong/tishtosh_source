package com.google.gson.p1076a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.gson.a.b */
public @interface C17951b {
    /* renamed from: a */
    Class<?> mo34826a();

    /* renamed from: b */
    boolean mo34827b() default true;
}
