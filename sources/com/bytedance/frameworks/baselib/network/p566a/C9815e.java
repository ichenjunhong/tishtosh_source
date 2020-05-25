package com.bytedance.frameworks.baselib.network.p566a;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.p785o.p797b.C12438d;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.frameworks.baselib.network.a.e */
public class C9815e {

    /* renamed from: g */
    private static long f26694g = -1;

    /* renamed from: a */
    private final C9812c f26695a;

    /* renamed from: b */
    private AtomicInteger f26696b;

    /* renamed from: c */
    private C9817b f26697c;

    /* renamed from: d */
    private HandlerThread f26698d;

    /* renamed from: e */
    private boolean f26699e;

    /* renamed from: f */
    private long f26700f;

    /* renamed from: com.bytedance.frameworks.baselib.network.a.e$a */
    static class C9816a {

        /* renamed from: a */
        public static final C9815e f26701a = new C9815e(C9812c.m19639b());
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.a.e$b */
    class C9817b extends Handler {
        public final void handleMessage(Message message) {
            try {
                if (message.what == 1) {
                    C9815e.this.mo17656e();
                    sendEmptyMessageDelayed(1, 1000);
                }
            } catch (Throwable unused) {
            }
        }

        public C9817b(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: b */
    public static C9815e m19643b() {
        return C9816a.f26701a;
    }

    /* renamed from: c */
    public final void mo17654c() {
        try {
            if (!this.f26699e && this.f26696b.getAndIncrement() == 0) {
                this.f26697c.sendEmptyMessage(1);
                this.f26700f = SystemClock.elapsedRealtime();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public final void mo17655d() {
        try {
            if (!this.f26699e && this.f26696b.decrementAndGet() == 0) {
                this.f26697c.removeMessages(1);
                mo17656e();
                f26694g = -1;
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo17656e() {
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long j = totalRxBytes - f26694g;
            if (f26694g >= 0) {
                synchronized (this) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.f26695a.mo17651a(j, elapsedRealtime - this.f26700f);
                    this.f26700f = elapsedRealtime;
                }
            }
            f26694g = totalRxBytes;
        } catch (Throwable unused) {
        }
    }

    protected C9815e(C9812c cVar) {
        this.f26695a = cVar;
        try {
            this.f26696b = new AtomicInteger();
            this.f26698d = C12438d.m25027a("ParseThread", 0, "");
            this.f26698d.start();
            this.f26697c = new C9817b(this.f26698d.getLooper());
        } catch (Throwable unused) {
            this.f26699e = true;
        }
    }
}
