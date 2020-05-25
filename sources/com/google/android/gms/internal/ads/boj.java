package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

public final class boj implements bol {

    /* renamed from: a */
    private static final byte[] f43191a = new byte[4096];

    /* renamed from: b */
    private final bsr f43192b;

    /* renamed from: c */
    private final long f43193c;

    /* renamed from: d */
    private long f43194d;

    /* renamed from: e */
    private byte[] f43195e = new byte[65536];

    /* renamed from: f */
    private int f43196f;

    /* renamed from: g */
    private int f43197g;

    public boj(bsr bsr, long j, long j2) {
        this.f43192b = bsr;
        this.f43194d = j;
        this.f43193c = j2;
    }

    /* renamed from: a */
    public final int mo30497a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int d = m36304d(bArr, i, i2);
        if (d == 0) {
            d = m36301a(bArr, i, i2, 0, true);
        }
        m36306f(d);
        return d;
    }

    /* renamed from: a */
    public final boolean mo30499a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int d = m36304d(bArr, i, i2);
        while (d < i2 && d != -1) {
            d = m36301a(bArr, i, i2, d, z);
        }
        m36306f(d);
        return d != -1;
    }

    /* renamed from: b */
    public final void mo30502b(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        mo30499a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public final int mo30496a(int i) throws IOException, InterruptedException {
        int d = m36303d(i);
        if (d == 0) {
            d = m36301a(f43191a, 0, Math.min(i, f43191a.length), 0, true);
        }
        m36306f(d);
        return d;
    }

    /* renamed from: b */
    public final void mo30501b(int i) throws IOException, InterruptedException {
        int d = m36303d(i);
        while (d < i && d != -1) {
            d = m36301a(f43191a, -d, Math.min(i, f43191a.length + d), d, false);
        }
        m36306f(d);
    }

    /* renamed from: c */
    public final void mo30505c(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        if (m36302a(i2, false)) {
            System.arraycopy(this.f43195e, this.f43196f - i2, bArr, i, i2);
        }
    }

    /* renamed from: a */
    private final boolean m36302a(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.f43196f + i;
        if (i2 > this.f43195e.length) {
            this.f43195e = Arrays.copyOf(this.f43195e, btw.m36756a(this.f43195e.length << 1, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.f43197g - this.f43196f, i);
        while (min < i) {
            min = m36301a(this.f43195e, this.f43196f, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        this.f43196f += i;
        this.f43197g = Math.max(this.f43197g, this.f43196f);
        return true;
    }

    /* renamed from: c */
    public final void mo30504c(int i) throws IOException, InterruptedException {
        m36302a(i, false);
    }

    /* renamed from: a */
    public final void mo30498a() {
        this.f43196f = 0;
    }

    /* renamed from: b */
    public final long mo30500b() {
        return this.f43194d;
    }

    /* renamed from: c */
    public final long mo30503c() {
        return this.f43193c;
    }

    /* renamed from: d */
    private final int m36303d(int i) {
        int min = Math.min(this.f43197g, i);
        m36305e(min);
        return min;
    }

    /* renamed from: d */
    private final int m36304d(byte[] bArr, int i, int i2) {
        if (this.f43197g == 0) {
            return 0;
        }
        int min = Math.min(this.f43197g, i2);
        System.arraycopy(this.f43195e, 0, bArr, i, min);
        m36305e(min);
        return min;
    }

    /* renamed from: e */
    private final void m36305e(int i) {
        this.f43197g -= i;
        this.f43196f = 0;
        byte[] bArr = this.f43195e;
        if (this.f43197g < this.f43195e.length - 524288) {
            bArr = new byte[(this.f43197g + 65536)];
        }
        System.arraycopy(this.f43195e, i, bArr, 0, this.f43197g);
        this.f43195e = bArr;
    }

    /* renamed from: a */
    private final int m36301a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int a = this.f43192b.mo29026a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: f */
    private final void m36306f(int i) {
        if (i != -1) {
            this.f43194d += (long) i;
        }
    }
}
