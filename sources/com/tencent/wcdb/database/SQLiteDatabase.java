package com.tencent.wcdb.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.wcdb.C51775e;
import com.tencent.wcdb.C51778h;
import com.tencent.wcdb.C51779i;
import com.tencent.wcdb.C51780j;
import com.tencent.wcdb.C51782l;
import com.tencent.wcdb.support.C51787a;
import com.tencent.wcdb.support.Log;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Set;
import java.util.WeakHashMap;

public final class SQLiteDatabase extends C51756c {

    /* renamed from: d */
    static final /* synthetic */ boolean f129056d = (!SQLiteDatabase.class.desiredAssertionStatus());

    /* renamed from: e */
    private static final WeakHashMap<SQLiteDatabase, Object> f129057e = new WeakHashMap<>();

    /* renamed from: j */
    private static final String[] f129058j = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: a */
    final Object f129059a = new Object();

    /* renamed from: b */
    final C51764g f129060b;

    /* renamed from: c */
    C51757d f129061c;

    /* renamed from: f */
    private final ThreadLocal<C51769l> f129062f = new ThreadLocal<C51769l>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return SQLiteDatabase.this.mo107187f();
        }
    };

    /* renamed from: g */
    private final C51753a f129063g;

    /* renamed from: h */
    private final C51778h f129064h;

    /* renamed from: i */
    private boolean f129065i;

    public interface CustomFunction {
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteDatabase$a */
    public interface C51753a {
        /* renamed from: a */
        C51767j mo20970a(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, C51787a aVar);

        /* renamed from: a */
        C51775e mo20971a(SQLiteDatabase sQLiteDatabase, C51763f fVar, String str, C51767j jVar);
    }

    /* renamed from: a */
    public final void mo107183a(int i) {
        StringBuilder sb = new StringBuilder("PRAGMA user_version = ");
        sb.append(i);
        mo107186b(sb.toString());
    }

    /* renamed from: a */
    public final C51772m mo107180a(String str) throws C51782l {
        mo107205d();
        try {
            return new C51772m(this, str, null);
        } finally {
            mo107206e();
        }
    }

    /* renamed from: a */
    public final C51775e mo107181a(String str, Object[] objArr) {
        return m110942a((C51753a) null, str, objArr, (String) null, (C51787a) null);
    }

    /* renamed from: a */
    public final long mo107178a(String str, String str2, ContentValues contentValues) {
        try {
            return m110940a(str, str2, contentValues, 0);
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        } catch (C51782l e2) {
            Log.m111074a("WCDB.SQLiteDatabase", "Error inserting %s: %s", contentValues, e2);
            return -1;
        }
    }

    /* renamed from: a */
    public final int mo107177a(String str, String str2, String[] strArr) {
        C51772m mVar;
        String str3;
        mo107205d();
        try {
            StringBuilder sb = new StringBuilder("DELETE FROM ");
            sb.append(str);
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb2 = new StringBuilder(" WHERE ");
                sb2.append(str2);
                str3 = sb2.toString();
            } else {
                str3 = "";
            }
            sb.append(str3);
            mVar = new C51772m(this, sb.toString(), strArr);
            int g = mVar.mo107247g();
            mVar.close();
            mo107206e();
            return g;
        } catch (Throwable th) {
            mo107206e();
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo107176a(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        int i2;
        C51772m mVar;
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        mo107205d();
        try {
            StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            int i3 = 0;
            sb.append(f129058j[0]);
            sb.append(str);
            sb.append(" SET ");
            int size = contentValues.size();
            if (strArr == null) {
                i2 = size;
            } else {
                i2 = strArr.length + size;
            }
            Object[] objArr = new Object[i2];
            for (String str3 : m110943a(contentValues)) {
                sb.append(i3 > 0 ? "," : "");
                sb.append(str3);
                int i4 = i3 + 1;
                objArr[i3] = contentValues.get(str3);
                sb.append("=?");
                i3 = i4;
            }
            if (strArr != null) {
                for (int i5 = size; i5 < i2; i5++) {
                    objArr[i5] = strArr[i5 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            mVar = new C51772m(this, sb.toString(), objArr);
            int g = mVar.mo107247g();
            mVar.close();
            mo107206e();
            return g;
        } catch (Throwable th) {
            mo107206e();
            throw th;
        }
    }

    /* renamed from: a */
    public final long mo107179a(String str, boolean z, boolean z2) {
        long a = mo107185b().mo107234a(z ? 1 : 2).mo107149a(str);
        if (a != 0) {
            return a;
        }
        throw new IllegalStateException("SQLiteConnection native handle not initialized.");
    }

    /* renamed from: a */
    public final void mo107184a(long j, Exception exc) {
        mo107185b().mo107238a((Exception) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107182a() {
        this.f129064h.mo20973a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo107088c() {
        m110946b(false);
    }

    /* renamed from: g */
    public final void mo107189g() {
        m110944a((SQLiteTransactionListener) null, true);
    }

    /* renamed from: s */
    private String m110948s() {
        String str;
        synchronized (this.f129059a) {
            str = this.f129060b.f129118b;
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C51769l mo107185b() {
        return (C51769l) this.f129062f.get();
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            m110946b(true);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: k */
    public final int mo107193k() {
        return Long.valueOf(C51779i.m111059a(this, "PRAGMA user_version;", null)).intValue();
    }

    /* renamed from: l */
    public final boolean mo107194l() {
        boolean m;
        synchronized (this.f129059a) {
            m = mo107195m();
        }
        return m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo107195m() {
        if ((this.f129060b.f129120d & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo107196n() {
        boolean z;
        synchronized (this.f129059a) {
            if (this.f129061c != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: o */
    public final String mo107197o() {
        String str;
        synchronized (this.f129059a) {
            str = this.f129060b.f129117a;
        }
        return str;
    }

    /* renamed from: p */
    public final C51774o mo107198p() {
        C51774o oVar;
        synchronized (this.f129059a) {
            mo107200r();
            oVar = this.f129061c.f129076c;
        }
        return oVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final C51769l mo107187f() {
        C51757d dVar;
        synchronized (this.f129059a) {
            mo107200r();
            dVar = this.f129061c;
        }
        return new C51769l(dVar);
    }

    /* renamed from: h */
    public final void mo107190h() {
        mo107205d();
        try {
            mo107185b().mo107237a((C51787a) null);
        } finally {
            mo107206e();
        }
    }

    /* renamed from: i */
    public final void mo107191i() {
        mo107205d();
        try {
            mo107185b().mo107235a();
        } finally {
            mo107206e();
        }
    }

    /* renamed from: j */
    public final boolean mo107192j() {
        boolean z;
        mo107205d();
        try {
            if (mo107185b().f129160b != null) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            mo107206e();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SQLiteDatabase: ");
        sb.append(mo107197o());
        return sb.toString();
    }

    static {
        SQLiteGlobal.loadLib();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo107200r() {
        if (this.f129061c == null) {
            StringBuilder sb = new StringBuilder("The database '");
            sb.append(this.f129060b.f129118b);
            sb.append("' is not open.");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = mo107181a("pragma database_list;", (java.lang.Object[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r1.moveToNext() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        r0.add(new android.util.Pair(r1.getString(1), r1.getString(2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        mo107206e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r1 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005c, code lost:
        mo107206e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005f, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055 A[SYNTHETIC, Splitter:B:30:0x0055] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<java.lang.String, java.lang.String>> mo107199q() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r5.f129059a
            monitor-enter(r1)
            com.tencent.wcdb.database.d r2 = r5.f129061c     // Catch:{ all -> 0x0060 }
            r3 = 0
            if (r2 != 0) goto L_0x000f
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            return r3
        L_0x000f:
            boolean r2 = r5.f129065i     // Catch:{ all -> 0x0060 }
            if (r2 != 0) goto L_0x0023
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x0060 }
            java.lang.String r3 = "main"
            com.tencent.wcdb.database.g r4 = r5.f129060b     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = r4.f129117a     // Catch:{ all -> 0x0060 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0060 }
            r0.add(r2)     // Catch:{ all -> 0x0060 }
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            return r0
        L_0x0023:
            r5.mo107205d()     // Catch:{ all -> 0x0060 }
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = "pragma database_list;"
            com.tencent.wcdb.e r1 = r5.mo107181a(r1, r3)     // Catch:{ all -> 0x0051 }
        L_0x002d:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x0046
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x004f }
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch:{ all -> 0x004f }
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch:{ all -> 0x004f }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x004f }
            r0.add(r2)     // Catch:{ all -> 0x004f }
            goto L_0x002d
        L_0x0046:
            if (r1 == 0) goto L_0x004b
            r1.close()     // Catch:{ all -> 0x0059 }
        L_0x004b:
            r5.mo107206e()
            return r0
        L_0x004f:
            r0 = move-exception
            goto L_0x0053
        L_0x0051:
            r0 = move-exception
            r1 = r3
        L_0x0053:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005b
        L_0x0059:
            r0 = move-exception
            goto L_0x005c
        L_0x005b:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x005c:
            r5.mo107206e()
            throw r0
        L_0x0060:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.mo107199q():java.util.List");
    }

    /* renamed from: b */
    public final void mo107186b(String str) throws C51782l {
        m110938a(str, (Object[]) null, (C51787a) null);
    }

    /* renamed from: a */
    static int m110939a(boolean z) {
        int i;
        boolean z2 = true;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null || myLooper != Looper.getMainLooper()) {
            z2 = false;
        }
        if (z2) {
            return i | 4;
        }
        return i;
    }

    /* renamed from: b */
    private void m110946b(boolean z) {
        C51757d dVar;
        synchronized (this.f129059a) {
            dVar = this.f129061c;
            this.f129061c = null;
        }
        if (!z) {
            synchronized (f129057e) {
                f129057e.remove(this);
            }
            if (dVar != null) {
                dVar.close();
            }
        }
    }

    /* renamed from: a */
    private static Set<String> m110943a(ContentValues contentValues) {
        if (VERSION.SDK_INT >= 11) {
            return contentValues.keySet();
        }
        try {
            Field declaredField = Class.forName("android.content.ContentValues").getDeclaredField("mValues");
            declaredField.setAccessible(true);
            return ((HashMap) declaredField.get(contentValues)).keySet();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private void m110944a(SQLiteTransactionListener sQLiteTransactionListener, boolean z) {
        mo107205d();
        try {
            mo107185b().mo107236a(2, (SQLiteTransactionListener) null, m110939a(false), (C51787a) null);
        } finally {
            mo107206e();
        }
    }

    /* renamed from: a */
    private int m110938a(String str, Object[] objArr, C51787a aVar) throws C51782l {
        C51772m mVar;
        mo107205d();
        try {
            if (C51779i.m111062b(str) == 3) {
                boolean z = false;
                synchronized (this.f129059a) {
                    if (!this.f129065i) {
                        this.f129065i = true;
                        z = true;
                    }
                }
                if (z) {
                    synchronized (this.f129059a) {
                        mo107200r();
                        if ((this.f129060b.f129120d & 536870912) != 0) {
                            this.f129060b.f129120d &= -536870913;
                            try {
                                this.f129061c.mo107211a(this.f129060b);
                            } catch (RuntimeException e) {
                                C51764g gVar = this.f129060b;
                                gVar.f129120d = 536870912 | gVar.f129120d;
                                throw e;
                            }
                        }
                    }
                }
            }
            mVar = new C51772m(this, str, null);
            int a = mVar.mo107244a(null);
            mVar.close();
            mo107206e();
            return a;
        } catch (Throwable th) {
            mo107206e();
            throw th;
        }
    }

    /* renamed from: b */
    private void m110947b(byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i) {
        SQLiteCipherSpec sQLiteCipherSpec2;
        synchronized (this.f129059a) {
            if (!f129056d) {
                if (this.f129061c != null) {
                    throw new AssertionError();
                }
            }
            C51764g gVar = this.f129060b;
            if (gVar != null) {
                C51757d dVar = new C51757d(this, gVar, i);
                dVar.f129078e = bArr;
                if (sQLiteCipherSpec == null) {
                    sQLiteCipherSpec2 = null;
                } else {
                    sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
                }
                dVar.f129079f = sQLiteCipherSpec2;
                dVar.f129085l = dVar.mo107207a(dVar.f129082i, true);
                dVar.f129083j = true;
                this.f129061c = dVar;
            } else {
                throw new IllegalArgumentException("configuration must not be null.");
            }
        }
        synchronized (f129057e) {
            f129057e.put(this, null);
        }
    }

    /* JADX INFO: used method not loaded: com.tencent.wcdb.support.Log.a(java.lang.String, java.lang.String, java.lang.Object[]):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        mo107182a();
        m110947b(r2, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        r3 = new java.lang.StringBuilder("Failed to open database '");
        r3.append(m110948s());
        r3.append("'.");
        com.tencent.wcdb.support.Log.m111074a("WCDB.SQLiteDatabase", r3.toString(), r2);
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0006 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m110945a(byte[] r2, com.tencent.wcdb.database.SQLiteCipherSpec r3, int r4) {
        /*
            r1 = this;
            r1.m110947b(r2, r3, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0006 }
            return
        L_0x0004:
            r2 = move-exception
            goto L_0x000d
        L_0x0006:
            r1.mo107182a()     // Catch:{ SQLiteException -> 0x0004 }
            r1.m110947b(r2, r3, r4)     // Catch:{ SQLiteException -> 0x0004 }
            return
        L_0x000d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to open database '"
            r3.<init>(r4)
            java.lang.String r4 = r1.m110948s()
            r3.append(r4)
            java.lang.String r4 = "'."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r2
            java.lang.String r0 = "WCDB.SQLiteDatabase"
            com.tencent.wcdb.support.Log.m111074a(r0, r3, r4)
            r1.close()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.m110945a(byte[], com.tencent.wcdb.database.SQLiteCipherSpec, int):void");
    }

    private SQLiteDatabase(String str, int i, C51753a aVar, C51778h hVar) {
        this.f129063g = aVar;
        if (hVar == null) {
            hVar = new C51780j(true);
        }
        this.f129064h = hVar;
        this.f129060b = new C51764g(str, i);
    }

    /* renamed from: a */
    private long m110940a(String str, String str2, ContentValues contentValues, int i) {
        int i2;
        C51772m mVar;
        String str3;
        String str4;
        mo107205d();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(f129058j[0]);
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            Object[] objArr = null;
            if (contentValues == null || contentValues.size() <= 0) {
                i2 = 0;
            } else {
                i2 = contentValues.size();
            }
            if (i2 > 0) {
                objArr = new Object[i2];
                int i3 = 0;
                for (String str5 : m110943a(contentValues)) {
                    if (i3 > 0) {
                        str4 = ",";
                    } else {
                        str4 = "";
                    }
                    sb.append(str4);
                    sb.append(str5);
                    int i4 = i3 + 1;
                    objArr[i3] = contentValues.get(str5);
                    i3 = i4;
                }
                sb.append(')');
                sb.append(" VALUES (");
                for (int i5 = 0; i5 < i2; i5++) {
                    if (i5 > 0) {
                        str3 = ",?";
                    } else {
                        str3 = "?";
                    }
                    sb.append(str3);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(") VALUES (NULL");
                sb.append(sb2.toString());
            }
            sb.append(')');
            mVar = new C51772m(this, sb.toString(), objArr);
            long h = mVar.mo107248h();
            mVar.close();
            mo107206e();
            return h;
        } catch (Throwable th) {
            mo107206e();
            throw th;
        }
    }

    /* renamed from: a */
    private C51775e m110942a(C51753a aVar, String str, Object[] objArr, String str2, C51787a aVar2) {
        mo107205d();
        try {
            return new C51765h(this, str, null, null).mo107217a(this.f129063g, objArr);
        } finally {
            mo107206e();
        }
    }

    /* renamed from: a */
    public static SQLiteDatabase m110941a(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, C51753a aVar, int i, C51778h hVar, int i2) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(str, i, aVar, hVar);
        sQLiteDatabase.m110945a(bArr, sQLiteCipherSpec, i2);
        return sQLiteDatabase;
    }
}
