package com.p683ss.android.p1103ad.splash.p1123g;

import android.util.Base64;
import java.text.SimpleDateFormat;

/* renamed from: com.ss.android.ad.splash.g.o */
public final class C18751o {
    /* renamed from: a */
    public static String m45748a(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(Long.valueOf(j));
    }

    /* renamed from: a */
    public static String m45749a(String str) {
        String str2 = "";
        if (C18747l.m45742a(str)) {
            return str2;
        }
        try {
            return new String(Base64.decode(str, 0), "utf-8");
        } catch (Throwable unused) {
            C18741g.m45694a("error decoding video url");
            return str2;
        }
    }
}
