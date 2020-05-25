package com.p683ss.android.ugc.aweme.settings;

import com.bytedance.apm.C8936b;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.settings.a */
public final class C41912a {

    /* renamed from: a */
    private static Random f106070a = new Random();

    /* renamed from: a */
    static final /* synthetic */ Object m91856a(IESSettingsProxy iESSettingsProxy) throws Exception {
        try {
            if (f106070a.nextInt(10000) != 0) {
                return null;
            }
            m91857a(iESSettingsProxy.getShowQqdownloaderPrivacyDialog(), C32816h.m75716b().getShowQqdownloaderPrivacyDialog(), false, "show_qqdownloader_privacy_dialog");
            m91857a(iESSettingsProxy.getCloseLoginAgreement(), C32816h.m75716b().getCloseLoginAgreement(), false, "close_login_agreement");
            m91857a(iESSettingsProxy.getAdFeSettings(), C32816h.m75716b().getAdFeSettings(), false, "close_login_agreement");
            m91857a(iESSettingsProxy.getApiAlogWhiteList(), C32816h.m75716b().getApiAlogWhiteList(), false, "close_login_agreement");
            return null;
        } catch (Throwable unused) {
            m91857a(null, null, true, "error");
        }
    }

    /* renamed from: a */
    private static void m91857a(Object obj, Object obj2, boolean z, String str) {
        boolean z2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("settings_key", str);
            jSONObject.put("settings_reader_value", obj);
            jSONObject.put("settings_direct_value", obj2);
            String str2 = "settings_read_same";
            if (obj == obj2) {
                z2 = true;
            } else {
                z2 = false;
            }
            jSONObject.put(str2, z2);
            jSONObject.put("error", z);
            C8936b.m17655a("aweme_monitor_settings_same_report", jSONObject);
        } catch (Throwable unused) {
        }
    }
}
