package com.bytedance.android.livesdk.gift.p357e;

import com.bytedance.android.livesdk.gift.C7647s;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.e.h */
final /* synthetic */ class C7323h implements C1710e {

    /* renamed from: a */
    private final C7315f f19948a;

    /* renamed from: b */
    private final long f19949b;

    /* renamed from: c */
    private final long f19950c;

    C7323h(C7315f fVar, long j, long j2) {
        this.f19948a = fVar;
        this.f19949b = j;
        this.f19950c = j2;
    }

    public final void accept(Object obj) {
        C7315f fVar = this.f19948a;
        long j = this.f19949b;
        long j2 = this.f19950c;
        Throwable th = (Throwable) obj;
        if (th instanceof Exception) {
            fVar.mo13564a((Exception) th);
        }
        C7647s.m15654b(j, j2, th);
    }
}
