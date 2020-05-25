package com.google.android.gms.common.api.internal;

import android.support.p030v4.p038f.C0777a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15228c;
import com.google.android.gms.common.api.C15230e;
import com.google.android.gms.p1033b.C15180h;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.ch */
public final class C15309ch {

    /* renamed from: a */
    final C0777a<C15306cf<?>, ConnectionResult> f39498a = new C0777a<>();

    /* renamed from: b */
    final C15180h<Map<C15306cf<?>, String>> f39499b = new C15180h<>();

    /* renamed from: c */
    private final C0777a<C15306cf<?>, String> f39500c = new C0777a<>();

    /* renamed from: d */
    private int f39501d;

    /* renamed from: e */
    private boolean f39502e = false;

    public C15309ch(Iterable<? extends C15230e<?>> iterable) {
        for (C15230e eVar : iterable) {
            this.f39498a.put(eVar.f39286d, null);
        }
        this.f39501d = this.f39498a.keySet().size();
    }

    /* renamed from: a */
    public final void mo28239a(C15306cf<?> cfVar, ConnectionResult connectionResult, String str) {
        this.f39498a.put(cfVar, connectionResult);
        this.f39500c.put(cfVar, str);
        this.f39501d--;
        if (!connectionResult.mo28024b()) {
            this.f39502e = true;
        }
        if (this.f39501d == 0) {
            if (this.f39502e) {
                this.f39499b.mo28004a((Exception) new C15228c(this.f39498a));
                return;
            }
            this.f39499b.mo28005a(this.f39500c);
        }
    }
}
