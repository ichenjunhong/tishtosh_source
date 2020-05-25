package com.bytedance.scene.p841c;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.scene.c.m */
public final class C12881m {

    /* renamed from: a */
    public static int f33708a;

    /* renamed from: b */
    public static Method f33709b;

    /* renamed from: a */
    public static void m25807a() {
        try {
            f33708a = 2;
            Method declaredMethod = ViewGroup.class.getDeclaredMethod("cancelTouchTarget", new Class[]{View.class});
            f33709b = declaredMethod;
            declaredMethod.setAccessible(true);
            f33708a = 1;
        } catch (NoSuchMethodException unused) {
        }
    }
}
