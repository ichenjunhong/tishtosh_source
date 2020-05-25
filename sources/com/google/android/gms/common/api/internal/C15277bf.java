package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C15328d.C15329a;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.bf */
final class C15277bf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f39440a;

    /* renamed from: b */
    private final /* synthetic */ C15331c f39441b;

    C15277bf(C15331c cVar, ConnectionResult connectionResult) {
        this.f39441b = cVar;
        this.f39440a = connectionResult;
    }

    public final void run() {
        if (this.f39440a.mo28024b()) {
            this.f39441b.f39599a = true;
            if (this.f39441b.f39601c.mo28076i()) {
                this.f39441b.mo28281a();
                return;
            }
            try {
                this.f39441b.f39601c.mo28071a(null, Collections.emptySet());
            } catch (SecurityException unused) {
                ((C15329a) C15328d.this.f39573f.get(this.f39441b.f39602d)).onConnectionFailed(new ConnectionResult(10));
            }
        } else {
            ((C15329a) C15328d.this.f39573f.get(this.f39441b.f39602d)).onConnectionFailed(this.f39440a);
        }
    }
}
