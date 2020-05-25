package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.measurement.internal.ah */
public final class C16988ah {

    /* renamed from: a */
    private final String f47892a;

    /* renamed from: b */
    private final boolean f47893b = true;

    /* renamed from: c */
    private boolean f47894c;

    /* renamed from: d */
    private boolean f47895d;

    /* renamed from: e */
    private final /* synthetic */ C16986af f47896e;

    public C16988ah(C16986af afVar, String str, boolean z) {
        this.f47896e = afVar;
        C15464q.m32125a(str);
        this.f47892a = str;
    }

    /* renamed from: a */
    public final boolean mo32881a() {
        if (!this.f47894c) {
            this.f47894c = true;
            this.f47895d = this.f47896e.mo32873f().getBoolean(this.f47892a, this.f47893b);
        }
        return this.f47895d;
    }

    /* renamed from: a */
    public final void mo32880a(boolean z) {
        Editor edit = this.f47896e.mo32873f().edit();
        edit.putBoolean(this.f47892a, z);
        edit.apply();
        this.f47895d = z;
    }
}
