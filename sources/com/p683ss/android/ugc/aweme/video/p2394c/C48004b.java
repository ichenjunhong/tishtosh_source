package com.p683ss.android.ugc.aweme.video.p2394c;

import android.text.TextUtils;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;

/* renamed from: com.ss.android.ugc.aweme.video.c.b */
public final class C48004b {
    /* renamed from: a */
    public static String m103853a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("aweme/v1/play")) {
            return str;
        }
        return m103854b(str).mo38774a();
    }

    /* renamed from: b */
    public static C18922i m103854b(String str) {
        C18922i iVar = new C18922i(str);
        if (!((Boolean) SharePrefCache.inst().getTTRegion().mo47782d()).booleanValue()) {
            iVar.mo38778a("pass-region", "1");
        }
        if (!((Boolean) SharePrefCache.inst().getTTRoute().mo47782d()).booleanValue()) {
            iVar.mo38778a("pass-route", "1");
        }
        return new C18922i(AppLog.addCommonParams(iVar.toString(), true));
    }
}
