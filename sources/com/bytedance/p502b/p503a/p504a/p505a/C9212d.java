package com.bytedance.p502b.p503a.p504a.p505a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.bytedance.b.a.a.a.d */
public @interface C9212d {
    /* renamed from: a */
    String mo16572a();

    /* renamed from: b */
    int mo16573b() default 0;

    /* renamed from: c */
    long mo16574c() default 0;

    /* renamed from: d */
    double mo16575d() default 0.0d;

    /* renamed from: e */
    float mo16576e() default 0.0f;

    /* renamed from: f */
    boolean mo16577f() default false;

    /* renamed from: g */
    String mo16578g() default "";
}
