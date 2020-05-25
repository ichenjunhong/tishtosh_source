package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14963ax;

@C16299uq
public final class akq extends C15563abr {

    /* renamed from: a */
    final aib f40776a;

    /* renamed from: b */
    final akt f40777b;

    /* renamed from: c */
    private final String f40778c;

    /* renamed from: d */
    private final String[] f40779d;

    akq(aib aib, akt akt, String str, String[] strArr) {
        this.f40776a = aib;
        this.f40777b = akt;
        this.f40778c = str;
        this.f40779d = strArr;
        C14963ax.m30848r().f40781a.add(this);
    }

    /* renamed from: a */
    public final void mo27696a() {
        try {
            this.f40777b.mo29094a(this.f40778c, this.f40779d);
        } finally {
            acd.f40245a.post(new akr(this));
        }
    }

    /* renamed from: x_ */
    public final void mo27697x_() {
        this.f40777b.mo29088a();
    }
}
