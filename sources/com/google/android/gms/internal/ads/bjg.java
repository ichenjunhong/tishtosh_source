package com.google.android.gms.internal.ads;

import java.util.concurrent.LinkedBlockingDeque;

final class bjg {

    /* renamed from: a */
    final bki f42600a;

    /* renamed from: b */
    final int f42601b;

    /* renamed from: c */
    final bji f42602c = new bji();

    /* renamed from: d */
    final LinkedBlockingDeque<bkh> f42603d = new LinkedBlockingDeque<>();

    /* renamed from: e */
    final bjj f42604e = new bjj();

    /* renamed from: f */
    final bll f42605f = new bll(32);

    /* renamed from: g */
    long f42606g;

    /* renamed from: h */
    public long f42607h;

    /* renamed from: i */
    bkh f42608i;

    /* renamed from: j */
    int f42609j = this.f42601b;

    public bjg(bki bki) {
        this.f42600a = bki;
        this.f42601b = bki.mo30311b();
    }

    /* renamed from: a */
    public final boolean mo30284a(bih bih) {
        return this.f42602c.mo30289a(bih, this.f42604e);
    }

    /* renamed from: a */
    public final void mo30281a() {
        mo30282a(this.f42602c.mo30286a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30283a(long j, byte[] bArr, int i) {
        long j2 = j;
        int i2 = 0;
        while (i2 < i) {
            mo30282a(j2);
            int i3 = (int) (j2 - this.f42606g);
            int min = Math.min(i - i2, this.f42601b - i3);
            System.arraycopy(((bkh) this.f42603d.peek()).f42776a, i3 + 0, bArr, i2, min);
            j2 += (long) min;
            i2 += min;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30282a(long j) {
        int i = ((int) (j - this.f42606g)) / this.f42601b;
        for (int i2 = 0; i2 < i; i2++) {
            this.f42600a.mo30310a((bkh) this.f42603d.remove());
            this.f42606g += (long) this.f42601b;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo30285b() {
        if (this.f42609j == this.f42601b) {
            this.f42609j = 0;
            this.f42608i = this.f42600a.mo30309a();
            this.f42603d.add(this.f42608i);
        }
    }
}
