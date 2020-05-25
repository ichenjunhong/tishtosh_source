package com.google.android.gms.internal.ads;

import android.view.View;

final class amd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f40918a;

    /* renamed from: b */
    private final /* synthetic */ C16442zy f40919b;

    /* renamed from: c */
    private final /* synthetic */ int f40920c;

    /* renamed from: d */
    private final /* synthetic */ amb f40921d;

    amd(amb amb, View view, C16442zy zyVar, int i) {
        this.f40921d = amb;
        this.f40918a = view;
        this.f40919b = zyVar;
        this.f40920c = i;
    }

    public final void run() {
        this.f40921d.m33308a(this.f40918a, this.f40919b, this.f40920c - 1);
    }
}
