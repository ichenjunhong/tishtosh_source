package com.bytedance.p753k.p758b.p759a;

import com.bytedance.p753k.p754a.p755a.C12106a;

/* renamed from: com.bytedance.k.b.a.a */
public class C12116a implements C12106a {

    /* renamed from: a */
    private static volatile C12106a f32039a;

    private C12116a() {
    }

    /* renamed from: a */
    public static C12106a m24541a() {
        if (f32039a == null) {
            synchronized (C12116a.class) {
                if (f32039a == null) {
                    f32039a = new C12116a();
                }
            }
        }
        return f32039a;
    }
}
