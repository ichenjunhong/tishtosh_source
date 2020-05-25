package com.facebook.p914c.p916b;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.StatFs;
import com.facebook.common.p917a.C13657a;
import com.facebook.common.p917a.C13658b;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p925i.C13721a;
import com.facebook.common.p925i.C13721a.C13722a;
import com.facebook.common.time.C13736a;
import com.facebook.common.time.C13738c;
import com.facebook.p913b.C13613a;
import com.facebook.p914c.p915a.C13616a;
import com.facebook.p914c.p915a.C13617b;
import com.facebook.p914c.p915a.C13617b.C13618a;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p914c.p915a.C13620d;
import com.facebook.p914c.p915a.C13625i;
import com.facebook.p914c.p916b.C13640d.C13641a;
import com.facebook.p914c.p916b.C13640d.C13642b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.c.b.e */
public class C13643e implements C13651i, C13657a {

    /* renamed from: e */
    private static final Class<?> f35586e = C13643e.class;

    /* renamed from: f */
    private static final long f35587f = TimeUnit.HOURS.toMillis(2);

    /* renamed from: g */
    private static final long f35588g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final CountDownLatch f35589a;

    /* renamed from: b */
    final Set<String> f35590b;

    /* renamed from: c */
    public final Object f35591c = new Object();

    /* renamed from: d */
    public boolean f35592d;

    /* renamed from: h */
    private final long f35593h;

    /* renamed from: i */
    private final long f35594i;

    /* renamed from: j */
    private long f35595j;

    /* renamed from: k */
    private final C13617b f35596k;

    /* renamed from: l */
    private long f35597l;

    /* renamed from: m */
    private final long f35598m;

    /* renamed from: n */
    private final C13721a f35599n;

    /* renamed from: o */
    private final C13640d f35600o;

    /* renamed from: p */
    private final C13650h f35601p;

    /* renamed from: q */
    private final C13616a f35602q;

    /* renamed from: r */
    private final boolean f35603r;

    /* renamed from: s */
    private final C13645a f35604s;

    /* renamed from: t */
    private final C13736a f35605t;

    /* renamed from: com.facebook.c.b.e$a */
    static class C13645a {

        /* renamed from: a */
        private boolean f35607a;

        /* renamed from: b */
        private long f35608b = -1;

        /* renamed from: c */
        private long f35609c = -1;

        /* renamed from: a */
        public final synchronized boolean mo25515a() {
            return this.f35607a;
        }

        /* renamed from: c */
        public final synchronized long mo25518c() {
            return this.f35608b;
        }

        /* renamed from: d */
        public final synchronized long mo25519d() {
            return this.f35609c;
        }

        C13645a() {
        }

        /* renamed from: b */
        public final synchronized void mo25516b() {
            this.f35607a = false;
            this.f35609c = -1;
            this.f35608b = -1;
        }

        /* renamed from: a */
        public final synchronized void mo25514a(long j, long j2) {
            this.f35609c = j2;
            this.f35608b = j;
            this.f35607a = true;
        }

        /* renamed from: b */
        public final synchronized void mo25517b(long j, long j2) {
            if (this.f35607a) {
                this.f35608b += j;
                this.f35609c += j2;
            }
        }
    }

    /* renamed from: com.facebook.c.b.e$b */
    public static class C13646b {

        /* renamed from: a */
        public final long f35610a;

        /* renamed from: b */
        public final long f35611b;

        /* renamed from: c */
        public final long f35612c;

        public C13646b(long j, long j2, long j3) {
            this.f35610a = j;
            this.f35611b = j2;
            this.f35612c = j3;
        }
    }

    /* renamed from: c */
    public final void mo25509c() {
        mo25506a();
    }

    /* renamed from: a */
    public final void mo25506a() {
        synchronized (this.f35591c) {
            try {
                this.f35600o.mo25484c();
                this.f35590b.clear();
            } catch (IOException | NullPointerException e) {
                new StringBuilder("clearAll: ").append(e.getMessage());
            }
            this.f35604s.mo25516b();
        }
    }

