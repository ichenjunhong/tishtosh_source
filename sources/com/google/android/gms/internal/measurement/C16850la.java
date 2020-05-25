package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.la */
public abstract class C16850la {

    /* renamed from: M */
    protected volatile int f47304M = -1;

    /* renamed from: a */
    public abstract C16850la mo31923a(C16839kq kqVar) throws IOException;

    /* renamed from: a */
    public void mo31924a(C16841ks ksVar) throws IOException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo31925b() {
        return 0;
    }

    /* renamed from: d */
    public final int mo32478d() {
        if (this.f47304M < 0) {
            mo32479e();
        }
        return this.f47304M;
    }

    /* renamed from: e */
    public final int mo32479e() {
        int b = mo31925b();
        this.f47304M = b;
        return b;
    }

    public String toString() {
        return C16851lb.m40924a(this);
    }

    /* renamed from: c */
    public C16850la clone() throws CloneNotSupportedException {
        return (C16850la) super.clone();
    }
}
