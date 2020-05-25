package com.p683ss.p1096a.p1097a;

import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: com.ss.a.a.c */
final class C18480c {
    /* renamed from: a */
    static void m44724a(HttpURLConnection httpURLConnection, String str, String str2) {
        URLConnection uRLConnection = httpURLConnection;
        if (C18982g.m46160a(uRLConnection)) {
            C18976b.m46151a(uRLConnection.getURL(), str, str2, "");
        }
        httpURLConnection.addRequestProperty(str, str2);
    }
}
