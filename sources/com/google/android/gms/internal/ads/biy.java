package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public class biy implements bjl {

    /* renamed from: a */
    final bjg f42550a;

    /* renamed from: b */
    final bih f42551b = new bih(0);

    /* renamed from: c */
    boolean f42552c = true;

    /* renamed from: d */
    long f42553d = Long.MIN_VALUE;

    /* renamed from: e */
    public volatile long f42554e = Long.MIN_VALUE;

    /* renamed from: f */
    public volatile bie f42555f;

    /* renamed from: g */
    private long f42556g = Long.MIN_VALUE;

    public biy(bki bki) {
        this.f42550a = new bjg(bki);
    }

    /* renamed from: a */
    public final void mo30260a() {
        bjg bjg = this.f42550a;
        bji bji = bjg.f42602c;
        bji.f42611b = 0;
        bji.f42612c = 0;
        bji.f42613d = 0;
        bji.f42610a = 0;
        while (!bjg.f42603d.isEmpty()) {
            bjg.f42600a.mo30310a((bkh) bjg.f42603d.remove());
        }
        bjg.f42606g = 0;
        bjg.f42607h = 0;
        bjg.f42608i = null;
        bjg.f42609j = bjg.f42601b;
        this.f42552c = true;
        this.f42553d = Long.MIN_VALUE;
        this.f42556g = Long.MIN_VALUE;
        this.f42554e = Long.MIN_VALUE;
    }

    /* renamed from: b */
    public final boolean mo30266b() {
        return !m35842c();
    }

    /* renamed from: a */
    public final boolean mo30265a(bih bih) {
        int i;
        bih bih2 = bih;
        if (!m35842c()) {
            return false;
        }
        bjg bjg = this.f42550a;
        if (bjg.f42602c.mo30289a(bih2, bjg.f42604e)) {
            if (bih.mo30223a()) {
                bjj bjj = bjg.f42604e;
                long j = bjj.f42620a;
                bjg.mo30283a(j, bjg.f42605f.f42850a, 1);
                long j2 = j + 1;
                byte b = bjg.f42605f.f42850a[0];
                boolean z = (b & 128) != 0;
                byte b2 = b & Byte.MAX_VALUE;
                if (bih2.f42486a.f42333a == null) {
                    bih2.f42486a.f42333a = new byte[16];
                }
                bjg.mo30283a(j2, bih2.f42486a.f42333a, b2);
                long j3 = j2 + ((long) b2);
                if (z) {
                    bjg.mo30283a(j3, bjg.f42605f.f42850a, 2);
                    j3 += 2;
                    bjg.f42605f.mo30328a(0);
                    i = bjg.f42605f.mo30330b();
                } else {
                    i = 1;
                }
                int[] iArr = bih2.f42486a.f42336d;
                if (iArr == null || iArr.length < i) {
                    iArr = new int[i];
                }
                int[] iArr2 = bih2.f42486a.f42337e;
                if (iArr2 == null || iArr2.length < i) {
                    iArr2 = new int[i];
                }
                if (z) {
                    int i2 = i * 6;
                    bll bll = bjg.f42605f;
                    if (bll.f42852c < i2) {
                        bll.f42850a = new byte[i2];
                        bll.f42852c = i2;
                        bll.f42851b = 0;
                    }
                    bjg.mo30283a(j3, bjg.f42605f.f42850a, i2);
                    j3 += (long) i2;
                    bjg.f42605f.mo30328a(0);
                    for (int i3 = 0; i3 < i; i3++) {
                        iArr[i3] = bjg.f42605f.mo30330b();
                        iArr2[i3] = bjg.f42605f.mo30335f();
                    }
                } else {
                    iArr[0] = 0;
                    iArr2[0] = bih2.f42488c - ((int) (j3 - bjj.f42620a));
                }
                bgw bgw = bih2.f42486a;
                byte[] bArr = bjj.f42621b;
                byte[] bArr2 = bih2.f42486a.f42333a;
                bgw.f42338f = i;
                bgw.f42336d = iArr;
                bgw.f42337e = iArr2;
                bgw.f42334b = bArr;
                bgw.f42333a = bArr2;
                bgw.f42335c = 1;
                if (blp.f42854a >= 16) {
                    bgw.f42339g.set(bgw.f42338f, bgw.f42336d, bgw.f42337e, bgw.f42334b, bgw.f42333a, bgw.f42335c);
                }
                int i4 = (int) (j3 - bjj.f42620a);
                bjj.f42620a += (long) i4;
                bih2.f42488c -= i4;
            }
            if (bih2.f42487b != null) {
                bih2.f42487b.capacity();
            }
            if (bih2.f42487b != null) {
                long j4 = bjg.f42604e.f42620a;
                ByteBuffer byteBuffer = bih2.f42487b;
                int i5 = bih2.f42488c;
                while (i5 > 0) {
                    bjg.mo30282a(j4);
                    int i6 = (int) (j4 - bjg.f42606g);
                    int min = Math.min(i5, bjg.f42601b - i6);
                    byteBuffer.put(((bkh) bjg.f42603d.peek()).f42776a, i6 + 0, min);
                    j4 += (long) min;
                    i5 -= min;
                }
            }
            bjg.mo30282a(bjg.f42602c.mo30286a());
        }
        this.f42552c = false;
        this.f42553d = bih2.f42490e;
        return true;
    }

    /* renamed from: a */
    public final boolean mo30264a(long j) {
        bjg bjg = this.f42550a;
        long a = bjg.f42602c.mo30287a(j);
        if (a == -1) {
            return false;
        }
        bjg.mo30282a(a);
        return true;
    }

    /* renamed from: c */
    private final boolean m35842c() {
        boolean a = this.f42550a.mo30284a(this.f42551b);
        if (this.f42552c) {
            while (a && !this.f42551b.mo30224b()) {
                this.f42550a.mo30281a();
                a = this.f42550a.mo30284a(this.f42551b);
            }
        }
        if (!a) {
            return false;
        }
        if (this.f42556g == Long.MIN_VALUE || this.f42551b.f42490e < this.f42556g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo30262a(bie bie) {
        this.f42555f = bie;
    }

    /* renamed from: a */
    public final int mo30259a(bja bja, int i) throws IOException, InterruptedException {
        bjg bjg = this.f42550a;
        bjg.mo30285b();
        int min = Math.min(i, bjg.f42601b - bjg.f42609j);
        bja.mo30257a(bjg.f42608i.f42776a, bjg.f42609j + 0, min);
        bjg.f42609j += min;
        bjg.f42607h += (long) min;
        return min;
    }

    /* renamed from: a */
    public final void mo30263a(bll bll, int i) {
        bjg bjg = this.f42550a;
        int i2 = i;
        while (i2 > 0) {
            bjg.mo30285b();
            int min = Math.min(i2, bjg.f42601b - bjg.f42609j);
            bll.mo30329a(bjg.f42608i.f42776a, bjg.f42609j + 0, min);
            bjg.f42609j += min;
            i2 -= min;
        }
        bjg.f42607h += (long) i;
    }

    /* renamed from: a */
    public void mo30261a(long j, int i, int i2, int i3, byte[] bArr) {
        long j2 = j;
        this.f42554e = Math.max(this.f42554e, j);
        int i4 = i2;
        long j3 = (this.f42550a.f42607h - ((long) i4)) - ((long) i3);
        this.f42550a.f42602c.mo30288a(j2, i, j3, i4, bArr);
    }
}
