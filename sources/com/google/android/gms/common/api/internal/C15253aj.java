package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;

/* renamed from: com.google.android.gms.common.api.internal.aj */
final class C15253aj implements C15235b, C15236c {

    /* renamed from: a */
    private final /* synthetic */ C15244aa f39370a;

    private C15253aj(C15244aa aaVar) {
        this.f39370a = aaVar;
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnected(Bundle bundle) {
        this.f39370a.f39351q.mo33398a(new C15251ah(this.f39370a));
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f39370a.f39342h.lock();
        try {
            if (this.f39370a.mo28153a(connectionResult)) {
                this.f39370a.mo28161f();
                this.f39370a.mo28160e();
            } else {
                this.f39370a.mo28154b(connectionResult);
            }
        } finally {
            this.f39370a.f39342h.unlock();
        }
    }

    /* synthetic */ C15253aj(C15244aa aaVar, C15245ab abVar) {
        this(aaVar);
    }
}
