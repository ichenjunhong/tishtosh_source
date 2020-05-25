package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;

/* renamed from: com.google.android.gms.internal.measurement.di */
final class C16622di extends C16598b {

    /* renamed from: c */
    private final /* synthetic */ Activity f46708c;

    /* renamed from: d */
    private final /* synthetic */ C16599c f46709d;

    C16622di(C16599c cVar, Activity activity) {
        this.f46709d = cVar;
        this.f46708c = activity;
        super(C16596cm.this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31905b() throws RemoteException {
        C16596cm.this.f46624g.mo31888d(C14886d.m30544a(this.f46708c), this.f46631b);
    }
}
