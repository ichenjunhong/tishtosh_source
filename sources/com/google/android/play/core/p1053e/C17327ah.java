package com.google.android.play.core.p1053e;

import android.os.RemoteException;
import com.google.android.play.core.p1051c.C17254ad;
import com.google.android.play.core.p1051c.C17281bc;
import com.google.android.play.core.p1056f.C17374l;

/* renamed from: com.google.android.play.core.e.ah */
final class C17327ah extends C17281bc {

    /* renamed from: b */
    private final /* synthetic */ int f48813b;

    /* renamed from: c */
    private final /* synthetic */ C17374l f48814c;

    /* renamed from: d */
    private final /* synthetic */ C17325af f48815d;

    C17327ah(C17325af afVar, C17374l lVar, int i, C17374l lVar2) {
        this.f48815d = afVar;
        this.f48813b = i;
        this.f48814c = lVar2;
        super(lVar);
    }

    /* renamed from: a */
    public final void mo33509a() {
        try {
            ((C17254ad) this.f48815d.f48807b.f48760k).mo33529a(this.f48815d.f48808d, this.f48813b, new C17346k(this.f48815d, this.f48814c));
        } catch (RemoteException e) {
            C17325af.f48805a.mo33686a((Throwable) e, "getSessionState(%d)", Integer.valueOf(this.f48813b));
            this.f48814c.mo33666a((Exception) new RuntimeException(e));
        }
    }
}
