package com.bytedance.android.live.core.setting;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.LoginGuideConfig;
import com.bytedance.android.live.core.p230g.C3922z;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.core.setting.g */
public final class C4085g {
    /* renamed from: b */
    public static String m10201b() {
        LoginGuideConfig loginGuideConfig = (LoginGuideConfig) CoreSettingKeys.LOGIN_GUIDE.mo9431a();
        if (loginGuideConfig == null) {
            return null;
        }
        return loginGuideConfig.getImageUrlFromFollow();
    }

    /* renamed from: a */
    public static String m10200a() {
        LoginGuideConfig loginGuideConfig = (LoginGuideConfig) CoreSettingKeys.LOGIN_GUIDE.mo9431a();
        if (loginGuideConfig == null || TextUtils.isEmpty(loginGuideConfig.getFromFollow())) {
            return C3922z.m9903a((int) R.string.e6x);
        }
        return loginGuideConfig.getFromFollow();
    }
}
