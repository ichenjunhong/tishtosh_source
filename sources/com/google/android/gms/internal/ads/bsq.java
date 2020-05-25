package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

public final class bsq implements bsr {

    /* renamed from: a */
    private final byte[] f43785a;

    /* renamed from: b */
    private Uri f43786b;

    /* renamed from: c */
    private int f43787c;

    /* renamed from: d */
    private int f43788d;

    public bsq(byte[] bArr) {
        bti.m36697a(bArr);
        bti.m36699a(bArr.length > 0);
        this.f43785a = bArr;
    }

    /* renamed from: a */
    public final long mo29027a(bsu bsu) throws IOException {
        this.f43786b = bsu.f43789a;
        this.f43787c = (int) bsu.f43792d;
        this.f43788d = (int) (bsu.f43793e == -1 ? ((long) this.f43785a.length) - bsu.f43792d : bsu.f43793e);
        if (this.f43788d > 0 && this.f43787c + this.f43788d <= this.f43785a.length) {
            return (long) this.f43788d;
        }
        int i = this.f43787c;
        long j = bsu.f43793e;
        int length = this.f43785a.length;
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
    public final int mo29026a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f43788d == 0) {
            return -1;
        }
        int min = Math.min(i2, this.f43788d);
        System.arraycopy(this.f43785a, this.f43787c, bArr, i, min);
        this.f43787c += min;
        this.f43788d -= min;
        return min;
    }

    /* renamed from: a */
    public final Uri mo29028a() {
        return this.f43786b;
    }

    /* renamed from: b */
    public final void mo29030b() throws IOException {
        this.f43786b = null;
    }
}
