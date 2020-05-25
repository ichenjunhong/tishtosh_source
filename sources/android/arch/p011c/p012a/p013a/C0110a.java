package android.arch.p011c.p012a.p013a;

import android.arch.p011c.p012a.C0109a;
import android.arch.p011c.p012a.C0118b;
import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* renamed from: android.arch.c.a.a.a */
final class C0110a implements C0118b {

    /* renamed from: a */
    private static final String[] f274a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: b */
    private static final String[] f275b = new String[0];

    /* renamed from: c */
    private final SQLiteDatabase f276c;

    /* renamed from: a */
    public final void mo176a() {
        this.f276c.beginTransaction();
    }

    /* renamed from: b */
    public final void mo178b() {
        this.f276c.endTransaction();
    }

    /* renamed from: c */
    public final void mo179c() {
        this.f276c.setTransactionSuccessful();
    }

    public final void close() throws IOException {
        this.f276c.close();
    }

    /* renamed from: d */
    public final boolean mo182d() {
        return this.f276c.inTransaction();
    }

    /* renamed from: e */
    public final boolean mo183e() {
        return this.f276c.isOpen();
    }

    /* renamed from: f */
    public final String mo184f() {
        return this.f276c.getPath();
    }

    /* renamed from: g */
    public final List<Pair<String, String>> mo185g() {
        return this.f276c.getAttachedDbs();
    }

    C0110a(SQLiteDatabase sQLiteDatabase) {
        this.f276c = sQLiteDatabase;
    }

    /* renamed from: a */
    public final C0126f mo174a(String str) {
        return new C0117e(this.f276c.compileStatement(str));
    }

    /* renamed from: b */
    public final Cursor mo177b(String str) {
        return mo175a((C0125e) new C0109a(str));
    }

    /* renamed from: c */
    public final void mo180c(String str) throws SQLException {
        this.f276c.execSQL(str);
    }

    /* renamed from: a */
    public final Cursor mo175a(final C0125e eVar) {
        return this.f276c.rawQueryWithFactory(new CursorFactory() {
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                eVar.mo173a(new C0116d(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.mo172a(), f275b, null);
    }
}
