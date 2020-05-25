package com.google.android.play.core.p1048a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.p1051c.C17275ax;
import com.google.android.play.core.p1051c.C17281bc;
import com.google.android.play.core.p1056f.C17374l;

/* renamed from: com.google.android.play.core.a.h */
final class C17238h extends C17281bc {

    /* renamed from: b */
    private final /* synthetic */ String f48694b;

    /* renamed from: c */
    private final /* synthetic */ C17374l f48695c;

    /* renamed from: d */
    private final /* synthetic */ C17236f f48696d;

    C17238h(C17236f fVar, C17374l lVar, String str, C17374l lVar2) {
        this.f48696d = fVar;
        this.f48694b = str;
        this.f48695c = lVar2;
        super(lVar);
    }

    /* renamed from: a */
    public final void mo33509a() {
        try {
            C17275ax axVar = (C17275ax) this.f48696d.f48690b.f48760k;
            String a = this.f48696d.f48691d;
            C17236f fVar = this.f48696d;
            String str = this.f48694b;
            Bundle bundle = new Bundle();
            bundle.putAll(C17236f.m42217a());
            bundle.putString("package.name", str);
            Integer b = fVar.mo33507b();
            if (b != null) {
                bundle.putInt("app.version.code", b.intValue());
            }
            axVar.mo33580a(a, bundle, new C17242l(this.f48696d, this.f48695c, this.f48694b));
        } catch (RemoteException e) {
            C17236f.f48688a.mo33686a((Throwable) e, "requestUpdateInfo(%s)", this.f48694b);
            this.f48695c.mo33666a((Exception) new RuntimeException(e));
        }
    }
}
