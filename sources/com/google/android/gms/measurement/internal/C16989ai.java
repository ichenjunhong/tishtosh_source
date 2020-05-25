package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.measurement.internal.ai */
public final class C16989ai {

    /* renamed from: a */
    private final String f47897a;

    /* renamed from: b */
    private final long f47898b;

    /* renamed from: c */
    private boolean f47899c;

    /* renamed from: d */
    private long f47900d;

    /* renamed from: e */
    private final /* synthetic */ C16986af f47901e;

    public C16989ai(C16986af afVar, String str, long j) {
        this.f47901e = afVar;
        C15464q.m32125a(str);
        this.f47897a = str;
        this.f47898b = j;
    }

    /* renamed from: a */
    public final long mo32882a() {
        if (!this.f47899c) {
            this.f47899c = true;
            this.f47900d = this.f47901e.mo32873f().getLong(this.f47897a, this.f47898b);
        }
        return this.f47900d;
    }

    /* renamed from: a */
    public final void mo32883a(long j) {
        Editor edit = this.f47901e.mo32873f().edit();
        edit.putLong(this.f47897a, j);
        edit.apply();
        this.f47900d = j;
    }
}
