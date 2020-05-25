package com.p683ss.android.ugc.aweme.discover.mob;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.l */
public final /* synthetic */ class C28407l implements Callable {

    /* renamed from: a */
    private final String f74623a;

    /* renamed from: b */
    private final int f74624b;

    public C28407l(String str, int i) {
        this.f74623a = str;
        this.f74624b = i;
    }

    public final Object call() {
        return C26890h.m65012a("cell_show", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", "discovery_trending").mo47829a("tag_id", this.f74623a).mo47826a("order", this.f74624b).f61491a));
    }
}
