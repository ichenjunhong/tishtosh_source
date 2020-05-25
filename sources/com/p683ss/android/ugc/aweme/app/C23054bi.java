package com.p683ss.android.ugc.aweme.app;

import android.net.Uri;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.app.bi */
final /* synthetic */ class C23054bi implements Callable {

    /* renamed from: a */
    private final C23053bh f61419a;

    /* renamed from: b */
    private final Uri f61420b;

    C23054bi(C23053bh bhVar, Uri uri) {
        this.f61419a = bhVar;
        this.f61420b = uri;
    }

    public final Object call() {
        C23053bh bhVar = this.f61419a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f61420b.toString()).openConnection();
        httpURLConnection.setRequestMethod("GET");
        C23056bk.m56584a(httpURLConnection, "accept", "*/*");
        C23056bk.m56584a(httpURLConnection, "connection", "Keep-Alive");
        httpURLConnection.setInstanceFollowRedirects(false);
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        return headerField;
    }
}
