package com.p683ss.android.ugc.aweme.feed.p1719e;

import com.p683ss.android.ugc.aweme.feed.p1736ui.VideoFloatingCard.C30732c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.VideoFloatingCard.C30733d;

/* renamed from: com.ss.android.ugc.aweme.feed.e.h */
public final /* synthetic */ class C30193h implements Runnable {

    /* renamed from: a */
    private final C30188c f78793a;

    /* renamed from: b */
    private final long f78794b;

    public C30193h(C30188c cVar, long j) {
        this.f78793a = cVar;
        this.f78794b = j;
    }

    public final void run() {
        C30188c cVar = this.f78793a;
        cVar.f78782b.animate().translationX(0.0f).alpha(1.0f).withStartAction(new C30732c(null)).setDuration(this.f78794b).withEndAction(new C30733d(null)).start();
    }
}
