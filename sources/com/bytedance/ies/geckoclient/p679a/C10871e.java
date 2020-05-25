package com.bytedance.ies.geckoclient.p679a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.ies.geckoclient.C10880d;
import com.bytedance.p616h.p617a.C10170a;
import com.bytedance.p616h.p617a.C10171b;
import java.io.File;

/* renamed from: com.bytedance.ies.geckoclient.a.e */
final class C10871e extends C10868b {
    C10871e() {
    }

    /* renamed from: a */
    public final void mo19642a(String str) {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        Cursor rawQuery;
        Cursor cursor = null;
        try {
            sQLiteDatabase = C10171b.m20499a(this.f29181h).getWritableDatabase();
            try {
                StringBuilder sb = new StringBuilder("SELECT * FROM ");
                sb.append(this.f29178e);
                rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
            } catch (Exception unused) {
                C10170a.m20497a(cursor);
                C10170a.m20498a(sQLiteDatabase);
            } catch (Throwable th2) {
                th = th2;
                C10170a.m20497a(cursor);
                C10170a.m20498a(sQLiteDatabase);
                throw th;
            }
            try {
                int count = rawQuery.getCount() - this.f29177d.f29168a;
                while (true) {
                    int i = count - 1;
                    if (count <= 0) {
                        break;
                    }
                    if (rawQuery.moveToNext() && m22039a(rawQuery)) {
                        m22038a(sQLiteDatabase, rawQuery);
                    }
                    count = i;
                }
                C10170a.m20497a(rawQuery);
            } catch (Exception unused2) {
                cursor = rawQuery;
                C10170a.m20497a(cursor);
                C10170a.m20498a(sQLiteDatabase);
            } catch (Throwable th3) {
                Cursor cursor2 = rawQuery;
                th = th3;
                cursor = cursor2;
                C10170a.m20497a(cursor);
                C10170a.m20498a(sQLiteDatabase);
                throw th;
            }
        } catch (Exception unused3) {
            sQLiteDatabase = null;
            C10170a.m20497a(cursor);
            C10170a.m20498a(sQLiteDatabase);
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase = null;
            C10170a.m20497a(cursor);
            C10170a.m20498a(sQLiteDatabase);
            throw th;
        }
        C10170a.m20498a(sQLiteDatabase);
    }

    /* renamed from: a */
    private boolean m22039a(Cursor cursor) {
        try {
            String string = cursor.getString(cursor.getColumnIndex("update_zip"));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f29180g);
            sb.append(string);
            boolean b = C10880d.m22057b(sb.toString()) | false;
            String string2 = cursor.getString(cursor.getColumnIndex("update_zip_dir"));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29180g);
            sb2.append(string2);
            boolean a = b | C10880d.m22055a(sb2.toString());
            String string3 = cursor.getString(cursor.getColumnIndex("patch_zip"));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f29180g);
            sb3.append(string3);
            boolean a2 = a | C10880d.m22055a(sb3.toString());
            String string4 = cursor.getString(cursor.getColumnIndex("zip"));
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f29180g);
            sb4.append(string4);
            boolean b2 = a2 | C10880d.m22056b(new File(sb4.toString()));
            String string5 = cursor.getString(cursor.getColumnIndex("package_dir"));
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f29180g);
            sb5.append(string5);
            return C10880d.m22055a(sb5.toString()) | b2;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private void m22038a(SQLiteDatabase sQLiteDatabase, Cursor cursor) {
        try {
            String string = cursor.getString(cursor.getColumnIndex("channel"));
            StringBuilder sb = new StringBuilder("DELETE FROM ");
            sb.append(this.f29178e);
            sb.append(" where channel");
            sb.append(" = \"");
            sb.append(string);
            sb.append("\"");
            sQLiteDatabase.execSQL(sb.toString());
            if (this.f29177d.f29170c != null) {
                this.f29177d.f29170c.mo19643a(string);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo19641a(Context context, C10865a aVar, String str, String str2, String str3) {
        super.mo19641a(context, aVar, str, str2, str3);
    }
}
