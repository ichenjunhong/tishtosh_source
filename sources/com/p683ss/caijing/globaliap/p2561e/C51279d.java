package com.p683ss.caijing.globaliap.p2561e;

import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: com.ss.caijing.globaliap.e.d */
final class C51279d {
    /* renamed from: a */
    static void m110238a(HttpURLConnection httpURLConnection, String str, String str2) {
        URLConnection uRLConnection = httpURLConnection;
        if (C18982g.m46160a(uRLConnection)) {
            C18976b.m46151a(uRLConnection.getURL(), str, str2, "");
        }
        httpURLConnection.setRequestProperty(str, str2);
    }
}
