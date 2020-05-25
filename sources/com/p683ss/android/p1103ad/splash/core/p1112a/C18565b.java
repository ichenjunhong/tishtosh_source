package com.p683ss.android.p1103ad.splash.core.p1112a;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

/* renamed from: com.ss.android.ad.splash.core.a.b */
public class C18565b {

    /* renamed from: b */
    public static final Object f51159b = new Object();

    /* renamed from: a */
    public Context f51160a;

    /* renamed from: c */
    private C18568c f51161c;

    /* renamed from: com.ss.android.ad.splash.core.a.b$a */
    protected class C18566a extends SQLiteOpenHelper {

        /* renamed from: a */
        Context f51162a;

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            Context context = this.f51162a;
            StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
            sb.append("trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,");
            sb.append("id TEXT UNIQUE,");
            sb.append("url TEXT ,");
            sb.append("replaceholder INTEGER default 0, ");
            sb.append("retry INTEGER default 0, ");
            sb.append("type INTEGER default 0, ");
            sb.append("cid BIGINT default 0, ");
            sb.append("log_extra TEXT");
            sb.append(")");
            sQLiteDatabase.execSQL(sb.toString());
        }

        public C18566a(Context context) {
            super(context, "splashsdk.db", null, 1);
            this.f51162a = context;
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.a.b$b */
    public class C18567b extends AbstractCursor {
        public final String[] getColumnNames() {
            return new String[0];
        }

        public final int getCount() {
            return 0;
        }

        public final double getDouble(int i) {
            return ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        }

        public final float getFloat(int i) {
            return 0.0f;
        }

        public final int getInt(int i) {
            return 0;
        }

        public final long getLong(int i) {
            return 0;
        }

        public final short getShort(int i) {
            return 0;
        }

        public final String getString(int i) {
            return null;
        }

        public final boolean isNull(int i) {
            return true;
        }

        public C18567b() {
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.a.b$c */
    public class C18568c {

        /* renamed from: b */
        private volatile SQLiteDatabase f51166b;

        /* renamed from: a */
        private void m44945a() {
            try {
                synchronized (C18565b.f51159b) {
                    if (this.f51166b == null || !this.f51166b.isOpen()) {
                        this.f51166b = new C18566a(C18565b.this.f51160a).getWritableDatabase();
                        this.f51166b.setLockingEnabled(false);
                    }
                }
            } catch (Throwable unused) {
            }
        }

        public C18568c() {
        }

        /* renamed from: a */
        public final int mo37888a(String str, String str2, String[] strArr) {
            try {
                m44945a();
                return this.f51166b.delete(str, str2, strArr);
            } catch (Exception unused) {
                return 0;
            }
        }

        /* renamed from: a */
        public final long mo37889a(String str, String str2, ContentValues contentValues) {
            try {
                m44945a();
                return this.f51166b.insert(str, null, contentValues);
            } catch (Exception unused) {
                return -1;
            }
        }

        /* renamed from: a */
        public final int mo37887a(String str, ContentValues contentValues, String str2, String[] strArr) {
            try {
                m44945a();
                return this.f51166b.update(str, contentValues, str2, strArr);
            } catch (Exception unused) {
                return 0;
            }
        }

        /* renamed from: a */
        public final Cursor mo37890a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                m44945a();
                return this.f51166b.query(str, null, null, null, null, null, null);
            } catch (Throwable unused) {
                return new C18567b();
            }
        }
    }

    /* renamed from: a */
    public C18568c mo37875a() {
        return this.f51161c;
    }

    C18565b(Context context) {
        this.f51160a = context.getApplicationContext();
        if (this.f51161c == null) {
            this.f51161c = new C18568c();
        }
    }
}
