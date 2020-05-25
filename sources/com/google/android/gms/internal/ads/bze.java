package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bym.C15745a;
import java.io.IOException;

public final class bze extends bbt<bze> {

    /* renamed from: c */
    public String f44652c;

    /* renamed from: d */
    private C15745a[] f44653d;

    /* renamed from: e */
    private byq f44654e;

    /* renamed from: f */
    private byq f44655f;

    /* renamed from: g */
    private byq f44656g;

    public bze() {
        this.f44652c = null;
        this.f44653d = new C15745a[0];
        this.f44654e = null;
        this.f44655f = null;
        this.f44656g = null;
        this.f41783a = null;
        this.f41795b = -1;
    }

    /* renamed from: a */
    public final void mo30026a(bbr bbr) throws IOException {
        if (this.f44652c != null) {
            bbr.mo30021a(1, this.f44652c);
        }
        if (this.f44653d != null && this.f44653d.length > 0) {
            for (C15745a aVar : this.f44653d) {
                if (aVar != null) {
                    bbr.mo30019a(2, (azj) aVar);
                }
            }
        }
        super.mo30026a(bbr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30025a() {
        int a = super.mo30025a();
        if (this.f44652c != null) {
            a += bbr.m35318b(1, this.f44652c);
        }
        if (this.f44653d != null && this.f44653d.length > 0) {
            for (C15745a aVar : this.f44653d) {
                if (aVar != null) {
                    a += axf.m34443c(2, (azj) aVar);
                }
            }
        }
        return a;
    }
}
