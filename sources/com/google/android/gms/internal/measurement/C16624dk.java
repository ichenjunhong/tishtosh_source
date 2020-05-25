package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C16596cm.C16597a;
import com.google.android.gms.p1027a.C14886d;

/* renamed from: com.google.android.gms.internal.measurement.dk */
final class C16624dk extends C16598b {

    /* renamed from: c */
    private final /* synthetic */ Activity f46712c;

    /* renamed from: d */
    private final /* synthetic */ C16597a f46713d;

    /* renamed from: e */
    private final /* synthetic */ C16599c f46714e;

    C16624dk(C16599c cVar, Activity activity, C16597a aVar) {
        this.f46714e = cVar;
        this.f46712c = activity;
        this.f46713d = aVar;
        super(C16596cm.this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31905b() throws RemoteException {
        C16596cm.this.f46624g.mo31872a(C14886d.m30544a(this.f46712c), (C16593cj) this.f46713d, this.f46631b);
    }
}
