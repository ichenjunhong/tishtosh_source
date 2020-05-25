package com.p683ss.android.ugc.aweme.services;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.settings.PhoneBindFlowSettings;

/* renamed from: com.ss.android.ugc.aweme.services.PasswordRevisionUtils */
public final class PasswordRevisionUtils {
    public static final PasswordRevisionUtils INSTANCE = new PasswordRevisionUtils();

    private PasswordRevisionUtils() {
    }

    public final boolean isDirectlyChangePwdForEmail() {
        return EmailRevisionUtilsKt.getValue(4);
    }

    public final boolean isDirectlyChangePwdForPhone() {
        return EmailRevisionUtilsKt.getValue(5);
    }

    public final boolean isNeedVerifyEmail() {
        return EmailRevisionUtilsKt.getValue(3);
    }

    public final boolean isNeedBindService() {
        if (!EmailRevisionUtilsKt.getValue(2) || !C10193n.m20607a().mo18204a(PhoneBindFlowSettings.class, "enable_new_phone_bind_flow", C10181b.m20511a().mo18175c().getEnableNewPhoneBindFlow(), true)) {
            return false;
        }
        return true;
    }
}
