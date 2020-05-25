package com.bytedance.p763l.p764a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.l.a.e */
class C12147e {

    /* renamed from: c */
    private static volatile C12147e f32064c;

    /* renamed from: a */
    final Map<String, String> f32065a = new HashMap();

    /* renamed from: b */
    final Map<String, String> f32066b = new HashMap();

    private C12147e() {
    }

    /* renamed from: a */
    public static C12147e m24581a() {
        if (f32064c == null) {
            synchronized (C12147e.class) {
                if (f32064c == null) {
                    f32064c = new C12147e();
                }
            }
        }
        return f32064c;
    }

    /* renamed from: a */
    public final String mo23059a(String str) {
        String str2 = (String) this.f32065a.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }

    /* renamed from: b */
    public final String mo23060b(String str) {
        String str2 = (String) this.f32066b.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }
}
