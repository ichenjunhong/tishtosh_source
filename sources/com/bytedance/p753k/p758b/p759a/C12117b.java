package com.bytedance.p753k.p758b.p759a;

import com.bytedance.p753k.p754a.p755a.C12107b;

/* renamed from: com.bytedance.k.b.a.b */
public class C12117b implements C12107b {

    /* renamed from: a */
    private static volatile C12107b f32040a;

    private C12117b() {
    }

    /* renamed from: a */
    public static C12107b m24542a() {
        if (f32040a == null) {
            synchronized (C12117b.class) {
                if (f32040a == null) {
                    f32040a = new C12117b();
                }
            }
        }
        return f32040a;
    }
}
