package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.o */
final /* synthetic */ class C7550o implements C1710e {

    /* renamed from: a */
    private final C7547n f20712a;

    /* renamed from: b */
    private final long f20713b;

    /* renamed from: c */
    private final long f20714c;

    /* renamed from: d */
    private final C7505d f20715d;

    /* renamed from: e */
    private final int f20716e;

    C7550o(C7547n nVar, long j, long j2, C7505d dVar, int i) {
        this.f20712a = nVar;
        this.f20713b = j;
        this.f20714c = j2;
        this.f20715d = dVar;
        this.f20716e = i;
    }

    public final void accept(Object obj) {
        C7547n nVar = this.f20712a;
        long j = this.f20713b;
        long j2 = this.f20714c;
        C7505d dVar = this.f20715d;
        int i = this.f20716e;
        nVar.mo13939a((C7514m) ((C4177d) obj).data);
        C7647s.m15648a(j, nVar.f20706a.getId(), SystemClock.uptimeMillis() - j2);
        if (dVar != null && dVar.f20539H) {
            C7647s.m15646a(j, nVar.f20706a.getId(), i, "gift_panel", SystemClock.uptimeMillis() - j2);
        }
    }
}
