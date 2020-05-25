package com.p683ss.sys.p2577b;

import android.content.Context;
import com.p683ss.sys.p2577b.p2578a.C51374a;

/* renamed from: com.ss.sys.b.b */
public final class C51375b {

    /* renamed from: a */
    private C51374a f128476a;

    /* renamed from: b */
    private Context f128477b;

    C51375b(Context context, C51374a aVar) {
        this.f128476a = aVar;
        this.f128477b = context;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:46|45|57|58|59|60|61|62|63|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0143, code lost:
        if (r1 != 202) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0145, code lost:
        com.p683ss.sys.p2577b.C51373a.m110489a().f128472c = true;
        r0 = r6.getString("token_id");
        com.p683ss.sys.p2577b.C51373a.m110489a().f128474e = r0;
        com.p683ss.sys.ces.C51379a.meta(302, r9.f128477b, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0161, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0198, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x019a */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102054a() {
        /*
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = com.p683ss.p1096a.p1097a.C18477a.f50888a
            java.lang.String r2 = com.p683ss.p1096a.p1097a.C18477a.f50892e
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0015
            java.lang.String r1 = com.p683ss.p1096a.p1097a.C18477a.f50892e
            goto L_0x007e
        L_0x0015:
            int r2 = com.p683ss.p1096a.p1097a.C18477a.f50889b
            switch(r2) {
                case 2: goto L_0x0049;
                case 3: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x007e
        L_0x001b:
            int r2 = com.p683ss.p1096a.p1097a.C18477a.f50890c
            r3 = 1233(0x4d1, float:1.728E-42)
            if (r2 == r3) goto L_0x0035
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = new java.lang.String
            java.lang.String r3 = "736466702d73672e627974656f7665727365612e636f6d"
            byte[] r3 = com.p683ss.p1096a.p1098b.C18481a.m44726a(r3)
            r1.<init>(r3)
            goto L_0x0062
        L_0x0035:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = new java.lang.String
            java.lang.String r3 = "736466702d76612e6d75736963616c2e6c79"
            byte[] r3 = com.p683ss.p1096a.p1098b.C18481a.m44726a(r3)
            r1.<init>(r3)
            goto L_0x0062
        L_0x0049:
            int r2 = com.p683ss.p1096a.p1097a.C18477a.f50890c
            r3 = 1180(0x49c, float:1.654E-42)
            if (r2 == r3) goto L_0x006a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = new java.lang.String
            java.lang.String r3 = "736466702d73672e627974656f7665727365612e636f6d"
            byte[] r3 = com.p683ss.p1096a.p1098b.C18481a.m44726a(r3)
            r1.<init>(r3)
        L_0x0062:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x007e
        L_0x006a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = new java.lang.String
            java.lang.String r3 = "736466702d73672e74696b746f6b762e636f6d"
            byte[] r3 = com.p683ss.p1096a.p1098b.C18481a.m44726a(r3)
            r1.<init>(r3)
            goto L_0x0062
        L_0x007e:
            r2 = 0
            r3 = 504(0x1f8, float:7.06E-43)
            r4 = 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x019a }
            r5.<init>()     // Catch:{ Throwable -> 0x019a }
            r5.append(r1)     // Catch:{ Throwable -> 0x019a }
            java.lang.String r1 = "/v1/getInfo"
            r5.append(r1)     // Catch:{ Throwable -> 0x019a }
            java.lang.String r1 = r5.toString()     // Catch:{ Throwable -> 0x019a }
            com.ss.sys.ces.c r5 = com.p683ss.sys.ces.C51393c.m110533a()     // Catch:{ Throwable -> 0x019a }
            boolean r5 = r5.f128513a     // Catch:{ Throwable -> 0x019a }
            if (r5 == 0) goto L_0x00a2
            java.util.Calendar r5 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x019a }
            r5.getTimeInMillis()     // Catch:{ Throwable -> 0x019a }
        L_0x00a2:
            r5 = 301(0x12d, float:4.22E-43)
            android.content.Context r6 = r9.f128477b     // Catch:{ Throwable -> 0x019a }
            r7 = 0
            java.lang.Object r5 = com.p683ss.sys.ces.C51379a.meta(r5, r6, r7)     // Catch:{ Throwable -> 0x019a }
            byte[] r5 = (byte[]) r5     // Catch:{ Throwable -> 0x019a }
            byte[] r5 = (byte[]) r5     // Catch:{ Throwable -> 0x019a }
            com.ss.sys.ces.c r6 = com.p683ss.sys.ces.C51393c.m110533a()     // Catch:{ Throwable -> 0x019a }
            boolean r6 = r6.f128513a     // Catch:{ Throwable -> 0x019a }
            if (r6 == 0) goto L_0x00be
            java.util.Calendar r6 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x019a }
            r6.getTimeInMillis()     // Catch:{ Throwable -> 0x019a }
        L_0x00be:
            if (r5 == 0) goto L_0x0190
            int r6 = r5.length     // Catch:{ Throwable -> 0x019a }
            if (r6 <= 0) goto L_0x0190
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x019a }
            r6.<init>()     // Catch:{ Throwable -> 0x019a }
            r6.append(r1)     // Catch:{ Throwable -> 0x019a }
            java.lang.String r1 = "?os=android&app_id="
            r6.append(r1)     // Catch:{ Throwable -> 0x019a }
            com.ss.sys.b.a r1 = com.p683ss.sys.p2577b.C51373a.m110489a()     // Catch:{ Throwable -> 0x019a }
            long r7 = r1.f128473d     // Catch:{ Throwable -> 0x019a }
            r6.append(r7)     // Catch:{ Throwable -> 0x019a }
            java.lang.String r1 = "&did="
            r6.append(r1)     // Catch:{ Throwable -> 0x019a }
            java.lang.String r1 = com.p683ss.sys.ces.C51393c.m110538d()     // Catch:{ Throwable -> 0x019a }
            r6.append(r1)     // Catch:{ Throwable -> 0x019a }
            java.lang.String r1 = "&version_code=5"
            r6.append(r1)     // Catch:{ Throwable -> 0x019a }
            java.lang.String r1 = "&time="
            r6.append(r1)     // Catch:{ Throwable -> 0x019a }
            r6.append(r0)     // Catch:{ Throwable -> 0x019a }
            java.lang.String r0 = "&version=1.0.5"
            r6.append(r0)     // Catch:{ Throwable -> 0x019a }
            java.lang.String r0 = r6.toString()     // Catch:{ Throwable -> 0x019a }
        L_0x00fb:
            r1 = 3
            if (r2 >= r1) goto L_0x0162
            boolean r1 = com.p683ss.sys.ces.C51393c.f128502b     // Catch:{ Throwable -> 0x019a }
            if (r1 == 0) goto L_0x0107
            java.lang.String r1 = com.p683ss.sys.p2577b.p2579b.C51377b.m110496a(r0, r5)     // Catch:{ Throwable -> 0x019a }
            goto L_0x010b
        L_0x0107:
            java.lang.String r1 = com.p683ss.sys.p2577b.p2579b.C51376a.m110494a(r0, r5)     // Catch:{ Throwable -> 0x019a }
        L_0x010b:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x019a }
            r6.<init>(r1)     // Catch:{ Throwable -> 0x019a }
            java.lang.String r1 = "code"
            int r1 = r6.getInt(r1)     // Catch:{ Throwable -> 0x019a }
            r3 = 202(0xca, float:2.83E-43)
            r7 = 200(0xc8, float:2.8E-43)
            if (r1 == r7) goto L_0x012f
            if (r1 == r3) goto L_0x012f
            int r3 = r2 + 1
            int r6 = r3 * 3
            int r6 = r6 * 1000
            long r6 = (long) r6
            com.p683ss.p1096a.p1098b.C18484d.m44731a(r6)     // Catch:{ Throwable -> 0x015f, all -> 0x012b }
            r2 = r3
            r3 = r1
            goto L_0x00fb
        L_0x012b:
            r0 = move-exception
            r3 = r1
            goto L_0x01e3
        L_0x012f:
            if (r1 != r7) goto L_0x0143
            com.ss.sys.b.a r0 = com.p683ss.sys.p2577b.C51373a.m110489a()     // Catch:{ Throwable -> 0x015f, all -> 0x012b }
            r0.f128472c = r4     // Catch:{ Throwable -> 0x015f, all -> 0x012b }
            com.ss.sys.b.a r0 = com.p683ss.sys.p2577b.C51373a.m110489a()     // Catch:{ Throwable -> 0x015f, all -> 0x012b }
            java.lang.String r5 = "token_id"
            java.lang.String r5 = r6.getString(r5)     // Catch:{ Throwable -> 0x015f, all -> 0x012b }
            r0.f128474e = r5     // Catch:{ Throwable -> 0x015f, all -> 0x012b }
        L_0x0143:
            if (r1 != r3) goto L_0x0161
            com.ss.sys.b.a r0 = com.p683ss.sys.p2577b.C51373a.m110489a()     // Catch:{ Throwable -> 0x015f, all -> 0x012b }
            r0.f128472c = r4     // Catch:{ Throwable -> 0x015f, all -> 0x012b }
            java.lang.String r0 = "token_id"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Throwable -> 0x015f, all -> 0x012b }
            com.ss.sys.b.a r3 = com.p683ss.sys.p2577b.C51373a.m110489a()     // Catch:{ Throwable -> 0x015f, all -> 0x012b }
            r3.f128474e = r0     // Catch:{ Throwable -> 0x015f, all -> 0x012b }
            r3 = 302(0x12e, float:4.23E-43)
            android.content.Context r5 = r9.f128477b     // Catch:{ Throwable -> 0x015f, all -> 0x012b }
            com.p683ss.sys.ces.C51379a.meta(r3, r5, r0)     // Catch:{ Throwable -> 0x015f, all -> 0x012b }
            goto L_0x0161
        L_0x015f:
            r3 = r1
            goto L_0x019a
        L_0x0161:
            r3 = r1
        L_0x0162:
            com.ss.sys.b.a r0 = com.p683ss.sys.p2577b.C51373a.m110489a()     // Catch:{ Throwable -> 0x019a }
            r0.f128471b = r3     // Catch:{ Throwable -> 0x019a }
            com.ss.sys.ces.c r0 = com.p683ss.sys.ces.C51393c.m110533a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "SS-"
            r1.<init>(r5)
            com.ss.sys.b.a r5 = com.p683ss.sys.p2577b.C51373a.m110489a()
            int r5 = r5.f128471b
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.reportNow(r1, r4)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "trial"
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x01cc }
            java.lang.String r1 = "status"
            goto L_0x01c9
        L_0x0190:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Throwable -> 0x019a }
            java.lang.String r1 = "NullPointerException"
            r0.<init>(r1)     // Catch:{ Throwable -> 0x019a }
            throw r0     // Catch:{ Throwable -> 0x019a }
        L_0x0198:
            r0 = move-exception
            goto L_0x01e3
        L_0x019a:
            com.ss.sys.b.a r0 = com.p683ss.sys.p2577b.C51373a.m110489a()     // Catch:{ all -> 0x0198 }
            r1 = 500(0x1f4, float:7.0E-43)
            r0.f128471b = r1     // Catch:{ all -> 0x0198 }
            com.ss.sys.ces.c r0 = com.p683ss.sys.ces.C51393c.m110533a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "SS-"
            r1.<init>(r5)
            com.ss.sys.b.a r5 = com.p683ss.sys.p2577b.C51373a.m110489a()
            int r5 = r5.f128471b
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.reportNow(r1, r4)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "trial"
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x01cc }
            java.lang.String r1 = "status"
        L_0x01c9:
            r0.put(r1, r3)     // Catch:{ Throwable -> 0x01cc }
        L_0x01cc:
            java.lang.String r1 = "ss_req_log"
            com.p683ss.sys.ces.C51408e.m110567a(r4, r1, r0)
            com.ss.sys.b.a.a r0 = r9.f128476a
            if (r0 == 0) goto L_0x01e2
            com.ss.sys.b.a.a r0 = r9.f128476a
            com.ss.sys.b.a r1 = com.p683ss.sys.p2577b.C51373a.m110489a()
            java.lang.String r1 = r1.mo102052b()
            r0.mo102053a(r1)
        L_0x01e2:
            return
        L_0x01e3:
            com.ss.sys.ces.c r1 = com.p683ss.sys.ces.C51393c.m110533a()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "SS-"
            r5.<init>(r6)
            com.ss.sys.b.a r6 = com.p683ss.sys.p2577b.C51373a.m110489a()
            int r6 = r6.f128471b
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.reportNow(r5, r4)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r5 = "trial"
            r1.put(r5, r2)     // Catch:{ Throwable -> 0x020d }
            java.lang.String r2 = "status"
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x020d }
        L_0x020d:
            java.lang.String r2 = "ss_req_log"
            com.p683ss.sys.ces.C51408e.m110567a(r4, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.p2577b.C51375b.mo102054a():void");
    }
}
