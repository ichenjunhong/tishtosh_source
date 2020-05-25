package com.bytedance.crash.p551k;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.crash.k.j */
public final class C9656j {

    /* renamed from: f */
    static final C9660b<C9662d, Runnable> f26358f = new C9660b<C9662d, Runnable>() {
    };

    /* renamed from: g */
    static final C9660b<Message, Runnable> f26359g = new C9660b<Message, Runnable>() {
    };

    /* renamed from: a */
    public final HandlerThread f26360a;

    /* renamed from: b */
    public final Queue<C9662d> f26361b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public final Queue<Message> f26362c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public volatile Handler f26363d;

    /* renamed from: e */
    public final Object f26364e = new Object();

    /* renamed from: com.bytedance.crash.k.j$a */
    class C9659a implements Runnable {
        public final void run() {
            while (!C9656j.this.f26362c.isEmpty()) {
                if (C9656j.this.f26363d != null) {
                    try {
                        C9656j.this.f26363d.sendMessageAtFrontOfQueue((Message) C9656j.this.f26362c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!C9656j.this.f26361b.isEmpty()) {
                C9662d dVar = (C9662d) C9656j.this.f26361b.poll();
                if (C9656j.this.f26363d != null) {
                    try {
                        C9656j.this.f26363d.sendMessageAtTime(dVar.f26369a, dVar.f26370b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }

        C9659a() {
        }
    }

    /* renamed from: com.bytedance.crash.k.j$b */
    public interface C9660b<A, B> {
    }

    /* renamed from: com.bytedance.crash.k.j$c */
    class C9661c extends HandlerThread {

        /* renamed from: a */
        volatile int f26366a;

        /* renamed from: b */
        volatile boolean f26367b;

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (C9656j.this.f26364e) {
                C9656j.this.f26363d = new Handler();
            }
            C9656j.this.f26363d.post(new C9659a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable unused) {
                }
            }
            this.f26366a++;
        }

        C9661c(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.crash.k.j$d */
    static class C9662d {

        /* renamed from: a */
        Message f26369a;

        /* renamed from: b */
        long f26370b;

        C9662d(Message message, long j) {
            this.f26369a = message;
            this.f26370b = j;
        }
    }

    /* renamed from: b */
    private Message m19264b(Runnable runnable) {
        return Message.obtain(this.f26363d, runnable);
    }

    /* renamed from: a */
    public final boolean mo17509a(Runnable runnable) {
        return m19263a(m19264b(runnable), 0);
    }

    public C9656j(String str) {
        this.f26360a = new C9661c(str);
    }

    /* renamed from: a */
    private boolean m19263a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m19265b(message, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: b */
    private boolean m19265b(Message message, long j) {
        if (this.f26363d == null) {
            synchronized (this.f26364e) {
                if (this.f26363d == null) {
                    this.f26361b.add(new C9662d(message, j));
                    return true;
                }
            }
        }
        try {
            return this.f26363d.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo17510a(Runnable runnable, long j) {
        return m19263a(m19264b(runnable), j);
    }
}
