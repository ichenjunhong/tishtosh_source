package com.google.android.gms.common.p1037d;

import android.content.Context;

/* renamed from: com.google.android.gms.common.d.d */
public final class C15377d {

    /* renamed from: b */
    private static C15377d f39658b = new C15377d();

    /* renamed from: a */
    private C15375b f39659a;

    /* renamed from: b */
    private final synchronized C15375b m31952b(Context context) {
        if (this.f39659a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f39659a = new C15375b(context);
        }
        return this.f39659a;
    }

    /* renamed from: a */
    public static C15375b m31951a(Context context) {
        return f39658b.m31952b(context);
    }
}
