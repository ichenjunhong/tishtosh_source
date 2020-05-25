package com.p683ss.android.ugc.aweme.discover.mob;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.s */
final /* synthetic */ class C28414s implements Callable {

    /* renamed from: a */
    private final String f74654a;

    /* renamed from: b */
    private final String f74655b;

    /* renamed from: c */
    private final String f74656c;

    /* renamed from: d */
    private final String f74657d;

    /* renamed from: e */
    private final long f74658e;

    /* renamed from: f */
    private final int f74659f;

    /* renamed from: g */
    private final LogPbBean f74660g;

    C28414s(String str, String str2, String str3, String str4, long j, int i, LogPbBean logPbBean) {
        this.f74654a = str;
        this.f74655b = str2;
        this.f74656c = str3;
        this.f74657d = str4;
        this.f74658e = j;
        this.f74659f = i;
        this.f74660g = logPbBean;
    }

    public final Object call() {
        return C26890h.m65012a("play_time", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", this.f74654a).mo47826a("is_auto_play", 1).mo47829a("playlist_type", this.f74655b).mo47829a("playlist_id", this.f74656c).mo47829a("group_id", this.f74657d).mo47827a("duration", this.f74658e).mo47826a("order", this.f74659f).mo47829a("log_pb", new C17971f().mo34889b(this.f74660g)).f61491a));
    }
}
