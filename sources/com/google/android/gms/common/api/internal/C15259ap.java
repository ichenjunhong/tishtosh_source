package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.ap */
final class C15259ap implements C15236c {

    /* renamed from: a */
    private final /* synthetic */ C15344m f39402a;

    C15259ap(C15256am amVar, C15344m mVar) {
        this.f39402a = mVar;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f39402a.mo28131a(new Status(8));
    }
}
