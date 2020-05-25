package com.p683ss.android.ugc.aweme.discover.mob;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.t */
final /* synthetic */ class C28415t implements Callable {

    /* renamed from: a */
    private final String f74661a;

    /* renamed from: b */
    private final int f74662b;

    /* renamed from: c */
    private final LogPbBean f74663c;

    C28415t(String str, int i, LogPbBean logPbBean) {
        this.f74661a = str;
        this.f74662b = i;
        this.f74663c = logPbBean;
    }

    public final Object call() {
        return C26890h.m65012a("show_category", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", "discovery").mo47829a("discovery_category", this.f74661a).mo47826a("order", this.f74662b).mo47829a("log_pb", new C17971f().mo34889b(this.f74663c)).f61491a));
    }
}
