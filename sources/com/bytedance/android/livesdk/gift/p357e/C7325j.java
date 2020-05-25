package com.bytedance.android.livesdk.gift.p357e;

import com.bytedance.android.livesdk.gift.C7647s;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.e.j */
final /* synthetic */ class C7325j implements C1710e {

    /* renamed from: a */
    private final C7315f f19954a;

    /* renamed from: b */
    private final long f19955b;

    C7325j(C7315f fVar, long j) {
        this.f19954a = fVar;
        this.f19955b = j;
    }

    public final void accept(Object obj) {
        C7315f fVar = this.f19954a;
        long j = this.f19955b;
        Throwable th = (Throwable) obj;
        if (th instanceof Exception) {
            fVar.mo13564a((Exception) th);
        }
        C7647s.m15649a(j, fVar.f19912a.getId(), th);
    }
}
