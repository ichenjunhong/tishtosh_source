package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bym.C15745a;
import com.google.android.gms.internal.ads.bym.C15748b;
import com.google.android.gms.internal.ads.bym.C15750c;
import com.google.android.gms.internal.ads.bym.C15754e;
import com.google.android.gms.internal.ads.bym.C15756f;
import com.google.android.gms.internal.ads.bym.C15762h;
import com.google.android.gms.internal.ads.bym.C15769j;
import java.io.IOException;

public final class bzd extends bbt<bzd> {

    /* renamed from: c */
    public Integer f44641c;

    /* renamed from: d */
    public bze f44642d;

    /* renamed from: e */
    private byq f44643e;

    /* renamed from: f */
    private C15748b f44644f;

    /* renamed from: g */
    private C15745a[] f44645g;

    /* renamed from: h */
    private C15750c f44646h;

    /* renamed from: i */
    private C15769j f44647i;

    /* renamed from: j */
    private C15762h f44648j;

    /* renamed from: k */
    private C15754e f44649k;

    /* renamed from: l */
    private C15756f f44650l;

    /* renamed from: m */
    private bzj[] f44651m;

    public bzd() {
        this.f44641c = null;
        this.f44643e = null;
        this.f44644f = null;
        this.f44642d = null;
        this.f44645g = new C15745a[0];
        this.f44646h = null;
        this.f44647i = null;
        this.f44648j = null;
        this.f44649k = null;
        this.f44650l = null;
        this.f44651m = bzj.m37036d();
        this.f41783a = null;
        this.f41795b = -1;
    }

    /* renamed from: a */
    public final void mo30026a(bbr bbr) throws IOException {
        if (this.f44641c != null) {
            bbr.mo30018a(7, this.f44641c.intValue());
        }
        if (this.f44642d != null) {
            bbr.mo30020a(10, (bby) this.f44642d);
        }
        if (this.f44645g != null && this.f44645g.length > 0) {
            for (C15745a aVar : this.f44645g) {
                if (aVar != null) {
                    bbr.mo30019a(11, (azj) aVar);
                }
            }
        }
        if (this.f44651m != null && this.f44651m.length > 0) {
            for (bzj bzj : this.f44651m) {
                if (bzj != null) {
                    bbr.mo30020a(17, (bby) bzj);
                }
            }
        }
        super.mo30026a(bbr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30025a() {
        int a = super.mo30025a();
        if (this.f44641c != null) {
            a += bbr.m35316b(7, this.f44641c.intValue());
        }
        if (this.f44642d != null) {
            a += bbr.m35317b(10, (bby) this.f44642d);
        }
        if (this.f44645g != null && this.f44645g.length > 0) {
            int i = a;
            for (C15745a aVar : this.f44645g) {
                if (aVar != null) {
                    i += axf.m34443c(11, (azj) aVar);
                }
            }
            a = i;
        }
        if (this.f44651m != null && this.f44651m.length > 0) {
            for (bzj bzj : this.f44651m) {
                if (bzj != null) {
                    a += bbr.m35317b(17, (bby) bzj);
                }
            }
        }
        return a;
    }
}
