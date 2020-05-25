package com.bytedance.android.livesdk.p279af;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.af.a */
public enum C4550a {
    LINK_MIC(new String[]{"df_live_zego_link", "df_live_byte_link"}, new String[]{"bytertc", "zegoliveroom"}, LiveConfigSettingKeys.LIVE_TEST_SKIP_LINK_MIC_BUNDLE_CHECK),
    QUIC(new String[]{"df_live_quic"}, new String[]{"ttquic"}, LiveConfigSettingKeys.LIVE_TEST_SKIP_QUIC_BUNDLE_CHECK),
    CMAF(new String[]{"df_live_cmaf"}, new String[]{"ttffmpeg", "ttmcmaf"}, LiveConfigSettingKeys.LIVE_TEST_SKIP_CMAF_BUNDLE_CHECK);
    

    /* renamed from: a */
    private static SharedPreferences f12500a;
    public String[] appBundles;
    public C4097p<Boolean> gate;
    public String[] soNames;

    public final boolean gateClosed() {
        Boolean bool = (Boolean) this.gate.mo9431a();
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m10938a(Context context) {
        if (f12500a == null) {
            f12500a = C35807d.m80935a(context, "live_plugins_installed", 0);
        }
    }

    public final void cacheInstalledStatus(Context context) {
        m10938a(context);
        Set stringSet = f12500a.getStringSet("plugins_installed", null);
        if (stringSet == null) {
            stringSet = new HashSet(this.appBundles.length);
        }
        Collections.addAll(stringSet, this.appBundles);
        f12500a.edit().putStringSet("plugins_installed", stringSet).apply();
    }

    public final boolean previouslyInstalled(Context context) {
        m10938a(context);
        Set stringSet = f12500a.getStringSet("plugins_installed", null);
        if (stringSet == null || stringSet.isEmpty()) {
            return false;
        }
        for (String contains : this.appBundles) {
            if (!stringSet.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    private C4550a(String[] strArr, String[] strArr2, C4097p<Boolean> pVar) {
        this.appBundles = strArr;
        this.soNames = strArr2;
        this.gate = pVar;
    }
}
