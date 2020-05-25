package com.adm.push;

import android.content.Context;
import com.amazon.device.messaging.ADM;

/* renamed from: com.adm.push.b */
class C2289b {

    /* renamed from: b */
    private static C2289b f7099b;

    /* renamed from: a */
    final ADM f7100a;

    private C2289b(Context context) {
        this.f7100a = new ADM(context);
    }

    /* renamed from: a */
    public static C2289b m6819a(Context context) {
        if (f7099b == null) {
            synchronized (C2289b.class) {
                if (f7099b == null) {
                    f7099b = new C2289b(context);
                }
            }
        }
        return f7099b;
    }
}
