package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.model.Prop;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.ac */
final /* synthetic */ class C7529ac implements C1710e {

    /* renamed from: a */
    private final C7547n f20682a;

    /* renamed from: b */
    private final long f20683b;

    /* renamed from: c */
    private final long f20684c;

    C7529ac(C7547n nVar, long j, long j2) {
        this.f20682a = nVar;
        this.f20683b = j;
        this.f20684c = j2;
    }

    public final void accept(Object obj) {
        C7547n nVar = this.f20682a;
        long j = this.f20683b;
        long j2 = this.f20684c;
        C4177d dVar = (C4177d) obj;
        C7514m mVar = (C7514m) dVar.data;
        long j3 = dVar.extra.now;
        long currentTimeMillis = System.currentTimeMillis();
        for (Prop nowTimeDiff : mVar.f20623o) {
            nowTimeDiff.setNowTimeDiff((j3 - currentTimeMillis) / 1000);
        }
        nVar.mo13939a(mVar);
        C7647s.m15653b(j, nVar.f20706a.getId(), SystemClock.uptimeMillis() - j2);
    }
}
