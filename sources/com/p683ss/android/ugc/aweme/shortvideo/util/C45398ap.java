package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.p683ss.android.ugc.tools.utils.C50205i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ap */
public final class C45398ap {
    /* renamed from: a */
    public static void m98955a() {
        if (TextUtils.equals(Build.BRAND, "Xiaomi") && !m98957a("android.content.res.MiuiResourcesImpl", "sMiuiThemeEnabled", false)) {
            m98957a("android.content.res.MiuiResources", "sMiuiThemeEnabled", false);
        }
    }

    /* renamed from: a */
    public static void m98956a(Context context, int[] iArr, String str) {
        m98955a();
        for (int a : iArr) {
            C50205i.m108368a(context, a, str);
        }
    }

    /* renamed from: a */
    private static boolean m98957a(String str, String str2, boolean z) {
        boolean z2 = false;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            if (declaredField != null) {
                declaredField.setAccessible(true);
                declaredField.setBoolean(null, false);
                z2 = true;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
        }
        return z2;
    }
}
