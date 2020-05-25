package com.p683ss.android.account.token;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import java.net.URI;
import java.util.Set;

/* renamed from: com.ss.android.account.token.f */
public final class C18508f {

    /* renamed from: a */
    private static String f51012a;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049 A[SYNTHETIC, Splitter:B:17:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[SYNTHETIC, Splitter:B:25:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m44796a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            r4.append(r5)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x004d, all -> 0x0046 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            r2.<init>()     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            r2.append(r3)     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            goto L_0x002e
        L_0x0039:
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x004e, all -> 0x0041 }
            r1.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            return r2
        L_0x0041:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0047
        L_0x0046:
            r1 = move-exception
        L_0x0047:
            if (r0 == 0) goto L_0x004c
            r0.close()     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            throw r1
        L_0x004d:
            r1 = r0
        L_0x004e:
            if (r1 == 0) goto L_0x0053
            r1.close()     // Catch:{ Exception -> 0x0053 }
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.account.token.C18508f.m44796a():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m44798a(Context context) {
        String b = m44800b(context);
        if ((b == null || !b.contains(":")) && b != null && b.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m44800b(Context context) {
        String str = f51012a;
        if (!C9431p.m18664a(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    String str2 = runningAppProcessInfo.processName;
                    f51012a = str2;
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        String a = m44796a();
        f51012a = a;
        return a;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b A[Catch:{ Exception -> 0x0055 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m44797a(java.lang.String r3) {
        /*
            java.lang.String r0 = ""
            java.net.URI r1 = new java.net.URI     // Catch:{ Exception | URISyntaxException -> 0x0024 }
            r1.<init>(r3)     // Catch:{ Exception | URISyntaxException -> 0x0024 }
            java.lang.String r3 = r1.getHost()     // Catch:{ Exception | URISyntaxException -> 0x0024 }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ Exception | URISyntaxException -> 0x0024 }
            java.lang.String r0 = "[^\\.]+(\\.com\\.cn|\\.net\\.cn|\\.org\\.cn|\\.gov\\.cn|\\.com|\\.net|\\.cn|\\.org|\\.cc|\\.me|\\.tel|\\.mobi|\\.asia|\\.biz|\\.info|\\.name|\\.tv|\\.hk|\\.app|\\.公司|\\.中国|\\.网络|\\.ly)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception | URISyntaxException -> 0x0025 }
            java.util.regex.Matcher r0 = r0.matcher(r3)     // Catch:{ Exception | URISyntaxException -> 0x0025 }
            boolean r1 = r0.find()     // Catch:{ Exception | URISyntaxException -> 0x0025 }
            if (r1 == 0) goto L_0x0025
            java.lang.String r0 = r0.group()     // Catch:{ Exception | URISyntaxException -> 0x0025 }
            return r0
        L_0x0024:
            r3 = r0
        L_0x0025:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0055 }
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = "\\."
            java.lang.String[] r3 = r3.split(r0)     // Catch:{ Exception -> 0x0055 }
            if (r3 == 0) goto L_0x0055
            int r0 = r3.length     // Catch:{ Exception -> 0x0055 }
            r1 = 1
            if (r0 <= r1) goto L_0x0055
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0055 }
            r0.<init>()     // Catch:{ Exception -> 0x0055 }
            int r2 = r3.length     // Catch:{ Exception -> 0x0055 }
            int r2 = r2 + -2
            r2 = r3[r2]     // Catch:{ Exception -> 0x0055 }
            r0.append(r2)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r2 = "."
            r0.append(r2)     // Catch:{ Exception -> 0x0055 }
            int r2 = r3.length     // Catch:{ Exception -> 0x0055 }
            int r2 = r2 - r1
            r3 = r3[r2]     // Catch:{ Exception -> 0x0055 }
            r0.append(r3)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r3 = r0.toString()     // Catch:{ Exception -> 0x0055 }
            return r3
        L_0x0055:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.account.token.C18508f.m44797a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m44799a(String str, Set<String> set) {
        if (TextUtils.isEmpty(str) || set == null || set.isEmpty()) {
            return false;
        }
        try {
            String lowerCase = new URI(str).getHost().toLowerCase();
            if (TextUtils.isEmpty(lowerCase)) {
                return false;
            }
            for (String str2 : set) {
                if (!TextUtils.isEmpty(str2) && lowerCase.endsWith(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }
}
