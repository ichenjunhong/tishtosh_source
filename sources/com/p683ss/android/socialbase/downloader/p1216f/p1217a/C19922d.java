package com.p683ss.android.socialbase.downloader.p1216f.p1217a;

import com.p683ss.android.socialbase.downloader.model.HttpHeader;
import com.p683ss.android.socialbase.downloader.p1216f.C19926e;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.f.a.d */
public final class C19922d implements C19926e {

    /* renamed from: a */
    protected final Object f54741a;

    /* renamed from: b */
    public final List<HttpHeader> f54742b;

    /* renamed from: c */
    long f54743c;

    /* renamed from: d */
    private C19926e f54744d;

    /* renamed from: e */
    private boolean f54745e;

    /* renamed from: f */
    private InputStream f54746f;

    /* renamed from: a */
    public final InputStream mo13391a() throws IOException {
        if (this.f54746f != null) {
            return this.f54746f;
        }
        return null;
    }

    /* renamed from: b */
    public final int mo13393b() throws IOException {
        if (this.f54744d != null) {
            return this.f54744d.mo13393b();
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo13394c() {
        if (this.f54744d != null) {
            this.f54744d.mo13394c();
        }
    }

    /* renamed from: d */
    public final void mo13395d() {
        if (this.f54744d != null) {
            this.f54744d.mo13395d();
        }
    }

    /* renamed from: e */
    public final void mo41648e() throws InterruptedException {
        synchronized (this.f54741a) {
            if (this.f54745e && this.f54744d == null) {
                this.f54741a.wait();
            }
        }
    }

    /* renamed from: f */
    public final boolean mo41649f() {
        boolean z;
        try {
            if (this.f54744d != null) {
                int b = this.f54744d.mo13393b();
                if (b < 200 || b >= 300) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final String mo13392a(String str) {
        if (this.f54744d != null) {
            return this.f54744d.mo13392a(str);
        }
        return null;
    }
}
