package com.bytedance.p582g.p583a.p585b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.p582g.p583a.p585b.p587b.C9957a;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.g.a.b.c */
public final class C9958c {

    /* renamed from: a */
    static boolean f27051a = false;

    /* renamed from: b */
    static boolean f27052b = false;

    /* renamed from: c */
    static long f27053c = 5000;

    /* renamed from: d */
    static final String[] f27054d = {"_id", "data"};

    /* renamed from: j */
    private static C9958c f27055j;

    /* renamed from: k */
    private static String f27056k = "SELECT count(*) FROM monitor_log WHERE aid = ?";

    /* renamed from: l */
    private static String f27057l = "SELECT count(*) FROM monitor_log";

    /* renamed from: e */
    String f27058e = "INSERT INTO monitor_log(aid,type,type2,time,data) VALUES ( ?, ?, ?, ?, ?)";

    /* renamed from: f */
    private Map<String, Integer> f27059f = new HashMap(2);

    /* renamed from: g */
    private int f27060g = 0;

    /* renamed from: h */
    private Context f27061h;

    /* renamed from: i */
    private SQLiteDatabase f27062i;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17925a(java.lang.String r7, java.util.List<com.bytedance.p582g.p583a.p585b.p587b.C9957a> r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            android.database.sqlite.SQLiteDatabase r0 = r6.f27062i     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0089
            boolean r0 = com.bytedance.p582g.p583a.p585b.p590e.C9979b.m20068a(r8)     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x000d
            goto L_0x0089
        L_0x000d:
            r6.m20030b()     // Catch:{ all -> 0x008b }
            android.database.sqlite.SQLiteDatabase r0 = r6.f27062i     // Catch:{ all -> 0x008b }
            r0.beginTransaction()     // Catch:{ all -> 0x008b }
            android.database.sqlite.SQLiteDatabase r0 = r6.f27062i     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            java.lang.String r1 = r6.f27058e     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r1)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
        L_0x0021:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            com.bytedance.g.a.b.b.a r2 = (com.bytedance.p582g.p583a.p585b.p587b.C9957a) r2     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 1
            java.lang.String r4 = r2.f27046b     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r0.bindString(r3, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 2
            java.lang.String r4 = r2.f27047c     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = ""
            goto L_0x0041
        L_0x003f:
            java.lang.String r4 = r2.f27047c     // Catch:{ Exception -> 0x0082, all -> 0x007b }
        L_0x0041:
            r0.bindString(r3, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 3
            java.lang.String r4 = r2.f27048d     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            if (r4 != 0) goto L_0x004c
            java.lang.String r4 = ""
            goto L_0x004e
        L_0x004c:
            java.lang.String r4 = r2.f27048d     // Catch:{ Exception -> 0x0082, all -> 0x007b }
        L_0x004e:
            r0.bindString(r3, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 4
            long r4 = r2.f27050f     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r0.bindLong(r3, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 5
            java.lang.String r4 = r2.f27049e     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            if (r4 != 0) goto L_0x005f
            java.lang.String r2 = ""
            goto L_0x0061
        L_0x005f:
            java.lang.String r2 = r2.f27049e     // Catch:{ Exception -> 0x0082, all -> 0x007b }
        L_0x0061:
            r0.bindString(r3, r2)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r0.executeInsert()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            goto L_0x0021
        L_0x0068:
            android.database.sqlite.SQLiteDatabase r0 = r6.f27062i     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r0.setTransactionSuccessful()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            int r8 = r8.size()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r6.m20028a(r7, r8)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            android.database.sqlite.SQLiteDatabase r7 = r6.f27062i     // Catch:{ all -> 0x008b }
            r7.endTransaction()     // Catch:{ all -> 0x008b }
            monitor-exit(r6)
            return
        L_0x007b:
            r7 = move-exception
            android.database.sqlite.SQLiteDatabase r8 = r6.f27062i     // Catch:{ all -> 0x008b }
            r8.endTransaction()     // Catch:{ all -> 0x008b }
            throw r7     // Catch:{ all -> 0x008b }
        L_0x0082:
            android.database.sqlite.SQLiteDatabase r7 = r6.f27062i     // Catch:{ all -> 0x008b }
            r7.endTransaction()     // Catch:{ all -> 0x008b }
            monitor-exit(r6)
            return
        L_0x0089:
            monitor-exit(r6)
            return
        L_0x008b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p585b.C9958c.mo17925a(java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0039, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int m20024a() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.database.sqlite.SQLiteDatabase r0 = r4.f27062i     // Catch:{ all -> 0x003a }
            r1 = -1
            if (r0 == 0) goto L_0x0038
            android.database.sqlite.SQLiteDatabase r0 = r4.f27062i     // Catch:{ all -> 0x003a }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0038
        L_0x000f:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.f27062i     // Catch:{ Exception -> 0x0033, all -> 0x002e }
            java.lang.String r3 = f27057l     // Catch:{ Exception -> 0x0033, all -> 0x002e }
            android.database.Cursor r2 = r2.rawQuery(r3, r0)     // Catch:{ Exception -> 0x0033, all -> 0x002e }
            boolean r0 = r2.moveToNext()     // Catch:{ Exception -> 0x002c, all -> 0x0028 }
            if (r0 == 0) goto L_0x0024
            r0 = 0
            int r0 = r2.getInt(r0)     // Catch:{ Exception -> 0x002c, all -> 0x0028 }
            r1 = r0
        L_0x0024:
            m20027a(r2)     // Catch:{ all -> 0x003a }
            goto L_0x0036
        L_0x0028:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L_0x002f
        L_0x002c:
            r0 = r2
            goto L_0x0033
        L_0x002e:
            r1 = move-exception
        L_0x002f:
            m20027a(r0)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x003a }
        L_0x0033:
            m20027a(r0)     // Catch:{ all -> 0x003a }
        L_0x0036:
            monitor-exit(r4)
            return r1
        L_0x0038:
            monitor-exit(r4)
            return r1
        L_0x003a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p585b.C9958c.m20024a():int");
    }

    /* renamed from: b */
    private synchronized void m20030b() {
        if (!f27052b) {
            f27052b = true;
            if (((long) m20024a()) >= f27053c) {
                m20026a(500);
            }
        }
        if (!f27051a) {
            f27051a = true;
            m20031c("psdkmon");
        }
    }

    /* renamed from: a */
    private static void m20027a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    private C9958c(Context context) {
        this.f27061h = context;
        this.f27062i = C9952a.m20002a(context).getWritableDatabase();
    }

    /* renamed from: a */
    public static C9958c m20025a(Context context) {
        if (f27055j == null) {
            synchronized (C9952a.class) {
                if (f27055j == null) {
                    f27055j = new C9958c(context);
                }
            }
        }
        return f27055j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
        return -1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0029 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int m20029b(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.database.sqlite.SQLiteDatabase r0 = r7.f27062i     // Catch:{ all -> 0x003d }
            r1 = -1
            if (r0 == 0) goto L_0x003b
            android.database.sqlite.SQLiteDatabase r0 = r7.f27062i     // Catch:{ all -> 0x003d }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x000f
            goto L_0x003b
        L_0x000f:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.f27062i     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            java.lang.String r3 = f27056k     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            r5 = 0
            r4[r5] = r8     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            android.database.Cursor r8 = r2.rawQuery(r3, r4)     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            boolean r0 = r8.moveToNext()     // Catch:{ Exception -> 0x0029, all -> 0x002d }
            if (r0 == 0) goto L_0x0029
            int r0 = r8.getInt(r5)     // Catch:{ Exception -> 0x0029, all -> 0x002d }
            r1 = r0
        L_0x0029:
            m20027a(r8)     // Catch:{ all -> 0x003d }
            goto L_0x0039
        L_0x002d:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L_0x0033
        L_0x0032:
            r8 = move-exception
        L_0x0033:
            m20027a(r0)     // Catch:{ all -> 0x003d }
            throw r8     // Catch:{ all -> 0x003d }
        L_0x0037:
            r8 = r0
            goto L_0x0029
        L_0x0039:
            monitor-exit(r7)
            return r1
        L_0x003b:
            monitor-exit(r7)
            return r1
        L_0x003d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p585b.C9958c.m20029b(java.lang.String):int");
    }

    /* renamed from: c */
    private void m20031c(String str) {
        try {
            Context context = this.f27061h;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".db");
            File databasePath = context.getDatabasePath(sb.toString());
            if (databasePath.exists()) {
                databasePath.delete();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private synchronized void m20026a(long j) {
        if (this.f27062i != null) {
            try {
                StringBuilder sb = new StringBuilder(" DELETE FROM monitor_log WHERE _id IN (SELECT _id FROM monitor_log ORDER BY _id ASC LIMIT ");
                sb.append(500);
                sb.append(")");
                this.f27062i.execSQL(sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final synchronized int mo17922a(String str) {
        int i;
        if (this.f27060g <= 10) {
            if (this.f27059f.containsKey(str)) {
                i = ((Integer) this.f27059f.get(str)).intValue();
                this.f27060g++;
            }
        }
        int b = m20029b(str);
        this.f27059f.put(str, Integer.valueOf(b));
        this.f27060g = 0;
        i = b;
        return i;
    }

    /* renamed from: a */
    private void m20028a(String str, int i) {
        if (this.f27059f.containsKey(str) || i <= 0) {
            this.f27059f.put(str, Integer.valueOf(Math.max(0, i + ((Integer) this.f27059f.get(str)).intValue())));
            return;
        }
        this.f27059f.put(str, Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo17923a(java.lang.String r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.database.sqlite.SQLiteDatabase r0 = r3.f27062i     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002a
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            java.lang.String r0 = "aid = ? AND _id<= ? "
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x002d }
            r2 = 0
            r1[r2] = r4     // Catch:{ all -> 0x002d }
            r2 = 1
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x002d }
            r1[r2] = r5     // Catch:{ all -> 0x002d }
            android.database.sqlite.SQLiteDatabase r5 = r3.f27062i     // Catch:{ all -> 0x002d }
            java.lang.String r6 = "monitor_log"
            int r5 = r5.delete(r6, r0, r1)     // Catch:{ all -> 0x002d }
            int r6 = r5 * -1
            r3.m20028a(r4, r6)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r5
        L_0x002a:
            monitor-exit(r3)
            r4 = -1
            return r4
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p582g.p583a.p585b.C9958c.mo17923a(java.lang.String, long):int");
    }

    /* renamed from: a */
    public final List<C9957a> mo17924a(int i, int i2) {
        Cursor cursor;
        try {
            String[] strArr = {String.valueOf(i)};
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            cursor = this.f27062i.query("monitor_log", f27054d, "aid= ?", strArr, null, null, "_id ASC ", sb.toString());
            try {
                if (cursor.getCount() == 0) {
                    m20027a(cursor);
                    return null;
                }
                LinkedList linkedList = new LinkedList();
                while (cursor.moveToNext()) {
                    linkedList.add(new C9957a(cursor.getLong(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("data"))));
                }
                m20027a(cursor);
                return linkedList;
            } catch (Throwable th) {
                th = th;
                m20027a(cursor);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            m20027a(cursor);
            throw th;
        }
    }
}
