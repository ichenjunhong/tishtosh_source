package com.bytedance.scene;

import android.os.Build.VERSION;
import android.os.Trace;

/* renamed from: com.bytedance.scene.r */
public final class C12967r {
    /* renamed from: a */
    public static void m26078a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: a */
    public static void m26079a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
