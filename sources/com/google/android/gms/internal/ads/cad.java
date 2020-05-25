package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;

public final class cad extends cae<C15795c> {

    /* renamed from: a */
    private final /* synthetic */ Context f44754a;

    /* renamed from: b */
    private final /* synthetic */ String f44755b;

    /* renamed from: c */
    private final /* synthetic */ C16134on f44756c;

    /* renamed from: d */
    private final /* synthetic */ bzy f44757d;

    public cad(bzy bzy, Context context, String str, C16134on onVar) {
        this.f44757d = bzy;
        this.f44754a = context;
        this.f44755b = str;
        this.f44756c = onVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo30884a() {
        bzy.m37057a(this.f44754a, "native_ad");
        return new C15676ay();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo30886b() throws RemoteException {
        return this.f44757d.f44721a.mo30876a(this.f44754a, this.f44755b, this.f44756c);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30885a(C16228s sVar) throws RemoteException {
        return sVar.mo27432a(C14886d.m30544a(this.f44754a), this.f44755b, this.f44756c, 15302000);
    }
}
