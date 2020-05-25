package com.p683ss.android.ugc.aweme.miniapp.utils;

import android.content.Context;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;

/* renamed from: com.ss.android.ugc.aweme.miniapp.utils.d */
public final class C36917d {
    /* renamed from: a */
    public static int m83052a(String str) {
        if (C36949e.m83167c(str)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    public static boolean m83053a(Context context, Aweme aweme) {
        if (context == null || aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
        if (!C36949e.m83168d(microAppUrl)) {
            return false;
        }
        C36983a.m83185b().mo76294a().openMiniApp(context, microAppUrl, new C36961a().mo76223c("025002").mo76225e("mp_url").mo76221a());
        return true;
    }
}
