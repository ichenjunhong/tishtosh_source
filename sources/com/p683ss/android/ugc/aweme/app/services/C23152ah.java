package com.p683ss.android.ugc.aweme.app.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.main.service.C36703x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.services.ah */
public final class C23152ah implements C36703x {
    /* renamed from: a */
    public final void mo47869a(Context context, String str, String str2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str2, "headStr");
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("wap_headers", str2);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo47870a(Context context, String str, boolean z) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "url");
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("hide_nav_bar", z);
        context.startActivity(intent);
    }
}
