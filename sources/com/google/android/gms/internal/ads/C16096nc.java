package com.google.android.gms.internal.ads;

import android.content.Context;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.nc */
public final class C16096nc {

    /* renamed from: a */
    private final Object f45241a = new Object();

    /* renamed from: b */
    private final Object f45242b = new Object();

    /* renamed from: c */
    private C16103nj f45243c;

    /* renamed from: d */
    private C16103nj f45244d;

    /* renamed from: a */
    public final C16103nj mo31189a(Context context, zzbgz zzbgz) {
        C16103nj njVar;
        synchronized (this.f45242b) {
            if (this.f45244d == null) {
                this.f45244d = new C16103nj(m38087a(context), zzbgz, (String) caf.m37099d().mo30717a(C15740bx.f44213a));
            }
            njVar = this.f45244d;
        }
        return njVar;
    }

    /* renamed from: b */
    public final C16103nj mo31190b(Context context, zzbgz zzbgz) {
        C16103nj njVar;
        synchronized (this.f45241a) {
            if (this.f45243c == null) {
                this.f45243c = new C16103nj(m38087a(context), zzbgz, (String) caf.m37099d().mo30717a(C15740bx.f44266b));
            }
            njVar = this.f45243c;
        }
        return njVar;
    }

    /* renamed from: a */
    private static Context m38087a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
