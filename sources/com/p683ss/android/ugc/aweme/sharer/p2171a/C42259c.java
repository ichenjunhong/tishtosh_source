package com.p683ss.android.ugc.aweme.sharer.p2171a;

import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.sharer.C42254a;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42323i;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.c */
public final class C42259c extends C42254a {

    /* renamed from: a */
    public static final C42260a f106827a = new C42260a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.c$a */
    public static final class C42260a {
        private C42260a() {
        }

        public /* synthetic */ C42260a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.an8;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "email";
    }

    /* renamed from: c */
    public final String mo86137c() {
        return "Email";
    }

    /* renamed from: e */
    public final int mo86140e() {
        return R.drawable.atj;
    }

    /* renamed from: a */
    public final boolean mo86132a(Context context, C42318f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, C42311c.f106865i);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        if (context.getPackageManager().queryIntentActivities(intent, 0).size() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo86133a(C42323i iVar, Context context) {
        C52711k.m112240b(iVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", iVar.f106882d);
        intent.putExtra("android.intent.extra.SUBJECT", iVar.f106884f);
        intent.putExtra("android.intent.extra.STREAM", iVar.f106880b);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return mo86229a(context, intent);
    }

    /* renamed from: a */
    public final boolean mo86134a(C42324j jVar, Context context) {
        C52711k.m112240b(jVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", jVar.f106886d);
        intent.putExtra("android.intent.extra.SUBJECT", jVar.f106887e);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return mo86229a(context, intent);
    }

    /* renamed from: a */
    public final boolean mo86135a(C42325k kVar, Context context) {
        C52711k.m112240b(kVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", kVar.f106890d);
        intent.putExtra("android.intent.extra.SUBJECT", kVar.f106892f);
        intent.putExtra("android.intent.extra.STREAM", kVar.f106888b);
        intent.setType("message/rfc882");
        Intent.createChooser(intent, "");
        return mo86229a(context, intent);
    }
}
