package com.p683ss.android.ugc.aweme.report.p2113a;

import android.os.MessageQueue.IdleHandler;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;

/* renamed from: com.ss.android.ugc.aweme.report.a.b */
final /* synthetic */ class C41205b implements IdleHandler {

    /* renamed from: a */
    private final C41202a f104645a;

    C41205b(C41202a aVar) {
        this.f104645a = aVar;
    }

    public final boolean queueIdle() {
        C41202a aVar = this.f104645a;
        if (System.currentTimeMillis() > aVar.f104643c) {
            if (aVar.f104641a.size() >= 20) {
                C24076h.m58904e().execute(new C41206c(aVar));
            }
            aVar.f104643c = System.currentTimeMillis() + ((long) aVar.f104642b);
        }
        return true;
    }
}
