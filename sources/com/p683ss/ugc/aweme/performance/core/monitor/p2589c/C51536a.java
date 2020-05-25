package com.p683ss.ugc.aweme.performance.core.monitor.p2589c;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.c.a */
public final class C51536a implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static WeakReference<Activity> f128745a = new WeakReference<>(null);

    /* renamed from: b */
    public static String f128746b = "";

    /* renamed from: c */
    public static final C51536a f128747c = new C51536a();

    /* renamed from: d */
    private static List<ActivityLifecycleCallbacks> f128748d = new ArrayList();

    private C51536a() {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2 == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResumed(android.app.Activity r2) {
        /*
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            f128745a = r0
            if (r2 == 0) goto L_0x0015
            java.lang.Class r2 = r2.getClass()
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = r2.getSimpleName()
            if (r2 != 0) goto L_0x0017
        L_0x0015:
            java.lang.String r2 = ""
        L_0x0017:
            f128746b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ugc.aweme.performance.core.monitor.p2589c.C51536a.onActivityResumed(android.app.Activity):void");
    }

    public final void onActivityStopped(Activity activity) {
        for (ActivityLifecycleCallbacks onActivityStopped : f128748d) {
            onActivityStopped.onActivityStopped(activity);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r1 == null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x000e
            android.content.ComponentName r1 = r1.getComponentName()
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.getShortClassName()
            if (r1 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r1 = ""
        L_0x0010:
            f128746b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ugc.aweme.performance.core.monitor.p2589c.C51536a.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }
}
