package com.bytedance.android.live.core.p230g;

import android.text.TextUtils;

/* renamed from: com.bytedance.android.live.core.g.s */
public final class C3912s {
    /* renamed from: a */
    public static String m9889a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "-1";
        }
        if (str.contains("_")) {
            return str;
        }
        return TextUtils.concat(new CharSequence[]{str, "_", "0"}).toString();
    }
}
