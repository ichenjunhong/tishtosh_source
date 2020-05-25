package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

/* renamed from: com.google.android.gms.measurement.internal.ci */
final class C17043ci implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConditionalUserProperty f48099a;

    /* renamed from: b */
    private final /* synthetic */ C17038cd f48100b;

    C17043ci(C17038cd cdVar, ConditionalUserProperty conditionalUserProperty) {
        this.f48100b = cdVar;
        this.f48099a = conditionalUserProperty;
    }

    public final void run() {
        C17038cd.m41351b(this.f48100b, this.f48099a);
    }
}
