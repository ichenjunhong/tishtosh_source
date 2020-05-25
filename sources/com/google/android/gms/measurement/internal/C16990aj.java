package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.measurement.internal.aj */
public final class C16990aj {

    /* renamed from: a */
    final String f47902a;

    /* renamed from: b */
    final String f47903b;

    /* renamed from: c */
    final long f47904c;

    /* renamed from: d */
    final /* synthetic */ C16986af f47905d;

    /* renamed from: e */
    private final String f47906e;

    private C16990aj(C16986af afVar, String str, long j) {
        this.f47905d = afVar;
        C15464q.m32125a(str);
        C15464q.m32133b(j > 0);
        this.f47906e = String.valueOf(str).concat(":start");
        this.f47902a = String.valueOf(str).concat(":count");
        this.f47903b = String.valueOf(str).concat(":value");
        this.f47904c = j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32884a() {
        this.f47905d.mo32840c();
        long a = this.f47905d.mo32849l().mo28523a();
        Editor edit = this.f47905d.mo32873f().edit();
        edit.remove(this.f47902a);
        edit.remove(this.f47903b);
        edit.putLong(this.f47906e, a);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final long mo32885b() {
        return this.f47905d.mo32873f().getLong(this.f47906e, 0);
    }
}
