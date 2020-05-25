package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;

public final class caa extends cae<C16222ru> {

    /* renamed from: a */
    private final /* synthetic */ Activity f44743a;

    /* renamed from: b */
    private final /* synthetic */ bzy f44744b;

    public caa(bzy bzy, Activity activity) {
        this.f44744b = bzy;
        this.f44743a = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo30884a() {
        bzy.m37057a(this.f44743a, "ad_overlay");
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo30886b() throws RemoteException {
        return this.f44744b.f44722b.mo31374a(this.f44743a);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo30885a(C16228s sVar) throws RemoteException {
        return sVar.mo27443c(C14886d.m30544a(this.f44743a));
    }
}
