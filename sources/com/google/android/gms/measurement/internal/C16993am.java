package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.C16719go;
import com.google.android.gms.internal.measurement.C16780ip;

/* renamed from: com.google.android.gms.measurement.internal.am */
public final class C16993am implements ServiceConnection {

    /* renamed from: a */
    final String f47913a;

    /* renamed from: b */
    final /* synthetic */ C16992al f47914b;

    C16993am(C16992al alVar, String str) {
        this.f47914b = alVar;
        this.f47913a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C16719go goVar;
        if (iBinder == null) {
            this.f47914b.f47912a.mo32854q().f48448e.mo33376a("Install Referrer connection returned with null binder");
            return;
        }
        if (iBinder == null) {
            goVar = null;
        } else {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof C16719go) {
                    goVar = (C16719go) queryLocalInterface;
                } else {
                    goVar = new C16780ip(iBinder);
                }
            } catch (Exception e) {
                this.f47914b.f47912a.mo32854q().f48448e.mo33377a("Exception occurred while calling Install Referrer API", e);
                return;
            }
        }
        if (goVar == null) {
            this.f47914b.f47912a.mo32854q().f48448e.mo33376a("Install Referrer Service implementation was not found");
            return;
        }
        this.f47914b.f47912a.mo32854q().f48451h.mo33376a("Install Referrer Service connected");
        this.f47914b.f47912a.mo32853p().mo32912a((Runnable) new C16994an(this, goVar, this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f47914b.f47912a.mo32854q().f48451h.mo33376a("Install Referrer Service disconnected");
    }
}
