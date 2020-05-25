package org.chromium;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.ttnet.org.chromium.net.CronetException;
import com.ttnet.org.chromium.net.impl.NetworkExceptionImpl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: org.chromium.f */
public final class C53705f {

    /* renamed from: a */
    private static String f133256a;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e A[SYNTHETIC, Splitter:B:20:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075 A[SYNTHETIC, Splitter:B:28:0x0075] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m114305a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0072, all -> 0x0068 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r2.<init>()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r2.append(r3)     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            goto L_0x002e
        L_0x0039:
            org.chromium.d r3 = org.chromium.C53703d.m114300a()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            boolean r3 = r3.loggerDebug()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            if (r3 == 0) goto L_0x005e
            org.chromium.d r3 = org.chromium.C53703d.m114300a()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            java.lang.String r4 = "Process"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            java.lang.String r6 = "get processName = "
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            java.lang.String r6 = r2.toString()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r5.append(r6)     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r3.loggerD(r4, r5)     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
        L_0x005e:
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0073, all -> 0x0066 }
            r1.close()     // Catch:{ Exception -> 0x0065 }
        L_0x0065:
            return r2
        L_0x0066:
            r0 = move-exception
            goto L_0x006c
        L_0x0068:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x006c:
            if (r1 == 0) goto L_0x0071
            r1.close()     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            throw r0
        L_0x0072:
            r1 = r0
        L_0x0073:
            if (r1 == 0) goto L_0x0078
            r1.close()     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.C53705f.m114305a():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m114307a(Context context) {
        String b = m114308b(context);
        if ((b == null || !b.contains(":")) && b != null && b.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m114302a(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            default:
                if (C53703d.m114300a().loggerDebug()) {
                    StringBuilder sb = new StringBuilder("Unknown error code: ");
                    sb.append(i);
                    C53703d.m114300a().loggerD("monitor", sb.toString());
                }
                return i;
        }
    }

    /* renamed from: b */
    public static String m114308b(Context context) {
        String str = f133256a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (C53703d.m114300a().loggerDebug()) {
                        StringBuilder sb = new StringBuilder("processName = ");
                        sb.append(runningAppProcessInfo.processName);
                        C53703d.m114300a().loggerD("Process", sb.toString());
                    }
                    String str2 = runningAppProcessInfo.processName;
                    f133256a = str2;
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        String a = m114305a();
        f133256a = a;
        return a;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.net.UnknownHostException] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.net.ConnectException] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.net.SocketTimeoutException] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.net.ConnectException] */
    /* JADX WARNING: type inference failed for: r0v9, types: [org.apache.http.conn.ConnectTimeoutException] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.net.SocketException] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.net.NoRouteToHostException] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.IOException m114304a(com.ttnet.org.chromium.net.CronetException r3) {
        /*
            boolean r0 = r3 instanceof com.ttnet.org.chromium.net.NetworkException
            if (r0 != 0) goto L_0x0005
            return r3
        L_0x0005:
            r0 = r3
            com.ttnet.org.chromium.net.NetworkException r0 = (com.ttnet.org.chromium.net.NetworkException) r0
            int r0 = r0.getErrorCode()
            switch(r0) {
                case 1: goto L_0x005b;
                case 2: goto L_0x0051;
                case 3: goto L_0x0051;
                case 4: goto L_0x0047;
                case 5: goto L_0x003d;
                case 6: goto L_0x0033;
                case 7: goto L_0x003d;
                case 8: goto L_0x001b;
                case 9: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            r0 = r3
            goto L_0x0064
        L_0x0011:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException
            java.lang.String r3 = r3.getMessage()
            r0.<init>(r3)
            goto L_0x0064
        L_0x001b:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "reset by peer "
            r1.<init>(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            goto L_0x0064
        L_0x0033:
            org.apache.http.conn.ConnectTimeoutException r0 = new org.apache.http.conn.ConnectTimeoutException
            java.lang.String r3 = r3.getMessage()
            r0.<init>(r3)
            goto L_0x0064
        L_0x003d:
            java.net.ConnectException r0 = new java.net.ConnectException
            java.lang.String r3 = r3.getMessage()
            r0.<init>(r3)
            goto L_0x0064
        L_0x0047:
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.String r3 = r3.getMessage()
            r0.<init>(r3)
            goto L_0x0064
        L_0x0051:
            java.net.ConnectException r0 = new java.net.ConnectException
            java.lang.String r3 = r3.getMessage()
            r0.<init>(r3)
            goto L_0x0064
        L_0x005b:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.String r3 = r3.getMessage()
            r0.<init>(r3)
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.C53705f.m114304a(com.ttnet.org.chromium.net.CronetException):java.io.IOException");
    }

    /* renamed from: a */
    public static List m114306a(Class cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            Class[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (!arrayList.contains(interfaces[i])) {
                    arrayList.add(interfaces[i]);
                }
                for (Class cls2 : m114306a(interfaces[i])) {
                    if (!arrayList.contains(cls2)) {
                        arrayList.add(cls2);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* renamed from: a */
    public static CronetException m114303a(int i, int i2, String str) {
        int a = m114302a(i);
        StringBuilder sb = new StringBuilder("Exception in CronetUrlRequest: ");
        sb.append(str);
        return new NetworkExceptionImpl(sb.toString(), a, i2);
    }
}
