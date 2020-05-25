package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C16596cm.C16597a;

/* renamed from: com.google.android.gms.internal.measurement.cp */
public final class C16602cp extends C16598b {

    /* renamed from: c */
    private final /* synthetic */ String f46644c;

    /* renamed from: d */
    private final /* synthetic */ String f46645d;

    /* renamed from: e */
    private final /* synthetic */ C16597a f46646e;

    /* renamed from: f */
    private final /* synthetic */ C16596cm f46647f;

    public C16602cp(C16596cm cmVar, String str, String str2, C16597a aVar) {
        this.f46647f = cmVar;
        this.f46644c = str;
        this.f46645d = str2;
        this.f46646e = aVar;
        super(cmVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31905b() throws RemoteException {
        this.f46647f.f46624g.mo31881a(this.f46644c, this.f46645d, (C16593cj) this.f46646e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31904a() {
        this.f46646e.mo31892a((Bundle) null);
    }
}
