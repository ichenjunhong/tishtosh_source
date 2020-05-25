package com.google.android.play.core.p1048a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.p1051c.C17277az;
import com.google.android.play.core.p1056f.C17374l;
import com.google.android.play.core.splitcompat.C17384b;

/* renamed from: com.google.android.play.core.a.j */
class C17240j<T> extends C17277az {

    /* renamed from: a */
    final C17374l<T> f48698a;

    /* renamed from: b */
    private final C17384b f48699b;

    /* renamed from: c */
    private final /* synthetic */ C17236f f48700c;

    C17240j(C17236f fVar, C17384b bVar, C17374l<T> lVar) {
        this.f48700c = fVar;
        this.f48699b = bVar;
        this.f48698a = lVar;
    }

    /* renamed from: a */
    public void mo33511a(Bundle bundle) throws RemoteException {
        this.f48700c.f48690b.mo33587a();
        this.f48699b.mo33685a("onRequestInfo", new Object[0]);
    }

    /* renamed from: b */
    public void mo33512b(Bundle bundle) throws RemoteException {
        this.f48700c.f48690b.mo33587a();
        this.f48699b.mo33685a("onCompleteUpdate", new Object[0]);
    }
}
