package com.p683ss.android.socialbase.downloader.impls;

import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.model.HttpHeader;
import com.p683ss.android.socialbase.downloader.p1216f.C19926e;
import com.p683ss.android.socialbase.downloader.p1216f.C19927f;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53506ae;
import okhttp3.C53524e;
import okhttp3.C53682y;

/* renamed from: com.ss.android.socialbase.downloader.impls.g */
public class C19965g implements C19927f {
    /* renamed from: a */
    public final C19926e mo13390a(int i, String str, List<HttpHeader> list) throws IOException {
        final InputStream inputStream;
        C53682y k = C19884b.m48614k();
        if (k != null) {
            C53499a a = new C53499a().mo111262a(str);
            if (list != null && list.size() > 0) {
                for (HttpHeader httpHeader : list) {
                    a.mo111271b(httpHeader.f55085a, C19994e.m49379d(httpHeader.f55086b));
                }
            }
            final C53524e a2 = k.mo111325a(a.mo111272c());
            final C53504ad b = a2.mo111247b();
            if (b != null) {
                final C53506ae aeVar = b.f132404g;
                if (aeVar == null) {
                    return null;
                }
                InputStream byteStream = aeVar.byteStream();
                String b2 = b.mo111276b("Content-Encoding");
                if (b2 == null || !"gzip".equalsIgnoreCase(b2) || (byteStream instanceof GZIPInputStream)) {
                    inputStream = byteStream;
                } else {
                    inputStream = new GZIPInputStream(byteStream);
                }
                C199661 r0 = new C19926e() {
                    /* renamed from: a */
                    public final InputStream mo13391a() throws IOException {
                        return inputStream;
                    }

                    /* renamed from: b */
                    public final int mo13393b() throws IOException {
                        return b.f132400c;
                    }

                    /* renamed from: c */
                    public final void mo13394c() {
                        if (a2 != null && !a2.mo111250d()) {
                            a2.mo111248c();
                        }
                    }

                    /* renamed from: d */
                    public final void mo13395d() {
                        try {
                            if (aeVar != null) {
                                aeVar.close();
                            }
                            if (a2 != null && !a2.mo111250d()) {
                                a2.mo111248c();
                            }
                        } catch (Throwable unused) {
                        }
                    }

                    /* renamed from: a */
                    public final String mo13392a(String str) {
                        return b.mo111276b(str);
                    }
                };
                return r0;
            }
            throw new IOException("can't get response");
        }
        throw new IOException("can't get httpClient");
    }
}
