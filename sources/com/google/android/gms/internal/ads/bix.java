package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

public final class bix implements bja {

    /* renamed from: a */
    private static final byte[] f42546a = new byte[4096];

    /* renamed from: b */
    private final bkm f42547b;

    /* renamed from: c */
    private long f42548c;

    /* renamed from: d */
    private long f42549d;

    public bix(bkm bkm, long j, long j2) {
        this.f42547b = bkm;
        this.f42548c = j;
        this.f42549d = j2;
    }

    /* renamed from: a */
    public final boolean mo30258a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int i3 = i;
        int i4 = i2;
        while (i4 > 0) {
            if (!Thread.interrupted()) {
                int a = this.f42547b.mo29002a(bArr, i3, i4);
                if (a != -1) {
                    i3 += a;
                    i4 -= a;
                } else if (z && i4 == i2) {
                    return false;
                } else {
                    throw new EOFException();
                }
            } else {
                throw new InterruptedException();
            }
        }
        this.f42548c += (long) i2;
        return true;
    }

    /* renamed from: a */
    public final void mo30257a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        mo30258a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public final void mo30256a(int i) throws IOException, InterruptedException {
        int i2 = i;
        while (i2 > 0) {
            if (!Thread.interrupted()) {
                int a = this.f42547b.mo29002a(f42546a, 0, Math.min(f42546a.length, i2));
                if (a != -1) {
                    i2 -= a;
                } else {
                    throw new EOFException();
                }
            } else {
                throw new InterruptedException();
            }
        }
        this.f42548c += (long) i;
    }

    /* renamed from: a */
    public final long mo30255a() {
        return this.f42548c;
    }
}
