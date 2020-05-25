package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bq */
public class C26432bq {

    /* renamed from: g */
    private static volatile C26432bq f69684g;

    /* renamed from: a */
    public Handler f69685a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public Aweme f69686b;

    /* renamed from: c */
    public int f69687c;

    /* renamed from: d */
    public int f69688d;

    /* renamed from: e */
    public Runnable f69689e;

    /* renamed from: f */
    public Runnable f69690f;

    /* renamed from: h */
    private int f69691h;

    private C26432bq() {
    }

    /* renamed from: a */
    public static C26432bq m63915a() {
        if (f69684g == null) {
            synchronized (C26432bq.class) {
                if (f69684g == null) {
                    f69684g = new C26432bq();
                }
            }
        }
        return f69684g;
    }

    /* renamed from: a */
    public final void mo54158a(int i) {
        this.f69687c = i;
        if (this.f69687c == this.f69691h) {
            this.f69690f = new Runnable() {

                /* renamed from: a */
                final Aweme f69692a = C26432bq.this.f69686b;

                /* renamed from: b */
                long f69693b;

                public final void run() {
                    long j;
                    if (this.f69692a == C26432bq.this.f69686b) {
                        if (C48121w.m104087I()) {
                            j = C50130a.m108170a().mo97928d();
                        } else {
                            j = C48121w.m104249M().mo95256n();
                        }
                        if (j < 0) {
                            j = 0;
                        }
                        if (j >= ((long) C26432bq.this.f69688d) || (j < this.f69693b && C26432bq.this.f69687c > 0)) {
                            Runnable runnable = C26432bq.this.f69689e;
                            if (runnable != null) {
                                try {
                                    runnable.run();
                                } catch (Exception unused) {
                                }
                            }
                            C26432bq.this.f69689e = null;
                            return;
                        }
                        this.f69693b = j;
                        C26432bq.this.f69685a.postDelayed(this, 1000);
                    }
                }
            };
            this.f69685a.post(this.f69690f);
        }
    }

    /* renamed from: a */
    public final void mo54159a(int i, Runnable runnable) {
        long j;
        if (this.f69686b != null) {
            Aweme aweme = this.f69686b;
            if (C48121w.m104087I()) {
                j = C50130a.m108170a().mo60217ah();
            } else {
                j = C48121w.m104249M().mo95251i();
            }
            if (j <= 0) {
                if (aweme == null || aweme.getVideo() == null || aweme.getVideo().getDuration() <= 0) {
                    j = 1;
                } else {
                    j = (long) aweme.getVideo().getDuration();
                }
            }
            long j2 = (long) i;
            this.f69691h = (int) (j2 / j);
            this.f69688d = (int) (j2 % j);
            this.f69689e = runnable;
            mo54158a(0);
        }
    }
}
