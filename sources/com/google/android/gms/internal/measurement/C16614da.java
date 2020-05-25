package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C16596cm.C16597a;

/* renamed from: com.google.android.gms.internal.measurement.da */
final class C16614da extends C16598b {

    /* renamed from: c */
    private final /* synthetic */ Bundle f46681c;

    /* renamed from: d */
    private final /* synthetic */ C16597a f46682d;

    /* renamed from: e */
    private final /* synthetic */ C16596cm f46683e;

    C16614da(C16596cm cmVar, Bundle bundle, C16597a aVar) {
        this.f46683e = cmVar;
        this.f46681c = bundle;
        this.f46682d = aVar;
        super(cmVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31905b() throws RemoteException {
        this.f46683e.f46624g.mo31869a(this.f46681c, (C16593cj) this.f46682d, this.f46630a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31904a() {
        this.f46682d.mo31892a((Bundle) null);
    }
}
