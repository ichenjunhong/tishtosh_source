package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bym.C15777n;
import java.io.IOException;

public final class bzf extends bbt<bzf> {

    /* renamed from: c */
    public String f44657c;

    /* renamed from: d */
    public bzi f44658d;

    /* renamed from: e */
    private C15777n f44659e;

    /* renamed from: f */
    private Integer f44660f;

    /* renamed from: g */
    private Integer f44661g;

    /* renamed from: h */
    private byq f44662h;

    /* renamed from: i */
    private byq f44663i;

    /* renamed from: j */
    private byq f44664j;

    public bzf() {
        this.f44657c = null;
        this.f44659e = null;
        this.f44660f = null;
        this.f44658d = null;
        this.f44661g = null;
        this.f44662h = null;
        this.f44663i = null;
        this.f44664j = null;
        this.f41783a = null;
        this.f41795b = -1;
    }

    /* renamed from: a */
    public final void mo30026a(bbr bbr) throws IOException {
        if (this.f44657c != null) {
            bbr.mo30021a(1, this.f44657c);
        }
        if (this.f44658d != null) {
            bbr.mo30020a(4, (bby) this.f44658d);
        }
        super.mo30026a(bbr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30025a() {
        int a = super.mo30025a();
        if (this.f44657c != null) {
            a += bbr.m35318b(1, this.f44657c);
        }
        return this.f44658d != null ? a + bbr.m35317b(4, (bby) this.f44658d) : a;
    }
}
