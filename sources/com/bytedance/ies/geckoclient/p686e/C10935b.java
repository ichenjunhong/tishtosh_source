package com.bytedance.ies.geckoclient.p686e;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.p616h.p617a.C10170a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.bytedance.ies.geckoclient.e.b */
public final class C10935b {

    /* renamed from: com.bytedance.ies.geckoclient.e.b$a */
    static class C10937a {

        /* renamed from: a */
        String f29347a;

        /* renamed from: b */
        String f29348b;

        /* renamed from: c */
        int f29349c;

        /* renamed from: d */
        int f29350d;

        /* renamed from: e */
        File f29351e;

        /* renamed from: f */
        File f29352f;

        public C10937a(String str, String str2, int i, int i2, File file, File file2) {
            this.f29347a = str;
            this.f29348b = str2;
            this.f29349c = i;
            this.f29350d = i2;
            this.f29351e = file;
            this.f29352f = file2;
        }
    }

    /* renamed from: a */
    private static List<String> m22192a(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            try {
                arrayList.add(rawQuery.getString(rawQuery.getColumnIndex(LeakCanaryFileProvider.f132049i)));
            } catch (Exception unused) {
            } catch (Throwable th) {
                C10170a.m20497a(rawQuery);
                throw th;
            }
        }
        C10170a.m20497a(rawQuery);
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        com.bytedance.p616h.p617a.C10170a.m20497a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e8, code lost:
        if (r2 != null) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f6, code lost:
        if (r2 == null) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f8, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01fb, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d5 A[ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:35:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.bytedance.ies.geckoclient.p686e.C10935b.C10937a> m22191a(android.content.Context r25, java.util.Map<java.lang.String, com.bytedance.ies.geckoclient.model.C10952b.C10954b> r26, java.io.File r27) {
        /*
            r0 = r27
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r25 == 0) goto L_0x01fc
            if (r26 == 0) goto L_0x01fc
            boolean r4 = r26.isEmpty()
            if (r4 != 0) goto L_0x01fc
            if (r0 != 0) goto L_0x0015
            goto L_0x01fc
        L_0x0015:
            com.bytedance.h.a.b r2 = com.bytedance.p616h.p617a.C10171b.m20499a(r25)     // Catch:{ Exception -> 0x01f5, all -> 0x01ed }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ Exception -> 0x01f5, all -> 0x01ed }
            r2.beginTransaction()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            java.util.List r13 = m22192a(r2)     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            java.util.Set r3 = r26.entrySet()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
        L_0x002c:
            boolean r5 = r3.hasNext()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            if (r5 == 0) goto L_0x01e5
            java.lang.Object r5 = r3.next()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            java.lang.Object r6 = r5.getKey()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            r15 = r6
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            java.io.File r14 = new java.io.File     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            r14.<init>(r0, r15)     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            boolean r6 = r14.isDirectory()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            if (r6 == 0) goto L_0x002c
            java.lang.Object r5 = r5.getValue()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            com.bytedance.ies.geckoclient.model.b$b r5 = (com.bytedance.ies.geckoclient.model.C10952b.C10954b) r5     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            if (r5 == 0) goto L_0x002c
            java.util.List<com.bytedance.ies.geckoclient.model.b$a> r5 = r5.f29392a     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            if (r5 == 0) goto L_0x002c
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            if (r6 != 0) goto L_0x002c
            java.util.Iterator r6 = r13.iterator()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
        L_0x0060:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            if (r7 == 0) goto L_0x0075
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            boolean r8 = r7.endsWith(r15)     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            if (r8 == 0) goto L_0x0060
            r21 = r7
            goto L_0x0077
        L_0x0075:
            r21 = 0
        L_0x0077:
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            r12.<init>()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            java.util.Iterator r22 = r5.iterator()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
        L_0x0080:
            boolean r5 = r22.hasNext()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            if (r5 == 0) goto L_0x002c
            java.lang.Object r5 = r22.next()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            com.bytedance.ies.geckoclient.model.b$a r5 = (com.bytedance.ies.geckoclient.model.C10952b.C10953a) r5     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            if (r5 == 0) goto L_0x0080
            java.lang.String r11 = r5.f29385a     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            boolean r6 = r12.contains(r11)     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            if (r6 != 0) goto L_0x0080
            r12.add(r11)     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            int r10 = r5.f29386b     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            java.util.List<java.lang.Integer> r9 = r5.f29387c     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            r5 = 2
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            java.lang.String r5 = "version"
            r8 = 0
            r7[r8] = r5     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            java.lang.String r5 = "zip"
            r6 = 1
            r7[r6] = r5     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            java.lang.String r16 = "channel=?"
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            r6[r8] = r11     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            r17 = 0
            r18 = 0
            r19 = 0
            r5 = r2
            r20 = r6
            r6 = r21
            r4 = 0
            r8 = r16
            r4 = r9
            r9 = r20
            r20 = r10
            r10 = r17
            r23 = r11
            r11 = r18
            r24 = r12
            r12 = r19
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            boolean r6 = r5.moveToNext()     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            if (r6 != 0) goto L_0x00dc
            com.bytedance.p616h.p617a.C10170a.m20497a(r5)     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            goto L_0x01e1
        L_0x00dc:
            java.lang.String r6 = "version"
            int r6 = r5.getColumnIndex(r6)     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            int r6 = r5.getInt(r6)     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            java.lang.String r7 = "zip"
            int r7 = r5.getColumnIndex(r7)     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            java.lang.String r7 = r5.getString(r7)     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            switch(r20) {
                case 1: goto L_0x0186;
                case 2: goto L_0x0133;
                case 3: goto L_0x00f7;
                default: goto L_0x00f3;
            }     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
        L_0x00f3:
            r10 = r14
            r11 = r15
            goto L_0x01dc
        L_0x00f7:
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            r8 = r23
            r4.<init>(r14, r8)     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            r10.<init>()     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            r10.append(r8)     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            java.lang.String r11 = "--PendingDelete"
            r10.append(r11)     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            r9.<init>(r14, r10)     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            r4.renameTo(r9)     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            r4.<init>(r14, r7)     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            com.bytedance.ies.geckoclient.e.b$a r7 = new com.bytedance.ies.geckoclient.e.b$a     // Catch:{ Exception -> 0x01da, all -> 0x01d5 }
            r10 = r14
            r14 = r7
            r11 = r15
            r16 = r8
            r17 = r20
            r18 = r6
            r19 = r4
            r20 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r1.add(r7)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            goto L_0x01dc
        L_0x0133:
            r10 = r14
            r11 = r15
            r8 = r23
            if (r4 == 0) goto L_0x01dc
            int r9 = r4.size()     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            if (r9 != 0) goto L_0x0141
            goto L_0x01dc
        L_0x0141:
            r9 = 0
            java.lang.Object r4 = r4.get(r9)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            if (r4 <= r6) goto L_0x01dc
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r4.<init>(r10, r8)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r12.<init>()     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r12.append(r8)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            java.lang.String r14 = "--PendingDelete"
            r12.append(r14)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r9.<init>(r10, r12)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r4.renameTo(r9)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r4.<init>(r10, r7)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            com.bytedance.ies.geckoclient.e.b$a r7 = new com.bytedance.ies.geckoclient.e.b$a     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r14 = r7
            r15 = r11
            r16 = r8
            r17 = r20
            r18 = r6
            r19 = r4
            r20 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r1.add(r7)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            goto L_0x01dc
        L_0x0186:
            r10 = r14
            r11 = r15
            r8 = r23
            if (r4 == 0) goto L_0x01dc
            int r9 = r4.size()     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            if (r9 != 0) goto L_0x0193
            goto L_0x01dc
        L_0x0193:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            boolean r4 = r4.contains(r9)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            if (r4 == 0) goto L_0x01dc
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r4.<init>(r10, r8)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r12.<init>()     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r12.append(r8)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            java.lang.String r14 = "--PendingDelete"
            r12.append(r14)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r9.<init>(r10, r12)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r4.renameTo(r9)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r4.<init>(r10, r7)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            com.bytedance.ies.geckoclient.e.b$a r7 = new com.bytedance.ies.geckoclient.e.b$a     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r14 = r7
            r15 = r11
            r16 = r8
            r17 = r20
            r18 = r6
            r19 = r4
            r20 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            r1.add(r7)     // Catch:{ Exception -> 0x01dc, all -> 0x01d5 }
            goto L_0x01dc
        L_0x01d5:
            r0 = move-exception
            com.bytedance.p616h.p617a.C10170a.m20497a(r5)     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            throw r0     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
        L_0x01da:
            r10 = r14
            r11 = r15
        L_0x01dc:
            com.bytedance.p616h.p617a.C10170a.m20497a(r5)     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            r14 = r10
            r15 = r11
        L_0x01e1:
            r12 = r24
            goto L_0x0080
        L_0x01e5:
            r2.setTransactionSuccessful()     // Catch:{ Exception -> 0x01f6, all -> 0x01eb }
            if (r2 == 0) goto L_0x01fb
            goto L_0x01f8
        L_0x01eb:
            r0 = move-exception
            goto L_0x01ef
        L_0x01ed:
            r0 = move-exception
            r2 = 0
        L_0x01ef:
            if (r2 == 0) goto L_0x01f4
            r2.endTransaction()
        L_0x01f4:
            throw r0
        L_0x01f5:
            r2 = 0
        L_0x01f6:
            if (r2 == 0) goto L_0x01fb
        L_0x01f8:
            r2.endTransaction()
        L_0x01fb:
            return r1
        L_0x01fc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.p686e.C10935b.m22191a(android.content.Context, java.util.Map, java.io.File):java.util.List");
    }
}
