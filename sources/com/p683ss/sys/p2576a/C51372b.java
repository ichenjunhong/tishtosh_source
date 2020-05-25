package com.p683ss.sys.p2576a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.sys.a.b */
public class C51372b {

    /* renamed from: a */
    private static Context f128465a;

    /* renamed from: b */
    private static volatile C51372b f128466b;

    /* renamed from: c */
    private SQLiteDatabase f128467c;

    /* renamed from: d */
    private C51371a f128468d;

    private C51372b(Context context) {
        if (context != null) {
            this.f128468d = new C51371a(context);
        }
    }

    /* renamed from: a */
    public static C51372b m110481a() {
        return f128466b;
    }

    /* renamed from: a */
    public static C51372b m110482a(Context context) {
        if (f128466b == null) {
            synchronized (C51372b.class) {
                if (f128466b == null && context != null) {
                    f128465a = context;
                    f128466b = new C51372b(context.getApplicationContext());
                }
            }
        }
        return f128466b;
    }

    /* renamed from: a */
    private static void m110483a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private void m110484b() {
        if (this.f128467c == null) {
            try {
                this.f128467c = this.f128468d.getWritableDatabase();
            } catch (Throwable unused) {
                this.f128467c = null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r0v17, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v20, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String[], ?[OBJECT, ARRAY]]
      uses: [java.lang.String[], ?[OBJECT, ARRAY][], android.database.Cursor]
      mth insns count: 67
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0093=Splitter:B:28:0x0093, B:32:0x0098=Splitter:B:32:0x0098} */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.String[] m110485b(long r16, java.lang.String r18, long r19) {
        /*
            r15 = this;
            r1 = r15
            r2 = r19
            monitor-enter(r15)
            r15.m110484b()     // Catch:{ all -> 0x009e }
            android.database.sqlite.SQLiteDatabase r0 = r1.f128467c     // Catch:{ all -> 0x009e }
            r4 = 0
            if (r0 == 0) goto L_0x009c
            android.database.sqlite.SQLiteDatabase r0 = r1.f128467c     // Catch:{ all -> 0x009e }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x009e }
            if (r0 != 0) goto L_0x0016
            goto L_0x009c
        L_0x0016:
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x009e }
            java.lang.String r5 = "log"
            r14 = 0
            r7[r14] = r5     // Catch:{ all -> 0x009e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            java.lang.String r6 = "time"
            r5.<init>(r6)     // Catch:{ all -> 0x009e }
            r6 = r18
            r5.append(r6)     // Catch:{ all -> 0x009e }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x009e }
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x009e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            r0.<init>()     // Catch:{ all -> 0x009e }
            r5 = r16
            r0.append(r5)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x009e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x009e }
            r9[r14] = r0     // Catch:{ all -> 0x009e }
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0064
            android.database.sqlite.SQLiteDatabase r5 = r1.f128467c     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = "MetaLog"
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r0.<init>()     // Catch:{ all -> 0x0062 }
            r0.append(r2)     // Catch:{ all -> 0x0062 }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x0062 }
            android.database.Cursor r0 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0062 }
            goto L_0x006f
        L_0x0062:
            r0 = move-exception
            goto L_0x0098
        L_0x0064:
            android.database.sqlite.SQLiteDatabase r5 = r1.f128467c     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = "MetaLog"
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r0 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0062 }
        L_0x006f:
            r2 = r0
            if (r2 == 0) goto L_0x0093
            int r0 = r2.getCount()     // Catch:{ all -> 0x0090 }
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0090 }
        L_0x0078:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = "log"
            int r0 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0090 }
            r3 = -1
            if (r0 == r3) goto L_0x0078
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0090 }
            r4[r14] = r0     // Catch:{ all -> 0x0090 }
            int r14 = r14 + 1
            goto L_0x0078
        L_0x0090:
            r0 = move-exception
            r4 = r2
            goto L_0x0098
        L_0x0093:
            m110483a(r2)     // Catch:{ all -> 0x009e }
            monitor-exit(r15)
            return r4
        L_0x0098:
            m110483a(r4)     // Catch:{ all -> 0x009e }
            throw r0     // Catch:{ all -> 0x009e }
        L_0x009c:
            monitor-exit(r15)
            return r4
        L_0x009e:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.p2576a.C51372b.m110485b(long, java.lang.String, long):java.lang.String[]");
    }

    /* renamed from: a */
    public final synchronized String mo102048a(long j, String str, long j2) {
        String str2;
        String sb;
        String str3 = "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append("[");
        String sb3 = sb2.toString();
        try {
            String[] b = m110485b(j, str, 100);
            int i = 0;
            while (i < b.length) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                sb4.append(b[i]);
                sb4.append(",");
                i++;
                sb3 = sb4.toString();
            }
            str2 = sb3.substring(0, sb3.length() - 1);
        } catch (Throwable unused) {
            str2 = sb3;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str2);
        sb5.append("]");
        sb = sb5.toString();
        try {
            JSONArray jSONArray = new JSONArray(sb);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", jSONArray);
            sb = jSONObject.toString();
        } catch (Throwable unused2) {
        }
        return sb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo102049a(long r5, java.lang.String r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.m110484b()     // Catch:{ all -> 0x0049 }
            android.database.sqlite.SQLiteDatabase r0 = r4.f128467c     // Catch:{ all -> 0x0049 }
            r1 = 0
            if (r0 == 0) goto L_0x0047
            android.database.sqlite.SQLiteDatabase r0 = r4.f128467c     // Catch:{ all -> 0x0049 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0047
        L_0x0012:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "time"
            r0.<init>(r2)     // Catch:{ all -> 0x0049 }
            r0.append(r7)     // Catch:{ all -> 0x0049 }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x0049 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r3.<init>()     // Catch:{ all -> 0x0049 }
            r3.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0049 }
            r2[r1] = r5     // Catch:{ all -> 0x0049 }
            android.database.sqlite.SQLiteDatabase r5 = r4.f128467c     // Catch:{ Throwable -> 0x003b }
            java.lang.String r6 = "MetaLog"
            int r5 = r5.delete(r6, r7, r2)     // Catch:{ Throwable -> 0x003b }
            long r5 = (long) r5
            goto L_0x003d
        L_0x003b:
            r5 = -1
        L_0x003d:
            r2 = 0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0045
            monitor-exit(r4)
            return r0
        L_0x0045:
            monitor-exit(r4)
            return r1
        L_0x0047:
            monitor-exit(r4)
            return r1
        L_0x0049:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.p2576a.C51372b.mo102049a(long, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo102050a(java.lang.String r4, long r5, java.lang.String r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.m110484b()     // Catch:{ all -> 0x0040 }
            android.database.sqlite.SQLiteDatabase r0 = r3.f128467c     // Catch:{ all -> 0x0040 }
            r1 = 0
            if (r0 == 0) goto L_0x003e
            android.database.sqlite.SQLiteDatabase r0 = r3.f128467c     // Catch:{ all -> 0x0040 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0012
            goto L_0x003e
        L_0x0012:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ all -> 0x0040 }
            r0.<init>()     // Catch:{ all -> 0x0040 }
            java.lang.String r2 = "tag"
            r0.put(r2, r4)     // Catch:{ all -> 0x0040 }
            java.lang.String r4 = "time"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0040 }
            r0.put(r4, r5)     // Catch:{ all -> 0x0040 }
            java.lang.String r4 = "log"
            r0.put(r4, r7)     // Catch:{ all -> 0x0040 }
            android.database.sqlite.SQLiteDatabase r4 = r3.f128467c     // Catch:{ all -> 0x0040 }
            java.lang.String r5 = "MetaLog"
            r6 = 0
            long r4 = r4.insert(r5, r6, r0)     // Catch:{ all -> 0x0040 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x003c
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x003c:
            monitor-exit(r3)
            return r1
        L_0x003e:
            monitor-exit(r3)
            return r1
        L_0x0040:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.p2576a.C51372b.mo102050a(java.lang.String, long, java.lang.String):boolean");
    }
}
