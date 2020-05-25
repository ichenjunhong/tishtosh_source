package com.bytedance.ies.p688h.p690b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.bytedance.ies.p688h.C10968a;
import com.bytedance.ies.p688h.p691c.C10983a;
import com.bytedance.ies.p688h.p691c.C10983a.C10984a;
import com.bytedance.ies.p688h.p691c.C10983a.C10985b;
import com.bytedance.p616h.p617a.C10170a;
import com.bytedance.p616h.p617a.C10171b;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import leakcanary.internal.LeakCanaryFileProvider;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53524e;
import okhttp3.C53526f;
import okhttp3.C53678w;
import okhttp3.C53682y.C53684a;

/* renamed from: com.bytedance.ies.h.b.a */
public class C10980a extends SQLiteOpenHelper {

    /* renamed from: b */
    private static volatile C10980a f29488b;

    /* renamed from: a */
    public Context f29489a;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0163 A[SYNTHETIC, Splitter:B:37:0x0163] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016d A[SYNTHETIC, Splitter:B:46:0x016d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19795a() {
        /*
            r12 = this;
            android.database.sqlite.SQLiteDatabase r8 = r12.getWritableDatabase()
            r8.beginTransaction()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r10 = r0.toString()
            r11 = 0
            java.lang.String r1 = "weboffline_statistic"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x016a, all -> 0x015f }
            int r1 = r0.getCount()     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r2 = 20
            if (r1 >= r2) goto L_0x0033
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            r8.endTransaction()
            return
        L_0x0033:
            r1 = r11
            r3 = r1
        L_0x0035:
            boolean r4 = r0.moveToNext()     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            if (r4 == 0) goto L_0x0123
            com.bytedance.ies.h.c.a$b r1 = new com.bytedance.ies.h.c.a$b     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.<init>()     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r3 = "app_version"
            int r3 = r0.getColumnIndex(r3)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r3 = r0.getString(r3)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r4 = "device_id"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "resource_url"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29500a = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "access_key"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29501b = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "access_key"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29501b = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "channel"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29502c = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "mime_type"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29503d = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "offline_status"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            int r5 = r0.getInt(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29504e = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "offline_duration"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            long r5 = r0.getLong(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29505f = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "ac"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29506g = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "offline_rule"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29507h = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "err_code"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29508i = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "err_msg"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29509j = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "online_duration"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            long r5 = r0.getLong(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29511l = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "res_root_dir"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29512m = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29513n = r10     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "page_url"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29515p = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.String r5 = "pkg_version"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            long r5 = r0.getLong(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29510k = r5     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1.f29514o = r11     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r9.add(r1)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r1 = r3
            r3 = r4
            goto L_0x0035
        L_0x0123:
            java.lang.String r4 = "weboffline_statistic"
            r8.delete(r4, r11, r11)     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            r8.setTransactionSuccessful()     // Catch:{ Exception -> 0x016b, all -> 0x015d }
            if (r0 == 0) goto L_0x0130
            r0.close()     // Catch:{ Exception -> 0x0130 }
        L_0x0130:
            r8.endTransaction()
            int r0 = r9.size()
            int r0 = r0 / r2
            int r0 = r0 + 1
            r2 = 0
        L_0x013b:
            if (r2 >= r0) goto L_0x015c
            int r4 = r2 * 20
            int r5 = r9.size()
            if (r4 < r5) goto L_0x0146
            return
        L_0x0146:
            int r5 = r4 + 20
            int r6 = r9.size()
            if (r5 <= r6) goto L_0x0152
            int r5 = r9.size()
        L_0x0152:
            java.util.List r4 = r9.subList(r4, r5)
            r12.m22246a(r1, r3, r4)
            int r2 = r2 + 1
            goto L_0x013b
        L_0x015c:
            return
        L_0x015d:
            r1 = move-exception
            goto L_0x0161
        L_0x015f:
            r1 = move-exception
            r0 = r11
        L_0x0161:
            if (r0 == 0) goto L_0x0166
            r0.close()     // Catch:{ Exception -> 0x0166 }
        L_0x0166:
            r8.endTransaction()
            throw r1
        L_0x016a:
            r0 = r11
        L_0x016b:
            if (r0 == 0) goto L_0x0170
            r0.close()     // Catch:{ Exception -> 0x0170 }
        L_0x0170:
            r8.endTransaction()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p688h.p690b.C10980a.mo19795a():void");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists weboffline_statistic (id integer primary key autoincrement,time integer,app_version text,sdk_version text,device_id text,device_model text,region text,resource_url text,access_key text,channel text,mime_type text,offline_status integer,offline_duration integer,ac text,offline_rule text,err_code text,err_msg text,pkg_version integer,online_duration integer,res_root_dir text,log_id text,page_url text)");
    }

    /* renamed from: a */
    public static C10980a m22245a(Context context) {
        if (f29488b == null) {
            synchronized (C10980a.class) {
                if (f29488b == null) {
                    f29488b = new C10980a(context.getApplicationContext(), "web_offline_statistic.db", null, 1);
                }
            }
        }
        return f29488b;
    }

    /* renamed from: a */
    public Long mo19794a(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3 = null;
        try {
            SQLiteDatabase writableDatabase = C10171b.m20499a(this.f29489a).getWritableDatabase();
            StringBuilder sb = new StringBuilder("SELECT name FROM sqlite_master WHERE type='table' AND name LIKE '%");
            sb.append(str);
            sb.append("'");
            cursor2 = writableDatabase.rawQuery(sb.toString(), null);
            if (cursor2 != null) {
                try {
                    if (cursor2.moveToNext()) {
                        cursor = writableDatabase.query(cursor2.getString(cursor2.getColumnIndex(LeakCanaryFileProvider.f132049i)), new String[]{C42311c.f106863g}, "channel=?", new String[]{str2}, null, null, null);
                        if (cursor != null) {
                            try {
                                if (cursor.moveToNext()) {
                                    Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex(C42311c.f106863g)));
                                    C10170a.m20497a(cursor2);
                                    C10170a.m20497a(cursor);
                                    return valueOf;
                                }
                            } catch (Exception unused) {
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                cursor3 = cursor2;
                                th = th2;
                                C10170a.m20497a(cursor3);
                                C10170a.m20497a(cursor);
                                throw th;
                            }
                        }
                        C10170a.m20497a(cursor2);
                        C10170a.m20497a(cursor);
                        return null;
                    }
                } catch (Exception unused2) {
                } catch (Throwable th3) {
                    cursor3 = cursor2;
                    th = th3;
                    cursor = null;
                    C10170a.m20497a(cursor3);
                    C10170a.m20497a(cursor);
                    throw th;
                }
            }
            cursor = null;
        } catch (Exception unused3) {
            cursor2 = null;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
            C10170a.m20497a(cursor3);
            C10170a.m20497a(cursor);
            throw th;
        }
        C10170a.m20497a(cursor2);
        C10170a.m20497a(cursor);
        return null;
    }

