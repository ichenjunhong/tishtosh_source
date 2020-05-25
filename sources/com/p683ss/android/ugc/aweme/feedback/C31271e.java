package com.p683ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;

/* renamed from: com.ss.android.ugc.aweme.feedback.e */
public final class C31271e {

    /* renamed from: c */
    public static C31271e f81942c;

    /* renamed from: d */
    public static Object f81943d = new Object();

    /* renamed from: f */
    private static final String[] f81944f = {"item_id", "timestamp", C42311c.f106865i, "image_url", "avatar_url", "image_width", "image_height", "type", "links"};

    /* renamed from: a */
    public SQLiteDatabase f81945a;

    /* renamed from: b */
    public volatile boolean f81946b;

    /* renamed from: e */
    private final Context f81947e;

    /* renamed from: com.ss.android.ugc.aweme.feedback.e$a */
    static class C31272a extends SQLiteOpenHelper {
        C31272a(Context context) {
            super(context, "feedback.db", null, 2);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE feedback (auto_id INTEGER PRIMARY KEY AUTOINCREMENT,item_id INTEGER NOT NULL,timestamp INTEGER NOT NULL DEFAULT 0,content VARCHAR,image_url VARCHAR,avatar_url VARCHAR,image_width INTEGER NOT NULL DEFAULT 0,image_height INTEGER NOT NULL DEFAULT 0,type INTEGER NOT NULL DEFAULT 0,links VARCHAR )");
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i < 2) {
                try {
                    sQLiteDatabase.execSQL("ALTER TABLE feedback ADD COLUMN links VARCHAR");
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m72997c() {
        if (this.f81946b) {
            return false;
        }
        if (this.f81945a == null) {
            this.f81945a = m72996b(this.f81947e);
        }
        if (this.f81945a == null || !this.f81945a.isOpen()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo64164a() {
        if (m72997c()) {
            try {
                this.f81945a.delete("feedback", null, null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|(0)|25|26) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d A[SYNTHETIC, Splitter:B:23:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0043 A[SYNTHETIC, Splitter:B:29:0x0043] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.p683ss.android.ugc.aweme.feedback.C31274g> mo64166b() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0048 }
            r0.<init>()     // Catch:{ all -> 0x0048 }
            boolean r1 = r10.m72997c()     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x000e
            monitor-exit(r10)
            return r0
        L_0x000e:
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.f81945a     // Catch:{ Exception -> 0x0041, all -> 0x003a }
            java.lang.String r3 = "feedback"
            java.lang.String[] r4 = f81944f     // Catch:{ Exception -> 0x0041, all -> 0x003a }
            java.lang.String r5 = "type == 2"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0041, all -> 0x003a }
        L_0x001f:
            if (r2 == 0) goto L_0x0034
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            if (r1 == 0) goto L_0x0034
            com.ss.android.ugc.aweme.feedback.g r1 = m72995a(r2)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            r0.add(r1)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            goto L_0x001f
        L_0x002f:
            r0 = move-exception
            r1 = r2
            goto L_0x003b
        L_0x0032:
            r1 = r2
            goto L_0x0041
        L_0x0034:
            if (r2 == 0) goto L_0x0046
            r2.close()     // Catch:{ Exception -> 0x0046 }
            goto L_0x0046
        L_0x003a:
            r0 = move-exception
        L_0x003b:
            if (r1 == 0) goto L_0x0040
            r1.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0041:
            if (r1 == 0) goto L_0x0046
            r1.close()     // Catch:{ Exception -> 0x0046 }
        L_0x0046:
            monitor-exit(r10)
            return r0
        L_0x0048:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feedback.C31271e.mo64166b():java.util.List");
    }

    private C31271e(Context context) {
        this.f81947e = context;
    }

    /* renamed from: b */
    private static SQLiteDatabase m72996b(Context context) {
        try {
            return new C31272a(context).getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C31271e m72994a(Context context) {
        synchronized (f81943d) {
            if (f81942c == null) {
                f81942c = new C31271e(context.getApplicationContext());
            }
        }
        return f81942c;
    }

    /* renamed from: a */
    private static C31274g m72995a(Cursor cursor) {
        C31274g gVar = new C31274g(cursor.getLong(0));
        gVar.f81951d = cursor.getLong(1);
        gVar.f81952e = cursor.getString(2);
        gVar.f81953f = cursor.getString(3);
        gVar.f81954g = cursor.getString(4);
        gVar.f81955h = cursor.getInt(5);
        gVar.f81956i = cursor.getInt(6);
        gVar.f81957j = cursor.getInt(7);
        gVar.f81958k = cursor.getString(8);
        return gVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:26|27|(0)|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x005d */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005a A[SYNTHETIC, Splitter:B:35:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0060 A[SYNTHETIC, Splitter:B:41:0x0060] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo64162a(boolean r16) {
        /*
            r15 = this;
            r1 = r15
            monitor-enter(r15)
            boolean r0 = r15.m72997c()     // Catch:{ all -> 0x0065 }
            r2 = -1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r15)
            return r2
        L_0x000c:
            r4 = 0
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.String r0 = "item_id"
            r14 = 0
            r7[r14] = r0     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.String r5 = "item_id"
            r0.<init>(r5)     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            if (r16 == 0) goto L_0x0021
            java.lang.String r5 = " DESC"
            goto L_0x0023
        L_0x0021:
            java.lang.String r5 = " ASC"
        L_0x0023:
            r0.append(r5)     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.String r12 = r0.toString()     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.String r8 = "type < 2"
            android.database.sqlite.SQLiteDatabase r5 = r1.f81945a     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.String r6 = "feedback"
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r13 = "1"
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            if (r5 == 0) goto L_0x0051
            boolean r0 = r5.moveToNext()     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            if (r0 == 0) goto L_0x0051
            long r6 = r5.getLong(r14)     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            if (r5 == 0) goto L_0x004a
            r5.close()     // Catch:{ Exception -> 0x004a }
        L_0x004a:
            monitor-exit(r15)
            return r6
        L_0x004c:
            r0 = move-exception
            r4 = r5
            goto L_0x0058
        L_0x004f:
            r4 = r5
            goto L_0x005e
        L_0x0051:
            if (r5 == 0) goto L_0x0063
            r5.close()     // Catch:{ Exception -> 0x0063 }
            goto L_0x0063
        L_0x0057:
            r0 = move-exception
        L_0x0058:
            if (r4 == 0) goto L_0x005d
            r4.close()     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x005e:
            if (r4 == 0) goto L_0x0063
            r4.close()     // Catch:{ Exception -> 0x0063 }
        L_0x0063:
            monitor-exit(r15)
            return r2
        L_0x0065:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feedback.C31271e.mo64162a(boolean):long");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:23|24|25|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c1, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00b6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00b7 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo64165a(java.util.List<com.p683ss.android.ugc.aweme.feedback.C31274g> r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.m72997c()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x00c0
            int r0 = r8.size()     // Catch:{ all -> 0x00c2 }
            if (r0 > 0) goto L_0x000f
            goto L_0x00c0
        L_0x000f:
            android.database.sqlite.SQLiteDatabase r0 = r7.f81945a     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            r0.beginTransaction()     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
        L_0x0018:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = r8.next()     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            com.ss.android.ugc.aweme.feedback.g r0 = (com.p683ss.android.ugc.aweme.feedback.C31274g) r0     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            r1.<init>()     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.String r2 = "item_id"
            long r3 = r0.f81949b     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.String r2 = "timestamp"
            long r3 = r0.f81951d     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.String r2 = "content"
            java.lang.String r3 = r0.f81952e     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.String r2 = "image_url"
            java.lang.String r3 = r0.f81953f     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.String r2 = "avatar_url"
            java.lang.String r3 = r0.f81954g     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.String r2 = "image_width"
            int r3 = r0.f81955h     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.String r2 = "image_height"
            int r3 = r0.f81956i     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.String r2 = "type"
            int r3 = r0.f81957j     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.String r2 = "links"
            java.lang.String r3 = r0.f81958k     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.String r2 = "item_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            r4 = 0
            long r5 = r0.f81949b     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            r3[r4] = r5     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            boolean r0 = r0.f81961n     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            if (r0 != 0) goto L_0x0098
            android.database.sqlite.SQLiteDatabase r0 = r7.f81945a     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.String r4 = "feedback"
            int r0 = r0.update(r4, r1, r2, r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            if (r0 > 0) goto L_0x0018
        L_0x0098:
            android.database.sqlite.SQLiteDatabase r0 = r7.f81945a     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            java.lang.String r2 = "feedback"
            r3 = 0
            r0.insert(r2, r3, r1)     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            goto L_0x0018
        L_0x00a2:
            android.database.sqlite.SQLiteDatabase r8 = r7.f81945a     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            r8.setTransactionSuccessful()     // Catch:{ Exception -> 0x00b7, all -> 0x00b0 }
            android.database.sqlite.SQLiteDatabase r8 = r7.f81945a     // Catch:{ Exception -> 0x00ae }
            r8.endTransaction()     // Catch:{ Exception -> 0x00ae }
            monitor-exit(r7)
            return
        L_0x00ae:
            monitor-exit(r7)
            return
        L_0x00b0:
            r8 = move-exception
            android.database.sqlite.SQLiteDatabase r0 = r7.f81945a     // Catch:{ Exception -> 0x00b6 }
            r0.endTransaction()     // Catch:{ Exception -> 0x00b6 }
        L_0x00b6:
            throw r8     // Catch:{ all -> 0x00c2 }
        L_0x00b7:
            android.database.sqlite.SQLiteDatabase r8 = r7.f81945a     // Catch:{ Exception -> 0x00be }
            r8.endTransaction()     // Catch:{ Exception -> 0x00be }
            monitor-exit(r7)
            return
        L_0x00be:
            monitor-exit(r7)
            return
        L_0x00c0:
            monitor-exit(r7)
            return
        L_0x00c2:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feedback.C31271e.mo64165a(java.util.List):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:30|31|(0)|41|42) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x009b */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098 A[SYNTHETIC, Splitter:B:39:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009e A[SYNTHETIC, Splitter:B:45:0x009e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.p683ss.android.ugc.aweme.feedback.C31274g> mo64163a(long r10, long r12, int r14, java.lang.String r15) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00a3 }
            r10.<init>()     // Catch:{ all -> 0x00a3 }
            boolean r11 = r9.m72997c()     // Catch:{ all -> 0x00a3 }
            if (r11 != 0) goto L_0x000e
            monitor-exit(r9)
            return r10
        L_0x000e:
            r11 = 0
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r0.<init>()     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0036
            int r1 = r0.length()     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            if (r1 <= 0) goto L_0x0025
            java.lang.String r1 = " AND "
            r0.append(r1)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
        L_0x0025:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            java.lang.String r2 = "item_id>"
            r1.<init>(r2)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r1.append(r12)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            java.lang.String r12 = r1.toString()     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r0.append(r12)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
        L_0x0036:
            int r12 = r0.length()     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            if (r12 <= 0) goto L_0x0041
            java.lang.String r12 = " AND "
            r0.append(r12)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
        L_0x0041:
            java.lang.String r12 = "type < 2"
            r0.append(r12)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            if (r14 <= 0) goto L_0x004e
            java.lang.String r12 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r8 = r12
            goto L_0x004f
        L_0x004e:
            r8 = r11
        L_0x004f:
            boolean r12 = com.bytedance.common.utility.C9431p.m18664a(r15)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            if (r12 == 0) goto L_0x0057
            java.lang.String r15 = " ASC"
        L_0x0057:
            android.database.sqlite.SQLiteDatabase r12 = r9.f81945a     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            java.lang.String r1 = "feedback"
            java.lang.String[] r2 = f81944f     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            java.lang.String r3 = r0.toString()     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            java.lang.String r14 = "item_id"
            r13.<init>(r14)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r13.append(r15)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            java.lang.String r7 = r13.toString()     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r0 = r12
            android.database.Cursor r12 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
        L_0x0077:
            if (r12 == 0) goto L_0x008f
            boolean r11 = r12.moveToNext()     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            if (r11 == 0) goto L_0x008f
            com.ss.android.ugc.aweme.feedback.g r11 = m72995a(r12)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r11.mo64169a()     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r10.add(r11)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            goto L_0x0077
        L_0x008a:
            r10 = move-exception
            r11 = r12
            goto L_0x0096
        L_0x008d:
            r11 = r12
            goto L_0x009c
        L_0x008f:
            if (r12 == 0) goto L_0x00a1
            r12.close()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00a1
        L_0x0095:
            r10 = move-exception
        L_0x0096:
            if (r11 == 0) goto L_0x009b
            r11.close()     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            throw r10     // Catch:{ all -> 0x00a3 }
        L_0x009c:
            if (r11 == 0) goto L_0x00a1
            r11.close()     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            monitor-exit(r9)
            return r10
        L_0x00a3:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feedback.C31271e.mo64163a(long, long, int, java.lang.String):java.util.List");
    }
}
