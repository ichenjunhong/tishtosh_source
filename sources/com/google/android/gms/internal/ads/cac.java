package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;

final class cac extends cae<C15931h> {

    /* renamed from: a */
    private final /* synthetic */ Context f44749a;

    /* renamed from: b */
    private final /* synthetic */ zzyz f44750b;

    /* renamed from: c */
    private final /* synthetic */ String f44751c;

    /* renamed from: d */
    private final /* synthetic */ C16134on f44752d;

    /* renamed from: e */
    private final /* synthetic */ bzy f44753e;

    cac(bzy bzy, Context context, zzyz zzyz, String str, C16134on onVar) {
        this.f44753e = bzy;
        this.f44749a = context;
        this.f44750b = zzyz;
        this.f44751c = str;
        this.f44752d = onVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30884a() {
        bzy.m37057a(this.f44749a, "interstitial");
        return new C15686bc();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo30886b() throws RemoteException {
        return this.f44753e.f44723c.mo30877a(this.f44749a, this.f44750b, this.f44751c, this.f44752d, 2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30885a(C16228s sVar) throws RemoteException {
        return sVar.mo27440b(C14886d.m30544a(this.f44749a), this.f44750b, this.f44751c, this.f44752d, 15302000);
    }
}
