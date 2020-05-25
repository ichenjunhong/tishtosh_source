package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b;

import android.text.TextUtils;
import com.github.p994a.p995a.C14721a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.a */
public final class C34839a {
    /* renamed from: b */
    public static boolean m78907b(char c) {
        return Character.isDigit(c);
    }

    /* renamed from: a */
    public static boolean m78904a(char c) {
        if (Character.isUpperCase(c) || Character.isLowerCase(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m78909c(char c) {
        return Pattern.compile("[\\p{P}\\p{S}\\p{Z}]").matcher(String.valueOf(c)).matches();
    }

    /* renamed from: a */
    public static boolean m78905a(String str) {
        try {
            Matcher matcher = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)").matcher(str);
            if (!matcher.find() || str.indexOf(matcher.group()) != 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static String m78906b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(C14721a.m30100a(str.charAt(i)).charAt(0));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m78908c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String trim = str.trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < trim.length(); i++) {
            sb.append(C14721a.m30100a(trim.charAt(i)));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static String m78910d(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (i2 < 12) {
            if (i3 < str.length()) {
                char charAt = str.charAt(i3);
                if (Character.isUpperCase(charAt)) {
                    i = str.charAt(i3) - 'A';
                } else if (Character.isLowerCase(charAt)) {
                    i = (str.charAt(i3) - 'a') + 26;
                    if (i3 == 0) {
                        i -= 26;
                    }
                } else if (m78907b(charAt)) {
                    i = (str.charAt(i3) - '0') + 52;
                } else if (m78909c(charAt)) {
                    i = 62;
                } else if (m78905a(str.substring(i3))) {
                    i = 64;
                } else {
                    i = 63;
                }
            } else {
                i = 0;
            }
            if (i < 10) {
                sb.append("0");
            }
            if (i == 64) {
                i3++;
            }
            sb.append(String.valueOf(i));
            i2++;
            i3++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m78903a(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || str.contains(str4)) {
            return str4;
        }
        String lowerCase = m78908c(str4).toLowerCase();
        StringBuilder sb = new StringBuilder();
        int indexOf = str3.indexOf(lowerCase);
        int indexOf2 = str2.indexOf(lowerCase);
        int i = 0;
        if (indexOf2 != -1) {
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                int length = C14721a.m30100a(str.charAt(i)).toLowerCase().length() + i2;
                if (i2 >= indexOf2 && i2 < lowerCase.length() + indexOf2) {
                    sb.append(str.charAt(i));
                    i3++;
                } else if (length > indexOf2 && length <= lowerCase.length() + indexOf2) {
                    sb.append(str.charAt(i));
                    i3++;
                } else if (indexOf2 > i2 && indexOf2 < length) {
                    sb.append(str.charAt(i));
                    i3++;
                }
                i++;
                i2 = length;
            }
            i = i3;
        }
        if (indexOf != -1 && indexOf < str.length() && lowerCase.length() > i) {
            return str.substring(indexOf, Math.min(str.length(), lowerCase.length() + indexOf));
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            return sb.toString();
        }
        return lowerCase;
    }
}
