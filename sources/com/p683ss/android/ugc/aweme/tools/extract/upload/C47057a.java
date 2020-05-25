package com.p683ss.android.ugc.aweme.tools.extract.upload;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.upload.a */
public class C47057a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C47057a f118833a;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `frames_table` (\n\t`aweme_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`video_id`\tTEXT NOT NULL,\n\t`zip_uri`\tTEXT NOT NULL,\n\t`zip_path`\tTEXT NOT NULL,\n\t`extract_model`\tTEXT NOT NULL,\n\t`update_time`\tLONG NOT NULL\n);");
    }

    /* renamed from: a */
    public final void mo94348a(String str) {
        if (!TextUtils.isEmpty(str)) {
            getWritableDatabase().delete("frames_table", "aweme_id = ?", new String[]{str});
        }
    }

    /* renamed from: a */
    public static C47057a m102179a(Context context) {
        if (f118833a == null) {
            synchronized (C47057a.class) {
                if (f118833a == null) {
                    f118833a = new C47057a(context.getApplicationContext(), "frames_table", null, 1);
                }
            }
        }
        return f118833a;
    }

    /* renamed from: a */
    public final void mo94347a(C47058b bVar) {
        if (bVar.f118838e == null) {
            mo94348a(bVar.f118834a);
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("aweme_id", bVar.f118834a);
        contentValues.put("video_id", bVar.f118835b);
        contentValues.put("zip_uri", bVar.f118836c);
        contentValues.put("zip_path", bVar.f118837d);
        contentValues.put("extract_model", bVar.f118838e.toString());
        contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
        getWritableDatabase().replace("frames_table", null, contentValues);
    }

    private C47057a(Context context, String str, CursorFactory cursorFactory, int i) {
        super(context, str, null, 1);
    }
}
