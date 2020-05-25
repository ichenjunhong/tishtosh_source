package com.p683ss.android.socialbase.downloader.p1213c;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.downloader.C19909s;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.p1213c.C19795c.C19796a;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.socialbase.downloader.c.e */
public class C19799e extends C19796a implements C19909s {

    /* renamed from: a */
    public static volatile SQLiteDatabase f54495a;

    /* renamed from: b */
    public C19818g f54496b;

    /* renamed from: c */
    public C19818g f54497c;

    /* renamed from: d */
    public volatile boolean f54498d;

    /* renamed from: e */
    C19792b f54499e;

    /* renamed from: a */
    public final void mo41240a(int i, List<DownloadChunk> list) {
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo41247b(String str) {
        return null;
    }

    /* renamed from: b */
    public final void mo41251b(DownloadInfo downloadInfo) {
    }

    /* renamed from: c */
    public final List<DownloadInfo> mo41254c(String str) {
        return null;
    }

    /* renamed from: d */
    public final List<DownloadInfo> mo41257d(String str) {
        return null;
    }

    /* renamed from: d */
    public final boolean mo41259d() {
        return false;
    }

    /* renamed from: g */
    public final DownloadInfo mo41263g(int i) {
        return null;
    }

    /* renamed from: a */
    public static void m48397a(List<DownloadInfo> list) {
        try {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null && downloadInfo.isSavePathRedirected()) {
                    C19994e.m49363b(downloadInfo);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x01a6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41273a(java.util.List<com.p683ss.android.socialbase.downloader.model.DownloadInfo> r18, java.util.List<java.lang.Integer> r19, android.util.SparseArray<com.p683ss.android.socialbase.downloader.model.DownloadInfo> r20, android.util.SparseArray<com.p683ss.android.socialbase.downloader.model.DownloadInfo> r21, android.util.SparseArray<java.util.List<com.p683ss.android.socialbase.downloader.model.DownloadChunk>> r22) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = r21
            r3 = r22
            int r4 = r20.size()
            if (r4 < 0) goto L_0x01b4
            android.database.sqlite.SQLiteDatabase r5 = f54495a
            if (r5 != 0) goto L_0x0014
            goto L_0x01b4
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r5 = f54495a
            monitor-enter(r5)
            m48401g()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            boolean r6 = r18.isEmpty()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L_0x00a4
            com.ss.android.socialbase.downloader.h.a r6 = com.p683ss.android.socialbase.downloader.p1219h.C19938a.m48933b()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r9 = "clear_invalid_task_error"
            boolean r6 = r6.mo41660a(r9)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            if (r6 == 0) goto L_0x0082
            int r6 = r18.size()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r9 = 0
        L_0x0035:
            int r10 = r18.size()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            if (r9 >= r10) goto L_0x004a
            r10 = r18
            java.lang.Object r11 = r10.get(r9)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r6[r9] = r11     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            int r9 = r9 + 1
            goto L_0x0035
        L_0x004a:
            r10 = r18
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r11 = "CAST(_id AS TEXT) IN ("
            r9.<init>(r11)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r11 = new java.lang.String     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            int r10 = r18.size()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            int r10 = r10 - r8
            char[] r10 = new char[r10]     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r11.<init>(r10)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r10 = "\u0000"
            java.lang.String r12 = "?,"
            java.lang.String r10 = r11.replace(r10, r12)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r9.append(r10)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r10 = "?)"
            r9.append(r10)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            android.database.sqlite.SQLiteDatabase r10 = f54495a     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r11 = "downloader"
            r10.delete(r11, r9, r6)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            android.database.sqlite.SQLiteDatabase r10 = f54495a     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r11 = "downloadChunk"
            r10.delete(r11, r9, r6)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            goto L_0x00a4
        L_0x0082:
            java.lang.String r6 = ", "
            r9 = r19
            java.lang.String r6 = android.text.TextUtils.join(r6, r9)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            android.database.sqlite.SQLiteDatabase r9 = f54495a     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r10 = "downloader"
            java.lang.String r11 = "_id IN (?)"
            java.lang.String[] r12 = new java.lang.String[r8]     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r12[r7] = r6     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r9.delete(r10, r11, r12)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            android.database.sqlite.SQLiteDatabase r9 = f54495a     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r10 = "downloadChunk"
            java.lang.String r11 = "_id IN (?)"
            java.lang.String[] r12 = new java.lang.String[r8]     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r12[r7] = r6     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r9.delete(r10, r11, r12)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
        L_0x00a4:
            r6 = 0
        L_0x00a5:
            if (r6 >= r4) goto L_0x0170
            int r9 = r0.keyAt(r6)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.Object r10 = r0.get(r9)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r10     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            android.database.sqlite.SQLiteDatabase r11 = f54495a     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r12 = "downloader"
            java.lang.String r13 = "_id = ?"
            java.lang.String[] r14 = new java.lang.String[r8]     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r15 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r14[r7] = r15     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r11.delete(r12, r13, r14)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            android.database.sqlite.SQLiteDatabase r11 = f54495a     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r12 = "downloader"
            android.content.ContentValues r13 = r10.toContentValues()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r14 = 0
            r11.insert(r12, r14, r13)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            int r11 = r10.getChunkCount()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            if (r11 <= r8) goto L_0x016a
            java.util.List r11 = r1.mo41253c(r9)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            int r12 = r11.size()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            if (r12 <= 0) goto L_0x016a
            android.database.sqlite.SQLiteDatabase r12 = f54495a     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r13 = "downloadChunk"
            java.lang.String r15 = "_id = ?"
            java.lang.String[] r14 = new java.lang.String[r8]     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r14[r7] = r9     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r12.delete(r13, r15, r14)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.util.Iterator r9 = r11.iterator()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
        L_0x00f3:
            boolean r11 = r9.hasNext()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            if (r11 == 0) goto L_0x016a
            java.lang.Object r11 = r9.next()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            com.ss.android.socialbase.downloader.model.DownloadChunk r11 = (com.p683ss.android.socialbase.downloader.model.DownloadChunk) r11     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            int r12 = r10.getId()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r11.f55024a = r12     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            android.database.sqlite.SQLiteDatabase r12 = f54495a     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r13 = "downloadChunk"
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r14.<init>()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r15 = "_id"
            int r7 = r11.f55024a     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r14.put(r15, r7)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r7 = "chunkIndex"
            int r15 = r11.f55028e     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r14.put(r7, r15)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r7 = "startOffset"
            r16 = r9
            long r8 = r11.f55025b     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r14.put(r7, r8)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r7 = "curOffset"
            long r8 = r11.mo41800i()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r14.put(r7, r8)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r7 = "endOffset"
            long r8 = r11.f55026c     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r14.put(r7, r8)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r7 = "chunkContentLen"
            long r8 = r11.f55027d     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r14.put(r7, r8)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.String r7 = "hostChunkIndex"
            int r8 = r11.mo41785a()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r14.put(r7, r8)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r7 = 0
            r12.insert(r13, r7, r14)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r9 = r16
            r7 = 0
            r8 = 1
            goto L_0x00f3
        L_0x016a:
            int r6 = r6 + 1
            r7 = 0
            r8 = 1
            goto L_0x00a5
        L_0x0170:
            if (r2 == 0) goto L_0x01a1
            if (r3 == 0) goto L_0x01a1
            monitor-enter(r21)     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            int r0 = r21.size()     // Catch:{ all -> 0x019e }
            r4 = 0
        L_0x017a:
            if (r4 >= r0) goto L_0x019c
            java.lang.Object r6 = r2.valueAt(r4)     // Catch:{ all -> 0x019e }
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r6     // Catch:{ all -> 0x019e }
            int r6 = r6.getId()     // Catch:{ all -> 0x019e }
            java.util.List r7 = r1.mo41253c(r6)     // Catch:{ all -> 0x019e }
            java.util.List r7 = com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49339a(r7)     // Catch:{ all -> 0x019e }
            if (r7 == 0) goto L_0x0199
            int r8 = r7.size()     // Catch:{ all -> 0x019e }
            if (r8 <= 0) goto L_0x0199
            r3.put(r6, r7)     // Catch:{ all -> 0x019e }
        L_0x0199:
            int r4 = r4 + 1
            goto L_0x017a
        L_0x019c:
            monitor-exit(r21)     // Catch:{ all -> 0x019e }
            goto L_0x01a1
        L_0x019e:
            r0 = move-exception
            monitor-exit(r21)     // Catch:{ all -> 0x019e }
            throw r0     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
        L_0x01a1:
            android.database.sqlite.SQLiteDatabase r0 = f54495a     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
            r0.setTransactionSuccessful()     // Catch:{ Throwable -> 0x01a6, all -> 0x01aa }
        L_0x01a6:
            m48402h()     // Catch:{ all -> 0x01b1 }
            goto L_0x01af
        L_0x01aa:
            r0 = move-exception
            m48402h()     // Catch:{ all -> 0x01b1 }
            throw r0     // Catch:{ all -> 0x01b1 }
        L_0x01af:
            monitor-exit(r5)     // Catch:{ all -> 0x01b1 }
            return
        L_0x01b1:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01b1 }
            throw r0
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1213c.C19799e.mo41273a(java.util.List, java.util.List, android.util.SparseArray, android.util.SparseArray, android.util.SparseArray):void");
    }

    /* renamed from: a */
    public final boolean mo41243a(int i) {
        try {
            return mo41245b(i) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r9 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r9 != null) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044 A[SYNTHETIC, Splitter:B:16:0x0044] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.socialbase.downloader.model.DownloadInfo> mo41235a(java.lang.String r9) {
        /*
            r8 = this;
            r8.mo41275e()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = f54495a
            if (r1 == 0) goto L_0x004c
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = f54495a     // Catch:{ Throwable -> 0x0048, all -> 0x0041 }
            java.lang.String r3 = "SELECT * FROM %s WHERE %s = ?"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0048, all -> 0x0041 }
            java.lang.String r5 = "downloader"
            r6 = 0
            r4[r6] = r5     // Catch:{ Throwable -> 0x0048, all -> 0x0041 }
            java.lang.String r5 = "url"
            r7 = 1
            r4[r7] = r5     // Catch:{ Throwable -> 0x0048, all -> 0x0041 }
            java.lang.String r3 = com.C2240a.m6772a(r3, r4)     // Catch:{ Throwable -> 0x0048, all -> 0x0041 }
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ Throwable -> 0x0048, all -> 0x0041 }
            r4[r6] = r9     // Catch:{ Throwable -> 0x0048, all -> 0x0041 }
            android.database.Cursor r9 = r2.rawQuery(r3, r4)     // Catch:{ Throwable -> 0x0048, all -> 0x0041 }
            boolean r1 = r9.moveToNext()     // Catch:{ Throwable -> 0x0049, all -> 0x003e }
            if (r1 == 0) goto L_0x0038
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = new com.ss.android.socialbase.downloader.model.DownloadInfo     // Catch:{ Throwable -> 0x0049, all -> 0x003e }
            r1.<init>(r9)     // Catch:{ Throwable -> 0x0049, all -> 0x003e }
            r0.add(r1)     // Catch:{ Throwable -> 0x0049, all -> 0x003e }
        L_0x0038:
            if (r9 == 0) goto L_0x004c
        L_0x003a:
            r9.close()     // Catch:{ Throwable -> 0x004c }
            goto L_0x004c
        L_0x003e:
            r0 = move-exception
            r1 = r9
            goto L_0x0042
        L_0x0041:
            r0 = move-exception
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ Throwable -> 0x0047 }
        L_0x0047:
            throw r0
        L_0x0048:
            r9 = r1
        L_0x0049:
            if (r9 == 0) goto L_0x004c
            goto L_0x003a
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1213c.C19799e.mo41235a(java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final void mo41242a(final DownloadChunk downloadChunk) {
        mo41275e();
        if (f54495a != null && this.f54497c != null) {
            if (C19994e.m49380d()) {
                ExecutorService j = C19884b.m48613j();
                if (j != null) {
                    j.execute(new Runnable() {
                        public final void run() {
                            try {
                                C19799e.m48395a(downloadChunk, C19799e.this.f54497c.mo41296a());
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                return;
            }
            try {
                m48395a(downloadChunk, this.f54497c.mo41296a());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo41239a(int i, int i2, long j) {
        mo41275e();
        if (i != 0 && i2 >= 0 && j >= 0 && f54495a != null && this.f54497c != null) {
            if (C19994e.m49380d()) {
                ExecutorService j2 = C19884b.m48613j();
                if (j2 != null) {
                    final int i3 = i;
                    final int i4 = i2;
                    final long j3 = j;
                    C198076 r1 = new Runnable() {
                        public final void run() {
                            try {
                                C19799e.m48392a(i3, i4, j3, C19799e.this.f54497c.mo41298c());
                            } catch (Throwable unused) {
                            }
                        }
                    };
                    j2.execute(r1);
                    return;
                }
                return;
            }
            try {
                m48392a(i, i2, j, this.f54497c.mo41298c());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo41238a(int i, int i2, int i3, long j) {
        mo41275e();
        if (i != 0 && i2 >= 0 && i3 >= 0 && j >= 0 && f54495a != null && this.f54497c != null) {
            if (C19994e.m49380d()) {
                ExecutorService j2 = C19884b.m48613j();
                if (j2 != null) {
                    final int i4 = i;
                    final int i5 = i2;
                    final int i6 = i3;
                    final long j3 = j;
                    C198087 r1 = new Runnable() {
                        public final void run() {
                            try {
                                C19799e.m48391a(i4, i5, i6, j3, C19799e.this.f54497c.mo41298c());
                            } catch (Throwable unused) {
                            }
                        }
                    };
                    j2.execute(r1);
                    return;
                }
                return;
            }
            try {
                m48391a(i, i2, i3, j, this.f54497c.mo41298c());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo41237a(int i, int i2, int i3, int i4) {
        mo41275e();
        if (i != 0 && i3 >= 0 && i4 != i2 && i4 >= 0 && f54495a != null && this.f54497c != null) {
            if (C19994e.m49380d()) {
                ExecutorService j = C19884b.m48613j();
                if (j != null) {
                    final int i5 = i;
                    final int i6 = i2;
                    final int i7 = i3;
                    final int i8 = i4;
                    C198098 r1 = new Runnable() {
                        public final void run() {
                            try {
                                C19799e.m48390a(i5, i6, i7, i8, C19799e.this.f54497c.mo41298c());
                            } catch (Throwable unused) {
                            }
                        }
                    };
                    j.execute(r1);
                    return;
                }
                return;
            }
            try {
                m48390a(i, i2, i3, i4, this.f54497c.mo41298c());
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|(5:9|10|11|17|16)(0)|5|4) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000b */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.socialbase.downloader.model.DownloadInfo mo41232a(int r7, int r8) {
        /*
            r6 = this;
            r6.mo41275e()
            android.database.sqlite.SQLiteDatabase r0 = f54495a
            r1 = 0
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            r0 = 10
        L_0x000b:
            android.database.sqlite.SQLiteDatabase r2 = f54495a     // Catch:{ Throwable -> 0x003e }
            boolean r2 = r2.isDbLockedByCurrentThread()     // Catch:{ Throwable -> 0x003e }
            if (r2 == 0) goto L_0x001d
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x001d
            r2 = 5
            java.lang.Thread.sleep(r2)     // Catch:{ Throwable -> 0x000b }
            goto L_0x000b
        L_0x001d:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Throwable -> 0x003e }
            r0.<init>()     // Catch:{ Throwable -> 0x003e }
            java.lang.String r2 = "chunkCount"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x003e }
            r0.put(r2, r8)     // Catch:{ Throwable -> 0x003e }
            android.database.sqlite.SQLiteDatabase r8 = f54495a     // Catch:{ Throwable -> 0x003e }
            java.lang.String r2 = "downloader"
            java.lang.String r3 = "_id = ? "
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Throwable -> 0x003e }
            r5 = 0
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ Throwable -> 0x003e }
            r4[r5] = r7     // Catch:{ Throwable -> 0x003e }
            r8.update(r2, r0, r3, r4)     // Catch:{ Throwable -> 0x003e }
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1213c.C19799e.mo41232a(int, int):com.ss.android.socialbase.downloader.model.DownloadInfo");
    }

    /* renamed from: a */
    public final boolean mo41244a(final DownloadInfo downloadInfo) {
        mo41275e();
        if (downloadInfo == null || f54495a == null) {
            return false;
        }
        if (C19994e.m49380d()) {
            ExecutorService j = C19884b.m48613j();
            if (j == null) {
                return false;
            }
            j.execute(new Runnable() {
                public final void run() {
                    C19799e.this.mo41274c(downloadInfo);
                }
            });
        } else {
            mo41274c(downloadInfo);
        }
        return true;
    }

    /* renamed from: a */
    public final DownloadInfo mo41234a(int i, long j, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(3));
        contentValues.put("totalBytes", Long.valueOf(j));
        contentValues.put("eTag", str);
        if (!TextUtils.isEmpty(str2)) {
            contentValues.put(LeakCanaryFileProvider.f132049i, str2);
        }
        m48398b(i, contentValues);
        return null;
    }

    /* renamed from: a */
    public final DownloadInfo mo41233a(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(4));
        contentValues.put("curBytes", Long.valueOf(j));
        m48398b(i, contentValues);
        return null;
    }

    /* renamed from: a */
    public final void mo41241a(C19792b bVar) {
        this.f54499e = bVar;
    }

    /* renamed from: a */
    public final void mo41271a(SparseArray<DownloadInfo> sparseArray, SparseArray<List<DownloadChunk>> sparseArray2) {
        try {
            HashMap a = C19994e.m49338a(sparseArray);
            HashMap a2 = C19994e.m49338a(sparseArray2);
            if (this.f54499e != null) {
                this.f54499e.mo41228a(a, a2);
            }
        } catch (Throwable unused) {
        }
    }

    public C19799e() {
        this(false);
    }

    /* renamed from: g */
    private static void m48401g() {
        f54495a.beginTransaction();
    }

    /* renamed from: a */
    public final void mo41236a() {
        mo41272a(null, null, (C19798d) null);
    }

    /* renamed from: c */
    public final boolean mo41255c() {
        return this.f54498d;
    }

    /* renamed from: h */
    private static void m48402h() {
        try {
            if (f54495a != null && f54495a.inTransaction()) {
                f54495a.endTransaction();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|(2:7|8)|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41275e() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = f54495a
            if (r0 != 0) goto L_0x0038
            java.lang.Class<com.ss.android.socialbase.downloader.c.e> r0 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.class
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = f54495a     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x0033
            com.ss.android.socialbase.downloader.c.a r1 = com.p683ss.android.socialbase.downloader.p1213c.C19791a.m48316a()     // Catch:{ Throwable -> 0x0033 }
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ Throwable -> 0x0033 }
            f54495a = r1     // Catch:{ Throwable -> 0x0033 }
            com.ss.android.socialbase.downloader.c.g r1 = new com.ss.android.socialbase.downloader.c.g     // Catch:{ Throwable -> 0x0033 }
            android.database.sqlite.SQLiteDatabase r2 = f54495a     // Catch:{ Throwable -> 0x0033 }
            java.lang.String r3 = "downloader"
            java.lang.String[] r4 = com.p683ss.android.socialbase.downloader.p1212b.C19782c.f54477a     // Catch:{ Throwable -> 0x0033 }
            java.lang.String[] r5 = com.p683ss.android.socialbase.downloader.p1212b.C19782c.f54478b     // Catch:{ Throwable -> 0x0033 }
            r1.<init>(r2, r3, r4, r5)     // Catch:{ Throwable -> 0x0033 }
            r6.f54496b = r1     // Catch:{ Throwable -> 0x0033 }
            com.ss.android.socialbase.downloader.c.g r1 = new com.ss.android.socialbase.downloader.c.g     // Catch:{ Throwable -> 0x0033 }
            android.database.sqlite.SQLiteDatabase r2 = f54495a     // Catch:{ Throwable -> 0x0033 }
            java.lang.String r3 = "downloadChunk"
            java.lang.String[] r4 = com.p683ss.android.socialbase.downloader.p1212b.C19782c.f54479c     // Catch:{ Throwable -> 0x0033 }
            java.lang.String[] r5 = com.p683ss.android.socialbase.downloader.p1212b.C19782c.f54480d     // Catch:{ Throwable -> 0x0033 }
            r1.<init>(r2, r3, r4, r5)     // Catch:{ Throwable -> 0x0033 }
            r6.f54497c = r1     // Catch:{ Throwable -> 0x0033 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r1
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1213c.C19799e.mo41275e():void");
    }

    /* renamed from: f */
    public final synchronized void mo41276f() {
        try {
            m48401g();
            f54495a.delete("downloader", null, null);
            f54495a.delete("downloadChunk", null, null);
            f54495a.setTransactionSuccessful();
            m48402h();
        } catch (Throwable th) {
            m48402h();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo41248b() {
        mo41275e();
        if (f54495a != null) {
            if (C19994e.m49380d()) {
                ExecutorService j = C19884b.m48613j();
                if (j != null) {
                    j.execute(new Runnable() {
                        public final void run() {
                            C19799e.this.mo41276f();
                        }
                    });
                    return;
                }
                return;
            }
            mo41276f();
        }
    }

    private C19799e(boolean z) {
    }

    /* renamed from: b */
    public final void mo41250b(DownloadChunk downloadChunk) {
        mo41242a(downloadChunk);
    }

    /* renamed from: f */
    public final boolean mo41262f(final int i) {
        if (C19994e.m49380d()) {
            ExecutorService j = C19884b.m48613j();
            if (j == null) {
                return false;
            }
            j.execute(new Runnable() {
                public final void run() {
                    C19799e.this.mo41261e(i);
                    C19799e.this.mo41258d(i);
                }
            });
        } else {
            mo41261e(i);
            mo41258d(i);
        }
        return true;
    }

    /* renamed from: i */
    public final DownloadInfo mo41265i(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(1));
        m48398b(i, contentValues);
        return null;
    }

    /* renamed from: j */
    public final DownloadInfo mo41266j(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(-7));
        m48398b(i, contentValues);
        return null;
    }

    /* renamed from: d */
    private void m48400d(final DownloadInfo downloadInfo) {
        mo41275e();
        if (f54495a != null && this.f54496b != null) {
            if (C19994e.m49380d()) {
                ExecutorService j = C19884b.m48613j();
                if (j != null) {
                    j.execute(new Runnable() {
                        public final void run() {
                            try {
                                C19799e.m48396a(downloadInfo, C19799e.this.f54496b.mo41296a());
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                return;
            }
            try {
                m48396a(downloadInfo, this.f54496b.mo41296a());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: h */
    public final DownloadInfo mo41264h(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(5));
        contentValues.put("isFirstDownload", Integer.valueOf(0));
        m48398b(i, contentValues);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r9 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r9 != null) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[SYNTHETIC, Splitter:B:16:0x0049] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.socialbase.downloader.model.DownloadChunk> mo41253c(int r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.mo41275e()
            android.database.sqlite.SQLiteDatabase r1 = f54495a
            if (r1 == 0) goto L_0x0051
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = f54495a     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r3 = "SELECT * FROM %s WHERE %s = ?"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r5 = "downloadChunk"
            r6 = 0
            r4[r6] = r5     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r5 = "_id"
            r7 = 1
            r4[r7] = r5     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r3 = com.C2240a.m6772a(r3, r4)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            r4[r6] = r9     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            android.database.Cursor r9 = r2.rawQuery(r3, r4)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
        L_0x002e:
            boolean r1 = r9.moveToNext()     // Catch:{ Throwable -> 0x004e, all -> 0x0043 }
            if (r1 == 0) goto L_0x003d
            com.ss.android.socialbase.downloader.model.DownloadChunk r1 = new com.ss.android.socialbase.downloader.model.DownloadChunk     // Catch:{ Throwable -> 0x004e, all -> 0x0043 }
            r1.<init>(r9)     // Catch:{ Throwable -> 0x004e, all -> 0x0043 }
            r0.add(r1)     // Catch:{ Throwable -> 0x004e, all -> 0x0043 }
            goto L_0x002e
        L_0x003d:
            if (r9 == 0) goto L_0x0051
        L_0x003f:
            r9.close()     // Catch:{ Throwable -> 0x0051 }
            goto L_0x0051
        L_0x0043:
            r0 = move-exception
            r1 = r9
            goto L_0x0047
        L_0x0046:
            r0 = move-exception
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ Throwable -> 0x004c }
        L_0x004c:
            throw r0
        L_0x004d:
            r9 = r1
        L_0x004e:
            if (r9 == 0) goto L_0x0051
            goto L_0x003f
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1213c.C19799e.mo41253c(int):java.util.List");
    }

    /* renamed from: d */
    public final void mo41258d(final int i) {
        mo41275e();
        if (f54495a != null && this.f54497c != null) {
            if (C19994e.m49380d()) {
                ExecutorService j = C19884b.m48613j();
                if (j != null) {
                    j.execute(new Runnable() {
                        public final void run() {
                            try {
                                C19799e.m48394a(i, C19799e.this.f54497c.mo41297b());
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                return;
            }
            try {
                m48394a(i, this.f54497c.mo41297b());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    public final boolean mo41261e(int i) {
        mo41275e();
        if (f54495a == null || this.f54496b == null) {
            return false;
        }
        try {
            m48394a(i, this.f54496b.mo41297b());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r8 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (r8 != null) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[SYNTHETIC, Splitter:B:20:0x0046] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.socialbase.downloader.model.DownloadInfo mo41245b(int r8) {
        /*
            r7 = this;
            r7.mo41275e()
            android.database.sqlite.SQLiteDatabase r0 = f54495a
            r1 = 0
            if (r0 == 0) goto L_0x004e
            android.database.sqlite.SQLiteDatabase r0 = f54495a     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r2 = "SELECT * FROM %s WHERE %s = ?"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r4 = "downloader"
            r5 = 0
            r3[r5] = r4     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r4 = "_id"
            r6 = 1
            r3[r6] = r4     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r2 = com.C2240a.m6772a(r2, r3)     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            r3[r5] = r8     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            android.database.Cursor r8 = r0.rawQuery(r2, r3)     // Catch:{ Throwable -> 0x004a, all -> 0x0043 }
            boolean r0 = r8.moveToNext()     // Catch:{ Throwable -> 0x004b, all -> 0x0040 }
            if (r0 == 0) goto L_0x003a
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = new com.ss.android.socialbase.downloader.model.DownloadInfo     // Catch:{ Throwable -> 0x004b, all -> 0x0040 }
            r0.<init>(r8)     // Catch:{ Throwable -> 0x004b, all -> 0x0040 }
            if (r8 == 0) goto L_0x0039
            r8.close()     // Catch:{ Throwable -> 0x0039 }
        L_0x0039:
            return r0
        L_0x003a:
            if (r8 == 0) goto L_0x004e
        L_0x003c:
            r8.close()     // Catch:{ Throwable -> 0x004e }
            goto L_0x004e
        L_0x0040:
            r0 = move-exception
            r1 = r8
            goto L_0x0044
        L_0x0043:
            r0 = move-exception
        L_0x0044:
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ Throwable -> 0x0049 }
        L_0x0049:
            throw r0
        L_0x004a:
            r8 = r1
        L_0x004b:
            if (r8 == 0) goto L_0x004e
            goto L_0x003c
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1213c.C19799e.mo41245b(int):com.ss.android.socialbase.downloader.model.DownloadInfo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41274c(com.p683ss.android.socialbase.downloader.model.DownloadInfo r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L_0x0005
            monitor-exit(r1)
            return
        L_0x0005:
            int r0 = r2.getId()     // Catch:{ Throwable -> 0x0028, all -> 0x0025 }
            boolean r0 = r1.mo41243a(r0)     // Catch:{ Throwable -> 0x0028, all -> 0x0025 }
            if (r0 != 0) goto L_0x0013
            r1.m48400d(r2)     // Catch:{ Throwable -> 0x0028, all -> 0x0025 }
            goto L_0x0028
        L_0x0013:
            com.ss.android.socialbase.downloader.c.g r0 = r1.f54496b     // Catch:{ Throwable -> 0x0028, all -> 0x0025 }
            if (r0 != 0) goto L_0x0019
            monitor-exit(r1)
            return
        L_0x0019:
            com.ss.android.socialbase.downloader.c.g r0 = r1.f54496b     // Catch:{ Throwable -> 0x0023, all -> 0x0025 }
            android.database.sqlite.SQLiteStatement r0 = r0.mo41298c()     // Catch:{ Throwable -> 0x0023, all -> 0x0025 }
            m48399b(r2, r0)     // Catch:{ Throwable -> 0x0023, all -> 0x0025 }
            goto L_0x0028
        L_0x0023:
            monitor-exit(r1)
            return
        L_0x0025:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0028:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1213c.C19799e.mo41274c(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    /* renamed from: a */
    public static void m48394a(int i, SQLiteStatement sQLiteStatement) {
        if (sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    sQLiteStatement.bindLong(1, (long) i);
                    sQLiteStatement.execute();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public final DownloadInfo mo41256d(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(-2));
        contentValues.put("curBytes", Long.valueOf(j));
        m48398b(i, contentValues);
        return null;
    }

    /* renamed from: e */
    public final DownloadInfo mo41260e(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(-4));
        contentValues.put("curBytes", Long.valueOf(j));
        m48398b(i, contentValues);
        return null;
    }

    /* renamed from: b */
    private void m48398b(final int i, final ContentValues contentValues) {
        mo41275e();
        if (f54495a != null) {
            if (C19994e.m49380d()) {
                ExecutorService j = C19884b.m48613j();
                if (j != null) {
                    j.execute(new Runnable() {
                        public final void run() {
                            C19799e.m48393a(i, contentValues);
                        }
                    });
                    return;
                }
                return;
            }
            m48393a(i, contentValues);
        }
    }

    /* renamed from: c */
    public final DownloadInfo mo41252c(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(-3));
        contentValues.put("curBytes", Long.valueOf(j));
        contentValues.put("isFirstDownload", Integer.valueOf(0));
        contentValues.put("isFirstSuccess", Integer.valueOf(0));
        m48398b(i, contentValues);
        return null;
    }

    /* renamed from: b */
    private static void m48399b(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo != null && sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    downloadInfo.bindValue(sQLiteStatement);
                    sQLiteStatement.bindLong(downloadInfo.getBindValueCount() + 1, (long) downloadInfo.getId());
                    sQLiteStatement.execute();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0002 */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x000a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m48393a(int r5, android.content.ContentValues r6) {
        /*
            r0 = 10
        L_0x0002:
            android.database.sqlite.SQLiteDatabase r1 = f54495a     // Catch:{ Throwable -> 0x0029 }
            boolean r1 = r1.isDbLockedByCurrentThread()     // Catch:{ Throwable -> 0x0029 }
            if (r1 == 0) goto L_0x0014
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0014
            r1 = 5
            java.lang.Thread.sleep(r1)     // Catch:{ Throwable -> 0x0002 }
            goto L_0x0002
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r0 = f54495a     // Catch:{ Throwable -> 0x0028 }
            java.lang.String r1 = "downloader"
            java.lang.String r2 = "_id = ? "
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x0028 }
            r4 = 0
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x0028 }
            r3[r4] = r5     // Catch:{ Throwable -> 0x0028 }
            r0.update(r1, r6, r2, r3)     // Catch:{ Throwable -> 0x0028 }
            goto L_0x0029
        L_0x0028:
            return
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1213c.C19799e.m48393a(int, android.content.ContentValues):void");
    }

    /* renamed from: b */
    public final DownloadInfo mo41246b(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(-1));
        contentValues.put("curBytes", Long.valueOf(j));
        if (j > 0) {
            contentValues.put("isFirstDownload", Integer.valueOf(0));
        }
        m48398b(i, contentValues);
        return null;
    }

    /* renamed from: a */
    public static void m48395a(DownloadChunk downloadChunk, SQLiteStatement sQLiteStatement) {
        if (downloadChunk != null && sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    if (sQLiteStatement != null) {
                        downloadChunk.f55032i = 0;
                        sQLiteStatement.clearBindings();
                        int i = downloadChunk.f55032i + 1;
                        downloadChunk.f55032i = i;
                        sQLiteStatement.bindLong(i, (long) downloadChunk.f55024a);
                        int i2 = downloadChunk.f55032i + 1;
                        downloadChunk.f55032i = i2;
                        sQLiteStatement.bindLong(i2, (long) downloadChunk.f55028e);
                        int i3 = downloadChunk.f55032i + 1;
                        downloadChunk.f55032i = i3;
                        sQLiteStatement.bindLong(i3, downloadChunk.f55025b);
                        int i4 = downloadChunk.f55032i + 1;
                        downloadChunk.f55032i = i4;
                        sQLiteStatement.bindLong(i4, downloadChunk.mo41800i());
                        int i5 = downloadChunk.f55032i + 1;
                        downloadChunk.f55032i = i5;
                        sQLiteStatement.bindLong(i5, downloadChunk.f55026c);
                        int i6 = downloadChunk.f55032i + 1;
                        downloadChunk.f55032i = i6;
                        sQLiteStatement.bindLong(i6, downloadChunk.f55027d);
                        int i7 = downloadChunk.f55032i + 1;
                        downloadChunk.f55032i = i7;
                        sQLiteStatement.bindLong(i7, (long) downloadChunk.mo41785a());
                    }
                    sQLiteStatement.executeInsert();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m48396a(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo != null && sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    downloadInfo.bindValue(sQLiteStatement);
                    sQLiteStatement.executeInsert();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo41249b(int i, List<DownloadChunk> list) {
        try {
            mo41258d(i);
            if (list != null) {
                for (DownloadChunk downloadChunk : list) {
                    if (downloadChunk != null) {
                        mo41242a(downloadChunk);
                        if (downloadChunk.mo41794d()) {
                            for (DownloadChunk a : downloadChunk.f55030g) {
                                mo41242a(a);
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo41272a(final SparseArray<DownloadInfo> sparseArray, final SparseArray<List<DownloadChunk>> sparseArray2, final C19798d dVar) {
        try {
            C198001 r0 = new Runnable() {
                /* JADX WARNING: Code restructure failed: missing block: B:114:0x01b0, code lost:
                    if (r4 == null) goto L_0x0329;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:116:0x01b6, code lost:
                    if (r4 != null) goto L_0x0320;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:168:0x0263, code lost:
                    if (r4 == null) goto L_0x0273;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:170:0x0268, code lost:
                    if (r4 != null) goto L_0x026a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:171:0x026a, code lost:
                    r4.mo41270a();
                    r1.f54503d.f54498d = true;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:172:0x0273, code lost:
                    r1.f54503d.mo41271a(r8, r9);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:173:0x0278, code lost:
                    throw r14;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:220:0x0319, code lost:
                    if (r4 == null) goto L_0x0329;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:222:0x031e, code lost:
                    if (r4 == null) goto L_0x0329;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:223:0x0320, code lost:
                    r4.mo41270a();
                    r1.f54503d.f54498d = true;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:224:0x0329, code lost:
                    r1.f54503d.mo41271a(r8, r9);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:225:0x032e, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ac, code lost:
                    if (r2.getCurBytes() <= 0) goto L_0x00ba;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
                    if (r2.isFileDataValid() == false) goto L_0x00ba;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cf, code lost:
                    if (r7.exists() == false) goto L_0x00d1;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:124:0x01c5 A[SYNTHETIC, Splitter:B:124:0x01c5] */
                /* JADX WARNING: Removed duplicated region for block: B:129:0x01d4 A[SYNTHETIC, Splitter:B:129:0x01d4] */
                /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5 A[Catch:{ Throwable -> 0x01bd, all -> 0x01ba }] */
                /* JADX WARNING: Removed duplicated region for block: B:52:0x00d4 A[Catch:{ Throwable -> 0x01bd, all -> 0x01ba }] */
                /* JADX WARNING: Removed duplicated region for block: B:53:0x00e4 A[Catch:{ Throwable -> 0x01bd, all -> 0x01ba }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r19 = this;
                        r1 = r19
                        com.ss.android.socialbase.downloader.c.e r0 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.this
                        r0.mo41275e()
                        android.database.sqlite.SQLiteDatabase r0 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.f54495a
                        if (r0 != 0) goto L_0x000c
                        return
                    L_0x000c:
                        android.util.SparseArray r0 = r2
                        if (r0 != 0) goto L_0x0015
                        android.util.SparseArray r0 = new android.util.SparseArray
                        r0.<init>()
                    L_0x0015:
                        r8 = r0
                        android.util.SparseArray r0 = r3
                        if (r0 != 0) goto L_0x001f
                        android.util.SparseArray r0 = new android.util.SparseArray
                        r0.<init>()
                    L_0x001f:
                        r9 = r0
                        com.ss.android.socialbase.downloader.downloader.l r0 = com.p683ss.android.socialbase.downloader.downloader.C19884b.m48619p()
                        android.util.SparseArray r5 = new android.util.SparseArray
                        r5.<init>()
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r4.<init>()
                        java.util.ArrayList r3 = new java.util.ArrayList
                        r3.<init>()
                        r2 = 0
                        r10 = 8192(0x2000, float:1.14794E-41)
                        r11 = 0
                        r12 = -3
                        r13 = 1
                        android.database.sqlite.SQLiteDatabase r6 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.f54495a     // Catch:{ Throwable -> 0x0279, all -> 0x01c0 }
                        java.lang.String r7 = "SELECT * FROM downloader"
                        android.database.Cursor r6 = r6.rawQuery(r7, r2)     // Catch:{ Throwable -> 0x0279, all -> 0x01c0 }
                    L_0x0041:
                        boolean r2 = r6.moveToNext()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        if (r2 == 0) goto L_0x0110
                        com.ss.android.socialbase.downloader.model.DownloadInfo r2 = new com.ss.android.socialbase.downloader.model.DownloadInfo     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        r2.<init>(r6)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        boolean r7 = r2.isCanResumeFromBreakPointStatus()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        if (r7 == 0) goto L_0x0056
                        r7 = -5
                        r2.setStatus(r7)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                    L_0x0056:
                        java.lang.String r7 = r2.getSavePath()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        if (r7 != 0) goto L_0x00d1
                        java.lang.String r7 = r2.getName()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        if (r7 == 0) goto L_0x006b
                        goto L_0x00d1
                    L_0x006b:
                        java.io.File r7 = new java.io.File     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        java.lang.String r14 = r2.getSavePath()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        java.lang.String r15 = r2.getName()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        r7.<init>(r14, r15)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        r14 = 131072(0x20000, float:1.83671E-40)
                        boolean r14 = com.p683ss.android.socialbase.downloader.p1221j.C19991b.m49327a(r14)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        r15 = 0
                        if (r14 == 0) goto L_0x00a0
                        int r14 = r2.getStatus()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        if (r14 != r13) goto L_0x0090
                        long r17 = r2.getCurBytes()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        int r14 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
                        if (r14 <= 0) goto L_0x00ba
                    L_0x0090:
                        int r14 = r2.getStatus()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        if (r14 == r12) goto L_0x00bc
                        boolean r14 = r2.isFileDataValid()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        if (r14 != 0) goto L_0x00bc
                        r2.reset()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        goto L_0x00bc
                    L_0x00a0:
                        int r14 = r2.getStatus()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        if (r14 != r13) goto L_0x00ae
                        long r17 = r2.getCurBytes()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        int r14 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
                        if (r14 <= 0) goto L_0x00ba
                    L_0x00ae:
                        int r14 = r2.getStatus()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        if (r14 == r12) goto L_0x00bc
                        boolean r14 = r2.isFileDataValid()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        if (r14 != 0) goto L_0x00bc
                    L_0x00ba:
                        r14 = 1
                        goto L_0x00bd
                    L_0x00bc:
                        r14 = 0
                    L_0x00bd:
                        r15 = 33554432(0x2000000, float:9.403955E-38)
                        boolean r15 = com.p683ss.android.socialbase.downloader.p1221j.C19991b.m49327a(r15)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        if (r15 == 0) goto L_0x00d2
                        int r15 = r2.getStatus()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        if (r15 != r12) goto L_0x00d2
                        boolean r7 = r7.exists()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        if (r7 != 0) goto L_0x00d2
                    L_0x00d1:
                        r14 = 1
                    L_0x00d2:
                        if (r14 == 0) goto L_0x00e4
                        int r7 = r2.getId()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        r4.add(r7)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        r3.add(r2)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        goto L_0x0041
                    L_0x00e4:
                        int r7 = r2.getId()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        if (r0 == 0) goto L_0x00f7
                        java.lang.String r14 = r2.getUrl()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        java.lang.String r15 = r2.getSavePath()     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        int r14 = r0.mo41565a(r14, r15)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        goto L_0x00f8
                    L_0x00f7:
                        r14 = 0
                    L_0x00f8:
                        if (r14 == r7) goto L_0x0100
                        r2.setId(r14)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        r5.put(r7, r2)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                    L_0x0100:
                        if (r8 == 0) goto L_0x0041
                        monitor-enter(r8)     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                        int r7 = r2.getId()     // Catch:{ all -> 0x010d }
                        r8.put(r7, r2)     // Catch:{ all -> 0x010d }
                        monitor-exit(r8)     // Catch:{ all -> 0x010d }
                        goto L_0x0041
                    L_0x010d:
                        r0 = move-exception
                        monitor-exit(r8)     // Catch:{ all -> 0x010d }
                        throw r0     // Catch:{ Throwable -> 0x01bd, all -> 0x01ba }
                    L_0x0110:
                        if (r6 == 0) goto L_0x0115
                        r6.close()     // Catch:{ Throwable -> 0x0115 }
                    L_0x0115:
                        com.p683ss.android.socialbase.downloader.p1213c.C19799e.m48397a(r3)
                        com.ss.android.socialbase.downloader.c.e r2 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.this
                        r6 = r8
                        r7 = r9
                        r2.mo41273a(r3, r4, r5, r6, r7)
                        if (r8 == 0) goto L_0x01b4
                        monitor-enter(r8)     // Catch:{ Throwable -> 0x01ae, all -> 0x019a }
                        java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0197 }
                        r0.<init>()     // Catch:{ all -> 0x0197 }
                    L_0x0127:
                        int r2 = r8.size()     // Catch:{ all -> 0x0197 }
                        if (r11 >= r2) goto L_0x017d
                        int r2 = r8.keyAt(r11)     // Catch:{ all -> 0x0197 }
                        if (r2 == 0) goto L_0x017a
                        java.lang.Object r2 = r8.get(r2)     // Catch:{ all -> 0x0197 }
                        com.ss.android.socialbase.downloader.model.DownloadInfo r2 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r2     // Catch:{ all -> 0x0197 }
                        boolean r3 = com.p683ss.android.socialbase.downloader.p1221j.C19991b.m49327a(r10)     // Catch:{ all -> 0x0197 }
                        if (r3 == 0) goto L_0x0160
                        if (r2 == 0) goto L_0x017a
                        boolean r3 = r2.isChunkBreakpointAvailable()     // Catch:{ all -> 0x0197 }
                        if (r3 != 0) goto L_0x017a
                        int r3 = r2.getStatus()     // Catch:{ all -> 0x0197 }
                        if (r3 == r12) goto L_0x017a
                        int r3 = r2.getId()     // Catch:{ all -> 0x0197 }
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0197 }
                        r0.add(r3)     // Catch:{ all -> 0x0197 }
                        int r2 = r2.getId()     // Catch:{ all -> 0x0197 }
                        r9.remove(r2)     // Catch:{ all -> 0x0197 }
                        goto L_0x017a
                    L_0x0160:
                        if (r2 == 0) goto L_0x017a
                        boolean r3 = r2.isChunkBreakpointAvailable()     // Catch:{ all -> 0x0197 }
                        if (r3 != 0) goto L_0x017a
                        int r3 = r2.getId()     // Catch:{ all -> 0x0197 }
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0197 }
                        r0.add(r3)     // Catch:{ all -> 0x0197 }
                        int r2 = r2.getId()     // Catch:{ all -> 0x0197 }
                        r9.remove(r2)     // Catch:{ all -> 0x0197 }
                    L_0x017a:
                        int r11 = r11 + 1
                        goto L_0x0127
                    L_0x017d:
                        java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0197 }
                    L_0x0181:
                        boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0197 }
                        if (r2 == 0) goto L_0x0195
                        java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0197 }
                        java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0197 }
                        int r2 = r2.intValue()     // Catch:{ all -> 0x0197 }
                        r8.remove(r2)     // Catch:{ all -> 0x0197 }
                        goto L_0x0181
                    L_0x0195:
                        monitor-exit(r8)     // Catch:{ all -> 0x0197 }
                        goto L_0x01b4
                    L_0x0197:
                        r0 = move-exception
                        monitor-exit(r8)     // Catch:{ all -> 0x0197 }
                        throw r0     // Catch:{ Throwable -> 0x01ae, all -> 0x019a }
                    L_0x019a:
                        r0 = move-exception
                        com.ss.android.socialbase.downloader.c.d r2 = r4
                        if (r2 == 0) goto L_0x01a8
                        com.ss.android.socialbase.downloader.c.d r2 = r4
                        r2.mo41270a()
                        com.ss.android.socialbase.downloader.c.e r2 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.this
                        r2.f54498d = r13
                    L_0x01a8:
                        com.ss.android.socialbase.downloader.c.e r2 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.this
                        r2.mo41271a(r8, r9)
                        throw r0
                    L_0x01ae:
                        com.ss.android.socialbase.downloader.c.d r0 = r4
                        if (r0 == 0) goto L_0x0329
                        goto L_0x0320
                    L_0x01b4:
                        com.ss.android.socialbase.downloader.c.d r0 = r4
                        if (r0 == 0) goto L_0x0329
                        goto L_0x0320
                    L_0x01ba:
                        r0 = move-exception
                        r14 = r0
                        goto L_0x01c3
                    L_0x01bd:
                        r2 = r6
                        goto L_0x0279
                    L_0x01c0:
                        r0 = move-exception
                        r14 = r0
                        r6 = r2
                    L_0x01c3:
                        if (r6 == 0) goto L_0x01c8
                        r6.close()     // Catch:{ Throwable -> 0x01c8 }
                    L_0x01c8:
                        com.p683ss.android.socialbase.downloader.p1213c.C19799e.m48397a(r3)
                        com.ss.android.socialbase.downloader.c.e r2 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.this
                        r6 = r8
                        r7 = r9
                        r2.mo41273a(r3, r4, r5, r6, r7)
                        if (r8 == 0) goto L_0x0266
                        monitor-enter(r8)     // Catch:{ Throwable -> 0x0261, all -> 0x024d }
                        java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x024a }
                        r0.<init>()     // Catch:{ all -> 0x024a }
                    L_0x01da:
                        int r2 = r8.size()     // Catch:{ all -> 0x024a }
                        if (r11 >= r2) goto L_0x0230
                        int r2 = r8.keyAt(r11)     // Catch:{ all -> 0x024a }
                        if (r2 == 0) goto L_0x022d
                        java.lang.Object r2 = r8.get(r2)     // Catch:{ all -> 0x024a }
                        com.ss.android.socialbase.downloader.model.DownloadInfo r2 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r2     // Catch:{ all -> 0x024a }
                        boolean r3 = com.p683ss.android.socialbase.downloader.p1221j.C19991b.m49327a(r10)     // Catch:{ all -> 0x024a }
                        if (r3 == 0) goto L_0x0213
                        if (r2 == 0) goto L_0x022d
                        boolean r3 = r2.isChunkBreakpointAvailable()     // Catch:{ all -> 0x024a }
                        if (r3 != 0) goto L_0x022d
                        int r3 = r2.getStatus()     // Catch:{ all -> 0x024a }
                        if (r3 == r12) goto L_0x022d
                        int r3 = r2.getId()     // Catch:{ all -> 0x024a }
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x024a }
                        r0.add(r3)     // Catch:{ all -> 0x024a }
                        int r2 = r2.getId()     // Catch:{ all -> 0x024a }
                        r9.remove(r2)     // Catch:{ all -> 0x024a }
                        goto L_0x022d
                    L_0x0213:
                        if (r2 == 0) goto L_0x022d
                        boolean r3 = r2.isChunkBreakpointAvailable()     // Catch:{ all -> 0x024a }
                        if (r3 != 0) goto L_0x022d
                        int r3 = r2.getId()     // Catch:{ all -> 0x024a }
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x024a }
                        r0.add(r3)     // Catch:{ all -> 0x024a }
                        int r2 = r2.getId()     // Catch:{ all -> 0x024a }
                        r9.remove(r2)     // Catch:{ all -> 0x024a }
                    L_0x022d:
                        int r11 = r11 + 1
                        goto L_0x01da
                    L_0x0230:
                        java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x024a }
                    L_0x0234:
                        boolean r2 = r0.hasNext()     // Catch:{ all -> 0x024a }
                        if (r2 == 0) goto L_0x0248
                        java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x024a }
                        java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x024a }
                        int r2 = r2.intValue()     // Catch:{ all -> 0x024a }
                        r8.remove(r2)     // Catch:{ all -> 0x024a }
                        goto L_0x0234
                    L_0x0248:
                        monitor-exit(r8)     // Catch:{ all -> 0x024a }
                        goto L_0x0266
                    L_0x024a:
                        r0 = move-exception
                        monitor-exit(r8)     // Catch:{ all -> 0x024a }
                        throw r0     // Catch:{ Throwable -> 0x0261, all -> 0x024d }
                    L_0x024d:
                        r0 = move-exception
                        com.ss.android.socialbase.downloader.c.d r2 = r4
                        if (r2 == 0) goto L_0x025b
                        com.ss.android.socialbase.downloader.c.d r2 = r4
                        r2.mo41270a()
                        com.ss.android.socialbase.downloader.c.e r2 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.this
                        r2.f54498d = r13
                    L_0x025b:
                        com.ss.android.socialbase.downloader.c.e r2 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.this
                        r2.mo41271a(r8, r9)
                        throw r0
                    L_0x0261:
                        com.ss.android.socialbase.downloader.c.d r0 = r4
                        if (r0 == 0) goto L_0x0273
                        goto L_0x026a
                    L_0x0266:
                        com.ss.android.socialbase.downloader.c.d r0 = r4
                        if (r0 == 0) goto L_0x0273
                    L_0x026a:
                        com.ss.android.socialbase.downloader.c.d r0 = r4
                        r0.mo41270a()
                        com.ss.android.socialbase.downloader.c.e r0 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.this
                        r0.f54498d = r13
                    L_0x0273:
                        com.ss.android.socialbase.downloader.c.e r0 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.this
                        r0.mo41271a(r8, r9)
                        throw r14
                    L_0x0279:
                        if (r2 == 0) goto L_0x027e
                        r2.close()     // Catch:{ Throwable -> 0x027e }
                    L_0x027e:
                        com.p683ss.android.socialbase.downloader.p1213c.C19799e.m48397a(r3)
                        com.ss.android.socialbase.downloader.c.e r2 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.this
                        r6 = r8
                        r7 = r9
                        r2.mo41273a(r3, r4, r5, r6, r7)
                        if (r8 == 0) goto L_0x031c
                        monitor-enter(r8)     // Catch:{ Throwable -> 0x0317, all -> 0x0303 }
                        java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0300 }
                        r0.<init>()     // Catch:{ all -> 0x0300 }
                    L_0x0290:
                        int r2 = r8.size()     // Catch:{ all -> 0x0300 }
                        if (r11 >= r2) goto L_0x02e6
                        int r2 = r8.keyAt(r11)     // Catch:{ all -> 0x0300 }
                        if (r2 == 0) goto L_0x02e3
                        java.lang.Object r2 = r8.get(r2)     // Catch:{ all -> 0x0300 }
                        com.ss.android.socialbase.downloader.model.DownloadInfo r2 = (com.p683ss.android.socialbase.downloader.model.DownloadInfo) r2     // Catch:{ all -> 0x0300 }
                        boolean r3 = com.p683ss.android.socialbase.downloader.p1221j.C19991b.m49327a(r10)     // Catch:{ all -> 0x0300 }
                        if (r3 == 0) goto L_0x02c9
                        if (r2 == 0) goto L_0x02e3
                        boolean r3 = r2.isChunkBreakpointAvailable()     // Catch:{ all -> 0x0300 }
                        if (r3 != 0) goto L_0x02e3
                        int r3 = r2.getStatus()     // Catch:{ all -> 0x0300 }
                        if (r3 == r12) goto L_0x02e3
                        int r3 = r2.getId()     // Catch:{ all -> 0x0300 }
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0300 }
                        r0.add(r3)     // Catch:{ all -> 0x0300 }
                        int r2 = r2.getId()     // Catch:{ all -> 0x0300 }
                        r9.remove(r2)     // Catch:{ all -> 0x0300 }
                        goto L_0x02e3
                    L_0x02c9:
                        if (r2 == 0) goto L_0x02e3
                        boolean r3 = r2.isChunkBreakpointAvailable()     // Catch:{ all -> 0x0300 }
                        if (r3 != 0) goto L_0x02e3
                        int r3 = r2.getId()     // Catch:{ all -> 0x0300 }
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0300 }
                        r0.add(r3)     // Catch:{ all -> 0x0300 }
                        int r2 = r2.getId()     // Catch:{ all -> 0x0300 }
                        r9.remove(r2)     // Catch:{ all -> 0x0300 }
                    L_0x02e3:
                        int r11 = r11 + 1
                        goto L_0x0290
                    L_0x02e6:
                        java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0300 }
                    L_0x02ea:
                        boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0300 }
                        if (r2 == 0) goto L_0x02fe
                        java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0300 }
                        java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0300 }
                        int r2 = r2.intValue()     // Catch:{ all -> 0x0300 }
                        r8.remove(r2)     // Catch:{ all -> 0x0300 }
                        goto L_0x02ea
                    L_0x02fe:
                        monitor-exit(r8)     // Catch:{ all -> 0x0300 }
                        goto L_0x031c
                    L_0x0300:
                        r0 = move-exception
                        monitor-exit(r8)     // Catch:{ all -> 0x0300 }
                        throw r0     // Catch:{ Throwable -> 0x0317, all -> 0x0303 }
                    L_0x0303:
                        r0 = move-exception
                        com.ss.android.socialbase.downloader.c.d r2 = r4
                        if (r2 == 0) goto L_0x0311
                        com.ss.android.socialbase.downloader.c.d r2 = r4
                        r2.mo41270a()
                        com.ss.android.socialbase.downloader.c.e r2 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.this
                        r2.f54498d = r13
                    L_0x0311:
                        com.ss.android.socialbase.downloader.c.e r2 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.this
                        r2.mo41271a(r8, r9)
                        throw r0
                    L_0x0317:
                        com.ss.android.socialbase.downloader.c.d r0 = r4
                        if (r0 == 0) goto L_0x0329
                        goto L_0x0320
                    L_0x031c:
                        com.ss.android.socialbase.downloader.c.d r0 = r4
                        if (r0 == 0) goto L_0x0329
                    L_0x0320:
                        com.ss.android.socialbase.downloader.c.d r0 = r4
                        r0.mo41270a()
                        com.ss.android.socialbase.downloader.c.e r0 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.this
                        r0.f54498d = r13
                    L_0x0329:
                        com.ss.android.socialbase.downloader.c.e r0 = com.p683ss.android.socialbase.downloader.p1213c.C19799e.this
                        r0.mo41271a(r8, r9)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1213c.C19799e.C198001.run():void");
                }
            };
            ExecutorService j = C19884b.m48613j();
            if (j != null) {
                j.execute(r0);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m48392a(int i, int i2, long j, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("curOffset", Long.valueOf(j));
                f54495a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2)});
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m48390a(int i, int i2, int i3, int i4, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("chunkIndex", Integer.valueOf(i4));
                f54495a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(i3)});
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m48391a(int i, int i2, int i3, long j, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("curOffset", Long.valueOf(j));
                f54495a.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(i3)});
            }
        } catch (Throwable unused) {
        }
    }
}
