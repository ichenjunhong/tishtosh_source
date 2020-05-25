package com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.p1583a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.a.c */
public final class C26455c {

    /* renamed from: a */
    public static final C26455c f69739a = new C26455c();

    private C26455c() {
    }

    /* renamed from: a */
    public static final boolean m63967a(Context context, String str) {
        if (str == null) {
            return false;
        }
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        StringBuilder sb = new StringBuilder("https://play.google.com/store/apps/details?id=");
        sb.append(str);
        intent.setData(Uri.parse(sb.toString()));
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("hide_status_bar", true);
        return C26540w.m64210a(context, intent);
    }
}
