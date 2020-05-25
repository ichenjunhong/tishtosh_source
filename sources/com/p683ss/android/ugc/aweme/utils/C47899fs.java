package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.common.utility.C9431p;

/* renamed from: com.ss.android.ugc.aweme.utils.fs */
public final class C47899fs {
    /* renamed from: a */
    public static boolean m103617a(Context context, String str) {
        try {
            return m103618b(context, str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m103618b(Context context, String str) {
        if (context == null || C9431p.m18664a(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 64) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
