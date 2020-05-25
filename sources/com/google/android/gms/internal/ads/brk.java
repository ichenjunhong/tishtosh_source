package com.google.android.gms.internal.ads;

final class brk implements brh {

    /* renamed from: a */
    private final /* synthetic */ int f43675a;

    /* renamed from: b */
    private final /* synthetic */ brj f43676b;

    brk(brj brj, int i) {
        this.f43676b = brj;
        this.f43675a = i;
    }

    /* renamed from: a */
    public final void mo30384a(bmp bmp, Object obj) {
        brl brl;
        brj brj = this.f43676b;
        int i = this.f43675a;
        if (brj.f43674h == null) {
            int b = bmp.mo30414b();
            int i2 = 0;
            while (true) {
                if (i2 >= b) {
                    if (brj.f43673g == -1) {
                        brj.f43673g = bmp.mo30415c();
                    } else if (bmp.mo30415c() != brj.f43673g) {
                        brl = new brl(1);
                    }
                    brl = null;
                } else if (bmp.mo30411a(i2, brj.f43669c, false).f42987e) {
                    brl = new brl(0);
                    break;
                } else {
                    i2++;
                }
            }
            brj.f43674h = brl;
        }
        if (brj.f43674h == null) {
            brj.f43668b.remove(brj.f43667a[i]);
            if (i == 0) {
                brj.f43671e = bmp;
                brj.f43672f = obj;
            }
            if (brj.f43668b.isEmpty()) {
                brj.f43670d.mo30384a(brj.f43671e, brj.f43672f);
            }
        }
    }
}
