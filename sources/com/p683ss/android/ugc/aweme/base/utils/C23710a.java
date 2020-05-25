package com.p683ss.android.ugc.aweme.base.utils;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.discover.model.Position;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.lang.Character.UnicodeBlock;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.utils.a */
public final class C23710a {

    /* renamed from: a */
    public static final String f63235a = new String("&");

    /* renamed from: a */
    public static String m58194a(String str, int i, String str2) {
        int i2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i <= 0) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        int i3 = -1;
        float f = 0.0f;
        do {
            float f2 = 1.0f;
            i2 = i3 + 1;
            if (i2 >= str.length()) {
                break;
            }
            int i4 = 1;
            if (m58188a(str, i2) == 2) {
                i4 = 2;
            } else if (m58197b(str, i2)) {
                f2 = 0.5f;
            }
            i3 += i4;
            if (i3 >= str.length()) {
                break;
            }
            f += f2;
        } while (f <= ((float) i) + 0.01f);
        if (i2 >= str.length()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, i2));
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m58195a(char c) {
        UnicodeBlock of = UnicodeBlock.of(c);
        if (of == UnicodeBlock.BASIC_LATIN || of == UnicodeBlock.LATIN_1_SUPPLEMENT || of == UnicodeBlock.LATIN_EXTENDED_A || of == UnicodeBlock.LATIN_EXTENDED_B || of == UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static float m58187a(String str) {
        float f = 0.0f;
        if (str == null) {
            return 0.0f;
        }
        int i = -1;
        while (true) {
            float f2 = 1.0f;
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return f;
            }
            int i3 = 1;
            if (m58188a(str, i2) == 2) {
                i3 = 2;
            } else if (m58197b(str, i2)) {
                f2 = 0.5f;
            }
            i += i3;
            f += f2;
        }
    }

    /* renamed from: a */
    public static boolean m58196a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return TextUtils.isEmpty(str2);
        }
        return str.equals(str2);
    }

    /* renamed from: b */
    private static boolean m58197b(String str, int i) {
        if (i >= str.length()) {
            return false;
        }
        char charAt = str.charAt(i);
        if (Character.isDigit(charAt) || (Character.isLowerCase(charAt) && m58195a(charAt))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m58188a(String str, int i) {
        char charAt = str.charAt(i);
        if (55296 <= charAt && charAt <= 56319) {
            int i2 = i + 1;
            if (i2 < str.length()) {
                int charAt2 = ((charAt - 55296) * PreloadTask.BYTE_UNIT_NUMBER) + (str.charAt(i2) - 56320) + 65536;
                if (118784 <= charAt2 && charAt2 <= 128895) {
                    return 2;
                }
            }
        } else if (8448 <= charAt && charAt <= 10239) {
            return 1;
        } else {
            if (11013 <= charAt && charAt <= 11015) {
                return 1;
            }
            if (10548 <= charAt && charAt <= 10549) {
                return 1;
            }
            if ((12951 <= charAt && charAt <= 12953) || charAt == 169 || charAt == 174 || charAt == 12349 || charAt == 12336 || charAt == 11093 || charAt == 11036 || charAt == 11035 || charAt == 11088) {
                return 1;
            }
            int i3 = i + 1;
            if (i3 < str.length() && str.charAt(i3) == 8419) {
                return 2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static SpannableString m58189a(Context context, String str, List<Position> list) {
        return m58190a(context, str, list, 0);
    }

    /* renamed from: a */
    public static SpannableString m58190a(Context context, String str, List<Position> list, int i) {
        if (str == null) {
            str = "";
        }
        if (context == null || TextUtils.isEmpty(str) || C9376b.m18558a((Collection<T>) list)) {
            return new SpannableString(str);
        }
        SpannableString spannableString = new SpannableString(str);
        for (Position position : list) {
            if (position != null) {
                spannableString = m58193a(spannableString, position.getBegin() + i, position.getEnd() + 1 + i, context.getResources().getColor(R.color.a0y));
            }
        }
        return spannableString;
    }

    /* renamed from: a */
    private static SpannableString m58193a(SpannableString spannableString, int i, int i2, int i3) {
        int max = Math.max(0, i);
        if (TextUtils.isEmpty(spannableString) || max > i2 || max >= spannableString.length() || i2 > spannableString.length()) {
            return spannableString;
        }
        spannableString.setSpan(new ForegroundColorSpan(i3), max, i2, 17);
        return spannableString;
    }

    /* renamed from: a */
    public static SpannableString m58191a(Context context, String str, List<Position> list, int i, int i2) {
        if (str == null) {
            str = "";
        }
        if (context == null || TextUtils.isEmpty(str) || C9376b.m18558a((Collection<T>) list)) {
            return new SpannableString(str);
        }
        SpannableString spannableString = new SpannableString(str);
        int color = context.getResources().getColor(R.color.a0n);
        for (Position position : list) {
            if (position != null) {
                spannableString = m58193a(spannableString, position.getBegin() + 3, position.getEnd() + 3, color);
            }
        }
        return spannableString;
    }

    /* renamed from: a */
    public static SpannableString m58192a(Context context, String str, List<Position> list, int i, String str2) {
        if (str == null) {
            str = "";
        }
        if (context == null || TextUtils.isEmpty(str) || C9376b.m18558a((Collection<T>) list)) {
            return new SpannableString(str);
        }
        SpannableString spannableString = new SpannableString(str);
        int color = context.getResources().getColor(R.color.a0y);
        if (!TextUtils.isEmpty(str2)) {
            try {
                color = Color.parseColor(str2);
            } catch (Exception unused) {
            }
        }
        for (Position position : list) {
            if (position != null) {
                spannableString = m58193a(spannableString, position.getBegin() + 0, position.getEnd() + 1 + 0, color);
            }
        }
        return spannableString;
    }
}
