package com.toutiao.proxyserver;

import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import com.toutiao.proxyserver.C51855i.C51859b;
import com.toutiao.proxyserver.net.C51873c;
import com.toutiao.proxyserver.p2610b.C51808b;
import com.toutiao.proxyserver.p2610b.C51809c;
import com.toutiao.proxyserver.p2612d.C51820c;
import com.toutiao.proxyserver.p2614f.C51835a;
import com.toutiao.proxyserver.p2614f.C51838d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.toutiao.proxyserver.r */
public class C51883r {

    /* renamed from: g */
    public static final C51882q f129431g = new C51882q();

    /* renamed from: l */
    private static volatile C51883r f129432l;

    /* renamed from: a */
    public final SparseArray<Map<String, C51855i>> f129433a = new SparseArray<>(2);

    /* renamed from: b */
    public final BlockingQueue<Runnable> f129434b;

    /* renamed from: c */
    public volatile C51809c f129435c;

    /* renamed from: d */
    public volatile C51843h f129436d;

    /* renamed from: e */
    public volatile C51841g f129437e;

    /* renamed from: f */
    public List<Object> f129438f;

    /* renamed from: h */
    public volatile long f129439h = 10000;

    /* renamed from: i */
    public volatile long f129440i = 10000;

    /* renamed from: j */
    public volatile long f129441j = 10000;

    /* renamed from: k */
    private final ExecutorService f129442k;

