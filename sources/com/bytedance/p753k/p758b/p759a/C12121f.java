package com.bytedance.p753k.p758b.p759a;

import com.bytedance.p753k.p754a.p755a.C12111f;

/* renamed from: com.bytedance.k.b.a.f */
public final class C12121f implements C12111f {

    /* renamed from: a */
    private static volatile C12111f f32044a;

    private C12121f() {
    }

    /* renamed from: a */
    public static C12111f m24549a() {
        if (f32044a == null) {
            synchronized (C12119d.class) {
                if (f32044a == null) {
                    f32044a = new C12121f();
                }
            }
        }
        return f32044a;
    }
}
