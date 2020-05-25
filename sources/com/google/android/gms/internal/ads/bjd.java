package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

final class bjd implements blb {

    /* renamed from: a */
    private final Uri f42590a;

    /* renamed from: b */
    private final bkm f42591b;

    /* renamed from: c */
    private final biz f42592c;

    /* renamed from: d */
    private final bko f42593d;

    /* renamed from: e */
    private final int f42594e;

    /* renamed from: f */
    private final bjf f42595f = new bjf();

    /* renamed from: g */
    private volatile boolean f42596g;

    /* renamed from: h */
    private boolean f42597h;

    public bjd(Uri uri, bkm bkm, biz biz, bko bko, int i, long j) {
        this.f42590a = (Uri) blg.m35998a(uri);
        this.f42591b = (bkm) blg.m35998a(bkm);
        this.f42592c = (biz) blg.m35998a(biz);
        this.f42593d = (bko) blg.m35998a(bko);
        this.f42594e = i;
        this.f42595f.f42599a = j;
        this.f42597h = true;
    }

    /* renamed from: a */
    public final void mo30278a() {
        this.f42596g = true;
    }

    /* renamed from: b */
    public final boolean mo30279b() {
        return this.f42596g;
    }

    /* renamed from: c */
    public final void mo30280c() throws IOException, InterruptedException {
        if (this.f42597h) {
            this.f42592c.mo30268a();
            this.f42597h = false;
        }
        int i = 0;
        while (i == 0 && !this.f42596g) {
            bix bix = null;
            try {
                long j = this.f42595f.f42599a;
                bkm bkm = this.f42591b;
                bkn bkn = new bkn(this.f42590a, j, -1, null);
                long a = bkm.mo29003a(bkn);
                if (a != -1) {
                    a += j;
                }
                bix bix2 = new bix(this.f42591b, j, a);
                while (i == 0) {
                    try {
                        if (this.f42596g) {
                            break;
                        }
                        this.f42593d.mo30314b(this.f42594e);
                        i = this.f42592c.mo30267a(bix2, this.f42595f);
                    } catch (Throwable th) {
                        th = th;
                        bix = bix2;
                        if (!(i == 1 || bix == null)) {
                            this.f42595f.f42599a = bix.mo30255a();
                        }
                        this.f42591b.mo29004a();
                        throw th;
                    }
                }
                if (i == 1) {
                    i = 0;
                } else {
                    this.f42595f.f42599a = bix2.mo30255a();
                }
                this.f42591b.mo29004a();
            } catch (Throwable th2) {
                th = th2;
                this.f42595f.f42599a = bix.mo30255a();
                this.f42591b.mo29004a();
                throw th;
            }
        }
    }
}
