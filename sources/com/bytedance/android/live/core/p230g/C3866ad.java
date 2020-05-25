package com.bytedance.android.live.core.p230g;

/* renamed from: com.bytedance.android.live.core.g.ad */
public final class C3866ad {
    /* renamed from: a */
    public static String m9801a(String str) {
        String str2 = "";
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public static int m9800a(String str, int i) {
        try {
            return Integer.parseInt(m9801a(str).trim());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
