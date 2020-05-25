package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bcm extends bbt<bcm> {

    /* renamed from: c */
    public String f41865c;

    public bcm() {
        this.f41865c = null;
        this.f41783a = null;
        this.f41795b = -1;
    }

    /* renamed from: a */
    public final void mo30026a(bbr bbr) throws IOException {
        if (this.f41865c != null) {
            bbr.mo30021a(1, this.f41865c);
        }
        super.mo30026a(bbr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30025a() {
        int a = super.mo30025a();
        return this.f41865c != null ? a + bbr.m35318b(1, this.f41865c) : a;
    }
}
