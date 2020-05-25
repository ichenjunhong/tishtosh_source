package com.bytedance.geckox.p594a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.geckox.statistic.model.StatisticModel.PackageStatisticModel;
import com.bytedance.geckox.utils.C10151a;
import com.bytedance.geckox.utils.C10152b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.geckox.a.b */
class C10038b extends SQLiteOpenHelper {

    /* renamed from: a */
    private static volatile C10038b f27277a;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final List<PackageStatisticModel> mo18011a() {
        Cursor cursor;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            cursor = getWritableDatabase().query("geckox_clean_statistic", null, null, null, null, null, null);
            if (cursor == null) {
                return arrayList;
            }
            while (cursor.moveToNext()) {
                try {
                    String string = cursor.getString(cursor.getColumnIndex("access_key"));
                    String string2 = cursor.getString(cursor.getColumnIndex("channel"));
                    int i = cursor.getInt(cursor.getColumnIndex("clean_type"));
                    int i2 = cursor.getInt(cursor.getColumnIndex("status"));
                    long j = (long) cursor.getInt(cursor.getColumnIndex("pkg_id"));
                    int i3 = cursor.getInt(cursor.getColumnIndex("err_code"));
                    String string3 = cursor.getString(cursor.getColumnIndex("err_msg"));
                    int i4 = cursor.getInt(cursor.getColumnIndex("clean_strategy"));
                    long j2 = cursor.getLong(cursor.getColumnIndex("clean_duration"));
                    PackageStatisticModel packageStatisticModel = new PackageStatisticModel();
                    packageStatisticModel.accessKey = string;
                    packageStatisticModel.channel = string2;
                    packageStatisticModel.statsType = Integer.valueOf(i2);
                    packageStatisticModel.f27455id = Long.valueOf(j);
                    if (i3 == 0) {
                        str = null;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        str = sb.toString();
                    }
                    packageStatisticModel.errCode = str;
                    packageStatisticModel.errMsg = string3;
                    packageStatisticModel.cleanType = Integer.valueOf(i);
                    packageStatisticModel.cleanDuration = Long.valueOf(j2);
                    packageStatisticModel.cleanStrategy = Integer.valueOf(i4);
                    arrayList.add(packageStatisticModel);
                } catch (Exception unused) {
                }
            }
            getWritableDatabase().delete("geckox_clean_statistic", null, null);
            C10152b.m20476a(cursor);
            return arrayList;
        } catch (Exception unused2) {
            cursor = null;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists geckox_clean_statistic (id integer primary key autoincrement,access_key text,channel text,clean_type integer,status integer,pkg_id integer,err_code integer,clean_strategy integer,clean_duration integer,err_msg text)");
    }

    /* renamed from: a */
    public static C10038b m20195a(Context context) {
        if (f27277a == null) {
            synchronized (C10038b.class) {
                if (f27277a == null) {
                    Context applicationContext = context.getApplicationContext();
                    StringBuilder sb = new StringBuilder("geckox_clean_statistic");
                    sb.append(C10151a.m20475c(context));
                    sb.append(".db");
                    f27277a = new C10038b(applicationContext, sb.toString(), null, 1);
                }
            }
        }
        return f27277a;
    }

    private C10038b(Context context, String str, CursorFactory cursorFactory, int i) {
        super(context, str, null, 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18012a(String str, String str2, int i, int i2, long j, int i3, String str3, long j2, int i4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("access_key", str);
        contentValues.put("channel", str2);
        contentValues.put("clean_type", Integer.valueOf(i));
        contentValues.put("status", Integer.valueOf(i2));
        contentValues.put("pkg_id", Long.valueOf(j));
        contentValues.put("err_code", Integer.valueOf(i3));
        contentValues.put("err_msg", str3);
        contentValues.put("clean_duration", Long.valueOf(j2));
        contentValues.put("clean_strategy", Integer.valueOf(1));
        try {
            getWritableDatabase().insert("geckox_clean_statistic", null, contentValues);
        } catch (Exception unused) {
        }
    }
}
