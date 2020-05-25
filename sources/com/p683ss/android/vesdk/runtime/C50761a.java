package com.p683ss.android.vesdk.runtime;

import android.os.Environment;
import com.p683ss.android.ttve.common.TECloudCtrlInvoker;
import com.p683ss.android.vesdk.runtime.p2536a.C50762a;

/* renamed from: com.ss.android.vesdk.runtime.a */
public class C50761a {

    /* renamed from: a */
    private static String f127498a = "VECloudCtrlManager";

    /* renamed from: d */
    private static volatile C50761a f127499d;

    /* renamed from: e */
    private static String[] f127500e = {"vesdk_log_command"};

    /* renamed from: b */
    private boolean f127501b = false;

    /* renamed from: c */
    private TECloudCtrlInvoker f127502c = new TECloudCtrlInvoker();

    /* renamed from: f */
    private String f127503f = Environment.getExternalStorageDirectory().toString();

    private C50761a() {
    }

    /* renamed from: a */
    public static C50761a m109859a() {
        if (f127499d == null) {
            synchronized (C50761a.class) {
                if (f127499d == null) {
                    f127499d = new C50761a();
                }
            }
        }
        return f127499d;
    }

    /* renamed from: a */
    public final void mo99447a(String str) {
        String[] strArr;
        this.f127503f = str;
        for (String str2 : f127500e) {
            String str3 = (String) C50762a.m109863a().mo99451b(str2, "");
            if (!str3.isEmpty()) {
                m109861b(str2, str3);
            }
        }
    }

