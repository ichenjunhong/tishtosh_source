package com.p683ss.android.ugc.aweme.services;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.EmailRevisionUtilsKt */
public final class EmailRevisionUtilsKt {
    public static final boolean getValue(int i) {
        String a = C10193n.m20607a().mo18203a(EmailAndPwdSettings.class, "setting_for_email_pwd", C10181b.m20511a().mo18175c().getSettingForEmailPwd(), "000000");
        C52711k.m112236a((Object) a, "SettingsManager.getInsta…dPwdSettings::class.java)");
        if (a.length() == 6 && a.charAt(i) == '1') {
            return true;
        }
        return false;
    }
}
