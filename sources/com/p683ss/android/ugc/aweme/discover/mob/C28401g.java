package com.p683ss.android.ugc.aweme.discover.mob;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.g */
public final /* synthetic */ class C28401g implements Callable {

    /* renamed from: a */
    private final String f74593a;

    /* renamed from: b */
    private final String f74594b;

    /* renamed from: c */
    private final String f74595c;

    /* renamed from: d */
    private final String f74596d;

    /* renamed from: e */
    private final String f74597e;

    /* renamed from: f */
    private final int f74598f;

    /* renamed from: g */
    private final LogPbBean f74599g;

    public C28401g(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        this.f74593a = str;
        this.f74594b = str2;
        this.f74595c = str3;
        this.f74596d = str4;
        this.f74597e = str5;
        this.f74598f = i;
        this.f74599g = logPbBean;
    }

    public final Object call() {
        return C26890h.m65012a("video_play", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", this.f74593a).mo47829a("tab_name", this.f74594b).mo47826a("is_auto_play", 1).mo47829a("playlist_type", this.f74595c).mo47829a("playlist_id", this.f74596d).mo47829a("group_id", this.f74597e).mo47826a("order", this.f74598f).mo47829a("log_pb", new C17971f().mo34889b(this.f74599g)).f61491a));
    }
}
