package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C15136a;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15441d;
import com.google.android.gms.common.internal.C15446g;

/* renamed from: com.google.android.gms.auth.api.signin.internal.g */
public final class C15152g extends C15446g<C15164s> {

    /* renamed from: a */
    public final GoogleSignInOptions f39191a;

    public C15152g(Context context, Looper looper, C15441d dVar, GoogleSignInOptions googleSignInOptions, C15235b bVar, C15236c cVar) {
        super(context, looper, 91, dVar, bVar, cVar);
        if (googleSignInOptions == null) {
            googleSignInOptions = new C15136a().mo27929c();
        }
        if (!dVar.f39828c.isEmpty()) {
            C15136a aVar = new C15136a(googleSignInOptions);
            for (Scope a : dVar.f39828c) {
                aVar.mo27926a(a, new Scope[0]);
            }
            googleSignInOptions = aVar.mo27929c();
        }
        this.f39191a = googleSignInOptions;
    }

    /* renamed from: a */
    public final String mo27963a() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: b */
    public final String mo27964b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* renamed from: c */
    public final boolean mo27965c() {
        return true;
    }

    /* renamed from: e */
    public final int mo27967e() {
        return C15384g.f39685b;
    }

    /* renamed from: d */
    public final Intent mo27966d() {
        return C15153h.m31346a(this.f39789d, this.f39191a);
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo27962a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C15164s) {
            return (C15164s) queryLocalInterface;
        }
        return new C15165t(iBinder);
    }
}
