package com.bytedance.android.livesdk.p416t;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v4.content.C0745i;
import android.support.p030v4.p038f.C0800n;

/* renamed from: com.bytedance.android.livesdk.t.c */
final class C8289c {

    /* renamed from: a */
    private static final C0800n<String, Integer> f22637a;

    static {
        C0800n<String, Integer> nVar = new C0800n<>(8);
        f22637a = nVar;
        nVar.put("com.android.voicemail.permission.ADD_VOICEMAIL", Integer.valueOf(14));
        f22637a.put("android.permission.BODY_SENSORS", Integer.valueOf(20));
        f22637a.put("android.permission.READ_CALL_LOG", Integer.valueOf(16));
        f22637a.put("android.permission.READ_EXTERNAL_STORAGE", Integer.valueOf(16));
        f22637a.put("android.permission.USE_SIP", Integer.valueOf(9));
        f22637a.put("android.permission.WRITE_CALL_LOG", Integer.valueOf(16));
        f22637a.put("android.permission.SYSTEM_ALERT_WINDOW", Integer.valueOf(23));
        f22637a.put("android.permission.WRITE_SETTINGS", Integer.valueOf(23));
    }

    /* renamed from: a */
    private static boolean m16423a(Context context, String str) {
        try {
            if (C0745i.m2143a(context, str) == 0) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m16424a(Context context, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            String str = strArr[i];
            Integer num = (Integer) f22637a.get(str);
            if (num != null && VERSION.SDK_INT < num.intValue()) {
                z = false;
            }
            if (z && !m16423a(context, str)) {
                return false;
            }
            i++;
        }
    }
}
