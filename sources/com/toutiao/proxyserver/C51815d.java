package com.toutiao.proxyserver;

import com.toutiao.proxyserver.p2612d.C51820c;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.toutiao.proxyserver.d */
public final class C51815d implements Runnable, Callable<Void> {

    /* renamed from: d */
    private static final ExecutorService f129286d;

    /* renamed from: a */
    private volatile boolean f129287a;

    /* renamed from: b */
    private boolean f129288b = C51895s.f129489x;

    /* renamed from: c */
    private BlockingQueue<C51817a> f129289c;

    /* renamed from: e */
    private C51912v f129290e;

    /* renamed from: f */
    private C51913a f129291f;

    /* renamed from: com.toutiao.proxyserver.d$a */
    static class C51817a {

        /* renamed from: f */
        static final Queue<C51817a> f129292f = new LinkedBlockingQueue(16);

        /* renamed from: a */
        C51912v f129293a;

        /* renamed from: b */
        byte[] f129294b;

        /* renamed from: c */
        int f129295c;

        /* renamed from: d */
        int f129296d;

        /* renamed from: e */
        public int f129297e;

        private C51817a() {
        }

        /* renamed from: b */
        public final void mo107318b() {
            if (this.f129293a != null) {
                this.f129293a.mo107425a();
            }
        }

        /* renamed from: a */
        public final C51912v mo107317a() throws C51913a {
            if (this.f129293a != null) {
                try {
                    this.f129293a.mo107427a(this.f129294b, this.f129295c, this.f129296d);
                } catch (C51913a e) {
                    this.f129293a.mo107425a();
                    throw e;
                }
            }
            return this.f129293a;
        }

        /* renamed from: a */
        static C51817a m111130a(int i) {
            C51817a aVar = (C51817a) f129292f.poll();
            if (aVar == null) {
                aVar = new C51817a();
            }
            aVar.f129297e = i;
            return aVar;
        }
    }

    public final /* synthetic */ Object call() throws Exception {
        run();
        return null;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 10, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder("video-cache-writer-");
                sb.append(thread.getId());
                thread.setName(sb.toString());
                return thread;
            }
        });
        f129286d = threadPoolExecutor;
    }

    /* renamed from: b */
    public final Future<Void> mo107313b() {
        if (!this.f129288b || this.f129287a) {
            return null;
        }
        this.f129287a = true;
        try {
            return f129286d.submit(this);
        } catch (Exception unused) {
            this.f129288b = false;
            return null;
        }
    }

    /* renamed from: a */
    public final void mo107311a() {
        if (!this.f129288b || this.f129289c == null || !this.f129287a) {
            if (this.f129290e != null) {
                this.f129290e.mo107425a();
            }
            return;
        }
        this.f129289c.clear();
        BlockingQueue<C51817a> blockingQueue = this.f129289c;
        C51912v vVar = this.f129290e;
        C51817a a = C51817a.m111130a(2);
        a.f129293a = vVar;
        blockingQueue.offer(a);
    }

    public final void run() {
        C51817a aVar;
        while (this.f129287a) {
            try {
                aVar = (C51817a) this.f129289c.poll(1000, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                C51820c.m111145d("CacheWriter", C51820c.m111138a(e));
                aVar = null;
            }
            if (aVar != null) {
                switch (aVar.f129297e) {
                    case 1:
                        try {
                            aVar.mo107317a();
                            break;
                        } catch (C51913a e2) {
                            StringBuilder sb = new StringBuilder("append to cache file error in network task!!! ");
                            sb.append(C51820c.m111138a(e2));
                            C51820c.m111145d("CacheWriter", sb.toString());
                            this.f129287a = false;
                            this.f129291f = e2;
                            this.f129289c.clear();
                            aVar.mo107318b();
                            return;
                        }
                    case 2:
                        aVar.mo107318b();
                        break;
                    case 3:
                        break;
                }
                this.f129287a = false;
                aVar.f129293a = null;
                aVar.f129297e = 0;
                aVar.f129295c = 0;
                aVar.f129296d = 0;
                C51817a.f129292f.offer(aVar);
                continue;
            }
        }
    }

    public C51815d(C51912v vVar) {
        if (this.f129288b) {
            this.f129289c = new LinkedBlockingQueue();
        }
        this.f129290e = vVar;
        this.f129287a = false;
    }

    /* renamed from: a */
    public final void mo107312a(byte[] bArr, int i, int i2) throws C51913a {
        if (this.f129288b) {
            if (this.f129291f == null && this.f129287a) {
                BlockingQueue<C51817a> blockingQueue = this.f129289c;
                C51912v vVar = this.f129290e;
                C51817a a = C51817a.m111130a(1);
                a.f129293a = vVar;
                if (a.f129294b == null || a.f129294b.length != bArr.length) {
                    a.f129294b = new byte[bArr.length];
                }
                System.arraycopy(bArr, 0, a.f129294b, 0, bArr.length);
                a.f129295c = 0;
                a.f129296d = i2;
                blockingQueue.offer(a);
            } else if (!(this.f129291f == null || this.f129290e == null)) {
                this.f129290e = null;
                throw this.f129291f;
            }
        } else if (this.f129290e != null) {
            this.f129290e.mo107427a(bArr, 0, i2);
        }
    }
}
