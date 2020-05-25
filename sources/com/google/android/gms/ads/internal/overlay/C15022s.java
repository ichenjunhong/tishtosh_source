package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C16223rv;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.p1027a.C14882b;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.overlay.s */
public final class C15022s extends C16223rv {

    /* renamed from: a */
    private AdOverlayInfoParcel f38824a;

    /* renamed from: b */
    private Activity f38825b;

    /* renamed from: c */
    private boolean f38826c;

    /* renamed from: d */
    private boolean f38827d;

    public C15022s(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f38824a = adOverlayInfoParcel;
        this.f38825b = activity;
    }

    /* renamed from: a */
    public final void mo27671a(int i, int i2, Intent intent) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27674a(C14882b bVar) throws RemoteException {
    }

    /* renamed from: d */
    public final void mo27679d() throws RemoteException {
    }

    /* renamed from: e */
    public final boolean mo27680e() throws RemoteException {
        return false;
    }

    /* renamed from: f */
    public final void mo27681f() throws RemoteException {
    }

    /* renamed from: g */
    public final void mo27682g() throws RemoteException {
    }

    /* renamed from: l */
    public final void mo27687l() throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27672a(Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        if (this.f38824a == null) {
            this.f38825b.finish();
        } else if (z) {
            this.f38825b.finish();
        } else {
            if (bundle == null) {
                if (this.f38824a.f38770b != null) {
                    this.f38824a.f38770b.mo27201e();
                }
                if (!(this.f38825b.getIntent() == null || !this.f38825b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || this.f38824a.f38771c == null)) {
                    this.f38824a.f38771c.mo27591d();
                }
            }
            if (!C15004a.m31022a((Context) this.f38825b, this.f38824a.f38769a, this.f38824a.f38777i)) {
                this.f38825b.finish();
            }
        }
    }

    /* renamed from: h */
    public final void mo27683h() throws RemoteException {
        if (this.f38826c) {
            this.f38825b.finish();
            return;
        }
        this.f38826c = true;
        if (this.f38824a.f38771c != null) {
            this.f38824a.f38771c.mo27590c();
        }
    }

    /* renamed from: b */
    public final void mo27677b(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f38826c);
    }

    /* renamed from: i */
    public final void mo27684i() throws RemoteException {
        if (this.f38824a.f38771c != null) {
            this.f38824a.f38771c.mo27587b();
        }
        if (this.f38825b.isFinishing()) {
            m31063a();
        }
    }

    /* renamed from: j */
    public final void mo27685j() throws RemoteException {
        if (this.f38825b.isFinishing()) {
            m31063a();
        }
    }

    /* renamed from: k */
    public final void mo27686k() throws RemoteException {
        if (this.f38825b.isFinishing()) {
            m31063a();
        }
    }

    /* renamed from: a */
    private final synchronized void m31063a() {
        if (!this.f38827d) {
            if (this.f38824a.f38771c != null) {
                this.f38824a.f38771c.mo27592y_();
            }
            this.f38827d = true;
        }
    }
}
