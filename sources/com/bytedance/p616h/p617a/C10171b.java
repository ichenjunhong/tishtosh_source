package com.bytedance.p616h.p617a;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.bytedance.h.a.b */
public class C10171b extends SQLiteOpenHelper {

    /* renamed from: e */
    private static volatile C10171b f27502e;

    /* renamed from: a */
    public String f27503a;

    /* renamed from: b */
    public String f27504b;

    /* renamed from: c */
    public String f27505c;

    /* renamed from: d */
    public String f27506d;

    private C10171b(Context context) {
        super(context, "gecko_local_info.db", null, 3);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(this.f27506d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C10171b m20499a(Context context) {
        if (f27502e == null) {
            synchronized (C10171b.class) {
                if (f27502e == null) {
                    f27502e = new C10171b(context);
                }
            }
        }
        return f27502e;
    }

    /* renamed from: a */
    private void m20500a(SQLiteDatabase sQLiteDatabase) {
        String str = this.f27503a;
        int lastIndexOf = str.lastIndexOf("_");
        if (lastIndexOf > 0) {
            str = str.substring(0, lastIndexOf);
        }
        m20501a(sQLiteDatabase, this.f27504b, str);
        try {
            StringBuilder sb = new StringBuilder("DROP TABLE ");
            sb.append(this.f27503a);
            sQLiteDatabase.execSQL(sb.toString());
        } catch (Exception unused) {
        }
        if (!m20503a(this.f27505c)) {
            new File(this.f27505c).mkdirs();
        }
        sQLiteDatabase.execSQL(this.f27506d);
    }

    /* renamed from: a */
    private boolean m20502a(File file) {
        if (!file.exists()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return file.delete();
        }
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isDirectory()) {
                m20502a(listFiles[i]);
            } else {
                listFiles[i].delete();
            }
        }
        return file.delete();
    }

    /* renamed from: a */
    private static boolean m20503a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new File(str).exists();
        }
        return false;
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m20500a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 1:
                m20500a(sQLiteDatabase);
                break;
            case 2:
                break;
        }
        try {
            StringBuilder sb = new StringBuilder("alter table ");
            sb.append(this.f27503a);
            sb.append(" add package_type");
            sb.append(" integer default -1");
            sQLiteDatabase.execSQL(sb.toString());
        } catch (SQLException unused) {
        }
    }

    /* renamed from: a */
    private boolean m20501a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder("DROP TABLE ");
            sb.append(str2);
            sQLiteDatabase.execSQL(sb.toString());
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return m20502a(new File(str));
    }
}
