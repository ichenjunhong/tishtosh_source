package com.bytedance.android.livesdk.gift.panel;

import android.os.SystemClock;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.panel.C7547n.C7549a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.v */
final /* synthetic */ class C7557v implements C1710e {

    /* renamed from: a */
    private final C7547n f20729a;

    /* renamed from: b */
    private final long f20730b;

    /* renamed from: c */
    private final long f20731c;

    C7557v(C7547n nVar, long j, long j2) {
        this.f20729a = nVar;
        this.f20730b = j;
        this.f20731c = j2;
    }

    public final void accept(Object obj) {
        C7547n nVar = this.f20729a;
        long j = this.f20730b;
        long j2 = this.f20731c;
        C4177d dVar = (C4177d) obj;
        if (nVar.mo8518c() != null) {
            ((C7549a) nVar.mo8518c()).mo13932b((C7514m) dVar.data);
        }
        C7647s.m15648a(j, nVar.f20706a.getId(), SystemClock.uptimeMillis() - j2);
    }
}
