package com.google.gson.p1076a;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.gson.a.c */
public @interface C17952c {
    /* renamed from: a */
    String mo34828a();

    /* renamed from: b */
    String[] mo34829b() default {};
}
