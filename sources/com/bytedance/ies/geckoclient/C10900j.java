package com.bytedance.ies.geckoclient;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.ies.geckoclient.model.C10957d;
import com.bytedance.ies.geckoclient.model.C10963j;
import com.bytedance.p616h.p617a.C10170a;
import com.bytedance.p616h.p617a.C10171b;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.bytedance.ies.geckoclient.j */
public final class C10900j {

    /* renamed from: a */
    private String f29255a;

    /* renamed from: b */
    private String f29256b;

    /* renamed from: c */
    private String f29257c;

    /* renamed from: d */
    private Context f29258d;

    /* renamed from: a */
    public final synchronized boolean mo19700a(String str, String str2) {
        SQLiteDatabase writableDatabase = C10171b.m20499a(this.f29258d).getWritableDatabase();
        StringBuilder sb = new StringBuilder("SELECT package_dir,zip FROM ");
        sb.append(this.f29255a);
        sb.append(" where channel");
        sb.append(" = \"");
        sb.append(str2);
        sb.append("\"");
        Cursor rawQuery = writableDatabase.rawQuery(sb.toString(), null);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                String string = rawQuery.getString(rawQuery.getColumnIndex("package_dir"));
                if (!TextUtils.isEmpty(string)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(string);
                    C10880d.m22055a(sb2.toString());
                }
                String string2 = rawQuery.getString(rawQuery.getColumnIndex("zip"));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(string2);
                C10880d.m22057b(sb3.toString());
            }
            rawQuery.close();
            try {
                StringBuilder sb4 = new StringBuilder("DELETE FROM ");
                sb4.append(this.f29255a);
                sb4.append(" where channel");
                sb4.append(" = \"");
                sb4.append(str2);
                sb4.append("\"");
                writableDatabase.execSQL(sb4.toString());
            } catch (Exception unused) {
                return false;
            }
        }
        m22135a(writableDatabase);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo19696a(C10957d dVar) {
        m22139c(dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized void mo19701b(C10957d dVar) {
        m22139c(dVar);
    }

    /* renamed from: a */
    private static void m22135a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            sQLiteDatabase.close();
            new StringBuilder("close db ").append(Thread.currentThread());
        }
    }

    /* renamed from: c */
    private void m22139c(C10957d dVar) {
        Cursor cursor;
        if (dVar != null) {
            SQLiteDatabase writableDatabase = C10171b.m20499a(this.f29258d).getWritableDatabase();
            Cursor cursor2 = null;
            try {
                writableDatabase.beginTransaction();
                SQLiteDatabase sQLiteDatabase = writableDatabase;
                cursor = sQLiteDatabase.query(this.f29255a, new String[0], "channel=?", new String[]{dVar.f29403c}, null, null, null);
                try {
                    if (cursor.getCount() == 0) {
                        m22138b(writableDatabase, dVar);
                    } else {
                        m22136a(writableDatabase, dVar);
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    writableDatabase.endTransaction();
                    C10170a.m20497a(cursor2);
                    throw th;
                }
            } catch (Exception unused2) {
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                writableDatabase.endTransaction();
                C10170a.m20497a(cursor2);
                throw th;
            }
            writableDatabase.endTransaction();
            C10170a.m20497a(cursor);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo19698a(Map<String, C10957d> map) {
        SQLiteDatabase sQLiteDatabase;
        File file;
        try {
            sQLiteDatabase = C10171b.m20499a(this.f29258d).getWritableDatabase();
        } catch (Exception unused) {
            sQLiteDatabase = null;
        }
        StringBuilder sb = new StringBuilder("SELECT * FROM ");
        sb.append(this.f29255a);
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(rawQuery.getColumnIndex("channel"));
                    C10957d dVar = (C10957d) map.get(string);
                    if (dVar != null) {
                        if (rawQuery.getInt(rawQuery.getColumnIndex("update_done")) == 0) {
                            String string2 = rawQuery.getString(rawQuery.getColumnIndex("update_zip"));
                            if (!TextUtils.isEmpty(string2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.f29257c);
                                sb2.append(string2);
                                C10880d.m22057b(sb2.toString());
                            }
                            String string3 = rawQuery.getString(rawQuery.getColumnIndex("update_zip_dir"));
                            if (!TextUtils.isEmpty(string3)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this.f29257c);
                                sb3.append(string3);
                                C10880d.m22055a(sb3.toString());
                            }
                            String string4 = rawQuery.getString(rawQuery.getColumnIndex("patch_zip"));
                            if (!TextUtils.isEmpty(string4)) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(this.f29257c);
                                sb4.append(string4);
                                C10880d.m22055a(sb4.toString());
                            }
                        }
                        String string5 = rawQuery.getString(rawQuery.getColumnIndex("zip"));
                        String string6 = rawQuery.getString(rawQuery.getColumnIndex("package_dir"));
                        int i = rawQuery.getInt(rawQuery.getColumnIndex("package_type"));
                        dVar.f29407g = i;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(this.f29257c);
                        sb5.append(string6);
                        File file2 = new File(sb5.toString());
                        if (i == 1) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(this.f29257c);
                            sb6.append(string);
                            sb6.append("/");
                            sb6.append(string5);
                            file = new File(sb6.toString());
                        } else {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(this.f29257c);
                            sb7.append(string5);
                            file = new File(sb7.toString());
                        }
                        int i2 = rawQuery.getInt(rawQuery.getColumnIndex("update_when_launch"));
                        if ((!file2.exists() || !file.exists()) && i2 == 0) {
                            if (!TextUtils.isEmpty(string5)) {
                                C10880d.m22056b(file);
                            }
                            if (!TextUtils.isEmpty(string6)) {
                                C10880d.m22054a(file2);
                            }
                            dVar.f29401a = 0;
                            dVar.f29402b = 0;
                        } else {
                            dVar.f29401a = rawQuery.getInt(rawQuery.getColumnIndex(C42311c.f106863g));
                            dVar.f29402b = i2;
                        }
                        dVar.f29405e = rawQuery.getString(rawQuery.getColumnIndex("zip"));
                        dVar.f29404d = rawQuery.getString(rawQuery.getColumnIndex("package_dir"));
                        dVar.f29406f = rawQuery.getString(rawQuery.getColumnIndex("patch_zip"));
                        dVar.f29408h = rawQuery.getString(rawQuery.getColumnIndex("extra"));
                        dVar.f29409i = true;
                        StringBuilder sb8 = new StringBuilder("update package from local:");
                        sb8.append(dVar.toString());
                        sb8.append(Thread.currentThread());
                    }
                }
                rawQuery.close();
            }
            m22135a(sQLiteDatabase);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    private void m22136a(SQLiteDatabase sQLiteDatabase, C10957d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("channel", dVar.f29403c);
        contentValues.put(C42311c.f106863g, Integer.valueOf(dVar.f29401a));
        contentValues.put("update_when_launch", Integer.valueOf(dVar.f29402b));
        contentValues.put("zip", dVar.f29405e);
        contentValues.put("package_dir", dVar.f29404d);
        contentValues.put("patch_zip", dVar.f29406f);
        contentValues.put("update_done", Integer.valueOf(1));
        contentValues.put("extra", dVar.f29408h);
        C10963j jVar = dVar.f29410j;
        if (jVar != null) {
            contentValues.put("package_type", Integer.valueOf(jVar.f29437c));
        }
        sQLiteDatabase.update(this.f29255a, contentValues, "channel=?", new String[]{dVar.f29403c});
        StringBuilder sb = new StringBuilder("update package to local:");
        sb.append(dVar.toString());
        sb.append(Thread.currentThread());
    }

    /* renamed from: b */
    private void m22138b(SQLiteDatabase sQLiteDatabase, C10957d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("channel", dVar.f29403c);
        contentValues.put(C42311c.f106863g, Integer.valueOf(dVar.f29401a));
        contentValues.put("update_when_launch", Integer.valueOf(dVar.f29402b));
        contentValues.put("zip", dVar.f29405e);
        contentValues.put("package_dir", dVar.f29404d);
        contentValues.put("patch_zip", dVar.f29406f);
        contentValues.put("update_done", Integer.valueOf(1));
        contentValues.put("extra", dVar.f29408h);
        C10963j jVar = dVar.f29410j;
        if (jVar != null) {
            contentValues.put("package_type", Integer.valueOf(jVar.f29437c));
        } else {
            contentValues.put("package_type", Integer.valueOf(-1));
        }
        new StringBuilder("insert to db:").append(dVar.f29403c);
        sQLiteDatabase.insert(this.f29255a, null, contentValues);
        contentValues.clear();
        StringBuilder sb = new StringBuilder("update package to local:");
        sb.append(dVar.toString());
        sb.append(Thread.currentThread());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo19695a(int r7, com.bytedance.ies.geckoclient.model.C10957d r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r8 == 0) goto L_0x00aa
            boolean r0 = r8.f29409i     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x00aa
            com.bytedance.ies.geckoclient.model.j r0 = r8.f29410j     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x000d
            goto L_0x00aa
        L_0x000d:
            com.bytedance.ies.geckoclient.model.j r0 = r8.f29410j     // Catch:{ all -> 0x00a7 }
            com.bytedance.ies.geckoclient.model.j$b r0 = r0.mo19774a()     // Catch:{ all -> 0x00a7 }
            com.bytedance.ies.geckoclient.model.j r1 = r8.f29410j     // Catch:{ all -> 0x00a7 }
            com.bytedance.ies.geckoclient.model.j$b r1 = r1.mo19775b()     // Catch:{ all -> 0x00a7 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x00a7 }
            r2.<init>()     // Catch:{ all -> 0x00a7 }
            r3 = 0
            switch(r7) {
                case 0: goto L_0x006c;
                case 1: goto L_0x0049;
                case 2: goto L_0x0037;
                case 3: goto L_0x0023;
                default: goto L_0x0022;
            }     // Catch:{ all -> 0x00a7 }
        L_0x0022:
            goto L_0x0075
        L_0x0023:
            com.bytedance.ies.geckoclient.model.j r7 = r8.f29410j     // Catch:{ all -> 0x00a7 }
            java.lang.String r7 = r7.f29438d     // Catch:{ all -> 0x00a7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00a7 }
            if (r7 != 0) goto L_0x0075
            java.lang.String r7 = "update_zip"
            com.bytedance.ies.geckoclient.model.j r0 = r8.f29410j     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r0.f29438d     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x0075
        L_0x0037:
            if (r0 == 0) goto L_0x0075
            java.lang.String r7 = r0.f29449f     // Catch:{ all -> 0x00a7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00a7 }
            if (r7 != 0) goto L_0x0075
            java.lang.String r7 = "update_zip_dir"
            java.lang.String r0 = r0.f29449f     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x0075
        L_0x0049:
            if (r0 == 0) goto L_0x005a
            java.lang.String r7 = r0.f29448e     // Catch:{ all -> 0x00a7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00a7 }
            if (r7 != 0) goto L_0x005a
            java.lang.String r7 = "update_zip"
            java.lang.String r0 = r0.f29448e     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
        L_0x005a:
            if (r1 == 0) goto L_0x0075
            java.lang.String r7 = r1.f29448e     // Catch:{ all -> 0x00a7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00a7 }
            if (r7 != 0) goto L_0x0075
            java.lang.String r7 = "patch_zip"
            java.lang.String r0 = r1.f29448e     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x0075
        L_0x006c:
            java.lang.String r7 = "update_done"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
        L_0x0075:
            android.content.Context r7 = r6.f29258d     // Catch:{ all -> 0x00a7 }
            com.bytedance.h.a.b r7 = com.bytedance.p616h.p617a.C10171b.m20499a(r7)     // Catch:{ all -> 0x00a7 }
            android.database.sqlite.SQLiteDatabase r7 = r7.getWritableDatabase()     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r6.f29255a     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = "channel=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = r8.f29403c     // Catch:{ all -> 0x00a7 }
            r4[r3] = r5     // Catch:{ all -> 0x00a7 }
            r7.update(r0, r2, r1, r4)     // Catch:{ all -> 0x00a7 }
            m22135a(r7)     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "update status to local:"
            r7.<init>(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00a7 }
            r7.append(r8)     // Catch:{ all -> 0x00a7 }
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00a7 }
            r7.append(r8)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r6)
            return
        L_0x00a7:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x00aa:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.C10900j.mo19695a(int, com.bytedance.ies.geckoclient.model.d):void");
    }

    /* renamed from: a */
    public static void m22137a(C10957d dVar, String str, String str2) {
        if (dVar.f29402b == 1) {
            String a = C10880d.m22053a(str, dVar.f29403c);
            String a2 = C10880d.m22053a(str2, dVar.f29403c);
            C10880d.m22055a(a2);
            if (C10880d.m22058b(a, a2)) {
                C10880d.m22055a(a);
                dVar.f29402b = 0;
            }
        }
    }

    /* renamed from: a */
    public final void mo19697a(Iterable<C10957d> iterable, String str, String str2) {
        boolean z;
        if (iterable != null) {
            ArrayList<C10957d> arrayList = new ArrayList<>();
            for (C10957d dVar : iterable) {
                if (dVar.f29402b == 1) {
                    arrayList.add(dVar);
                }
            }
            if (!arrayList.isEmpty()) {
                for (C10957d dVar2 : arrayList) {
                    dVar2.f29402b = 0;
                    try {
                        String a = C10880d.m22053a(str, dVar2.f29403c);
                        String a2 = C10880d.m22053a(str2, dVar2.f29403c);
                        File file = new File(a);
                        File file2 = new File(a2);
                        C10880d.m22054a(file2);
                        if (file.renameTo(file2)) {
                            z = true;
                        } else {
                            z = C10880d.m22058b(file.getAbsolutePath(), file2.getAbsolutePath());
                            if (z) {
                                C10880d.m22054a(file);
                            }
                        }
                        if (!z) {
                            dVar2.f29401a = 0;
                        }
                    } catch (Exception unused) {
                        dVar2.f29401a = 0;
                    }
                }
                SQLiteDatabase writableDatabase = C10171b.m20499a(this.f29258d).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (C10957d dVar3 : arrayList) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("update_when_launch", Integer.valueOf(dVar3.f29402b));
                        contentValues.put(C42311c.f106863g, Integer.valueOf(dVar3.f29401a));
                        writableDatabase.update(this.f29255a, contentValues, "channel=?", new String[]{dVar3.f29403c});
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (Exception unused2) {
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    C10170a.m20498a(writableDatabase);
                    throw th;
                }
                writableDatabase.endTransaction();
                C10170a.m20498a(writableDatabase);
            }
        }
    }

    /* renamed from: a */
    public final void mo19699a(Map<String, C10957d> map, String str, String str2) {
        ArrayList<C10957d> arrayList = new ArrayList<>();
        if (map.size() > 0) {
            arrayList.addAll(map.values());
        }
        if (arrayList.size() > 0) {
            for (C10957d dVar : arrayList) {
                m22137a(dVar, str, str2);
                if (dVar.f29409i) {
                    mo19701b(dVar);
                } else {
                    mo19696a(dVar);
                }
            }
        }
    }

    C10900j(Context context, String str, String str2, String str3) {
        this.f29255a = str;
        this.f29256b = str2;
        this.f29257c = str3;
        this.f29258d = context;
    }
}
