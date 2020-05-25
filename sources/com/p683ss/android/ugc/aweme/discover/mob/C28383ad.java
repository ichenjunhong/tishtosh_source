package com.p683ss.android.ugc.aweme.discover.mob;

import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.p1382aq.C23252v;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.ad */
public final class C28383ad extends C23252v {

    /* renamed from: b */
    private int f74539b;

    /* renamed from: c */
    private String f74540c;

    /* renamed from: d */
    private String f74541d;

    /* renamed from: e */
    private String f74542e;

    /* renamed from: f */
    private String f74543f;

    public final HashMap<String, String> buildParams() {
        appendParam("order", String.valueOf(this.f74539b), C23232a.f62005a);
        appendParam("search_keyword", this.f74540c, C23232a.f62005a);
        appendParam("request_id", this.f74541d, C23232a.f62005a);
        appendParam("enter_from", this.f74542e, C23232a.f62005a);
        appendParam("enter_method", this.f74543f, C23232a.f62005a);
        appendParam("log_pb", C29981aa.m70153a().mo60161a(this.f74541d), C23232a.f62005a);
        return this.f62124a;
    }

    public final C28383ad setEnterFrom(String str) {
        this.f74542e = str;
        return this;
    }

    public final C28383ad setEnterMethod(String str) {
        this.f74543f = str;
        return this;
    }

    public final C28383ad setOrder(int i) {
        this.f74539b = i;
        return this;
    }

    public final C28383ad setRid(String str) {
        this.f74541d = str;
        return this;
    }

    public final C28383ad setSearchKeyword(String str) {
        this.f74540c = str;
        return this;
    }
}
