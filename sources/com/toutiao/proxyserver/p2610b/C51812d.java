package com.toutiao.proxyserver.p2610b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.toutiao.proxyserver.b.d */
public final class C51812d extends SQLiteOpenHelper {
    public C51812d(Context context) {
        super(context, "video.db", null, 3);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS video_http_header_t(_id INTEGER PRIMARY KEY AUTOINCREMENT,key TEXT,mime TEXT,contentLength INTEGER,flag INTEGER,extra TEXT)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1) {
            sQLiteDatabase.execSQL("ALTER TABLE video_http_header_t ADD COLUMN flag INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE video_http_header_t ADD COLUMN extra TEXT DEFAULT ''");
        } else if (i == 2) {
            sQLiteDatabase.execSQL("ALTER TABLE video_http_header_t ADD COLUMN extra TEXT DEFAULT ''");
        } else {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS video_http_header_t");
            onCreate(sQLiteDatabase);
        }
    }
}
