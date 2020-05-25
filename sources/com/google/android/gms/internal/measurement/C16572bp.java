package com.google.android.gms.internal.measurement;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: com.google.android.gms.internal.measurement.bp */
final class C16572bp {
    /* renamed from: a */
    static NetworkInfo m39554a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return C18978d.m46154a();
        }
    }

    /* renamed from: a */
    static InputStream m39555a(HttpURLConnection httpURLConnection) throws IOException {
        URLConnection uRLConnection = httpURLConnection;
        if (C18982g.m46160a(uRLConnection)) {
            C18976b.m46151a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
        }
        return httpURLConnection.getInputStream();
    }

    /* renamed from: a */
    static void m39556a(HttpURLConnection httpURLConnection, String str, String str2) {
        URLConnection uRLConnection = httpURLConnection;
        if (C18982g.m46160a(uRLConnection)) {
            C18976b.m46151a(uRLConnection.getURL(), str, str2, "");
        }
        httpURLConnection.setRequestProperty(str, str2);
    }
}
