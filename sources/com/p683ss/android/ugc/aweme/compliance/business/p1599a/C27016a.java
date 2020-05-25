package com.p683ss.android.ugc.aweme.compliance.business.p1599a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.a.a */
public final class C27016a {
    /* renamed from: a */
    public static String m65228a(Aweme aweme) {
        if (aweme.getAwemeType() == 13) {
            return "forward";
        }
        if (aweme.getAwemeType() == 2) {
            return "image";
        }
        if (aweme.getAwemeType() == 0 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53 || aweme.getAwemeType() == 55 || aweme.getAwemeType() == 56) {
            return "video";
        }
        if (aweme.getAwemeType() == 34) {
            return "video";
        }
        boolean z = true;
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 1) {
            z = false;
        }
        if (z) {
            return "douplus";
        }
        if (aweme.isAd()) {
            return C29094ad.f76264a;
        }
        return "";
    }

    /* renamed from: a */
    public static void m65230a(Builder builder) {
        boolean z;
        User curUser = C20854a.m53167g().getCurUser();
        if (curUser == null || !curUser.isDisciplineMember()) {
            z = false;
        } else {
            z = true;
        }
        Uri parse = Uri.parse("https://www.tiktok.com/falcon/main/report/");
        builder.scheme(parse.getScheme());
        builder.authority(parse.getAuthority());
        builder.path(parse.getPath());
        if (((Boolean) SharePrefCache.inst().getIsFirstReportVideo().mo47782d()).booleanValue() && !z) {
            builder.appendQueryParameter("isFirst", "1");
        }
    }

    /* renamed from: a */
    public static void m65229a(Activity activity, Builder builder) {
        m65230a(builder);
        SmartRouter.buildRoute((Context) activity, "//webview").withParam(builder.build()).withParam("show_load_dialog", false).withParam("hide_nav_bar", true).withParam("status_bar_color", activity.getResources().getString(R.color.a0_).replace("#", "")).open();
    }
}
