package com.bytedance.android.livesdk.p279af;

import android.os.Bundle;
import com.bytedance.android.live.base.model.p188b.C2964a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.af.j */
public final class C4600j {
    /* renamed from: a */
    public static C2964a m11037a(DataCenter dataCenter) {
        if (dataCenter == null) {
            return C2964a.defaultOne();
        }
        return (C2964a) dataCenter.get("data_dou_plus_promote_entry", C2964a.defaultOne());
    }

    /* renamed from: b */
    public static boolean m11040b(DataCenter dataCenter) {
        if (dataCenter == null || !((Boolean) dataCenter.get("enter_from_dou_plus", Boolean.valueOf(false))).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static Map<String, String> m11041c(DataCenter dataCenter) {
        if (dataCenter == null) {
            return new HashMap();
        }
        return (Map) dataCenter.get("live_douplus_log_extra", new HashMap());
    }

    /* renamed from: d */
    public static boolean m11043d(DataCenter dataCenter) {
        if (dataCenter == null || !((Boolean) dataCenter.get("enter_from_effect_ad", Boolean.valueOf(false))).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static Map<String, String> m11044e(DataCenter dataCenter) {
        if (dataCenter == null) {
            return new HashMap();
        }
        return (Map) dataCenter.get("live_effect_ad_log_extra_map", new HashMap());
    }

    /* renamed from: a */
    public static void m11038a(DataCenter dataCenter, Bundle bundle) {
        if (dataCenter != null && bundle != null) {
            dataCenter.lambda$put$1$DataCenter("enter_from_dou_plus", Boolean.valueOf(bundle.getBoolean("enter_from_dou_plus", false)));
            dataCenter.lambda$put$1$DataCenter("live_douplus_log_extra", bundle.getSerializable("live_douplus_log_extra"));
        }
    }

    /* renamed from: b */
    public static void m11039b(DataCenter dataCenter, Bundle bundle) {
        if (dataCenter != null && bundle != null) {
            dataCenter.lambda$put$1$DataCenter("enter_from_effect_ad", Boolean.valueOf(bundle.getBoolean("enter_from_effect_ad", false)));
            dataCenter.lambda$put$1$DataCenter("live_effect_ad_log_extra_map", bundle.getSerializable("live_effect_ad_log_extra_map"));
        }
    }

    /* renamed from: c */
    public static void m11042c(DataCenter dataCenter, Bundle bundle) {
        if (bundle != null && dataCenter != null) {
            if (bundle.getBoolean("enter_from_effect_ad", false)) {
                bundle.remove("enter_from_effect_ad");
                bundle.remove("live_effect_ad_log_extra_map");
                dataCenter.lambda$put$1$DataCenter("enter_from_effect_ad", Boolean.valueOf(false));
                dataCenter.lambda$put$1$DataCenter("live_effect_ad_log_extra_map", new HashMap());
            }
            if (bundle.getBoolean("enter_from_dou_plus", false)) {
                bundle.remove("enter_from_dou_plus");
                bundle.remove("live_douplus_log_extra");
                dataCenter.lambda$put$1$DataCenter("enter_from_dou_plus", Boolean.valueOf(false));
                dataCenter.lambda$put$1$DataCenter("live_douplus_log_extra", new HashMap());
            }
        }
    }
}
