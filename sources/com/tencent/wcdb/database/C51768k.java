package com.tencent.wcdb.database;

import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.support.C51787a;
import com.tencent.wcdb.support.Log;

/* renamed from: com.tencent.wcdb.database.k */
public final class C51768k extends C51767j {

    /* renamed from: f */
    private final C51787a f129157f;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SQLiteQuery: ");
        sb.append(this.f129150b);
        return sb.toString();
    }

    C51768k(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, C51787a aVar) {
        super(sQLiteDatabase, str, objArr, aVar);
        this.f129157f = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo107230a(CursorWindow cursorWindow, int i, int i2, boolean z) {
        mo107205d();
        try {
            cursorWindow.mo107205d();
            int a = mo107222a().mo107232a(this.f129150b, this.f129152d, cursorWindow, i, i2, z, mo107227b(), this.f129157f);
            cursorWindow.mo107206e();
            mo107206e();
            return a;
        } catch (SQLiteException e) {
            String str = "WCDB.SQLiteQuery";
            StringBuilder sb = new StringBuilder("exception: ");
            sb.append(e.getMessage());
            sb.append("; query: ");
            sb.append(this.f129150b);
            Log.m111073a(str, sb.toString());
            mo107225a(e);
            throw e;
        } catch (Throwable th) {
            mo107206e();
            throw th;
        }
    }
}
