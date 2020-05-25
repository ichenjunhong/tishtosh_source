package com.p683ss.android.ugc.aweme.p1706fe.utils;

import android.os.Build;
import android.os.Build.VERSION;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.fe.utils.b */
public final class C29971b {
    /* renamed from: a */
    public static Map<String, String> m70116a(List<String> list) {
        HashMap hashMap = new HashMap();
        hashMap.put("appVersion", C11010c.m22288i());
        hashMap.put("device_id", TeaAgent.getServerDeviceId());
        hashMap.put("netType", NetworkUtils.getNetworkAccessType(C11010c.m22280a()));
        hashMap.put("appName", C11010c.m22283d());
        hashMap.put("aid", String.valueOf(C11010c.m22289j()));
        hashMap.put("user_id", C20854a.m53167g().getCurUserId());
        hashMap.put("versionCode", String.valueOf(C11010c.m22287h()));
        hashMap.put("channel", C11010c.m22295p());
        hashMap.put("os_version", VERSION.RELEASE);
        hashMap.put("device_platform", "android");
        hashMap.put("ironManSupported", String.valueOf(C36983a.m83185b().mo76294a().checkMiniAppEnable(C11010c.m22280a())));
        hashMap.put("prefetch_enable", "1");
        hashMap.put("device_type", Build.MODEL);
        if (list != null) {
            for (String remove : list) {
                hashMap.remove(remove);
            }
        }
        return hashMap;
    }
}
