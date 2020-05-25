package com.bytedance.ies.p675g.p677b;

import android.text.TextUtils;

/* renamed from: com.bytedance.ies.g.b.aa */
final class C10774aa {

    /* renamed from: a */
    static boolean f28965a;

    /* renamed from: a */
    static String m21844a() {
        return "";
    }

    /* renamed from: a */
    static String m21846a(Throwable th) {
        int i;
        StringBuilder sb = new StringBuilder("{\"code\":");
        if (th instanceof C10808t) {
            i = ((C10808t) th).f29041a;
        } else {
            i = 0;
        }
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    static String m21845a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String str3 = "";
        if (f28965a) {
            str3 = str.substring(1, str.length() - 1);
        }
        StringBuilder sb = new StringBuilder("{\"code\":1,\"__data\":");
        sb.append(str);
        String sb2 = sb.toString();
        if (!str3.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(",");
            sb3.append(str3);
            sb3.append("}");
            str2 = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("}");
            str2 = sb4.toString();
        }
        return str2;
    }
}
