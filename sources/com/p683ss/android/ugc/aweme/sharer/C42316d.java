package com.p683ss.android.ugc.aweme.sharer;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42314d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.d */
public abstract class C42316d extends C42254a {
    /* renamed from: d */
    public abstract String mo86230d();

    /* renamed from: a */
    public boolean mo86141a(Context context) {
        C52711k.m112240b(context, "context");
        String d = mo86230d();
        if (TextUtils.isEmpty(d)) {
            return true;
        }
        if (d == null) {
            C52711k.m112234a();
        }
        return C42314d.m92913a(context, d);
    }

    /* renamed from: a */
    public boolean mo86132a(Context context, C42318f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, C42311c.f106865i);
        String d = mo86230d();
        if (TextUtils.isEmpty(d)) {
            return true;
        }
        if (d == null) {
            C52711k.m112234a();
        }
        return C42314d.m92913a(context, d);
    }

    /* renamed from: a */
    public boolean mo86133a(C42323i iVar, Context context) {
        C52711k.m112240b(iVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.setPackage(mo86230d());
        intent.putExtra("android.intent.extra.STREAM", iVar.f106880b);
        intent.putExtra("android.intent.extra.TEXT", iVar.f106882d);
        return mo86229a(context, intent);
    }

    /* renamed from: a */
    public boolean mo86134a(C42324j jVar, Context context) {
        C52711k.m112240b(jVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setPackage(mo86230d());
        intent.putExtra("android.intent.extra.TEXT", jVar.f106886d);
        return mo86229a(context, intent);
    }

    /* renamed from: a */
    public boolean mo86135a(C42325k kVar, Context context) {
        C52711k.m112240b(kVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("video/*");
        intent.setPackage(mo86230d());
        intent.putExtra("android.intent.extra.STREAM", kVar.f106888b);
        intent.putExtra("android.intent.extra.TEXT", kVar.f106890d);
        return mo86229a(context, intent);
    }
}
