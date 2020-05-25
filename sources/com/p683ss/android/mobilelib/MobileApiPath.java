package com.p683ss.android.mobilelib;

import com.p683ss.android.p1140c.C18845b;

/* renamed from: com.ss.android.mobilelib.MobileApiPath */
public final class MobileApiPath {
    public static final String USER_BIND_MOBILE = m47798si("/passport/mobile/bind/v2/");
    public static final String USER_CHANGE_MOBILE = m47798si("/passport/mobile/change/");
    public static final String USER_CHANGE_PASSWORD = m47798si("/passport/password/change/");
    public static final String USER_LOGIN = m47798si("/passport/mobile/login/");
    public static final String USER_REFRESH_CAPTCHA = m47798si("/passport/mobile/refresh_captcha/");
    public static final String USER_REGISTER = m47798si("/passport/mobile/register/");
    public static final String USER_RESET_PASSWORD = m47798si("/passport/password/reset/");
    public static final String USER_SEND_CODE = m47798si("/passport/mobile/send_code/");
    public static final String USER_UNBIND_MOBILE = m47798si("/user/mobile/unbind_mobile/");

    /* renamed from: si */
    static String m47798si(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C18845b.f52040e);
        sb.append(str);
        return sb.toString();
    }
}
