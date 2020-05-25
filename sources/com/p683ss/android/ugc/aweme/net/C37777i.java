package com.p683ss.android.ugc.aweme.net;

import android.text.TextUtils;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.ss.android.ugc.aweme.net.i */
public final class C37777i {
    /* renamed from: a */
    public static boolean m84365a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!TextUtils.equals(str, str2)) {
            StringBuilder sb = new StringBuilder(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(str2);
            if (!str.endsWith(sb.toString())) {
                return false;
            }
        }
        return true;
    }
}
