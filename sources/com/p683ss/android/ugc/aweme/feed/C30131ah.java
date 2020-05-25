package com.p683ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.share.p2159h.C42040f;

/* renamed from: com.ss.android.ugc.aweme.feed.ah */
public final class C30131ah {
    /* renamed from: a */
    public static String m70705a(ShareInfo shareInfo, String str, boolean z) {
        String str2;
        if (shareInfo == null) {
            return "";
        }
        String shareUrl = shareInfo.getShareUrl();
        if (TextUtils.isEmpty(shareUrl) || shareUrl.contains("utm_source")) {
            StringBuilder sb = new StringBuilder("utm_source=");
            sb.append(str);
            str2 = shareUrl.replaceAll("utm_source=\\w*_?\\w?", sb.toString());
        } else {
            C18922i iVar = new C18922i(shareUrl);
            iVar.mo38778a("utm_source", str);
            iVar.mo38778a("utm_campaign", "client_share");
            iVar.mo38778a("utm_medium", "android");
            iVar.mo38778a("app", "tiktok");
            iVar.mo38778a("iid", AppLog.getInstallId());
            str2 = iVar.mo38774a();
        }
        if (shareInfo != null) {
            shareInfo.setShareUrl(str2);
        }
        return (String) C42040f.f106427a.mo86110a(shareInfo.getShareUrl()).mo6490a();
    }
}
