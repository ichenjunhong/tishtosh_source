package com.squareup.p1094a;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import com.squareup.p1094a.C18382l.C18383a;
import com.squareup.p1094a.C18382l.C18384b;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.squareup.a.ah */
public final class C18353ah implements C18382l {

    /* renamed from: a */
    static volatile Object f50698a;

    /* renamed from: b */
    private static final Object f50699b = new Object();

    /* renamed from: c */
    private static final ThreadLocal<StringBuilder> f50700c = new ThreadLocal<StringBuilder>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new StringBuilder();
        }
    };

    /* renamed from: d */
    private final Context f50701d;

    public C18353ah(Context context) {
        this.f50701d = context.getApplicationContext();
    }

    /* renamed from: a */
    public final C18383a mo36800a(Uri uri, int i) throws IOException {
        String str;
        if (VERSION.SDK_INT >= 14) {
            Context context = this.f50701d;
            if (f50698a == null) {
                try {
                    synchronized (f50699b) {
                        if (f50698a == null) {
                            File b = C18356aj.m44601b(context);
                            HttpResponseCache installed = HttpResponseCache.getInstalled();
                            if (installed == null) {
                                installed = HttpResponseCache.install(b, C18356aj.m44588a(b));
                            }
                            f50698a = installed;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(IFoundationAVService.MUSIC_LENGTH_FOR_COPYRIGHT);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setUseCaches(true);
        if (i != 0) {
            if (C18392s.isOfflineOnly(i)) {
                str = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = (StringBuilder) f50700c.get();
                sb.setLength(0);
                if (!C18392s.shouldReadFromDiskCache(i)) {
                    sb.append("no-cache");
                }
                if (!C18392s.shouldWriteToDiskCache(i)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                str = sb.toString();
            }
            C18355ai.m44585a(httpURLConnection, "Cache-Control", str);
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 300) {
            long headerFieldInt = (long) httpURLConnection.getHeaderFieldInt("Content-Length", -1);
            return new C18383a(C18355ai.m44584a(httpURLConnection), C18356aj.m44600a(httpURLConnection.getHeaderField("X-Android-Response-Source")), headerFieldInt);
        }
        httpURLConnection.disconnect();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(responseCode);
        sb2.append(" ");
        sb2.append(httpURLConnection.getResponseMessage());
        throw new C18384b(sb2.toString(), i, responseCode);
    }
}
