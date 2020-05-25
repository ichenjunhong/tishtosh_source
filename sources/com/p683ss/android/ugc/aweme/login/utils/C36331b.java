package com.p683ss.android.ugc.aweme.login.utils;

import android.os.Build.VERSION;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.login.utils.b */
public final class C36331b {
    /* renamed from: a */
    public static String m81966a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = Pattern.compile("\\+[0-9]{1,3}[ \\-]").matcher(str);
        if (matcher.find()) {
            return matcher.replaceFirst("");
        }
        return str;
    }

    /* renamed from: b */
    public static String m81967b(String str) {
        if (VERSION.SDK_INT >= 21) {
            return PhoneNumberUtils.normalizeNumber(str);
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int digit = Character.digit(charAt, 10);
            if (digit != -1) {
                sb.append(digit);
            } else if (sb.length() == 0 && charAt == '+') {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
