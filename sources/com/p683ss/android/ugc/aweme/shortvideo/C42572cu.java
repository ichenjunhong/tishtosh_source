package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cu */
final /* synthetic */ class C42572cu implements Runnable {

    /* renamed from: a */
    private final C42562ct f107666a;

    C42572cu(C42562ct ctVar) {
        this.f107666a = ctVar;
    }

    public final void run() {
        C42562ct ctVar = this.f107666a;
        if (ctVar.f107649o == null) {
            ctVar.f107649o = (C49607a) ctVar.mo86790c().mo23374b(C49607a.class);
        }
        C49607a aVar = ctVar.f107649o;
        if (aVar != null) {
            aVar.mo97519a(true);
        }
    }
}
