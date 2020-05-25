package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.p683ss.android.ugc.aweme.common.C26890h;
import java.util.List;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ap */
public final class C26396ap {

    /* renamed from: a */
    public static final C26396ap f69641a = new C26396ap();

    /* renamed from: b */
    private static final String f69642b = C26396ap.class.getSimpleName();

    private C26396ap() {
    }

    /* renamed from: a */
    public static void m63858a(String str, String str2, List<String> list, List<String> list2, String str3) {
        C52711k.m112240b(str, "type");
        C52711k.m112240b(str2, "msg");
        C26890h.m65011a("aweme_ad_rank_result", C52550ab.m112050a(C52856t.m112465a("type", str), C52856t.m112465a("message", str2), C52856t.m112465a("item_list_before", C52575l.m112120a(list, ",", null, null, 0, null, null, 62, null)), C52856t.m112465a("item_list_after", null), C52856t.m112465a("rerank_request_id", str3)));
    }
}
