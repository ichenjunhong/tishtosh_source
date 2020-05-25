package com.p683ss.android.ugc.aweme.discover.mob;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.q */
public final /* synthetic */ class C28412q implements Callable {

    /* renamed from: a */
    private final String f74642a;

    /* renamed from: b */
    private final String f74643b;

    /* renamed from: c */
    private final String f74644c;

    /* renamed from: d */
    private final String f74645d;

    /* renamed from: e */
    private final int f74646e;

    /* renamed from: f */
    private final LogPbBean f74647f;

    public C28412q(String str, String str2, String str3, String str4, int i, LogPbBean logPbBean) {
        this.f74642a = str;
        this.f74643b = str2;
        this.f74644c = str3;
        this.f74645d = str4;
        this.f74646e = i;
        this.f74647f = logPbBean;
    }

    public final Object call() {
        return C26890h.m65012a("video_play", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", this.f74642a).mo47826a("is_auto_play", 1).mo47829a("playlist_type", this.f74643b).mo47829a("playlist_id", this.f74644c).mo47829a("group_id", this.f74645d).mo47826a("order", this.f74646e).mo47829a("log_pb", new C17971f().mo34889b(this.f74647f)).f61491a));
    }
}
