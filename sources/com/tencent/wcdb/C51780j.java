package com.tencent.wcdb;

import android.util.Pair;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.Log;
import java.io.File;
import java.util.List;

/* renamed from: com.tencent.wcdb.j */
public final class C51780j implements C51778h {

    /* renamed from: b */
    private static final String[] f129174b = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};

    /* renamed from: a */
    private final boolean f129175a;

    public C51780j() {
    }

    public C51780j(boolean z) {
        this.f129175a = true;
    }

    /* renamed from: a */
    private void m111064a(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            StringBuilder sb = new StringBuilder("Remove database file: ");
            sb.append(str);
            Log.m111073a("WCDB.DefaultDatabaseErrorHandler", sb.toString());
            int i = 0;
            if (!this.f129175a) {
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
                String[] strArr = f129174b;
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
            String[] strArr2 = f129174b;
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
    public final void mo20973a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("Corruption reported by sqlite on database: ");
        sb.append(sQLiteDatabase.mo107197o());
        Log.m111073a("WCDB.DefaultDatabaseErrorHandler", sb.toString());
        if (!sQLiteDatabase.mo107196n()) {
            m111064a(sQLiteDatabase.mo107197o());
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
                    m111064a((String) pair.second);
                }
                return;
            }
        } catch (SQLiteException unused2) {
            if (list != null) {
                for (Pair pair2 : list) {
                    m111064a((String) pair2.second);
                }
                return;
            }
        } catch (Throwable th) {
            if (list != null) {
                for (Pair pair3 : list) {
                    m111064a((String) pair3.second);
                }
            } else {
                m111064a(sQLiteDatabase.mo107197o());
            }
            throw th;
        }
        m111064a(sQLiteDatabase.mo107197o());
    }
}
