package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.C2240a;
import com.google.android.gms.analytics.C15098l;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15520k;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.ad */
final class C16533ad extends C16860r implements Closeable {

    /* renamed from: a */
    static final String f46454a = C2240a.m6772a("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});

    /* renamed from: c */
    private static final String f46455c = C2240a.m6772a("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});

    /* renamed from: d */
    private final C16534ae f46456d;

    /* renamed from: e */
    private final C16584ca f46457e = new C16584ca(mo32504f());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C16584ca f46458f = new C16584ca(mo32504f());

    C16533ad(C16862t tVar) {
        super(tVar);
        this.f46456d = new C16534ae(this, tVar.f47334a, "google_analytics_v4.db");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31765a() {
    }

    /* renamed from: b */
    public final void mo31768b() {
        mo32516r();
        mo31777v().beginTransaction();
    }

    /* renamed from: c */
    public final void mo31771c() {
        mo32516r();
        mo31777v().setTransactionSuccessful();
    }

    /* renamed from: d */
    public final void mo31773d() {
        mo32516r();
        mo31777v().endTransaction();
    }

    /* renamed from: a */
    public final void mo31766a(C16564bh bhVar) {
        String str;
        C15464q.m32123a(bhVar);
        C15098l.m31266b();
        mo32516r();
        C15464q.m32123a(bhVar);
        Builder builder = new Builder();
        for (Entry entry : bhVar.f46556a.entrySet()) {
            String str2 = (String) entry.getKey();
            if (!"ht".equals(str2) && !"qt".equals(str2) && !"AppUID".equals(str2)) {
                builder.appendQueryParameter(str2, (String) entry.getValue());
            }
        }
        String encodedQuery = builder.build().getEncodedQuery();
        if (encodedQuery == null) {
            encodedQuery = "";
        }
        if (encodedQuery.length() > 8192) {
            mo32507h().mo31826a(bhVar, "Hit length exceeds the maximum allowed size");
            return;
        }
        int intValue = ((Integer) C16559bc.f46523c.f46547a).intValue();
        long w = m39423w();
        if (w > ((long) (intValue - 1))) {
            List d = m39421d((w - ((long) intValue)) + 1);
            mo32498c("Store full, deleting hits to make room, count", Integer.valueOf(d.size()));
            mo31767a(d);
        }
        SQLiteDatabase v = mo31777v();
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_string", encodedQuery);
        contentValues.put("hit_time", Long.valueOf(bhVar.f46559d));
        contentValues.put("hit_app_id", Integer.valueOf(bhVar.f46560e));
        String str3 = "hit_url";
        if (bhVar.f46561f) {
            str = C16550au.m39486h();
        } else {
            str = C16550au.m39487i();
        }
        contentValues.put(str3, str);
        try {
            long insert = v.insert("hits2", null, contentValues);
            if (insert == -1) {
                mo32505f("Failed to insert a hit (got -1)");
            } else {
                mo32495b("Hit saved to database. db-id, hit", Long.valueOf(insert), bhVar);
            }
        } catch (SQLiteException e) {
            mo32501d("Error storing a hit", e);
        }
    }

    /* renamed from: w */
    private final long m39423w() {
        C15098l.m31266b();
        mo32516r();
        return m39417a("SELECT COUNT(*) FROM hits2", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo31774e() {
        return m39423w() == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.Long> m39421d(long r14) {
        /*
            r13 = this;
            com.google.android.gms.analytics.C15098l.m31266b()
            r13.mo32516r()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0011
            java.util.List r14 = java.util.Collections.emptyList()
            return r14
        L_0x0011:
            android.database.sqlite.SQLiteDatabase r0 = r13.mo31777v()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = 0
            java.lang.String r1 = "hits2"
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r4 = "hit_id"
            r11 = 0
            r3[r11] = r4     // Catch:{ SQLiteException -> 0x0069 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "%s ASC"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r12 = "hit_id"
            r2[r11] = r12     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r8 = com.C2240a.m6772a(r8, r2)     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r14 = java.lang.Long.toString(r14)     // Catch:{ SQLiteException -> 0x0069 }
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r14
            android.database.Cursor r14 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0069 }
            boolean r15 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0064, all -> 0x0061 }
            if (r15 == 0) goto L_0x005b
        L_0x004a:
            long r0 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x0064, all -> 0x0061 }
            java.lang.Long r15 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x0064, all -> 0x0061 }
            r9.add(r15)     // Catch:{ SQLiteException -> 0x0064, all -> 0x0061 }
            boolean r15 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0064, all -> 0x0061 }
            if (r15 != 0) goto L_0x004a
        L_0x005b:
            if (r14 == 0) goto L_0x0074
            r14.close()
            goto L_0x0074
        L_0x0061:
            r15 = move-exception
            r10 = r14
            goto L_0x0075
        L_0x0064:
            r15 = move-exception
            r10 = r14
            goto L_0x006a
        L_0x0067:
            r15 = move-exception
            goto L_0x0075
        L_0x0069:
            r15 = move-exception
        L_0x006a:
            java.lang.String r14 = "Error selecting hit ids"
            r13.mo32498c(r14, r15)     // Catch:{ all -> 0x0067 }
            if (r10 == 0) goto L_0x0074
            r10.close()
        L_0x0074:
            return r9
        L_0x0075:
            if (r10 == 0) goto L_0x007a
            r10.close()
        L_0x007a:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16533ad.m39421d(long):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a2 A[LOOP:0: B:10:0x005d->B:19:0x00a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7 A[EDGE_INSN: B:36:0x00a7->B:20:0x00a7 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.C16564bh> mo31764a(long r22) {
        /*
            r21 = this;
            r10 = r21
            r0 = 0
            r11 = 1
            r1 = 0
            int r5 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            com.google.android.gms.common.internal.C15464q.m32133b(r1)
            com.google.android.gms.analytics.C15098l.m31266b()
            r21.mo32516r()
            android.database.sqlite.SQLiteDatabase r12 = r21.mo31777v()
            r1 = 0
            java.lang.String r13 = "hits2"
            r2 = 5
            java.lang.String[] r14 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r2 = "hit_id"
            r14[r0] = r2     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r2 = "hit_time"
            r14[r11] = r2     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r2 = "hit_string"
            r9 = 2
            r14[r9] = r2     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r2 = "hit_url"
            r7 = 3
            r14[r7] = r2     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r2 = "hit_app_id"
            r8 = 4
            r14[r8] = r2     // Catch:{ SQLiteException -> 0x00b5 }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r2 = "%s ASC"
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r6 = "hit_id"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r19 = com.C2240a.m6772a(r2, r5)     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r20 = java.lang.Long.toString(r22)     // Catch:{ SQLiteException -> 0x00b5 }
            android.database.Cursor r12 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x00b5 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            r13.<init>()     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            boolean r1 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            if (r1 == 0) goto L_0x00a7
        L_0x005d:
            long r14 = r12.getLong(r0)     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            long r4 = r12.getLong(r11)     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            java.lang.String r1 = r12.getString(r9)     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            java.lang.String r2 = r12.getString(r7)     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            int r16 = r12.getInt(r8)     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            java.util.Map r3 = r10.m39420a(r1)     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            if (r1 == 0) goto L_0x007d
        L_0x007b:
            r6 = 1
            goto L_0x0087
        L_0x007d:
            java.lang.String r1 = "http:"
            boolean r1 = r2.startsWith(r1)     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            if (r1 != 0) goto L_0x0086
            goto L_0x007b
        L_0x0086:
            r6 = 0
        L_0x0087:
            com.google.android.gms.internal.measurement.bh r2 = new com.google.android.gms.internal.measurement.bh     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            r1 = r2
            r0 = r2
            r2 = r21
            r17 = 3
            r18 = 4
            r7 = r14
            r14 = 2
            r9 = r16
            r1.<init>(r2, r3, r4, r6, r7, r9)     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            r13.add(r0)     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            boolean r0 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x00b0, all -> 0x00ad }
            if (r0 != 0) goto L_0x00a2
            goto L_0x00a7
        L_0x00a2:
            r0 = 0
            r7 = 3
            r8 = 4
            r9 = 2
            goto L_0x005d
        L_0x00a7:
            if (r12 == 0) goto L_0x00ac
            r12.close()
        L_0x00ac:
            return r13
        L_0x00ad:
            r0 = move-exception
            r1 = r12
            goto L_0x00bc
        L_0x00b0:
            r0 = move-exception
            r1 = r12
            goto L_0x00b6
        L_0x00b3:
            r0 = move-exception
            goto L_0x00bc
        L_0x00b5:
            r0 = move-exception
        L_0x00b6:
            java.lang.String r2 = "Error loading hits from the database"
            r10.mo32501d(r2, r0)     // Catch:{ all -> 0x00b3 }
            throw r0     // Catch:{ all -> 0x00b3 }
        L_0x00bc:
            if (r1 == 0) goto L_0x00c1
            r1.close()
        L_0x00c1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16533ad.mo31764a(long):java.util.List");
    }

    /* renamed from: a */
    public final void mo31767a(List<Long> list) {
        C15464q.m32123a(list);
        C15098l.m31266b();
        mo32516r();
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder("hit_id");
            sb.append(" in (");
            for (int i = 0; i < list.size(); i++) {
                Long l = (Long) list.get(i);
                if (l == null || l.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(l);
            }
            sb.append(")");
            String sb2 = sb.toString();
            try {
                SQLiteDatabase v = mo31777v();
                mo32490a("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int delete = v.delete("hits2", sb2, null);
                if (delete != list.size()) {
                    mo32496b("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb2);
                }
            } catch (SQLiteException e) {
                mo32501d("Error deleting hits", e);
                throw e;
            }
        }
    }

    /* renamed from: b */
    public final void mo31769b(long j) {
        C15098l.m31266b();
        mo32516r();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        mo32490a("Deleting hit, id", Long.valueOf(j));
        mo31767a((List<Long>) arrayList);
    }

    /* renamed from: t */
    public final int mo31775t() {
        C15098l.m31266b();
        mo32516r();
        if (!this.f46457e.mo31858a(FbUploadTokenTime.group0)) {
            return 0;
        }
        this.f46457e.mo31857a();
        mo32493b("Deleting stale hits (if any)");
        int delete = mo31777v().delete("hits2", "hit_time < ?", new String[]{Long.toString(mo32504f().mo28523a() - 2592000000L)});
        mo32490a("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    /* renamed from: u */
    public final long mo31776u() {
        C15098l.m31266b();
        mo32516r();
        return m39418a(f46455c, (String[]) null, 0);
    }

    /* renamed from: a */
    public final long mo31763a(long j, String str, String str2) {
        C15464q.m32125a(str);
        C15464q.m32125a(str2);
        mo32516r();
        C15098l.m31266b();
        return m39418a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{String.valueOf(j), str, str2}, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.C16865w> mo31770c(long r26) {
        /*
            r25 = this;
            r1 = r25
            r25.mo32516r()
            com.google.android.gms.analytics.C15098l.m31266b()
            android.database.sqlite.SQLiteDatabase r2 = r25.mo31777v()
            r0 = 5
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r0 = "cid"
            r12 = 0
            r4[r12] = r0     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r0 = "tid"
            r13 = 1
            r4[r13] = r0     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r0 = "adid"
            r14 = 2
            r4[r14] = r0     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r0 = "hits_count"
            r15 = 3
            r4[r15] = r0     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r0 = "params"
            r10 = 4
            r4[r10] = r0     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            com.google.android.gms.internal.measurement.bd<java.lang.Integer> r0 = com.google.android.gms.internal.measurement.C16559bc.f46524d     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            V r0 = r0.f46547a     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            int r0 = r0.intValue()     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r16 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r5 = "app_uid=?"
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r3 = "0"
            r6[r12] = r3     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r3 = "properties"
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r10 = r16
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            if (r4 == 0) goto L_0x00a0
        L_0x0055:
            java.lang.String r4 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r5 = r2.getString(r13)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            int r6 = r2.getInt(r14)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            if (r6 == 0) goto L_0x0066
            r21 = 1
            goto L_0x0068
        L_0x0066:
            r21 = 0
        L_0x0068:
            int r6 = r2.getInt(r15)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r8 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            java.util.Map r24 = r1.m39422g(r8)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            if (r8 != 0) goto L_0x0095
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            if (r8 == 0) goto L_0x0082
            goto L_0x0095
        L_0x0082:
            com.google.android.gms.internal.measurement.w r8 = new com.google.android.gms.internal.measurement.w     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            r17 = 0
            r16 = r8
            r19 = r4
            r20 = r5
            r22 = r6
            r16.<init>(r17, r19, r20, r21, r22, r24)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            r3.add(r8)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            goto L_0x009a
        L_0x0095:
            java.lang.String r6 = "Read property with empty client id or tracker id"
            r1.mo32499c(r6, r4, r5)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
        L_0x009a:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            if (r4 != 0) goto L_0x0055
        L_0x00a0:
            int r4 = r3.size()     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            if (r4 < r0) goto L_0x00ab
            java.lang.String r0 = "Sending hits to too many properties. Campaign report might be incorrect"
            r1.mo32503e(r0)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
        L_0x00ab:
            if (r2 == 0) goto L_0x00b0
            r2.close()
        L_0x00b0:
            return r3
        L_0x00b1:
            r0 = move-exception
            r17 = r2
            goto L_0x00c7
        L_0x00b5:
            r0 = move-exception
            r11 = r2
            goto L_0x00be
        L_0x00b8:
            r0 = move-exception
            r17 = 0
            goto L_0x00c7
        L_0x00bc:
            r0 = move-exception
            r11 = 0
        L_0x00be:
            java.lang.String r2 = "Error loading hits from the database"
            r1.mo32501d(r2, r0)     // Catch:{ all -> 0x00c4 }
            throw r0     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r0 = move-exception
            r17 = r11
        L_0x00c7:
            if (r17 == 0) goto L_0x00cc
            r17.close()
        L_0x00cc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16533ad.mo31770c(long):java.util.List");
    }

    public final void close() {
        try {
            this.f46456d.close();
        } catch (SQLiteException e) {
            mo32501d("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            mo32501d("Error closing database", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0035  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m39417a(java.lang.String r4, java.lang.String[] r5) {
        /*
            r3 = this;
            android.database.sqlite.SQLiteDatabase r5 = r3.mo31777v()
            r0 = 0
            android.database.Cursor r5 = r5.rawQuery(r4, r0)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0026 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0024 }
            if (r0 == 0) goto L_0x001a
            r0 = 0
            long r0 = r5.getLong(r0)     // Catch:{ SQLiteException -> 0x0024 }
            if (r5 == 0) goto L_0x0019
            r5.close()
        L_0x0019:
            return r0
        L_0x001a:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x0024 }
            java.lang.String r1 = "Database returned empty set"
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x0024 }
            throw r0     // Catch:{ SQLiteException -> 0x0024 }
        L_0x0022:
            r4 = move-exception
            goto L_0x0033
        L_0x0024:
            r0 = move-exception
            goto L_0x002d
        L_0x0026:
            r4 = move-exception
            r5 = r0
            goto L_0x0033
        L_0x0029:
            r5 = move-exception
            r2 = r0
            r0 = r5
            r5 = r2
        L_0x002d:
            java.lang.String r1 = "Database error"
            r3.mo32502d(r1, r4, r0)     // Catch:{ all -> 0x0022 }
            throw r0     // Catch:{ all -> 0x0022 }
        L_0x0033:
            if (r5 == 0) goto L_0x0038
            r5.close()
        L_0x0038:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16533ad.m39417a(java.lang.String, java.lang.String[]):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0033  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m39418a(java.lang.String r1, java.lang.String[] r2, long r3) {
        /*
            r0 = this;
            android.database.sqlite.SQLiteDatabase r3 = r0.mo31777v()
            r4 = 0
            android.database.Cursor r2 = r3.rawQuery(r1, r2)     // Catch:{ SQLiteException -> 0x002a }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0025, all -> 0x0022 }
            if (r3 == 0) goto L_0x001a
            r3 = 0
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x0025, all -> 0x0022 }
            if (r2 == 0) goto L_0x0019
            r2.close()
        L_0x0019:
            return r3
        L_0x001a:
            if (r2 == 0) goto L_0x001f
            r2.close()
        L_0x001f:
            r1 = 0
            return r1
        L_0x0022:
            r1 = move-exception
            r4 = r2
            goto L_0x0031
        L_0x0025:
            r3 = move-exception
            r4 = r2
            goto L_0x002b
        L_0x0028:
            r1 = move-exception
            goto L_0x0031
        L_0x002a:
            r3 = move-exception
        L_0x002b:
            java.lang.String r2 = "Database error"
            r0.mo32502d(r2, r1, r3)     // Catch:{ all -> 0x0028 }
            throw r3     // Catch:{ all -> 0x0028 }
        L_0x0031:
            if (r4 == 0) goto L_0x0036
            r4.close()
        L_0x0036:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16533ad.m39418a(java.lang.String, java.lang.String[], long):long");
    }

    /* renamed from: a */
    private final Map<String, String> m39420a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                String str2 = "?";
                String valueOf = String.valueOf(str);
                str = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            return C15520k.m32288a(new URI(str), "UTF-8");
        } catch (URISyntaxException e) {
            mo32501d("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    /* renamed from: g */
    private final Map<String, String> m39422g(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        String str2 = "?";
        try {
            String valueOf = String.valueOf(str);
            return C15520k.m32288a(new URI(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)), "UTF-8");
        } catch (URISyntaxException e) {
            mo32501d("Error parsing property parameters", e);
            return new HashMap(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final SQLiteDatabase mo31777v() {
        try {
            return this.f46456d.getWritableDatabase();
        } catch (SQLiteException e) {
            mo32498c("Error opening database", e);
            throw e;
        }
    }
}
