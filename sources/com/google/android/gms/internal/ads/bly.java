package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class bly implements blu {

    /* renamed from: a */
    final bsl f42876a;

    /* renamed from: b */
    final CopyOnWriteArraySet<blv> f42877b;

    /* renamed from: c */
    boolean f42878c;

    /* renamed from: d */
    boolean f42879d;

    /* renamed from: e */
    int f42880e;

    /* renamed from: f */
    int f42881f;

    /* renamed from: g */
    int f42882g;

    /* renamed from: h */
    boolean f42883h;

    /* renamed from: i */
    bmp f42884i;

    /* renamed from: j */
    Object f42885j;

    /* renamed from: k */
    brx f42886k;

    /* renamed from: l */
    bsk f42887l;

    /* renamed from: m */
    bml f42888m;

    /* renamed from: n */
    bmd f42889n;

    /* renamed from: o */
    private final bmm[] f42890o;

    /* renamed from: p */
    private final bsk f42891p;

    /* renamed from: q */
    private final Handler f42892q;

    /* renamed from: r */
    private final bmb f42893r;

    /* renamed from: s */
    private final bms f42894s;

    /* renamed from: t */
    private final bmr f42895t;

    /* renamed from: u */
    private int f42896u;

    /* renamed from: v */
    private int f42897v;

    /* renamed from: w */
    private int f42898w;

    /* renamed from: x */
    private long f42899x;

    public bly(bmm[] bmmArr, bsl bsl, bmj bmj) {
        bti.m36701b(bmmArr.length > 0);
        this.f42890o = (bmm[]) bti.m36697a(bmmArr);
        this.f42876a = (bsl) bti.m36697a(bsl);
        this.f42879d = false;
        this.f42896u = 0;
        this.f42880e = 1;
        this.f42877b = new CopyOnWriteArraySet<>();
        this.f42891p = new bsk(new bsi[bmmArr.length]);
        this.f42884i = bmp.f42976a;
        this.f42894s = new bms();
        this.f42895t = new bmr();
        this.f42886k = brx.f43740a;
        this.f42887l = this.f42891p;
        this.f42888m = bml.f42970a;
        this.f42892q = new bma(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f42889n = new bmd(0, 0);
        bmb bmb = new bmb(bmmArr, bsl, bmj, this.f42879d, 0, this.f42892q, this.f42889n, this);
        this.f42893r = bmb;
    }

    /* renamed from: a */
    public final void mo30365a(blv blv) {
        this.f42877b.add(blv);
    }

    /* renamed from: b */
    public final void mo30369b(blv blv) {
        this.f42877b.remove(blv);
    }

    /* renamed from: a */
    public final int mo30363a() {
        return this.f42880e;
    }

    /* renamed from: a */
    public final void mo30366a(brg brg) {
        if (!this.f42884i.mo30413a() || this.f42885j != null) {
            this.f42884i = bmp.f42976a;
            this.f42885j = null;
            Iterator it = this.f42877b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        if (this.f42878c) {
            this.f42878c = false;
            this.f42886k = brx.f43740a;
            this.f42887l = this.f42891p;
            this.f42876a.mo30658a(null);
            Iterator it2 = this.f42877b.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        this.f42882g++;
        this.f42893r.f42910a.obtainMessage(0, 1, 0, brg).sendToTarget();
    }

    /* renamed from: a */
    public final void mo30367a(boolean z) {
        if (this.f42879d != z) {
            this.f42879d = z;
            this.f42893r.f42910a.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            Iterator it = this.f42877b.iterator();
            while (it.hasNext()) {
                ((blv) it.next()).mo29057a(z, this.f42880e);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo30371b() {
        return this.f42879d;
    }

    /* renamed from: a */
    public final void mo30364a(long j) {
        int i = m36069i();
        if (i < 0 || (!this.f42884i.mo30413a() && i >= this.f42884i.mo30414b())) {
            throw new bmi(this.f42884i, i, j);
        }
        this.f42881f++;
        this.f42897v = i;
        if (this.f42884i.mo30413a()) {
            this.f42898w = 0;
        } else {
            this.f42884i.mo30411a(i, this.f42894s, false);
            this.f42884i.mo30410a(0, this.f42895t, false);
            this.f42898w = 0;
        }
        if (j == -9223372036854775807L) {
            this.f42899x = 0;
            this.f42893r.mo30383a(this.f42884i, i, -9223372036854775807L);
            return;
        }
        this.f42899x = j;
        this.f42893r.mo30383a(this.f42884i, i, bls.m36049b(j));
        Iterator it = this.f42877b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: c */
    public final void mo30372c() {
        this.f42893r.f42910a.sendEmptyMessage(5);
    }

    /* renamed from: d */
    public final void mo30373d() {
        this.f42893r.mo30382a();
        this.f42892q.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo30368a(blx... blxArr) {
        bmb bmb = this.f42893r;
        if (!bmb.f42911b) {
            bmb.f42912c++;
            bmb.f42910a.obtainMessage(11, blxArr).sendToTarget();
        }
    }

    /* renamed from: b */
    public final void mo30370b(blx... blxArr) {
        this.f42893r.mo30387a(blxArr);
    }

    /* renamed from: i */
    private final int m36069i() {
        if (this.f42884i.mo30413a() || this.f42881f > 0) {
            return this.f42897v;
        }
        this.f42884i.mo30410a(this.f42889n.f42955a, this.f42895t, false);
        return 0;
    }

    /* renamed from: f */
    public final long mo30375f() {
        if (this.f42884i.mo30413a()) {
            return -9223372036854775807L;
        }
        return bls.m36048a(this.f42884i.mo30411a(m36069i(), this.f42894s, false).f42991i);
    }

    /* renamed from: g */
    public final long mo30376g() {
        if (this.f42884i.mo30413a() || this.f42881f > 0) {
            return this.f42899x;
        }
        this.f42884i.mo30410a(this.f42889n.f42955a, this.f42895t, false);
        return this.f42895t.mo30416a() + bls.m36048a(this.f42889n.f42957c);
    }

    /* renamed from: h */
    public final long mo30377h() {
        if (this.f42884i.mo30413a() || this.f42881f > 0) {
            return this.f42899x;
        }
        this.f42884i.mo30410a(this.f42889n.f42955a, this.f42895t, false);
        return this.f42895t.mo30416a() + bls.m36048a(this.f42889n.f42958d);
    }

    /* renamed from: e */
    public final int mo30374e() {
        return this.f42890o.length;
    }
}
