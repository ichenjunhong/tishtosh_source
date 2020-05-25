package com.google.android.gms.internal.ads;

import com.C2240a;
import java.io.IOException;

public class bby {

    /* renamed from: b */
    protected volatile int f41795b = -1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo30025a() {
        return 0;
    }

    /* renamed from: a */
    public void mo30026a(bbr bbr) throws IOException {
    }

    /* renamed from: c */
    public final int mo30040c() {
        int a = mo30025a();
        this.f41795b = a;
        return a;
    }

    /* renamed from: a */
    public static final byte[] m35340a(bby bby) {
        byte[] bArr = new byte[bby.mo30040c()];
        try {
            bbr a = bbr.m35313a(bArr, 0, bArr.length);
            bby.mo30026a(a);
            if (a.f41780a.remaining() == 0) {
                return bArr;
            }
            throw new IllegalStateException(C2240a.m6772a("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(a.f41780a.remaining())}));
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public String toString() {
        return bbz.m35345a(this);
    }

    /* renamed from: b */
    public bby clone() throws CloneNotSupportedException {
        return (bby) super.clone();
    }
}
