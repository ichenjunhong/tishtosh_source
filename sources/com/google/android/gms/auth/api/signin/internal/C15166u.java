package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.C15106a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C15383f;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15233f.C15234a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.u */
public final class C15166u extends C15161p {

    /* renamed from: a */
    private final Context f39199a;

    public C15166u(Context context) {
        this.f39199a = context;
    }

    /* renamed from: a */
    public final void mo27972a() {
        m31369c();
        C15147b a = C15147b.m31320a(this.f39199a);
        GoogleSignInAccount a2 = a.mo27951a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f39143f;
        if (a2 != null) {
            googleSignInOptions = a.mo27954b();
        }
        C15233f a3 = new C15234a(this.f39199a).mo28117a(C15106a.f39006e, googleSignInOptions).mo28120a();
        try {
            if (a3.mo28110f().mo28024b()) {
                if (a2 != null) {
                    C15106a.f39009h.mo27934c(a3);
                } else {
                    a3.mo28113i();
                }
            }
        } finally {
            a3.mo28111g();
        }
    }

    /* renamed from: b */
    public final void mo27973b() {
        m31369c();
        C15159n.m31354a(this.f39199a).mo27970a();
    }

    /* renamed from: c */
    private final void m31369c() {
        if (!C15383f.m31962b(this.f39199a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }
}
