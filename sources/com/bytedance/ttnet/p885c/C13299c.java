package com.bytedance.ttnet.p885c;

import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.frameworks.baselib.network.http.C9918f;
import com.bytedance.frameworks.baselib.network.http.p573d.C9893d;
import com.bytedance.frameworks.baselib.network.http.p574e.C9915j;
import com.bytedance.ttnet.C13303d;
import com.bytedance.ttnet.p887e.C13333g;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.c.c */
public final class C13299c {
    /* renamed from: a */
    public static String m26783a(String str, Map<String, String> map, Map<String, List<String>> map2, C13296a aVar) throws Throwable {
        String str2;
        String str3;
        HttpURLConnection httpURLConnection = null;
        if (C9431p.m18664a(str) || !C13301d.m26787a(C13303d.m26799b().mo24896a())) {
            return null;
        }
        try {
            final String a = C9894e.m19815a(str, true);
            final HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(a).openConnection();
            try {
                httpURLConnection2.setRequestMethod("GET");
                httpURLConnection2.setConnectTimeout(C9894e.m19830d());
                httpURLConnection2.setReadTimeout(C9894e.m19831e());
                httpURLConnection2.setInstanceFollowRedirects(true);
                C13301d.m26786a(httpURLConnection2, "Accept-Encoding", "gzip");
                if (aVar.f34687h) {
                    str2 = " HttpsURLConnection";
                } else {
                    str2 = " HttpURLConnection";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(C9894e.m19832f());
                sb.append(str2);
                C13301d.m26786a(httpURLConnection2, "User-Agent", sb.toString());
                int responseCode = httpURLConnection2.getResponseCode();
                aVar.f34680a = responseCode;
                if (!(map2 == null || httpURLConnection2.getHeaderFields() == null)) {
                    map2.putAll(httpURLConnection2.getHeaderFields());
                }
                if (!aVar.f34687h) {
                    aVar.f34684e = httpURLConnection2.getHeaderField("X-SS-SIGN");
                }
                if (responseCode == 200) {
                    URLConnection uRLConnection = httpURLConnection2;
                    if (C18982g.m46160a(uRLConnection)) {
                        C18976b.m46151a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
                    }
                    InputStream inputStream = httpURLConnection2.getInputStream();
                    boolean equals = "gzip".equals(httpURLConnection2.getHeaderField("Content-Encoding"));
                    String headerField = httpURLConnection2.getHeaderField("Content-Type");
                    boolean a2 = C9893d.m19809a(headerField);
                    Pair a3 = C13333g.m26856a(headerField);
                    if (a3 == null || a3.second == null || !Charset.isSupported((String) a3.second)) {
                        str3 = null;
                    } else {
                        str3 = (String) a3.second;
                    }
                    if (str3 == null) {
                        str3 = "UTF-8";
                    }
                    int[] iArr = {0};
                    byte[] a4 = C9893d.m19811a(equals, -1, inputStream, iArr, new C9918f() {
                        /* renamed from: a */
                        public final URI mo17854a() {
                            try {
                                return C9915j.m19868a(a);
                            } catch (RuntimeException unused) {
                                return null;
                            }
                        }

                        /* renamed from: b */
                        public final void mo17855b() {
                            try {
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    if (a4 != null && iArr[0] > 0) {
                        if (iArr[0] <= a4.length) {
                            if (a2) {
                                C9893d.m19806a(a4, iArr[0]);
                            }
                            String str4 = new String(a4, 0, iArr[0], str3);
                            if (httpURLConnection2 != null) {
                                try {
                                    httpURLConnection2.disconnect();
                                } catch (Exception unused) {
                                }
                            }
                            return str4;
                        }
                    }
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused2) {
                        }
                    }
                    return null;
                }
                StringBuilder sb2 = new StringBuilder("err status = ");
                sb2.append(responseCode);
                throw new IOException(sb2.toString());
            } catch (Throwable th) {
                th = th;
                if (httpURLConnection2 != null) {
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
