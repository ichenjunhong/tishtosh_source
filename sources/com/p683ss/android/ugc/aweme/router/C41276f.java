package com.p683ss.android.ugc.aweme.router;

import android.net.Uri;
import android.net.Uri.Builder;
import com.p683ss.android.ugc.aweme.router.C41302w.C41309b;
import java.util.Iterator;
import java.util.Set;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2649l.C52786h;

/* renamed from: com.ss.android.ugc.aweme.router.f */
public final class C41276f implements C41309b {

    /* renamed from: a */
    public static final C41276f f104728a = new C41276f();

    /* renamed from: com.ss.android.ugc.aweme.router.f$a */
    static final class C41277a extends C52712l implements C52671b<String, Boolean> {

        /* renamed from: a */
        public static final C41277a f104729a = new C41277a();

        C41277a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(!C52711k.m112239a((Object) (String) obj, (Object) "cid"));
        }
    }

    private C41276f() {
    }

    /* renamed from: a */
    public final String mo47844a(String str) {
        boolean z;
        if (str == null) {
            return "";
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("cid");
        CharSequence charSequence = queryParameter;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
        sb.append(queryParameter);
        Builder buildUpon = Uri.parse(sb.toString()).buildUpon();
        C52711k.m112236a((Object) parse, "uri");
        Set queryParameterNames = parse.getQueryParameterNames();
        C52711k.m112236a((Object) queryParameterNames, "uri.queryParameterNames");
        Iterator a = C52786h.m112340a(C52575l.m112148k(queryParameterNames), (C52671b<? super T, Boolean>) C41277a.f104729a).mo110157a();
        while (a.hasNext()) {
            String str2 = (String) a.next();
            buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
        }
        String builder = buildUpon.toString();
        C52711k.m112236a((Object) builder, "clientUriBuilder.toString()");
        return builder;
    }
}
