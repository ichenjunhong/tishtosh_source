package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public final class bro implements bot {

    /* renamed from: a */
    final bsp f43699a;

    /* renamed from: b */
    final int f43700b;

    /* renamed from: c */
    final brm f43701c = new brm();

    /* renamed from: d */
    final brn f43702d = new brn();

    /* renamed from: e */
    final btr f43703e = new btr(32);

    /* renamed from: f */
    brp f43704f = new brp(0, this.f43700b);

    /* renamed from: g */
    zzlg f43705g;

    /* renamed from: h */
    public brq f43706h;

    /* renamed from: i */
    private final AtomicInteger f43707i = new AtomicInteger();

    /* renamed from: j */
    private brp f43708j = this.f43704f;

    /* renamed from: k */
    private boolean f43709k;

    /* renamed from: l */
    private zzlg f43710l;

    /* renamed from: m */
    private long f43711m;

    /* renamed from: n */
    private int f43712n = this.f43700b;

    public bro(bsp bsp) {
        this.f43699a = bsp;
        this.f43700b = bsp.mo30669c();
    }

    /* renamed from: a */
    public final void mo30617a(boolean z) {
        int andSet = this.f43707i.getAndSet(z ? 0 : 2);
        m36574g();
        this.f43701c.mo30608b();
        if (andSet == 2) {
            this.f43705g = null;
        }
    }

    /* renamed from: a */
    public final int mo30614a() {
        return this.f43701c.mo30609c();
    }

    /* renamed from: b */
    public final void mo30619b() {
        if (this.f43707i.getAndSet(2) == 0) {
            m36574g();
        }
    }

    /* renamed from: c */
    public final zzlg mo30620c() {
        return this.f43701c.mo30611e();
    }

    /* renamed from: d */
    public final long mo30621d() {
        return this.f43701c.mo30612f();
    }

    /* renamed from: a */
    public final boolean mo30618a(long j, boolean z) {
        long a = this.f43701c.mo30603a(j, z);
        if (a == -1) {
            return false;
        }
        mo30615a(a);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30616a(long j, byte[] bArr, int i) {
        mo30615a(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.f43704f.f43713a);
            int min = Math.min(i - i2, this.f43700b - i3);
            bso bso = this.f43704f.f43716d;
            System.arraycopy(bso.f43783a, bso.mo30664a(i3), bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.f43704f.f43714b) {
                this.f43699a.mo30666a(bso);
                this.f43704f = this.f43704f.mo30622a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30615a(long j) {
        while (j >= this.f43704f.f43714b) {
            this.f43699a.mo30666a(this.f43704f.f43716d);
            this.f43704f = this.f43704f.mo30622a();
        }
    }

    /* renamed from: a */
    public final void mo30518a(zzlg zzlg) {
        zzlg zzlg2 = zzlg == null ? null : zzlg;
        boolean a = this.f43701c.mo30607a(zzlg2);
        this.f43710l = zzlg;
        this.f43709k = false;
        if (this.f43706h != null && a) {
            this.f43706h.mo30580a(zzlg2);
        }
    }

    /* renamed from: a */
    public final int mo30515a(bol bol, int i, boolean z) throws IOException, InterruptedException {
        if (!m36572e()) {
            int a = bol.mo30496a(i);
            if (a != -1) {
                return a;
            }
            throw new EOFException();
        }
        try {
            int a2 = m36571a(i);
            bso bso = this.f43708j.f43716d;
            int a3 = bol.mo30497a(bso.f43783a, bso.mo30664a(this.f43712n), a2);
            if (a3 != -1) {
                this.f43712n += a3;
                this.f43711m += (long) a3;
                return a3;
            }
            throw new EOFException();
        } finally {
            m36573f();
        }
    }

    /* renamed from: a */
    public final void mo30517a(btr btr, int i) {
        if (!m36572e()) {
            btr.mo30699d(i);
            return;
        }
        while (i > 0) {
            int a = m36571a(i);
            bso bso = this.f43708j.f43716d;
            btr.mo30693a(bso.f43783a, bso.mo30664a(this.f43712n), a);
            this.f43712n += a;
            this.f43711m += (long) a;
            i -= a;
        }
        m36573f();
    }

    /* renamed from: a */
    public final void mo30516a(long j, int i, int i2, int i3, bou bou) {
        if (!m36572e()) {
            long j2 = j;
            this.f43701c.mo30605a(j);
            return;
        }
        long j3 = j;
        try {
            this.f43701c.mo30606a(j, i, this.f43711m - ((long) i2), i2, bou);
        } finally {
            m36573f();
        }
    }

    /* renamed from: e */
    private final boolean m36572e() {
        return this.f43707i.compareAndSet(0, 1);
    }

    /* renamed from: f */
    private final void m36573f() {
        if (!this.f43707i.compareAndSet(1, 0)) {
            m36574g();
        }
    }

    /* renamed from: g */
    private final void m36574g() {
        this.f43701c.mo30604a();
        brp brp = this.f43704f;
        if (brp.f43715c) {
            int i = ((int) (this.f43708j.f43713a - brp.f43713a)) / this.f43700b;
            bso[] bsoArr = new bso[((this.f43708j.f43715c ? 1 : 0) + i)];
            for (int i2 = 0; i2 < bsoArr.length; i2++) {
                bsoArr[i2] = brp.f43716d;
                brp = brp.mo30622a();
            }
            this.f43699a.mo30667a(bsoArr);
        }
        this.f43704f = new brp(0, this.f43700b);
        this.f43708j = this.f43704f;
        this.f43711m = 0;
        this.f43712n = this.f43700b;
        this.f43699a.mo30668b();
    }

    /* renamed from: a */
    private final int m36571a(int i) {
        if (this.f43712n == this.f43700b) {
            this.f43712n = 0;
            if (this.f43708j.f43715c) {
                this.f43708j = this.f43708j.f43717e;
            }
            brp brp = this.f43708j;
            bso a = this.f43699a.mo30665a();
            brp brp2 = new brp(this.f43708j.f43714b, this.f43700b);
            brp.f43716d = a;
            brp.f43717e = brp2;
            brp.f43715c = true;
        }
        return Math.min(i, this.f43700b - this.f43712n);
    }
}
