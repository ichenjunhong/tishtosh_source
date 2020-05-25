package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.app.Application;
import java.lang.reflect.Field;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.an */
public final class C26389an {

    /* renamed from: a */
    public static final Class<?> f69617a = null;

    /* renamed from: b */
    public static final Object f69618b;

    /* renamed from: c */
    public static final C26389an f69619c = new C26389an();

    private C26389an() {
    }

    static {
        Object obj = null;
        try {
            Class<?> cls = f69617a;
            if (cls != null) {
                Field declaredField = cls.getDeclaredField("INSTANCE");
                if (declaredField != null) {
                    obj = declaredField.get(null);
                }
            }
        } catch (Exception unused) {
        }
        f69618b = obj;
    }

    /* renamed from: a */
    public final void mo54109a(Application application) {
        C52711k.m112240b(application, "application");
        Class<?> cls = f69617a;
        if (cls != null) {
            try {
                cls.getDeclaredMethod("init", new Class[]{Application.class}).invoke(f69618b, new Object[]{application});
            } catch (Exception unused) {
            }
        }
    }
}
