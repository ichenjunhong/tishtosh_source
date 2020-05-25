package com.airbnb.lottie.p112d;

import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: com.airbnb.lottie.d.d */
final class C2407d {
    /* renamed from: a */
    static InputStream m7067a(HttpURLConnection httpURLConnection) throws IOException {
        URLConnection uRLConnection = httpURLConnection;
        if (C18982g.m46160a(uRLConnection)) {
            C18976b.m46151a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
        }
        return httpURLConnection.getInputStream();
    }
}
