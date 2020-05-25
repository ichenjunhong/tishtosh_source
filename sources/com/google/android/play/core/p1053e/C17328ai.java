package com.google.android.play.core.p1053e;

import android.os.RemoteException;
import com.google.android.play.core.p1051c.C17254ad;
import com.google.android.play.core.p1051c.C17255ae;
import com.google.android.play.core.p1051c.C17281bc;
import com.google.android.play.core.p1056f.C17374l;

/* renamed from: com.google.android.play.core.e.ai */
final class C17328ai extends C17281bc {

    /* renamed from: b */
    private final /* synthetic */ int f48816b;

    /* renamed from: c */
    private final /* synthetic */ C17374l f48817c;

    /* renamed from: d */
    private final /* synthetic */ C17325af f48818d;

    C17328ai(C17325af afVar, C17374l lVar, int i, C17374l lVar2) {
        this.f48818d = afVar;
        this.f48816b = i;
        this.f48817c = lVar2;
        super(lVar);
    }

    /* renamed from: a */
    public final void mo33509a() {
        try {
            ((C17254ad) this.f48818d.f48807b.f48760k).mo33528a(this.f48818d.f48808d, this.f48816b, C17325af.m42418a(), (C17255ae) new C17345j(this.f48818d, this.f48817c));
        } catch (RemoteException e) {
            C17325af.f48805a.mo33686a((Throwable) e, "cancelInstall(%d)", Integer.valueOf(this.f48816b));
            this.f48817c.mo33666a((Exception) new RuntimeException(e));
        }
    }
}
