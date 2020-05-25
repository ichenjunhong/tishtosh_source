package com.p683ss.android.ugc.aweme.discover.mob;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.i */
public final /* synthetic */ class C28404i implements Callable {

    /* renamed from: a */
    private final String f74612a;

    /* renamed from: b */
    private final String f74613b;

    /* renamed from: c */
    private final String f74614c;

    /* renamed from: d */
    private final String f74615d;

    /* renamed from: e */
    private final String f74616e;

    /* renamed from: f */
    private final long f74617f;

    /* renamed from: g */
    private final int f74618g;

    /* renamed from: h */
    private final LogPbBean f74619h;

    public C28404i(String str, String str2, String str3, String str4, String str5, long j, int i, LogPbBean logPbBean) {
        this.f74612a = str;
        this.f74613b = str2;
        this.f74614c = str3;
        this.f74615d = str4;
        this.f74616e = str5;
        this.f74617f = j;
        this.f74618g = i;
        this.f74619h = logPbBean;
    }

    public final Object call() {
        return C26890h.m65012a("play_time", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", this.f74612a).mo47829a("tab_name", this.f74613b).mo47826a("is_auto_play", 1).mo47829a("playlist_type", this.f74614c).mo47829a("playlist_id", this.f74615d).mo47829a("group_id", this.f74616e).mo47827a("duration", this.f74617f).mo47826a("order", this.f74618g).mo47829a("log_pb", new C17971f().mo34889b(this.f74619h)).f61491a));
    }
}
