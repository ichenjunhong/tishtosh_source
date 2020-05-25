package com.p683ss.android.ugc.aweme.commercialize.utils;

import java.lang.reflect.Field;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bz */
public final class C26447bz {

    /* renamed from: a */
    public static final C26447bz f69708a = new C26447bz();

    /* renamed from: b */
    private static final Class<?> f69709b = null;

    /* renamed from: c */
    private static final Object f69710c;

    private C26447bz() {
    }

    /* renamed from: a */
    public final void mo54162a(String str) {
        m63938a(this, str, 0, 2, null);
    }

    /* renamed from: b */
    public final void mo54163b(String str) {
        m63939b(this, str, 0, 2, null);
    }

    static {
        Object obj = null;
        try {
            Class<?> cls = f69709b;
            if (cls != null) {
                Field declaredField = cls.getDeclaredField("INSTANCE");
                if (declaredField != null) {
                    obj = declaredField.get(null);
                }
            }
        } catch (Exception unused) {
        }
        f69710c = obj;
    }

    /* renamed from: a */
    private static /* synthetic */ void m63938a(C26447bz bzVar, String str, int i, int i2, Object obj) {
        C52711k.m112240b(str, "log");
        Class<?> cls = f69709b;
        if (cls != null) {
            try {
                cls.getDeclaredMethod("awesomeSplashLog", new Class[]{String.class, Integer.TYPE}).invoke(f69710c, new Object[]{str, Integer.valueOf(1)});
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private static /* synthetic */ void m63939b(C26447bz bzVar, String str, int i, int i2, Object obj) {
        C52711k.m112240b(str, "log");
        Class<?> cls = f69709b;
        if (cls != null) {
            try {
                cls.getDeclaredMethod("ordinarySplashLog", new Class[]{String.class, Integer.TYPE}).invoke(f69710c, new Object[]{str, Integer.valueOf(1)});
            } catch (Exception unused) {
            }
        }
    }
}
