package com.p683ss.android.download;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.download.p1161b.C19096c.C19097a;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.download.g */
public final class C19117g {

    /* renamed from: c */
    private static final UriMatcher f52678c;

    /* renamed from: d */
    private static final Uri[] f52679d = {C19097a.f52584a};

    /* renamed from: e */
    private static final HashMap<String, String> f52680e;

    /* renamed from: g */
    private static final Object f52681g = new Object();

    /* renamed from: h */
    private static C19117g f52682h;

    /* renamed from: a */
    protected C19138v f52683a;

    /* renamed from: b */
    protected final Context f52684b;

    /* renamed from: f */
    private SQLiteOpenHelper f52685f;

    /* renamed from: com.ss.android.download.g$a */
    final class C19119a extends SQLiteOpenHelper {
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            onUpgrade(sQLiteDatabase, 0, 100);
        }

        /* renamed from: a */
        private static void m46598a(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ss_downloads");
                sQLiteDatabase.execSQL("CREATE TABLE ss_downloads(_id INTEGER PRIMARY KEY AUTOINCREMENT,uri TEXT, entity TEXT, no_integrity BOOLEAN, hint TEXT, _data TEXT, mimetype TEXT, destination INTEGER, visibility INTEGER, control INTEGER, status INTEGER, numfailed INTEGER, lastmod BIGINT, notificationpackage TEXT, notificationextras TEXT, cookiedata TEXT, useragent TEXT, referer TEXT, total_bytes INTEGER, current_bytes INTEGER, title TEXT, description TEXT, allow_roaming INTEGER NOT NULL DEFAULT 0, allowed_network_types INTEGER NOT NULL DEFAULT 0, is_visible_in_downloads_ui INTEGER NOT NULL DEFAULT 1, bypass_recommended_size_limit INTEGER NOT NULL DEFAULT 0, mediaprovider_uri TEXT, deleted BOOLEAN NOT NULL DEFAULT 0, errorMsg TEXT, allow_write BOOLEAN NOT NULL DEFAULT 0, etag TEXT, scanned INTEGER, method INTEGER);");
            } catch (SQLException e) {
                throw e;
            }
        }

        public C19119a(Context context) {
            super(context, "ss_downloads.db", null, 100);
        }

        /* renamed from: a */
        private static void m46599a(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
            String str = (String) ((Entry) contentValues.valueSet().iterator().next()).getKey();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is null");
            sQLiteDatabase.update("ss_downloads", contentValues, sb.toString(), null);
            contentValues.clear();
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            int i3 = 99;
            if (i >= 100 && i <= i2) {
                i3 = i;
            }
            while (true) {
                i3++;
                if (i3 > i2) {
                    return;
                }
                if (i3 == 100) {
                    try {
                        m46598a(sQLiteDatabase);
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS request_headers");
                        sQLiteDatabase.execSQL("CREATE TABLE request_headers(id INTEGER PRIMARY KEY AUTOINCREMENT,download_id INTEGER NOT NULL,header TEXT NOT NULL,value TEXT NOT NULL);");
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("is_visible_in_downloads_ui", Boolean.valueOf(false));
                        sQLiteDatabase.update("ss_downloads", contentValues, "destination != 0", null);
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("current_bytes", Integer.valueOf(0));
                        m46599a(sQLiteDatabase, contentValues2);
                        contentValues2.put("total_bytes", Integer.valueOf(-1));
                        m46599a(sQLiteDatabase, contentValues2);
                        contentValues2.put("title", "");
                        m46599a(sQLiteDatabase, contentValues2);
                        contentValues2.put("description", "");
                        m46599a(sQLiteDatabase, contentValues2);
                    } catch (Throwable unused) {
                        return;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Don't know how to upgrade to ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    /* renamed from: com.ss.android.download.g$b */
    static class C19120b {

        /* renamed from: a */
        public StringBuilder f52687a;

        /* renamed from: b */
        public List<String> f52688b;

        /* renamed from: a */
        public final String mo39057a() {
            return this.f52687a.toString();
        }

        private C19120b() {
            this.f52687a = new StringBuilder();
            this.f52688b = new ArrayList();
        }

        /* renamed from: b */
        public final String[] mo39059b() {
            return (String[]) this.f52688b.toArray(new String[this.f52688b.size()]);
        }

        /* renamed from: a */
        public final <T> void mo39058a(String str, T... tArr) {
            if (str != null && !TextUtils.isEmpty(str)) {
                if (this.f52687a.length() != 0) {
                    this.f52687a.append(" AND ");
                }
                this.f52687a.append("(");
                this.f52687a.append(str);
                this.f52687a.append(")");
                if (tArr != null) {
                    for (T obj : tArr) {
                        this.f52688b.add(obj.toString());
                    }
                }
            }
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f52678c = uriMatcher;
        uriMatcher.addURI("com.ss.android.newmedia.downloads", "all_downloads", 1);
        f52678c.addURI("com.ss.android.newmedia.downloads", "all_downloads/#", 2);
        f52678c.addURI("com.ss.android.newmedia.downloads", "all_downloads/#/headers", 3);
        f52678c.addURI("com.ss.android.newmedia.downloads", "download/#/headers", 3);
        HashMap<String, String> hashMap = new HashMap<>();
        f52680e = hashMap;
        hashMap.put("_display_name", "title AS _display_name");
        f52680e.put("_size", "total_bytes AS _size");
    }

    /* renamed from: a */
    private static String m46592a(Uri uri) {
        return (String) uri.getPathSegments().get(1);
    }

    private C19117g(Context context) {
        this.f52684b = context;
        if (this.f52683a == null) {
            this.f52683a = C19133r.m46640a(context);
        }
        this.f52685f = new C19119a(context);
        try {
            C19121h.m46603a(context, new Intent(context, DownloadService.class));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C19117g m46591a(Context context) {
        synchronized (f52681g) {
            if (f52682h == null) {
                f52682h = new C19117g(context.getApplicationContext());
            }
        }
        return f52682h;
    }

    /* renamed from: a */
    private void m46593a(Uri uri, int i) {
        Long l;
        Uri[] uriArr;
        if (i == 2) {
            l = Long.valueOf(Long.parseLong(m46592a(uri)));
        } else {
            l = null;
        }
        for (Uri uri2 : f52679d) {
            if (l != null) {
                uri2 = ContentUris.withAppendedId(uri2, l.longValue());
            }
            this.f52684b.getContentResolver().notifyChange(uri2, null);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|(2:21|22)|23|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0073 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo39053a(android.net.Uri r13, java.lang.String r14, java.lang.String[] r15) {
        /*
            r12 = this;
            r14 = 0
            android.database.sqlite.SQLiteOpenHelper r15 = r12.f52685f     // Catch:{ Exception -> 0x0086 }
            android.database.sqlite.SQLiteDatabase r15 = r15.getWritableDatabase()     // Catch:{ Exception -> 0x0086 }
            android.content.UriMatcher r0 = f52678c     // Catch:{ Exception -> 0x0086 }
            int r9 = r0.match(r13)     // Catch:{ Exception -> 0x0086 }
            switch(r9) {
                case 1: goto L_0x0013;
                case 2: goto L_0x0013;
                default: goto L_0x0010;
            }     // Catch:{ Exception -> 0x0086 }
        L_0x0010:
            java.lang.UnsupportedOperationException r15 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0086 }
            goto L_0x0074
        L_0x0013:
            r10 = 0
            com.ss.android.download.g$b r11 = r12.m46590a(r13, r10, r10, r9)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r3 = r11.mo39057a()     // Catch:{ Exception -> 0x0086 }
            java.lang.String[] r4 = r11.mo39059b()     // Catch:{ Exception -> 0x0086 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0086 }
            java.lang.String r0 = "_id"
            r2[r14] = r0     // Catch:{ Exception -> 0x0086 }
            java.lang.String r1 = "ss_downloads"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r15
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0086 }
            r0.moveToFirst()     // Catch:{ all -> 0x006d }
        L_0x0035:
            boolean r1 = r0.isAfterLast()     // Catch:{ all -> 0x006d }
            if (r1 != 0) goto L_0x0056
            long r1 = r0.getLong(r14)     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            java.lang.String r4 = "download_id="
            r3.<init>(r4)     // Catch:{ all -> 0x006d }
            r3.append(r1)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "request_headers"
            r15.delete(r2, r1, r10)     // Catch:{ all -> 0x006d }
            r0.moveToNext()     // Catch:{ all -> 0x006d }
            goto L_0x0035
        L_0x0056:
            if (r0 == 0) goto L_0x005b
            r0.close()     // Catch:{ Exception -> 0x005b }
        L_0x005b:
            java.lang.String r0 = "ss_downloads"
            java.lang.String r1 = r11.mo39057a()     // Catch:{ Exception -> 0x0086 }
            java.lang.String[] r2 = r11.mo39059b()     // Catch:{ Exception -> 0x0086 }
            int r15 = r15.delete(r0, r1, r2)     // Catch:{ Exception -> 0x0086 }
            r12.m46593a(r13, r9)     // Catch:{ Exception -> 0x0086 }
            return r15
        L_0x006d:
            r13 = move-exception
            if (r0 == 0) goto L_0x0073
            r0.close()     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            throw r13     // Catch:{ Exception -> 0x0086 }
        L_0x0074:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0086 }
            java.lang.String r1 = "Cannot delete URI: "
            r0.<init>(r1)     // Catch:{ Exception -> 0x0086 }
            r0.append(r13)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r13 = r0.toString()     // Catch:{ Exception -> 0x0086 }
            r15.<init>(r13)     // Catch:{ Exception -> 0x0086 }
            throw r15     // Catch:{ Exception -> 0x0086 }
        L_0x0086:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19117g.mo39053a(android.net.Uri, java.lang.String, java.lang.String[]):int");
    }

    /* renamed from: a */
    private C19120b m46590a(Uri uri, String str, String[] strArr, int i) {
        C19120b bVar = new C19120b();
        bVar.mo39058a(str, strArr);
        if (i == 2) {
            bVar.mo39058a("_id = ?", m46592a(uri));
        }
        return bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:22|(0)|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x006c */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069 A[SYNTHETIC, Splitter:B:28:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f A[SYNTHETIC, Splitter:B:34:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007a A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009d A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00aa A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ad A[Catch:{ Exception -> 0x00ef }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo39052a(android.net.Uri r16, android.content.ContentValues r17, java.lang.String r18, java.lang.String[] r19) {
        /*
            r15 = this;
            r7 = r15
            r0 = r16
            r8 = r17
            r9 = 0
            android.database.sqlite.SQLiteOpenHelper r1 = r7.f52685f     // Catch:{ Exception -> 0x00ef }
            android.database.sqlite.SQLiteDatabase r10 = r1.getWritableDatabase()     // Catch:{ Exception -> 0x00ef }
            java.lang.String r1 = "deleted"
            boolean r1 = r8.containsKey(r1)     // Catch:{ Exception -> 0x00ef }
            r11 = 1
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = "deleted"
            java.lang.Integer r1 = r8.getAsInteger(r1)     // Catch:{ Exception -> 0x00ef }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x00ef }
            if (r1 != r11) goto L_0x0023
            r12 = 1
            goto L_0x0024
        L_0x0023:
            r12 = 0
        L_0x0024:
            java.lang.String r1 = "_data"
            java.lang.String r13 = r8.getAsString(r1)     // Catch:{ Exception -> 0x00ef }
            if (r13 == 0) goto L_0x0072
            r14 = 0
            java.lang.String[] r3 = new java.lang.String[r11]     // Catch:{ Exception -> 0x006d, all -> 0x0065 }
            java.lang.String r1 = "title"
            r3[r9] = r1     // Catch:{ Exception -> 0x006d, all -> 0x0065 }
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r15
            r2 = r16
            android.database.Cursor r1 = r1.mo39054a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x006d, all -> 0x0065 }
            boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = r1.getString(r9)     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            if (r2 == 0) goto L_0x005b
        L_0x004d:
            java.lang.String r2 = "title"
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            r3.<init>(r13)     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            r8.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
        L_0x005b:
            if (r1 == 0) goto L_0x0072
            r1.close()     // Catch:{ Exception -> 0x0072 }
            goto L_0x0072
        L_0x0061:
            r0 = move-exception
            goto L_0x0067
        L_0x0063:
            r14 = r1
            goto L_0x006d
        L_0x0065:
            r0 = move-exception
            r1 = r14
        L_0x0067:
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            throw r0     // Catch:{ Exception -> 0x00ef }
        L_0x006d:
            if (r14 == 0) goto L_0x0072
            r14.close()     // Catch:{ Exception -> 0x0072 }
        L_0x0072:
            java.lang.String r1 = "status"
            java.lang.Integer r1 = r8.getAsInteger(r1)     // Catch:{ Exception -> 0x00ef }
            if (r1 == 0) goto L_0x0094
            int r2 = r1.intValue()     // Catch:{ Exception -> 0x00ef }
            r3 = 190(0xbe, float:2.66E-43)
            if (r2 == r3) goto L_0x0092
            int r2 = r1.intValue()     // Catch:{ Exception -> 0x00ef }
            r3 = 201(0xc9, float:2.82E-43)
            if (r2 == r3) goto L_0x0092
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x00ef }
            r2 = 193(0xc1, float:2.7E-43)
            if (r1 != r2) goto L_0x0094
        L_0x0092:
            r1 = 1
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            java.lang.String r2 = "bypass_recommended_size_limit"
            boolean r2 = r8.containsKey(r2)     // Catch:{ Exception -> 0x00ef }
            if (r1 != 0) goto L_0x00a1
            if (r2 == 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r11 = r12
        L_0x00a1:
            android.content.UriMatcher r1 = f52678c     // Catch:{ Exception -> 0x00ef }
            int r1 = r1.match(r0)     // Catch:{ Exception -> 0x00ef }
            switch(r1) {
                case 1: goto L_0x00ad;
                case 2: goto L_0x00ad;
                default: goto L_0x00aa;
            }     // Catch:{ Exception -> 0x00ef }
        L_0x00aa:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x00ef }
            goto L_0x00dd
        L_0x00ad:
            r2 = r18
            r3 = r19
            com.ss.android.download.g$b r2 = r15.m46590a(r0, r2, r3, r1)     // Catch:{ Exception -> 0x00ef }
            int r3 = r17.size()     // Catch:{ Exception -> 0x00ef }
            if (r3 <= 0) goto L_0x00ca
            java.lang.String r3 = "ss_downloads"
            java.lang.String r4 = r2.mo39057a()     // Catch:{ Exception -> 0x00ef }
            java.lang.String[] r2 = r2.mo39059b()     // Catch:{ Exception -> 0x00ef }
            int r2 = r10.update(r3, r8, r4, r2)     // Catch:{ Exception -> 0x00ef }
            goto L_0x00cb
        L_0x00ca:
            r2 = 0
        L_0x00cb:
            r15.m46593a(r0, r1)     // Catch:{ Exception -> 0x00ef }
            if (r11 == 0) goto L_0x00dc
            android.content.Context r0 = r7.f52684b     // Catch:{ Exception -> 0x00ef }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x00dc }
            java.lang.Class<com.ss.android.download.DownloadService> r3 = com.p683ss.android.download.DownloadService.class
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x00dc }
            com.p683ss.android.download.C19121h.m46603a(r0, r1)     // Catch:{ Exception -> 0x00dc }
        L_0x00dc:
            return r2
        L_0x00dd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ef }
            java.lang.String r3 = "Cannot update URI: "
            r2.<init>(r3)     // Catch:{ Exception -> 0x00ef }
            r2.append(r0)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00ef }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00ef }
            throw r1     // Catch:{ Exception -> 0x00ef }
        L_0x00ef:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19117g.mo39052a(android.net.Uri, android.content.ContentValues, java.lang.String, java.lang.String[]):int");
    }

    /* renamed from: a */
    private static void m46594a(String[] strArr, String str, String[] strArr2, String str2, SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("starting query, database is ");
        if (sQLiteDatabase != null) {
            sb.append("not ");
        }
        sb.append("null; ");
        if (strArr == null) {
            sb.append("projection is null; ");
        } else if (strArr.length == 0) {
            sb.append("projection is empty; ");
        } else {
            for (int i = 0; i < strArr.length; i++) {
                sb.append("projection[");
                sb.append(i);
                sb.append("] is ");
                sb.append(strArr[i]);
                sb.append("; ");
            }
        }
        sb.append("selection is ");
        sb.append(str);
        sb.append("; ");
        if (strArr2 == null) {
            sb.append("selectionArgs is null; ");
        } else if (strArr2.length == 0) {
            sb.append("selectionArgs is empty; ");
        } else {
            for (int i2 = 0; i2 < strArr2.length; i2++) {
                sb.append("selectionArgs[");
                sb.append(i2);
                sb.append("] is ");
                sb.append(strArr2[i2]);
                sb.append("; ");
            }
        }
        sb.append("sort is ");
        sb.append(str2);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
    }

    /* renamed from: a */
    public final Cursor mo39054a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            SQLiteDatabase readableDatabase = this.f52685f.getReadableDatabase();
            int match = f52678c.match(uri);
            if (match == -1) {
                StringBuilder sb = new StringBuilder("Unknown URI: ");
                sb.append(uri);
                throw new IllegalArgumentException(sb.toString());
            } else if (match != 3) {
                C19120b a = m46590a(uri, str, strArr2, match);
                if (C19080a.f52538d) {
                    m46594a(strArr, str, strArr2, str2, readableDatabase);
                }
                Cursor query = readableDatabase.query("ss_downloads", strArr, a.mo39057a(), a.mo39059b(), null, null, str2);
                if (query != null) {
                    query.setNotificationUri(this.f52684b.getContentResolver(), uri);
                }
                return query;
            } else if (strArr == null && str == null && str2 == null) {
                StringBuilder sb2 = new StringBuilder("download_id=");
                sb2.append(m46592a(uri));
                return readableDatabase.query("request_headers", new String[]{"header", "value"}, sb2.toString(), null, null, null, null);
            } else {
                throw new UnsupportedOperationException("Request header queries do not support projections, selections or sorting");
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
