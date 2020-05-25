package com.p683ss.android.ugc.aweme.account.login;

import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.account.login.x */
public final class C22041x {
    /* renamed from: a */
    public static boolean m54771a(String str) {
        return Pattern.compile("^[a-zA-Z0-9~!@#\\$%\\^&\\*\\(\\)_\\+\\-=\\?]{1,}$").matcher(str).matches();
    }
}
