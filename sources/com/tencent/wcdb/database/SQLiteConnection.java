package com.tencent.wcdb.database;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.tencent.wcdb.C51779i;
import com.tencent.wcdb.database.SQLiteDebug.IOTraceStats;
import com.tencent.wcdb.support.C51787a;
import com.tencent.wcdb.support.C51787a.C51788a;
import com.tencent.wcdb.support.C51789b;
import com.tencent.wcdb.support.Log;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class SQLiteConnection implements C51788a {

    /* renamed from: a */
    public static final byte[] f129010a = new byte[0];

    /* renamed from: b */
    static final Pattern f129011b = Pattern.compile("[\\s]*\\n+[\\s]*");

    /* renamed from: i */
    private static final String[] f129012i = new String[0];

    /* renamed from: c */
    public final C51757d f129013c;

    /* renamed from: d */
    public final int f129014d;

    /* renamed from: e */
    public final boolean f129015e;

    /* renamed from: f */
    public final C51749b f129016f = new C51749b();

    /* renamed from: g */
    public int f129017g;

    /* renamed from: h */
    public boolean f129018h;

    /* renamed from: j */
    private final C51764g f129019j;

    /* renamed from: k */
    private final boolean f129020k;

    /* renamed from: l */
    private final C51751d f129021l;

    /* renamed from: m */
    private C51750c f129022m;

    /* renamed from: n */
    private Thread f129023n;

    /* renamed from: o */
    private long f129024o;

    /* renamed from: p */
    private int f129025p;

    /* renamed from: q */
    private byte[] f129026q;

    /* renamed from: r */
    private SQLiteCipherSpec f129027r;

    /* renamed from: s */
    private C51748a f129028s;

    /* renamed from: t */
    private int f129029t;

    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$a */
    static final class C51748a {

        /* renamed from: k */
        private static final SimpleDateFormat f129030k = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        /* renamed from: a */
        public long f129031a;

        /* renamed from: b */
        public long f129032b;

        /* renamed from: c */
        public String f129033c;

        /* renamed from: d */
        public String f129034d;

        /* renamed from: e */
        public ArrayList<Object> f129035e;

        /* renamed from: f */
        public boolean f129036f;

        /* renamed from: g */
        public Exception f129037g;

        /* renamed from: h */
        public int f129038h;

        /* renamed from: i */
        public int f129039i;

        /* renamed from: j */
        public int f129040j;

        private C51748a() {
        }

        /* renamed from: a */
        public final void mo107168a(StringBuilder sb, boolean z) {
            String str;
            sb.append(this.f129033c);
            if (this.f129036f) {
                sb.append(" took ");
                sb.append(this.f129032b - this.f129031a);
                sb.append("ms");
            } else {
                sb.append(" started ");
                sb.append(System.currentTimeMillis() - this.f129031a);
                sb.append("ms ago");
            }
            sb.append(" - ");
            if (!this.f129036f) {
                str = "running";
            } else if (this.f129037g != null) {
                str = "failed";
            } else {
                str = "succeeded";
            }
            sb.append(str);
            if (this.f129034d != null) {
                sb.append(", sql=\"");
                sb.append(SQLiteConnection.f129011b.matcher(this.f129034d).replaceAll(" "));
                sb.append("\"");
            }
            if (this.f129040j > 0) {
                sb.append(", tid=");
                sb.append(this.f129040j);
            }
            if (this.f129037g != null && this.f129037g.getMessage() != null) {
                sb.append(", exception=\"");
                sb.append(this.f129037g.getMessage());
                sb.append("\"");
            }
        }
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$b */
    final class C51749b {

        /* renamed from: b */
        private final C51748a[] f129042b;

        /* renamed from: c */
        private int f129043c;

        /* renamed from: d */
        private int f129044d;

        /* renamed from: a */
        public final String mo107170a() {
            synchronized (this.f129042b) {
                C51748a aVar = this.f129042b[this.f129043c];
                if (aVar == null || aVar.f129036f) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                aVar.mo107168a(sb, false);
                String sb2 = sb.toString();
                return sb2;
            }
        }

        private C51749b() {
            this.f129042b = new C51748a[20];
        }

        /* renamed from: c */
        private C51748a m110930c(int i) {
            C51748a aVar = this.f129042b[i & NormalGiftView.ALPHA_255];
            if (aVar.f129038h == i) {
                return aVar;
            }
            return null;
        }

        /* renamed from: a */
        private static boolean m110929a(C51748a aVar) {
            if (aVar == null) {
                return false;
            }
            aVar.f129032b = System.currentTimeMillis();
            aVar.f129036f = true;
            if (aVar.f129037g == null || aVar.f129037g.getMessage() == null) {
                return SQLiteDebug.m110976a(aVar.f129032b - aVar.f129031a);
            }
            return true;
        }

        /* JADX INFO: used method not loaded: com.tencent.wcdb.database.d.a(java.lang.String, int, long):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            if ("prepare".equals(r3) != false) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            r9.f129041a.f129013c.mo107213a(r2, r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return r1;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo107174b(int r10) {
            /*
                r9 = this;
                com.tencent.wcdb.database.SQLiteConnection$a[] r0 = r9.f129042b
                monitor-enter(r0)
                com.tencent.wcdb.database.SQLiteConnection$a r10 = r9.m110930c(r10)     // Catch:{ all -> 0x002d }
                if (r10 != 0) goto L_0x000c
                r10 = 0
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return r10
            L_0x000c:
                boolean r1 = m110929a(r10)     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r10.f129034d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r10.f129033c     // Catch:{ all -> 0x002d }
                int r4 = r10.f129039i     // Catch:{ all -> 0x002d }
                long r5 = r10.f129032b     // Catch:{ all -> 0x002d }
                long r7 = r10.f129031a     // Catch:{ all -> 0x002d }
                r10 = 0
                long r5 = r5 - r7
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                java.lang.String r10 = "prepare"
                boolean r10 = r10.equals(r3)
                if (r10 != 0) goto L_0x002c
                com.tencent.wcdb.database.SQLiteConnection r10 = com.tencent.wcdb.database.SQLiteConnection.this
                com.tencent.wcdb.database.d r10 = r10.f129013c
                r10.mo107213a(r2, r4, r5)
            L_0x002c:
                return r1
            L_0x002d:
                r10 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.C51749b.mo107174b(int):boolean");
        }

        /* renamed from: a */
        public final void mo107171a(int i) {
            String str;
            String str2;
            int i2;
            long j;
            synchronized (this.f129042b) {
                C51748a c = m110930c(i);
                if (m110929a(c)) {
                    m110928a(c, (String) null);
                }
                str = c.f129034d;
                str2 = c.f129033c;
                i2 = c.f129039i;
                j = c.f129032b - c.f129031a;
            }
            if (!"prepare".equals(str2)) {
                SQLiteConnection.this.f129013c.mo107213a(str, i2, j);
            }
        }

        /* renamed from: a */
        public final void mo107172a(int i, Exception exc) {
            synchronized (this.f129042b) {
            }
        }

        /* renamed from: a */
        private static void m110928a(C51748a aVar, String str) {
            StringBuilder sb = new StringBuilder();
            aVar.mo107168a(sb, false);
            if (str != null) {
                sb.append(", ");
                sb.append(str);
            }
            Log.m111077c("WCDB.SQLiteConnection", sb.toString());
        }

        /* renamed from: a */
        public final void mo107173a(int i, String str) {
            synchronized (this.f129042b) {
                C51748a c = m110930c(i);
                if (c != null) {
                    m110928a(c, str);
                }
            }
        }

        /* renamed from: a */
        public final C51748a mo107169a(String str, String str2, Object[] objArr) {
            C51748a aVar;
            synchronized (this.f129042b) {
                int i = (this.f129043c + 1) % 20;
                aVar = this.f129042b[i];
                if (aVar == null) {
                    aVar = new C51748a();
                    this.f129042b[i] = aVar;
                } else {
                    aVar.f129036f = false;
                    aVar.f129037g = null;
                    if (aVar.f129035e != null) {
                        aVar.f129035e.clear();
                    }
                }
                aVar.f129031a = System.currentTimeMillis();
                aVar.f129033c = str;
                aVar.f129034d = str2;
                if (objArr != null) {
                    if (aVar.f129035e == null) {
                        aVar.f129035e = new ArrayList<>();
                    } else {
                        aVar.f129035e.clear();
                    }
                    for (Object obj : objArr) {
                        if (obj == null || !(obj instanceof byte[])) {
                            aVar.f129035e.add(obj);
                        } else {
                            aVar.f129035e.add(SQLiteConnection.f129010a);
                        }
                    }
                }
                int i2 = this.f129044d;
                this.f129044d = i2 + 1;
                aVar.f129038h = (i2 << 8) | i;
                aVar.f129040j = SQLiteConnection.this.f129017g;
                this.f129043c = i;
            }
            return aVar;
        }
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$c */
    static final class C51750c {

        /* renamed from: a */
        WeakReference<SQLiteConnection> f129045a;

        /* renamed from: b */
        public C51750c f129046b;

        /* renamed from: c */
        public String f129047c;

        /* renamed from: d */
        public long f129048d;

        /* renamed from: e */
        public int f129049e;

        /* renamed from: f */
        public int f129050f;

        /* renamed from: g */
        public boolean f129051g;

        /* renamed from: h */
        public boolean f129052h;

        /* renamed from: i */
        public boolean f129053i;

        /* renamed from: j */
        C51748a f129054j;

        C51750c(SQLiteConnection sQLiteConnection) {
            this.f129045a = new WeakReference<>(sQLiteConnection);
        }
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$d */
    final class C51751d extends C51789b<String, C51750c> {
        public C51751d(int i) {
            super(i);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo107175a(boolean z, Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            C51750c cVar = (C51750c) obj2;
            C51750c cVar2 = (C51750c) obj3;
            cVar.f129052h = false;
            if (!cVar.f129053i) {
                SQLiteConnection.this.mo107160b(cVar);
            }
        }
    }

    private static native void nativeBindBlob(long j, long j2, int i, byte[] bArr);

    private static native void nativeBindDouble(long j, long j2, int i, double d);

    private static native void nativeBindLong(long j, long j2, int i, long j3);

    private static native void nativeBindNull(long j, long j2, int i);

    private static native void nativeBindString(long j, long j2, int i, String str);

    private static native void nativeCancel(long j);

    private static native void nativeClose(long j);

    private static native void nativeExecute(long j, long j2);

    private static native int nativeExecuteForChangedRowCount(long j, long j2);

    private static native long nativeExecuteForCursorWindow(long j, long j2, long j3, int i, int i2, boolean z);

    private static native long nativeExecuteForLastInsertedRowId(long j, long j2);

    private static native long nativeExecuteForLong(long j, long j2);

    private static native String nativeExecuteForString(long j, long j2);

    private static native void nativeFinalizeStatement(long j, long j2);

    private static native int nativeGetColumnCount(long j, long j2);

    private static native String nativeGetColumnName(long j, long j2, int i);

    private static native int nativeGetDbLookaside(long j);

    private static native int nativeGetParameterCount(long j, long j2);

    private static native boolean nativeIsReadOnly(long j, long j2);

    private native long nativeOpen(String str, int i, String str2);

    private static native long nativePrepareStatement(long j, String str);

    private static native void nativeRegisterCustomFunction(long j, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j, String str);

    private static native void nativeResetCancel(long j, boolean z);

    private static native void nativeResetStatement(long j, long j2, boolean z);

    private static native long nativeSQLiteHandle(long j, boolean z);

    private static native void nativeSetKey(long j, byte[] bArr);

    private static native void nativeSetUpdateNotification(long j, boolean z, boolean z2);

    private static native void nativeSetWalHook(long j);

    private static native long nativeWalCheckpoint(long j, String str);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107154a(Exception exc) {
        int i = this.f129029t - 1;
        this.f129029t = i;
        if (i == 0 && this.f129028s != null) {
            nativeSQLiteHandle(this.f129024o, false);
            if (exc == null) {
                this.f129016f.mo107174b(this.f129028s.f129038h);
            } else {
                this.f129016f.mo107172a(this.f129028s.f129038h, exc);
            }
            this.f129028s = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107157a(Thread thread, int i) {
        this.f129023n = thread;
        this.f129017g = i;
    }

    /* renamed from: a */
    public final void mo107155a(String str, C51773n nVar) {
        C51750c d;
        if (str != null) {
            C51748a a = this.f129016f.mo107169a("prepare", str, null);
            int i = a.f129038h;
            try {
                d = m110901d(str);
                a.f129039i = d.f129050f;
                if (nVar != null) {
                    nVar.f129170a = d.f129049e;
                    nVar.f129172c = d.f129051g;
                    int nativeGetColumnCount = nativeGetColumnCount(this.f129024o, d.f129048d);
                    if (nativeGetColumnCount == 0) {
                        nVar.f129171b = f129012i;
                    } else {
                        nVar.f129171b = new String[nativeGetColumnCount];
                        for (int i2 = 0; i2 < nativeGetColumnCount; i2++) {
                            nVar.f129171b[i2] = nativeGetColumnName(this.f129024o, d.f129048d, i2);
                        }
                    }
                }
                mo107151a(d);
                this.f129016f.mo107171a(i);
            } catch (RuntimeException e) {
                try {
                    if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && this.f129013c != null) {
                        this.f129013c.mo107212a(str);
                    }
                    this.f129016f.mo107172a(i, (Exception) e);
                    throw e;
                } catch (Throwable th) {
                    this.f129016f.mo107171a(i);
                    throw th;
                }
            } catch (Throwable th2) {
                mo107151a(d);
                throw th2;
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    /* renamed from: a */
    public final void mo107156a(String str, Object[] objArr, C51787a aVar) {
        if (str != null) {
            C51748a a = this.f129016f.mo107169a("execute", str, objArr);
            int i = a.f129038h;
            try {
                C51750c d = m110901d(str);
                a.f129039i = d.f129050f;
                try {
                    m110899c(d);
                    m110896a(d, objArr);
                    m110898b(aVar);
                    nativeExecute(this.f129024o, d.f129048d);
                    mo107153a(aVar);
                    mo107151a(d);
                    this.f129016f.mo107171a(i);
                } catch (Throwable th) {
                    mo107151a(d);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && this.f129013c != null) {
                        this.f129013c.mo107212a(str);
                    }
                    this.f129016f.mo107172a(i, (Exception) e);
                    throw e;
                } catch (Throwable th2) {
                    this.f129016f.mo107171a(i);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    /* renamed from: a */
    public final void mo107153a(C51787a aVar) {
        if (aVar != null) {
            this.f129025p--;
            if (this.f129025p == 0) {
                aVar.mo107263a(null);
                nativeResetCancel(this.f129024o, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107150a() {
        m110897a(false);
    }

    /* renamed from: b */
    public final void mo107159b() {
        nativeCancel(this.f129024o);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo107162c() {
        return this.f129016f.mo107170a();
    }

    /* renamed from: i */
    private void m110908i() {
        nativeSetUpdateNotification(this.f129024o, this.f129019j.f129126j, this.f129019j.f129127k);
    }

    /* renamed from: f */
    private void m110905f() {
        String str;
        if (!this.f129019j.mo107219a() && !this.f129020k) {
            if ((this.f129019j.f129120d & 536870912) != 0) {
                str = "WAL";
            } else {
                str = "PERSIST";
            }
            m110900c(str);
        }
    }

    /* renamed from: g */
    private void m110906g() {
        int i = this.f129019j.f129125i;
        StringBuilder sb = new StringBuilder("PRAGMA synchronous=");
        sb.append(i);
        mo107156a(sb.toString(), null, null);
    }

    /* renamed from: d */
    private void m110902d() {
        if (!this.f129019j.mo107219a() && !this.f129020k) {
            if (this.f129019j.f129124h) {
                nativeSetWalHook(this.f129024o);
            } else if (mo107158b("PRAGMA wal_autocheckpoint", null, null) != 100) {
                mo107158b("PRAGMA wal_autocheckpoint=100", null, null);
            }
        }
    }

    /* renamed from: e */
    private void m110904e() {
        long j;
        if (!this.f129020k) {
            if (this.f129019j.f129123g) {
                j = 1;
            } else {
                j = 0;
            }
            if (mo107158b("PRAGMA foreign_keys", null, null) != j) {
                StringBuilder sb = new StringBuilder("PRAGMA foreign_keys=");
                sb.append(j);
                mo107156a(sb.toString(), null, null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (!(this.f129013c == null || this.f129024o == 0)) {
                C51757d dVar = this.f129013c;
                StringBuilder sb = new StringBuilder("A SQLiteConnection object for database '");
                sb.append(dVar.f129082i.f129118b);
                sb.append("' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
                Log.m111075b("WCDB.SQLiteConnectionPool", sb.toString());
                dVar.f129081h.set(true);
            }
            m110897a(true);
        } finally {
            super.finalize();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SQLiteConnection: ");
        sb.append(this.f129019j.f129117a);
        sb.append(" (");
        sb.append(this.f129014d);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: h */
    private void m110907h() {
        this.f129019j.f129120d |= 16;
        if ((this.f129019j.f129120d & 16) == 0) {
            String locale = this.f129019j.f129122f.toString();
            nativeRegisterLocalizedCollators(this.f129024o, locale);
            if (!this.f129020k) {
                try {
                    mo107156a("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
                    String c = mo107163c("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null, null);
                    if (c == null || !c.equals(locale)) {
                        mo107156a("BEGIN", null, null);
                        mo107156a("DELETE FROM android_metadata", null, null);
                        mo107156a("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{locale}, null);
                        mo107156a("REINDEX LOCALIZED", null, null);
                        mo107156a("COMMIT", null, null);
                    }
                } catch (RuntimeException e) {
                    StringBuilder sb = new StringBuilder("Failed to change locale for db '");
                    sb.append(this.f129019j.f129118b);
                    sb.append("' to '");
                    sb.append(locale);
                    sb.append("'.");
                    throw new SQLiteException(sb.toString(), e);
                } catch (Throwable th) {
                    mo107156a("ROLLBACK", null, null);
                    throw th;
                }
            }
        }
    }

    /* renamed from: d */
    private void m110903d(C51750c cVar) {
        cVar.f129047c = null;
        cVar.f129046b = this.f129022m;
        this.f129022m = cVar;
    }

    /* renamed from: b */
    public final void mo107160b(C51750c cVar) {
        nativeFinalizeStatement(this.f129024o, cVar.f129048d);
        m110903d(cVar);
    }

    /* renamed from: b */
    private void m110898b(C51787a aVar) {
        if (aVar != null) {
            aVar.mo107262a();
            this.f129025p++;
            if (this.f129025p == 1) {
                nativeResetCancel(this.f129024o, true);
                aVar.mo107263a(this);
            }
        }
    }

    /* renamed from: c */
    private void m110899c(C51750c cVar) {
        if (this.f129018h && !cVar.f129051g) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107151a(C51750c cVar) {
        cVar.f129053i = false;
        if (cVar.f129052h) {
            try {
                m110895a(cVar, true);
            } catch (SQLiteException unused) {
                this.f129021l.mo107268b(cVar.f129047c);
            }
        } else {
            mo107160b(cVar);
        }
    }

    /* renamed from: a */
    private void m110897a(boolean z) {
        if (this.f129024o != 0) {
            int i = this.f129016f.mo107169a("close", null, null).f129038h;
            try {
                this.f129021l.mo107266a();
                nativeClose(this.f129024o);
                this.f129024o = 0;
            } finally {
                this.f129016f.mo107171a(i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo107161b(String str) {
        if (this.f129021l.mo107264a(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m110900c(String str) {
        String c = mo107163c("PRAGMA journal_mode", null, null);
        if (!c.equalsIgnoreCase(str)) {
            try {
                StringBuilder sb = new StringBuilder("PRAGMA journal_mode=");
                sb.append(str);
                if (mo107163c(sb.toString(), null, null).equalsIgnoreCase(str)) {
                    return;
                }
            } catch (SQLiteDatabaseLockedException unused) {
            }
            StringBuilder sb2 = new StringBuilder("Could not change the database journal mode of '");
            sb2.append(this.f129019j.f129118b);
            sb2.append("' from '");
            sb2.append(c);
            sb2.append("' to '");
            sb2.append(str);
            sb2.append("' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
            Log.m111075b("WCDB.SQLiteConnection", sb2.toString());
        }
    }

    /* renamed from: d */
    private C51750c m110901d(String str) {
        boolean z;
        C51750c cVar = (C51750c) this.f129021l.mo107264a(str);
        boolean z2 = false;
        if (cVar == null) {
            z = false;
        } else if (!cVar.f129053i) {
            cVar.f129053i = true;
            return cVar;
        } else {
            z = true;
        }
        long nativePrepareStatement = nativePrepareStatement(this.f129024o, str);
        try {
            int nativeGetParameterCount = nativeGetParameterCount(this.f129024o, nativePrepareStatement);
            int b = C51779i.m111062b(str);
            boolean nativeIsReadOnly = nativeIsReadOnly(this.f129024o, nativePrepareStatement);
            C51750c cVar2 = this.f129022m;
            if (cVar2 != null) {
                this.f129022m = cVar2.f129046b;
                cVar2.f129046b = null;
                cVar2.f129052h = false;
            } else {
                cVar2 = new C51750c(this);
            }
            cVar2.f129047c = str;
            cVar2.f129048d = nativePrepareStatement;
            cVar2.f129049e = nativeGetParameterCount;
            cVar2.f129050f = b;
            cVar2.f129051g = nativeIsReadOnly;
            if (!z) {
                if (b == 2 || b == 1) {
                    z2 = true;
                }
                if (z2) {
                    try {
                        this.f129021l.mo107265a(str, cVar2);
                        cVar2.f129052h = true;
                    } catch (RuntimeException e) {
                        e = e;
                        cVar = cVar2;
                    }
                }
            }
            cVar2.f129053i = true;
            return cVar2;
        } catch (RuntimeException e2) {
            e = e2;
            if (cVar == null || !cVar.f129052h) {
                nativeFinalizeStatement(this.f129024o, nativePrepareStatement);
            }
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo107149a(String str) {
        if (this.f129024o == 0) {
            return 0;
        }
        if (str != null && this.f129028s == null) {
            this.f129028s = this.f129016f.mo107169a(str, null, null);
            this.f129028s.f129039i = 99;
        }
        this.f129029t++;
        return nativeSQLiteHandle(this.f129024o, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107152a(C51764g gVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        this.f129018h = false;
        int size = gVar.f129128l.size();
        for (int i = 0; i < size; i++) {
            SQLiteCustomFunction sQLiteCustomFunction = (SQLiteCustomFunction) gVar.f129128l.get(i);
            if (!this.f129019j.f129128l.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.f129024o, sQLiteCustomFunction);
            }
        }
        if (((gVar.f129120d ^ this.f129019j.f129120d) & 536870912) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (gVar.f129123g != this.f129019j.f129123g) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = !gVar.f129122f.equals(this.f129019j.f129122f);
        if (gVar.f129124h != this.f129019j.f129124h) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (gVar.f129125i != this.f129019j.f129125i) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!(gVar.f129126j == this.f129019j.f129126j && gVar.f129127k == this.f129019j.f129127k)) {
            z5 = true;
        }
        this.f129019j.mo107218a(gVar);
        C51751d dVar = this.f129021l;
        int i2 = gVar.f129121e;
        if (i2 > 0) {
            synchronized (dVar) {
                dVar.f129191b = i2;
            }
            dVar.mo107267a(i2);
            if (z2) {
                m110904e();
            }
            if (z) {
                m110905f();
            }
            if (z4) {
                m110906g();
            }
            if (z3) {
                m110902d();
            }
            if (z6) {
                m110907h();
            }
            if (z5) {
                m110908i();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    private void m110895a(C51750c cVar, boolean z) {
        nativeResetStatement(this.f129024o, cVar.f129048d, true);
    }

    private void notifyCheckpoint(String str, int i) {
        C51757d dVar = this.f129013c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) dVar.f129074a.get();
        C51755b bVar = dVar.f129077d;
    }

    /* renamed from: a */
    private void m110896a(C51750c cVar, Object[] objArr) {
        int i;
        char c;
        long j;
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        if (i != cVar.f129049e) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(cVar.f129049e);
            sb.append(" bind arguments but ");
            sb.append(i);
            sb.append(" were provided.");
            throw new SQLiteBindOrColumnIndexOutOfRangeException(sb.toString());
        } else if (i != 0) {
            long j2 = cVar.f129048d;
            for (int i2 = 0; i2 < i; i2++) {
                Boolean bool = objArr[i2];
                if (bool == null) {
                    c = 0;
                } else if (bool instanceof byte[]) {
                    c = 4;
                } else if ((bool instanceof Float) || (bool instanceof Double)) {
                    c = 2;
                } else if ((bool instanceof Long) || (bool instanceof Integer) || (bool instanceof Short) || (bool instanceof Byte)) {
                    c = 1;
                } else {
                    c = 3;
                }
                if (c != 4) {
                    switch (c) {
                        case 0:
                            nativeBindNull(this.f129024o, j2, i2 + 1);
                            break;
                        case 1:
                            nativeBindLong(this.f129024o, j2, i2 + 1, ((Number) bool).longValue());
                            break;
                        case 2:
                            nativeBindDouble(this.f129024o, j2, i2 + 1, ((Number) bool).doubleValue());
                            break;
                        default:
                            if (!(bool instanceof Boolean)) {
                                nativeBindString(this.f129024o, j2, i2 + 1, bool.toString());
                                break;
                            } else {
                                long j3 = this.f129024o;
                                int i3 = i2 + 1;
                                if (bool.booleanValue()) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                nativeBindLong(j3, j2, i3, j);
                                break;
                            }
                    }
                } else {
                    nativeBindBlob(this.f129024o, j2, i2 + 1, (byte[]) bool);
                }
            }
        }
    }

    /* renamed from: b */
    public final long mo107158b(String str, Object[] objArr, C51787a aVar) {
        if (str != null) {
            C51748a a = this.f129016f.mo107169a("executeForLong", str, objArr);
            int i = a.f129038h;
            try {
                C51750c d = m110901d(str);
                a.f129039i = d.f129050f;
                try {
                    m110899c(d);
                    m110896a(d, objArr);
                    m110898b(aVar);
                    long nativeExecuteForLong = nativeExecuteForLong(this.f129024o, d.f129048d);
                    mo107153a(aVar);
                    mo107151a(d);
                    this.f129016f.mo107171a(i);
                    return nativeExecuteForLong;
                } catch (Throwable th) {
                    mo107151a(d);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && this.f129013c != null) {
                        this.f129013c.mo107212a(str);
                    }
                    this.f129016f.mo107172a(i, (Exception) e);
                    throw e;
                } catch (Throwable th2) {
                    this.f129016f.mo107171a(i);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    /* renamed from: e */
    public final long mo107165e(String str, Object[] objArr, C51787a aVar) {
        if (str != null) {
            C51748a a = this.f129016f.mo107169a("executeForLastInsertedRowId", str, objArr);
            int i = a.f129038h;
            try {
                C51750c d = m110901d(str);
                a.f129039i = d.f129050f;
                try {
                    m110899c(d);
                    m110896a(d, objArr);
                    m110898b(aVar);
                    long nativeExecuteForLastInsertedRowId = nativeExecuteForLastInsertedRowId(this.f129024o, d.f129048d);
                    mo107153a(aVar);
                    mo107151a(d);
                    this.f129016f.mo107171a(i);
                    return nativeExecuteForLastInsertedRowId;
                } catch (Throwable th) {
                    mo107151a(d);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && this.f129013c != null) {
                        this.f129013c.mo107212a(str);
                    }
                    this.f129016f.mo107172a(i, (Exception) e);
                    throw e;
                } catch (Throwable th2) {
                    this.f129016f.mo107171a(i);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    /* renamed from: c */
    public final String mo107163c(String str, Object[] objArr, C51787a aVar) {
        if (str != null) {
            C51748a a = this.f129016f.mo107169a("executeForString", str, objArr);
            int i = a.f129038h;
            try {
                C51750c d = m110901d(str);
                a.f129039i = d.f129050f;
                try {
                    m110899c(d);
                    m110896a(d, objArr);
                    m110898b(aVar);
                    String nativeExecuteForString = nativeExecuteForString(this.f129024o, d.f129048d);
                    mo107153a(aVar);
                    mo107151a(d);
                    this.f129016f.mo107171a(i);
                    return nativeExecuteForString;
                } catch (Throwable th) {
                    mo107151a(d);
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && this.f129013c != null) {
                        this.f129013c.mo107212a(str);
                    }
                    this.f129016f.mo107172a(i, (Exception) e);
                    throw e;
                } catch (Throwable th2) {
                    this.f129016f.mo107171a(i);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x007d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo107164d(java.lang.String r9, java.lang.Object[] r10, com.tencent.wcdb.support.C51787a r11) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0091
            r0 = 0
            com.tencent.wcdb.database.SQLiteConnection$b r1 = r8.f129016f
            java.lang.String r2 = "executeForChangedRowCount"
            com.tencent.wcdb.database.SQLiteConnection$a r1 = r1.mo107169a(r2, r9, r10)
            int r2 = r1.f129038h
            com.tencent.wcdb.database.SQLiteConnection$c r3 = r8.m110901d(r9)     // Catch:{ RuntimeException -> 0x005d }
            int r4 = r3.f129050f     // Catch:{ RuntimeException -> 0x005d }
            r1.f129039i = r4     // Catch:{ RuntimeException -> 0x005d }
            r8.m110899c(r3)     // Catch:{ all -> 0x0056 }
            r8.m110896a(r3, r10)     // Catch:{ all -> 0x0056 }
            r8.m110898b(r11)     // Catch:{ all -> 0x0056 }
            long r4 = r8.f129024o     // Catch:{ all -> 0x0051 }
            long r6 = r3.f129048d     // Catch:{ all -> 0x0051 }
            int r10 = nativeExecuteForChangedRowCount(r4, r6)     // Catch:{ all -> 0x0051 }
            r8.mo107153a(r11)     // Catch:{ all -> 0x004e }
            r8.mo107151a(r3)     // Catch:{ RuntimeException -> 0x004b, all -> 0x0048 }
            com.tencent.wcdb.database.SQLiteConnection$b r9 = r8.f129016f
            boolean r9 = r9.mo107174b(r2)
            if (r9 == 0) goto L_0x0047
            com.tencent.wcdb.database.SQLiteConnection$b r9 = r8.f129016f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "changedRows="
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            r9.mo107173a(r2, r11)
        L_0x0047:
            return r10
        L_0x0048:
            r9 = move-exception
            r0 = r10
            goto L_0x0075
        L_0x004b:
            r11 = move-exception
            r0 = r10
            goto L_0x005e
        L_0x004e:
            r11 = move-exception
            r0 = r10
            goto L_0x0057
        L_0x0051:
            r10 = move-exception
            r8.mo107153a(r11)     // Catch:{ all -> 0x0056 }
            throw r10     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r11 = move-exception
        L_0x0057:
            r8.mo107151a(r3)     // Catch:{ RuntimeException -> 0x005d }
            throw r11     // Catch:{ RuntimeException -> 0x005d }
        L_0x005b:
            r9 = move-exception
            goto L_0x0075
        L_0x005d:
            r11 = move-exception
        L_0x005e:
            boolean r10 = r11 instanceof com.tencent.wcdb.database.SQLiteDatabaseLockedException     // Catch:{ all -> 0x005b }
            if (r10 != 0) goto L_0x0066
            boolean r10 = r11 instanceof com.tencent.wcdb.database.SQLiteTableLockedException     // Catch:{ all -> 0x005b }
            if (r10 == 0) goto L_0x006f
        L_0x0066:
            com.tencent.wcdb.database.d r10 = r8.f129013c     // Catch:{ all -> 0x005b }
            if (r10 == 0) goto L_0x006f
            com.tencent.wcdb.database.d r10 = r8.f129013c     // Catch:{ all -> 0x005b }
            r10.mo107212a(r9)     // Catch:{ all -> 0x005b }
        L_0x006f:
            com.tencent.wcdb.database.SQLiteConnection$b r9 = r8.f129016f     // Catch:{ all -> 0x005b }
            r9.mo107172a(r2, r11)     // Catch:{ all -> 0x005b }
            throw r11     // Catch:{ all -> 0x005b }
        L_0x0075:
            com.tencent.wcdb.database.SQLiteConnection$b r10 = r8.f129016f
            boolean r10 = r10.mo107174b(r2)
            if (r10 == 0) goto L_0x0090
            com.tencent.wcdb.database.SQLiteConnection$b r10 = r8.f129016f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "changedRows="
            r11.<init>(r1)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.mo107173a(r2, r11)
        L_0x0090:
            throw r9
        L_0x0091:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "sql must not be null."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.mo107164d(java.lang.String, java.lang.Object[], com.tencent.wcdb.support.a):int");
    }

    private void notifyChange(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        C51757d dVar = this.f129013c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) dVar.f129074a.get();
        C51754a aVar = dVar.f129075b;
    }

    private SQLiteConnection(C51757d dVar, C51764g gVar, int i, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        SQLiteCipherSpec sQLiteCipherSpec2 = null;
        this.f129026q = bArr;
        if (sQLiteCipherSpec != null) {
            sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
        }
        this.f129027r = sQLiteCipherSpec2;
        this.f129013c = dVar;
        this.f129019j = new C51764g(gVar);
        this.f129014d = i;
        this.f129015e = z;
        int i2 = gVar.f129120d;
        boolean z2 = true;
        if ((i2 & 1) == 0) {
            z2 = false;
        }
        this.f129020k = z2;
        this.f129021l = new C51751d(this.f129019j.f129121e);
    }

    /* renamed from: a */
    static SQLiteConnection m110894a(C51757d dVar, C51764g gVar, int i, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        long j;
        String str;
        int i2;
        SQLiteConnection sQLiteConnection = new SQLiteConnection(dVar, gVar, i, z, bArr, sQLiteCipherSpec);
        try {
            sQLiteConnection.f129024o = sQLiteConnection.nativeOpen(sQLiteConnection.f129019j.f129117a, sQLiteConnection.f129019j.f129120d, sQLiteConnection.f129019j.f129119c);
            if (sQLiteConnection.f129026q != null && sQLiteConnection.f129026q.length == 0) {
                sQLiteConnection.f129026q = null;
            }
            if (sQLiteConnection.f129026q != null) {
                nativeSetKey(sQLiteConnection.f129024o, sQLiteConnection.f129026q);
                if (sQLiteConnection.f129027r != null) {
                    if (sQLiteConnection.f129027r.cipher != null) {
                        StringBuilder sb = new StringBuilder("PRAGMA cipher=");
                        sb.append(C51779i.m111060a(sQLiteConnection.f129027r.cipher));
                        sQLiteConnection.mo107156a(sb.toString(), null, null);
                    }
                    if (sQLiteConnection.f129027r.kdfIteration != 0) {
                        StringBuilder sb2 = new StringBuilder("PRAGMA kdf_iter=");
                        sb2.append(sQLiteConnection.f129027r.kdfIteration);
                        sQLiteConnection.mo107156a(sb2.toString(), null, null);
                    }
                    StringBuilder sb3 = new StringBuilder("PRAGMA cipher_use_hmac=");
                    sb3.append(sQLiteConnection.f129027r.hmacEnabled);
                    sQLiteConnection.mo107156a(sb3.toString(), null, null);
                }
            }
            if (!sQLiteConnection.f129019j.mo107219a()) {
                if (sQLiteConnection.f129026q != null) {
                    str = "PRAGMA cipher_page_size";
                    if (sQLiteConnection.f129027r != null) {
                        if (sQLiteConnection.f129027r.pageSize > 0) {
                            i2 = sQLiteConnection.f129027r.pageSize;
                            j = (long) i2;
                        }
                    }
                    i2 = SQLiteGlobal.f129071a;
                    j = (long) i2;
                } else {
                    str = "PRAGMA page_size";
                    j = (long) SQLiteGlobal.f129071a;
                }
                if (sQLiteConnection.mo107158b(str, null, null) != j) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append("=");
                    sb4.append(j);
                    sQLiteConnection.mo107156a(sb4.toString(), null, null);
                }
            }
            if (sQLiteConnection.f129020k) {
                sQLiteConnection.mo107156a("PRAGMA query_only = 1", null, null);
            }
            sQLiteConnection.m110904e();
            sQLiteConnection.m110905f();
            sQLiteConnection.m110906g();
            if (!sQLiteConnection.f129019j.mo107219a() && !sQLiteConnection.f129020k && sQLiteConnection.mo107158b("PRAGMA journal_size_limit", null, null) != 524288) {
                sQLiteConnection.mo107158b("PRAGMA journal_size_limit=524288", null, null);
            }
            sQLiteConnection.m110902d();
            sQLiteConnection.m110907h();
            sQLiteConnection.m110908i();
            int size = sQLiteConnection.f129019j.f129128l.size();
            for (int i3 = 0; i3 < size; i3++) {
                nativeRegisterCustomFunction(sQLiteConnection.f129024o, (SQLiteCustomFunction) sQLiteConnection.f129019j.f129128l.get(i3));
            }
            return sQLiteConnection;
        } catch (SQLiteException e) {
            try {
                SQLiteDebug.f129067a = SQLiteDebug.nativeGetLastErrorLine();
                ArrayList<IOTraceStats> arrayList = new ArrayList<>();
                long a = sQLiteConnection.mo107149a((String) null);
                if (a != 0) {
                    SQLiteDebug.nativeGetIOTraceStats(a, arrayList);
                    sQLiteConnection.mo107154a((Exception) null);
                }
                SQLiteDebug.f129068b = arrayList;
            } catch (RuntimeException e2) {
                StringBuilder sb5 = new StringBuilder("Cannot collect I/O trace statistics: ");
                sb5.append(e2.getMessage());
                Log.m111073a("WCDB.SQLiteDebug", sb5.toString());
            }
            sQLiteConnection.m110897a(false);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e6 A[Catch:{ all -> 0x011a }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo107148a(java.lang.String r18, java.lang.Object[] r19, com.tencent.wcdb.CursorWindow r20, int r21, int r22, boolean r23, com.tencent.wcdb.support.C51787a r24) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            r3 = r20
            r13 = r21
            r14 = r24
            if (r2 == 0) goto L_0x0127
            if (r3 == 0) goto L_0x011f
            r20.mo107205d()
            com.tencent.wcdb.database.SQLiteConnection$b r4 = r1.f129016f     // Catch:{ all -> 0x011a }
            java.lang.String r5 = "executeForCursorWindow"
            com.tencent.wcdb.database.SQLiteConnection$a r4 = r4.mo107169a(r5, r2, r0)     // Catch:{ all -> 0x011a }
            int r15 = r4.f129038h     // Catch:{ all -> 0x011a }
            r16 = -1
            com.tencent.wcdb.database.SQLiteConnection$c r12 = r17.m110901d(r18)     // Catch:{ RuntimeException -> 0x00bf, all -> 0x00ba }
            int r5 = r12.f129050f     // Catch:{ RuntimeException -> 0x00bf, all -> 0x00ba }
            r4.f129039i = r5     // Catch:{ RuntimeException -> 0x00bf, all -> 0x00ba }
            r1.m110899c(r12)     // Catch:{ all -> 0x00b0 }
            r1.m110896a(r12, r0)     // Catch:{ all -> 0x00b0 }
            r1.m110898b(r14)     // Catch:{ all -> 0x00b0 }
            long r4 = r1.f129024o     // Catch:{ all -> 0x00a6 }
            long r6 = r12.f129048d     // Catch:{ all -> 0x00a6 }
            long r8 = r3.f128990a     // Catch:{ all -> 0x00a6 }
            r10 = r21
            r11 = r22
            r2 = r12
            r12 = r23
            long r4 = nativeExecuteForCursorWindow(r4, r6, r8, r10, r11, r12)     // Catch:{ all -> 0x00a4 }
            r0 = 32
            long r6 = r4 >> r0
            int r6 = (int) r6
            int r4 = (int) r4
            int r5 = r20.mo107085b()     // Catch:{ all -> 0x00a0 }
            r3.f128991b = r6     // Catch:{ all -> 0x009c }
            r1.mo107153a(r14)     // Catch:{ all -> 0x0098 }
            r1.mo107151a(r2)     // Catch:{ RuntimeException -> 0x0094, all -> 0x0092 }
            com.tencent.wcdb.database.SQLiteConnection$b r0 = r1.f129016f     // Catch:{ all -> 0x011a }
            boolean r0 = r0.mo107174b(r15)     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x008e
            com.tencent.wcdb.database.SQLiteConnection$b r0 = r1.f129016f     // Catch:{ all -> 0x011a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x011a }
            java.lang.String r7 = "window='"
            r2.<init>(r7)     // Catch:{ all -> 0x011a }
            r2.append(r3)     // Catch:{ all -> 0x011a }
            java.lang.String r7 = "', startPos="
            r2.append(r7)     // Catch:{ all -> 0x011a }
            r2.append(r13)     // Catch:{ all -> 0x011a }
            java.lang.String r7 = ", actualPos="
            r2.append(r7)     // Catch:{ all -> 0x011a }
            r2.append(r6)     // Catch:{ all -> 0x011a }
            java.lang.String r6 = ", filledRows="
            r2.append(r6)     // Catch:{ all -> 0x011a }
            r2.append(r5)     // Catch:{ all -> 0x011a }
            java.lang.String r5 = ", countedRows="
            r2.append(r5)     // Catch:{ all -> 0x011a }
            r2.append(r4)     // Catch:{ all -> 0x011a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x011a }
            r0.mo107173a(r15, r2)     // Catch:{ all -> 0x011a }
        L_0x008e:
            r20.mo107206e()
            return r4
        L_0x0092:
            r0 = move-exception
            goto L_0x00de
        L_0x0094:
            r0 = move-exception
            r16 = r6
            goto L_0x00c2
        L_0x0098:
            r0 = move-exception
            r16 = r6
            goto L_0x00b4
        L_0x009c:
            r0 = move-exception
            r16 = r6
            goto L_0x00aa
        L_0x00a0:
            r0 = move-exception
            r16 = r6
            goto L_0x00a9
        L_0x00a4:
            r0 = move-exception
            goto L_0x00a8
        L_0x00a6:
            r0 = move-exception
            r2 = r12
        L_0x00a8:
            r4 = -1
        L_0x00a9:
            r5 = -1
        L_0x00aa:
            r1.mo107153a(r14)     // Catch:{ all -> 0x00ae }
            throw r0     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            goto L_0x00b4
        L_0x00b0:
            r0 = move-exception
            r2 = r12
            r4 = -1
            r5 = -1
        L_0x00b4:
            r1.mo107151a(r2)     // Catch:{ RuntimeException -> 0x00b8 }
            throw r0     // Catch:{ RuntimeException -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            goto L_0x00c2
        L_0x00ba:
            r0 = move-exception
            r4 = -1
            r5 = -1
            r6 = -1
            goto L_0x00de
        L_0x00bf:
            r0 = move-exception
            r4 = -1
            r5 = -1
        L_0x00c2:
            boolean r2 = r0 instanceof com.tencent.wcdb.database.SQLiteDatabaseLockedException     // Catch:{ all -> 0x00db }
            if (r2 != 0) goto L_0x00ca
            boolean r2 = r0 instanceof com.tencent.wcdb.database.SQLiteTableLockedException     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x00d5
        L_0x00ca:
            com.tencent.wcdb.database.d r2 = r1.f129013c     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x00d5
            com.tencent.wcdb.database.d r2 = r1.f129013c     // Catch:{ all -> 0x00db }
            r6 = r18
            r2.mo107212a(r6)     // Catch:{ all -> 0x00db }
        L_0x00d5:
            com.tencent.wcdb.database.SQLiteConnection$b r2 = r1.f129016f     // Catch:{ all -> 0x00db }
            r2.mo107172a(r15, r0)     // Catch:{ all -> 0x00db }
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            r6 = r16
        L_0x00de:
            com.tencent.wcdb.database.SQLiteConnection$b r2 = r1.f129016f     // Catch:{ all -> 0x011a }
            boolean r2 = r2.mo107174b(r15)     // Catch:{ all -> 0x011a }
            if (r2 == 0) goto L_0x0119
            com.tencent.wcdb.database.SQLiteConnection$b r2 = r1.f129016f     // Catch:{ all -> 0x011a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x011a }
            java.lang.String r8 = "window='"
            r7.<init>(r8)     // Catch:{ all -> 0x011a }
            r7.append(r3)     // Catch:{ all -> 0x011a }
            java.lang.String r8 = "', startPos="
            r7.append(r8)     // Catch:{ all -> 0x011a }
            r7.append(r13)     // Catch:{ all -> 0x011a }
            java.lang.String r8 = ", actualPos="
            r7.append(r8)     // Catch:{ all -> 0x011a }
            r7.append(r6)     // Catch:{ all -> 0x011a }
            java.lang.String r6 = ", filledRows="
            r7.append(r6)     // Catch:{ all -> 0x011a }
            r7.append(r5)     // Catch:{ all -> 0x011a }
            java.lang.String r5 = ", countedRows="
            r7.append(r5)     // Catch:{ all -> 0x011a }
            r7.append(r4)     // Catch:{ all -> 0x011a }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x011a }
            r2.mo107173a(r15, r4)     // Catch:{ all -> 0x011a }
        L_0x0119:
            throw r0     // Catch:{ all -> 0x011a }
        L_0x011a:
            r0 = move-exception
            r20.mo107206e()
            throw r0
        L_0x011f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "window must not be null."
            r0.<init>(r2)
            throw r0
        L_0x0127:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "sql must not be null."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.mo107148a(java.lang.String, java.lang.Object[], com.tencent.wcdb.CursorWindow, int, int, boolean, com.tencent.wcdb.support.a):int");
    }
}
