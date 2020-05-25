package com.p683ss.android.common.util;

import android.content.Context;
import com.p683ss.android.common.util.MultiProcessSharedProvider.C18902b;

/* renamed from: com.ss.android.common.util.d */
public final class C18917d {
    /* renamed from: a */
    public static String m46043a(Context context, int i) {
        String str;
        String str2;
        try {
            C18902b b = MultiProcessSharedProvider.m46020b(context);
            if (b == null) {
                return "";
            }
            str = b.mo38760a("dns", "");
            if (str instanceof String) {
                str2 = String.valueOf(str);
            } else {
                str2 = "";
            }
            return str2;
        } catch (Exception unused) {
            str = "";
        }
    }
}
