package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bct extends bbt<bct> {

    /* renamed from: c */
    public String f41887c;

    /* renamed from: d */
    public Long f41888d;

    /* renamed from: e */
    public Boolean f41889e;

    public bct() {
        this.f41887c = null;
        this.f41888d = null;
        this.f41889e = null;
        this.f41783a = null;
        this.f41795b = -1;
    }

    /* renamed from: a */
    public final void mo30026a(bbr bbr) throws IOException {
        if (this.f41887c != null) {
            bbr.mo30021a(1, this.f41887c);
        }
        if (this.f41888d != null) {
            long longValue = this.f41888d.longValue();
            bbr.mo30024c(2, 0);
            bbr.mo30023a(longValue);
        }
        if (this.f41889e != null) {
            boolean booleanValue = this.f41889e.booleanValue();
            bbr.mo30024c(3, 0);
            byte b = booleanValue ? (byte) 1 : 0;
            if (bbr.f41780a.hasRemaining()) {
                bbr.f41780a.put(b);
            } else {
                throw new bbs(bbr.f41780a.position(), bbr.f41780a.limit());
            }
        }
        super.mo30026a(bbr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30025a() {
        int a = super.mo30025a();
        if (this.f41887c != null) {
            a += bbr.m35318b(1, this.f41887c);
        }
        if (this.f41888d != null) {
            a += bbr.m35315b(2) + bbr.m35320b(this.f41888d.longValue());
        }
        if (this.f41889e == null) {
            return a;
        }
        this.f41889e.booleanValue();
        return a + bbr.m35315b(3) + 1;
    }
}
