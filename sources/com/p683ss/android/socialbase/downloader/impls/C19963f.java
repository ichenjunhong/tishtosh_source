package com.p683ss.android.socialbase.downloader.impls;

import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.model.HttpHeader;
import com.p683ss.android.socialbase.downloader.p1216f.C19924c;
import com.p683ss.android.socialbase.downloader.p1216f.C19925d;
import com.p683ss.android.socialbase.downloader.p1221j.C19991b;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import java.io.IOException;
import java.util.List;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53524e;
import okhttp3.C53682y;

/* renamed from: com.ss.android.socialbase.downloader.impls.f */
public final class C19963f implements C19925d {
    /* renamed from: a */
    public final C19924c mo41650a(String str, List<HttpHeader> list) throws IOException {
        C53682y k = C19884b.m48614k();
        if (k != null) {
            C53499a b = new C53499a().mo111262a(str).mo111269b();
            if (list != null && list.size() > 0) {
                for (HttpHeader httpHeader : list) {
                    b.mo111271b(httpHeader.f55085a, C19994e.m49379d(httpHeader.f55086b));
                }
            }
            final C53524e a = k.mo111325a(b.mo111272c());
            final C53504ad b2 = a.mo111247b();
            if (b2 != null) {
                if (C19991b.m49327a(2097152)) {
                    b2.close();
                }
                return new C19924c() {
                    /* renamed from: b */
                    public final int mo13393b() throws IOException {
                        return b2.f132400c;
                    }

                    /* renamed from: c */
                    public final void mo13394c() {
                        if (a != null && !a.mo111250d()) {
                            a.mo111248c();
                        }
                    }

                    /* renamed from: a */
                    public final String mo13392a(String str) {
                        return b2.mo111276b(str);
                    }
                };
            }
            throw new IOException("can't get response");
        }
        throw new IOException("can't get httpClient");
    }
}
