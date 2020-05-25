package com.toutiao.proxyserver;

import android.util.SparseArray;
import com.toutiao.proxyserver.C51904u.C51911c;
import com.toutiao.proxyserver.p2610b.C51808b;
import com.toutiao.proxyserver.p2610b.C51809c;
import com.toutiao.proxyserver.p2612d.C51820c;
import com.toutiao.proxyserver.p2614f.C51838d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ProxySelector;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.toutiao.proxyserver.t */
public class C51897t {

    /* renamed from: e */
    public static volatile C51897t f129492e;

    /* renamed from: a */
    public volatile ServerSocket f129493a;

    /* renamed from: b */
    public volatile int f129494b;

    /* renamed from: c */
    public final AtomicInteger f129495c = new AtomicInteger(0);

    /* renamed from: d */
    public final ExecutorService f129496d;

    /* renamed from: f */
    public volatile C51809c f129497f;

    /* renamed from: g */
    public volatile C51843h f129498g;

    /* renamed from: h */
    public final SparseArray<Set<C51904u>> f129499h;

    /* renamed from: i */
    public final C51911c f129500i;

    /* renamed from: j */
    public volatile long f129501j;

    /* renamed from: k */
    public volatile long f129502k;

    /* renamed from: l */
    public volatile long f129503l;

    /* renamed from: m */
    public final Runnable f129504m;

    /* renamed from: n */
    public final AtomicBoolean f129505n;

    /* renamed from: com.toutiao.proxyserver.t$a */
    static final class C51903a implements Callable<Boolean> {

        /* renamed from: a */
        private final String f129517a;

        /* renamed from: b */
        private final int f129518b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean call() throws Exception {
            Socket socket;
            Throwable th;
            Socket socket2 = null;
            try {
                socket = new Socket(this.f129517a, this.f129518b);
                try {
                    socket.setSoTimeout(2000);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Ping\n".getBytes(C51838d.f129327a));
                    outputStream.flush();
                    if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                        Boolean valueOf = Boolean.valueOf(true);
                        C51838d.m111178a(socket);
                        return valueOf;
                    }
                    C51838d.m111178a(socket);
                    return Boolean.valueOf(false);
                } catch (Throwable th2) {
                    th = th2;
                    C51838d.m111178a(socket);
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                socket = null;
                th = th4;
                C51838d.m111178a(socket);
                throw th;
            }
        }

        C51903a(String str, int i) {
            this.f129517a = str;
            this.f129518b = i;
        }
    }

    /* renamed from: a */
    public static C51897t m111286a() {
        if (f129492e == null) {
            synchronized (C51897t.class) {
                if (f129492e == null) {
                    f129492e = new C51897t();
                }
            }
        }
        return f129492e;
    }

