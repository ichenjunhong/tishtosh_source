package com.p683ss.android.ugc.aweme.choosemusic.p1514h;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.h.f */
public final class C24966f {

    /* renamed from: a */
    public String f66075a;

    /* renamed from: b */
    public long f66076b;

    /* renamed from: c */
    long f66077c;

    /* renamed from: d */
    int f66078d;

    /* renamed from: c */
    public final int mo50926c(String str) {
        if (!C52711k.m112239a((Object) this.f66075a, (Object) str)) {
            return 0;
        }
        return this.f66078d;
    }

    /* renamed from: a */
    public final void mo50924a(String str) {
        if (!C52711k.m112239a((Object) this.f66075a, (Object) str)) {
            this.f66076b = -1;
            this.f66077c = 0;
            return;
        }
        this.f66077c = System.currentTimeMillis() - this.f66076b;
    }

    /* renamed from: b */
    public final long mo50925b(String str) {
        if (!C52711k.m112239a((Object) this.f66075a, (Object) str)) {
            return 0;
        }
        if (this.f66077c <= 0 && this.f66076b > 0) {
            this.f66077c = System.currentTimeMillis() - this.f66076b;
        }
        return this.f66077c;
    }
}
