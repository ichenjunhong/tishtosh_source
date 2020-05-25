package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

@C16299uq
final class aki implements bsr {

    /* renamed from: a */
    private final bsr f40767a;

    /* renamed from: b */
    private final long f40768b;

    /* renamed from: c */
    private final bsr f40769c;

    /* renamed from: d */
    private long f40770d;

    /* renamed from: e */
    private Uri f40771e;

    aki(bsr bsr, int i, bsr bsr2) {
        this.f40767a = bsr;
        this.f40768b = (long) i;
        this.f40769c = bsr2;
    }

    /* renamed from: a */
    public final long mo29027a(bsu bsu) throws IOException {
        bsu bsu2;
        bsu bsu3;
        long j;
        bsu bsu4 = bsu;
        this.f40771e = bsu4.f43789a;
        if (bsu4.f43792d >= this.f40768b) {
            bsu2 = null;
        } else {
            long j2 = bsu4.f43792d;
            if (bsu4.f43793e != -1) {
                j = Math.min(bsu4.f43793e, this.f40768b - j2);
            } else {
                j = this.f40768b - j2;
            }
            bsu2 = new bsu(bsu4.f43789a, j2, j, null);
        }
        if (bsu4.f43793e == -1 || bsu4.f43792d + bsu4.f43793e > this.f40768b) {
            bsu3 = new bsu(bsu4.f43789a, Math.max(this.f40768b, bsu4.f43792d), bsu4.f43793e != -1 ? Math.min(bsu4.f43793e, (bsu4.f43792d + bsu4.f43793e) - this.f40768b) : -1, null);
        } else {
            bsu3 = null;
        }
        long j3 = 0;
        long a = bsu2 != null ? this.f40767a.mo29027a(bsu2) : 0;
        if (bsu3 != null) {
            j3 = this.f40769c.mo29027a(bsu3);
        }
        this.f40770d = bsu4.f43792d;
        if (a == -1 || j3 == -1) {
            return -1;
        }
        return a + j3;
    }

    /* renamed from: a */
    public final int mo29026a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f40770d < this.f40768b) {
            i3 = this.f40767a.mo29026a(bArr, i, (int) Math.min((long) i2, this.f40768b - this.f40770d));
            this.f40770d += (long) i3;
        } else {
            i3 = 0;
        }
        if (this.f40770d < this.f40768b) {
            return i3;
        }
        int a = this.f40769c.mo29026a(bArr, i + i3, i2 - i3);
        int i4 = i3 + a;
        this.f40770d += (long) a;
        return i4;
    }

    /* renamed from: a */
    public final Uri mo29028a() {
        return this.f40771e;
    }

    /* renamed from: b */
    public final void mo29030b() throws IOException {
        this.f40767a.mo29030b();
        this.f40769c.mo29030b();
    }
}
