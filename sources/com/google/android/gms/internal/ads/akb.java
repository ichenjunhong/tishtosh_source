package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

final /* synthetic */ class akb implements bss {

    /* renamed from: a */
    private final ajz f40757a;

    /* renamed from: b */
    private final String f40758b;

    akb(ajz ajz, String str) {
        this.f40757a = ajz;
        this.f40758b = str;
    }

    /* renamed from: a */
    public final bsr mo29075a() {
        ajz ajz = this.f40757a;
        ajt ajt = new ajt(this.f40758b, ajz.f40747d.f40561j ? null : ajz, ajz.f40747d.f40555d, ajz.f40747d.f40557f, ajz.f40747d.f40560i);
        ajz.f40751h.add(new WeakReference(ajt));
        return ajt;
    }
}
