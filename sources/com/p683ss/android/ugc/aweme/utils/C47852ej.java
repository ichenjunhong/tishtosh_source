package com.p683ss.android.ugc.aweme.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.utils.ej */
public final class C47852ej {
    /* renamed from: a */
    public static void m103499a() {
        if (C11010c.m22280a() != null) {
            ActivityManager activityManager = (ActivityManager) C11010c.m22280a().getSystemService("activity");
            if (activityManager != null) {
                try {
                    for (RunningTaskInfo runningTaskInfo : activityManager.getRunningTasks(10)) {
                        m103500a(runningTaskInfo.topActivity, "topActivity");
                        m103500a(runningTaskInfo.baseActivity, "baseActivity");
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private static void m103500a(ComponentName componentName, String str) {
        if (C11010c.m22280a() != null) {
            String packageName = C11010c.m22280a().getPackageName();
            if (componentName != null && componentName.getPackageName().equals(packageName)) {
                C32458a.m75150b(str, componentName.toString());
            }
        }
    }
}
