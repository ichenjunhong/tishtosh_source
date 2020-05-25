package com.p683ss.android.ugc.aweme.sharer.p2171a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.sharer.C42254a;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42323i;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42314d;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.j */
public final class C42273j extends C42254a {

    /* renamed from: a */
    public static final C42274a f106835a = new C42274a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.j$a */
    public static final class C42274a {
        private C42274a() {
        }

        public /* synthetic */ C42274a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.anj;
    }

    /* renamed from: a */
    public final boolean mo86134a(C42324j jVar, Context context) {
        C52711k.m112240b(jVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return false;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "instagram_story";
    }

    /* renamed from: c */
    public final String mo86137c() {
        return "Stories";
    }

    /* renamed from: e */
    public final int mo86140e() {
        return R.drawable.atr;
    }

    /* renamed from: a */
    public final boolean mo86141a(Context context) {
        C52711k.m112240b(context, "context");
        C42324j jVar = new C42324j("", null, 2, null);
        if (!C42314d.m92913a(context, "com.instagram.android") || !mo86132a(context, (C42318f) jVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo86133a(C42323i iVar, Context context) {
        C52711k.m112240b(iVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return m92786a(iVar, context, iVar.f106880b);
    }

    /* renamed from: a */
    public final boolean mo86132a(Context context, C42318f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, C42311c.f106865i);
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        intent.setType("image/*");
        if (context.getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo86135a(C42325k kVar, Context context) {
        C52711k.m112240b(kVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return m92786a(kVar, context, kVar.f106888b);
    }

    /* renamed from: a */
    private boolean m92786a(C42318f fVar, Context context, Uri uri) {
        C52711k.m112240b(fVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        C52711k.m112240b(uri, "uri");
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        String b = fVar.mo86233b("media_type", "");
        String b2 = fVar.mo86233b("content_url", "video/*");
        String b3 = fVar.mo86233b("fb_app_id", "");
        if (!TextUtils.isEmpty(b)) {
            intent.setType(b);
        }
        if (!TextUtils.isEmpty(b3)) {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", b3);
        }
        if (!TextUtils.isEmpty(b2)) {
            intent.putExtra("content_url", b2);
        }
        intent.setDataAndType(uri, b);
        intent.setFlags(1);
        return mo86229a(context, intent);
    }
}
