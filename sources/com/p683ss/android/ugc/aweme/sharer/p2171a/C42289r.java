package com.p683ss.android.ugc.aweme.sharer.p2171a;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.provider.Telephony.Sms;
import com.p683ss.android.ugc.aweme.sharer.C42254a;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42323i;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.r */
public final class C42289r extends C42254a {

    /* renamed from: a */
    public static final C42290a f106844a = new C42290a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.r$a */
    public static final class C42290a {
        private C42290a() {
        }

        public /* synthetic */ C42290a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.ano;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "sms";
    }

    /* renamed from: c */
    public final String mo86137c() {
        return "SMS";
    }

    /* renamed from: e */
    public final int mo86140e() {
        return R.drawable.ati;
    }

    /* renamed from: a */
    public final boolean mo86132a(Context context, C42318f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, C42311c.f106865i);
        return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    /* renamed from: a */
    public final boolean mo86133a(C42323i iVar, Context context) {
        Intent intent;
        C52711k.m112240b(iVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        if (VERSION.SDK_INT >= 19) {
            intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", iVar.f106880b);
            String defaultSmsPackage = Sms.getDefaultSmsPackage(context);
            if (defaultSmsPackage != null) {
                intent.setPackage(defaultSmsPackage);
            }
        } else {
            intent = new Intent("android.intent.action.VIEW");
            intent.setType("vnd.android-dir/mms-sms");
            intent.putExtra("android.intent.extra.STREAM", iVar.f106880b);
        }
        return mo86229a(context, intent);
    }

    /* renamed from: a */
    public final boolean mo86134a(C42324j jVar, Context context) {
        Intent intent;
        C52711k.m112240b(jVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        if (VERSION.SDK_INT >= 19) {
            intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", jVar.f106886d);
            String defaultSmsPackage = Sms.getDefaultSmsPackage(context);
            if (defaultSmsPackage != null) {
                intent.setPackage(defaultSmsPackage);
            }
        } else {
            intent = new Intent("android.intent.action.VIEW");
            intent.setType("vnd.android-dir/mms-sms");
            intent.putExtra("sms_body", jVar.f106886d);
        }
        return mo86229a(context, intent);
    }

    /* renamed from: a */
    public final boolean mo86135a(C42325k kVar, Context context) {
        Intent intent;
        C52711k.m112240b(kVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        if (VERSION.SDK_INT >= 19) {
            intent = new Intent("android.intent.action.SEND");
            intent.setType("video/*");
            intent.putExtra("android.intent.extra.STREAM", kVar.f106888b);
            String defaultSmsPackage = Sms.getDefaultSmsPackage(context);
            if (defaultSmsPackage != null) {
                intent.setPackage(defaultSmsPackage);
            }
        } else {
            intent = new Intent("android.intent.action.VIEW");
            intent.setType("vnd.android-dir/mms-sms");
            intent.putExtra("android.intent.extra.STREAM", kVar.f106888b);
        }
        return mo86229a(context, intent);
    }
}
