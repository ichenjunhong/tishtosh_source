package com.p683ss.android.ugc.p1235a;

/* renamed from: com.ss.android.ugc.a.f */
public abstract class C20313f {
    /* renamed from: a */
    public static <T> T m50085a(String str) {
        try {
            Class cls = Class.forName(str);
            if (cls != null) {
                return cls.newInstance();
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
