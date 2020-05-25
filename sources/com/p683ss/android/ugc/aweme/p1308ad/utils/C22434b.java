package com.p683ss.android.ugc.aweme.p1308ad.utils;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.b */
public final class C22434b {
    /* renamed from: c */
    public static boolean m55465c(Aweme aweme) {
        return false;
    }

    /* renamed from: c */
    public static boolean m55466c(String str) {
        return false;
    }

    /* renamed from: a */
    public static boolean m55462a(String str) {
        return TextUtils.equals(str, "general_search");
    }

    /* renamed from: b */
    public static int m55463b(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static boolean m55464b(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getButtonStyle() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m55461a(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
            return false;
        }
        if (awemeRawAd.getAnimationType() == 1 || awemeRawAd.getAnimationType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m55460a(Context context, Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return context.getResources().getString(R.color.ss);
        }
        String learnMoreBgColor = aweme.getAwemeRawAd().getLearnMoreBgColor();
        if (TextUtils.isEmpty(learnMoreBgColor)) {
            return context.getResources().getString(R.color.ss);
        }
        return learnMoreBgColor;
    }
}
