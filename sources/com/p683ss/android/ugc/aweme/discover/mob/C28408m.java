package com.p683ss.android.ugc.aweme.discover.mob;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.m */
final /* synthetic */ class C28408m implements Callable {

    /* renamed from: a */
    private final String f74625a;

    /* renamed from: b */
    private final String f74626b;

    /* renamed from: c */
    private final String f74627c;

    /* renamed from: d */
    private final String f74628d;

    /* renamed from: e */
    private final int f74629e;

    /* renamed from: f */
    private final LogPbBean f74630f;

    C28408m(String str, String str2, String str3, String str4, int i, LogPbBean logPbBean) {
        this.f74625a = str;
        this.f74626b = str2;
        this.f74627c = str3;
        this.f74628d = str4;
        this.f74629e = i;
        this.f74630f = logPbBean;
    }

    public final Object call() {
        return C26890h.m65012a("playlist_show", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", this.f74625a).mo47829a("playlist_type", this.f74626b).mo47829a("playlist_id", this.f74627c).mo47829a("group_id", this.f74628d).mo47826a("order", this.f74629e).mo47829a("log_pb", new C17971f().mo34889b(this.f74630f)).f61491a));
    }
}
