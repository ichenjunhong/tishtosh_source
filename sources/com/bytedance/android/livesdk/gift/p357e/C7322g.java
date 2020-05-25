package com.bytedance.android.livesdk.gift.p357e;

import android.os.SystemClock;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.model.Prop;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.e.g */
final /* synthetic */ class C7322g implements C1710e {

    /* renamed from: a */
    private final C7315f f19944a;

    /* renamed from: b */
    private final long f19945b;

    /* renamed from: c */
    private final long f19946c;

    /* renamed from: d */
    private final long f19947d;

    C7322g(C7315f fVar, long j, long j2, long j3) {
        this.f19944a = fVar;
        this.f19945b = j;
        this.f19946c = j2;
        this.f19947d = j3;
    }

    public final void accept(Object obj) {
        C7315f fVar = this.f19944a;
        long j = this.f19945b;
        long j2 = this.f19946c;
        long j3 = this.f19947d;
        C4177d dVar = (C4177d) obj;
        C7514m mVar = (C7514m) dVar.data;
        long j4 = dVar.extra.now;
        long currentTimeMillis = System.currentTimeMillis();
        for (Prop nowTimeDiff : mVar.f20623o) {
            long j5 = j4;
            nowTimeDiff.setNowTimeDiff((j4 - currentTimeMillis) / 1000);
            j4 = j5;
        }
        fVar.mo13563a(mVar);
        C7647s.m15653b(j, j2, SystemClock.uptimeMillis() - j3);
    }
}
