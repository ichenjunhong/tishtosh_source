package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.app.Dialog;
import android.content.Context;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.comment.list.C25259h;
import com.p683ss.android.ugc.aweme.comment.p1517b.C25144a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ac */
public final class C26369ac {
    /* renamed from: a */
    public static boolean m63812a(Aweme aweme) {
        if (aweme.getAwemeRawAd() == null) {
            return false;
        }
        String type = aweme.getAwemeRawAd().getType();
        int maskFormStyle = aweme.getAwemeRawAd().getMaskFormStyle();
        if (!TextUtils.equals(type, "form") || maskFormStyle != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m63811a(C0654k kVar) {
        if (kVar == null) {
            return false;
        }
        List<Fragment> f = kVar.mo2238f();
        if (C9376b.m18558a((Collection<T>) f)) {
            return false;
        }
        for (Fragment fragment : f) {
            if (fragment != null && !(fragment instanceof C25144a)) {
                if (fragment instanceof C0649f) {
                    Dialog dialog = ((C0649f) fragment).getDialog();
                    if (dialog != null) {
                        return dialog.isShowing();
                    }
                } else if (fragment instanceof C25259h) {
                    return ((C25259h) fragment).mo51543c();
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m63810a(Context context, Aweme aweme, boolean z) {
        if (context == null) {
            return "";
        }
        if (aweme == null) {
            return "";
        }
        if (!aweme.isAd()) {
            return "";
        }
        return m63813b(context, aweme, z);
    }

    /* renamed from: b */
    private static String m63813b(Context context, Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return "";
        }
        String type = aweme.getAwemeRawAd().getType();
        if (TextUtils.isEmpty(type)) {
            return "";
        }
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
                    return context.getString(R.string.dy);
                }
                return buttonText;
            case 1:
                if (TextUtils.isEmpty(buttonText)) {
                    return context.getString(R.string.dy);
                }
                return buttonText;
            case 2:
                if (TextUtils.isEmpty(buttonText)) {
                    return context.getString(R.string.du);
                }
                return buttonText;
            case 3:
                if (z) {
                    return context.getString(R.string.dy);
                }
                if (TextUtils.isEmpty(buttonText)) {
                    return context.getString(R.string.di);
                }
                return buttonText;
            case 4:
                if (TextUtils.isEmpty(buttonText)) {
                    return context.getString(R.string.dv);
                }
                return buttonText;
            case 5:
                if (TextUtils.isEmpty(buttonText)) {
                    return context.getString(R.string.dy);
                }
                return buttonText;
            case 6:
                if (TextUtils.isEmpty(buttonText)) {
                    return context.getString(R.string.df);
                }
                return buttonText;
            default:
                return "";
        }
    }
}
