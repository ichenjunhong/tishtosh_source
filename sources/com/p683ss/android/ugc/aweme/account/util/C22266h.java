package com.p683ss.android.ugc.aweme.account.util;

import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;

/* renamed from: com.ss.android.ugc.aweme.account.util.h */
public final class C22266h {
    /* renamed from: a */
    public static String m55115a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5);
            }
            return C9395d.m18573a(bytes, 0, bytes.length);
        } catch (Exception unused) {
            return str;
        }
    }
}
