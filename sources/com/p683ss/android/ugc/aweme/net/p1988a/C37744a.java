package com.p683ss.android.ugc.aweme.net.p1988a;

import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.net.a.a */
public class C37744a {

    /* renamed from: a */
    private static C37744a f96173a;

    /* renamed from: b */
    private Object f96174b;

    private C37744a() {
        try {
            this.f96174b = Class.forName("android.os.SystemProperties").newInstance();
        } catch (ClassNotFoundException | InstantiationException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }

    /* renamed from: a */
    public static C37744a m84256a() {
        if (f96173a == null) {
            synchronized (C37744a.class) {
                if (f96173a == null) {
                    f96173a = new C37744a();
                }
            }
        }
        return f96173a;
    }

    /* renamed from: a */
    public final String mo77237a(String str) {
        String str2;
        String str3 = "";
        if (this.f96174b == null) {
            return str3;
        }
        try {
            Method method = this.f96174b.getClass().getMethod("get", new Class[]{String.class});
            method.setAccessible(true);
            str2 = (String) method.invoke(this.f96174b, new Object[]{str});
            if (str2 == null) {
                str3 = "";
                str2 = str3;
            }
        } catch (Exception unused) {
        }
        return str2;
    }
}
