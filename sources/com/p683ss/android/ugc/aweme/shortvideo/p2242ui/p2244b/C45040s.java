package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b;

import com.p683ss.android.ugc.asve.recorder.C20420b.C20422b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.s */
final /* synthetic */ class C45040s implements Runnable {

    /* renamed from: a */
    private final C45017b f114079a;

    C45040s(C45017b bVar) {
        this.f114079a = bVar;
    }

    public final void run() {
        C45017b bVar = this.f114079a;
        if (bVar.f114040r.getMode() == C20422b.DUET || bVar.f114040r.getMode() == C20422b.REACTION) {
            bVar.f113988F = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(bVar.f114040r.getMode());
        sb.append(" video complete callback");
        C32458a.m75144a(sb.toString());
    }
}
