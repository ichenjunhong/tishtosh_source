package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.ae */
final class C16534ae extends SQLiteOpenHelper {

    /* renamed from: a */
    private final /* synthetic */ C16533ad f46459a;

    C16534ae(C16533ad adVar, Context context, String str) {
        this.f46459a = adVar;
        super(context, str, null, 1);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final SQLiteDatabase getWritableDatabase() {
        if (this.f46459a.f46458f.mo31858a(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                this.f46459a.f46458f.mo31857a();
                this.f46459a.mo32505f("Opening the database failed, dropping the table and recreating it");
                C16533ad adVar = this.f46459a;
                this.f46459a.mo32506g().getDatabasePath("google_analytics_v4.db").delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.f46459a.f46458f.mo31859b();
                    return writableDatabase;
                } catch (SQLiteException e) {
                    this.f46459a.mo32501d("Failed to open freshly created database", e);
                    throw e;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m39438a(android.database.sqlite.SQLiteDatabase r12, java.lang.String r13) {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
            java.lang.String r3 = "SQLITE_MASTER"
            r2 = 1
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x002d }
            java.lang.String r5 = "name"
            r4[r0] = r5     // Catch:{ SQLiteException -> 0x002d }
            java.lang.String r5 = "name=?"
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x002d }
            r6[r0] = r13     // Catch:{ SQLiteException -> 0x002d }
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x002d }
            boolean r1 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0026, all -> 0x0023 }
            if (r12 == 0) goto L_0x0022
            r12.close()
        L_0x0022:
            return r1
        L_0x0023:
            r13 = move-exception
            r1 = r12
            goto L_0x003b
        L_0x0026:
            r1 = move-exception
            r10 = r1
            r1 = r12
            r12 = r10
            goto L_0x002e
        L_0x002b:
            r13 = move-exception
            goto L_0x003b
        L_0x002d:
            r12 = move-exception
        L_0x002e:
            com.google.android.gms.internal.measurement.ad r2 = r11.f46459a     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "Error querying for table"
            r2.mo32499c(r3, r13, r12)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x003a
            r1.close()
        L_0x003a:
            return r0
        L_0x003b:
            if (r1 == 0) goto L_0x0040
            r1.close()
        L_0x0040:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16534ae.m39438a(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }

    /* renamed from: b */
    private static Set<String> m39439b(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            String[] columnNames = rawQuery.getColumnNames();
            for (String add : columnNames) {
                hashSet.add(add);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (VERSION.SDK_INT < 15) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
            try {
                rawQuery.moveToFirst();
            } finally {
                rawQuery.close();
            }
        }
        if (!m39438a(sQLiteDatabase, "hits2")) {
            sQLiteDatabase.execSQL(C16533ad.f46454a);
        } else {
            Set b = m39439b(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (!b.remove(str)) {
                    String str2 = "Database hits2 is missing required column: ";
                    String valueOf = String.valueOf(str);
                    throw new SQLiteException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
            boolean z = !b.remove("hit_app_id");
            if (!b.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            } else if (z) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }
        if (!m39438a(sQLiteDatabase, "properties")) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            return;
        }
        Set b2 = m39439b(sQLiteDatabase, "properties");
        String[] strArr2 = {"app_uid", "cid", "tid", "params", "adid", "hits_count"};
        for (int i2 = 0; i2 < 6; i2++) {
            String str3 = strArr2[i2];
            if (!b2.remove(str3)) {
                String str4 = "Database properties is missing required column: ";
                String valueOf2 = String.valueOf(str3);
                throw new SQLiteException(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4));
            }
        }
        if (!b2.isEmpty()) {
            throw new SQLiteException("Database properties table has extra columns");
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        if (C16558bb.m39511a() >= 9) {
            File file = new File(path);
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        }
    }
}
