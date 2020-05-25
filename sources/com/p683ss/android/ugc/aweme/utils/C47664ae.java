package com.p683ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.router.C41312z;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.ae */
public final class C47664ae {
    /* renamed from: a */
    public static String m103172a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains("challenge/detail")) {
            List a = C41312z.m91070a(str);
            if (a != null && a.size() > 0) {
                str2 = (String) a.get(a.size() - 1);
            }
        }
        return str2;
    }
}
