package com.google.android.play.core.p1048a;

import android.os.RemoteException;
import com.google.android.play.core.p1051c.C17275ax;
import com.google.android.play.core.p1051c.C17281bc;
import com.google.android.play.core.p1056f.C17374l;

/* renamed from: com.google.android.play.core.a.k */
final class C17241k extends C17281bc {

    /* renamed from: b */
    private final /* synthetic */ C17374l f48701b;

    /* renamed from: c */
    private final /* synthetic */ String f48702c;

    /* renamed from: d */
    private final /* synthetic */ C17236f f48703d;

    C17241k(C17236f fVar, C17374l lVar, C17374l lVar2, String str) {
        this.f48703d = fVar;
        this.f48701b = lVar2;
        this.f48702c = str;
        super(lVar);
    }

    /* renamed from: a */
    public final void mo33509a() {
        try {
            ((C17275ax) this.f48703d.f48690b.f48760k).mo33581b(this.f48703d.f48691d, C17236f.m42217a(), new C17243m(this.f48703d, this.f48701b));
        } catch (RemoteException e) {
            C17236f.f48688a.mo33686a((Throwable) e, "completeUpdate(%s)", this.f48702c);
            this.f48701b.mo33666a((Exception) new RuntimeException(e));
        }
    }
}
