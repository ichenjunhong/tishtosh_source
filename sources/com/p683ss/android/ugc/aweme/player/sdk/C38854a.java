package com.p683ss.android.ugc.aweme.player.sdk;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a */
public final class C38854a {

    /* renamed from: a */
    public static boolean f98960a;

    /* renamed from: a */
    public static void m86290a(String str, String str2) {
        if (f98960a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
        }
    }

    /* renamed from: b */
    public static void m86292b(String str, String str2) {
        if (f98960a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
        }
    }

    /* renamed from: a */
    public static void m86291a(String str, Throwable th) {
        String str2 = "PlayerLog";
        if (f98960a) {
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                m86291a(sb.toString(), th);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str);
        }
    }
}
