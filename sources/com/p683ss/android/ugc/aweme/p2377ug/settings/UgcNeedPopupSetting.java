package com.p683ss.android.ugc.aweme.p2377ug.settings;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.ug.settings.UgcNeedPopupSetting */
public final class UgcNeedPopupSetting {
    public static final UgcNeedPopupSetting INSTANCE = new UgcNeedPopupSetting();
    @C10179b
    private static final boolean VALUE = false;

    private UgcNeedPopupSetting() {
    }

    public final boolean getVALUE() {
        return VALUE;
    }

    public final boolean needRequestShowUgcPopupApi() {
        try {
            return C10193n.m20607a().mo18204a(UgcNeedPopupSetting.class, "need_call_user_agreement_and_ugc_popup", C10181b.m20511a().mo18175c().getNeedCallUserAgreementAndUgcPopup(), false);
        } catch (Exception unused) {
            return false;
        }
    }
}
