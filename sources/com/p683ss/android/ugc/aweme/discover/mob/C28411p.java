package com.p683ss.android.ugc.aweme.discover.mob;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.p */
public final /* synthetic */ class C28411p implements Callable {

    /* renamed from: a */
    private final String f74637a;

    /* renamed from: b */
    private final String f74638b;

    /* renamed from: c */
    private final String f74639c;

    /* renamed from: d */
    private final int f74640d;

    /* renamed from: e */
    private final Long f74641e;

    public C28411p(String str, String str2, String str3, int i, Long l) {
        this.f74637a = str;
        this.f74638b = str2;
        this.f74639c = str3;
        this.f74640d = i;
        this.f74641e = l;
    }

    public final Object call() {
        return C26890h.m65012a("discovery_quit_count", C23198ae.m56851a(C23089d.m56640a().mo47829a("group_id", this.f74637a).mo47829a("playlist_id", this.f74638b).mo47829a("playlist_type", this.f74639c).mo47826a("vv_count", this.f74640d).mo47828a("duration", (Object) this.f74641e).f61491a));
    }
}
