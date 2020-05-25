package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.measurement.internal.ak */
public final class C16991ak {

    /* renamed from: a */
    final String f47907a;

    /* renamed from: b */
    boolean f47908b;

    /* renamed from: c */
    String f47909c;

    /* renamed from: d */
    final /* synthetic */ C16986af f47910d;

    /* renamed from: e */
    private final String f47911e = null;

    public C16991ak(C16986af afVar, String str, String str2) {
        this.f47910d = afVar;
        C15464q.m32125a(str);
        this.f47907a = str;
    }

    /* renamed from: a */
    public final void mo32886a(String str) {
        if (!C17102em.m41671c(str, this.f47909c)) {
            Editor edit = this.f47910d.mo32873f().edit();
            edit.putString(this.f47907a, str);
            edit.apply();
            this.f47909c = str;
        }
    }
}
