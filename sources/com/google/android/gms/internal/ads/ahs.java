package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.C15464q;

@C16299uq
public final class ahs {

    /* renamed from: a */
    final Context f40508a;

    /* renamed from: b */
    final aib f40509b;

    /* renamed from: c */
    final ViewGroup f40510c;

    /* renamed from: d */
    ahm f40511d;

    public ahs(Context context, ViewGroup viewGroup, ama ama) {
        this(context, viewGroup, ama, null);
    }

    private ahs(Context context, ViewGroup viewGroup, aib aib, ahm ahm) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f40508a = context;
        this.f40510c = viewGroup;
        this.f40509b = aib;
        this.f40511d = null;
    }

    /* renamed from: a */
    public final ahm mo28912a() {
        C15464q.m32132b("getAdVideoUnderlay must be called from the UI thread.");
        return this.f40511d;
    }

    /* renamed from: b */
    public final void mo28913b() {
        C15464q.m32132b("onDestroy must be called from the UI thread.");
        if (this.f40511d != null) {
            ahm ahm = this.f40511d;
            ahm.f40484a.mo28955a();
            if (ahm.f40485b != null) {
                ahm.f40485b.mo28845b();
            }
            ahm.mo28904n();
            this.f40510c.removeView(this.f40511d);
            this.f40511d = null;
        }
    }
}
