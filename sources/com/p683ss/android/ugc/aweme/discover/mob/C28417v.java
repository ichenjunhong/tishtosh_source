package com.p683ss.android.ugc.aweme.discover.mob;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.v */
public final /* synthetic */ class C28417v implements Callable {

    /* renamed from: a */
    private final String f74667a;

    /* renamed from: b */
    private final int f74668b;

    /* renamed from: c */
    private final LogPbBean f74669c;

    public C28417v(String str, int i, LogPbBean logPbBean) {
        this.f74667a = str;
        this.f74668b = i;
        this.f74669c = logPbBean;
    }

    public final Object call() {
        return C26890h.m65012a("enter_category", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", "discovery").mo47829a("discovery_category", this.f74667a).mo47826a("order", this.f74668b).mo47829a("log_pb", new C17971f().mo34889b(this.f74669c)).f61491a));
    }
}
