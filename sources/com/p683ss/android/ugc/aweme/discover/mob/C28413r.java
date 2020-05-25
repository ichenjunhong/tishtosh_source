package com.p683ss.android.ugc.aweme.discover.mob;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.r */
public final /* synthetic */ class C28413r implements Callable {

    /* renamed from: a */
    private final String f74648a;

    /* renamed from: b */
    private final String f74649b;

    /* renamed from: c */
    private final String f74650c;

    /* renamed from: d */
    private final String f74651d;

    /* renamed from: e */
    private final int f74652e;

    /* renamed from: f */
    private final LogPbBean f74653f;

    public C28413r(String str, String str2, String str3, String str4, int i, LogPbBean logPbBean) {
        this.f74648a = str;
        this.f74649b = str2;
        this.f74650c = str3;
        this.f74651d = str4;
        this.f74652e = i;
        this.f74653f = logPbBean;
    }

    public final Object call() {
        return C26890h.m65012a("video_play_finish", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", this.f74648a).mo47826a("is_auto_play", 1).mo47829a("playlist_type", this.f74649b).mo47829a("playlist_id", this.f74650c).mo47829a("group_id", this.f74651d).mo47826a("order", this.f74652e).mo47829a("log_pb", new C17971f().mo34889b(this.f74653f)).f61491a));
    }
}
