package com.p683ss.android.ugc.aweme.discover.p1659ui;

import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28107o;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bg */
final /* synthetic */ class C28547bg implements Runnable {

    /* renamed from: a */
    private final C28541bb f75018a;

    /* renamed from: b */
    private final C28107o f75019b;

    C28547bg(C28541bb bbVar, C28107o oVar) {
        this.f75018a = bbVar;
        this.f75019b = oVar;
    }

    public final void run() {
        C28541bb bbVar = this.f75018a;
        C28107o oVar = this.f75019b;
        if (bbVar.f75002b != null) {
            C28381ab.m67352a(true);
            C28381ab.m67356b(true);
            C28381ab.m67358c(true);
            bbVar.f75002b.setCurrentItem(oVar.f73797a);
        }
    }
}