    private C51897t() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder("video-proxyserver-");
                sb.append(thread.getId());
                thread.setName(sb.toString());
                return thread;
            }
        });
        this.f129496d = threadPoolExecutor;
        this.f129499h = new SparseArray<>(2);
        this.f129500i = new C51911c() {
            /* renamed from: a */
            public final void mo107412a(C51904u uVar) {
                StringBuilder sb = new StringBuilder("startExecute, ProxyTask: ");
                sb.append(uVar);
                C51820c.m111139a("TAG_PROXY_ProxyServer", sb.toString());
                synchronized (C51897t.this.f129499h) {
                    Set set = (Set) C51897t.this.f129499h.get(uVar.mo107283g());
                    if (set != null) {
                        set.add(uVar);
                    }
                }
            }

            /* renamed from: b */
            public final void mo107413b(final C51904u uVar) {
                StringBuilder sb = new StringBuilder("afterExecute, ProxyTask: ");
                sb.append(uVar);
                C51820c.m111139a("TAG_PROXY_ProxyServer", sb.toString());
                final int g = uVar.mo107283g();
                synchronized (C51897t.this.f129499h) {
                    Set set = (Set) C51897t.this.f129499h.get(g);
                    if (set != null) {
                        set.remove(uVar);
                    }
                }
                final C51880o oVar = C51895s.f129471f;
                if (oVar != null) {
                    C51838d.m111186b((Runnable) new Runnable() {
                        public final void run() {
                            oVar.mo95387a(C51808b.m111117a(g), "proxy", uVar.f129199c.get(), 0, uVar.f129200d.get());
                        }
                    });
                }
            }
        };
        this.f129501j = 10000;
        this.f129502k = 10000;
        this.f129503l = 10000;
        this.f129504m = new Runnable() {
            public final void run() {
                try {
                    int i = 0;
                    C51897t.this.f129493a = new ServerSocket(0, 50, InetAddress.getByName("127.0.0.1"));
                    C51897t.this.f129494b = C51897t.this.f129493a.getLocalPort();
                    if (C51897t.this.f129494b == -1) {
                        C51897t.this.mo107409b();
                        return;
                    }
                    ProxySelector.setDefault(new C51919y("127.0.0.1", C51897t.this.f129494b));
                    if (C51897t.this.mo107410c() && C51897t.this.f129495c.compareAndSet(0, 1)) {
                        C51820c.m111141b("TAG_PROXY_ProxyServer", "proxy server start!");
                        while (C51897t.this.f129495c.get() == 1) {
                            try {
                                try {
                                    Socket accept = C51897t.this.f129493a.accept();
                                    C51820c.m111141b("TAG_PROXY_ProxyServer", "proxy server new task!");
                                    C51809c cVar = C51897t.this.f129497f;
                                    if (cVar != null) {
                                        C51909a aVar = new C51909a();
                                        if (cVar != null) {
                                            aVar.f129537b = cVar;
                                            ExecutorService executorService = C51897t.this.f129496d;
                                            if (executorService != null) {
                                                aVar.f129538c = executorService;
                                                if (accept != null) {
                                                    aVar.f129539d = accept;
                                                    aVar.f129540e = C51897t.this.f129500i;
                                                    if (aVar.f129537b == null || aVar.f129538c == null || aVar.f129539d == null) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    C51897t.this.f129496d.execute(new C51904u(aVar));
                                                } else {
                                                    throw new IllegalArgumentException("socket == null");
                                                }
                                            } else {
                                                throw new IllegalArgumentException("executor == null");
                                            }
                                        } else {
                                            throw new IllegalArgumentException("db == null");
                                        }
                                    } else {
                                        C51838d.m111178a(accept);
                                    }
                                } catch (IOException unused) {
                                    i++;
                                    if (i > 3) {
                                        break;
                                    }
                                }
                            } catch (Throwable th) {
                                StringBuilder sb = new StringBuilder("proxy server crashed!  ");
                                sb.append(C51820c.m111138a(th));
                                C51820c.m111145d("TAG_PROXY_ProxyServer", sb.toString());
                            }
                        }
                        C51820c.m111141b("TAG_PROXY_ProxyServer", "proxy server closed!");
                        C51897t.this.mo107409b();
                    }
                } catch (IOException e) {
                    StringBuilder sb2 = new StringBuilder("create ServerSocket error!  ");
                    sb2.append(C51820c.m111138a(e));
                    C51820c.m111145d("TAG_PROXY_ProxyServer", sb2.toString());
                    C51897t.this.mo107409b();
                }
            }
        };
        this.f129505n = new AtomicBoolean();
        this.f129499h.put(0, new HashSet());
        this.f129499h.put(1, new HashSet());
    }

    /* renamed from: b */
    public final void mo107409b() {
        if (this.f129495c.compareAndSet(1, 2) || this.f129495c.compareAndSet(0, 2)) {
            ServerSocket serverSocket = this.f129493a;
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (Throwable unused) {
                }
            }
            this.f129496d.shutdownNow();
            ArrayList arrayList = new ArrayList();
            synchronized (this.f129499h) {
                int size = this.f129499h.size();
                for (int i = 0; i < size; i++) {
                    Set set = (Set) this.f129499h.get(this.f129499h.keyAt(i));
                    if (set != null) {
                        arrayList.addAll(set);
                        set.clear();
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C51904u) it.next()).mo107271a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[Catch:{ Throwable -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[Catch:{ Throwable -> 0x0079 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo107410c() {
        /*
            r5 = this;
            com.toutiao.proxyserver.t$a r0 = new com.toutiao.proxyserver.t$a
            java.lang.String r1 = "127.0.0.1"
            int r2 = r5.f129494b
            r0.<init>(r1, r2)
            java.util.concurrent.ExecutorService r1 = r5.f129496d
            java.util.concurrent.Future r0 = r1.submit(r0)
            r1 = 0
            java.net.ServerSocket r2 = r5.f129493a     // Catch:{ IOException -> 0x0055, all -> 0x004f }
            java.net.Socket r2 = r2.accept()     // Catch:{ IOException -> 0x0055, all -> 0x004f }
            r1 = 2000(0x7d0, float:2.803E-42)
            r2.setSoTimeout(r1)     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            java.io.InputStream r4 = r2.getInputStream()     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            r3.<init>(r4)     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            r1.<init>(r3)     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            java.lang.String r3 = "Ping"
            java.lang.String r1 = r1.readLine()     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            boolean r1 = r3.equals(r1)     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            if (r1 == 0) goto L_0x0047
            java.io.OutputStream r1 = r2.getOutputStream()     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            java.lang.String r3 = "OK\n"
            java.nio.charset.Charset r4 = com.toutiao.proxyserver.p2614f.C51838d.f129327a     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            byte[] r3 = r3.getBytes(r4)     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            r1.write(r3)     // Catch:{ IOException -> 0x004d, all -> 0x004b }
            r1.flush()     // Catch:{ IOException -> 0x004d, all -> 0x004b }
        L_0x0047:
            com.toutiao.proxyserver.p2614f.C51838d.m111178a(r2)
            goto L_0x0058
        L_0x004b:
            r0 = move-exception
            goto L_0x0051
        L_0x004d:
            r1 = r2
            goto L_0x0055
        L_0x004f:
            r0 = move-exception
            r2 = r1
        L_0x0051:
            com.toutiao.proxyserver.p2614f.C51838d.m111178a(r2)
            throw r0
        L_0x0055:
            com.toutiao.proxyserver.p2614f.C51838d.m111178a(r1)
        L_0x0058:
            r1 = 0
            java.lang.Object r0 = r0.get()     // Catch:{ Throwable -> 0x0079 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x0079 }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x0079 }
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "TAG_PROXY_ProxyServer"
            java.lang.String r2 = "Ping error"
            com.toutiao.proxyserver.p2612d.C51820c.m111145d(r0, r2)     // Catch:{ Throwable -> 0x0079 }
            r5.mo107409b()     // Catch:{ Throwable -> 0x0079 }
            return r1
        L_0x0070:
            java.lang.String r0 = "TAG_PROXY_ProxyServer"
            java.lang.String r2 = "Ping OK!"
            com.toutiao.proxyserver.p2612d.C51820c.m111141b(r0, r2)     // Catch:{ Throwable -> 0x0079 }
            r0 = 1
            return r0
        L_0x0079:
            r0 = move-exception
            java.lang.String r2 = "TAG_PROXY_ProxyServer"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Error happen in ping. "
            r3.<init>(r4)
            java.lang.String r0 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.toutiao.proxyserver.p2612d.C51820c.m111145d(r2, r0)
            r5.mo107409b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C51897t.mo107410c():boolean");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo107408a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.util.SparseArray<java.util.Set<com.toutiao.proxyserver.u>> r1 = r3.f129499h
            monitor-enter(r1)
            android.util.SparseArray<java.util.Set<com.toutiao.proxyserver.u>> r2 = r3.f129499h     // Catch:{ all -> 0x0030 }
            java.lang.Object r4 = r2.get(r4)     // Catch:{ all -> 0x0030 }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x002e
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0030 }
        L_0x0015:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0030 }
            com.toutiao.proxyserver.u r2 = (com.toutiao.proxyserver.C51904u) r2     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = r2.f129204h     // Catch:{ all -> 0x0030 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0015
            r4 = 1
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return r4
        L_0x002e:
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return r0
        L_0x0030:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C51897t.mo107408a(int, java.lang.String):boolean");
    }
}
