package com.bytedance.ies.bullet.kit.p644rn.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.bytedance.ies.bullet.kit.rn.core.BulletProp */
public @interface BulletProp {
    String name();
}
