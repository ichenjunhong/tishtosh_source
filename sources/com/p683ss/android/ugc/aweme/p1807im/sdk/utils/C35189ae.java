package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ae */
public final class C35189ae {
    /* renamed from: b */
    public static boolean m79441b() {
        String str;
        String language = Locale.CHINESE.getLanguage();
        Locale a = m79440a();
        if (a == null) {
            str = "";
        } else {
            str = a.getLanguage();
        }
        return TextUtils.equals(language, str);
    }

    /* renamed from: a */
    public static Locale m79440a() {
        if (VERSION.SDK_INT >= 24) {
            return C11010c.m22280a().getResources().getConfiguration().getLocales().get(0);
        }
        return C11010c.m22280a().getResources().getConfiguration().locale;
    }
}
