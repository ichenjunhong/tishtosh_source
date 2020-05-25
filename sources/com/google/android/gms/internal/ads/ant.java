package com.google.android.gms.internal.ads;

import android.view.View;

final class ant implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f41095a;

    /* renamed from: b */
    private final /* synthetic */ C16442zy f41096b;

    /* renamed from: c */
    private final /* synthetic */ int f41097c;

    /* renamed from: d */
    private final /* synthetic */ anq f41098d;

    ant(anq anq, View view, C16442zy zyVar, int i) {
        this.f41098d = anq;
        this.f41095a = view;
        this.f41096b = zyVar;
        this.f41097c = i;
    }

    public final void run() {
        this.f41098d.m33681a(this.f41095a, this.f41096b, this.f41097c - 1);
    }
}
