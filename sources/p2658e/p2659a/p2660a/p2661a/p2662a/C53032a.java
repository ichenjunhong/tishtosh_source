package p2658e.p2659a.p2660a.p2661a.p2662a;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Process;
import com.bytedance.common.utility.C9431p;

/* renamed from: e.a.a.a.a.a */
public class C53032a {

    /* renamed from: a */
    private static String f131511a = null;

    /* renamed from: b */
    private static boolean f131512b = true;

    /* renamed from: d */
    public static String f131513d = ":push";

    /* renamed from: e */
    public static boolean f131514e;

    /* renamed from: f */
    public static boolean f131515f;

    /* renamed from: b */
    public static boolean m112779b() {
        if (!f131515f) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f131514e = true;
                    f131515f = true;
                    return f131514e;
                }
            } catch (Exception unused) {
            }
            f131515f = true;
        }
        return f131514e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049 A[SYNTHETIC, Splitter:B:17:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[SYNTHETIC, Splitter:B:25:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m112776a() {
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
        throw new UnsupportedOperationException("Method not decompiled: p2658e.p2659a.p2660a.p2661a.p2662a.C53032a.m112776a():java.lang.String");
    }

    /* renamed from: a */
    public static String m112777a(Context context) {
        String str = f131511a;
        if (!C9431p.m18664a(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    String str2 = runningAppProcessInfo.processName;
                    f131511a = str2;
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        String a = m112776a();
        f131511a = a;
        return a;
    }

    /* renamed from: b */
    public static Intent m112778b(Context context) {
        if (context == null) {
            return null;
        }
        Intent intent = new Intent();
        try {
            if (VERSION.SDK_INT >= 26) {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
            } else if (VERSION.SDK_INT >= 21) {
                intent.putExtra("app_package", context.getPackageName());
                intent.putExtra("app_uid", context.getApplicationInfo().uid);
            } else if (VERSION.SDK_INT >= 14) {
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            }
            return intent;
        } catch (Exception unused) {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            return intent;
        }
    }
}
