package com.bytedance.retrofit2.p831b;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.bytedance.retrofit2.b.j */
public @interface C12708j {
    /* renamed from: a */
    String mo23878a();

    /* renamed from: b */
    String mo23879b() default "";

    /* renamed from: c */
    boolean mo23880c() default false;
}
