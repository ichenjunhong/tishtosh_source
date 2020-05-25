package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.zaj;

/* renamed from: com.google.android.gms.common.api.internal.ai */
final class C15252ai extends C15266aw {

    /* renamed from: a */
    private final /* synthetic */ C15244aa f39368a;

    /* renamed from: b */
    private final /* synthetic */ zaj f39369b;

    C15252ai(C15251ah ahVar, C15264au auVar, C15244aa aaVar, zaj zaj) {
        this.f39368a = aaVar;
        this.f39369b = zaj;
        super(auVar);
    }

    /* renamed from: a */
    public final void mo28165a() {
        C15244aa aaVar = this.f39368a;
        zaj zaj = this.f39369b;
        if (aaVar.mo28157b(0)) {
            ConnectionResult connectionResult = zaj.f48542a;
            if (connectionResult.mo28024b()) {
                ResolveAccountResponse resolveAccountResponse = zaj.f48543b;
                ConnectionResult connectionResult2 = resolveAccountResponse.f39747a;
                if (!connectionResult2.mo28024b()) {
                    String valueOf = String.valueOf(connectionResult2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                    aaVar.mo28154b(connectionResult2);
                    return;
                }
                aaVar.f39337c = true;
                aaVar.f39338d = resolveAccountResponse.mo28358a();
                aaVar.f39339e = resolveAccountResponse.f39748b;
                aaVar.f39340f = resolveAccountResponse.f39749c;
                aaVar.mo28160e();
            } else if (aaVar.mo28153a(connectionResult)) {
                aaVar.mo28161f();
                aaVar.mo28160e();
            } else {
                aaVar.mo28154b(connectionResult);
            }
        }
    }
}
