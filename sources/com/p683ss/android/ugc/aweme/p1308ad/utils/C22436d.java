package com.p683ss.android.ugc.aweme.p1308ad.utils;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.d */
public final class C22436d {
    /* renamed from: a */
    public static String m55468a(Context context, Aweme aweme, boolean z) {
        String str;
        if (context == null) {
            return "";
        }
        if (aweme == null) {
            return "";
        }
        if (!aweme.isAd()) {
            return "";
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            String type = aweme.getAwemeRawAd().getType();
            if (!TextUtils.isEmpty(type)) {
                String buttonText = awemeRawAd.getButtonText();
                char c = 65535;
                switch (type.hashCode()) {
                    case -1354573786:
                        if (type.equals("coupon")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 96801:
                        if (type.equals("app")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 117588:
                        if (type.equals("web")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3083120:
                        if (type.equals("dial")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3148996:
                        if (type.equals("form")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 957829685:
                        if (type.equals("counsel")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1893962841:
                        if (type.equals("redpacket")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        if (TextUtils.isEmpty(buttonText)) {
                            str = context.getString(R.string.dy);
                            break;
                        } else {
                            return buttonText;
                        }
                    case 1:
                        if (TextUtils.isEmpty(buttonText)) {
                            str = context.getString(R.string.dy);
                            break;
                        } else {
                            return buttonText;
                        }
                    case 2:
                        if (TextUtils.isEmpty(buttonText)) {
                            str = context.getString(R.string.du);
                            break;
                        } else {
                            return buttonText;
                        }
                    case 3:
                        return context.getString(R.string.dy);
                    case 4:
                        if (TextUtils.isEmpty(buttonText)) {
                            str = context.getString(R.string.dv);
                            break;
                        } else {
                            return buttonText;
                        }
                    case 5:
                        if (TextUtils.isEmpty(buttonText)) {
                            str = context.getString(R.string.dy);
                            break;
                        } else {
                            return buttonText;
                        }
                    case 6:
                        if (TextUtils.isEmpty(buttonText)) {
                            str = context.getString(R.string.df);
                            break;
                        } else {
                            return buttonText;
                        }
                }
            }
        }
        str = "";
        return str;
    }
}
