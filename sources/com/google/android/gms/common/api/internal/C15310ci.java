package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.p1042c.C16478e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.ci */
public abstract class C15310ci extends LifecycleCallback implements OnCancelListener {

    /* renamed from: b */
    private final Handler f39503b;

    /* renamed from: d */
    protected volatile boolean f39504d;

    /* renamed from: e */
    protected final AtomicReference<C15311cj> f39505e;

    /* renamed from: f */
    protected final GoogleApiAvailability f39506f;

    protected C15310ci(C15335g gVar) {
        this(gVar, GoogleApiAvailability.getInstance());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28237a(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo28238e();

    private C15310ci(C15335g gVar, GoogleApiAvailability googleApiAvailability) {
        super(gVar);
        this.f39505e = new AtomicReference<>(null);
        this.f39503b = new C16478e(Looper.getMainLooper());
        this.f39506f = googleApiAvailability;
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo28237a(new ConnectionResult(13, null), m31747a((C15311cj) this.f39505e.get()));
        mo28241f();
    }

    /* renamed from: a */
    public final void mo28141a(Bundle bundle) {
        super.mo28141a(bundle);
        if (bundle != null) {
            this.f39505e.set(bundle.getBoolean("resolving_error", false) ? new C15311cj(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* renamed from: b */
    public final void mo28144b(Bundle bundle) {
        super.mo28144b(bundle);
        C15311cj cjVar = (C15311cj) this.f39505e.get();
        if (cjVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", cjVar.f39507a);
            bundle.putInt("failed_status", cjVar.f39508b.f39246b);
            bundle.putParcelable("failed_resolution", cjVar.f39508b.f39247c);
        }
    }

    /* renamed from: b */
    public void mo28143b() {
        super.mo28143b();
        this.f39504d = true;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28140a(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.cj> r0 = r3.f39505e
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.cj r0 = (com.google.android.gms.common.api.internal.C15311cj) r0
            r1 = 1
            r2 = 0
            switch(r4) {
                case 1: goto L_0x002a;
                case 2: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x004f
        L_0x000e:
            com.google.android.gms.common.GoogleApiAvailability r4 = r3.f39506f
            android.app.Activity r5 = r3.mo28139a()
            int r4 = r4.isGooglePlayServicesAvailable(r5)
            if (r4 != 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            if (r0 != 0) goto L_0x001f
            return
        L_0x001f:
            com.google.android.gms.common.ConnectionResult r5 = r0.f39508b
            int r5 = r5.f39246b
            r6 = 18
            if (r5 != r6) goto L_0x0050
            if (r4 != r6) goto L_0x0050
            return
        L_0x002a:
            r4 = -1
            if (r5 != r4) goto L_0x002e
            goto L_0x0050
        L_0x002e:
            if (r5 != 0) goto L_0x004f
            r4 = 13
            if (r6 == 0) goto L_0x003a
            java.lang.String r5 = "<<ResolutionFailureErrorDetail>>"
            int r4 = r6.getIntExtra(r5, r4)
        L_0x003a:
            com.google.android.gms.common.api.internal.cj r5 = new com.google.android.gms.common.api.internal.cj
            com.google.android.gms.common.ConnectionResult r6 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r6.<init>(r4, r1)
            int r4 = m31747a(r0)
            r5.<init>(r6, r4)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.cj> r4 = r3.f39505e
            r4.set(r5)
            r0 = r5
        L_0x004f:
            r1 = 0
        L_0x0050:
            if (r1 == 0) goto L_0x0056
            r3.mo28241f()
            return
        L_0x0056:
            if (r0 == 0) goto L_0x005f
            com.google.android.gms.common.ConnectionResult r4 = r0.f39508b
            int r5 = r0.f39507a
            r3.mo28237a(r4, r5)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C15310ci.mo28140a(int, int, android.content.Intent):void");
    }

    /* renamed from: d */
    public void mo28146d() {
        super.mo28146d();
        this.f39504d = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo28241f() {
        this.f39505e.set(null);
        mo28238e();
    }

    /* renamed from: b */
    public final void mo28240b(ConnectionResult connectionResult, int i) {
        C15311cj cjVar = new C15311cj(connectionResult, i);
        if (this.f39505e.compareAndSet(null, cjVar)) {
            this.f39503b.post(new C15312ck(this, cjVar));
        }
    }

    /* renamed from: a */
    private static int m31747a(C15311cj cjVar) {
        if (cjVar == null) {
            return -1;
        }
        return cjVar.f39507a;
    }
}
