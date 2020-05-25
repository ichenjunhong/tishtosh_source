package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.C14850a.C14851a;

/* renamed from: com.google.android.gms.internal.ads.px */
final class C16171px implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C14851a f45433a;

    /* renamed from: b */
    private final /* synthetic */ C16169pv f45434b;

    C16171px(C16169pv pvVar, C14851a aVar) {
        this.f45434b = pvVar;
        this.f45433a = aVar;
    }

    public final void run() {
        try {
            this.f45434b.f45430a.mo31202a(C16172py.m38624a(this.f45433a));
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }
}
