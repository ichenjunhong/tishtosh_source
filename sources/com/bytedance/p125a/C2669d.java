package com.bytedance.p125a;

import android.text.TextUtils;

/* renamed from: com.bytedance.a.d */
public final class C2669d {
    /* renamed from: a */
    public static String m7669a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = "";
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1005512447) {
            if (hashCode != -865586570) {
                if (hashCode == 3321751 && str.equals("like")) {
                    c = 2;
                }
            } else if (str.equals("trends")) {
                c = 1;
            }
        } else if (str.equals("output")) {
            c = 0;
        }
        switch (c) {
            case 0:
                str2 = "post";
                break;
            case 1:
                str2 = "dongtai";
                break;
            case 2:
                str2 = "fav";
                break;
        }
        return str2;
    }
}
