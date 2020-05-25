package com.bytedance.android.livesdk.gift.panel;

import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.panel.C7547n.C7549a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.panel.w */
final /* synthetic */ class C7558w implements C1710e {

    /* renamed from: a */
    private final C7547n f20732a;

    /* renamed from: b */
    private final long f20733b;

    C7558w(C7547n nVar, long j) {
        this.f20732a = nVar;
        this.f20733b = j;
    }

    public final void accept(Object obj) {
        C7547n nVar = this.f20732a;
        long j = this.f20733b;
        Throwable th = (Throwable) obj;
        nVar.f20707b = false;
        if (nVar.mo8518c() != null) {
            ((C7549a) nVar.mo8518c()).mo13935d((Exception) th);
        }
        C7647s.m15649a(j, nVar.f20706a.getId(), th);
    }
}
