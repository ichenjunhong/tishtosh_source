package com.bytedance.android.live.broadcast.p213h;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.bytedance.android.live.broadcast.h.d */
public final class C3444d {
    /* renamed from: a */
    public static boolean m9285a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }
}
