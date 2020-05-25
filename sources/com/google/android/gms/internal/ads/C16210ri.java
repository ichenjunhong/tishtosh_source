package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.internal.ads.ri */
final class C16210ri extends FilterInputStream {

    /* renamed from: a */
    private final HttpURLConnection f45488a;

    public final void close() throws IOException {
        super.close();
        this.f45488a.disconnect();
    }

    C16210ri(HttpURLConnection httpURLConnection) {
        super(C16182qh.m38653a(httpURLConnection));
        this.f45488a = httpURLConnection;
    }
}
