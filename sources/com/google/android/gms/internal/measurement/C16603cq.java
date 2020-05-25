package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;

/* renamed from: com.google.android.gms.internal.measurement.cq */
public final class C16603cq extends C16598b {

    /* renamed from: c */
    private final /* synthetic */ Activity f46648c;

    /* renamed from: d */
    private final /* synthetic */ String f46649d;

    /* renamed from: e */
    private final /* synthetic */ String f46650e;

    /* renamed from: f */
    private final /* synthetic */ C16596cm f46651f;

    public C16603cq(C16596cm cmVar, Activity activity, String str, String str2) {
        this.f46651f = cmVar;
        this.f46648c = activity;
        this.f46649d = str;
        this.f46650e = str2;
        super(cmVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31905b() throws RemoteException {
        this.f46651f.f46624g.mo31874a(C14886d.m30544a(this.f46648c), this.f46649d, this.f46650e, this.f46630a);
    }
}
