package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bcb.C15692b.C15698d.C15700b;
import java.io.IOException;

public final class bco extends bbt<bco> {

    /* renamed from: c */
    public bcn[] f41869c;

    /* renamed from: d */
    private C15700b f41870d;

    /* renamed from: e */
    private byte[] f41871e;

    /* renamed from: f */
    private byte[] f41872f;

    /* renamed from: g */
    private Integer f41873g;

    public bco() {
        this.f41870d = null;
        this.f41869c = bcn.m35403d();
        this.f41871e = null;
        this.f41872f = null;
        this.f41873g = null;
        this.f41783a = null;
        this.f41795b = -1;
    }

    /* renamed from: a */
    public final void mo30026a(bbr bbr) throws IOException {
        if (this.f41869c != null && this.f41869c.length > 0) {
            for (bcn bcn : this.f41869c) {
                if (bcn != null) {
                    bbr.mo30020a(2, (bby) bcn);
                }
            }
        }
        super.mo30026a(bbr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30025a() {
        int a = super.mo30025a();
        if (this.f41869c != null && this.f41869c.length > 0) {
            for (bcn bcn : this.f41869c) {
                if (bcn != null) {
                    a += bbr.m35317b(2, (bby) bcn);
                }
            }
        }
        return a;
    }
}
