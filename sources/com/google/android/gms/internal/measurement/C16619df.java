package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;

/* renamed from: com.google.android.gms.internal.measurement.df */
final class C16619df extends C16598b {

    /* renamed from: c */
    private final /* synthetic */ Activity f46701c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f46702d;

    /* renamed from: e */
    private final /* synthetic */ C16599c f46703e;

    C16619df(C16599c cVar, Activity activity, Bundle bundle) {
        this.f46703e = cVar;
        this.f46701c = activity;
        this.f46702d = bundle;
        super(C16596cm.this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31905b() throws RemoteException {
        C16596cm.this.f46624g.mo31871a(C14886d.m30544a(this.f46701c), this.f46702d, this.f46631b);
    }
}
