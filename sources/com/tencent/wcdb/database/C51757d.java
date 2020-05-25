package com.tencent.wcdb.database;

import android.os.SystemClock;
import com.tencent.wcdb.support.C51787a;
import com.tencent.wcdb.support.Log;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.tencent.wcdb.database.d */
public final class C51757d implements Closeable {

    /* renamed from: m */
    static final /* synthetic */ boolean f129073m = (!C51757d.class.desiredAssertionStatus());

    /* renamed from: a */
    final WeakReference<SQLiteDatabase> f129074a;

    /* renamed from: b */
    public volatile C51754a f129075b;

    /* renamed from: c */
    public volatile C51774o f129076c;

    /* renamed from: d */
    public volatile C51755b f129077d;

    /* renamed from: e */
    byte[] f129078e;

    /* renamed from: f */
    SQLiteCipherSpec f129079f;

    /* renamed from: g */
    public final Object f129080g = new Object();

    /* renamed from: h */
    final AtomicBoolean f129081h = new AtomicBoolean();

    /* renamed from: i */
    final C51764g f129082i;

    /* renamed from: j */
    boolean f129083j;

    /* renamed from: k */
    C51760b f129084k;

    /* renamed from: l */
    SQLiteConnection f129085l;

    /* renamed from: n */
    private int f129086n;

    /* renamed from: o */
    private int f129087o;

    /* renamed from: p */
    private C51760b f129088p;

    /* renamed from: q */
    private final ArrayList<SQLiteConnection> f129089q = new ArrayList<>();

    /* renamed from: r */
    private final WeakHashMap<SQLiteConnection, C51759a> f129090r = new WeakHashMap<>();

    /* renamed from: com.tencent.wcdb.database.d$a */
    enum C51759a {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    /* renamed from: com.tencent.wcdb.database.d$b */
    static final class C51760b {

        /* renamed from: a */
        public C51760b f129098a;

        /* renamed from: b */
        public Thread f129099b;

        /* renamed from: c */
        public long f129100c;

        /* renamed from: d */
        public int f129101d;

        /* renamed from: e */
        public boolean f129102e;

        /* renamed from: f */
        public String f129103f;

        /* renamed from: g */
        public int f129104g;

        /* renamed from: h */
        public SQLiteConnection f129105h;

        /* renamed from: i */
        public RuntimeException f129106i;

        /* renamed from: j */
        public int f129107j;

