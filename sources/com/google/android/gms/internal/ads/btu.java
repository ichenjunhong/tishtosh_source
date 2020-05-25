package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class btu implements btm {

    /* renamed from: a */
    private boolean f43874a;

    /* renamed from: b */
    private long f43875b;

    /* renamed from: c */
    private long f43876c;

    /* renamed from: d */
    private bml f43877d = bml.f42970a;

    /* renamed from: a */
    public final void mo30712a() {
        if (!this.f43874a) {
            this.f43876c = SystemClock.elapsedRealtime();
            this.f43874a = true;
        }
    }

    /* renamed from: b */
    public final void mo30715b() {
        if (this.f43874a) {
            mo30713a(mo30471r());
            this.f43874a = false;
        }
    }

    /* renamed from: a */
    public final void mo30713a(long j) {
        this.f43875b = j;
        if (this.f43874a) {
            this.f43876c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: a */
    public final void mo30714a(btm btm) {
        mo30713a(btm.mo30471r());
        this.f43877d = btm.mo30472s();
    }

    /* renamed from: r */
    public final long mo30471r() {
        long j = this.f43875b;
        if (!this.f43874a) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f43876c;
        if (this.f43877d.f42971b == 1.0f) {
            return j + bls.m36049b(elapsedRealtime);
        }
        return j + this.f43877d.mo30399a(elapsedRealtime);
    }

    /* renamed from: a */
    public final bml mo30464a(bml bml) {
        if (this.f43874a) {
            mo30713a(mo30471r());
        }
        this.f43877d = bml;
        return bml;
    }

    /* renamed from: s */
    public final bml mo30472s() {
        return this.f43877d;
    }
}
