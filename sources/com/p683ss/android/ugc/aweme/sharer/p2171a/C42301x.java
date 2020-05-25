package com.p683ss.android.ugc.aweme.sharer.p2171a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.sharer.C42316d;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.x */
public class C42301x extends C42316d {

    /* renamed from: a */
    public static final C42302a f106852a = new C42302a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.x$a */
    public static final class C42302a {
        private C42302a() {
        }

        public /* synthetic */ C42302a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public int mo86131a() {
        return R.drawable.aoo;
    }

    /* renamed from: b */
    public String mo86136b() {
        return "whatsapp";
    }

    /* renamed from: c */
    public String mo86137c() {
        return "WhatsApp";
    }

    /* renamed from: d */
    public final String mo86230d() {
        return "com.whatsapp";
    }

    /* renamed from: e */
    public int mo86140e() {
        return R.drawable.au5;
    }

    /* renamed from: a */
    public final boolean mo86134a(C42324j jVar, Context context) {
        C52711k.m112240b(jVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        String b = jVar.mo86233b("whatsapp_target_phone_number", "");
        boolean z = true;
        if (TextUtils.isEmpty(b)) {
            if (jVar.mo86233b("image", "").length() != 0) {
                z = false;
            }
            if (z) {
                return super.mo86134a(jVar, context);
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            intent.setPackage(mo86230d());
            intent.putExtra("android.intent.extra.STREAM", Uri.parse(jVar.mo86233b("image", "")));
            intent.putExtra("android.intent.extra.TEXT", jVar.f106886d);
            intent.addFlags(268435456);
            if (VERSION.SDK_INT >= 19) {
                intent.addFlags(64);
            }
            return mo86229a(context, intent);
        } else if (!mo86132a(context, (C42318f) jVar)) {
            return false;
        } else {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(mo86230d());
            StringBuilder sb = new StringBuilder("https://wa.me/");
            sb.append(b);
            sb.append("?text=");
            sb.append(jVar.f106886d);
            intent2.setData(Uri.parse(sb.toString()));
            context.startActivity(intent2);
            return true;
        }
    }
}
