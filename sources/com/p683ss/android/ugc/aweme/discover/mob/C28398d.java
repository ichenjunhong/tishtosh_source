package com.p683ss.android.ugc.aweme.discover.mob;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.d */
final /* synthetic */ class C28398d implements Callable {

    /* renamed from: a */
    private final String f74573a;

    /* renamed from: b */
    private final String f74574b;

    /* renamed from: c */
    private final String f74575c;

    /* renamed from: d */
    private final String f74576d;

    /* renamed from: e */
    private final int f74577e;

    /* renamed from: f */
    private final LogPbBean f74578f;

    C28398d(String str, String str2, String str3, String str4, int i, LogPbBean logPbBean) {
        this.f74573a = str;
        this.f74574b = str2;
        this.f74575c = str3;
        this.f74576d = str4;
        this.f74577e = i;
        this.f74578f = logPbBean;
    }

    public final Object call() {
        return C26890h.m65012a("enter_playlist", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", this.f74573a).mo47829a("playlist_type", this.f74574b).mo47829a("playlist_id", this.f74575c).mo47829a("group_id", this.f74576d).mo47826a("order", this.f74577e).mo47829a("log_pb", new C17971f().mo34889b(this.f74578f)).f61491a));
    }
}
