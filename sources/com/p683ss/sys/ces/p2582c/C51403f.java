package com.p683ss.sys.ces.p2582c;

import android.content.Context;
import com.p683ss.p1096a.p1097a.C18477a;
import com.p683ss.sys.ces.C51393c;
import com.p683ss.sys.ces.p2580a.C51384d;

/* renamed from: com.ss.sys.ces.c.f */
public final class C51403f {

    /* renamed from: d */
    private static String f128535d = "";

    /* renamed from: a */
    public String f128536a = "";

    /* renamed from: b */
    public Context f128537b;

    /* renamed from: c */
    public String f128538c = "";

    public C51403f(Context context, String str, int i) {
        if (str == null || str.length() <= 0) {
            str = "";
        }
        this.f128536a = str;
        this.f128537b = context;
        StringBuilder sb = new StringBuilder();
        sb.append(C18477a.m44716c(i));
        sb.append("/v2/r");
        sb.append(m110558a(i));
        this.f128538c = sb.toString();
    }

    /* renamed from: a */
    private String m110558a(int i) {
        String str = "?os=0&ver=0.6.11.29.02-MT&m=2";
        String str2 = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(this.f128537b.getPackageManager().getPackageInfo(this.f128537b.getPackageName(), 0).versionName);
            str2 = sb.toString();
        } catch (Throwable unused) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("&app_ver=");
        sb2.append(str2);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb3);
        sb4.append("&region=");
        sb4.append(C51384d.m110514a(this.f128537b));
        String sb5 = sb4.toString();
        if (i == 0) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(sb5);
            sb6.append("&aid=");
            sb6.append(C51393c.m110536b());
            String sb7 = sb6.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(sb7);
            sb8.append("&did=");
            sb8.append(C51393c.m110538d());
            String sb9 = sb8.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb9);
            sb10.append("&iid=");
            sb10.append(C51393c.m110539e());
            sb5 = sb10.toString();
        }
        if (i != 1) {
            return sb5;
        }
        StringBuilder sb11 = new StringBuilder();
        sb11.append(sb5);
        sb11.append("&appkey=");
        sb11.append(C51393c.m110541g().NM_getAppKey());
        String sb12 = sb11.toString();
        StringBuilder sb13 = new StringBuilder();
        sb13.append(sb12);
        sb13.append("&did=");
        sb13.append(C51393c.m110541g().NM_getDeviceId());
        return sb13.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        if ((java.lang.System.currentTimeMillis() % 97) == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c0, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        r2 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00cc */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099 A[Catch:{ Throwable -> 0x00c3, all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e8 A[SYNTHETIC, Splitter:B:56:0x00e8] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ef A[SYNTHETIC, Splitter:B:60:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f5 A[SYNTHETIC, Splitter:B:65:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fc A[SYNTHETIC, Splitter:B:69:0x00fc] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ba A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102121a(byte[] r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
            r0 = 0
        L_0x0005:
            r4 = 2
            if (r0 >= r4) goto L_0x0100
            r5 = 1
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00cc }
            r6.<init>()     // Catch:{ Throwable -> 0x00cc }
            com.bytedance.retrofit2.a.b r7 = new com.bytedance.retrofit2.a.b     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r8 = "Cookie"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r10 = "sessionid="
            r9.<init>(r10)     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r10 = r12.f128536a     // Catch:{ Throwable -> 0x00cc }
            r9.append(r10)     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x00cc }
            r7.<init>(r8, r9)     // Catch:{ Throwable -> 0x00cc }
            r6.add(r7)     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r7 = r12.f128538c     // Catch:{ Throwable -> 0x00cc }
            com.bytedance.retrofit2.q r7 = com.bytedance.ttnet.p887e.C13333g.m26867b(r7)     // Catch:{ Throwable -> 0x00cc }
            java.lang.Class<com.ss.sys.ces.c.d> r8 = com.p683ss.sys.ces.p2582c.C51400d.class
            java.lang.Object r7 = r7.mo23937a(r8)     // Catch:{ Throwable -> 0x00cc }
            com.ss.sys.ces.c.d r7 = (com.p683ss.sys.ces.p2582c.C51400d) r7     // Catch:{ Throwable -> 0x00cc }
            com.bytedance.retrofit2.mime.TypedByteArray r8 = new com.bytedance.retrofit2.mime.TypedByteArray     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r9 = "application/octet-stream"
            java.lang.String[] r10 = new java.lang.String[r1]     // Catch:{ Throwable -> 0x00cc }
            r8.<init>(r9, r13, r10)     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r9 = r12.f128538c     // Catch:{ Throwable -> 0x00cc }
            com.bytedance.retrofit2.b r6 = r7.mo102120a(r9, r6, r8)     // Catch:{ Throwable -> 0x00cc }
            com.bytedance.retrofit2.u r6 = r6.execute()     // Catch:{ Throwable -> 0x00cc }
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x00cc }
            r7.<init>()     // Catch:{ Throwable -> 0x00cc }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r3]     // Catch:{ Throwable -> 0x00c8, all -> 0x00c5 }
            T r6 = r6.f33552b     // Catch:{ Throwable -> 0x00c8, all -> 0x00c5 }
            com.bytedance.retrofit2.mime.TypedInput r6 = (com.bytedance.retrofit2.mime.TypedInput) r6     // Catch:{ Throwable -> 0x00c8, all -> 0x00c5 }
            java.io.InputStream r6 = r6.mo9554in()     // Catch:{ Throwable -> 0x00c8, all -> 0x00c5 }
        L_0x005a:
            int r2 = r6.read(r8, r1, r3)     // Catch:{ Throwable -> 0x00c3, all -> 0x00c0 }
            if (r2 <= 0) goto L_0x0064
            r7.write(r8, r1, r2)     // Catch:{ Throwable -> 0x00c3, all -> 0x00c0 }
            goto L_0x005a
        L_0x0064:
            byte[] r2 = r7.toByteArray()     // Catch:{ Throwable -> 0x00c3, all -> 0x00c0 }
            if (r2 == 0) goto L_0x00ba
            int r2 = r2.length     // Catch:{ Throwable -> 0x00c3, all -> 0x00c0 }
            r3 = 37
            if (r2 != r3) goto L_0x0075
            com.p683ss.sys.ces.C51393c.f128503j = r5     // Catch:{ Throwable -> 0x00c3, all -> 0x00c0 }
            r2 = r6
            r3 = r7
            goto L_0x0100
        L_0x0075:
            com.p683ss.sys.ces.C51393c.f128503j = r1     // Catch:{ Throwable -> 0x00c3, all -> 0x00c0 }
            int r2 = com.p683ss.sys.ces.C51388b.f128486a     // Catch:{ Throwable -> 0x00c3, all -> 0x00c0 }
            r8 = 0
            if (r2 != r5) goto L_0x008a
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00c3, all -> 0x00c0 }
            r10 = 97
            long r2 = r2 % r10
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0096
        L_0x0088:
            r2 = 1
            goto L_0x0097
        L_0x008a:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00c3, all -> 0x00c0 }
            r10 = 997(0x3e5, double:4.926E-321)
            long r2 = r2 % r10
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0096:
            r2 = 0
        L_0x0097:
            if (r2 == 0) goto L_0x00ba
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00c3, all -> 0x00c0 }
            r2.<init>()     // Catch:{ Throwable -> 0x00c3, all -> 0x00c0 }
            java.lang.String r3 = "url"
            java.lang.String r8 = r12.f128538c     // Catch:{ Throwable -> 0x00b5, all -> 0x00c0 }
            r2.put(r3, r8)     // Catch:{ Throwable -> 0x00b5, all -> 0x00c0 }
            java.lang.String r3 = "typ"
            java.lang.String r8 = "not37-fixOV"
            r2.put(r3, r8)     // Catch:{ Throwable -> 0x00b5, all -> 0x00c0 }
            java.lang.String r3 = "dat"
            java.lang.String r4 = android.util.Base64.encodeToString(r13, r4)     // Catch:{ Throwable -> 0x00b5, all -> 0x00c0 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x00b5, all -> 0x00c0 }
        L_0x00b5:
            java.lang.String r3 = "rpt_log_rep_err"
            com.p683ss.sys.ces.C51408e.m110567a(r5, r3, r2)     // Catch:{ Throwable -> 0x00c3, all -> 0x00c0 }
        L_0x00ba:
            int r0 = r0 + 1
            r2 = r6
            r3 = r7
            goto L_0x0005
        L_0x00c0:
            r13 = move-exception
            r2 = r6
            goto L_0x00c6
        L_0x00c3:
            r2 = r6
            goto L_0x00c8
        L_0x00c5:
            r13 = move-exception
        L_0x00c6:
            r3 = r7
            goto L_0x00f3
        L_0x00c8:
            r3 = r7
            goto L_0x00cc
        L_0x00ca:
            r13 = move-exception
            goto L_0x00f3
        L_0x00cc:
            com.p683ss.sys.ces.C51393c.f128503j = r1     // Catch:{ all -> 0x00ca }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ all -> 0x00ca }
            r13.<init>()     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "url"
            java.lang.String r1 = r12.f128538c     // Catch:{ Throwable -> 0x00e1 }
            r13.put(r0, r1)     // Catch:{ Throwable -> 0x00e1 }
            java.lang.String r0 = "typ"
            java.lang.String r1 = "crash_t"
            r13.put(r0, r1)     // Catch:{ Throwable -> 0x00e1 }
        L_0x00e1:
            java.lang.String r0 = "rpt_log_rep_err"
            com.p683ss.sys.ces.C51408e.m110567a(r5, r0, r13)     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x00ed
            r2.close()     // Catch:{ Throwable -> 0x00ec }
            goto L_0x00ed
        L_0x00ec:
        L_0x00ed:
            if (r3 == 0) goto L_0x010c
            r3.close()     // Catch:{ Throwable -> 0x00f2 }
        L_0x00f2:
            return
        L_0x00f3:
            if (r2 == 0) goto L_0x00fa
            r2.close()     // Catch:{ Throwable -> 0x00f9 }
            goto L_0x00fa
        L_0x00f9:
        L_0x00fa:
            if (r3 == 0) goto L_0x00ff
            r3.close()     // Catch:{ Throwable -> 0x00ff }
        L_0x00ff:
            throw r13
        L_0x0100:
            if (r2 == 0) goto L_0x0107
            r2.close()     // Catch:{ Throwable -> 0x0106 }
            goto L_0x0107
        L_0x0106:
        L_0x0107:
            if (r3 == 0) goto L_0x010c
            r3.close()     // Catch:{ Throwable -> 0x010c }
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.ces.p2582c.C51403f.mo102121a(byte[]):void");
    }
}
