package com.bytedance.android.livesdk.gift.p357e;

import android.os.SystemClock;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7514m;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.e.i */
final /* synthetic */ class C7324i implements C1710e {

    /* renamed from: a */
    private final C7315f f19951a;

    /* renamed from: b */
    private final long f19952b;

    /* renamed from: c */
    private final long f19953c;

    C7324i(C7315f fVar, long j, long j2) {
        this.f19951a = fVar;
        this.f19952b = j;
        this.f19953c = j2;
    }

    public final void accept(Object obj) {
        C7315f fVar = this.f19951a;
        long j = this.f19952b;
        long j2 = this.f19953c;
        fVar.mo13563a((C7514m) ((C4177d) obj).data);
        C7647s.m15648a(j, fVar.f19912a.getId(), SystemClock.uptimeMillis() - j2);
    }
}
