package com.p683ss.android.ugc.aweme.shortvideo.cover;

import dmt.p2652av.video.C53030y;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.g */
final /* synthetic */ class C42551g implements Runnable {

    /* renamed from: a */
    private final C42545e f107615a;

    /* renamed from: b */
    private final long f107616b;

    C42551g(C42545e eVar, long j) {
        this.f107615a = eVar;
        this.f107616b = j;
    }

    public final void run() {
        C42545e eVar = this.f107615a;
        long j = this.f107616b;
        eVar.f107605k = false;
        eVar.f107603i.mo86773b().setValue(C53030y.m112775b(j));
        eVar.mo86766a(j);
    }
}
