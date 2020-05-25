package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bkl implements bkm {

    /* renamed from: a */
    private final byte[] f42783a;

    /* renamed from: b */
    private int f42784b;

    /* renamed from: c */
    private int f42785c;

    public bkl(byte[] bArr) {
        blg.m35998a(bArr);
        blg.m35999a(bArr.length > 0);
        this.f42783a = bArr;
    }

    /* renamed from: a */
    public final void mo29004a() throws IOException {
    }

    /* renamed from: a */
    public final long mo29003a(bkn bkn) throws IOException {
        this.f42784b = (int) bkn.f42788c;
        this.f42785c = (int) (bkn.f42789d == -1 ? ((long) this.f42783a.length) - bkn.f42788c : bkn.f42789d);
        if (this.f42785c > 0 && this.f42784b + this.f42785c <= this.f42783a.length) {
            return (long) this.f42785c;
        }
        int i = this.f42784b;
        long j = bkn.f42789d;
        int length = this.f42783a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i);
        sb.append(", ");
        sb.append(j);
        sb.append("], length: ");
        sb.append(length);
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    public final int mo29002a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f42785c == 0) {
            return -1;
        }
        int min = Math.min(i2, this.f42785c);
        System.arraycopy(this.f42783a, this.f42784b, bArr, i, min);
        this.f42784b += min;
        this.f42785c -= min;
        return min;
    }
}
