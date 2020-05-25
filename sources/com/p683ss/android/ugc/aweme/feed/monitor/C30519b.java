package com.p683ss.android.ugc.aweme.feed.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.feed.monitor.C30514a.C30515a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.monitor.b */
public final class C30519b {

    /* renamed from: b */
    private static C30519b f79765b = new C30519b();

    /* renamed from: a */
    public Map<Long, StackTraceElement[]> f79766a = new ConcurrentHashMap();

    /* renamed from: c */
    private HandlerThread f79767c = new HandlerThread(C30514a.f79739f);

    /* renamed from: d */
    private Handler f79768d;

    /* renamed from: e */
    private long f79769e = 80;

    /* renamed from: f */
    private boolean f79770f = false;

    /* renamed from: g */
    private final C30521a f79771g = new C30521a();

    /* renamed from: com.ss.android.ugc.aweme.feed.monitor.b$a */
    static class C30521a implements Runnable {

        /* renamed from: a */
        long f79772a;

        private C30521a() {
        }

        public final void run() {
            C30519b.m71484a().f79766a.put(Long.valueOf(this.f79772a), Looper.getMainLooper().getThread().getStackTrace());
        }
    }

    /* renamed from: a */
    public static C30519b m71484a() {
        return f79765b;
    }

    private C30519b() {
        double a = (double) C30515a.m71482a();
        Double.isNaN(a);
        this.f79769e = (long) (a * 0.8d);
    }

    /* renamed from: b */
    public final void mo62717b(long j) {
        this.f79766a.remove(Long.valueOf(j));
        this.f79768d.removeCallbacks(this.f79771g);
    }

    /* renamed from: a */
    public final void mo62716a(long j) {
        if (!this.f79770f) {
            this.f79770f = true;
            this.f79767c.start();
            this.f79768d = new Handler(this.f79767c.getLooper());
        }
        this.f79771g.f79772a = j;
        this.f79768d.postDelayed(this.f79771g, this.f79769e);
    }
}
