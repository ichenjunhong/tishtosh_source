package com.p683ss.android.deviceregister.p1158c;

import android.os.Build;
import com.bytedance.common.utility.C9431p;

/* renamed from: com.ss.android.deviceregister.c.c */
public final class C19032c {

    /* renamed from: a */
    public static final CharSequence f52402a = "amigo";

    /* renamed from: b */
    public static final CharSequence f52403b = "funtouch";

    /* renamed from: c */
    private static final CharSequence f52404c = "sony";

    /* renamed from: a */
    public static boolean m46310a() {
        String str = Build.MANUFACTURER;
        if (!C9431p.m18664a(str)) {
            return str.toLowerCase().contains("oppo");
        }
        return false;
    }
}
