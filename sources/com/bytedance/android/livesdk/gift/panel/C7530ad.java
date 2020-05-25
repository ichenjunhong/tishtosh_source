package com.bytedance.android.livesdk.gift.panel;

import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.panel.C7547n.C7549a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.ad */
final /* synthetic */ class C7530ad implements C1710e {

    /* renamed from: a */
    private final C7547n f20685a;

    /* renamed from: b */
    private final long f20686b;

    C7530ad(C7547n nVar, long j) {
        this.f20685a = nVar;
        this.f20686b = j;
    }

    public final void accept(Object obj) {
        C7547n nVar = this.f20685a;
        long j = this.f20686b;
        Throwable th = (Throwable) obj;
        nVar.f20707b = false;
        if (th instanceof Exception) {
            ((C7549a) nVar.mo8518c()).mo13931a((Exception) th);
        }
        C7647s.m15654b(j, nVar.f20706a.getId(), th);
    }
}