    /* renamed from: m */
    private final C51859b f129443m = new C51859b() {
        /* renamed from: a */
        public final void mo107365a(C51855i iVar) {
            StringBuilder sb = new StringBuilder("onLazyUrlsProvided, key: ");
            sb.append(iVar.f129204h);
            C51820c.m111139a("TAG_PROXY_Preloader", sb.toString());
            int g = iVar.mo107283g();
            synchronized (C51883r.this.f129433a) {
                Map map = (Map) C51883r.this.f129433a.get(g);
                if (!map.containsKey(iVar.f129204h)) {
                    map.put(iVar.f129204h, iVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo107366b(final C51855i iVar) {
            final int g = iVar.mo107283g();
            synchronized (C51883r.this.f129433a) {
                Map map = (Map) C51883r.this.f129433a.get(g);
                if (map != null) {
                    map.remove(iVar.f129204h);
                }
            }
            if (C51883r.this.mo107394d()) {
                C51883r.this.mo107395e();
            }
            final C51880o oVar = C51895s.f129471f;
            if (oVar != null) {
                C51838d.m111186b((Runnable) new Runnable() {
                    public final void run() {
                        oVar.mo95387a(C51808b.m111117a(g), "preloader", iVar.f129199c.get(), 0, iVar.f129200d.get());
                    }
                });
            }
            StringBuilder sb = new StringBuilder("afterExecute, key: ");
            sb.append(iVar.f129204h);
            C51820c.m111139a("TAG_PROXY_Preloader", sb.toString());
        }
    };

    /* renamed from: com.toutiao.proxyserver.r$a */
    public class C51893a {

        /* renamed from: a */
        public String f129457a;

        /* renamed from: b */
        public String[] f129458b;

        /* renamed from: c */
        public C51881p f129459c;

        /* renamed from: e */
        private boolean f129461e;

        /* renamed from: f */
        private int f129462f = C51883r.f129431g.f129429b;

        /* renamed from: g */
        private List<C51873c> f129463g;

        /* renamed from: a */
        public final void mo107406a() {
            if (this.f129459c == null) {
                C51883r.this.mo107390a(this.f129461e, this.f129462f, this.f129457a, this.f129463g, this.f129458b);
            } else {
                C51883r.this.mo107389a(this.f129461e, this.f129462f, this.f129457a, this.f129463g, this.f129459c);
            }
        }

        /* renamed from: a */
        public final C51893a mo107405a(int i) {
            this.f129462f = i;
            return this;
        }

        public C51893a() {
        }
    }

    /* renamed from: com.toutiao.proxyserver.r$b */
    static final class C51894b<T> extends LinkedBlockingDeque<T> {

        /* renamed from: a */
        ThreadPoolExecutor f129464a;

        private C51894b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            return offerFirst(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean offer(T r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.util.concurrent.ThreadPoolExecutor r0 = r3.f129464a     // Catch:{ all -> 0x0027 }
                int r0 = r0.getPoolSize()     // Catch:{ all -> 0x0027 }
                java.util.concurrent.ThreadPoolExecutor r1 = r3.f129464a     // Catch:{ all -> 0x0027 }
                int r1 = r1.getActiveCount()     // Catch:{ all -> 0x0027 }
                java.util.concurrent.ThreadPoolExecutor r2 = r3.f129464a     // Catch:{ all -> 0x0027 }
                int r2 = r2.getMaximumPoolSize()     // Catch:{ all -> 0x0027 }
                if (r1 < r0) goto L_0x0021
                if (r0 >= r2) goto L_0x0021
                java.lang.String r4 = "TAG_PROXY_TT"
                java.lang.String r0 = "create new preloader thread"
                com.toutiao.proxyserver.p2612d.C51820c.m111141b(r4, r0)     // Catch:{ all -> 0x0027 }
                r4 = 0
                monitor-exit(r3)     // Catch:{ all -> 0x0027 }
                return r4
            L_0x0021:
                monitor-exit(r3)     // Catch:{ all -> 0x0027 }
                boolean r4 = r3.offerFirst(r4)
                return r4
            L_0x0027:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0027 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C51883r.C51894b.offer(java.lang.Object):boolean");
        }
    }

    /* renamed from: f */
    public static int m111262f() {
        return C51882q.f129428a;
    }

    /* renamed from: g */
    public final C51893a mo107396g() {
        return new C51893a();
    }

    /* renamed from: b */
    public final void mo107392b() {
        C51838d.m111177a((Runnable) new Runnable() {
            public final void run() {
                ArrayList<C51855i> arrayList = new ArrayList<>();
                synchronized (C51883r.this.f129433a) {
                    int size = C51883r.this.f129433a.size();
                    for (int i = 0; i < size; i++) {
                        Map map = (Map) C51883r.this.f129433a.get(C51883r.this.f129433a.keyAt(i));
                        if (map != null) {
                            arrayList.addAll(map.values());
                            map.clear();
                        }
                    }
                    C51883r.this.f129434b.clear();
                }
                C51883r.this.mo107395e();
                for (C51855i iVar : arrayList) {
                    iVar.mo107271a();
                    StringBuilder sb = new StringBuilder("PreloadTask: ");
                    sb.append(iVar);
                    sb.append(", canceled!!!");
                    C51820c.m111143c("TAG_PROXY_Preloader", sb.toString());
                }
            }
        });
    }

    /* renamed from: c */
    public final void mo107393c() {
        C51838d.m111177a((Runnable) new Runnable() {
            public final void run() {
                ArrayList<C51855i> arrayList = new ArrayList<>();
                synchronized (C51883r.this.f129433a) {
                    int size = C51883r.this.f129433a.size();
                    for (int i = 0; i < size; i++) {
                        Map map = (Map) C51883r.this.f129433a.get(C51883r.this.f129433a.keyAt(i));
                        if (map != null) {
                            arrayList.addAll(map.values());
                        }
                    }
                    for (C51855i iVar : arrayList) {
                        iVar.mo107271a();
                        StringBuilder sb = new StringBuilder("PreloadTask: ");
                        sb.append(iVar);
                        sb.append(", canceled!!!");
                        C51820c.m111143c("TAG_PROXY_Preloader", sb.toString());
                    }
                    int size2 = C51883r.this.f129433a.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Map map2 = (Map) C51883r.this.f129433a.get(C51883r.this.f129433a.keyAt(i2));
                        if (map2 != null) {
                            map2.clear();
                        }
                    }
                    C51883r.this.f129434b.clear();
                }
                C51883r.this.mo107395e();
            }
        });
    }

    /* renamed from: e */
    public final void mo107395e() {
        C51838d.m111186b((Runnable) new Runnable() {
            public final void run() {
                Iterator it = C51883r.this.f129438f.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        });
    }

    /* renamed from: a */
    public static C51883r m111260a() {
        if (f129432l == null) {
            synchronized (C51883r.class) {
                if (f129432l == null) {
                    f129432l = new C51883r();
                }
            }
        }
        return f129432l;
    }

    /* renamed from: d */
    public final boolean mo107394d() {
        synchronized (this.f129433a) {
            for (int i = 0; i < this.f129433a.size(); i++) {
                Map map = (Map) this.f129433a.get(this.f129433a.keyAt(i));
                if (map != null && map.size() > 0) {
                    return false;
                }
            }
            return true;
        }
    }

    private C51883r() {
        int i;
        if (f129431g.f129430c == null) {
            f129431g.f129430c = new C51894b();
        }
        this.f129434b = f129431g.f129430c;
        final BlockingQueue<Runnable> blockingQueue = this.f129434b;
        int a = C51838d.m111165a();
        if (a <= 0) {
            a = 1;
        } else if (a > 4) {
            a = 4;
        }
        if (C51882q.f129428a == 1) {
            i = 1;
        } else {
            i = a;
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, blockingQueue, new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                C518911 r0 = new Thread(runnable) {
                    public final void run() {
                        try {
                            Process.setThreadPriority(10);
                        } catch (Throwable unused) {
                        }
                        super.run();
                    }
                };
                StringBuilder sb = new StringBuilder("video-preload-");
                sb.append(r0.getId());
                r0.setName(sb.toString());
                r0.setDaemon(true);
                StringBuilder sb2 = new StringBuilder("new preload thead: ");
                sb2.append(r0.getName());
                C51820c.m111141b("TAG_PROXY_Preloader", sb2.toString());
                return r0;
            }
        }, new RejectedExecutionHandler() {
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    blockingQueue.offer(runnable);
                    C51820c.m111141b("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                } catch (Throwable unused) {
                }
            }
        });
        this.f129442k = threadPoolExecutor;
        if (this.f129434b instanceof C51894b) {
            C51894b bVar = (C51894b) this.f129434b;
            ThreadPoolExecutor threadPoolExecutor2 = (ThreadPoolExecutor) this.f129442k;
            synchronized (bVar) {
                if (bVar.f129464a != null) {
                    throw new IllegalStateException("You can only call setExecutor() once!");
                } else if (threadPoolExecutor2 != null) {
                    bVar.f129464a = threadPoolExecutor2;
                } else {
                    throw new NullPointerException("executor argument can't be null!");
                }
            }
        }
        this.f129438f = new ArrayList();
        this.f129433a.put(0, new HashMap());
        this.f129433a.put(1, new HashMap());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107388a(int i, String str) {
        C51855i iVar;
        synchronized (this.f129433a) {
            Map map = (Map) this.f129433a.get(i);
            if (map != null) {
                iVar = (C51855i) map.remove(str);
            } else {
                iVar = null;
            }
        }
        if (iVar != null) {
            iVar.mo107271a();
        }
        if (mo107394d()) {
            mo107395e();
        }
    }

    /* renamed from: a */
    public final void mo107391a(boolean z, final String str) {
        if (!TextUtils.isEmpty(str)) {
            C51838d.m111177a((Runnable) new Runnable(false) {
                public final void run() {
                    C51883r.this.mo107388a(C51808b.m111116a(false), C51835a.m111161a(str));
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo107389a(boolean z, int i, String str, List<C51873c> list, C51881p pVar) {
        m111261a(z, i, str, list, pVar, null);
    }

    /* renamed from: a */
    public final void mo107390a(boolean z, int i, String str, List<C51873c> list, String... strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            m111261a(z, i, str, list, null, new C51800ab(C51838d.m111172a(strArr)));
        }
    }

    /* renamed from: a */
    private void m111261a(boolean z, int i, String str, List<C51873c> list, C51881p pVar, C51800ab abVar) {
        C51813c cVar;
        C51855i iVar;
        if (z) {
            cVar = this.f129437e;
        } else {
            cVar = this.f129436d;
        }
        C51809c cVar2 = this.f129435c;
        if (cVar == null || cVar2 == null) {
            C51820c.m111145d("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!");
            return;
        }
        if (i <= 0) {
            i = f129431g.f129429b;
        }
        StringBuilder sb = new StringBuilder("Preload urlsLazyProvider:");
        sb.append(pVar);
        C51820c.m111143c("TAG_PROXY_Preloader", sb.toString());
        if (pVar != null) {
            iVar = new C51858a().mo107357a(cVar).mo107356a(cVar2).mo107361a(list).mo107359a(pVar).mo107354a(i).mo107358a(this.f129443m).mo107362a(true).mo107363a();
        } else if (!TextUtils.isEmpty(str) && abVar != null) {
            String a = C51835a.m111161a(str);
            C51802ac.m111110a().mo107298a(str, a);
            File e = cVar.mo107310e(a);
            if (e != null && e.length() >= ((long) i)) {
                StringBuilder sb2 = new StringBuilder("no need preload, file size: ");
                sb2.append(e.length());
                sb2.append(", need preload size: ");
                sb2.append(i);
                C51820c.m111141b("TAG_PROXY_Preloader", sb2.toString());
                return;
            } else if (C51897t.m111286a().mo107408a(C51808b.m111116a(z), a)) {
                StringBuilder sb3 = new StringBuilder("has pending proxy task, skip preload for key: ");
                sb3.append(str);
                C51820c.m111143c("TAG_PROXY_Preloader", sb3.toString());
                return;
            } else {
                synchronized (this.f129433a) {
                    Map map = (Map) this.f129433a.get(z ? 1 : 0);
                    C51838d.m111179a(list);
                    iVar = new C51858a().mo107357a(cVar).mo107356a(cVar2).mo107360a(str).mo107364b(a).mo107355a(abVar).mo107361a(list).mo107354a(i).mo107358a(this.f129443m).mo107362a(true).mo107363a();
                    map.put(a, iVar);
                }
            }
        } else {
            return;
        }
        this.f129442k.execute(iVar);
    }
}
