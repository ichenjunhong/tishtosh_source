package com.bytedance.p753k.p758b.p761c;

import android.support.p030v4.app.Fragment;
import com.bytedance.android.livesdk.feed.p334c.C6856b;
import com.bytedance.p753k.p754a.p757c.C12115b;
import com.bytedance.p753k.p758b.p759a.C12119d;

/* renamed from: com.bytedance.k.b.c.b */
public final class C12125b implements C12115b {

    /* renamed from: a */
    private static volatile C12115b f32048a;

    private C12125b() {
    }

    /* renamed from: a */
    public final Fragment mo22894a() {
        return C6856b.m14399b().mo13015a();
    }

    /* renamed from: b */
    public static C12115b m24555b() {
        if (f32048a == null) {
            synchronized (C12119d.class) {
                if (f32048a == null) {
                    f32048a = new C12125b();
                }
            }
        }
        return f32048a;
    }
}
