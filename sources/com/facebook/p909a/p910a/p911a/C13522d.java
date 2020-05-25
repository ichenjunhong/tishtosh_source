package com.facebook.p909a.p910a.p911a;

/* renamed from: com.facebook.a.a.a.d */
public class C13522d {

    /* renamed from: a */
    private static final String f35297a = C13522d.class.getCanonicalName();

    /* renamed from: b */
    private static Class<?> f35298b;

    /* renamed from: a */
    public static void m27330a(String str) {
        m27331a("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    /* renamed from: a */
    public static void m27331a(String str, String str2, String str3) {
        try {
            if (f35298b == null) {
                f35298b = Class.forName("com.unity3d.player.UnityPlayer");
            }
            f35298b.getMethod("UnitySendMessage", new Class[]{String.class, String.class, String.class}).invoke(f35298b, new Object[]{str, str2, str3});
        } catch (Exception unused) {
        }
    }
}
