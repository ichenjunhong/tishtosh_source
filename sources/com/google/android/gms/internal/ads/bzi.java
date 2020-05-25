package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bzi extends bbt<bzi> {

    /* renamed from: c */
    public Integer f44676c;

    /* renamed from: d */
    public Integer f44677d;

    /* renamed from: e */
    public Integer f44678e;

    public bzi() {
        this.f44676c = null;
        this.f44677d = null;
        this.f44678e = null;
        this.f41783a = null;
        this.f41795b = -1;
    }

    /* renamed from: a */
    public final void mo30026a(bbr bbr) throws IOException {
        if (this.f44676c != null) {
            bbr.mo30018a(1, this.f44676c.intValue());
        }
        if (this.f44677d != null) {
            bbr.mo30018a(2, this.f44677d.intValue());
        }
        if (this.f44678e != null) {
            bbr.mo30018a(3, this.f44678e.intValue());
        }
        super.mo30026a(bbr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30025a() {
        int a = super.mo30025a();
        if (this.f44676c != null) {
            a += bbr.m35316b(1, this.f44676c.intValue());
        }
        if (this.f44677d != null) {
            a += bbr.m35316b(2, this.f44677d.intValue());
        }
        return this.f44678e != null ? a + bbr.m35316b(3, this.f44678e.intValue()) : a;
    }
}