        private C51760b() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107211a(com.tencent.wcdb.database.C51764g r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00a3
            java.lang.Object r0 = r6.f129080g
            monitor-enter(r0)
            r6.m110995f()     // Catch:{ all -> 0x00a0 }
            int r1 = r7.f129120d     // Catch:{ all -> 0x00a0 }
            com.tencent.wcdb.database.g r2 = r6.f129082i     // Catch:{ all -> 0x00a0 }
            int r2 = r2.f129120d     // Catch:{ all -> 0x00a0 }
            r1 = r1 ^ r2
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0018
            r1 = 1
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 == 0) goto L_0x002f
            java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteConnection, com.tencent.wcdb.database.d$a> r4 = r6.f129090r     // Catch:{ all -> 0x00a0 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x00a0 }
            if (r4 == 0) goto L_0x0027
            r6.m110992c()     // Catch:{ all -> 0x00a0 }
            goto L_0x002f
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a0 }
            java.lang.String r1 = "Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first."
            r7.<init>(r1)     // Catch:{ all -> 0x00a0 }
            throw r7     // Catch:{ all -> 0x00a0 }
        L_0x002f:
            boolean r4 = r7.f129123g     // Catch:{ all -> 0x00a0 }
            com.tencent.wcdb.database.g r5 = r6.f129082i     // Catch:{ all -> 0x00a0 }
            boolean r5 = r5.f129123g     // Catch:{ all -> 0x00a0 }
            if (r4 == r5) goto L_0x0039
            r4 = 1
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            if (r4 == 0) goto L_0x004d
            java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteConnection, com.tencent.wcdb.database.d$a> r4 = r6.f129090r     // Catch:{ all -> 0x00a0 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x00a0 }
            if (r4 == 0) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a0 }
            java.lang.String r1 = "Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first."
            r7.<init>(r1)     // Catch:{ all -> 0x00a0 }
            throw r7     // Catch:{ all -> 0x00a0 }
        L_0x004d:
            com.tencent.wcdb.database.g r4 = r6.f129082i     // Catch:{ all -> 0x00a0 }
            int r4 = r4.f129120d     // Catch:{ all -> 0x00a0 }
            int r5 = r7.f129120d     // Catch:{ all -> 0x00a0 }
            r4 = r4 ^ r5
            r5 = 268435473(0x10000011, float:2.52436E-29)
            r4 = r4 & r5
            if (r4 != 0) goto L_0x0080
            com.tencent.wcdb.database.g r4 = r6.f129082i     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = r4.f129119c     // Catch:{ all -> 0x00a0 }
            java.lang.String r5 = r7.f129119c     // Catch:{ all -> 0x00a0 }
            if (r4 == r5) goto L_0x006d
            if (r4 == 0) goto L_0x006b
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a0 }
            if (r4 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r4 = 0
            goto L_0x006e
        L_0x006d:
            r4 = 1
        L_0x006e:
            if (r4 != 0) goto L_0x0071
            goto L_0x0080
        L_0x0071:
            com.tencent.wcdb.database.g r1 = r6.f129082i     // Catch:{ all -> 0x00a0 }
            r1.mo107218a(r7)     // Catch:{ all -> 0x00a0 }
            r6.m110990b(r3)     // Catch:{ all -> 0x00a0 }
            r6.m110993d()     // Catch:{ all -> 0x00a0 }
            r6.m110994e()     // Catch:{ all -> 0x00a0 }
            goto L_0x009b
        L_0x0080:
            if (r1 == 0) goto L_0x0085
            r6.m110989b()     // Catch:{ all -> 0x00a0 }
        L_0x0085:
            com.tencent.wcdb.database.SQLiteConnection r1 = r6.mo107207a(r7, r2)     // Catch:{ all -> 0x00a0 }
            r6.m110989b()     // Catch:{ all -> 0x00a0 }
            com.tencent.wcdb.database.d$a r2 = com.tencent.wcdb.database.C51757d.C51759a.DISCARD     // Catch:{ all -> 0x00a0 }
            r6.m110984a(r2)     // Catch:{ all -> 0x00a0 }
            r6.f129085l = r1     // Catch:{ all -> 0x00a0 }
            com.tencent.wcdb.database.g r1 = r6.f129082i     // Catch:{ all -> 0x00a0 }
            r1.mo107218a(r7)     // Catch:{ all -> 0x00a0 }
            r6.m110990b(r3)     // Catch:{ all -> 0x00a0 }
        L_0x009b:
            r6.mo107209a()     // Catch:{ all -> 0x00a0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            return
        L_0x00a0:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            throw r7
        L_0x00a3:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "configuration must not be null."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.C51757d.mo107211a(com.tencent.wcdb.database.g):void");
    }

    /* renamed from: a */
    public final SQLiteConnection mo107208a(String str, int i, C51787a aVar) {
        SystemClock.uptimeMillis();
        SQLiteConnection b = m110988b(str, i, aVar);
        if (this.f129076c != null) {
            SystemClock.uptimeMillis();
            if (((SQLiteDatabase) this.f129074a.get()) != null) {
                C51774o oVar = this.f129076c;
            }
        }
        return b;
    }

    /* renamed from: a */
    public final void mo107210a(SQLiteConnection sQLiteConnection) {
        synchronized (this.f129080g) {
            C51759a aVar = (C51759a) this.f129090r.remove(sQLiteConnection);
            if (aVar == null) {
                throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            } else if (!this.f129083j) {
                m110991b(sQLiteConnection);
            } else if (sQLiteConnection.f129015e) {
                if (m110987a(sQLiteConnection, aVar)) {
                    if (!f129073m) {
                        if (this.f129085l != null) {
                            throw new AssertionError();
                        }
                    }
                    this.f129085l = sQLiteConnection;
                }
                mo107209a();
            } else if (this.f129089q.size() >= this.f129086n - 1) {
                m110991b(sQLiteConnection);
            } else {
                if (m110987a(sQLiteConnection, aVar)) {
                    this.f129089q.add(sQLiteConnection);
                }
                mo107209a();
            }
        }
    }

    /* renamed from: a */
    private boolean m110987a(SQLiteConnection sQLiteConnection, C51759a aVar) {
        if (aVar == C51759a.RECONFIGURE) {
            try {
                sQLiteConnection.mo107152a(this.f129082i);
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder("Failed to reconfigure released connection, closing it: ");
                sb.append(sQLiteConnection);
                Log.m111074a("WCDB.SQLiteConnectionPool", sb.toString(), e);
                aVar = C51759a.DISCARD;
            }
        }
        if (aVar != C51759a.DISCARD) {
            return true;
        }
        m110991b(sQLiteConnection);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo107209a() {
        SQLiteConnection sQLiteConnection;
        C51760b bVar = this.f129084k;
        C51760b bVar2 = null;
        boolean z = false;
        boolean z2 = false;
        while (bVar != null) {
            boolean z3 = true;
            if (this.f129083j) {
                try {
                    if (bVar.f129102e || z) {
                        sQLiteConnection = null;
                    } else {
                        sQLiteConnection = m110982a(bVar.f129103f, bVar.f129104g);
                        if (sQLiteConnection == null) {
                            z = true;
                        }
                    }
                    if (sQLiteConnection == null && !z2) {
                        sQLiteConnection = m110981a(bVar.f129104g);
                        if (sQLiteConnection == null) {
                            z2 = true;
                        }
                    }
                    if (sQLiteConnection != null) {
                        bVar.f129105h = sQLiteConnection;
                    } else if (!z || !z2) {
                        z3 = false;
                    } else {
                        return;
                    }
                } catch (RuntimeException e) {
                    bVar.f129106i = e;
                }
            }
            C51760b bVar3 = bVar.f129098a;
            if (z3) {
                if (bVar2 != null) {
                    bVar2.f129098a = bVar3;
                } else {
                    this.f129084k = bVar3;
                }
                bVar.f129098a = null;
                LockSupport.unpark(bVar.f129099b);
            } else {
                bVar2 = bVar;
            }
            bVar = bVar3;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107213a(String str, int i, long j) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f129074a.get();
        if (this.f129076c != null && sQLiteDatabase != null) {
        }
    }

    public final void close() {
        m110986a(false);
    }

    /* renamed from: b */
    private void m110989b() {
        m110992c();
        if (this.f129085l != null) {
            m110991b(this.f129085l);
            this.f129085l = null;
        }
    }

    /* renamed from: f */
    private void m110995f() {
        if (!this.f129083j) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            m110986a(true);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: c */
    private void m110992c() {
        int size = this.f129089q.size();
        for (int i = 0; i < size; i++) {
            m110991b((SQLiteConnection) this.f129089q.get(i));
        }
        this.f129089q.clear();
    }

    /* renamed from: d */
    private void m110993d() {
        int size = this.f129089q.size();
        while (true) {
            int i = size - 1;
            if (size > this.f129086n - 1) {
                m110991b((SQLiteConnection) this.f129089q.remove(i));
                size = i;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SQLiteConnectionPool: ");
        sb.append(this.f129082i.f129117a);
        return sb.toString();
    }

    /* renamed from: e */
    private void m110994e() {
        if (this.f129085l != null) {
            try {
                this.f129085l.mo107152a(this.f129082i);
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder("Failed to reconfigure available primary connection, closing it: ");
                sb.append(this.f129085l);
                Log.m111074a("WCDB.SQLiteConnectionPool", sb.toString(), e);
                m110991b(this.f129085l);
                this.f129085l = null;
            }
        }
        int size = this.f129089q.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection = (SQLiteConnection) this.f129089q.get(i);
            try {
                sQLiteConnection.mo107152a(this.f129082i);
            } catch (RuntimeException e2) {
                StringBuilder sb2 = new StringBuilder("Failed to reconfigure available non-primary connection, closing it: ");
                sb2.append(sQLiteConnection);
                Log.m111074a("WCDB.SQLiteConnectionPool", sb2.toString(), e2);
                m110991b(sQLiteConnection);
                int i2 = i - 1;
                this.f129089q.remove(i);
                size--;
                i = i2;
            }
            i++;
        }
        m110984a(C51759a.RECONFIGURE);
    }

    /* renamed from: a */
    public final void mo107212a(String str) {
        synchronized (this.f129080g) {
            m110985a(str, 0, 0);
        }
    }

    /* renamed from: b */
    private static void m110991b(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.mo107150a();
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("Failed to close connection, its fate is now in the hands of the merciful GC: ");
            sb.append(sQLiteConnection);
            sb.append(e.getMessage());
            Log.m111073a("WCDB.SQLiteConnectionPool", sb.toString());
        }
    }

    /* renamed from: a */
    private SQLiteConnection m110981a(int i) {
        SQLiteConnection sQLiteConnection = this.f129085l;
        if (sQLiteConnection != null) {
            this.f129085l = null;
            m110983a(sQLiteConnection, i);
            return sQLiteConnection;
        }
        for (SQLiteConnection sQLiteConnection2 : this.f129090r.keySet()) {
            if (sQLiteConnection2.f129015e) {
                return null;
            }
        }
        SQLiteConnection a = mo107207a(this.f129082i, true);
        m110983a(a, i);
        return a;
    }

    /* renamed from: b */
    private void m110990b(int i) {
        if (i <= 0) {
            if ((this.f129082i.f129120d & 536870912) != 0) {
                i = 4;
            } else {
                i = 1;
            }
        }
        this.f129086n = i;
        Log.m111076b("WCDB.SQLiteConnectionPool", "Max connection pool size is %d.", Integer.valueOf(this.f129086n));
    }

    /* renamed from: a */
    private void m110984a(C51759a aVar) {
        if (!this.f129090r.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f129090r.size());
            for (Entry entry : this.f129090r.entrySet()) {
                C51759a aVar2 = (C51759a) entry.getValue();
                if (!(aVar == aVar2 || aVar2 == C51759a.DISCARD)) {
                    arrayList.add(entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f129090r.put(arrayList.get(i), aVar);
            }
        }
    }

    /* renamed from: a */
    private void m110986a(boolean z) {
        if (!z) {
            synchronized (this.f129080g) {
                m110995f();
                this.f129083j = false;
                m110989b();
                int size = this.f129090r.size();
                if (size != 0) {
                    StringBuilder sb = new StringBuilder("The connection pool for ");
                    sb.append(this.f129082i.f129118b);
                    sb.append(" has been closed but there are still ");
                    sb.append(size);
                    sb.append(" connections in use.  They will be closed as they are released back to the pool.");
                    Log.m111077c("WCDB.SQLiteConnectionPool", sb.toString());
                }
                mo107209a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public SQLiteConnection mo107207a(C51764g gVar, boolean z) {
        int i = this.f129087o;
        this.f129087o = i + 1;
        return SQLiteConnection.m110894a(this, gVar, i, z, this.f129078e, this.f129079f);
    }

    /* renamed from: a */
    private SQLiteConnection m110982a(String str, int i) {
        int size = this.f129089q.size();
        if (size > 1 && str != null) {
            for (int i2 = 0; i2 < size; i2++) {
                SQLiteConnection sQLiteConnection = (SQLiteConnection) this.f129089q.get(i2);
                if (sQLiteConnection.mo107161b(str)) {
                    this.f129089q.remove(i2);
                    m110983a(sQLiteConnection, i);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection sQLiteConnection2 = (SQLiteConnection) this.f129089q.remove(size - 1);
            m110983a(sQLiteConnection2, i);
            return sQLiteConnection2;
        }
        int size2 = this.f129090r.size();
        if (this.f129085l != null) {
            size2++;
        }
        if (size2 >= this.f129086n) {
            return null;
        }
        SQLiteConnection a = mo107207a(this.f129082i, false);
        m110983a(a, i);
        return a;
    }

    /* renamed from: a */
    private void m110983a(SQLiteConnection sQLiteConnection, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            sQLiteConnection.f129018h = z;
            this.f129090r.put(sQLiteConnection, C51759a.NORMAL);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("Failed to prepare acquired connection for session, closing it: ");
            sb.append(sQLiteConnection);
            sb.append(", connectionFlags=");
            sb.append(i);
            Log.m111073a("WCDB.SQLiteConnectionPool", sb.toString());
            m110991b(sQLiteConnection);
            throw e;
        }
    }

    C51757d(SQLiteDatabase sQLiteDatabase, C51764g gVar, int i) {
        this.f129074a = new WeakReference<>(sQLiteDatabase);
        this.f129082i = new C51764g(gVar);
        m110990b(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0078, code lost:
        if (r3 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007a, code lost:
        r3.mo107263a(new com.tencent.wcdb.database.C51757d.C517581(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r14 = r13.f129100c + 3000;
        r9 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008f, code lost:
        if (r1.f129081h.compareAndSet(true, false) == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0091, code lost:
        r4 = r1.f129080g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0093, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        mo107209a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0097, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009c, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r9 * 1000000);
        java.lang.Thread.interrupted();
        r4 = r1.f129080g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a9, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        m110995f();
        r7 = r13.f129105h;
        r9 = r13.f129106i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b1, code lost:
        if (r7 != null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b3, code lost:
        if (r9 == null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b6, code lost:
        r9 = android.os.SystemClock.uptimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00bc, code lost:
        if (r9 >= r14) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00be, code lost:
        r9 = r9 - r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c0, code lost:
        m110985a(r0, r9 - r13.f129100c, r2);
        r14 = r9 + 3000;
        r9 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cc, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ce, code lost:
        r13.f129098a = r1.f129088p;
        r13.f129099b = null;
        r13.f129103f = null;
        r13.f129105h = null;
        r13.f129106i = null;
        r13.f129107j++;
        r1.f129088p = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e1, code lost:
        if (r7 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e3, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e4, code lost:
        if (r3 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e6, code lost:
        r3.mo107263a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e9, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00ee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ef, code lost:
        if (r3 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00f1, code lost:
        r3.mo107263a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00f4, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.wcdb.database.SQLiteConnection m110988b(java.lang.String r20, int r21, com.tencent.wcdb.support.C51787a r22) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            r3 = r22
            r4 = r2 & 2
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0010
            r4 = 1
            goto L_0x0011
        L_0x0010:
            r4 = 0
        L_0x0011:
            java.lang.Object r7 = r1.f129080g
            monitor-enter(r7)
            r19.m110995f()     // Catch:{ all -> 0x00f5 }
            if (r3 == 0) goto L_0x001c
            r22.mo107262a()     // Catch:{ all -> 0x00f5 }
        L_0x001c:
            r8 = 0
            if (r4 != 0) goto L_0x0024
            com.tencent.wcdb.database.SQLiteConnection r9 = r19.m110982a(r20, r21)     // Catch:{ all -> 0x00f5 }
            goto L_0x0025
        L_0x0024:
            r9 = r8
        L_0x0025:
            if (r9 != 0) goto L_0x002b
            com.tencent.wcdb.database.SQLiteConnection r9 = r1.m110981a(r2)     // Catch:{ all -> 0x00f5 }
        L_0x002b:
            if (r9 == 0) goto L_0x002f
            monitor-exit(r7)     // Catch:{ all -> 0x00f5 }
            return r9
        L_0x002f:
            r9 = r2 & 4
            if (r9 == 0) goto L_0x0035
            r9 = 1
            goto L_0x0036
        L_0x0035:
            r9 = 0
        L_0x0036:
            long r10 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00f5 }
            java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00f5 }
            com.tencent.wcdb.database.d$b r13 = r1.f129088p     // Catch:{ all -> 0x00f5 }
            if (r13 == 0) goto L_0x0049
            com.tencent.wcdb.database.d$b r14 = r13.f129098a     // Catch:{ all -> 0x00f5 }
            r1.f129088p = r14     // Catch:{ all -> 0x00f5 }
            r13.f129098a = r8     // Catch:{ all -> 0x00f5 }
            goto L_0x004e
        L_0x0049:
            com.tencent.wcdb.database.d$b r13 = new com.tencent.wcdb.database.d$b     // Catch:{ all -> 0x00f5 }
            r13.<init>()     // Catch:{ all -> 0x00f5 }
        L_0x004e:
            r13.f129099b = r12     // Catch:{ all -> 0x00f5 }
            r13.f129100c = r10     // Catch:{ all -> 0x00f5 }
            r13.f129101d = r9     // Catch:{ all -> 0x00f5 }
            r13.f129102e = r4     // Catch:{ all -> 0x00f5 }
            r13.f129103f = r0     // Catch:{ all -> 0x00f5 }
            r13.f129104g = r2     // Catch:{ all -> 0x00f5 }
            com.tencent.wcdb.database.d$b r4 = r1.f129084k     // Catch:{ all -> 0x00f5 }
            r10 = r8
        L_0x005d:
            if (r4 == 0) goto L_0x006e
            int r11 = r4.f129101d     // Catch:{ all -> 0x00f5 }
            if (r9 <= r11) goto L_0x0066
            r13.f129098a = r4     // Catch:{ all -> 0x00f5 }
            goto L_0x006e
        L_0x0066:
            com.tencent.wcdb.database.d$b r10 = r4.f129098a     // Catch:{ all -> 0x00f5 }
            r18 = r10
            r10 = r4
            r4 = r18
            goto L_0x005d
        L_0x006e:
            if (r10 == 0) goto L_0x0073
            r10.f129098a = r13     // Catch:{ all -> 0x00f5 }
            goto L_0x0075
        L_0x0073:
            r1.f129084k = r13     // Catch:{ all -> 0x00f5 }
        L_0x0075:
            int r4 = r13.f129107j     // Catch:{ all -> 0x00f5 }
            monitor-exit(r7)     // Catch:{ all -> 0x00f5 }
            if (r3 == 0) goto L_0x0082
            com.tencent.wcdb.database.d$1 r7 = new com.tencent.wcdb.database.d$1
            r7.<init>(r13, r4)
            r3.mo107263a(r7)
        L_0x0082:
            long r9 = r13.f129100c     // Catch:{ all -> 0x00ee }
            r11 = 3000(0xbb8, double:1.482E-320)
            long r9 = r9 + r11
            r14 = r9
            r9 = r11
        L_0x0089:
            java.util.concurrent.atomic.AtomicBoolean r4 = r1.f129081h     // Catch:{ all -> 0x00ee }
            boolean r4 = r4.compareAndSet(r6, r5)     // Catch:{ all -> 0x00ee }
            if (r4 == 0) goto L_0x009c
            java.lang.Object r4 = r1.f129080g     // Catch:{ all -> 0x00ee }
            monitor-enter(r4)     // Catch:{ all -> 0x00ee }
            r19.mo107209a()     // Catch:{ all -> 0x0099 }
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            goto L_0x009c
        L_0x0099:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            throw r0     // Catch:{ all -> 0x00ee }
        L_0x009c:
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 * r16
            java.util.concurrent.locks.LockSupport.parkNanos(r9)     // Catch:{ all -> 0x00ee }
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x00ee }
            java.lang.Object r4 = r1.f129080g     // Catch:{ all -> 0x00ee }
            monitor-enter(r4)     // Catch:{ all -> 0x00ee }
            r19.m110995f()     // Catch:{ all -> 0x00eb }
            com.tencent.wcdb.database.SQLiteConnection r7 = r13.f129105h     // Catch:{ all -> 0x00eb }
            java.lang.RuntimeException r9 = r13.f129106i     // Catch:{ all -> 0x00eb }
            if (r7 != 0) goto L_0x00ce
            if (r9 == 0) goto L_0x00b6
            goto L_0x00ce
        L_0x00b6:
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00eb }
            int r7 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r7 >= 0) goto L_0x00c0
            long r9 = r9 - r14
            goto L_0x00cc
        L_0x00c0:
            long r14 = r13.f129100c     // Catch:{ all -> 0x00eb }
            r7 = 0
            long r14 = r9 - r14
            r1.m110985a(r0, r14, r2)     // Catch:{ all -> 0x00eb }
            r7 = 0
            long r9 = r9 + r11
            r14 = r9
            r9 = r11
        L_0x00cc:
            monitor-exit(r4)     // Catch:{ all -> 0x00eb }
            goto L_0x0089
        L_0x00ce:
            com.tencent.wcdb.database.d$b r0 = r1.f129088p     // Catch:{ all -> 0x00eb }
            r13.f129098a = r0     // Catch:{ all -> 0x00eb }
            r13.f129099b = r8     // Catch:{ all -> 0x00eb }
            r13.f129103f = r8     // Catch:{ all -> 0x00eb }
            r13.f129105h = r8     // Catch:{ all -> 0x00eb }
            r13.f129106i = r8     // Catch:{ all -> 0x00eb }
            int r0 = r13.f129107j     // Catch:{ all -> 0x00eb }
            int r0 = r0 + r6
            r13.f129107j = r0     // Catch:{ all -> 0x00eb }
            r1.f129088p = r13     // Catch:{ all -> 0x00eb }
            if (r7 == 0) goto L_0x00ea
            monitor-exit(r4)     // Catch:{ all -> 0x00eb }
            if (r3 == 0) goto L_0x00e9
            r3.mo107263a(r8)
        L_0x00e9:
            return r7
        L_0x00ea:
            throw r9     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00ee }
        L_0x00ee:
            r0 = move-exception
            if (r3 == 0) goto L_0x00f4
            r3.mo107263a(r8)
        L_0x00f4:
            throw r0
        L_0x00f5:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00f5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.C51757d.m110988b(java.lang.String, int, com.tencent.wcdb.support.a):com.tencent.wcdb.database.SQLiteConnection");
    }

    /* renamed from: a */
    private void m110985a(String str, long j, int i) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (j != 0) {
            Thread currentThread = Thread.currentThread();
            sb.append("The connection pool for database '");
            sb.append(this.f129082i.f129118b);
            sb.append("' has been unable to grant a connection to thread ");
            sb.append(currentThread.getId());
            sb.append(" (");
            sb.append(currentThread.getName());
            sb.append(") ");
            sb.append("with flags 0x");
            sb.append(Integer.toHexString(i));
            sb.append(" for ");
            sb.append(((float) j) * 0.001f);
            sb.append(" seconds.\n");
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (!this.f129090r.isEmpty()) {
            i2 = 0;
            for (SQLiteConnection c : this.f129090r.keySet()) {
                String c2 = c.mo107162c();
                if (c2 != null) {
                    arrayList.add(c2);
                    i3++;
                } else {
                    i2++;
                }
            }
        } else {
            i2 = 0;
        }
        int size = this.f129089q.size();
        if (this.f129085l != null) {
            size++;
        }
        sb.append("Connections: ");
        sb.append(i3);
        sb.append(" active, ");
        sb.append(i2);
        sb.append(" idle, ");
        sb.append(size);
        sb.append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb.append("\nRequests in progress:\n");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                sb.append("  ");
                sb.append(str2);
                sb.append("\n");
            }
        }
        Log.m111075b("WCDB.SQLiteConnectionPool", sb.toString());
        if (((SQLiteDatabase) this.f129074a.get()) != null && this.f129076c != null) {
            C51774o oVar = this.f129076c;
        }
    }
}
