package org.greenrobot.eventbus;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: org.greenrobot.eventbus.m */
public @interface C53771m {
    /* renamed from: a */
    ThreadMode mo112975a() default ThreadMode.POSTING;

    /* renamed from: b */
    boolean mo112976b() default false;

    /* renamed from: c */
    int mo112977c() default 0;
}
