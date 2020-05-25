package com.google.android.gms.internal.ads;

import java.io.IOException;

@C16299uq
final class ajg implements bkm {

    /* renamed from: a */
    private final bkm f40663a;

    /* renamed from: b */
    private final long f40664b;

    /* renamed from: c */
    private final bkm f40665c;

    /* renamed from: d */
    private long f40666d;

    ajg(bkm bkm, int i, bkm bkm2) {
        this.f40663a = bkm;
        this.f40664b = (long) i;
        this.f40665c = bkm2;
    }

    /* renamed from: a */
    public final long mo29003a(bkn bkn) throws IOException {
        bkn bkn2;
        bkn bkn3;
        long j;
        bkn bkn4 = bkn;
        if (bkn4.f42788c >= this.f40664b) {
            bkn2 = null;
        } else {
            long j2 = bkn4.f42788c;
            if (bkn4.f42789d != -1) {
                j = Math.min(bkn4.f42789d, this.f40664b - j2);
            } else {
                j = this.f40664b - j2;
            }
            bkn2 = new bkn(bkn4.f42786a, j2, j, null);
        }
        if (bkn4.f42789d == -1 || bkn4.f42788c + bkn4.f42789d > this.f40664b) {
            bkn3 = new bkn(bkn4.f42786a, Math.max(this.f40664b, bkn4.f42788c), bkn4.f42789d != -1 ? Math.min(bkn4.f42789d, (bkn4.f42788c + bkn4.f42789d) - this.f40664b) : -1, null);
        } else {
            bkn3 = null;
        }
        long j3 = 0;
        long a = bkn2 != null ? this.f40663a.mo29003a(bkn2) : 0;
        if (bkn3 != null) {
            j3 = this.f40665c.mo29003a(bkn3);
        }
        this.f40666d = bkn4.f42788c;
        if (a == -1 || j3 == -1) {
            return -1;
        }
        return a + j3;
    }

    /* renamed from: a */
    public final int mo29002a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f40666d < this.f40664b) {
            i3 = this.f40663a.mo29002a(bArr, i, (int) Math.min((long) i2, this.f40664b - this.f40666d));
            this.f40666d += (long) i3;
        } else {
            i3 = 0;
        }
        if (this.f40666d < this.f40664b) {
            return i3;
        }
        int a = this.f40665c.mo29002a(bArr, i + i3, i2 - i3);
        int i4 = i3 + a;
        this.f40666d += (long) a;
        return i4;
    }

    /* renamed from: a */
    public final void mo29004a() throws IOException {
        this.f40663a.mo29004a();
        this.f40665c.mo29004a();
    }
}
