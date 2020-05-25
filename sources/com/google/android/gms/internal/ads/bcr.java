package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bcr extends bbt<bcr> {

    /* renamed from: c */
    public Integer f41874c;

    /* renamed from: d */
    public String f41875d;

    /* renamed from: e */
    public byte[] f41876e;

    public bcr() {
        this.f41874c = null;
        this.f41875d = null;
        this.f41876e = null;
        this.f41783a = null;
        this.f41795b = -1;
    }

    /* renamed from: a */
    public final void mo30026a(bbr bbr) throws IOException {
        if (this.f41874c != null) {
            bbr.mo30018a(1, this.f41874c.intValue());
        }
        if (this.f41875d != null) {
            bbr.mo30021a(2, this.f41875d);
        }
        if (this.f41876e != null) {
            bbr.mo30022a(3, this.f41876e);
        }
        super.mo30026a(bbr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30025a() {
        int a = super.mo30025a();
        if (this.f41874c != null) {
            a += bbr.m35316b(1, this.f41874c.intValue());
        }
        if (this.f41875d != null) {
            a += bbr.m35318b(2, this.f41875d);
        }
        return this.f41876e != null ? a + bbr.m35319b(3, this.f41876e) : a;
    }
}
