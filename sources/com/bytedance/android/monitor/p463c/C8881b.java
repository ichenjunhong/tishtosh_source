package com.bytedance.android.monitor.p463c;

import java.net.URL;

/* renamed from: com.bytedance.android.monitor.c.b */
public final class C8881b {
    /* renamed from: a */
    public static String[] m17465a(String str) {
        try {
            URL url = new URL(str);
            return new String[]{url.getHost(), url.getPath()};
        } catch (Exception unused) {
            return new String[]{"", ""};
        }
    }
}
