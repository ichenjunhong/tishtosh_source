package com.p683ss.android.ugc.aweme.sharer.p2171a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import com.p683ss.android.ugc.aweme.sharer.C42316d;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c.C42312a;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.p */
public final class C42285p extends C42316d {

    /* renamed from: a */
    public static final C42286a f106842a = new C42286a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.p$a */
    public static final class C42286a {
        private C42286a() {
        }

        public /* synthetic */ C42286a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.ant;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "naver_blog";
    }

    /* renamed from: c */
    public final String mo86137c() {
        return "NaverBlog";
    }

    /* renamed from: d */
    public final String mo86230d() {
        return "com.nhn.android.blog";
    }

    /* renamed from: e */
    public final int mo86140e() {
        return R.drawable.atx;
    }

    /* renamed from: a */
    public final boolean mo86134a(C42324j jVar, Context context) {
        boolean z;
        boolean z2;
        C52711k.m112240b(jVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        String str = jVar.f106887e;
        if (str == null) {
            str = "";
        }
        String str2 = jVar.f106886d;
        C42311c cVar = new C42311c(context);
        List a = C52575l.m112097a();
        List a2 = C52575l.m112097a();
        List a3 = C52575l.m112097a();
        List a4 = C52575l.m112097a();
        C52711k.m112240b(str, "title");
        C52711k.m112240b(str2, C42311c.f106865i);
        C52711k.m112240b(a, C42311c.f106866j);
        C52711k.m112240b(a2, C42311c.f106867k);
        C52711k.m112240b(a3, C42311c.f106868l);
        C52711k.m112240b(a4, C42311c.f106869m);
        C42312a aVar = C42312a.f106872a;
        C52711k.m112240b(a, C42311c.f106866j);
        C52711k.m112240b(a2, C42311c.f106867k);
        C52711k.m112240b(a3, C42311c.f106868l);
        C52711k.m112240b(a4, C42311c.f106869m);
        Builder builder = new Builder();
        builder.scheme(C42311c.f106861e);
        builder.authority(C42311c.f106862f);
        builder.appendQueryParameter(C42311c.f106863g, String.valueOf(1));
        boolean z3 = false;
        if (str != null) {
            if (str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                builder.appendQueryParameter(C42311c.f106864h, str);
            }
        }
        if (str2 != null) {
            if (str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                builder.appendQueryParameter(C42311c.f106865i, str2);
            }
        }
        C42312a.m92912a(builder, C42311c.f106866j, a);
        C42312a.m92912a(builder, C42311c.f106867k, a2);
        C42312a.m92912a(builder, C42311c.f106868l, a3);
        C42312a.m92912a(builder, C42311c.f106869m, a4);
        Uri build = builder.build();
        C52711k.m112236a((Object) build, "uriBuilder.build()");
        Intent intent = new Intent();
        intent.setData(build);
        try {
            cVar.f106871a.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            if (cVar.mo86231a(C42311c.f106858b)) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(C42311c.f106860d));
                cVar.f106871a.startActivity(intent2);
                z3 = true;
            }
            if (!z3) {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setData(Uri.parse(C42311c.f106859c));
                cVar.f106871a.startActivity(intent3);
            }
        }
        return true;
    }
}
