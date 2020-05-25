package com.p683ss.android.ugc.aweme.image;

import android.util.Log;
import com.facebook.common.p921e.C13699c;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.image.d */
public final class C35488d implements C13699c {

    /* renamed from: b */
    private static final C35488d f91221b = new C35488d();

    /* renamed from: a */
    public String f91222a = "unknown";

    /* renamed from: c */
    private int f91223c = 5;

    /* renamed from: a */
    public static C35488d m80206a() {
        return f91221b;
    }

    private C35488d() {
    }

    /* renamed from: a */
    public final void mo25585a(int i) {
        this.f91223c = i;
    }

    /* renamed from: b */
    public final boolean mo25590b(int i) {
        if (this.f91223c <= i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m80211b(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            C17840a.m43751a(th, printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    /* renamed from: a */
    private static boolean m80209a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m80210a(Throwable th) {
        if (th == null || th.getMessage() == null || th.getMessage().length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo25588b(String str, String str2) {
        m80207a(3, str, str2);
    }

    /* renamed from: c */
    public final void mo25591c(String str, String str2) {
        m80207a(4, str, str2);
    }

    /* renamed from: d */
    public final void mo25593d(String str, String str2) {
        m80207a(5, str, str2);
    }

    /* renamed from: f */
    public final void mo25596f(String str, String str2) {
        m80207a(6, str, str2);
    }

    /* renamed from: e */
    public final void mo25595e(String str, String str2) {
        if (str2 != null && str2.contains("init FrescoTTNetFetcher")) {
            StringBuilder sb = new StringBuilder("init FrescoTTNetFetcher ");
            sb.append(Log.getStackTraceString(new Throwable()));
            C32458a.m75144a(sb.toString());
        }
        if (str2 != null && str2.contains("Fresco has already been initialized!")) {
            StringBuilder sb2 = new StringBuilder("Fresco has already been initialized! ");
            sb2.append(Log.getStackTraceString(new Throwable()));
            C32458a.m75144a(sb2.toString());
        }
        m80207a(6, str, str2);
    }

    /* renamed from: a */
    public final void mo25586a(String str, String str2) {
        m80207a(2, str, str2);
    }

    /* renamed from: a */
    private static void m80207a(int i, String str, String str2) {
        if (!m80209a((CharSequence) str)) {
            m80209a((CharSequence) str2);
        }
    }

    /* renamed from: d */
    public final void mo25594d(String str, String str2, Throwable th) {
        m80208a(6, str, str2, th);
    }

    /* renamed from: c */
    public final void mo25592c(String str, String str2, Throwable th) {
        m80208a(6, str, str2, th);
        if (str2 != null && str2.contains("Malformed escape pair")) {
            StringBuilder sb = new StringBuilder("ImageEncryptUtils failed:");
            sb.append(str2);
            C32458a.m75144a(sb.toString());
        }
    }

    /* renamed from: b */
    public final void mo25589b(String str, String str2, Throwable th) {
        m80208a(5, str, str2, th);
        if (th instanceof IllegalStateException) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!m80209a((CharSequence) str2)) {
                    jSONObject.put("errorField", str2);
                }
                jSONObject.put("errorDesc", m80211b(th));
                jSONObject.put("status", 1);
                C23569o.m57779a("aweme_image_error_log", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo25587a(String str, String str2, Throwable th) {
        m80208a(3, str, str2, th);
    }

    /* renamed from: a */
    private static void m80208a(int i, String str, String str2, Throwable th) {
        if (!m80209a((CharSequence) str) && !m80209a((CharSequence) str2)) {
            m80210a(th);
        }
    }
}
