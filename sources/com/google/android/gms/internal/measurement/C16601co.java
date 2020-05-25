package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.co */
public final class C16601co extends C16598b {

    /* renamed from: c */
    private final /* synthetic */ String f46640c;

    /* renamed from: d */
    private final /* synthetic */ String f46641d;

    /* renamed from: e */
    private final /* synthetic */ Bundle f46642e;

    /* renamed from: f */
    private final /* synthetic */ C16596cm f46643f;

    public C16601co(C16596cm cmVar, String str, String str2, Bundle bundle) {
        this.f46643f = cmVar;
        this.f46640c = str;
        this.f46641d = str2;
        this.f46642e = bundle;
        super(cmVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31905b() throws RemoteException {
        this.f46643f.f46624g.mo31878a(this.f46640c, this.f46641d, this.f46642e);
    }
}
