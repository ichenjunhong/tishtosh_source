package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.statisticlogger.C11049a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.C53576d;
import p2628d.p2639f.p2641b.C52711k;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.SdkRequestHeaderSettings */
public final class SdkRequestHeaderSettings {
    @C10179b
    private static final boolean DEFAULT = false;
    public static final SdkRequestHeaderSettings INSTANCE = new SdkRequestHeaderSettings();
    private static Map<String, String> headerMapCache;
    private static boolean needRebuild;

    private SdkRequestHeaderSettings() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public static final void clearRequestHeaderCache() {
        synchronized (INSTANCE) {
            headerMapCache = null;
            needRebuild = true;
        }
    }

    private final Map<String, String> buildRequestHeader() {
        needRebuild = false;
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        String a = C11049a.m22365a();
        if (!TextUtils.isEmpty(a)) {
            String str = "iid";
            if (a == null) {
                C52711k.m112234a();
            }
            linkedHashMap.put(str, a);
        } else {
            needRebuild = true;
        }
        int j = C11010c.m22289j();
        if (j <= 0) {
            needRebuild = true;
        }
        linkedHashMap.put("aid", String.valueOf(j));
        String a2 = C53576d.m113856a();
        if (!TextUtils.isEmpty(a2)) {
            C52711k.m112236a((Object) a2, "userAgent");
            linkedHashMap.put("user-agent", a2);
        } else {
            needRebuild = true;
        }
        String f = C35265e.m79735f();
        if (!TextUtils.isEmpty(f)) {
            C52711k.m112236a((Object) f, "simMccMnc");
            linkedHashMap.put("sim_mcc_mnc", f);
        }
        String e = C35265e.m79734e();
        if (!TextUtils.isEmpty(e)) {
            C52711k.m112236a((Object) e, "netMccMnc");
            linkedHashMap.put("net_mcc_mnc", e);
        }
        return linkedHashMap;
    }

    public static final Map<String, String> getRequestHeader() {
        if (C10193n.m20607a().mo18204a(SdkRequestHeaderSettings.class, "im_sdk_request_header_disable_cache", C10181b.m20511a().mo18175c().getImSdkRequestHeaderDisableCache(), false)) {
            return INSTANCE.buildRequestHeader();
        }
        synchronized (INSTANCE) {
            if (headerMapCache == null || needRebuild) {
                headerMapCache = INSTANCE.buildRequestHeader();
            }
        }
        Map<String, String> map = headerMapCache;
        if (map == null) {
            C52711k.m112234a();
        }
        return map;
    }
}
