package com.p683ss.android.ugc.aweme.discover.mob;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.e */
final /* synthetic */ class C28399e implements Callable {

    /* renamed from: a */
    private final String f74579a;

    /* renamed from: b */
    private final String f74580b;

    /* renamed from: c */
    private final String f74581c;

    /* renamed from: d */
    private final String f74582d;

    /* renamed from: e */
    private final String f74583e;

    /* renamed from: f */
    private final int f74584f;

    /* renamed from: g */
    private final LogPbBean f74585g;

    C28399e(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        this.f74579a = str;
        this.f74580b = str2;
        this.f74581c = str3;
        this.f74582d = str4;
        this.f74583e = str5;
        this.f74584f = i;
        this.f74585g = logPbBean;
    }

    public final Object call() {
        return C26890h.m65012a("playlist_show", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", this.f74579a).mo47829a("tab_name", this.f74580b).mo47829a("playlist_type", this.f74581c).mo47829a("playlist_id", this.f74582d).mo47829a("group_id", this.f74583e).mo47826a("order", this.f74584f).mo47829a("log_pb", new C17971f().mo34889b(this.f74585g)).f61491a));
    }
}
