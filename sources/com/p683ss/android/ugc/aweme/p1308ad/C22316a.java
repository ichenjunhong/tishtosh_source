package com.p683ss.android.ugc.aweme.p1308ad;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commerce.model.C25516b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.SpecialSticker;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.ad.a */
public final class C22316a {
    /* renamed from: c */
    public static boolean m55222c(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        SpecialSticker specialSticker = aweme.getSpecialSticker();
        if (specialSticker == null || specialSticker.getStickerType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m55220a(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (!TextUtils.equals(awemeRawAd.getType(), "redpacket")) {
            return false;
        }
        UrlModel redImageUrl = awemeRawAd.getRedImageUrl();
        if (redImageUrl == null || C9376b.m18558a((Collection<T>) redImageUrl.getUrlList())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m55221b(Aweme aweme) {
        if (aweme == null || aweme.getActivityPendant() == null) {
            return false;
        }
        C25516b activityPendant = aweme.getActivityPendant();
        UrlModel image = activityPendant.getImage();
        if (image == null || C9376b.m18558a((Collection<T>) image.getUrlList())) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis < activityPendant.getStartTime() || currentTimeMillis > activityPendant.getEndTime()) {
            return false;
        }
        return true;
    }
}