    /* renamed from: a */
    private static void m109860a(String str, String str2) {
        C50762a.m109863a().mo99449a(str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029 A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b4 A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1 A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2 A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f5 A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0171 A[Catch:{ Exception -> 0x0199 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m109861b(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r0 = -1
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0199 }
            r2.<init>(r14)     // Catch:{ Exception -> 0x0199 }
            int r14 = r13.hashCode()     // Catch:{ Exception -> 0x0199 }
            r3 = 2043549244(0x79ce163c, float:1.3375801E35)
            if (r14 == r3) goto L_0x0011
            goto L_0x001b
        L_0x0011:
            java.lang.String r14 = "vesdk_log_command"
            boolean r14 = r13.equals(r14)     // Catch:{ Exception -> 0x0199 }
            if (r14 == 0) goto L_0x001b
            r14 = 0
            goto L_0x001c
        L_0x001b:
            r14 = -1
        L_0x001c:
            if (r14 == 0) goto L_0x0029
            java.lang.String r14 = f127498a     // Catch:{ Exception -> 0x0199 }
            java.lang.String r1 = " json contail invalid command "
            com.p683ss.android.vesdk.C50792y.m109914d(r14, r1)     // Catch:{ Exception -> 0x0199 }
            r13 = -2
            r0 = -2
            goto L_0x01b6
        L_0x0029:
            java.lang.String r14 = "false"
            java.lang.String r3 = "2018-12-08 00:00:00"
            java.lang.String r4 = "2018-12-08 00:00:00"
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "enable"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0199 }
            if (r7 == 0) goto L_0x0041
            java.lang.String r14 = "enable"
            java.lang.String r14 = r2.getString(r14)     // Catch:{ Exception -> 0x0199 }
        L_0x0041:
            java.lang.String r7 = "starttime"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0199 }
            if (r7 == 0) goto L_0x004f
            java.lang.String r3 = "starttime"
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x0199 }
        L_0x004f:
            java.lang.String r7 = "endtime"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0199 }
            if (r7 == 0) goto L_0x005d
            java.lang.String r4 = "endtime"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ Exception -> 0x0199 }
        L_0x005d:
            java.lang.String r7 = "level"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0199 }
            if (r7 == 0) goto L_0x006b
            java.lang.String r5 = "level"
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x0199 }
        L_0x006b:
            java.lang.String r7 = "sign"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0199 }
            if (r7 == 0) goto L_0x0079
            java.lang.String r6 = "sign"
            java.lang.String r6 = r2.getString(r6)     // Catch:{ Exception -> 0x0199 }
        L_0x0079:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0199 }
            r2.<init>()     // Catch:{ Exception -> 0x0199 }
            r2.append(r13)     // Catch:{ Exception -> 0x0199 }
            r2.append(r14)     // Catch:{ Exception -> 0x0199 }
            r2.append(r3)     // Catch:{ Exception -> 0x0199 }
            r2.append(r4)     // Catch:{ Exception -> 0x0199 }
            r2.append(r5)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0199 }
            com.ss.android.ttve.common.TECloudCtrlInvoker r7 = r12.f127502c     // Catch:{ Exception -> 0x0199 }
            boolean r8 = r2.isEmpty()     // Catch:{ Exception -> 0x0199 }
            r9 = 1
            if (r8 != 0) goto L_0x00b1
            boolean r8 = r6.isEmpty()     // Catch:{ Exception -> 0x0199 }
            if (r8 == 0) goto L_0x00a1
            goto L_0x00b1
        L_0x00a1:
            byte[] r2 = r2.getBytes()     // Catch:{ Exception -> 0x0199 }
            byte[] r6 = r6.getBytes()     // Catch:{ Exception -> 0x0199 }
            int r2 = r7.nativeVerifyJson(r2, r6)     // Catch:{ Exception -> 0x0199 }
            if (r2 != 0) goto L_0x00b1
            r2 = 1
            goto L_0x00b2
        L_0x00b1:
            r2 = 0
        L_0x00b2:
            if (r2 != 0) goto L_0x00c1
            java.lang.String r14 = ""
            m109860a(r13, r14)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r14 = f127498a     // Catch:{ Exception -> 0x0199 }
            java.lang.String r1 = "Cloud Ctrl Command Json is doctored"
            com.p683ss.android.vesdk.C50792y.m109914d(r14, r1)     // Catch:{ Exception -> 0x0199 }
            return r0
        L_0x00c1:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0199 }
            java.lang.String r6 = "yyyy-MM-dd HH:mm:ss"
            r2.<init>(r6)     // Catch:{ Exception -> 0x0199 }
            java.util.Date r3 = r2.parse(r3)     // Catch:{ Exception -> 0x0199 }
            long r6 = r3.getTime()     // Catch:{ Exception -> 0x0199 }
            java.util.Date r2 = r2.parse(r4)     // Catch:{ Exception -> 0x0199 }
            long r2 = r2.getTime()     // Catch:{ Exception -> 0x0199 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0199 }
            int r4 = r5.hashCode()     // Catch:{ Exception -> 0x0199 }
            r8 = 68
            if (r4 == r8) goto L_0x00e5
            goto L_0x00ef
        L_0x00e5:
            java.lang.String r4 = "D"
            boolean r4 = r5.equals(r4)     // Catch:{ Exception -> 0x0199 }
            if (r4 == 0) goto L_0x00ef
            r4 = 0
            goto L_0x00f0
        L_0x00ef:
            r4 = -1
        L_0x00f0:
            if (r4 == 0) goto L_0x00f5
            com.ss.android.ttve.common.i$a r4 = com.p683ss.android.ttve.common.C20080i.C20081a.LEVEL3     // Catch:{ Exception -> 0x0199 }
            goto L_0x00f7
        L_0x00f5:
            com.ss.android.ttve.common.i$a r4 = com.p683ss.android.ttve.common.C20080i.C20081a.LEVEL0     // Catch:{ Exception -> 0x0199 }
        L_0x00f7:
            boolean r5 = r12.f127501b     // Catch:{ Exception -> 0x0199 }
            if (r5 != 0) goto L_0x015d
            java.lang.String r5 = "true"
            boolean r5 = r14.equals(r5)     // Catch:{ Exception -> 0x0199 }
            if (r5 == 0) goto L_0x015d
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x015d
            int r5 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x015d
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0199 }
            r14.<init>()     // Catch:{ Exception -> 0x0199 }
            java.lang.String r2 = r12.f127503f     // Catch:{ Exception -> 0x0199 }
            r14.append(r2)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r2 = "/vesdklog"
            r14.append(r2)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0199 }
            java.lang.String r2 = f127498a     // Catch:{ Exception -> 0x0199 }
            com.p683ss.android.vesdk.C50792y.m109911b(r2, r14)     // Catch:{ Exception -> 0x0199 }
            com.ss.android.ttve.common.i r2 = com.p683ss.android.ttve.common.C20080i.m49592a()     // Catch:{ Exception -> 0x0199 }
            int r3 = r4.ordinal()     // Catch:{ Exception -> 0x0199 }
            com.ss.android.ttve.common.TESpdLogInvoker r2 = r2.f55203a     // Catch:{ Exception -> 0x0199 }
            r5 = 3
            int r14 = r2.initSpdLog(r14, r3, r5)     // Catch:{ Exception -> 0x0199 }
            if (r14 >= 0) goto L_0x0135
            goto L_0x0136
        L_0x0135:
            r14 = 0
        L_0x0136:
            if (r14 >= 0) goto L_0x014d
            java.lang.String r1 = f127498a     // Catch:{ Exception -> 0x0199 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0199 }
            java.lang.String r3 = " TESpdLog init fail "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0199 }
            r2.append(r14)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r14 = r2.toString()     // Catch:{ Exception -> 0x0199 }
            com.p683ss.android.vesdk.C50792y.m109914d(r1, r14)     // Catch:{ Exception -> 0x0199 }
            r13 = -3
            return r13
        L_0x014d:
            com.ss.android.ttve.common.i r14 = com.p683ss.android.ttve.common.C20080i.m49592a()     // Catch:{ Exception -> 0x0199 }
            com.ss.android.ttve.common.TESpdLogInvoker r14 = r14.f55203a     // Catch:{ Exception -> 0x0199 }
            int r2 = r4.ordinal()     // Catch:{ Exception -> 0x0199 }
            r14.setLevel(r2)     // Catch:{ Exception -> 0x0199 }
            r12.f127501b = r9     // Catch:{ Exception -> 0x0199 }
            goto L_0x0197
        L_0x015d:
            java.lang.String r4 = "false"
            boolean r14 = r14.equals(r4)     // Catch:{ Exception -> 0x0199 }
            if (r14 != 0) goto L_0x016d
            int r14 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x0197
            int r14 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r14 < 0) goto L_0x0197
        L_0x016d:
            boolean r14 = r12.f127501b     // Catch:{ Exception -> 0x0199 }
            if (r14 == 0) goto L_0x017c
            com.ss.android.ttve.common.i r14 = com.p683ss.android.ttve.common.C20080i.m49592a()     // Catch:{ Exception -> 0x0199 }
            com.ss.android.ttve.common.TESpdLogInvoker r14 = r14.f55203a     // Catch:{ Exception -> 0x0199 }
            r14.close()     // Catch:{ Exception -> 0x0199 }
            r12.f127501b = r1     // Catch:{ Exception -> 0x0199 }
        L_0x017c:
            java.lang.String r14 = f127498a     // Catch:{ Exception -> 0x0199 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0199 }
            r2.<init>()     // Catch:{ Exception -> 0x0199 }
            r2.append(r13)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r3 = " expired"
            r2.append(r3)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0199 }
            com.p683ss.android.vesdk.C50792y.m109911b(r14, r2)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r14 = ""
            m109860a(r13, r14)     // Catch:{ Exception -> 0x0199 }
        L_0x0197:
            r0 = 0
            goto L_0x01b6
        L_0x0199:
            r14 = move-exception
            java.lang.String r1 = f127498a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " json parse failed "
            r2.<init>(r3)
            java.lang.String r14 = r14.toString()
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            com.p683ss.android.vesdk.C50792y.m109914d(r1, r14)
            java.lang.String r14 = ""
            m109860a(r13, r14)
        L_0x01b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.vesdk.runtime.C50761a.m109861b(java.lang.String, java.lang.String):int");
    }
}
