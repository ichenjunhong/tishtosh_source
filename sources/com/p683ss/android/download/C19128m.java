package com.p683ss.android.download;

import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: com.ss.android.download.m */
final class C19128m {
    /* renamed from: a */
    static InputStream m46620a(HttpURLConnection httpURLConnection) throws IOException {
        URLConnection uRLConnection = httpURLConnection;
        if (C18982g.m46160a(uRLConnection)) {
            C18976b.m46151a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
        }
        return httpURLConnection.getInputStream();
    }

    /* renamed from: a */
    static void m46621a(HttpURLConnection httpURLConnection, String str, String str2) {
        URLConnection uRLConnection = httpURLConnection;
        if (C18982g.m46160a(uRLConnection)) {
            C18976b.m46151a(uRLConnection.getURL(), str, str2, "");
        }
        httpURLConnection.addRequestProperty(str, str2);
    }
}
