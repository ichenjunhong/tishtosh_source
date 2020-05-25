package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;

/* renamed from: com.google.android.gms.internal.measurement.dl */
final class C16625dl extends C16598b {

    /* renamed from: c */
    private final /* synthetic */ Activity f46715c;

    /* renamed from: d */
    private final /* synthetic */ C16599c f46716d;

    C16625dl(C16599c cVar, Activity activity) {
        this.f46716d = cVar;
        this.f46715c = activity;
        super(C16596cm.this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31905b() throws RemoteException {
        C16596cm.this.f46624g.mo31886c(C14886d.m30544a(this.f46715c), this.f46631b);
    }
}
