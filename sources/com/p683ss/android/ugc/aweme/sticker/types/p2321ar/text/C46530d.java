package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.d */
public final class C46530d {
    /* renamed from: a */
    public static String m100988a(Context context) {
        Locale locale;
        if (context == null) {
            return "zh-CN";
        }
        try {
            if (VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = context.getResources().getConfiguration().locale;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage());
            sb.append("-");
            sb.append(locale.getCountry());
            return sb.toString();
        } catch (Exception unused) {
            return "zh-CN";
        }
    }
}
