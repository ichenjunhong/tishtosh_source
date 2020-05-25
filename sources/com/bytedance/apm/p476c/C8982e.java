package com.bytedance.apm.p476c;

import android.text.TextUtils;
import android.util.Printer;

/* renamed from: com.bytedance.apm.c.e */
public final class C8982e implements Printer {
    public final void println(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.charAt(0) == '>') {
                C8981d.m17779a(true);
                return;
            }
            if (str.charAt(0) == '<') {
                C8981d.m17779a(false);
            }
        }
    }
}
