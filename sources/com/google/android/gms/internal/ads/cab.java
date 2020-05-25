package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;

public final class cab extends cae<C15931h> {

    /* renamed from: a */
    private final /* synthetic */ Context f44745a;

    /* renamed from: b */
    private final /* synthetic */ zzyz f44746b;

    /* renamed from: c */
    private final /* synthetic */ String f44747c;

    /* renamed from: d */
    private final /* synthetic */ bzy f44748d;

    public cab(bzy bzy, Context context, zzyz zzyz, String str) {
        this.f44748d = bzy;
        this.f44745a = context;
        this.f44746b = zzyz;
        this.f44747c = str;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30884a() {
        bzy.m37057a(this.f44745a, "search");
        return new C15686bc();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo30886b() throws RemoteException {
        return this.f44748d.f44723c.mo30877a(this.f44745a, this.f44746b, this.f44747c, null, 3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30885a(C16228s sVar) throws RemoteException {
        return sVar.mo27435a(C14886d.m30544a(this.f44745a), this.f44746b, this.f44747c, 15302000);
    }
}
