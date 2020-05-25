package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.dc */
public final class C16616dc extends C16598b {

    /* renamed from: c */
    private final /* synthetic */ Long f46687c;

    /* renamed from: d */
    private final /* synthetic */ String f46688d;

    /* renamed from: e */
    private final /* synthetic */ String f46689e;

    /* renamed from: f */
    private final /* synthetic */ Bundle f46690f;

    /* renamed from: g */
    private final /* synthetic */ boolean f46691g = true;

    /* renamed from: h */
    private final /* synthetic */ boolean f46692h;

    /* renamed from: i */
    private final /* synthetic */ C16596cm f46693i;

    public C16616dc(C16596cm cmVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        this.f46693i = cmVar;
        this.f46687c = l;
        this.f46688d = str;
        this.f46689e = str2;
        this.f46690f = bundle;
        this.f46692h = z2;
        super(cmVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31905b() throws RemoteException {
        this.f46693i.f46624g.mo31879a(this.f46688d, this.f46689e, this.f46690f, this.f46691g, this.f46692h, this.f46687c == null ? this.f46630a : this.f46687c.longValue());
    }
}
