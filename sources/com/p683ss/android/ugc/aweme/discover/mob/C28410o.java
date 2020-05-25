package com.p683ss.android.ugc.aweme.discover.mob;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.o */
final /* synthetic */ class C28410o implements Callable {

    /* renamed from: a */
    private final String f74634a;

    /* renamed from: b */
    private final int f74635b;

    /* renamed from: c */
    private final String f74636c;

    C28410o(String str, int i, String str2) {
        this.f74634a = str;
        this.f74635b = i;
        this.f74636c = str2;
    }

    public final Object call() {
        return C26890h.m65012a("enter_prop_detail", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", "discovery_tab").mo47829a("prop_id", this.f74634a).mo47826a("order", this.f74635b).mo47829a("tab_name", this.f74636c).f61491a));
    }
}
