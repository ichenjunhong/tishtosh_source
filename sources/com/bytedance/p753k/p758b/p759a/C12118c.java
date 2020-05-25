package com.bytedance.p753k.p758b.p759a;

import com.bytedance.android.live.core.p230g.p231a.C3853c;
import com.bytedance.p753k.p754a.p755a.C12108c;
import com.facebook.imagepipeline.p975o.C14232c;

/* renamed from: com.bytedance.k.b.a.c */
public class C12118c implements C12108c {

    /* renamed from: a */
    private static volatile C12108c f32041a;

    private C12118c() {
    }

    /* renamed from: a */
    public static C12108c m24543a() {
        if (f32041a == null) {
            synchronized (C12118c.class) {
                if (f32041a == null) {
                    f32041a = new C12118c();
                }
            }
        }
        return f32041a;
    }

    /* renamed from: a */
    public final void mo22889a(Object obj) {
        try {
            new C3853c().mo9234a((C14232c) obj);
        } catch (Exception unused) {
        }
    }
}
