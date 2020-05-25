package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.zaj;

/* renamed from: com.google.android.gms.common.api.internal.br */
final class C15289br implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zaj f39459a;

    /* renamed from: b */
    private final /* synthetic */ C15287bp f39460b;

    C15289br(C15287bp bpVar, zaj zaj) {
        this.f39460b = bpVar;
        this.f39459a = zaj;
    }

    public final void run() {
        C15287bp bpVar = this.f39460b;
        zaj zaj = this.f39459a;
        ConnectionResult connectionResult = zaj.f48542a;
        if (connectionResult.mo28024b()) {
            ResolveAccountResponse resolveAccountResponse = zaj.f48543b;
            ConnectionResult connectionResult2 = resolveAccountResponse.f39747a;
            if (!connectionResult2.mo28024b()) {
                String valueOf = String.valueOf(connectionResult2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                bpVar.f39453c.mo28221b(connectionResult2);
            } else {
                bpVar.f39453c.mo28220a(resolveAccountResponse.mo28358a(), bpVar.f39451a);
            }
        } else {
            bpVar.f39453c.mo28221b(connectionResult);
        }
        bpVar.f39452b.mo28073f();
    }
}
