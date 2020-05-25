package com.bytedance.common.p518a;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.bytedance.common.a.f */
final class C9343f {

    /* renamed from: a */
    static boolean f25575a;

    /* renamed from: b */
    static DateFormat f25576b;

    static {
        try {
            f25576b = new SimpleDateFormat("HH:mm:ss");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static void m18512a(String str) {
        if (f25575a && str != null && f25576b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(f25576b.format(new Date()));
            sb.append(" ");
            sb.append(str);
        }
    }
}
