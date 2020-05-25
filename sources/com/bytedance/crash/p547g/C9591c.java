package com.bytedance.crash.p547g;

import android.content.Context;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p551k.C9649f;
import com.bytedance.crash.p555n.C9705m;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.crash.g.c */
public final class C9591c {

    /* renamed from: a */
    public static final List<C9589a> f26167a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public static boolean f26168b = false;

    /* renamed from: c */
    private static Context f26169c;

    /* renamed from: d */
    private static volatile C9597e<C9589a> f26170d;

    /* renamed from: e */
    private static volatile Runnable f26171e;

    /* renamed from: com.bytedance.crash.g.c$a */
    static class C9593a implements Runnable {
        private C9593a() {
        }

        public final void run() {
            m19089a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f4, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized void m19089a() {
            /*
                r10 = this;
                monitor-enter(r10)
                boolean r0 = com.bytedance.crash.p547g.C9591c.f26168b     // Catch:{ all -> 0x00f5 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r10)
                return
            L_0x0007:
                com.bytedance.crash.p547g.C9591c.m19086c()     // Catch:{ all -> 0x00f5 }
                com.bytedance.crash.g.e r0 = com.bytedance.crash.p547g.C9591c.m19087d()     // Catch:{ all -> 0x00f5 }
                int r1 = r0.mo17428a()     // Catch:{ all -> 0x00f5 }
                if (r1 > 0) goto L_0x0016
                monitor-exit(r10)
                return
            L_0x0016:
                java.util.ArrayList r0 = r0.mo17431b()     // Catch:{ all -> 0x00f5 }
                boolean r1 = com.bytedance.crash.p555n.C9709p.m19415a(r0)     // Catch:{ all -> 0x00f5 }
                if (r1 != 0) goto L_0x00f3
                r1 = 0
                r2 = 0
            L_0x0022:
                int r3 = r0.size()     // Catch:{ all -> 0x00f5 }
                if (r2 >= r3) goto L_0x00f3
                org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ all -> 0x00f5 }
                r3.<init>()     // Catch:{ all -> 0x00f5 }
                int r4 = r0.size()     // Catch:{ all -> 0x00f5 }
                int r4 = r4 - r2
                r5 = 10
                if (r4 <= r5) goto L_0x0037
                goto L_0x003d
            L_0x0037:
                int r4 = r0.size()     // Catch:{ all -> 0x00f5 }
                int r5 = r4 - r2
            L_0x003d:
                int r5 = r5 + r2
                java.util.List r4 = r0.subList(r2, r5)     // Catch:{ all -> 0x00f5 }
                java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x00f5 }
            L_0x0046:
                boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00f5 }
                if (r6 == 0) goto L_0x005c
                java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00f5 }
                com.bytedance.crash.g.a r6 = (com.bytedance.crash.p547g.C9589a) r6     // Catch:{ all -> 0x00f5 }
                if (r6 == 0) goto L_0x0046
                org.json.JSONObject r6 = r6.mo17416a()     // Catch:{ all -> 0x00f5 }
                r3.put(r6)     // Catch:{ all -> 0x00f5 }
                goto L_0x0046
            L_0x005c:
                boolean r5 = com.bytedance.crash.p547g.C9591c.f26168b     // Catch:{ all -> 0x00f5 }
                if (r5 == 0) goto L_0x00ef
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x00f5 }
                r5.<init>()     // Catch:{ all -> 0x00f5 }
                com.bytedance.crash.g.e r6 = com.bytedance.crash.p547g.C9591c.m19087d()     // Catch:{ all -> 0x00f5 }
                java.lang.String r7 = "data"
                r5.put(r7, r3)     // Catch:{ JSONException -> 0x006e }
            L_0x006e:
                r3 = 0
                r7 = 1
                com.bytedance.crash.m.i$a r8 = new com.bytedance.crash.m.i$a     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                r8.<init>()     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                java.lang.String r9 = "https://api2.musical.ly/monitor/collect/c/crash_client_event"
                r8.f26403a = r9     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                java.lang.String r5 = r5.toString()     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                byte[] r5 = r5.getBytes()     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                r8.f26407e = r5     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                r8.f26405c = r7     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                r8.f26406d = r7     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                com.bytedance.crash.m.i r5 = new com.bytedance.crash.m.i     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                r5.<init>()     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                java.lang.String r9 = r8.f26403a     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                r5.f26398a = r9     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                java.lang.String r9 = r8.f26404b     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                r5.f26399b = r9     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                boolean r9 = r8.f26405c     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                r5.f26400c = r9     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                boolean r9 = r8.f26406d     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                r5.f26401d = r9     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                byte[] r8 = r8.f26407e     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                r5.f26402e = r8     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                com.bytedance.crash.m.j r5 = com.bytedance.crash.p554m.C9668b.m19278a(r5)     // Catch:{ OutOfMemoryError -> 0x00a7, Throwable -> 0x00a5 }
                r3 = r5
            L_0x00a5:
                r5 = 0
                goto L_0x00a8
            L_0x00a7:
                r5 = 1
            L_0x00a8:
                if (r3 == 0) goto L_0x00ea
                boolean r8 = r3.mo17529a()     // Catch:{ all -> 0x00f5 }
                if (r8 == 0) goto L_0x00ea
                org.json.JSONObject r8 = r3.f26410c     // Catch:{ all -> 0x00f5 }
                if (r8 == 0) goto L_0x00bf
                org.json.JSONObject r8 = r3.f26410c     // Catch:{ all -> 0x00f5 }
                java.lang.String r9 = "state"
                int r8 = r8.optInt(r9)     // Catch:{ all -> 0x00f5 }
                if (r8 != 0) goto L_0x00bf
                goto L_0x00c0
            L_0x00bf:
                r7 = 0
            L_0x00c0:
                if (r7 == 0) goto L_0x00c6
                r6.mo17430a(r4)     // Catch:{ all -> 0x00f5 }
                goto L_0x00cb
            L_0x00c6:
                if (r5 == 0) goto L_0x00cb
                r6.mo17430a(r4)     // Catch:{ all -> 0x00f5 }
            L_0x00cb:
                com.bytedance.crash.k.b r4 = com.bytedance.crash.C9616k.m19156h()     // Catch:{ all -> 0x00f5 }
                boolean r4 = r4.f26299l     // Catch:{ all -> 0x00f5 }
                if (r4 == 0) goto L_0x00ef
                org.json.JSONObject r3 = r3.f26410c     // Catch:{ all -> 0x00f5 }
                if (r3 != 0) goto L_0x00dc
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x00f5 }
                r3.<init>()     // Catch:{ all -> 0x00f5 }
            L_0x00dc:
                java.lang.String r4 = "device_id"
                com.bytedance.crash.k.i r5 = com.bytedance.crash.C9616k.m19151c()     // Catch:{ JSONException -> 0x00ef }
                java.lang.String r5 = r5.mo17507a()     // Catch:{ JSONException -> 0x00ef }
                r3.put(r4, r5)     // Catch:{ JSONException -> 0x00ef }
                goto L_0x00ef
            L_0x00ea:
                if (r5 == 0) goto L_0x00ef
                r6.mo17430a(r4)     // Catch:{ all -> 0x00f5 }
            L_0x00ef:
                int r2 = r2 + 10
                goto L_0x0022
            L_0x00f3:
                monitor-exit(r10)
                return
            L_0x00f5:
                r0 = move-exception
                monitor-exit(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p547g.C9591c.C9593a.m19089a():void");
        }
    }

    private C9591c() {
    }

    /* renamed from: a */
    public static void m19082a() {
        f26168b = false;
    }

    /* renamed from: b */
    public static void m19084b() {
        if (f26168b) {
            C9649f.m19247b().mo17509a(new Runnable() {
                public final void run() {
                    C9591c.m19086c();
                }
            });
        }
    }

    /* renamed from: e */
    public static Runnable m19088e() {
        if (f26171e == null) {
            synchronized (C9591c.class) {
                if (f26171e == null) {
                    f26171e = new C9593a();
                }
            }
        }
        return f26171e;
    }

    /* renamed from: c */
    public static void m19086c() {
        if (f26168b) {
            C9597e d = m19087d();
            int i = 0;
            while (i < f26167a.size()) {
                try {
                    C9589a aVar = (C9589a) f26167a.get(i);
                    if (aVar != null) {
                        d.mo17429a(aVar);
                    }
                    i++;
                } catch (Throwable unused) {
                }
            }
            f26167a.clear();
        }
    }

    /* renamed from: d */
    public static C9597e<C9589a> m19087d() {
        Context context;
        if (f26170d == null) {
            synchronized (C9591c.class) {
                if (f26170d == null) {
                    if (f26169c == null) {
                        context = C9616k.m19154f();
                    } else {
                        context = f26169c;
                    }
                    f26170d = new C9594d(new File(C9705m.m19403f(context), "monitorLog"));
                }
            }
        }
        return f26170d;
    }

    /* renamed from: a */
    public static void m19083a(C9589a aVar) {
        if (f26168b && aVar != null) {
            try {
                f26167a.add(aVar);
                if (f26167a.size() > 5) {
                    m19084b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m19085b(C9589a aVar) {
        if (f26168b) {
            m19086c();
            if (aVar != null) {
                aVar.eventTime = System.currentTimeMillis();
                m19087d().mo17429a(aVar);
            }
        }
    }
}
