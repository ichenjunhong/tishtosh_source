package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

/* renamed from: com.google.android.gms.measurement.internal.ch */
final class C17042ch implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConditionalUserProperty f48097a;

    /* renamed from: b */
    private final /* synthetic */ C17038cd f48098b;

    C17042ch(C17038cd cdVar, ConditionalUserProperty conditionalUserProperty) {
        this.f48098b = cdVar;
        this.f48097a = conditionalUserProperty;
    }

    public final void run() {
        C17038cd.m41346a(this.f48098b, this.f48097a);
    }
}
