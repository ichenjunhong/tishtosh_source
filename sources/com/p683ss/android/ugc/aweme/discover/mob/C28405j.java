package com.p683ss.android.ugc.aweme.discover.mob;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.j */
final /* synthetic */ class C28405j implements Callable {

    /* renamed from: a */
    private final String f74620a;

    /* renamed from: b */
    private final int f74621b;

    C28405j(String str, int i) {
        this.f74620a = str;
        this.f74621b = i;
    }

    public final Object call() {
        return C26890h.m65012a("category_tab_show", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", "discovery").mo47829a("tab_name", this.f74620a).mo47826a("order", this.f74621b).f61491a));
    }
}
