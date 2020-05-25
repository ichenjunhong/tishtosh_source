package com.p683ss.android.common.config;

import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9431p;

/* renamed from: com.ss.android.common.config.RequestValidator */
public class RequestValidator {
    public static boolean checkSSSign(String str, String str2, String str3) {
        String str4;
        if (C9431p.m18664a(str) || C9431p.m18664a(str3) || C9431p.m18664a(str2)) {
            return false;
        }
        String a = C9395d.m18571a(str3);
        StringBuilder sb = new StringBuilder("ByteDance");
        sb.append(a);
        String a2 = C9395d.m18571a(sb.toString());
        if (C9431p.m18664a(a2) || a2.length() != 32) {
            return true;
        }
        try {
            str4 = RSADecoder.decodeSign(str2);
        } catch (Throwable unused) {
            str4 = "";
        }
        return a2.equals(str4);
    }
}
