package com.bytedance.apm.p465a.p468c;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: com.bytedance.apm.a.c.b */
public final class C8917b {

    /* renamed from: a */
    private static String f24286a;

    /* renamed from: a */
    public static String m17641a(Context context) {
        return C8918c.m17643a(context);
    }

    /* renamed from: a */
    private static String m17640a() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/cmdline");
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(sb.toString()), "iso-8859-1"));
            try {
                StringBuilder sb2 = new StringBuilder(32);
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb2.append((char) read);
                    } else {
                        String sb3 = sb2.toString();
                        C8916a.m17639a(bufferedReader);
                        return sb3;
                    }
                }
            } catch (Throwable th) {
                BufferedReader bufferedReader3 = bufferedReader;
                th = th;
                bufferedReader2 = bufferedReader3;
                C8916a.m17639a(bufferedReader2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C8916a.m17639a(bufferedReader2);
            throw th;
        }
    }

    /* renamed from: b */
    public static String m17642b(Context context) {
        String str = f24286a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str2 = runningAppProcessInfo.processName;
                        f24286a = str2;
                        return str2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String a = m17640a();
        f24286a = a;
        if (a == null) {
            return "";
        }
        return f24286a;
    }
}
