package com.p683ss.android.ugc.aweme.tools.policysecurity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.android.livesdk.chatroom.p325ui.C6072db;
import java.io.Closeable;
import java.util.ArrayList;
import p2628d.C52857u;
import p2628d.p2638e.C52647c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.b */
public final class C47334b extends SQLiteOpenHelper {

    /* renamed from: a */
    public static C47334b f119487a;

    /* renamed from: b */
    public static final C47335a f119488b = new C47335a(null);

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.b$a */
    public static final class C47335a {
        private C47335a() {
        }

        public /* synthetic */ C47335a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C47334b m102704a(Context context) {
            C52711k.m112240b(context, "context");
            if (C47334b.f119487a == null) {
                Context applicationContext = context.getApplicationContext();
                C52711k.m112236a((Object) applicationContext, "context.applicationContext");
                C47334b.f119487a = new C47334b(applicationContext);
            }
            C47334b bVar = C47334b.f119487a;
            if (bVar != null) {
                return bVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundSQLiteHelper");
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C52711k.m112240b(sQLiteDatabase, C6072db.f16229a);
    }

    /* renamed from: a */
    public final ArrayList<OriginalSoundUploadTask> mo94618a() {
        Throwable th;
        ArrayList<OriginalSoundUploadTask> arrayList = new ArrayList<>();
        Closeable query = getReadableDatabase().query("OriginalSound", new String[]{"aweme_id", "vid", "audio_path", "update_time"}, null, null, null, null, null);
        try {
            Cursor cursor = (Cursor) query;
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndex("aweme_id"));
                C52711k.m112236a((Object) string, "it.getString(it.getColumnIndex(AWEME_ID))");
                String string2 = cursor.getString(cursor.getColumnIndex("vid"));
                C52711k.m112236a((Object) string2, "it.getString(it.getColumnIndex(VID))");
                String string3 = cursor.getString(cursor.getColumnIndex("audio_path"));
                C52711k.m112236a((Object) string3, "it.getString(it.getColumnIndex(AUDIO_PATH))");
                OriginalSoundUploadTask originalSoundUploadTask = new OriginalSoundUploadTask(string, string2, string3, cursor.getLong(cursor.getColumnIndex("update_time")));
                arrayList.add(originalSoundUploadTask);
            }
            C52647c.m112189a(query, null);
            return arrayList;
        } catch (Throwable th2) {
            C52647c.m112189a(query, th);
            throw th2;
        }
    }

    public C47334b(Context context) {
        C52711k.m112240b(context, "context");
        super(context, "OriginalSound", null, 1);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C52711k.m112240b(sQLiteDatabase, C6072db.f16229a);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `OriginalSound` (\n\t`aweme_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`vid`\tTEXT NOT NULL,\n\t`audio_path`\tTEXT NOT NULL,\n\t`audio_vid`\tTEXT,\n\t`update_time`\tLONG NOT NULL\n);");
    }

    /* renamed from: a */
    public final void mo94620a(String str) {
        C52711k.m112240b(str, "awemeId");
        getWritableDatabase().delete("OriginalSound", "aweme_id = ?", new String[]{str});
    }

    /* renamed from: a */
    public final void mo94619a(OriginalSoundUploadTask originalSoundUploadTask) {
        C52711k.m112240b(originalSoundUploadTask, "originalSoundUploadTask");
        ContentValues contentValues = new ContentValues();
        contentValues.put("aweme_id", originalSoundUploadTask.f119482b);
        contentValues.put("vid", originalSoundUploadTask.f119483c);
        contentValues.put("audio_path", originalSoundUploadTask.f119484d);
        contentValues.put("audio_vid", originalSoundUploadTask.f119481a);
        contentValues.put("update_time", Long.valueOf(originalSoundUploadTask.f119485e));
        getWritableDatabase().replace("OriginalSound", null, contentValues);
    }
}
