package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15211a.C15212a;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.signin.C17142a;
import com.google.android.gms.signin.C17144b;
import com.google.android.gms.signin.C17147e;
import com.google.android.gms.signin.internal.C17150c;
import com.google.android.gms.signin.internal.zaj;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.bp */
public final class C15287bp extends C17150c implements C15235b, C15236c {

    /* renamed from: d */
    private static C15212a<? extends C17147e, C17142a> f39450d = C17144b.f48525a;

    /* renamed from: a */
    Set<Scope> f39451a;

    /* renamed from: b */
    public C17147e f39452b;

    /* renamed from: c */
    C15290bs f39453c;

    /* renamed from: e */
    private final Context f39454e;

    /* renamed from: f */
    private final Handler f39455f;

    /* renamed from: g */
    private final C15212a<? extends C17147e, C17142a> f39456g;

    /* renamed from: h */
    private C15441d f39457h;

    public C15287bp(Context context, Handler handler, C15441d dVar) {
        this(context, handler, dVar, f39450d);
    }

    public C15287bp(Context context, Handler handler, C15441d dVar, C15212a<? extends C17147e, C17142a> aVar) {
        this.f39454e = context;
        this.f39455f = handler;
        this.f39457h = (C15441d) C15464q.m32124a(dVar, (Object) "ClientSettings must not be null");
        this.f39451a = dVar.f39827b;
        this.f39456g = aVar;
    }

    /* renamed from: a */
    public final void mo28217a(C15290bs bsVar) {
        if (this.f39452b != null) {
            this.f39452b.mo28073f();
        }
        this.f39457h.f39835j = Integer.valueOf(System.identityHashCode(this));
        this.f39452b = (C17147e) this.f39456g.mo27863a(this.f39454e, this.f39455f.getLooper(), this.f39457h, this.f39457h.f39834i, this, this);
        this.f39453c = bsVar;
        if (this.f39451a == null || this.f39451a.isEmpty()) {
            this.f39455f.post(new C15288bq(this));
        } else {
            this.f39452b.mo33400t();
        }
    }

    public final void onConnected(Bundle bundle) {
        this.f39452b.mo33398a(this);
    }

    public final void onConnectionSuspended(int i) {
        this.f39452b.mo28073f();
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f39453c.mo28221b(connectionResult);
    }

    /* renamed from: a */
    public final void mo28166a(zaj zaj) {
        this.f39455f.post(new C15289br(this, zaj));
    }
}
