package com.bytedance.android.livesdk.gift.panel;

import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.panel.C7547n.C7549a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.p */
final /* synthetic */ class C7551p implements C1710e {

    /* renamed from: a */
    private final C7547n f20717a;

    /* renamed from: b */
    private final long f20718b;

    /* renamed from: c */
    private final C7505d f20719c;

    /* renamed from: d */
    private final int f20720d;

    C7551p(C7547n nVar, long j, C7505d dVar, int i) {
        this.f20717a = nVar;
        this.f20718b = j;
        this.f20719c = dVar;
        this.f20720d = i;
    }

    public final void accept(Object obj) {
        C7547n nVar = this.f20717a;
        long j = this.f20718b;
        C7505d dVar = this.f20719c;
        int i = this.f20720d;
        Throwable th = (Throwable) obj;
        nVar.f20707b = false;
        if (nVar.mo8518c() != null) {
            ((C7549a) nVar.mo8518c()).mo13931a((Exception) th);
        }
        C7647s.m15649a(j, nVar.f20706a.getId(), th);
        if (dVar != null && dVar.f20539H) {
            C7647s.m15647a(j, nVar.f20706a.getId(), i, "gift_panel", th);
        }
    }
}
