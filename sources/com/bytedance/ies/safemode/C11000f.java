package com.bytedance.ies.safemode;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.ies.safemode.f */
public final class C11000f {
    /* renamed from: a */
    public static final void m22267a() {
        Process.killProcess(Process.myPid());
        System.exit(10);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* renamed from: a */
    public static final List<RunningAppProcessInfo> m22266a(Context context) {
        C52711k.m112240b(context, "$this$getAllProcesses");
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return C52575l.m112097a();
            }
            return runningAppProcesses;
        }
        throw new C52857u("null cannot be cast to non-null type android.app.ActivityManager");
    }

    /* renamed from: b */
    public static final void m22268b(Context context) {
        C52711k.m112240b(context, "$this$killAllPackageProcesses");
        int myPid = Process.myPid();
        try {
            Object systemService = context.getSystemService("activity");
            if (systemService != null) {
                List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    runningAppProcesses = C52575l.m112097a();
                }
                String packageName = context.getPackageName();
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    String str = runningAppProcessInfo.processName;
                    C52711k.m112236a((Object) str, "procInfo.processName");
                    C52711k.m112236a((Object) packageName, "mainProcessName");
                    if (C52830p.m112411b(str, packageName, false, 2, null) && runningAppProcessInfo.pid != myPid) {
                        StringBuilder sb = new StringBuilder("Kill: ");
                        sb.append(runningAppProcessInfo.processName);
                        C10999e.m22265a(sb.toString());
                        Process.killProcess(runningAppProcessInfo.pid);
                    }
                }
                m22267a();
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.ActivityManager");
        } catch (Throwable unused) {
        }
    }
}
