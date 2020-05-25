package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;

/* renamed from: com.google.android.gms.internal.measurement.cz */
final class C16612cz extends C16598b {

    /* renamed from: c */
    private final /* synthetic */ int f46671c = 5;

    /* renamed from: d */
    private final /* synthetic */ String f46672d;

    /* renamed from: e */
    private final /* synthetic */ Object f46673e;

    /* renamed from: f */
    private final /* synthetic */ Object f46674f;

    /* renamed from: g */
    private final /* synthetic */ Object f46675g;

    /* renamed from: h */
    private final /* synthetic */ C16596cm f46676h;

    C16612cz(C16596cm cmVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f46676h = cmVar;
        this.f46672d = str;
        this.f46673e = obj;
        this.f46674f = obj2;
        this.f46675g = obj3;
        super(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31905b() throws RemoteException {
        this.f46676h.f46624g.mo31867a(this.f46671c, this.f46672d, C14886d.m30544a(this.f46673e), C14886d.m30544a(this.f46674f), C14886d.m30544a(this.f46675g));
    }
}
