package com.bytedance.falconx.statistic.p563a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.falconx.statistic.InterceptorModel;
import com.bytedance.geckox.p599d.C10064b;
import com.bytedance.geckox.utils.C10151a;
import com.bytedance.geckox.utils.C10152b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.falconx.statistic.a.a */
public class C9770a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static volatile C9770a f26587a;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: a */
    public final List<InterceptorModel> mo17612a() {
        Cursor query = getWritableDatabase().query("STATISTIC", new String[]{"INFO"}, null, null, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            query.moveToFirst();
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                arrayList.add(C10064b.m20295a().f27360a.mo34884a(query.getString(query.getColumnIndex("INFO")), InterceptorModel.class));
            }
            return arrayList;
        } finally {
            C10152b.m20476a(query);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists STATISTIC (id integer primary key autoincrement,INFO text)");
    }

    private C9770a(Context context) {
        StringBuilder sb = new StringBuilder("falconx-statistic-");
        sb.append(C10151a.m20475c(context));
        super(context, sb.toString(), null, 1);
    }

    /* renamed from: a */
    public static C9770a m19558a(Context context) {
        if (f26587a != null) {
            return f26587a;
        }
        synchronized (C9770a.class) {
            if (f26587a == null) {
                f26587a = new C9770a(context);
            }
        }
        return f26587a;
    }
}
