package com.google.android.gms.internal.ads;

import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;

@C16299uq
public final class ajy implements bmj {

    /* renamed from: a */
    private final bsv f40735a;

    /* renamed from: b */
    private long f40736b;

    /* renamed from: c */
    private long f40737c;

    /* renamed from: d */
    private long f40738d;

    /* renamed from: e */
    private long f40739e;

    /* renamed from: f */
    private int f40740f;

    /* renamed from: g */
    private boolean f40741g;

    ajy() {
        this(IFoundationAVService.MUSIC_LENGTH_FOR_COPYRIGHT, VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT, 2500, 5000);
    }

    private ajy(int i, int i2, long j, long j2) {
        this.f40735a = new bsv(true, 65536);
        this.f40736b = 15000000;
        this.f40737c = 30000000;
        this.f40738d = 2500000;
        this.f40739e = 5000000;
    }

    /* renamed from: a */
    public final void mo29039a() {
        m33109a(false);
    }

    /* renamed from: a */
    public final void mo29041a(bmm[] bmmArr, brx brx, bsk bsk) {
        this.f40740f = 0;
        for (int i = 0; i < bmmArr.length; i++) {
            if (bsk.mo30659a(i) != null) {
                int i2 = this.f40740f;
                int i3 = 131072;
                switch (bmmArr[i].mo30339a()) {
                    case 0:
                        i3 = 16777216;
                        break;
                    case 1:
                        i3 = 3538944;
                        break;
                    case 2:
                        i3 = 13107200;
                        break;
                    case 3:
                    case 4:
                        break;
                    default:
                        throw new IllegalStateException();
                }
                this.f40740f = i2 + i3;
            }
        }
        this.f40735a.mo30672a(this.f40740f);
    }

    /* renamed from: b */
    public final void mo29044b() {
        m33109a(true);
    }

    /* renamed from: c */
    public final void mo29046c() {
        m33109a(true);
    }

    /* renamed from: d */
    public final bsp mo29048d() {
        return this.f40735a;
    }

    /* renamed from: a */
    public final synchronized boolean mo29043a(long j, boolean z) {
        long j2;
        boolean z2;
        if (z) {
            try {
                j2 = this.f40739e;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            j2 = this.f40738d;
        }
        if (j2 <= 0 || j >= j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    /* renamed from: a */
    public final synchronized boolean mo29042a(long j) {
        boolean z = false;
        char c = j > this.f40737c ? 0 : j < this.f40736b ? (char) 2 : 1;
        boolean z2 = this.f40735a.mo30674e() >= this.f40740f;
        if (c == 2 || (c == 1 && this.f40741g && !z2)) {
            z = true;
        }
        this.f40741g = z;
        return this.f40741g;
    }

    /* renamed from: a */
    public final synchronized void mo29040a(int i) {
        this.f40736b = ((long) i) * 1000;
    }

    /* renamed from: b */
    public final synchronized void mo29045b(int i) {
        this.f40737c = ((long) i) * 1000;
    }

    /* renamed from: c */
    public final synchronized void mo29047c(int i) {
        this.f40738d = ((long) i) * 1000;
    }

    /* renamed from: d */
    public final synchronized void mo29049d(int i) {
        this.f40739e = ((long) i) * 1000;
    }

    /* renamed from: a */
    private final void m33109a(boolean z) {
        this.f40740f = 0;
        this.f40741g = false;
        if (z) {
            this.f40735a.mo30673d();
        }
    }
}
