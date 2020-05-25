package com.p683ss.android.ugc.aweme.discover.mob;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.f */
final /* synthetic */ class C28400f implements Callable {

    /* renamed from: a */
    private final String f74586a;

    /* renamed from: b */
    private final String f74587b;

    /* renamed from: c */
    private final String f74588c;

    /* renamed from: d */
    private final String f74589d;

    /* renamed from: e */
    private final String f74590e;

    /* renamed from: f */
    private final int f74591f;

    /* renamed from: g */
    private final LogPbBean f74592g;

    C28400f(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        this.f74586a = str;
        this.f74587b = str2;
        this.f74588c = str3;
        this.f74589d = str4;
        this.f74590e = str5;
        this.f74591f = i;
        this.f74592g = logPbBean;
    }

    public final Object call() {
        return C26890h.m65012a("enter_playlist", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", this.f74586a).mo47829a("tab_name", this.f74587b).mo47829a("playlist_type", this.f74588c).mo47829a("playlist_id", this.f74589d).mo47829a("group_id", this.f74590e).mo47826a("order", this.f74591f).mo47829a("log_pb", new C17971f().mo34889b(this.f74592g)).f61491a));
    }
}
