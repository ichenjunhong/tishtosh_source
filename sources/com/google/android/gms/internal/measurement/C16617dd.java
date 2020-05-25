package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;

/* renamed from: com.google.android.gms.internal.measurement.dd */
public final class C16617dd extends C16598b {

    /* renamed from: c */
    private final /* synthetic */ String f46694c;

    /* renamed from: d */
    private final /* synthetic */ String f46695d;

    /* renamed from: e */
    private final /* synthetic */ Object f46696e;

    /* renamed from: f */
    private final /* synthetic */ boolean f46697f = true;

    /* renamed from: g */
    private final /* synthetic */ C16596cm f46698g;

    public C16617dd(C16596cm cmVar, String str, String str2, Object obj, boolean z) {
        this.f46698g = cmVar;
        this.f46694c = str;
        this.f46695d = str2;
        this.f46696e = obj;
        super(cmVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31905b() throws RemoteException {
        this.f46698g.f46624g.mo31880a(this.f46694c, this.f46695d, C14886d.m30544a(this.f46696e), this.f46697f, this.f46630a);
    }
}
