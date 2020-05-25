package com.tencent.wcdb.database;

import com.tencent.wcdb.support.C51787a;

/* renamed from: com.tencent.wcdb.database.m */
public final class C51772m extends C51767j {
    /* renamed from: g */
    public final int mo107247g() {
        return mo107244a(null);
    }

    /* renamed from: h */
    public final long mo107248h() {
        return m111050d(null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SQLiteProgram: ");
        sb.append(this.f129150b);
        return sb.toString();
    }

    /* renamed from: d */
    private long m111050d(C51787a aVar) {
        mo107205d();
        try {
            long d = mo107222a().mo107243d(this.f129150b, this.f129152d, mo107227b(), null);
            mo107206e();
            return d;
        } catch (SQLiteDatabaseCorruptException e) {
            mo107225a((SQLiteException) e);
            throw e;
        } catch (Throwable th) {
            mo107206e();
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo107244a(C51787a aVar) {
        mo107205d();
        try {
            int c = mo107222a().mo107242c(this.f129150b, this.f129152d, mo107227b(), aVar);
            mo107206e();
            return c;
        } catch (SQLiteDatabaseCorruptException e) {
            mo107225a((SQLiteException) e);
            throw e;
        } catch (Throwable th) {
            mo107206e();
            throw th;
        }
    }

    /* renamed from: b */
    public final long mo107245b(C51787a aVar) {
        mo107205d();
        try {
            long a = mo107222a().mo107233a(this.f129150b, this.f129152d, mo107227b(), (C51787a) null);
            mo107206e();
            return a;
        } catch (SQLiteDatabaseCorruptException e) {
            mo107225a((SQLiteException) e);
            throw e;
        } catch (Throwable th) {
            mo107206e();
            throw th;
        }
    }

    /* renamed from: c */
    public final String mo107246c(C51787a aVar) {
        mo107205d();
        try {
            String b = mo107222a().mo107240b(this.f129150b, this.f129152d, mo107227b(), (C51787a) null);
            mo107206e();
            return b;
        } catch (SQLiteDatabaseCorruptException e) {
            mo107225a((SQLiteException) e);
            throw e;
        } catch (Throwable th) {
            mo107206e();
            throw th;
        }
    }

    C51772m(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        super(sQLiteDatabase, str, objArr, null);
    }
}
