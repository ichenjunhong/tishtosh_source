package com.p2615tt.miniapphost.util;

import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import com.p2615tt.miniapphost.AppBrandLogger;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tt.miniapphost.util.MiniAppProcessUtils */
public class MiniAppProcessUtils {
    private static volatile boolean mCheckedMiniAppProcessExist;
    private static String sCurProcessName;
    private static Boolean sIsMainProcess;
    private static Boolean sIsMiniAppProcess;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069 A[SYNTHETIC, Splitter:B:18:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b A[SYNTHETIC, Splitter:B:27:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getCurProcessNameFromProc() {
        /*
            r0 = 0
            r1 = 6
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.lang.String r6 = "/proc/"
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            int r6 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            r5.append(r6)     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.lang.String r6 = "/cmdline"
            r5.append(r6)     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.lang.String r5 = "iso-8859-1"
            r3.<init>(r4, r5)     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            r3.<init>()     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
        L_0x002f:
            int r4 = r2.read()     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            if (r4 <= 0) goto L_0x003a
            char r4 = (char) r4     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            r3.append(r4)     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            goto L_0x002f
        L_0x003a:
            java.lang.String r4 = "Process"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            r6 = 0
            java.lang.String r7 = "get processName = "
            r5[r6] = r7     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            r6 = 1
            java.lang.String r7 = r3.toString()     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            r5[r6] = r7     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            com.p2615tt.miniapphost.AppBrandLogger.m111322d(r4, r5)     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            r2.close()     // Catch:{ Exception -> 0x0056 }
            goto L_0x0060
        L_0x0056:
            r0 = move-exception
            java.lang.String r2 = "MiniAppProcessUtils"
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.p2615tt.miniapphost.AppBrandLogger.stacktrace(r1, r2, r0)
        L_0x0060:
            return r3
        L_0x0061:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
            goto L_0x0067
        L_0x0066:
            r2 = move-exception
        L_0x0067:
            if (r0 == 0) goto L_0x0077
            r0.close()     // Catch:{ Exception -> 0x006d }
            goto L_0x0077
        L_0x006d:
            r0 = move-exception
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r3 = "MiniAppProcessUtils"
            com.p2615tt.miniapphost.AppBrandLogger.stacktrace(r1, r3, r0)
        L_0x0077:
            throw r2
        L_0x0078:
            r2 = r0
        L_0x0079:
            if (r2 == 0) goto L_0x0089
            r2.close()     // Catch:{ Exception -> 0x007f }
            goto L_0x0089
        L_0x007f:
            r2 = move-exception
            java.lang.String r3 = "MiniAppProcessUtils"
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            com.p2615tt.miniapphost.AppBrandLogger.stacktrace(r1, r3, r2)
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2615tt.miniapphost.util.MiniAppProcessUtils.getCurProcessNameFromProc():java.lang.String");
    }

    public static boolean isMainProcess(Context context) {
        if (sIsMainProcess != null) {
            return sIsMainProcess.booleanValue();
        }
        if (context == null) {
            return false;
        }
        String curProcessName = getCurProcessName(context);
        if (curProcessName != null) {
            Boolean valueOf = Boolean.valueOf(curProcessName.equals(context.getPackageName()));
            sIsMainProcess = valueOf;
            if (valueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMiniAppProcess(Context context) {
        if (sIsMiniAppProcess != null) {
            return sIsMiniAppProcess.booleanValue();
        }
        if (context == null) {
            return false;
        }
        String curProcessName = getCurProcessName(context);
        if (curProcessName != null) {
            Boolean valueOf = Boolean.valueOf(curProcessName.contains(":miniapp"));
            sIsMiniAppProcess = valueOf;
            if (valueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkMiniAppProcessExistInMainProcess(Context context) {
        boolean z;
        if (mCheckedMiniAppProcessExist) {
            return false;
        }
        mCheckedMiniAppProcessExist = true;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((RunningAppProcessInfo) it.next()).processName.contains(":miniapp")) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            AppBrandLogger.m111323e("MiniAppProcessUtils", e);
        }
        z = false;
        AppBrandLogger.m111324i("MiniAppProcessUtils", "checkMiniAppProcessExistInMainProcess hasMiniAppProcessExist:", Boolean.valueOf(z), "duration:", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return z;
    }

    public static String getCurProcessName(Context context) {
        String str = sCurProcessName;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    AppBrandLogger.m111322d("MiniAppProcessUtils", "processName = ", runningAppProcessInfo.processName);
                    String str2 = runningAppProcessInfo.processName;
                    sCurProcessName = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "MiniAppProcessUtils", e.getStackTrace());
        }
        String curProcessNameFromProc = getCurProcessNameFromProc();
        sCurProcessName = curProcessNameFromProc;
        return curProcessNameFromProc;
    }

    public static void killCurrentProcess(Context context) {
        if (isMiniAppProcess(context)) {
            StringBuilder sb = new StringBuilder("killing Process: ");
            sb.append(getCurProcessName(context));
            AppBrandLogger.m111325w("MiniAppProcessUtils", sb.toString());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                AppBrandLogger.m111323e("MiniAppProcessUtils", e);
            }
            if (VERSION.SDK_INT >= 21) {
                killCurrentAppTask(context);
            }
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

    public static void killCurrentAppTask(Context context) {
        try {
            String curProcessName = getCurProcessName(context);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                List<AppTask> appTasks = activityManager.getAppTasks();
                if (appTasks != null && appTasks.size() > 0) {
                    for (AppTask appTask : appTasks) {
                        ComponentName component = appTask.getTaskInfo().baseIntent.getComponent();
                        if (component != null) {
                            String str = null;
                            int indexOf = curProcessName.indexOf(":");
                            if (indexOf >= 0) {
                                str = curProcessName.substring(indexOf + 1).replace("miniapp", "");
                            }
                            String className = component.getClassName();
                            AppBrandLogger.m111324i("MiniAppProcessUtils", "killCurrentAppTask processName", curProcessName, "miniAppProcessIndex", str, "componentClassName", className);
                            StringBuilder sb = new StringBuilder("MiniappTabActivity");
                            sb.append(str);
                            if (!className.endsWith(sb.toString())) {
                                StringBuilder sb2 = new StringBuilder("MiniappTabHostStackActivity");
                                sb2.append(str);
                                if (!className.endsWith(sb2.toString())) {
                                }
                            }
                            AppBrandLogger.m111324i("MiniAppProcessUtils", "finishAndRemoveMiniAppTask");
                            appTask.finishAndRemoveTask();
                        }
                    }
                }
            }
        } catch (Exception e) {
            AppBrandLogger.m111323e("MiniAppProcessUtils", e);
        }
    }
}
