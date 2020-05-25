package com.p683ss.android.socialbase.downloader.p1218g;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.ss.android.socialbase.downloader.g.e */
public final class C19937e implements C19935c {

    /* renamed from: a */
    private final InputStream f54782a;

    /* renamed from: b */
    private final C19934b f54783b;

    /* renamed from: a */
    public final void mo41654a(C19934b bVar) {
    }

    /* renamed from: b */
    public final void mo41655b() {
        try {
            this.f54782a.close();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final C19934b mo41653a() throws IOException {
        this.f54783b.f54780b = this.f54782a.read(this.f54783b.f54779a);
        return this.f54783b;
    }

    public C19937e(InputStream inputStream, int i) {
        this.f54782a = inputStream;
        this.f54783b = new C19934b(i);
    }
}
