package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

public final class brj implements brg {

    /* renamed from: a */
    final brg[] f43667a;

    /* renamed from: b */
    final ArrayList<brg> f43668b;

    /* renamed from: c */
    final bms f43669c = new bms();

    /* renamed from: d */
    brh f43670d;

    /* renamed from: e */
    bmp f43671e;

    /* renamed from: f */
    Object f43672f;

    /* renamed from: g */
    int f43673g = -1;

    /* renamed from: h */
    brl f43674h;

    public brj(brg... brgArr) {
        this.f43667a = brgArr;
        this.f43668b = new ArrayList<>(Arrays.asList(brgArr));
    }

    /* renamed from: a */
    public final void mo30600a(blu blu, boolean z, brh brh) {
        this.f43670d = brh;
        for (int i = 0; i < this.f43667a.length; i++) {
            this.f43667a[i].mo30600a(blu, false, new brk(this, i));
        }
    }

    /* renamed from: a */
    public final bre mo30598a(int i, bsp bsp) {
        bre[] breArr = new bre[this.f43667a.length];
        for (int i2 = 0; i2 < breArr.length; i2++) {
            breArr[i2] = this.f43667a[i2].mo30598a(i, bsp);
        }
        return new bri(breArr);
    }

    /* renamed from: a */
    public final void mo30601a(bre bre) {
        bri bri = (bri) bre;
        for (int i = 0; i < this.f43667a.length; i++) {
            this.f43667a[i].mo30601a(bri.f43660a[i]);
        }
    }

    /* renamed from: a */
    public final void mo30599a() {
        for (brg a : this.f43667a) {
            a.mo30599a();
        }
    }
}
