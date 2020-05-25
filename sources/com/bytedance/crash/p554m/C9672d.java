package com.bytedance.crash.p554m;

import android.text.TextUtils;
import com.bytedance.crash.C9610j;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p546f.C9585b;
import com.bytedance.crash.p551k.C9649f;
import com.bytedance.crash.p551k.C9656j;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;

/* renamed from: com.bytedance.crash.m.d */
public final class C9672d {

    /* renamed from: a */
    public static final ConcurrentLinkedQueue<C9585b> f26384a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    public static final HashMap<String, ConcurrentLinkedQueue<C9585b>> f26385b = new HashMap<>();

    /* renamed from: e */
    private static volatile C9672d f26386e;

    /* renamed from: c */
    public final C9656j f26387c = C9649f.m19247b();

    /* renamed from: d */
    public Runnable f26388d = new Runnable() {
        public final void run() {
            if (!C9672d.f26385b.isEmpty() && C9616k.m19156h().mo17477b() != null) {
                C9672d.m19296b();
            }
            C9672d.this.mo17519c();
            C9672d.this.f26387c.mo17510a(C9672d.this.f26388d, 30000);
        }
    };

    /* renamed from: f */
    private volatile boolean f26389f;

    private C9672d() {
    }

    /* renamed from: a */
    public static C9672d m19294a() {
        if (f26386e == null) {
            synchronized (C9672d.class) {
                if (f26386e == null) {
                    f26386e = new C9672d();
                }
            }
        }
        return f26386e;
    }

    /* renamed from: e */
    private static void m19300e() {
        if (C9610j.m19136a()) {
            try {
                C9649f.m19247b().mo17509a(new Runnable() {
                    public final void run() {
                        C9672d.m19294a().mo17519c();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    private static void m19299d() {
        if (C9616k.m19156h().mo17477b() == null) {
            if (System.currentTimeMillis() - C9616k.m19157i() > 180000) {
                try {
                    C9649f.m19247b().mo17509a(new Runnable() {
                        public final void run() {
                            C9672d.m19296b();
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        } else if (!f26385b.isEmpty()) {
            try {
                C9649f.m19247b().mo17509a(new Runnable() {
                    public final void run() {
                        C9672d.m19296b();
                    }
                });
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: b */
    public static void m19296b() {
        HashMap hashMap;
        synchronized (f26385b) {
            hashMap = new HashMap(f26385b);
            f26385b.clear();
        }
        if (C9616k.m19156h().mo17477b() != null) {
            for (Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) entry.getValue();
                if (concurrentLinkedQueue != null && (C9616k.m19156h().mo17477b() == null || C9616k.m19156h().mo17477b().getLogTypeSwitch(str))) {
                    while (!concurrentLinkedQueue.isEmpty()) {
                        try {
                            C9585b bVar = (C9585b) concurrentLinkedQueue.poll();
                            if (bVar == null) {
                                break;
                            }
                            m19297b(bVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        r0 = new java.util.LinkedList();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17519c() {
        /*
            r4 = this;
            com.bytedance.crash.k.j r0 = r4.f26387c
            monitor-enter(r0)
            boolean r1 = r4.f26389f     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            return
        L_0x0009:
            r1 = 1
            r4.f26389f = r1     // Catch:{ all -> 0x0057 }
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        L_0x0012:
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.crash.f.b> r1 = f26384a
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 != 0) goto L_0x0054
            r1 = 0
        L_0x001c:
            r3 = 10
            if (r1 >= r3) goto L_0x0036
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.crash.f.b> r3 = f26384a     // Catch:{ Throwable -> 0x0034 }
            boolean r3 = r3.isEmpty()     // Catch:{ Throwable -> 0x0034 }
            if (r3 != 0) goto L_0x0036
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.crash.f.b> r3 = f26384a     // Catch:{ Throwable -> 0x0034 }
            java.lang.Object r3 = r3.poll()     // Catch:{ Throwable -> 0x0034 }
            r0.add(r3)     // Catch:{ Throwable -> 0x0034 }
            int r1 = r1 + 1
            goto L_0x001c
        L_0x0034:
            goto L_0x0012
        L_0x0036:
            boolean r1 = r0.isEmpty()     // Catch:{ Throwable -> 0x0034 }
            if (r1 == 0) goto L_0x003d
            goto L_0x0054
        L_0x003d:
            com.bytedance.crash.k.a.f r1 = com.bytedance.crash.p551k.p552a.C9628f.m19195a()     // Catch:{ Throwable -> 0x0034 }
            com.bytedance.crash.f.a r1 = r1.mo17474a(r0)     // Catch:{ Throwable -> 0x0034 }
            if (r1 == 0) goto L_0x0050
            com.bytedance.crash.m.a r2 = com.bytedance.crash.p554m.C9667a.m19271a()     // Catch:{ Throwable -> 0x0034 }
            org.json.JSONObject r1 = r1.f26141a     // Catch:{ Throwable -> 0x0034 }
            r2.mo17517a(r1)     // Catch:{ Throwable -> 0x0034 }
        L_0x0050:
            r0.clear()     // Catch:{ Throwable -> 0x0034 }
            goto L_0x0012
        L_0x0054:
            r4.f26389f = r2
            return
        L_0x0057:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p554m.C9672d.mo17519c():void");
    }

    /* renamed from: b */
    private static void m19297b(C9585b bVar) {
        boolean z;
        f26384a.add(bVar);
        int size = f26384a.size();
        if (size >= 10) {
            z = true;
        } else {
            z = false;
        }
        new StringBuilder("[enqueue] size=").append(size);
        if (z) {
            m19300e();
        }
    }

    /* renamed from: c */
    private static void m19298c(C9585b bVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        try {
            String string = bVar.f26141a.getString("log_type");
            synchronized (f26385b) {
                concurrentLinkedQueue = (ConcurrentLinkedQueue) f26385b.get(string);
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    f26385b.put(string, concurrentLinkedQueue);
                }
            }
            concurrentLinkedQueue.add(bVar);
            if (concurrentLinkedQueue.size() > 100) {
                concurrentLinkedQueue.poll();
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m19295a(C9585b bVar) {
        m19299d();
        if (C9616k.m19156h().mo17477b() != null || System.currentTimeMillis() - C9616k.m19157i() >= 180000) {
            String str = null;
            try {
                str = bVar.f26141a.getString("log_type");
            } catch (JSONException unused) {
            }
            if (!TextUtils.isEmpty(str) && C9616k.m19156h().mo17477b() != null && C9616k.m19156h().mo17477b().getLogTypeSwitch(str)) {
                m19297b(bVar);
            }
            return;
        }
        m19298c(bVar);
    }
}
