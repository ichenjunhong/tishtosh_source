package com.bytedance.p582g.p583a.p585b.p589d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.p582g.p583a.p585b.p590e.C9979b;
import com.bytedance.p582g.p583a.p585b.p590e.C9979b.C9980a;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.g.a.b.d.b */
public final class C9972b {

    /* renamed from: f */
    static final C9980a<C9977c, Runnable> f27093f = new C9980a<C9977c, Runnable>() {
        /* renamed from: a */
        public final /* synthetic */ boolean mo17947a(Object obj, Object obj2) {
            C9977c cVar = (C9977c) obj;
            Runnable runnable = (Runnable) obj2;
            boolean z = false;
            if (runnable == null) {
                if (cVar != null && cVar.f27102a != null && cVar.f27102a.getCallback() != null) {
                    return false;
                }
                z = true;
            } else if (cVar == null || cVar.f27102a == null || !runnable.equals(cVar.f27102a.getCallback())) {
                return z;
            } else {
                return true;
            }
            return z;
        }
    };

    /* renamed from: g */
    static final C9980a<Message, Runnable> f27094g = new C9980a<Message, Runnable>() {
        /* renamed from: a */
        public final /* synthetic */ boolean mo17947a(Object obj, Object obj2) {
            Message message = (Message) obj;
            Runnable runnable = (Runnable) obj2;
            boolean z = false;
            if (runnable == null) {
                if (message != null && message.getCallback() != null) {
                    return false;
                }
                z = true;
            } else if (message == null || !runnable.equals(message.getCallback())) {
                return z;
            } else {
                return true;
            }
            return z;
        }
    };

    /* renamed from: a */
    final HandlerThread f27095a;

    /* renamed from: b */
    public final Queue<C9977c> f27096b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public final Queue<Message> f27097c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public volatile Handler f27098d;

    /* renamed from: e */
    public final Object f27099e = new Object();

    /* renamed from: com.bytedance.g.a.b.d.b$a */
    class C9975a implements Runnable {
        public final void run() {
            while (!C9972b.this.f27097c.isEmpty()) {
                if (C9972b.this.f27098d != null) {
                    C9972b.this.f27098d.sendMessageAtFrontOfQueue((Message) C9972b.this.f27097c.poll());
                }
            }
            while (!C9972b.this.f27096b.isEmpty()) {
                C9977c cVar = (C9977c) C9972b.this.f27096b.poll();
                if (C9972b.this.f27098d != null) {
                    C9972b.this.f27098d.sendMessageAtTime(cVar.f27102a, cVar.f27103b);
                }
            }
        }

        C9975a() {
        }
    }

    /* renamed from: com.bytedance.g.a.b.d.b$b */
    class C9976b extends HandlerThread {
        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0020 */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0020 A[LOOP:0: B:6:0x0020->B:7:?, LOOP_START, SYNTHETIC, Splitter:B:6:0x0020] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onLooperPrepared() {
            /*
                r3 = this;
                super.onLooperPrepared()
                com.bytedance.g.a.b.d.b r0 = com.bytedance.p582g.p583a.p585b.p589d.C9972b.this
                java.lang.Object r0 = r0.f27099e
                monitor-enter(r0)
                com.bytedance.g.a.b.d.b r1 = com.bytedance.p582g.p583a.p585b.p589d.C9972b.this     // Catch:{ all -> 0x0024 }
                android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0024 }
                r2.<init>()     // Catch:{ all -> 0x0024 }
                r1.f27098d = r2     // Catch:{ all -> 0x0024 }
                monitor-exit(r0)     // Catch:{ all -> 0x0024 }
                com.bytedance.g.a.b.d.b r0 = com.bytedance.p582g.p583a.p585b.p589d.C9972b.this
                android.os.Handler r0 = r0.f27098d
                com.bytedance.g.a.b.d.b$a r1 = new com.bytedance.g.a.b.d.b$a
                com.bytedance.g.a.b.d.b r2 = com.bytedance.p582g.p583a.p585b.p589d.C9972b.this
                r1.<init>()
                r0.post(r1)
            L_0x0020:
                android.os.Looper.loop()     // Catch:{ Throwable -> 0x0020 }
                goto L_0x0020
            L_0x0024:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0024 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p585b.p589d.C9972b.C9976b.onLooperPrepared():void");
        }

        C9976b(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.g.a.b.d.b$c */
    static class C9977c {

        /* renamed from: a */
        Message f27102a;

        /* renamed from: b */
        long f27103b;

        C9977c(Message message, long j) {
            this.f27102a = message;
            this.f27103b = j;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Message mo17943a(Runnable runnable) {
        return Message.obtain(this.f27098d, runnable);
    }

    public C9972b(String str) {
        this.f27095a = new C9976b(str);
    }

    /* renamed from: b */
    public final void mo17946b(Runnable runnable) {
        if (!this.f27096b.isEmpty() || !this.f27097c.isEmpty()) {
            C9979b.m20067a(this.f27096b, runnable, f27093f);
            C9979b.m20067a(this.f27097c, runnable, f27094g);
        }
        if (this.f27098d != null) {
            this.f27098d.removeCallbacks(runnable);
        }
    }

    /* renamed from: a */
    public final boolean mo17945a(Runnable runnable, long j) {
        return mo17944a(mo17943a(runnable), j);
    }

    /* renamed from: a */
    public final boolean mo17944a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m20059b(message, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: b */
    private boolean m20059b(Message message, long j) {
        if (this.f27098d == null) {
            synchronized (this.f27099e) {
                if (this.f27098d == null) {
                    this.f27096b.add(new C9977c(message, j));
                    return true;
                }
            }
        }
        return this.f27098d.sendMessageAtTime(message, j);
    }
}
