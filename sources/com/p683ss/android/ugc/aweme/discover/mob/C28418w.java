package com.p683ss.android.ugc.aweme.discover.mob;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.w */
final /* synthetic */ class C28418w implements Callable {

    /* renamed from: a */
    private final String f74670a;

    /* renamed from: b */
    private final String f74671b;

    /* renamed from: c */
    private final int f74672c;

    C28418w(String str, String str2, int i) {
        this.f74670a = str;
        this.f74671b = str2;
        this.f74672c = i;
    }

    public final Object call() {
        return C26890h.m65012a("enter_category_tab", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", "discovery").mo47829a("tab_name", this.f74670a).mo47829a("enter_method", this.f74671b).mo47826a("order", this.f74672c).f61491a));
    }
}
