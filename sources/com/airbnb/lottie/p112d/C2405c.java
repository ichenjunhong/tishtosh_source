package com.airbnb.lottie.p112d;

import android.content.Context;
import android.support.p030v4.p038f.C0794k;
import com.airbnb.lottie.C2340c;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.C2442f;
import com.airbnb.lottie.C2475k;
import com.airbnb.lottie.C2476l;
import com.taobao.android.dexposed.ClassUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.d.c */
public final class C2405c {

    /* renamed from: a */
    private final Context f7511a;

    /* renamed from: b */
    private final String f7512b;

    /* renamed from: c */
    private final C2404b f7513c;

    /* renamed from: b */
    private C2476l<C2408e> m7063b() {
        return new C2476l<>(new Callable<C2475k<C2408e>>() {
            public final /* synthetic */ Object call() throws Exception {
                return C2405c.this.mo6775a();
            }
        });
    }

    /* renamed from: c */
    private C2408e m7064c() {
        C2475k kVar;
        C0794k a = this.f7513c.mo6773a();
        if (a == null) {
            return null;
        }
        C2403a aVar = (C2403a) a.f2711a;
        InputStream inputStream = (InputStream) a.f2712b;
        if (aVar == C2403a.Zip) {
            kVar = C2442f.m7133a(new ZipInputStream(inputStream), this.f7512b);
        } else {
            kVar = C2442f.m7141b(inputStream, this.f7512b);
        }
        if (kVar.f7660a != null) {
            return (C2408e) kVar.f7660a;
        }
        return null;
    }

    /* renamed from: a */
    public final C2475k<C2408e> mo6775a() {
        C2408e c = m7064c();
        if (c != null) {
            return new C2475k<>(c);
        }
        StringBuilder sb = new StringBuilder("Animation for ");
        sb.append(this.f7512b);
        sb.append(" not found in cache. Fetching from network.");
        return m7065d();
    }

    /* renamed from: d */
    private C2475k<C2408e> m7065d() {
        C2403a aVar;
        C2475k<C2408e> kVar;
        try {
            new StringBuilder("Fetching ").append(this.f7512b);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f7512b).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null) {
                if (httpURLConnection.getResponseCode() == 200) {
                    String contentType = httpURLConnection.getContentType();
                    char c = 65535;
                    int hashCode = contentType.hashCode();
                    boolean z = false;
                    if (hashCode != -1248325150) {
                        if (hashCode == -43840953) {
                            if (contentType.equals("application/json")) {
                                c = 1;
                            }
                        }
                    } else if (contentType.equals("application/zip")) {
                        c = 0;
                    }
                    if (c != 0) {
                        aVar = C2403a.Json;
                        kVar = C2442f.m7141b((InputStream) new FileInputStream(new File(this.f7513c.mo6774a(C2407d.m7067a(httpURLConnection), aVar).getAbsolutePath())), this.f7512b);
                    } else {
                        aVar = C2403a.Zip;
                        kVar = C2442f.m7133a(new ZipInputStream(new FileInputStream(this.f7513c.mo6774a(C2407d.m7067a(httpURLConnection), aVar))), this.f7512b);
                    }
                    if (kVar.f7660a != null) {
                        C2404b bVar = this.f7513c;
                        File file = new File(bVar.f7509a.getCacheDir(), C2404b.m7059a(bVar.f7510b, aVar, true));
                        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
                        boolean renameTo = file.renameTo(file2);
                        StringBuilder sb = new StringBuilder("Copying temp file to real file (");
                        sb.append(file2);
                        sb.append(")");
                        if (!renameTo) {
                            StringBuilder sb2 = new StringBuilder("Unable to rename cache file ");
                            sb2.append(file.getAbsolutePath());
                            sb2.append(" to ");
                            sb2.append(file2.getAbsolutePath());
                            sb2.append(ClassUtils.PACKAGE_SEPARATOR);
                            C2340c.m6968a(sb2.toString());
                        }
                    }
                    StringBuilder sb3 = new StringBuilder("Completed fetch from network. Success: ");
                    if (kVar.f7660a != null) {
                        z = true;
                    }
                    sb3.append(z);
                    return kVar;
                }
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb4 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb4.append(readLine);
                    sb4.append(10);
                } else {
                    StringBuilder sb5 = new StringBuilder("Unable to fetch ");
                    sb5.append(this.f7512b);
                    sb5.append(". Failed with ");
                    sb5.append(httpURLConnection.getResponseCode());
                    sb5.append("\n");
                    sb5.append(sb4);
                    return new C2475k<>((Throwable) new IllegalArgumentException(sb5.toString()));
                }
            }
        } catch (IOException e) {
            return new C2475k<>((Throwable) e);
        }
    }

    /* renamed from: a */
    public static C2476l<C2408e> m7062a(Context context, String str) {
        return new C2405c(context, str).m7063b();
    }

    public C2405c(Context context, String str) {
        this.f7511a = context.getApplicationContext();
        this.f7512b = str;
        this.f7513c = new C2404b(this.f7511a, str);
    }
}
