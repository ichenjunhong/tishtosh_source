package com.p683ss.android.ugc.aweme.discover.mob;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.h */
public final /* synthetic */ class C28402h implements Callable {

    /* renamed from: a */
    private final String f74600a;

    /* renamed from: b */
    private final String f74601b;

    /* renamed from: c */
    private final String f74602c;

    /* renamed from: d */
    private final String f74603d;

    /* renamed from: e */
    private final String f74604e;

    /* renamed from: f */
    private final int f74605f;

    /* renamed from: g */
    private final LogPbBean f74606g;

    public C28402h(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        this.f74600a = str;
        this.f74601b = str2;
        this.f74602c = str3;
        this.f74603d = str4;
        this.f74604e = str5;
        this.f74605f = i;
        this.f74606g = logPbBean;
    }

    public final Object call() {
        return C26890h.m65012a("video_play_finish", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", this.f74600a).mo47829a("tab_name", this.f74601b).mo47826a("is_auto_play", 1).mo47829a("playlist_type", this.f74602c).mo47829a("playlist_id", this.f74603d).mo47829a("group_id", this.f74604e).mo47826a("order", this.f74605f).mo47829a("log_pb", new C17971f().mo34889b(this.f74606g)).f61491a));
    }
}
