package com.bytedance.p753k.p758b.p759a;

import android.content.Context;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.p753k.p754a.p755a.C12109d;

/* renamed from: com.bytedance.k.b.a.d */
public class C12119d implements C12109d {

    /* renamed from: a */
    private static volatile C12109d f32042a;

    private C12119d() {
    }

    /* renamed from: a */
    public final Context mo22890a() {
        return C3922z.m9915e();
    }

    /* renamed from: b */
    public static C12109d m24545b() {
        if (f32042a == null) {
            synchronized (C12119d.class) {
                if (f32042a == null) {
                    f32042a = new C12119d();
                }
            }
        }
        return f32042a;
    }
}
