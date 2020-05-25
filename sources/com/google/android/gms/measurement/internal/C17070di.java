package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.di */
final class C17070di implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ComponentName f48193a;

    /* renamed from: b */
    private final /* synthetic */ C17068dg f48194b;

    C17070di(C17068dg dgVar, ComponentName componentName) {
        this.f48194b = dgVar;
        this.f48193a = componentName;
    }

    public final void run() {
        C17055cu.m41434a(this.f48194b.f48190c, this.f48193a);
    }
}
