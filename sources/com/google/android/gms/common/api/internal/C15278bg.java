package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.C15211a.C15215d;
import com.google.android.gms.common.api.C15230e;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.internal.C15298c.C15299a;

/* renamed from: com.google.android.gms.common.api.internal.bg */
public final class C15278bg<O extends C15215d> extends C15354w {

    /* renamed from: a */
    private final C15230e<O> f39442a;

    public C15278bg(C15230e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f39442a = eVar;
    }

    /* renamed from: a */
    public final void mo28101a(C15292bu buVar) {
    }

    /* renamed from: b */
    public final void mo28106b(C15292bu buVar) {
    }

    /* renamed from: a */
    public final <A extends C15213b, T extends C15299a<? extends C15358j, A>> T mo28097a(T t) {
        return this.f39442a.mo28092a(t);
    }

    /* renamed from: c */
    public final Looper mo28107c() {
        return this.f39442a.f39287e;
    }

    /* renamed from: b */
    public final Context mo28104b() {
        return this.f39442a.f39283a;
    }
}
