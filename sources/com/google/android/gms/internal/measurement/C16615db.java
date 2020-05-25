package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C16596cm.C16597a;

/* renamed from: com.google.android.gms.internal.measurement.db */
public final class C16615db extends C16598b {

    /* renamed from: c */
    private final /* synthetic */ String f46684c;

    /* renamed from: d */
    private final /* synthetic */ C16597a f46685d;

    /* renamed from: e */
    private final /* synthetic */ C16596cm f46686e;

    public C16615db(C16596cm cmVar, String str, C16597a aVar) {
        this.f46686e = cmVar;
        this.f46684c = str;
        this.f46685d = aVar;
        super(cmVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31905b() throws RemoteException {
        this.f46686e.f46624g.mo31877a(this.f46684c, (C16593cj) this.f46685d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31904a() {
        this.f46685d.mo31892a((Bundle) null);
    }
}
