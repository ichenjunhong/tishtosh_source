package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bym.C15758g;
import com.google.android.gms.internal.ads.bym.C15764i;
import java.io.IOException;

public final class bzh extends bbt<bzh> {

    /* renamed from: c */
    public String f44665c;

    /* renamed from: d */
    public long[] f44666d;

    /* renamed from: e */
    public bzf f44667e;

    /* renamed from: f */
    public bzd f44668f;

    /* renamed from: g */
    private Integer f44669g;

    /* renamed from: h */
    private Integer f44670h;

    /* renamed from: i */
    private byq f44671i;

    /* renamed from: j */
    private bzi f44672j;

    /* renamed from: k */
    private bzg f44673k;

    /* renamed from: l */
    private C15758g f44674l;

    /* renamed from: m */
    private C15764i f44675m;

    public bzh() {
        this.f44669g = null;
        this.f44665c = null;
        this.f44670h = null;
        this.f44671i = null;
        this.f44672j = null;
        this.f44666d = bca.f41798b;
        this.f44667e = null;
        this.f44673k = null;
        this.f44674l = null;
        this.f44668f = null;
        this.f44675m = null;
        this.f41783a = null;
        this.f41795b = -1;
    }

    /* renamed from: a */
    public final void mo30026a(bbr bbr) throws IOException {
        if (this.f44665c != null) {
            bbr.mo30021a(10, this.f44665c);
        }
        if (this.f44666d != null && this.f44666d.length > 0) {
            for (long j : this.f44666d) {
                bbr.mo30024c(14, 0);
                bbr.mo30023a(j);
            }
        }
        if (this.f44667e != null) {
            bbr.mo30020a(15, (bby) this.f44667e);
        }
        if (this.f44668f != null) {
            bbr.mo30020a(18, (bby) this.f44668f);
        }
        super.mo30026a(bbr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30025a() {
        int a = super.mo30025a();
        if (this.f44665c != null) {
            a += bbr.m35318b(10, this.f44665c);
        }
        if (this.f44666d != null && this.f44666d.length > 0) {
            int i = 0;
            for (long b : this.f44666d) {
                i += bbr.m35320b(b);
            }
            a = a + i + (this.f44666d.length * 1);
        }
        if (this.f44667e != null) {
            a += bbr.m35317b(15, (bby) this.f44667e);
        }
        return this.f44668f != null ? a + bbr.m35317b(18, (bby) this.f44668f) : a;
    }
}
