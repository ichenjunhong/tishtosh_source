package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

final class bqz implements btf {

    /* renamed from: a */
    long f43634a = -1;

    /* renamed from: b */
    private final Uri f43635b;

    /* renamed from: c */
    private final bsr f43636c;

    /* renamed from: d */
    private final bra f43637d;

    /* renamed from: e */
    private final btk f43638e;

    /* renamed from: f */
    private final boq f43639f = new boq();

    /* renamed from: g */
    private volatile boolean f43640g;

    /* renamed from: h */
    private boolean f43641h = true;

    /* renamed from: i */
    private long f43642i;

    /* renamed from: j */
    private final /* synthetic */ bqt f43643j;

    public bqz(bqt bqt, Uri uri, bsr bsr, bra bra, btk btk) {
        this.f43643j = bqt;
        this.f43635b = (Uri) bti.m36697a(uri);
        this.f43636c = (bsr) bti.m36697a(bsr);
        this.f43637d = (bra) bti.m36697a(bra);
        this.f43638e = btk;
    }

    /* renamed from: a */
    public final void mo30591a(long j, long j2) {
        this.f43639f.f43202a = j;
        this.f43642i = j2;
        this.f43641h = true;
    }

    /* renamed from: a */
    public final void mo30590a() {
        this.f43640g = true;
    }

    /* renamed from: b */
    public final boolean mo30592b() {
        return this.f43640g;
    }

    /* renamed from: c */
    public final void mo30593c() throws IOException, InterruptedException {
        boj boj;
        int i = 0;
        while (i == 0 && !this.f43640g) {
            try {
                long j = this.f43639f.f43202a;
                bsr bsr = this.f43636c;
                bsu bsu = new bsu(this.f43635b, j, -1, this.f43643j.f43604c);
                this.f43634a = bsr.mo29027a(bsu);
                if (this.f43634a != -1) {
                    this.f43634a += j;
                }
                boj = new boj(this.f43636c, j, this.f43634a);
                try {
                    bok a = this.f43637d.mo30594a(boj, this.f43636c.mo29028a());
                    if (this.f43641h) {
                        a.mo30507a(j, this.f43642i);
                        this.f43641h = false;
                    }
                    while (i == 0 && !this.f43640g) {
                        this.f43638e.mo30686c();
                        int a2 = a.mo30506a((bol) boj, this.f43639f);
                        try {
                            if (boj.mo30500b() > this.f43643j.f43605d + j) {
                                j = boj.mo30500b();
                                this.f43638e.mo30685b();
                                this.f43643j.f43610i.post(this.f43643j.f43609h);
                            }
                            i = a2;
                        } catch (Throwable th) {
                            th = th;
                            i = a2;
                            this.f43639f.f43202a = boj.mo30500b();
                            btw.m36760a(this.f43636c);
                            throw th;
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.f43639f.f43202a = boj.mo30500b();
                    }
                    btw.m36760a(this.f43636c);
                } catch (Throwable th2) {
                    th = th2;
                    if (!(i == 1 || boj == null)) {
                        this.f43639f.f43202a = boj.mo30500b();
                    }
                    btw.m36760a(this.f43636c);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                boj = null;
                this.f43639f.f43202a = boj.mo30500b();
                btw.m36760a(this.f43636c);
                throw th;
            }
        }
    }
}
