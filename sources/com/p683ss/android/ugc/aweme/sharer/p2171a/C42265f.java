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
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.f */
public final class C42265f extends C42254a {

    /* renamed from: a */
    public static final C42266a f106831a = new C42266a(null);

    /* renamed from: com.ss.android.ugc.aweme.sharer.a.f$a */
    public static final class C42266a {
        private C42266a() {
        }

        public /* synthetic */ C42266a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo86131a() {
        return R.drawable.an9;
    }

    /* renamed from: a */
    public final boolean mo86134a(C42324j jVar, Context context) {
        C52711k.m112240b(jVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return false;
    }

    /* renamed from: b */
    public final String mo86136b() {
        return "facebook";
    }

    /* renamed from: c */
    public final String mo86137c() {
        return "";
    }

    /* renamed from: e */
    public final int mo86140e() {
        return R.drawable.atk;
    }

    /* renamed from: a */
    public final boolean mo86141a(Context context) {
        C52711k.m112240b(context, "context");
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        intent.setType("video/mp4");
        if (context.getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo86132a(Context context, C42318f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, C42311c.f106865i);
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        intent.setType("video/mp4");
        if (context.getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo86133a(C42323i iVar, Context context) {
        C52711k.m112240b(iVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return m92759a(iVar, context, iVar.f106880b);
    }

    /* renamed from: a */
    public final boolean mo86135a(C42325k kVar, Context context) {
        C52711k.m112240b(kVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        return m92759a(kVar, context, kVar.f106888b);
    }

    /* renamed from: a */
    private boolean m92759a(C42318f fVar, Context context, Uri uri) {
        C52711k.m112240b(fVar, C42311c.f106865i);
        C52711k.m112240b(context, "context");
        C52711k.m112240b(uri, "uri");
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
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
