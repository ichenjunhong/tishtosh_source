package com.toutiao.proxyserver.p2610b;

import android.content.Context;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.toutiao.proxyserver.b.c */
public class C51809c {

    /* renamed from: e */
    private static volatile C51809c f129277e;

    /* renamed from: a */
    public final SparseArray<Map<String, C51807a>> f129278a = new SparseArray<>(2);

    /* renamed from: b */
    public final C51812d f129279b;

    /* renamed from: c */
    public final Executor f129280c;

    /* renamed from: d */
    public volatile SQLiteStatement f129281d;

    /* renamed from: a */
    public static C51809c m111118a(Context context) {
        if (f129277e == null) {
            synchronized (C51809c.class) {
                if (f129277e == null) {
                    f129277e = new C51809c(context);
                }
            }
        }
        return f129277e;
    }

    /* renamed from: b */
    public final void mo107301b(final int i) {
        Map map = (Map) this.f129278a.get(i);
        if (map != null) {
            map.clear();
        }
        this.f129280c.execute(new Runnable() {
            public final void run() {
                try {
                    C51809c.this.f129279b.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(i)});
                } catch (Throwable unused) {
                }
            }
        });
    }

    private C51809c(Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingDeque());
        this.f129280c = threadPoolExecutor;
        this.f129279b = new C51812d(context.getApplicationContext());
        this.f129278a.put(0, new ConcurrentHashMap());
        this.f129278a.put(1, new ConcurrentHashMap());
    }

    /* renamed from: a */
    public static String m111119a(int i) {
        if (i <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i << 1);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.toutiao.proxyserver.p2610b.C51807a mo107300a(java.lang.String r14, int r15) {
        /*
            r13 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.util.SparseArray<java.util.Map<java.lang.String, com.toutiao.proxyserver.b.a>> r0 = r13.f129278a
            java.lang.Object r0 = r0.get(r15)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0014
            r2 = r1
            goto L_0x001a
        L_0x0014:
            java.lang.Object r2 = r0.get(r14)
            com.toutiao.proxyserver.b.a r2 = (com.toutiao.proxyserver.p2610b.C51807a) r2
        L_0x001a:
            if (r2 == 0) goto L_0x001d
            return r2
        L_0x001d:
            com.toutiao.proxyserver.b.d r3 = r13.f129279b     // Catch:{ Throwable -> 0x0093, all -> 0x008b }
            android.database.sqlite.SQLiteDatabase r4 = r3.getReadableDatabase()     // Catch:{ Throwable -> 0x0093, all -> 0x008b }
            java.lang.String r5 = "video_http_header_t"
            r6 = 0
            java.lang.String r7 = "key=? AND flag=?"
            r3 = 2
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x0093, all -> 0x008b }
            r3 = 0
            r8[r3] = r14     // Catch:{ Throwable -> 0x0093, all -> 0x008b }
            r3 = 1
            java.lang.String r9 = java.lang.String.valueOf(r15)     // Catch:{ Throwable -> 0x0093, all -> 0x008b }
            r8[r3] = r9     // Catch:{ Throwable -> 0x0093, all -> 0x008b }
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r12 = "1"
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Throwable -> 0x0093, all -> 0x008b }
            if (r3 == 0) goto L_0x007e
            int r4 = r3.getCount()     // Catch:{ Throwable -> 0x0094, all -> 0x007c }
            if (r4 <= 0) goto L_0x007e
            boolean r4 = r3.moveToNext()     // Catch:{ Throwable -> 0x0094, all -> 0x007c }
            if (r4 == 0) goto L_0x007e
            java.lang.String r2 = "key"
            int r2 = r3.getColumnIndex(r2)     // Catch:{ Throwable -> 0x0094, all -> 0x007c }
            java.lang.String r5 = r3.getString(r2)     // Catch:{ Throwable -> 0x0094, all -> 0x007c }
            java.lang.String r2 = "mime"
            int r2 = r3.getColumnIndex(r2)     // Catch:{ Throwable -> 0x0094, all -> 0x007c }
            java.lang.String r6 = r3.getString(r2)     // Catch:{ Throwable -> 0x0094, all -> 0x007c }
            java.lang.String r2 = "contentLength"
            int r2 = r3.getColumnIndex(r2)     // Catch:{ Throwable -> 0x0094, all -> 0x007c }
            int r7 = r3.getInt(r2)     // Catch:{ Throwable -> 0x0094, all -> 0x007c }
            java.lang.String r2 = "extra"
            int r2 = r3.getColumnIndex(r2)     // Catch:{ Throwable -> 0x0094, all -> 0x007c }
            java.lang.String r9 = r3.getString(r2)     // Catch:{ Throwable -> 0x0094, all -> 0x007c }
            com.toutiao.proxyserver.b.a r2 = new com.toutiao.proxyserver.b.a     // Catch:{ Throwable -> 0x0094, all -> 0x007c }
            r4 = r2
            r8 = r15
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0094, all -> 0x007c }
            goto L_0x007e
        L_0x007c:
            r14 = move-exception
            goto L_0x008d
        L_0x007e:
            if (r2 == 0) goto L_0x0085
            if (r0 == 0) goto L_0x0085
            r0.put(r14, r2)     // Catch:{ Throwable -> 0x0094, all -> 0x007c }
        L_0x0085:
            if (r3 == 0) goto L_0x008a
            r3.close()
        L_0x008a:
            return r2
        L_0x008b:
            r14 = move-exception
            r3 = r1
        L_0x008d:
            if (r3 == 0) goto L_0x0092
            r3.close()
        L_0x0092:
            throw r14
        L_0x0093:
            r3 = r1
        L_0x0094:
            if (r3 == 0) goto L_0x0099
            r3.close()
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p2610b.C51809c.mo107300a(java.lang.String, int):com.toutiao.proxyserver.b.a");
    }
}
