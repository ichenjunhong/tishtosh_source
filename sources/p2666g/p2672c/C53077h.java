package p2666g.p2672c;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: g.c.h */
public @interface C53077h {
    /* renamed from: a */
    String mo110605a();

    /* renamed from: b */
    String mo110606b() default "";

    /* renamed from: c */
    boolean mo110607c() default false;
}
