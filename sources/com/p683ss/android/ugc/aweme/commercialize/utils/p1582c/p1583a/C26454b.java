package com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.p1583a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26386al;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.a.b */
public final class C26454b {

    /* renamed from: a */
    public static final C26454b f69738a = new C26454b();

    private C26454b() {
    }

    /* renamed from: a */
    public static final boolean m63966a(Context context, String str, Aweme aweme, int i) {
        if (context == null || aweme == null || !aweme.isAd() || TextUtils.isEmpty(str)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return false;
        }
        C52711k.m112236a((Object) awemeRawAd, "aweme.awemeRawAd ?: return false");
        Intent a = C26386al.m63837a(context);
        a.putExtra("url", str);
        Long creativeId = awemeRawAd.getCreativeId();
        C52711k.m112236a((Object) creativeId, "ad.creativeId");
        a.putExtra("ad_id", creativeId.longValue());
        a.putExtra("ad_type", awemeRawAd.getType());
        a.putExtra("ad_system_origin", awemeRawAd.getSystemOrigin());
        Long creativeId2 = awemeRawAd.getCreativeId();
        C52711k.m112236a((Object) creativeId2, "ad.creativeId");
        a.putExtra("ad_id", creativeId2.longValue());
        a.putExtra("bundle_download_app_log_extra", awemeRawAd.getLogExtra());
        a.putExtra("aweme_id", aweme.getAid());
        a.putExtra("click_from", i);
        return C26540w.m64210a(context, a);
    }
}
