package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.n */
public final class C35276n {
    /* renamed from: a */
    public static boolean m79758a(SharePackage sharePackage) {
        if (sharePackage == null) {
            return false;
        }
        return TextUtils.equals(sharePackage.f106900i.getString("IS_FRIEND_PRIVATE"), "true");
    }
}
