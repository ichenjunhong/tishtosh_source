package com.google.android.gms.common.api.internal;

import android.content.DialogInterface.OnCancelListener;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: com.google.android.gms.common.api.internal.ck */
final class C15312ck implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C15310ci f39509a;

    /* renamed from: b */
    private final C15311cj f39510b;

    C15312ck(C15310ci ciVar, C15311cj cjVar) {
        this.f39509a = ciVar;
        this.f39510b = cjVar;
    }

    public final void run() {
        if (this.f39509a.f39504d) {
            ConnectionResult connectionResult = this.f39510b.f39508b;
            if (connectionResult.mo28023a()) {
                this.f39509a.f39334a.startActivityForResult(GoogleApiActivity.m31451a(this.f39509a.mo28139a(), connectionResult.f39247c, this.f39510b.f39507a, false), 1);
            } else if (this.f39509a.f39506f.isUserResolvableError(connectionResult.f39246b)) {
                this.f39509a.f39506f.zaa(this.f39509a.mo28139a(), this.f39509a.f39334a, connectionResult.f39246b, 2, this.f39509a);
            } else if (connectionResult.f39246b == 18) {
                this.f39509a.f39506f.zaa(this.f39509a.mo28139a().getApplicationContext(), (C15279bh) new C15313cl(this, GoogleApiAvailability.zaa(this.f39509a.mo28139a(), (OnCancelListener) this.f39509a)));
            } else {
                this.f39509a.mo28237a(connectionResult, this.f39510b.f39507a);
            }
        }
    }
}
