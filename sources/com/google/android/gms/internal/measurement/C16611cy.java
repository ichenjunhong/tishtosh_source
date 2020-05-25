package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C16596cm.C16597a;

/* renamed from: com.google.android.gms.internal.measurement.cy */
public final class C16611cy extends C16598b {

    /* renamed from: c */
    private final /* synthetic */ String f46666c;

    /* renamed from: d */
    private final /* synthetic */ String f46667d;

    /* renamed from: e */
    private final /* synthetic */ boolean f46668e;

    /* renamed from: f */
    private final /* synthetic */ C16597a f46669f;

    /* renamed from: g */
    private final /* synthetic */ C16596cm f46670g;

    public C16611cy(C16596cm cmVar, String str, String str2, boolean z, C16597a aVar) {
        this.f46670g = cmVar;
        this.f46666c = str;
        this.f46667d = str2;
        this.f46668e = z;
        this.f46669f = aVar;
        super(cmVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31905b() throws RemoteException {
        this.f46670g.f46624g.mo31882a(this.f46666c, this.f46667d, this.f46668e, (C16593cj) this.f46669f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31904a() {
        this.f46669f.mo31892a((Bundle) null);
    }
}