    /* renamed from: a */
    private void m22246a(String str, String str2, List<C10985b> list) {
        String str3;
        try {
            if (TextUtils.isEmpty(C10968a.f29454d)) {
                str3 = "gecko.snssdk.com";
            } else {
                str3 = C10968a.f29454d;
            }
            StringBuilder sb = new StringBuilder("https://");
            sb.append(str3);
            sb.append("/gecko/server/falcon/stats");
            String sb2 = sb.toString();
            C10983a aVar = new C10983a();
            aVar.f29493b = list;
            aVar.f29492a = new C10984a();
            aVar.f29492a.f29494a = str;
            aVar.f29492a.f29496c = str2;
            String uuid = UUID.randomUUID().toString();
            for (C10985b bVar : list) {
                bVar.f29513n = uuid;
            }
            new C53684a().mo111667a().mo111325a(new C53499a().mo111262a(sb2).mo111265a(C53500ac.create(C53678w.m114225a("application/json; charset=utf-8"), new C17971f().mo34889b(aVar))).mo111272c()).mo111246a(new C53526f() {
                public final void onFailure(C53524e eVar, IOException iOException) {
                }

                public final void onResponse(C53524e eVar, C53504ad adVar) throws IOException {
                }
            });
        } catch (Exception unused) {
        }
    }

    private C10980a(Context context, String str, CursorFactory cursorFactory, int i) {
        super(context, str, null, 1);
        this.f29489a = context;
    }
}
