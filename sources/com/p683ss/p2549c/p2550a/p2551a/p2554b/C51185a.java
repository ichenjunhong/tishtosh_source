package com.p683ss.p2549c.p2550a.p2551a.p2554b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p030v4.p038f.C0777a;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.p2549c.p2550a.p2551a.p2552a.C51176d;
import com.p683ss.p2549c.p2550a.p2551a.p2552a.C51177e;
import com.p683ss.p2549c.p2550a.p2551a.p2552a.C51177e.C51181a;
import com.p683ss.p2549c.p2550a.p2551a.p2552a.p2553a.C51170a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.c.a.a.b.a */
public final class C51185a implements C51201e {

    /* renamed from: a */
    public final Handler f127841a = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            if (message != null && message.what == 1024) {
                if (C51185a.this.f127850j) {
                    C51185a.this.mo101717a();
                    return;
                }
                C51176d.m110086a().f127824c.mo101708a();
            }
        }
    };

    /* renamed from: b */
    public final Context f127842b;

    /* renamed from: c */
    public final BroadcastReceiver f127843c;

    /* renamed from: d */
    public final List<Callable<?>> f127844d;

    /* renamed from: e */
    public boolean f127845e;

    /* renamed from: f */
    public Set<String> f127846f;

    /* renamed from: g */
    public long f127847g;

    /* renamed from: h */
    boolean f127848h;

    /* renamed from: i */
    public boolean f127849i;

    /* renamed from: j */
    public boolean f127850j;

    /* renamed from: k */
    public int f127851k;

    /* renamed from: l */
    private final ThreadPoolExecutor f127852l;

    /* renamed from: m */
    private final Map<String, C51204h> f127853m;

    /* renamed from: n */
    private final Map<String, C51204h> f127854n;

    /* renamed from: o */
    private C51181a f127855o;

    /* renamed from: com.ss.c.a.a.b.a$a */
    interface C51195a<T> {
        /* renamed from: a */
        void mo101724a(T t);
    }

    /* renamed from: com.ss.c.a.a.b.a$b */
    static class C51196b implements ThreadFactory {

        /* renamed from: a */
        private final ThreadGroup f127870a;

        /* renamed from: b */
        private final AtomicInteger f127871b;

        /* renamed from: c */
        private final String f127872c;

        private C51196b() {
            ThreadGroup threadGroup;
            this.f127871b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f127870a = threadGroup;
            this.f127872c = "dns-optimizer-";
        }

        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f127870a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f127872c);
            sb.append(this.f127871b.getAndIncrement());
            Thread thread = new Thread(threadGroup, runnable, sb.toString(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            return thread;
        }
    }

    static {
        C51203g.f127877a = false;
    }

    /* renamed from: b */
    public final String mo101720b() {
        if (this.f127854n == null) {
            return null;
        }
        int i = 0;
        String str = "{ \"IpMap\":{";
        for (C51204h hVar : this.f127854n.values()) {
            C51208k kVar = hVar.f127879b;
            if (kVar != null) {
                if (i != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(",");
                    str = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(kVar.toString());
                str = sb2.toString();
                i++;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("}}");
        return sb3.toString();
    }

    /* renamed from: a */
    public final void mo101717a() {
        if (this.f127850j && this.f127854n != null) {
            if (this.f127854n.size() == 0) {
                mo101719a((Callable<T>) new C51200d<T>(mo101720b()), (C51195a<T>) new C51195a<C51170a>() {
                    /* renamed from: a */
                    public final /* synthetic */ void mo101724a(Object obj) {
                        C51185a.this.mo101718a((C51170a) obj);
                        C51185a.this.f127841a.removeMessages(PreloadTask.BYTE_UNIT_NUMBER);
                        C51185a.this.f127841a.sendEmptyMessageDelayed(PreloadTask.BYTE_UNIT_NUMBER, C51185a.this.f127847g);
                    }
                });
                return;
            }
            this.f127851k = 0;
            for (C51204h a : this.f127854n.values()) {
                m110091a(a);
            }
        }
    }

    /* renamed from: a */
    private void m110091a(final C51204h hVar) {
        mo101719a((Callable<T>) new C51202f<T>(hVar.f127878a), (C51195a<T>) new C51195a<C51208k>() {
            /* renamed from: a */
            public final /* synthetic */ void mo101724a(Object obj) {
                C51208k kVar = (C51208k) obj;
                if (kVar == null) {
                    kVar = new C51208k(hVar.f127878a, null, 0);
                }
                C51204h hVar = hVar;
                hVar.f127879b = kVar;
                hVar.mo101734b();
                C51185a.this.f127851k++;
                if (C51185a.this.f127851k == C51185a.this.f127846f.size()) {
                    C51185a.this.mo101719a((Callable<T>) new C51200d<T>(C51185a.this.mo101720b()), (C51195a<T>) new C51195a<C51170a>() {
                        /* renamed from: a */
                        public final /* synthetic */ void mo101724a(Object obj) {
                            C51185a.this.mo101718a((C51170a) obj);
                            C51185a.this.f127841a.removeMessages(PreloadTask.BYTE_UNIT_NUMBER);
                            C51185a.this.f127841a.sendEmptyMessageDelayed(PreloadTask.BYTE_UNIT_NUMBER, C51185a.this.f127847g);
                        }
                    });
                }
                if (C51185a.this.f127849i) {
                    C51185a aVar = C51185a.this;
                    C51204h hVar2 = hVar;
                    List<String> unmodifiableList = Collections.unmodifiableList(hVar2.f127880c);
                    if (!unmodifiableList.isEmpty()) {
                        for (String jVar : unmodifiableList) {
                            aVar.mo101719a((Callable<T>) new C51207j<T>(jVar, 10), (C51195a<T>) new C51195a<C51206i>(hVar2) {

                                /* renamed from: a */
                                final /* synthetic */ C51204h f127863a;

                                /* renamed from: a */
                                public final /* synthetic */ void mo101724a(Object obj) {
                                    boolean z;
                                    C51206i iVar = (C51206i) obj;
                                    C51204h hVar = this.f127863a;
                                    hVar.f127881d.put(iVar.f127887a, iVar);
                                    if (hVar.f127881d.size() == hVar.f127880c.size()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        ArrayList arrayList = new ArrayList(hVar.f127880c);
                                        Collections.sort(arrayList, new Comparator<String>() {
                                            public final /* synthetic */ int compare(Object obj, Object obj2) {
                                                C51206i iVar = (C51206i) C51204h.this.f127881d.get((String) obj);
                                                C51206i iVar2 = (C51206i) C51204h.this.f127881d.get((String) obj2);
                                                if (iVar == null && iVar2 == null) {
                                                    return 0;
                                                }
                                                if (iVar == null) {
                                                    return 1;
                                                }
                                                if (iVar2 == null) {
                                                    return -1;
                                                }
                                                int signum = (int) Math.signum(iVar.f127889c - iVar2.f127889c);
                                                if (signum == 0) {
                                                    signum = (int) Math.signum(iVar.f127890d - iVar2.f127890d);
                                                }
                                                return signum;
                                            }
                                        });
                                        hVar.f127882e.clear();
                                        if (arrayList.size() <= 3) {
                                            hVar.f127882e.addAll(arrayList);
                                        } else {
                                            hVar.f127882e.addAll(arrayList.subList(0, 3));
                                        }
                                    }
                                }

                                {
                                    this.f127863a = r2;
                                }
                            });
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public final boolean mo101721b(String str) {
        if (!this.f127845e) {
            return false;
        }
        return this.f127848h;
    }

    /* renamed from: a */
    public static boolean m110092a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo a = C51198b.m110106a(connectivityManager);
            if (a == null || !a.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r1 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo101715a(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = r2.f127845e
            r1 = 0
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.f127848h
            if (r0 != 0) goto L_0x000a
            goto L_0x0029
        L_0x000a:
            java.util.Map<java.lang.String, com.ss.c.a.a.b.h> r0 = r2.f127854n
            java.lang.Object r0 = r0.get(r3)
            com.ss.c.a.a.b.h r0 = (com.p683ss.p2549c.p2550a.p2551a.p2554b.C51204h) r0
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = r0.mo101731a()
            if (r1 != 0) goto L_0x0028
        L_0x001a:
            java.util.Map<java.lang.String, com.ss.c.a.a.b.h> r0 = r2.f127853m
            java.lang.Object r3 = r0.get(r3)
            com.ss.c.a.a.b.h r3 = (com.p683ss.p2549c.p2550a.p2551a.p2554b.C51204h) r3
            if (r3 == 0) goto L_0x0028
            java.lang.String r1 = r3.mo101731a()
        L_0x0028:
            return r1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.p2549c.p2550a.p2551a.p2554b.C51185a.mo101715a(java.lang.String):java.lang.String");
    }

    public C51185a(Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C51196b());
        this.f127852l = threadPoolExecutor;
        this.f127852l.allowCoreThreadTimeOut(true);
        this.f127843c = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    return;
                }
                if (!C51185a.m110092a(context)) {
                    C51185a.this.f127841a.removeMessages(PreloadTask.BYTE_UNIT_NUMBER);
                    return;
                }
                C51185a.this.f127841a.removeMessages(PreloadTask.BYTE_UNIT_NUMBER);
                C51185a.this.f127841a.sendEmptyMessageDelayed(PreloadTask.BYTE_UNIT_NUMBER, 2000);
            }
        };
        this.f127853m = new C0777a();
        this.f127854n = new C0777a();
        this.f127844d = new LinkedList();
        this.f127845e = false;
        this.f127847g = 300000;
        this.f127848h = true;
        this.f127849i = false;
        this.f127850j = true;
        this.f127851k = 0;
        this.f127855o = null;
        this.f127842b = context;
        if (this.f127855o == null) {
            this.f127855o = new C51181a() {
                /* renamed from: a */
                public final void mo101712a(C51170a aVar) {
                    C51185a aVar2 = C51185a.this;
                    if (aVar != null && aVar2.f127845e) {
                        aVar2.mo101718a(aVar);
                        if (aVar2.f127848h) {
                            aVar2.mo101717a();
                        }
                    }
                }
            };
            C51177e eVar = C51176d.m110086a().f127824c;
            eVar.f127826a.add(this.f127855o);
        }
    }

    /* renamed from: a */
    public final void mo101718a(C51170a aVar) {
        if (aVar != null) {
            this.f127846f = aVar.mo101705a();
            long j = 300000;
            if (((long) (aVar.f127806b * 1000)) >= 300000) {
                j = (long) (aVar.f127806b * 1000);
            }
            this.f127847g = j;
            this.f127848h = aVar.f127807c;
            this.f127850j = aVar.f127808d;
            if (this.f127846f == null || this.f127846f.size() == 0) {
                this.f127854n.clear();
                return;
            }
            for (String str : this.f127846f) {
                C51204h hVar = new C51204h(str);
                this.f127854n.put(str, hVar);
                hVar.mo101733a(new C51208k(str, aVar.mo101704a(str), 0));
                hVar.f127883f = aVar.f127805a;
            }
        }
    }

    /* renamed from: a */
    public final String mo101716a(String str, String str2) {
        if (!this.f127845e) {
            return null;
        }
        C51204h hVar = (C51204h) this.f127854n.get(str);
        if (hVar != null) {
            return hVar.mo101732a(str2);
        }
        C51204h hVar2 = (C51204h) this.f127853m.get(str);
        if (hVar2 != null) {
            return hVar2.mo101732a(str2);
        }
        return null;
    }

    /* renamed from: a */
    public final <T> void mo101719a(final Callable<T> callable, final C51195a<T> aVar) {
        if (this.f127845e) {
            synchronized (this.f127844d) {
                this.f127844d.add(callable);
            }
            this.f127852l.submit(new Runnable() {
                public final void run() {
                    boolean z;
                    synchronized (C51185a.this.f127844d) {
                        z = !C51185a.this.f127844d.contains(callable);
                    }
                    if (!z) {
                        final Object obj = null;
                        try {
                            obj = callable.call();
                        } catch (Exception unused) {
                        }
                        C51185a.this.f127841a.post(new Runnable() {
                            public final void run() {
                                boolean z;
                                synchronized (C51185a.this.f127844d) {
                                    z = !C51185a.this.f127844d.remove(callable);
                                }
                                if (!z) {
                                    aVar.mo101724a(obj);
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
