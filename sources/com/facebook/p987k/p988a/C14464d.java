package com.facebook.p987k.p988a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.k.a.d */
public final class C14464d {

    /* renamed from: a */
    public final C14460b f37564a;

    /* renamed from: b */
    public long f37565b;

    /* renamed from: c */
    private AtomicInteger f37566c;

    /* renamed from: d */
    private Handler f37567d;

    /* renamed from: e */
    private HandlerThread f37568e;

    /* renamed from: com.facebook.k.a.d$a */
    static class C14466a {

        /* renamed from: a */
        public static final C14464d f37569a = new C14464d(C14460b.m29586a());
    }

    /* renamed from: com.facebook.k.a.d$b */
    class C14467b extends Handler {
        /* renamed from: a */
        private void m29593a() {
            long a = C14470g.m29596a().mo26632a(Process.myUid());
            synchronized (this) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (a != -1) {
                    C14464d.this.f37564a.mo26624a(a, elapsedRealtime - C14464d.this.f37565b);
                }
                C14464d.this.f37565b = elapsedRealtime;
            }
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    m29593a();
                    sendEmptyMessageDelayed(1, 1000);
                    return;
                case 2:
                    m29593a();
                    removeMessages(1);
                    return;
                default:
                    StringBuilder sb = new StringBuilder("Unknown what=");
                    sb.append(message.what);
                    throw new IllegalArgumentException(sb.toString());
            }
        }

        public C14467b(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public static C14464d m29590a() {
        return C14466a.f37569a;
    }

    /* renamed from: c */
    public final void mo26628c() {
        if (this.f37566c.decrementAndGet() == 0) {
            this.f37567d.sendEmptyMessage(2);
        }
    }

    /* renamed from: b */
    public final void mo26627b() {
        if (this.f37566c.getAndIncrement() == 0) {
            this.f37567d.sendEmptyMessage(1);
            this.f37565b = SystemClock.elapsedRealtime();
        }
    }

    private C14464d(C14460b bVar) {
        this.f37564a = bVar;
        this.f37566c = new AtomicInteger();
        this.f37568e = new HandlerThread("ParseThread");
        this.f37568e.start();
        this.f37567d = new C14467b(this.f37568e.getLooper());
    }
}
