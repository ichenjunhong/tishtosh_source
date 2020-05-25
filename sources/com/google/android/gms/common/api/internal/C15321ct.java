package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.C15211a.C15212a;
import com.google.android.gms.common.api.C15211a.C15215d;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.api.C15230e;
import com.google.android.gms.common.api.internal.C15328d.C15329a;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.signin.C17142a;
import com.google.android.gms.signin.C17147e;

/* renamed from: com.google.android.gms.common.api.internal.ct */
public final class C15321ct<O extends C15215d> extends C15230e<O> {

    /* renamed from: i */
    public final C15222f f39533i;

    /* renamed from: j */
    private final C15315cn f39534j;

    /* renamed from: k */
    private final C15441d f39535k;

    /* renamed from: l */
    private final C15212a<? extends C17147e, C17142a> f39536l;

    public C15321ct(Context context, C15211a<O> aVar, Looper looper, C15222f fVar, C15315cn cnVar, C15441d dVar, C15212a<? extends C17147e, C17142a> aVar2) {
        super(context, aVar, looper);
        this.f39533i = fVar;
        this.f39534j = cnVar;
        this.f39535k = dVar;
        this.f39536l = aVar2;
        this.f39290h.mo28259a((C15230e<?>) this);
    }

    /* renamed from: a */
    public final C15222f mo28090a(Looper looper, C15329a<O> aVar) {
        this.f39534j.f39514b = aVar;
        return this.f39533i;
    }

    /* renamed from: a */
    public final C15287bp mo28091a(Context context, Handler handler) {
        return new C15287bp(context, handler, this.f39535k, this.f39536l);
    }
}
