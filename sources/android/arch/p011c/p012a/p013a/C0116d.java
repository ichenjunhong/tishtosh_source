package android.arch.p011c.p012a.p013a;

import android.arch.p011c.p012a.C0124d;
import android.database.sqlite.SQLiteProgram;

/* renamed from: android.arch.c.a.a.d */
class C0116d implements C0124d {

    /* renamed from: a */
    private final SQLiteProgram f285a;

    public void close() {
        this.f285a.close();
    }

    C0116d(SQLiteProgram sQLiteProgram) {
        this.f285a = sQLiteProgram;
    }

    /* renamed from: a */
    public final void mo198a(int i) {
        this.f285a.bindNull(i);
    }

    /* renamed from: a */
    public final void mo199a(int i, double d) {
        this.f285a.bindDouble(i, d);
    }

    /* renamed from: a */
    public final void mo200a(int i, long j) {
        this.f285a.bindLong(i, j);
    }

    /* renamed from: a */
    public final void mo201a(int i, String str) {
        this.f285a.bindString(i, str);
    }

    /* renamed from: a */
    public final void mo202a(int i, byte[] bArr) {
        this.f285a.bindBlob(i, bArr);
    }
}
