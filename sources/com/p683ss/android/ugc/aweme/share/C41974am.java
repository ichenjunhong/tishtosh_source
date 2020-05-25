package com.p683ss.android.ugc.aweme.share;

import android.text.TextUtils;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;

/* renamed from: com.ss.android.ugc.aweme.share.am */
public final class C41974am {
    /* renamed from: a */
    public static String m91940a(SharePackage sharePackage, String str) {
        if (sharePackage == null) {
            return null;
        }
        return m91941a(sharePackage.f106899h, str, sharePackage.f106900i.getBoolean("bool_persist"));
    }

    /* renamed from: a */
    public static String m91941a(String str, String str2, boolean z) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.contains("utm_source")) {
            C18922i iVar = new C18922i(str);
            iVar.mo38778a("utm_source", str2);
            iVar.mo38778a("utm_campaign", "client_share");
            iVar.mo38778a("utm_medium", "android");
            iVar.mo38778a("share_app_name", "tiktok");
            iVar.mo38778a("share_iid", AppLog.getInstallId());
            str3 = iVar.mo38774a();
        } else {
            StringBuilder sb = new StringBuilder("utm_source=");
            sb.append(str2);
            str3 = str.replaceAll("utm_source=\\w*_?\\w?", sb.toString());
        }
        return (String) C41979aq.m91947b().shortUrl(str3).mo6490a();
    }
}
