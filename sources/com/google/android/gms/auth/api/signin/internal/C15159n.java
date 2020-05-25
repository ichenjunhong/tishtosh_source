package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: com.google.android.gms.auth.api.signin.internal.n */
public final class C15159n {

    /* renamed from: a */
    private static C15159n f39195a;

    /* renamed from: b */
    private C15147b f39196b;

    /* renamed from: c */
    private GoogleSignInAccount f39197c = this.f39196b.mo27951a();

    /* renamed from: d */
    private GoogleSignInOptions f39198d = this.f39196b.mo27954b();

    private C15159n(Context context) {
        this.f39196b = C15147b.m31320a(context);
    }

    /* renamed from: a */
    public static synchronized C15159n m31354a(Context context) {
        C15159n b;
        synchronized (C15159n.class) {
            b = m31355b(context.getApplicationContext());
        }
        return b;
    }

    /* renamed from: b */
    private static synchronized C15159n m31355b(Context context) {
        C15159n nVar;
        synchronized (C15159n.class) {
            if (f39195a == null) {
                f39195a = new C15159n(context);
            }
            nVar = f39195a;
        }
        return nVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final synchronized void mo27970a() {
        C15147b bVar = this.f39196b;
        bVar.f39187a.lock();
        try {
            bVar.f39188b.edit().clear().apply();
            bVar.f39187a.unlock();
            this.f39197c = null;
            this.f39198d = null;
        } catch (Throwable th) {
            bVar.f39187a.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void mo27971a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f39196b.mo27953a(googleSignInAccount, googleSignInOptions);
        this.f39197c = googleSignInAccount;
        this.f39198d = googleSignInOptions;
    }
}