    /* renamed from: d */
    public final boolean mo25511d() {
        long a = this.f35605t.mo25665a();
        if (!this.f35604s.mo25515a() || this.f35597l == -1 || a - this.f35597l > f35588g) {
            return m27557e();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25507b() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f35591c
            monitor-enter(r0)
            r9.mo25511d()     // Catch:{ all -> 0x006e }
            com.facebook.c.b.e$a r1 = r9.f35604s     // Catch:{ all -> 0x006e }
            long r1 = r1.mo25518c()     // Catch:{ all -> 0x006e }
            long r3 = r9.f35598m     // Catch:{ all -> 0x006e }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x006c
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x006c
            long r3 = r9.f35598m     // Catch:{ all -> 0x006e }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001f
            goto L_0x006c
        L_0x001f:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r5 = r9.f35598m     // Catch:{ all -> 0x006e }
            double r5 = (double) r5
            double r1 = (double) r1
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r1)
            double r5 = r5 / r1
            double r3 = r3 - r5
            r1 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x006a
            java.lang.Object r1 = r9.f35591c     // Catch:{ all -> 0x006e }
            monitor-enter(r1)     // Catch:{ all -> 0x006e }
            com.facebook.c.b.e$a r2 = r9.f35604s     // Catch:{ IOException -> 0x0057 }
            r2.mo25516b()     // Catch:{ IOException -> 0x0057 }
            r9.mo25511d()     // Catch:{ IOException -> 0x0057 }
            com.facebook.c.b.e$a r2 = r9.f35604s     // Catch:{ IOException -> 0x0057 }
            long r5 = r2.mo25518c()     // Catch:{ IOException -> 0x0057 }
            double r7 = (double) r5
            java.lang.Double.isNaN(r7)
            double r3 = r3 * r7
            long r2 = (long) r3
            long r5 = r5 - r2
            com.facebook.c.a.b$a r2 = com.facebook.p914c.p915a.C13617b.C13618a.CACHE_MANAGER_TRIMMED     // Catch:{ IOException -> 0x0057 }
            r9.m27556a(r5, r2)     // Catch:{ IOException -> 0x0057 }
            goto L_0x0066
        L_0x0055:
            r2 = move-exception
            goto L_0x0068
        L_0x0057:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = "trimBy: "
            r3.<init>(r4)     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0055 }
            r3.append(r2)     // Catch:{ all -> 0x0055 }
        L_0x0066:
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            goto L_0x006a
        L_0x0068:
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            throw r2     // Catch:{ all -> 0x006e }
        L_0x006a:
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            return
        L_0x006c:
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            return
        L_0x006e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p914c.p916b.C13643e.mo25507b():void");
    }

    /* renamed from: e */
    private boolean m27557e() {
        Set<String> set;
        long a = this.f35605t.mo25665a();
        long j = f35587f + a;
        if (this.f35603r && this.f35590b.isEmpty()) {
            set = this.f35590b;
        } else if (this.f35603r) {
            set = new HashSet<>();
        } else {
            set = null;
        }
        try {
            Iterator it = this.f35600o.mo25486d().iterator();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            int i3 = 0;
            long j2 = -1;
            long j3 = 0;
            while (it.hasNext()) {
                C13641a aVar = (C13641a) it.next();
                i3++;
                j3 += aVar.mo25492c();
                if (aVar.mo25491b() > j) {
                    i++;
                    Iterator it2 = it;
                    i2 = (int) (((long) i2) + aVar.mo25492c());
                    j2 = Math.max(aVar.mo25491b() - a, j2);
                    it = it2;
                    z = true;
                } else {
                    Iterator it3 = it;
                    if (this.f35603r) {
                        set.add(aVar.mo25490a());
                    }
                    it = it3;
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder("Future timestamp found in ");
                sb.append(i);
                sb.append(" files , with a total size of ");
                sb.append(i2);
                sb.append(" bytes, and a maximum time delta of ");
                sb.append(j2);
                sb.append("ms");
            }
            long j4 = (long) i3;
            if (!(this.f35604s.mo25519d() == j4 && this.f35604s.mo25518c() == j3)) {
                if (this.f35603r && this.f35590b != set) {
                    this.f35590b.clear();
                    this.f35590b.addAll(set);
                }
                this.f35604s.mo25514a(j3, j4);
            }
            this.f35597l = a;
            return true;
        } catch (IOException e) {
            new StringBuilder("calcFileCacheSize: ").append(e.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public final void mo25508b(C13619c cVar) {
        synchronized (this.f35591c) {
            try {
                List a = C13620d.m27493a(cVar);
                for (int i = 0; i < a.size(); i++) {
                    String str = (String) a.get(i);
                    this.f35600o.mo25481b(str);
                    this.f35590b.remove(str);
                }
            } catch (IOException e) {
                new StringBuilder("delete: ").append(e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public final boolean mo25510c(C13619c cVar) {
        synchronized (this.f35591c) {
            List a = C13620d.m27493a(cVar);
            for (int i = 0; i < a.size(); i++) {
                if (this.f35590b.contains((String) a.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    private Collection<C13641a> m27555a(Collection<C13641a> collection) {
        long a = this.f35605t.mo25665a() + f35587f;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (C13641a aVar : collection) {
            if (aVar.mo25491b() > a) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f35601p.mo25497a());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: d */
    public final boolean mo25512d(C13619c cVar) {
        synchronized (this.f35591c) {
            if (mo25510c(cVar)) {
                return true;
            }
            try {
                List a = C13620d.m27493a(cVar);
                for (int i = 0; i < a.size(); i++) {
                    String str = (String) a.get(i);
                    if (this.f35600o.mo25485c(str, cVar)) {
                        this.f35590b.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    public final C13613a mo25504a(C13619c cVar) {
        C13613a aVar;
        C13652j a = C13652j.m27591a().mo25522a(cVar);
        try {
            synchronized (this.f35591c) {
                List a2 = C13620d.m27493a(cVar);
                String str = null;
                aVar = null;
                for (int i = 0; i < a2.size(); i++) {
                    str = (String) a2.get(i);
                    a.mo25524a(str);
                    aVar = this.f35600o.mo25482b(str, cVar);
                    if (aVar != null) {
                        break;
                    }
                }
                if (aVar == null) {
                    this.f35590b.remove(str);
                } else {
                    this.f35590b.add(str);
                }
            }
            a.mo25526b();
            return aVar;
        } catch (IOException e) {
            try {
                a.mo25523a(e);
                return null;
            } finally {
                a.mo25526b();
            }
        }
    }

    /* renamed from: a */
    private C13642b m27554a(String str, C13619c cVar) throws IOException {
        C13722a aVar;
        StatFs statFs;
        long j;
        long j2;
        long j3;
        synchronized (this.f35591c) {
            boolean d = mo25511d();
            if (this.f35600o.mo25480a()) {
                aVar = C13722a.EXTERNAL;
            } else {
                aVar = C13722a.INTERNAL;
            }
            C13721a aVar2 = this.f35599n;
            long c = this.f35594i - this.f35604s.mo25518c();
            aVar2.mo25640b();
            aVar2.mo25640b();
            aVar2.mo25641c();
            if (aVar == C13722a.INTERNAL) {
                statFs = aVar2.f35704a;
            } else {
                statFs = aVar2.f35705b;
            }
            if (statFs != null) {
                if (VERSION.SDK_INT >= 18) {
                    j2 = statFs.getBlockSizeLong();
                    j3 = statFs.getAvailableBlocksLong();
                } else {
                    j2 = (long) statFs.getBlockSize();
                    j3 = (long) statFs.getAvailableBlocks();
                }
                j = j3 * j2;
            } else {
                j = 0;
            }
            boolean z = true;
            if (j > 0) {
                if (j >= c) {
                    z = false;
                }
            }
            if (z) {
                this.f35595j = this.f35593h;
            } else {
                this.f35595j = this.f35594i;
            }
            long c2 = this.f35604s.mo25518c();
            if (c2 > this.f35595j && !d) {
                this.f35604s.mo25516b();
                mo25511d();
            }
            if (c2 > this.f35595j) {
                m27556a((this.f35595j * 9) / 10, C13618a.CACHE_FULL);
            }
        }
        return this.f35600o.mo25478a(str, cVar);
    }

    /* renamed from: a */
    private void m27556a(long j, C13618a aVar) throws IOException {
        long j2 = j;
        try {
            Collection<C13641a> a = m27555a(this.f35600o.mo25486d());
            long c = this.f35604s.mo25518c();
            long j3 = c - j2;
            int i = 0;
            long j4 = 0;
            for (C13641a aVar2 : a) {
                if (j4 > j3) {
                    break;
                }
                long a2 = this.f35600o.mo25476a(aVar2);
                this.f35590b.remove(aVar2.mo25490a());
                if (a2 > 0) {
                    i++;
                    j4 += a2;
                    C13652j.m27591a().mo25524a(aVar2.mo25490a()).mo25521a(aVar).mo25520a(a2).mo25525b(c - j4).mo25527c(j2).mo25526b();
                } else {
                    C13618a aVar3 = aVar;
                }
            }
            this.f35604s.mo25517b(-j4, (long) (-i));
            this.f35600o.mo25483b();
        } catch (IOException e) {
            new StringBuilder("evictAboveSize: ").append(e.getMessage());
            throw e;
        }
    }

    /* renamed from: a */
    public final C13613a mo25505a(C13619c cVar, C13625i iVar) throws IOException {
        String b;
        C13642b a;
        C13652j a2 = C13652j.m27591a().mo25522a(cVar);
        synchronized (this.f35591c) {
            b = C13620d.m27494b(cVar);
        }
        a2.mo25524a(b);
        try {
            a = m27554a(b, cVar);
            a.mo25495a(iVar, cVar);
            C13613a a3 = m27553a(a, cVar, b);
            a2.mo25520a(a3.mo25467b()).mo25525b(this.f35604s.mo25518c());
            if (!a.mo25496a()) {
                C13697a.m27692c(f35586e, "Failed to delete temp file");
            }
            a2.mo25526b();
            return a3;
        } catch (IOException e) {
            try {
                a2.mo25523a(e);
                C13697a.m27686b(f35586e, "Failed inserting a file into the cache", (Throwable) e);
                throw e;
            } catch (Throwable th) {
                a2.mo25526b();
                throw th;
            }
        } catch (Throwable th2) {
            if (!a.mo25496a()) {
                C13697a.m27692c(f35586e, "Failed to delete temp file");
            }
            throw th2;
        }
    }

    /* renamed from: a */
    private C13613a m27553a(C13642b bVar, C13619c cVar, String str) throws IOException {
        C13613a a;
        synchronized (this.f35591c) {
            a = bVar.mo25494a(cVar);
            this.f35590b.add(str);
            this.f35604s.mo25517b(a.mo25467b(), 1);
        }
        return a;
    }

    public C13643e(C13640d dVar, C13650h hVar, C13646b bVar, C13617b bVar2, C13616a aVar, C13658b bVar3, Context context, Executor executor, boolean z) {
        this.f35593h = bVar.f35611b;
        this.f35594i = bVar.f35612c;
        this.f35595j = bVar.f35612c;
        this.f35599n = C13721a.m27767a();
        this.f35600o = dVar;
        this.f35601p = hVar;
        this.f35597l = -1;
        this.f35596k = bVar2;
        this.f35598m = bVar.f35610a;
        this.f35602q = aVar;
        this.f35604s = new C13645a();
        this.f35605t = C13738c.m27790b();
        this.f35603r = z;
        this.f35590b = new HashSet();
        if (this.f35603r) {
            this.f35589a = new CountDownLatch(1);
            executor.execute(new Runnable() {
                public final void run() {
                    synchronized (C13643e.this.f35591c) {
                        C13643e.this.mo25511d();
                    }
                    C13643e.this.f35592d = true;
                    C13643e.this.f35589a.countDown();
                }
            });
            return;
        }
        this.f35589a = new CountDownLatch(0);
    }
}
