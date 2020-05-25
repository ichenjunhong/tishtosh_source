package com.bytedance.apm.p497o;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.apm.p501q.C9190h.C9191a;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.apm.o.c */
public final class C9154c {

    /* renamed from: e */
    static final C9191a<C9159c, Runnable> f25075e = new C9191a<C9159c, Runnable>() {
        /* renamed from: a */
        public final /* synthetic */ boolean mo16533a(Object obj, Object obj2) {
            C9159c cVar = (C9159c) obj;
            Runnable runnable = (Runnable) obj2;
            boolean z = false;
            if (runnable == null) {
                if (cVar != null && cVar.f25084a != null && cVar.f25084a.getCallback() != null) {
                    return false;
                }
                z = true;
            } else if (cVar == null || cVar.f25084a == null || !runnable.equals(cVar.f25084a.getCallback())) {
                return z;
            } else {
                return true;
            }
            return z;
        }
    };

    /* renamed from: f */
    static final C9191a<Message, Runnable> f25076f = new C9191a<Message, Runnable>() {
        /* renamed from: a */
        public final /* synthetic */ boolean mo16533a(Object obj, Object obj2) {
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
    public final Queue<C9159c> f25077a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final Queue<Message> f25078b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public volatile Handler f25079c;

    /* renamed from: d */
    public final Object f25080d = new Object();

    /* renamed from: g */
    private final HandlerThread f25081g;

    /* renamed from: com.bytedance.apm.o.c$a */
    class C9157a implements Runnable {
        public final void run() {
            while (!C9154c.this.f25078b.isEmpty()) {
                synchronized (C9154c.this.f25080d) {
                    if (C9154c.this.f25079c != null) {
                        C9154c.this.f25079c.sendMessageAtFrontOfQueue((Message) C9154c.this.f25078b.poll());
                    }
                }
            }
            while (!C9154c.this.f25077a.isEmpty()) {
                synchronized (C9154c.this.f25080d) {
                    C9159c cVar = (C9159c) C9154c.this.f25077a.poll();
                    if (C9154c.this.f25079c != null) {
                        C9154c.this.f25079c.sendMessageAtTime(cVar.f25084a, cVar.f25085b);
                    }
                }
            }
        }

        C9157a() {
        }
    }

    /* renamed from: com.bytedance.apm.o.c$b */
    class C9158b extends HandlerThread {
        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (C9154c.this.f25080d) {
                C9154c.this.f25079c = new Handler();
            }
            C9154c.this.f25079c.post(new C9157a());
        }

        C9158b(String str) {
            super(str);
        }

        C9158b(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.bytedance.apm.o.c$c */
    static class C9159c {

        /* renamed from: a */
        Message f25084a;

        /* renamed from: b */
        long f25085b;

        C9159c(Message message, long j) {
            this.f25084a = message;
            this.f25085b = j;
        }
    }

    /* renamed from: a */
    public final void mo16528a() {
        this.f25081g.start();
    }

    /* renamed from: b */
    public final boolean mo16532b() {
        if (this.f25079c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private Message m18178c(Runnable runnable) {
        return Message.obtain(this.f25079c, runnable);
    }

    /* renamed from: a */
    public final boolean mo16529a(Runnable runnable) {
        return m18176a(m18178c(runnable), 0);
    }

    public C9154c(String str) {
        this.f25081g = new C9158b(str);
    }

    /* renamed from: b */
    public final void mo16531b(Runnable runnable) {
        if (!this.f25077a.isEmpty() || !this.f25078b.isEmpty()) {
            C9190h.m18252a(this.f25077a, runnable, f25075e);
            C9190h.m18252a(this.f25078b, runnable, f25076f);
        }
        if (this.f25079c != null) {
            this.f25079c.removeCallbacks(runnable);
        }
    }

    /* renamed from: a */
    private boolean m18176a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return m18177b(message, SystemClock.uptimeMillis() + j);
    }

    public C9154c(String str, int i) {
        this.f25081g = new C9158b(str, 10);
    }

    /* renamed from: b */
    private boolean m18177b(Message message, long j) {
        if (this.f25079c == null) {
            synchronized (this.f25080d) {
                if (this.f25079c == null) {
                    this.f25077a.add(new C9159c(message, j));
                    return true;
                }
            }
        }
        return this.f25079c.sendMessageAtTime(message, j);
    }

    /* renamed from: a */
    public final boolean mo16530a(Runnable runnable, long j) {
        return m18176a(m18178c(runnable), j);
    }
}
