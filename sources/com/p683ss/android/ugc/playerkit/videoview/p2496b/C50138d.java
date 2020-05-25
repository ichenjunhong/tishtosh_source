package com.p683ss.android.ugc.playerkit.videoview.p2496b;

import com.p683ss.android.ugc.aweme.player.sdk.impl.C38893c;
import com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38869h;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;

/* renamed from: com.ss.android.ugc.playerkit.videoview.b.d */
public final class C50138d {

    /* renamed from: a */
    static C50138d f125642a = new C50138d();

    /* renamed from: b */
    private C38869h f125643b;

    /* renamed from: c */
    private C50116c f125644c;

    /* renamed from: a */
    public final synchronized C38869h mo97930a(C50116c cVar) {
        if (this.f125643b == null) {
            this.f125644c = cVar;
            this.f125643b = new C38893c(new C38900d(cVar));
        } else if (this.f125644c != null && !this.f125644c.equals(cVar)) {
            this.f125643b.mo78910f();
            this.f125644c = cVar;
            this.f125643b = new C38893c(new C38900d(cVar));
        }
        return this.f125643b;
    }
}
