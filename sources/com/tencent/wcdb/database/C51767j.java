package com.tencent.wcdb.database;

import com.tencent.wcdb.C51779i;
import com.tencent.wcdb.database.SQLiteDebug.IOTraceStats;
import com.tencent.wcdb.support.C51787a;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.tencent.wcdb.database.j */
public abstract class C51767j extends C51756c {

    /* renamed from: f */
    private static final String[] f129148f = new String[0];

    /* renamed from: a */
    public final SQLiteDatabase f129149a;

    /* renamed from: b */
    public final String f129150b;

    /* renamed from: c */
    public final String[] f129151c;

    /* renamed from: d */
    public final Object[] f129152d;

    /* renamed from: e */
    protected C51750c f129153e;

    /* renamed from: g */
    private final boolean f129154g;

    /* renamed from: h */
    private final int f129155h;

    /* renamed from: i */
    private C51769l f129156i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C51769l mo107222a() {
        return this.f129149a.mo107185b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo107227b() {
        return SQLiteDatabase.m110939a(this.f129154g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo107088c() {
        mo107247g();
        mo107228f();
    }

    /* renamed from: f */
    public final void mo107228f() {
        if (this.f129152d != null) {
            Arrays.fill(this.f129152d, null);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        synchronized (this) {
            if (this.f129156i != null || this.f129153e != null) {
                throw new SQLiteMisuseException("Acquired prepared statement is not released.");
            }
        }
        super.finalize();
    }

    /* renamed from: g */
    private synchronized void mo107247g() {
        if (this.f129156i != null || this.f129153e != null) {
            if (this.f129156i == null || this.f129153e == null) {
                throw new IllegalStateException("Internal state error.");
            } else if (this.f129156i == this.f129149a.mo107185b()) {
                C51769l lVar = this.f129156i;
                C51750c cVar = this.f129153e;
                if (lVar.f129159a != null) {
                    lVar.f129159a.mo107151a(cVar);
                    lVar.mo107241b();
                }
                this.f129153e = null;
                this.f129156i = null;
            } else {
                throw new IllegalStateException("SQLiteProgram has bound to another thread.");
            }
        }
    }

    /* renamed from: a */
    public final void mo107226a(String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                mo107224a(length, strArr[length - 1]);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo107225a(SQLiteException sQLiteException) {
        boolean z = true;
        if (!(sQLiteException instanceof SQLiteDatabaseCorruptException) && (!(sQLiteException instanceof SQLiteFullException) || !this.f129154g)) {
            z = false;
        }
        if (z) {
            SQLiteDatabase sQLiteDatabase = this.f129149a;
            try {
                SQLiteDebug.f129067a = SQLiteDebug.nativeGetLastErrorLine();
                ArrayList<IOTraceStats> arrayList = new ArrayList<>();
                long a = sQLiteDatabase.mo107179a("collectIoStat", false, false);
                if (a != 0) {
                    SQLiteDebug.nativeGetIOTraceStats(a, arrayList);
                }
                sQLiteDatabase.mo107184a(a, (Exception) null);
                SQLiteDebug.f129068b = arrayList;
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder("Cannot collect I/O trace statistics: ");
                sb.append(e.getMessage());
                Log.m111073a("WCDB.SQLiteDebug", sb.toString());
            }
            this.f129149a.mo107182a();
        }
    }

    /* renamed from: a */
    public final void mo107224a(int i, String str) {
        if (str != null) {
            mo107223a(i, (Object) str);
            return;
        }
        StringBuilder sb = new StringBuilder("the bind value at index ");
        sb.append(i);
        sb.append(" is null");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo107223a(int i, Object obj) {
        if (i <= 0 || i > this.f129155h) {
            StringBuilder sb = new StringBuilder("Cannot bind argument at index ");
            sb.append(i);
            sb.append(" because the index is out of range.  The statement has ");
            sb.append(this.f129155h);
            sb.append(" parameters.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f129152d[i - 1] = obj;
    }

    /* JADX INFO: finally extract failed */
    protected C51767j(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, C51787a aVar) {
        this.f129149a = sQLiteDatabase;
        this.f129150b = str.trim();
        int b = C51779i.m111062b(this.f129150b);
        switch (b) {
            case 4:
            case 5:
            case 6:
                this.f129154g = false;
                this.f129151c = f129148f;
                this.f129155h = 0;
                break;
            default:
                boolean z = true;
                if (b != 1) {
                    z = false;
                }
                C51773n nVar = new C51773n();
                C51769l b2 = sQLiteDatabase.mo107185b();
                String str2 = this.f129150b;
                int a = SQLiteDatabase.m110939a(z);
                if (str2 != null) {
                    if (aVar != null) {
                        aVar.mo107262a();
                    }
                    b2.mo107239a(str2, a, aVar);
                    try {
                        b2.f129159a.mo107155a(str2, nVar);
                        b2.mo107241b();
                        this.f129154g = nVar.f129172c;
                        this.f129151c = nVar.f129171b;
                        this.f129155h = nVar.f129170a;
                        break;
                    } catch (Throwable th) {
                        b2.mo107241b();
                        throw th;
                    }
                } else {
                    throw new IllegalArgumentException("sql must not be null.");
                }
        }
        if (objArr == null || objArr.length <= this.f129155h) {
            if (this.f129155h != 0) {
                this.f129152d = new Object[this.f129155h];
                if (objArr != null) {
                    System.arraycopy(objArr, 0, this.f129152d, 0, objArr.length);
                }
            } else {
                this.f129152d = null;
            }
            this.f129153e = null;
            this.f129156i = null;
            return;
        }
        StringBuilder sb = new StringBuilder("Too many bind arguments.  ");
        sb.append(objArr.length);
        sb.append(" arguments were provided but the statement needs ");
        sb.append(this.f129155h);
        sb.append(" arguments.");
        throw new IllegalArgumentException(sb.toString());
    }
}
