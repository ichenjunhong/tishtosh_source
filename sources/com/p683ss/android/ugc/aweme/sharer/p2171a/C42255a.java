package com.p683ss.android.ugc.aweme.sharer.p2171a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.sharer.C42316d;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42323i;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.net.URLEncoder;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.a */
public final class C42255a extends C42316d {

    /* renamed from: a */
    public static final C42256a f106824a = new C42256a(null);

    /* renamed from: b */
    private final String f106825b;

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.a$a */
    public static final class C42256a {
        private C42256a() {
        }

        public /* synthetic */ C42256a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.amv;
    }

    /* renamed from: a */
    public final boolean mo86133a(C42323i iVar, Context context) {
        C52711k.m112240b(iVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return false;
    }

    /* renamed from: a */
    public final boolean mo86135a(C42325k kVar, Context context) {
        C52711k.m112240b(kVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return false;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "band";
    }

    /* renamed from: c */
    public final String mo86137c() {
        return "Band";
    }

    /* renamed from: d */
    public final String mo86230d() {
        return "com.nhn.android.band";
    }

    /* renamed from: e */
    public final int mo86140e() {
        return R.drawable.atg;
    }

    public C42255a(String str) {
        C52711k.m112240b(str, "domain");
        this.f106825b = str;
    }

    /* renamed from: a */
    public final boolean mo86132a(Context context, C42318f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, C42311c.f106865i);
        if (!super.mo86132a(context, fVar) || !(fVar instanceof C42324j)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo86134a(C42324j jVar, Context context) {
        C52711k.m112240b(jVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        String encode = URLEncoder.encode(jVar.f106886d, "UTF-8");
        StringBuilder sb = new StringBuilder("bandapp://create/post?text=");
        sb.append(encode);
        sb.append("&route=");
        sb.append(this.f106825b);
        return mo86229a(context, new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
    }
}
