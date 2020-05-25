package com.p683ss.android.ugc.aweme.account.util;

import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.main.service.C36694o;
import com.p683ss.android.ugc.aweme.main.service.C36699t;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.util.q */
public final class C22277q {

    /* renamed from: a */
    public static final C22277q f60046a = new C22277q();

    private C22277q() {
    }

    /* renamed from: a */
    public final String mo46374a(String str) {
        C52711k.m112240b(str, "projectKey");
        String a = ((C36694o) C23826bi.m58450a(C36694o.class)).mo47888a();
        String b = ((C36699t) C23826bi.m58450a(C36699t.class)).mo47865b();
        StringBuilder sb = new StringBuilder("https://www.tiktok.com/in_app/redirect?region=");
        sb.append(b);
        sb.append("&language=");
        sb.append(a);
        sb.append("&projectKey=");
        sb.append(str);
        return sb.toString();
    }
}
