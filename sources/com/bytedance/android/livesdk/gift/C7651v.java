package com.bytedance.android.livesdk.gift;

import android.os.SystemClock;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.C7649u.C7650a;
import com.bytedance.android.livesdk.gift.model.C7513l;
import com.bytedance.android.livesdk.gift.model.Prop;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.v */
final /* synthetic */ class C7651v implements C1710e {

    /* renamed from: a */
    private final C7649u f21079a;

    /* renamed from: b */
    private final long f21080b;

    C7651v(C7649u uVar, long j) {
        this.f21079a = uVar;
        this.f21080b = j;
    }

    public final void accept(Object obj) {
        C7649u uVar = this.f21079a;
        long j = this.f21080b;
        C4177d dVar = (C4177d) obj;
        uVar.f21076a.clear();
        uVar.f21076a.addAll(((C7513l) dVar.data).f20608a);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = dVar.extra.now;
        for (Prop nowTimeDiff : uVar.f21076a) {
            nowTimeDiff.setNowTimeDiff((j2 - currentTimeMillis) / 1000);
        }
        for (C7650a a : uVar.f21077b) {
            a.mo13539a(uVar.f21076a);
        }
        C3837e.m9740a(C7647s.m15643a("ttlive_prop_list_status"), 0, SystemClock.uptimeMillis() - j);
    }
}
