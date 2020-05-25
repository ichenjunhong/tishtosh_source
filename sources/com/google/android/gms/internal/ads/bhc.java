package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class bhc implements bgz {

    /* renamed from: a */
    final CopyOnWriteArraySet<bhb> f42344a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    boolean f42345b;

    /* renamed from: c */
    int f42346c = 1;

    /* renamed from: d */
    int f42347d;

    /* renamed from: e */
    private final Handler f42348e;

    /* renamed from: f */
    private final bhe f42349f;

    /* renamed from: g */
    private final boolean[] f42350g = new boolean[2];

    public bhc(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.f42350g.length; i4++) {
            this.f42350g[i4] = true;
        }
        this.f42348e = new bhd(this);
        bhe bhe = new bhe(this.f42348e, this.f42345b, this.f42350g, 2500, 5000);
        this.f42349f = bhe;
    }

    /* renamed from: a */
    public final void mo30148a(bhb bhb) {
        this.f42344a.add(bhb);
    }

    /* renamed from: a */
    public final int mo30144a() {
        return this.f42346c;
    }

    /* renamed from: a */
    public final void mo30150a(bik... bikArr) {
        this.f42349f.f42352a.obtainMessage(1, bikArr).sendToTarget();
    }

    /* renamed from: a */
    public final void mo30145a(int i, boolean z) {
        if (this.f42350g[0] != z) {
            this.f42350g[0] = z;
            this.f42349f.f42352a.obtainMessage(8, 0, z ? 1 : 0).sendToTarget();
        }
    }

    /* renamed from: a */
    public final void mo30149a(boolean z) {
        if (this.f42345b != z) {
            this.f42345b = z;
            this.f42347d++;
            this.f42349f.f42352a.obtainMessage(3, z ? 1 : 0, 0).sendToTarget();
            Iterator it = this.f42344a.iterator();
            while (it.hasNext()) {
                ((bhb) it.next()).mo28977a(z, this.f42346c);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo30152b() {
        return this.f42345b;
    }

    /* renamed from: a */
    public final void mo30146a(long j) {
        this.f42349f.f42352a.obtainMessage(6, Long.valueOf(j)).sendToTarget();
    }

    /* renamed from: c */
    public final void mo30153c() {
        this.f42349f.f42352a.sendEmptyMessage(4);
    }

    /* renamed from: d */
    public final void mo30154d() {
        this.f42349f.mo30163a();
        this.f42348e.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo30147a(bha bha, int i, Object obj) {
        bhe bhe = this.f42349f;
        bhe.f42353b++;
        bhe.f42352a.obtainMessage(9, 1, 0, Pair.create(bha, obj)).sendToTarget();
    }

    /* renamed from: b */
    public final void mo30151b(bha bha, int i, Object obj) {
        this.f42349f.mo30164a(bha, 1, obj);
    }

    /* renamed from: e */
    public final long mo30155e() {
        bhe bhe = this.f42349f;
        if (bhe.f42354c == -1) {
            return -1;
        }
        return bhe.f42354c / 1000;
    }

    /* renamed from: f */
    public final long mo30156f() {
        return this.f42349f.f42355d / 1000;
    }

    /* renamed from: g */
    public final long mo30157g() {
        bhe bhe = this.f42349f;
        if (bhe.f42356e == -1) {
            return -1;
        }
        return bhe.f42356e / 1000;
    }
}
