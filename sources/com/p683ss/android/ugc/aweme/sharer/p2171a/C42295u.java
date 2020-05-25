package com.p683ss.android.ugc.aweme.sharer.p2171a;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.sharer.C42316d;
import com.p683ss.android.ugc.aweme.sharer.C42322h;
import com.p683ss.android.ugc.aweme.sharer.C42323i;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import com.twitter.sdk.android.tweetcomposer.C52255l.C52256a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.u */
public final class C42295u extends C42316d {

    /* renamed from: a */
    public static final C42296a f106848a = new C42296a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.u$a */
    public static final class C42296a {
        private C42296a() {
        }

        public /* synthetic */ C42296a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.aof;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "twitter";
    }

    /* renamed from: c */
    public final String mo86137c() {
        return "Twitter";
    }

    /* renamed from: d */
    public final String mo86230d() {
        return "com.twitter.android";
    }

    /* renamed from: e */
    public final int mo86140e() {
        return R.drawable.au2;
    }

    /* renamed from: a */
    public final boolean mo86138a(C42322h hVar, Context context) {
        C52711k.m112240b(hVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return mo86134a(new C42324j(hVar.f106878b, hVar.f106879c), context);
    }

    /* renamed from: a */
    public final boolean mo86133a(C42323i iVar, Context context) {
        C52711k.m112240b(iVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        new C52256a(context).mo109002a(iVar.f106880b).mo109004a();
        return true;
    }

    /* renamed from: a */
    public final boolean mo86134a(C42324j jVar, Context context) {
        String str;
        C52711k.m112240b(jVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        if (TextUtils.isEmpty(jVar.f106887e)) {
            str = jVar.f106886d;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(jVar.f106887e);
            sb.append(" ");
            sb.append(jVar.f106886d);
            str = sb.toString();
        }
        new C52256a(context).mo109003a(str).mo109004a();
        return true;
    }
}
