package com.p683ss.android.download;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.p683ss.android.ugc.aweme.commercialize.abtest.NormalSplashDelayExperiment;
import java.io.File;

/* renamed from: com.ss.android.download.u */
final class C19136u {

    /* renamed from: a */
    final File f52731a = Environment.getExternalStorageDirectory();

    /* renamed from: b */
    public final File f52732b;

    /* renamed from: c */
    final Context f52733c;

    /* renamed from: d */
    private final File f52734d = Environment.getDownloadCacheDirectory();

    /* renamed from: e */
    private int f52735e;

    /* renamed from: f */
    private int f52736f;

    /* renamed from: g */
    private Thread f52737g;

    /* renamed from: d */
    private synchronized void m46653d() {
        this.f52735e = 0;
    }

    /* renamed from: c */
    private synchronized void m46652c() {
        if (this.f52737g == null || !this.f52737g.isAlive()) {
            this.f52737g = new Thread() {
                /* JADX WARNING: Removed duplicated region for block: B:29:0x006a A[SYNTHETIC, Splitter:B:29:0x006a] */
                /* JADX WARNING: Removed duplicated region for block: B:35:0x0070 A[SYNTHETIC, Splitter:B:35:0x0070] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r9 = this;
                        com.ss.android.download.u r0 = com.p683ss.android.download.C19136u.this
                        r0.mo39079b()
                        com.ss.android.download.u r0 = com.p683ss.android.download.C19136u.this
                        r1 = 0
                        android.content.Context r2 = r0.f52733c     // Catch:{ SQLiteException -> 0x006e, all -> 0x0066 }
                        com.ss.android.download.g r3 = com.p683ss.android.download.C19117g.m46591a(r2)     // Catch:{ SQLiteException -> 0x006e, all -> 0x0066 }
                        android.net.Uri r4 = com.p683ss.android.download.p1161b.C19096c.C19097a.f52584a     // Catch:{ SQLiteException -> 0x006e, all -> 0x0066 }
                        r2 = 1
                        java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x006e, all -> 0x0066 }
                        r2 = 0
                        java.lang.String r6 = "_id"
                        r5[r2] = r6     // Catch:{ SQLiteException -> 0x006e, all -> 0x0066 }
                        java.lang.String r6 = "status >= '200'"
                        r7 = 0
                        java.lang.String r8 = "lastmod"
                        android.database.Cursor r2 = r3.mo39054a(r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x006e, all -> 0x0066 }
                        if (r2 != 0) goto L_0x002a
                        if (r2 == 0) goto L_0x0075
                        r2.close()     // Catch:{ Exception -> 0x0029 }
                        goto L_0x0075
                    L_0x0029:
                        return
                    L_0x002a:
                        boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0064, all -> 0x0062 }
                        if (r3 == 0) goto L_0x005a
                        int r3 = r2.getCount()     // Catch:{ SQLiteException -> 0x0064, all -> 0x0062 }
                        int r3 = r3 + -1000
                        java.lang.String r4 = "_id"
                        int r4 = r2.getColumnIndexOrThrow(r4)     // Catch:{ SQLiteException -> 0x0064, all -> 0x0062 }
                    L_0x003c:
                        if (r3 <= 0) goto L_0x005a
                        android.net.Uri r5 = com.p683ss.android.download.p1161b.C19096c.C19097a.f52584a     // Catch:{ SQLiteException -> 0x0064, all -> 0x0062 }
                        long r6 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x0064, all -> 0x0062 }
                        android.net.Uri r5 = android.content.ContentUris.withAppendedId(r5, r6)     // Catch:{ SQLiteException -> 0x0064, all -> 0x0062 }
                        android.content.Context r6 = r0.f52733c     // Catch:{ SQLiteException -> 0x0064, all -> 0x0062 }
                        com.ss.android.download.g r6 = com.p683ss.android.download.C19117g.m46591a(r6)     // Catch:{ SQLiteException -> 0x0064, all -> 0x0062 }
                        r6.mo39053a(r5, r1, r1)     // Catch:{ SQLiteException -> 0x0064, all -> 0x0062 }
                        boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0064, all -> 0x0062 }
                        if (r5 == 0) goto L_0x005a
                        int r3 = r3 + -1
                        goto L_0x003c
                    L_0x005a:
                        if (r2 == 0) goto L_0x0061
                        r2.close()     // Catch:{ Exception -> 0x0060 }
                        goto L_0x0061
                    L_0x0060:
                        return
                    L_0x0061:
                        return
                    L_0x0062:
                        r0 = move-exception
                        goto L_0x0068
                    L_0x0064:
                        r1 = r2
                        goto L_0x006e
                    L_0x0066:
                        r0 = move-exception
                        r2 = r1
                    L_0x0068:
                        if (r2 == 0) goto L_0x006d
                        r2.close()     // Catch:{ Exception -> 0x006d }
                    L_0x006d:
                        throw r0
                    L_0x006e:
                        if (r1 == 0) goto L_0x0075
                        r1.close()     // Catch:{ Exception -> 0x0074 }
                        goto L_0x0075
                    L_0x0074:
                        return
                    L_0x0075:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19136u.C191371.run():void");
                }
            };
            this.f52737g.start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo39077a() {
        int i = this.f52736f + 1;
        this.f52736f = i;
        if (i % NormalSplashDelayExperiment.GROUP1 == 0) {
            m46652c();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0062 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39079b() {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0068 }
            r0.<init>()     // Catch:{ Exception -> 0x0068 }
            java.io.File r1 = r9.f52734d     // Catch:{ Exception -> 0x0068 }
            java.io.File[] r1 = r1.listFiles()     // Catch:{ Exception -> 0x0068 }
            if (r1 == 0) goto L_0x0014
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ Exception -> 0x0068 }
            r0.addAll(r1)     // Catch:{ Exception -> 0x0068 }
        L_0x0014:
            java.io.File r1 = r9.f52732b     // Catch:{ Exception -> 0x0068 }
            java.io.File[] r1 = r1.listFiles()     // Catch:{ Exception -> 0x0068 }
            if (r1 == 0) goto L_0x0023
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ Exception -> 0x0068 }
            r0.addAll(r1)     // Catch:{ Exception -> 0x0068 }
        L_0x0023:
            int r1 = r0.size()     // Catch:{ Exception -> 0x0068 }
            if (r1 != 0) goto L_0x002a
            return
        L_0x002a:
            android.content.Context r1 = r9.f52733c     // Catch:{ Exception -> 0x0068 }
            com.ss.android.download.g r2 = com.p683ss.android.download.C19117g.m46591a(r1)     // Catch:{ Exception -> 0x0068 }
            android.net.Uri r3 = com.p683ss.android.download.p1161b.C19096c.C19097a.f52584a     // Catch:{ Exception -> 0x0068 }
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = "_data"
            r8 = 0
            r4[r8] = r1     // Catch:{ Exception -> 0x0068 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r2.mo39054a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0068 }
            if (r1 == 0) goto L_0x0063
        L_0x0043:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0063
            java.lang.String r2 = r1.getString(r8)     // Catch:{ all -> 0x005c }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x005c }
            if (r3 != 0) goto L_0x0043
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x005c }
            r3.<init>(r2)     // Catch:{ all -> 0x005c }
            r0.remove(r3)     // Catch:{ all -> 0x005c }
            goto L_0x0043
        L_0x005c:
            r0 = move-exception
            if (r1 == 0) goto L_0x0062
            r1.close()     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            throw r0     // Catch:{ Exception -> 0x0068 }
        L_0x0063:
            if (r1 == 0) goto L_0x0068
            r1.close()     // Catch:{ Exception -> 0x0068 }
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19136u.mo39079b():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized int mo39076a(long j) {
        this.f52735e = (int) (((long) this.f52735e) + j);
        return this.f52735e;
    }

    public C19136u(Context context) {
        this.f52733c = context;
        this.f52732b = context.getCacheDir();
        m46652c();
    }

    /* renamed from: a */
    private static long m46649a(File file) {
        File[] listFiles = file.listFiles();
        long j = 104857600;
        if (listFiles == null) {
            return 104857600;
        }
        for (File length : listFiles) {
            j -= length.length();
        }
        return j;
    }

    /* renamed from: b */
    private static long m46651b(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return ((long) statFs.getBlockSize()) * (((long) statFs.getAvailableBlocks()) - 4);
    }

    /* JADX WARNING: Incorrect condition in loop: B:7:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m46648a(int r7, long r8) {
        /*
            r6 = this;
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r8 = 1
            java.lang.String[] r4 = new java.lang.String[r8]
            r8 = 0
            r4[r8] = r7
            android.content.Context r7 = r6.f52733c
            com.ss.android.download.g r0 = com.p683ss.android.download.C19117g.m46591a(r7)
            android.net.Uri r1 = com.p683ss.android.download.p1161b.C19096c.C19097a.f52584a
            java.lang.String r3 = "( status = '200' AND destination = ? )"
            java.lang.String r5 = "lastmod"
            r2 = 0
            android.database.Cursor r7 = r0.mo39054a(r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0020
            return r8
        L_0x0020:
            java.lang.String r0 = "_data"
            int r0 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x006c }
        L_0x0026:
            boolean r1 = r7.moveToNext()     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x0066
            r1 = 10485760(0xa00000, double:5.180654E-317)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0066
            java.lang.String r1 = r7.getString(r0)     // Catch:{ all -> 0x006c }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x006c }
            if (r2 != 0) goto L_0x0026
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x006c }
            r2.<init>(r1)     // Catch:{ all -> 0x006c }
            long r3 = r2.length()     // Catch:{ all -> 0x006c }
            r1 = 0
            long r8 = r8 + r3
            r2.delete()     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "_id"
            int r1 = r7.getColumnIndex(r1)     // Catch:{ all -> 0x006c }
            long r1 = r7.getLong(r1)     // Catch:{ all -> 0x006c }
            android.content.Context r3 = r6.f52733c     // Catch:{ all -> 0x006c }
            com.ss.android.download.g r3 = com.p683ss.android.download.C19117g.m46591a(r3)     // Catch:{ all -> 0x006c }
            android.net.Uri r4 = com.p683ss.android.download.p1161b.C19096c.C19097a.f52584a     // Catch:{ all -> 0x006c }
            android.net.Uri r1 = android.content.ContentUris.withAppendedId(r4, r1)     // Catch:{ all -> 0x006c }
            r2 = 0
            r3.mo39053a(r1, r2, r2)     // Catch:{ all -> 0x006c }
            goto L_0x0026
        L_0x0066:
            if (r7 == 0) goto L_0x006b
            r7.close()     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            return r8
        L_0x006c:
            r8 = move-exception
            if (r7 == 0) goto L_0x0072
            r7.close()     // Catch:{ Exception -> 0x0072 }
        L_0x0072:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19136u.m46648a(int, long):long");
    }

    /* renamed from: a */
    private synchronized void m46650a(File file, long j, int i) throws C19135t {
        if (j != 0) {
            if (i == 1 || i == 0) {
                if (!Environment.getExternalStorageState().equals("mounted")) {
                    throw new C19135t(199, "external media not mounted");
                }
            }
            long b = m46651b(file);
            if (b < 10485760) {
                m46648a(i, 10485760);
                mo39079b();
                b = m46651b(file);
                if (b < 10485760) {
                    if (!file.equals(this.f52734d)) {
                        StringBuilder sb = new StringBuilder("space in the filesystem rooted at: ");
                        sb.append(file);
                        sb.append(" is below 10% availability. stopping this download.");
                        throw new C19135t(198, sb.toString());
                    }
                }
            }
            if (file.equals(this.f52732b)) {
                b = m46649a(this.f52732b);
                if (b < j) {
                    m46648a(i, 10485760);
                    mo39079b();
                    b = m46649a(this.f52732b);
                }
            }
            if (b < j) {
                StringBuilder sb2 = new StringBuilder("not enough free space in the filesystem rooted at: ");
                sb2.append(file);
                sb2.append(" and unable to free any more");
                throw new C19135t(198, sb2.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39078a(int r2, java.lang.String r3, long r4) throws com.p683ss.android.download.C19135t {
        /*
            r1 = this;
            r1.m46653d()
            if (r3 == 0) goto L_0x005c
            switch(r2) {
                case 0: goto L_0x0036;
                case 1: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0039
        L_0x0009:
            java.io.File r0 = r1.f52731a
            java.lang.String r0 = r0.getPath()
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0018
            java.io.File r0 = r1.f52731a
            goto L_0x003a
        L_0x0018:
            java.io.File r0 = r1.f52732b
            java.lang.String r0 = r0.getPath()
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0027
            java.io.File r0 = r1.f52732b
            goto L_0x003a
        L_0x0027:
            java.io.File r0 = r1.f52734d
            java.lang.String r0 = r0.getPath()
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0039
            java.io.File r0 = r1.f52734d
            goto L_0x003a
        L_0x0036:
            java.io.File r0 = r1.f52731a
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x0040
            r1.m46650a(r0, r4, r2)
            return
        L_0x0040:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "invalid combination of destination: "
            r5.<init>(r0)
            r5.append(r2)
            java.lang.String r2 = ", path: "
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            throw r4
        L_0x005c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "path can't be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.C19136u.mo39078a(int, java.lang.String, long):void");
    }
}
