package com.p683ss.android.ugc.aweme.discover.mob;

import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.p1382aq.C23252v;
import com.p683ss.android.ugc.aweme.search.C41429i;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.x */
public final class C28419x extends C23252v {

    /* renamed from: b */
    private String f74673b = "discovery";

    /* renamed from: c */
    private int f74674c;

    /* renamed from: d */
    private String f74675d;

    /* renamed from: e */
    private String f74676e;

    public final HashMap<String, String> buildParams() {
        if (C41429i.m91245e()) {
            this.f74673b = "search_section";
        }
        appendParam("banner_id", this.f74675d, C23232a.f62006b);
        appendParam("enter_from", this.f74673b, C23232a.f62005a);
        appendParam("tag_id", this.f74676e, C23232a.f62005a);
        appendParam("client_order", String.valueOf(this.f74674c), C23232a.f62005a);
        return this.f62124a;
    }

    public final C28419x setBannerId(String str) {
        this.f74675d = str;
        return this;
    }

    public final C28419x setClientOrder(int i) {
        this.f74674c = i;
        return this;
    }

    public final C28419x setEnterFrom(String str) {
        this.f74673b = str;
        return this;
    }

    public final C28419x setTagId(String str) {
        this.f74676e = str;
        return this;
    }
}
