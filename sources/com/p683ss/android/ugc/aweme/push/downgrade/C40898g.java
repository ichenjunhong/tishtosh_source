package com.p683ss.android.ugc.aweme.push.downgrade;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.g */
public class C40898g {

    /* renamed from: a */
    public static volatile String f104080a;

    /* renamed from: b */
    public static volatile String f104081b;

    /* renamed from: c */
    private static volatile boolean f104082c;

    /* renamed from: d */
    private static volatile boolean f104083d;

    /* renamed from: e */
    private static volatile boolean f104084e;

    /* renamed from: a */
    public static void m90472a() {
        f104084e = true;
    }

    /* renamed from: a */
    public static String m90471a(Context context) {
        m90475d(context);
        return f104080a;
    }

    /* renamed from: b */
    public static String m90473b(Context context) {
        m90475d(context);
        return f104081b;
    }

    /* renamed from: c */
    public static boolean m90474c(Context context) {
        m90476e(context);
        return f104084e;
    }

    /* renamed from: e */
    private static void m90476e(Context context) {
        if (!f104083d && !f104084e) {
            synchronized (C40898g.class) {
                if (!f104083d && !f104084e) {
                    m90477f(context);
                }
                f104083d = true;
            }
        }
    }

    /* renamed from: d */
    public static void m90475d(Context context) {
        if (!f104082c) {
            synchronized (C40898g.class) {
                if (!f104082c) {
                    String packageName = context.getPackageName();
                    StringBuilder sb = new StringBuilder();
                    sb.append(packageName);
                    sb.append(":push");
                    f104080a = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(packageName);
                    sb2.append(":pushservice");
                    f104081b = sb2.toString();
                    f104082c = true;
                }
            }
        }
    }

    /* renamed from: f */
    private static void m90477f(Context context) {
        try {
            List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            m90475d(context);
            if (runningAppProcesses != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo != null && !TextUtils.isEmpty(runningAppProcessInfo.processName)) {
                        if (TextUtils.equals(runningAppProcessInfo.processName, f104080a) || TextUtils.equals(runningAppProcessInfo.processName, f104081b)) {
                            f104084e = true;
                            return;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
