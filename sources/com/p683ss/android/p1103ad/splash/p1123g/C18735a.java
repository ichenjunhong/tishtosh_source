package com.p683ss.android.p1103ad.splash.p1123g;

import android.text.TextUtils;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.g.a */
public final class C18735a {
    /* renamed from: d */
    public static void m45671d(String str) {
        m45668c(0, str);
    }

    /* renamed from: b */
    public static void m45667b(String str) {
        m45661a(0, str);
    }

    /* renamed from: c */
    public static void m45670c(String str) {
        m45665b(0, str);
    }

    /* renamed from: a */
    public static void m45663a(String str) {
        if (C18642g.m45231g() != null) {
            StringBuilder sb = new StringBuilder();
            m45664a(sb, 0, str, null, null);
            C18642g.m45231g().mo37838a("[BDASplash]", sb.toString(), null, null);
        }
    }

    /* renamed from: a */
    public static void m45661a(long j, String str) {
        m45666b(j, str, null, null);
    }

    /* renamed from: b */
    public static void m45665b(long j, String str) {
        m45669c(0, str, null, null);
    }

    /* renamed from: c */
    private static void m45668c(long j, String str) {
        m45662a(0, str, null, null);
    }

    /* renamed from: a */
    public static void m45662a(long j, String str, Throwable th, JSONObject jSONObject) {
        if (C18642g.m45231g() != null) {
            m45664a(new StringBuilder(), j, str, th, null);
            C18642g.m45231g().mo37841d("[BDASplash]", str, th, null);
        }
    }

    /* renamed from: b */
    private static void m45666b(long j, String str, Throwable th, JSONObject jSONObject) {
        if (C18642g.m45231g() != null) {
            StringBuilder sb = new StringBuilder();
            m45664a(sb, j, str, null, null);
            C18642g.m45231g().mo37839b("[BDASplash]", sb.toString(), null, null);
        }
    }

    /* renamed from: c */
    private static void m45669c(long j, String str, Throwable th, JSONObject jSONObject) {
        if (C18642g.m45231g() != null) {
            StringBuilder sb = new StringBuilder();
            m45664a(sb, j, str, null, null);
            C18642g.m45231g().mo37840c("[BDASplash]", sb.toString(), null, null);
        }
    }

    /* renamed from: a */
    private static void m45664a(StringBuilder sb, long j, String str, Throwable th, JSONObject jSONObject) {
        sb.append("[BDASplash]");
        if (j > 0) {
            sb.append(", ");
            sb.append("SplashAdId");
            sb.append("= ");
            sb.append(j);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(", message: ");
            sb.append(str);
        }
        if (th != null) {
            sb.append(", tr: ");
            sb.append(th.getMessage());
        }
        if (jSONObject != null) {
            sb.append(", json: ");
            sb.append(jSONObject.toString());
        }
    }
}
