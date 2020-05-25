package com.bytedance.p702im.core.internal.p710a.p713c.p714a;

import android.util.Pair;
import com.tencent.wcdb.C51778h;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.Log;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.c.a.d */
public class C11281d implements C51778h {

    /* renamed from: b */
    private static final String[] f30384b = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};

    /* renamed from: a */
    private final boolean f30385a;

    /* renamed from: a */
    private void m22921a(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            StringBuilder sb = new StringBuilder("Remove database file: ");
            sb.append(str);
            Log.m111073a("WCDB.DefaultDatabaseErrorHandler", sb.toString());
            int i = 0;
            if (!this.f30385a) {
                File file = new File(str);
                File file2 = new File(file.getParentFile(), "corrupted");
                if (!file2.mkdirs()) {
                    Log.m111073a("WCDB.DefaultDatabaseErrorHandler", "Could not create directory for corrupted database. Corruption backup may be unavailable.");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(file2.getPath());
                sb2.append("/");
                sb2.append(file.getName());
                String sb3 = sb2.toString();
                String[] strArr = f30384b;
                int length = strArr.length;
                while (i < length) {
                    String str2 = strArr[i];
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(str2);
                    String sb5 = sb4.toString();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb3);
                    sb6.append(str2);
                    String sb7 = sb6.toString();
                    File file3 = new File(sb5);
                    if (!file3.renameTo(new File(sb7))) {
                        file3.delete();
                    }
                    i++;
                }
                return;
            }
            String[] strArr2 = f30384b;
            int length2 = strArr2.length;
            while (i < length2) {
                String str3 = strArr2[i];
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(str3);
                new File(sb8.toString()).delete();
                i++;
            }
        }
    }

    /* renamed from: a */
    public void mo20973a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("Corruption reported by sqlite on database: ");
        sb.append(sQLiteDatabase.mo107197o());
        Log.m111073a("WCDB.DefaultDatabaseErrorHandler", sb.toString());
        if (!sQLiteDatabase.mo107196n()) {
            m22921a(sQLiteDatabase.mo107197o());
            return;
        }
        List<Pair> list = null;
        try {
            list = sQLiteDatabase.mo107199q();
        } catch (SQLiteException unused) {
        }
        sQLiteDatabase.mo107198p();
        try {
            sQLiteDatabase.close();
            if (list != null) {
                for (Pair pair : list) {
                    m22921a((String) pair.second);
                }
                return;
            }
        } catch (SQLiteException unused2) {
            if (list != null) {
                for (Pair pair2 : list) {
                    m22921a((String) pair2.second);
                }
                return;
            }
        } catch (Throwable th) {
            if (list != null) {
                for (Pair pair3 : list) {
                    m22921a((String) pair3.second);
                }
            } else {
                m22921a(sQLiteDatabase.mo107197o());
            }
            throw th;
        }
        m22921a(sQLiteDatabase.mo107197o());
    }
}
