package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.text.TextUtils;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bg */
public final class C35231bg {
    /* renamed from: b */
    public static boolean m79632b(IMUser iMUser) {
        if (iMUser == null || !C34004b.m77718b().isUserVerified(iMUser)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m79634d(IMUser iMUser) {
        if (iMUser == null || TextUtils.isEmpty(iMUser.getEnterpriseVerifyReason())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m79630a(IMUser iMUser) {
        if (m79633c(iMUser)) {
            return R.drawable.azc;
        }
        if (m79634d(iMUser)) {
            return R.drawable.azd;
        }
        if (m79632b(iMUser)) {
            return R.drawable.az5;
        }
        return -1;
    }

    /* renamed from: c */
    public static boolean m79633c(IMUser iMUser) {
        if (iMUser == null || !TextUtils.isEmpty(iMUser.getEnterpriseVerifyReason()) || iMUser.getVerificationType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m79631a(ImageView imageView, IMUser iMUser) {
        imageView.setVisibility(0);
        if (m79633c(iMUser)) {
            imageView.setImageResource(R.drawable.azc);
        } else if (m79634d(iMUser)) {
            imageView.setImageResource(R.drawable.azd);
        } else if (m79632b(iMUser)) {
            imageView.setImageResource(R.drawable.az5);
        } else {
            imageView.setVisibility(4);
            return false;
        }
        return true;
    }
}
