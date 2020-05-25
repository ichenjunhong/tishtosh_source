package com.p683ss.android.ugc.aweme.account.utils.experiments;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "m_bind_phone_after_third_party_login")
/* renamed from: com.ss.android.ugc.aweme.account.utils.experiments.BindPhoneAfterThirdPartyLogin */
public final class BindPhoneAfterThirdPartyLogin {
    public static final BindPhoneAfterThirdPartyLogin INSTANCE = new BindPhoneAfterThirdPartyLogin();
    @C10179b(mo18165a = false)
    public static final boolean NEED_BIND_PHONE_AFTER_THIRD_PARTY_LOGIN = true;
    @C10179b(mo18165a = true)
    public static final boolean NO_NEED_BIND_PHONE_AFTER_THIRD_PARTY_LOGIN = false;

    private BindPhoneAfterThirdPartyLogin() {
    }
}
