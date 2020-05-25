package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7514m;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.z */
final /* synthetic */ class C7623z implements C1710e {

    /* renamed from: a */
    private final C7547n f20960a;

    /* renamed from: b */
    private final long f20961b;

    /* renamed from: c */
    private final long f20962c;

    C7623z(C7547n nVar, long j, long j2) {
        this.f20960a = nVar;
        this.f20961b = j;
        this.f20962c = j2;
    }

    public final void accept(Object obj) {
        C7547n nVar = this.f20960a;
        long j = this.f20961b;
        long j2 = this.f20962c;
        nVar.mo13939a((C7514m) ((C4177d) obj).data);
        C7647s.m15648a(j, nVar.f20706a.getId(), SystemClock.uptimeMillis() - j2);
    }
}
