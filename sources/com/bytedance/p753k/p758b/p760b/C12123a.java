package com.bytedance.p753k.p758b.p760b;

import com.bytedance.p753k.p754a.p756b.C12113a;
import com.bytedance.p753k.p758b.p759a.C12119d;

/* renamed from: com.bytedance.k.b.b.a */
public final class C12123a implements C12113a {

    /* renamed from: a */
    private static volatile C12113a f32046a;

    private C12123a() {
    }

    /* renamed from: a */
    public static C12113a m24551a() {
        if (f32046a == null) {
            synchronized (C12119d.class) {
                if (f32046a == null) {
                    f32046a = new C12123a();
                }
            }
        }
        return f32046a;
    }
}
