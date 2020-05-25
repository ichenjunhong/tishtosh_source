package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bcn extends bbt<bcn> {

    /* renamed from: e */
    private static volatile bcn[] f41866e;

    /* renamed from: c */
    public byte[] f41867c;

    /* renamed from: d */
    public byte[] f41868d;

    /* renamed from: d */
    public static bcn[] m35403d() {
        if (f41866e == null) {
            synchronized (bbx.f41792a) {
                if (f41866e == null) {
                    f41866e = new bcn[0];
                }
            }
        }
        return f41866e;
    }

    public bcn() {
        this.f41867c = null;
        this.f41868d = null;
        this.f41783a = null;
        this.f41795b = -1;
    }

    /* renamed from: a */
    public final void mo30026a(bbr bbr) throws IOException {
        bbr.mo30022a(1, this.f41867c);
        if (this.f41868d != null) {
            bbr.mo30022a(2, this.f41868d);
        }
        super.mo30026a(bbr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30025a() {
        int a = super.mo30025a() + bbr.m35319b(1, this.f41867c);
        return this.f41868d != null ? a + bbr.m35319b(2, this.f41868d) : a;
    }
}
