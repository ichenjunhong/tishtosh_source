package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.os.Build.VERSION;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;

/* renamed from: com.ss.android.ugc.aweme.utils.fj */
public final class C47888fj {
    /* renamed from: a */
    public static boolean m103588a() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m103589b() {
        int identifier = C11010c.m22280a().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return C11010c.m22280a().getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    public static void m103590b(Activity activity) {
        if (VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | VideoCacheReadBuffersizeExperiment.DEFAULT);
        }
    }

    /* renamed from: a */
    public static int m103585a(int i) {
        int i2;
        try {
            int identifier = C11010c.m22280a().getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i2 = C11010c.m22280a().getResources().getDimensionPixelSize(identifier);
            } else {
                i2 = 44;
            }
            return C9432q.m18692c(C11010c.m22280a(), (float) i2);
        } catch (Exception unused) {
            return 44;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m103586a(android.app.Activity r7) {
        /*
            android.view.Window r0 = r7.getWindow()
            r1 = 1024(0x400, float:1.435E-42)
            r0.setFlags(r1, r1)
            r0 = 1
            r1 = 0
            android.content.Context r2 = r7.getApplicationContext()     // Catch:{ Exception -> 0x004a }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ Exception -> 0x004a }
            java.lang.String r3 = "android.os.SystemProperties"
            java.lang.Class r2 = r2.loadClass(r3)     // Catch:{ Exception -> 0x004a }
            java.lang.String r3 = "getInt"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x004a }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r1] = r6     // Catch:{ Exception -> 0x004a }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x004a }
            r5[r0] = r6     // Catch:{ Exception -> 0x004a }
            java.lang.reflect.Method r3 = r2.getMethod(r3, r5)     // Catch:{ Exception -> 0x004a }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x004a }
            java.lang.String r5 = "ro.miui.notch"
            r4[r1] = r5     // Catch:{ Exception -> 0x004a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x004a }
            r4[r0] = r5     // Catch:{ Exception -> 0x004a }
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch:{ Exception -> 0x004a }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x004a }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x004a }
            if (r2 != r0) goto L_0x004a
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x004a }
            r3 = 28
            if (r2 >= r3) goto L_0x004a
            r2 = 1
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            if (r2 == 0) goto L_0x006d
            java.lang.Class<android.view.Window> r2 = android.view.Window.class
            java.lang.String r3 = "addExtraFlags"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x006d }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x006d }
            r4[r1] = r5     // Catch:{ Exception -> 0x006d }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch:{ Exception -> 0x006d }
            android.view.Window r7 = r7.getWindow()     // Catch:{ Exception -> 0x006d }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x006d }
            r3 = 768(0x300, float:1.076E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x006d }
            r0[r1] = r3     // Catch:{ Exception -> 0x006d }
            r2.invoke(r7, r0)     // Catch:{ Exception -> 0x006d }
            return
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47888fj.m103586a(android.app.Activity):void");
    }

    /* renamed from: a */
    public static void m103587a(Activity activity, int i) {
        if (VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i);
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            C11065a.m22392a(activity, i);
        }
    }
}
