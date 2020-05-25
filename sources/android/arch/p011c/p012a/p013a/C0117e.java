package android.arch.p011c.p012a.p013a;

import android.arch.p011c.p012a.C0126f;
import android.database.sqlite.SQLiteStatement;

/* renamed from: android.arch.c.a.a.e */
final class C0117e extends C0116d implements C0126f {

    /* renamed from: a */
    private final SQLiteStatement f286a;

    /* renamed from: a */
    public final int mo204a() {
        return this.f286a.executeUpdateDelete();
    }

    /* renamed from: b */
    public final long mo205b() {
        return this.f286a.executeInsert();
    }

    C0117e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f286a = sQLiteStatement;
    }
}
