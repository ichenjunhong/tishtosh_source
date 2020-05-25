package com.p683ss.sys.ces.p2583gg;

import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9895a;

/* renamed from: com.ss.sys.ces.gg.tt */
public class C51411tt {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static int f128560a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f128561b;

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m110580d(String str) {
        int indexOf = str.indexOf("?");
        int indexOf2 = str.indexOf("#");
        if (indexOf == -1) {
            return null;
        }
        if (indexOf2 == -1) {
            return str.substring(indexOf + 1);
        }
        if (indexOf2 < indexOf) {
            return null;
        }
        return str.substring(indexOf + 1, indexOf2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static String m110581e(String str) {
        String[] split;
        for (String str2 : str.replace(" ", "").split(",")) {
            int indexOf = str2.indexOf("sessionid=");
            if (indexOf != -1) {
                return str2.substring(indexOf + 10);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m110582f(String str) {
        return false;
    }

    public static void init_gorgon() {
        C9894e.f26965j = new C9895a() {
            /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x026f */
            /* JADX WARNING: Removed duplicated region for block: B:135:0x0313  */
            /* JADX WARNING: Removed duplicated region for block: B:72:0x0198  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.util.Map<java.lang.String, java.lang.String> mo17818a(java.lang.String r20, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r21) {
                /*
                    r19 = this;
                    r1 = r20
                    java.util.HashMap r2 = new java.util.HashMap
                    r2.<init>()
                    java.lang.String r3 = ""
                    java.util.Calendar r0 = java.util.Calendar.getInstance()
                    long r4 = r0.getTimeInMillis()
                    java.lang.String r6 = ""
                    long r7 = java.lang.System.currentTimeMillis()
                    r9 = 1000(0x3e8, double:4.94E-321)
                    long r7 = r7 / r9
                    int r7 = (int) r7
                    r11 = 0
                    java.lang.String r0 = r20.toLowerCase()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r13 = "http"
                    boolean r0 = r0.contains(r13)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r0 != 0) goto L_0x003d
                    java.lang.String r0 = r20.toLowerCase()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r13 = "https"
                    boolean r0 = r0.contains(r13)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r0 == 0) goto L_0x0035
                    goto L_0x003d
                L_0x0035:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r13 = "nein http/https"
                    r0.<init>(r13)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    throw r0     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                L_0x003d:
                    java.lang.String r0 = r20.toLowerCase()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r13 = "x-khronos"
                    boolean r0 = r0.contains(r13)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r0 == 0) goto L_0x005e
                    java.lang.String r0 = r20.toLowerCase()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r13 = "x-gorgon"
                    boolean r0 = r0.contains(r13)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r0 != 0) goto L_0x0056
                    goto L_0x005e
                L_0x0056:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r13 = "it had"
                    r0.<init>(r13)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    throw r0     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                L_0x005e:
                    boolean r0 = com.p683ss.sys.ces.p2583gg.C51411tt.m110582f(r20)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r0 != 0) goto L_0x01d8
                    java.lang.String r0 = com.p683ss.sys.ces.p2583gg.C51411tt.m110580d(r20)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    r13 = 0
                    if (r0 == 0) goto L_0x0076
                    int r14 = r0.length()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r14 <= 0) goto L_0x0076
                    java.lang.String r0 = com.p683ss.p1096a.p1098b.C18482b.m44728a(r0)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    goto L_0x0077
                L_0x0076:
                    r0 = r13
                L_0x0077:
                    r14 = -1
                    java.util.Set r15 = r21.entrySet()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.util.Iterator r15 = r15.iterator()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    r14 = r13
                    r16 = r14
                    r8 = -1
                L_0x0084:
                    boolean r17 = r15.hasNext()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r17 == 0) goto L_0x0123
                    java.lang.Object r17 = r15.next()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.util.Map$Entry r17 = (java.util.Map.Entry) r17     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.Object r18 = r17.getKey()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r18 = (java.lang.String) r18     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r9 = r18.toUpperCase()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r10 = "X-SS-STUB"
                    boolean r9 = r9.contains(r10)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r9 == 0) goto L_0x00af
                    java.lang.Object r9 = r17.getValue()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.util.List r9 = (java.util.List) r9     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.Object r9 = r9.get(r11)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r9 = (java.lang.String) r9     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    r13 = r9
                L_0x00af:
                    java.lang.Object r9 = r17.getKey()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r9 = (java.lang.String) r9     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r9 = r9.toUpperCase()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r10 = "COOKIE"
                    boolean r9 = r9.contains(r10)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r9 == 0) goto L_0x00f3
                    java.lang.Object r9 = r17.getValue()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.util.List r9 = (java.util.List) r9     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.Object r9 = r9.get(r11)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r9 = (java.lang.String) r9     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r9 == 0) goto L_0x00f3
                    int r10 = r9.length()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r10 <= 0) goto L_0x00f3
                    java.lang.String r10 = com.p683ss.p1096a.p1098b.C18482b.m44728a(r9)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r9 = com.p683ss.sys.ces.p2583gg.C51411tt.m110581e(r9)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r9 == 0) goto L_0x00f2
                    int r14 = r9.length()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r14 <= 0) goto L_0x00f2
                    java.lang.String r14 = com.p683ss.p1096a.p1098b.C18482b.m44728a(r9)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    com.ss.sys.ces.out.ISdk r12 = com.p683ss.sys.ces.out.StcSDKFactory.getInstance()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    r12.setSession(r9)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    r16 = r14
                L_0x00f2:
                    r14 = r10
                L_0x00f3:
                    java.lang.Object r9 = r17.getKey()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r9 = (java.lang.String) r9     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r9 = r9.toUpperCase()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r10 = "META-SHADOWMAZE"
                    boolean r9 = r9.contains(r10)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r9 == 0) goto L_0x0084
                    java.lang.Object r9 = r17.getValue()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.util.List r9 = (java.util.List) r9     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.Object r9 = r9.get(r11)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r9 = (java.lang.String) r9     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r9 == 0) goto L_0x0084
                    int r10 = r9.length()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r10 <= 0) goto L_0x0084
                    int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    r10 = 1
                    if (r9 != r10) goto L_0x0084
                    r8 = 1
                    goto L_0x0084
                L_0x0123:
                    if (r0 == 0) goto L_0x012b
                    int r9 = r0.length()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r9 > 0) goto L_0x012d
                L_0x012b:
                    java.lang.String r0 = "00000000000000000000000000000000"
                L_0x012d:
                    if (r13 == 0) goto L_0x0135
                    int r9 = r13.length()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r9 > 0) goto L_0x0137
                L_0x0135:
                    java.lang.String r13 = "00000000000000000000000000000000"
                L_0x0137:
                    if (r14 == 0) goto L_0x013f
                    int r9 = r14.length()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r9 > 0) goto L_0x0141
                L_0x013f:
                    java.lang.String r14 = "00000000000000000000000000000000"
                L_0x0141:
                    if (r16 == 0) goto L_0x014d
                    int r9 = r16.length()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    if (r9 > 0) goto L_0x014a
                    goto L_0x014d
                L_0x014a:
                    r9 = r16
                    goto L_0x0150
                L_0x014d:
                    java.lang.String r16 = "00000000000000000000000000000000"
                    goto L_0x014a
                L_0x0150:
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    r10.<init>()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    r10.append(r0)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    r10.append(r13)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    r10.append(r14)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    r10.append(r9)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r0 = r10.toString()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    byte[] r0 = com.p683ss.p1096a.p1098b.C18481a.m44726a(r0)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    byte[] r0 = com.p683ss.sys.ces.C51379a.leviathan(r8, r7, r0)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r0 = com.p683ss.p1096a.p1098b.C18481a.m44725a(r0)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r3 = "X-Khronos"
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    r6.append(r7)
                    java.lang.String r6 = r6.toString()
                    r2.put(r3, r6)
                    java.lang.String r3 = "X-Gorgon"
                    r2.put(r3, r0)
                    java.util.Calendar r3 = java.util.Calendar.getInstance()
                    long r8 = r3.getTimeInMillis()
                    long r8 = r8 - r4
                    com.ss.sys.ces.c r3 = com.p683ss.sys.ces.C51393c.m110533a()
                    boolean r3 = r3.f128520i
                    if (r3 == 0) goto L_0x02b3
                    r3 = 10
                    int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                    if (r5 <= 0) goto L_0x01c6
                    int r3 = com.p683ss.sys.ces.p2583gg.C51411tt.f128560a
                    if (r3 == 0) goto L_0x01ae
                    int r3 = com.p683ss.sys.ces.p2583gg.C51411tt.f128560a
                    int r3 = r7 - r3
                    r4 = 20
                    if (r3 < r4) goto L_0x01c6
                L_0x01ae:
                    org.json.JSONObject r3 = new org.json.JSONObject
                    r3.<init>()
                    java.lang.String r4 = "url"
                    r3.put(r4, r1)     // Catch:{ Throwable -> 0x01bd }
                    java.lang.String r1 = "consume"
                    r3.put(r1, r8)     // Catch:{ Throwable -> 0x01bd }
                L_0x01bd:
                    java.lang.String r1 = "cus_req_sig"
                    r4 = 1
                    com.p683ss.sys.ces.C51408e.m110567a(r4, r1, r3)
                    com.p683ss.sys.ces.p2583gg.C51411tt.f128560a = r7
                L_0x01c6:
                    if (r0 == 0) goto L_0x01ce
                    int r0 = r0.length()
                    if (r0 > 0) goto L_0x02b3
                L_0x01ce:
                    java.lang.String r0 = "sig_gorgon_null"
                    java.lang.String r1 = ""
                    r3 = 1
                    com.p683ss.sys.ces.C51408e.m110567a(r3, r0, r1)
                    goto L_0x02b3
                L_0x01d8:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    java.lang.String r8 = "filter_1"
                    r0.<init>(r8)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                    throw r0     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
                L_0x01e0:
                    r0 = move-exception
                    goto L_0x02b4
                L_0x01e3:
                    r0 = move-exception
                    if (r1 == 0) goto L_0x0284
                    int r8 = r20.length()     // Catch:{ all -> 0x0281 }
                    if (r8 <= 0) goto L_0x0284
                    java.lang.String r8 = "/c/m?os="
                    boolean r8 = r1.contains(r8)     // Catch:{ all -> 0x0281 }
                    if (r8 != 0) goto L_0x0284
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0281 }
                    r8.<init>()     // Catch:{ all -> 0x0281 }
                    r8.append(r3)     // Catch:{ all -> 0x0281 }
                    java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x0281 }
                    r8.append(r3)     // Catch:{ all -> 0x0281 }
                    java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x0281 }
                    java.lang.String r8 = "UnsatisfiedLinkError"
                    boolean r8 = r3.contains(r8)     // Catch:{ all -> 0x0281 }
                    if (r8 == 0) goto L_0x0215
                    boolean r8 = com.p683ss.sys.ces.p2583gg.C51411tt.f128561b     // Catch:{ all -> 0x0281 }
                    if (r8 != 0) goto L_0x0284
                L_0x0215:
                    java.lang.String r8 = "UnsatisfiedLinkError"
                    boolean r8 = r3.contains(r8)     // Catch:{ all -> 0x0281 }
                    if (r8 == 0) goto L_0x0221
                    r8 = 1
                    com.p683ss.sys.ces.p2583gg.C51411tt.f128561b = r8     // Catch:{ all -> 0x0281 }
                L_0x0221:
                    java.lang.StackTraceElement[] r0 = r0.getStackTrace()     // Catch:{ Throwable -> 0x026f }
                L_0x0225:
                    int r8 = r0.length     // Catch:{ Throwable -> 0x026f }
                    if (r11 >= r8) goto L_0x0284
                    r8 = r0[r11]     // Catch:{ Throwable -> 0x026f }
                    java.lang.String r9 = r8.getClassName()     // Catch:{ Throwable -> 0x026f }
                    java.lang.String r10 = r8.getMethodName()     // Catch:{ Throwable -> 0x026f }
                    java.lang.String r12 = r8.getFileName()     // Catch:{ Throwable -> 0x026f }
                    int r8 = r8.getLineNumber()     // Catch:{ Throwable -> 0x026f }
                    java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x026f }
                    r13.<init>()     // Catch:{ Throwable -> 0x026f }
                    r13.append(r3)     // Catch:{ Throwable -> 0x026f }
                    java.lang.String r14 = "at "
                    r13.append(r14)     // Catch:{ Throwable -> 0x026f }
                    r13.append(r9)     // Catch:{ Throwable -> 0x026f }
                    java.lang.String r9 = "."
                    r13.append(r9)     // Catch:{ Throwable -> 0x026f }
                    r13.append(r10)     // Catch:{ Throwable -> 0x026f }
                    java.lang.String r9 = "("
                    r13.append(r9)     // Catch:{ Throwable -> 0x026f }
                    r13.append(r12)     // Catch:{ Throwable -> 0x026f }
                    java.lang.String r9 = ":"
                    r13.append(r9)     // Catch:{ Throwable -> 0x026f }
                    r13.append(r8)     // Catch:{ Throwable -> 0x026f }
                    java.lang.String r8 = ")\n"
                    r13.append(r8)     // Catch:{ Throwable -> 0x026f }
                    java.lang.String r8 = r13.toString()     // Catch:{ Throwable -> 0x026f }
                    int r11 = r11 + 1
                    r3 = r8
                    goto L_0x0225
                L_0x026f:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0281 }
                    r0.<init>()     // Catch:{ all -> 0x0281 }
                    r0.append(r3)     // Catch:{ all -> 0x0281 }
                    java.lang.String r3 = "\n[-]double error"
                    r0.append(r3)     // Catch:{ all -> 0x0281 }
                    java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x0281 }
                    goto L_0x0284
                L_0x0281:
                    r0 = move-exception
                    r11 = 1
                    goto L_0x02b4
                L_0x0284:
                    java.lang.String r0 = "sig_gorgon_throwable"
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0281 }
                    r8.<init>()     // Catch:{ all -> 0x0281 }
                    r8.append(r3)     // Catch:{ all -> 0x0281 }
                    java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x0281 }
                    r8 = 1
                    com.p683ss.sys.ces.C51408e.m110567a(r8, r0, r3)     // Catch:{ all -> 0x0281 }
                    java.lang.String r0 = "X-Khronos"
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r7)
                    java.lang.String r1 = r1.toString()
                    r2.put(r0, r1)
                    java.lang.String r0 = "X-Gorgon"
                    r2.put(r0, r6)
                    java.util.Calendar r0 = java.util.Calendar.getInstance()
                    r0.getTimeInMillis()
                L_0x02b3:
                    return r2
                L_0x02b4:
                    java.lang.String r3 = "X-Khronos"
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r7)
                    java.lang.String r8 = r8.toString()
                    r2.put(r3, r8)
                    java.lang.String r3 = "X-Gorgon"
                    r2.put(r3, r6)
                    java.util.Calendar r2 = java.util.Calendar.getInstance()
                    long r2 = r2.getTimeInMillis()
                    long r2 = r2 - r4
                    com.ss.sys.ces.c r4 = com.p683ss.sys.ces.C51393c.m110533a()
                    boolean r4 = r4.f128520i
                    if (r4 == 0) goto L_0x031a
                    if (r11 != 0) goto L_0x031a
                    r4 = 10
                    int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r8 <= 0) goto L_0x030c
                    int r4 = com.p683ss.sys.ces.p2583gg.C51411tt.f128560a
                    if (r4 == 0) goto L_0x02f3
                    int r4 = com.p683ss.sys.ces.p2583gg.C51411tt.f128560a
                    int r4 = r7 - r4
                    r5 = 20
                    if (r4 < r5) goto L_0x030c
                L_0x02f3:
                    org.json.JSONObject r4 = new org.json.JSONObject
                    r4.<init>()
                    java.lang.String r5 = "url"
                    r4.put(r5, r1)     // Catch:{ Throwable -> 0x0302 }
                    java.lang.String r1 = "consume"
                    r4.put(r1, r2)     // Catch:{ Throwable -> 0x0302 }
                L_0x0302:
                    java.lang.String r1 = "cus_req_sig"
                    r2 = 1
                    com.p683ss.sys.ces.C51408e.m110567a(r2, r1, r4)
                    com.p683ss.sys.ces.p2583gg.C51411tt.f128560a = r7
                    goto L_0x030d
                L_0x030c:
                    r2 = 1
                L_0x030d:
                    int r1 = r6.length()
                    if (r1 > 0) goto L_0x031a
                    java.lang.String r1 = "sig_gorgon_null"
                    java.lang.String r3 = ""
                    com.p683ss.sys.ces.C51408e.m110567a(r2, r1, r3)
                L_0x031a:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.ces.p2583gg.C51411tt.C514121.mo17818a(java.lang.String, java.util.Map):java.util.Map");
            }
        };
    }
}
