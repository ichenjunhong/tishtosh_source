package com.toutiao.proxyserver.p2613e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.toutiao.proxyserver.e.c */
public final class C51826c {

    /* renamed from: b */
    public static long f129309b = 1000;

    /* renamed from: h */
    private static long f129310h = -1;

    /* renamed from: i */
    private static final C51833g f129311i = new C51832f();

    /* renamed from: a */
    public C51833g f129312a;

    /* renamed from: c */
    private final C51822a f129313c;

    /* renamed from: d */
    private AtomicInteger f129314d;

    /* renamed from: e */
    private C51829b f129315e;

    /* renamed from: f */
    private HandlerThread f129316f;

    /* renamed from: g */
    private long f129317g;

    /* renamed from: com.toutiao.proxyserver.e.c$a */
    static class C51828a {

        /* renamed from: a */
        public static final C51826c f129318a = new C51826c(C51822a.m111147a());
    }

    /* renamed from: com.toutiao.proxyserver.e.c$b */
    class C51829b extends Handler {
        /* renamed from: a */
        public final void mo107325a() {
            sendEmptyMessage(1);
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                C51826c.this.mo107323d();
                sendEmptyMessageDelayed(1, C51826c.f129309b);
                return;
            }
            StringBuilder sb = new StringBuilder("Unknown what=");
            sb.append(message.what);
            throw new IllegalArgumentException(sb.toString());
        }

        public C51829b(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public static C51826c m111151a() {
        return C51828a.f129318a;
    }

    /* renamed from: e */
    public final void mo107324e() {
        this.f129312a = f129311i;
    }

    /* renamed from: b */
    public final void mo107321b() {
        if (this.f129314d.getAndIncrement() == 0) {
            this.f129315e.mo107325a();
            this.f129317g = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: c */
    public final void mo107322c() {
        if (this.f129314d.decrementAndGet() == 0) {
            this.f129315e.removeMessages(1);
            mo107323d();
            f129310h = -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo107323d() {
        if (this.f129312a != null) {
            long a = this.f129312a.mo107327a();
            long j = a - f129310h;
            if (f129310h >= 0) {
                synchronized (this) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.f129313c.mo107319a(j, elapsedRealtime - this.f129317g);
                    this.f129317g = elapsedRealtime;
                }
            }
            f129310h = a;
        }
    }

    private C51826c(C51822a aVar) {
        this.f129312a = f129311i;
        this.f129313c = aVar;
        this.f129314d = new AtomicInteger();
        this.f129316f = new HandlerThread("ParseThread");
        this.f129316f.start();
        this.f129315e = new C51829b(this.f129316f.getLooper());
    }
}
