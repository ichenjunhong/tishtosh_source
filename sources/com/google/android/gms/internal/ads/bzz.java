package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;

public final class bzz extends cae<C15931h> {

    /* renamed from: a */
    private final /* synthetic */ Context f44729a;

    /* renamed from: b */
    private final /* synthetic */ zzyz f44730b;

    /* renamed from: c */
    private final /* synthetic */ String f44731c;

    /* renamed from: d */
    private final /* synthetic */ C16134on f44732d;

    /* renamed from: e */
    private final /* synthetic */ bzy f44733e;

    public bzz(bzy bzy, Context context, zzyz zzyz, String str, C16134on onVar) {
        this.f44733e = bzy;
        this.f44729a = context;
        this.f44730b = zzyz;
        this.f44731c = str;
        this.f44732d = onVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30884a() {
        bzy.m37057a(this.f44729a, "banner");
        return new C15686bc();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo30886b() throws RemoteException {
        return this.f44733e.f44723c.mo30877a(this.f44729a, this.f44730b, this.f44731c, this.f44732d, 1);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30885a(C16228s sVar) throws RemoteException {
        return sVar.mo27436a(C14886d.m30544a(this.f44729a), this.f44730b, this.f44731c, this.f44732d, 15302000);
    }
}
