package com.p683ss.android.socialbase.downloader.p1216f;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.socialbase.downloader.f.a */
public class C19914a {

    /* renamed from: d */
    private static final String f54716d = "a";

    /* renamed from: f */
    private static long f54717f = -1;

    /* renamed from: g */
    private static volatile C19914a f54718g;

    /* renamed from: a */
    public final AtomicInteger f54719a = new AtomicInteger();

    /* renamed from: b */
    public final C19915a f54720b;

    /* renamed from: c */
    public long f54721c;

    /* renamed from: e */
    private final C19928g f54722e = C19928g.m48914a();

    /* renamed from: com.ss.android.socialbase.downloader.f.a$a */
    public class C19915a extends Handler {
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                C19914a.this.mo41642c();
                sendEmptyMessageDelayed(1, 1000);
            }
        }

        public C19915a(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public static C19914a m48890a() {
        if (f54718g == null) {
            synchronized (C19914a.class) {
                if (f54718g == null) {
                    f54718g = new C19914a();
                }
            }
        }
        return f54718g;
    }

    /* renamed from: b */
    public final void mo41641b() {
        try {
            if (this.f54719a.decrementAndGet() == 0) {
                this.f54720b.removeMessages(1);
                mo41642c();
                f54717f = -1;
            }
        } catch (Throwable unused) {
        }
    }

    private C19914a() {
        HandlerThread handlerThread = new HandlerThread("ParseThread");
        handlerThread.start();
        this.f54720b = new C19915a(handlerThread.getLooper());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo41642c() {
        long j;
        try {
            if (C19994e.m49350a(C19884b.m48627x())) {
                j = TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes();
            } else {
                j = TrafficStats.getMobileRxBytes();
            }
            long j2 = j - f54717f;
            if (f54717f >= 0) {
                synchronized (this) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f54722e.mo41651a(j2, uptimeMillis - this.f54721c);
                    this.f54721c = uptimeMillis;
                }
            }
            f54717f = j;
        } catch (Exception unused) {
        }
    }
}
