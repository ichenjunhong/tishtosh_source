package com.bytedance.crash.p555n;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.bytedance.crash.n.r */
public final class C9711r {

    /* renamed from: a */
    private static final CharSequence f26437a = "sony";

    /* renamed from: b */
    private static final CharSequence f26438b = "amigo";

    /* renamed from: c */
    private static final CharSequence f26439c = "funtouch";

    /* renamed from: i */
    private static boolean m19426i() {
        if (!TextUtils.isEmpty(C9712s.m19432a("ro.letv.release.version"))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m19419b() {
        StringBuilder sb = new StringBuilder();
        sb.append(C9712s.m19432a("ro.build.uiversion"));
        sb.append("_");
        sb.append(Build.DISPLAY);
        return sb.toString();
    }

    /* renamed from: e */
    private static boolean m19422e() {
        String a = C9712s.m19432a("ro.vivo.os.build.display.id");
        if (TextUtils.isEmpty(a) || !a.toLowerCase(Locale.getDefault()).contains(f26439c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m19423f() {
        if (TextUtils.isEmpty(Build.DISPLAY) || !Build.DISPLAY.toLowerCase(Locale.getDefault()).contains(f26438b)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static String m19424g() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.DISPLAY);
        sb.append("_");
        sb.append(C9712s.m19432a("ro.gn.sv.version"));
        return sb.toString();
    }

    /* renamed from: l */
    private static String m19429l() {
        String str = Build.DISPLAY;
        if (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) {
            return "";
        }
        return str;
    }

    /* renamed from: m */
    private static boolean m19430m() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m19420c() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(Build.BRAND);
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return false;
        }
        String lowerCase = sb2.toLowerCase(Locale.getDefault());
        if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static String m19421d() {
        StringBuilder sb = new StringBuilder();
        sb.append(C9712s.m19432a("ro.vivo.os.build.display.id"));
        sb.append("_");
        sb.append(C9712s.m19432a("ro.vivo.product.version"));
        return sb.toString();
    }

    /* renamed from: h */
    private static String m19425h() {
        if (!m19426i()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("eui_");
        sb.append(C9712s.m19432a("ro.letv.release.version"));
        sb.append("_");
        sb.append(Build.DISPLAY);
        return sb.toString();
    }

    /* renamed from: j */
    private static String m19427j() {
        if (!C9691d.m19335b()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("miui_");
        sb.append(C9712s.m19432a("ro.miui.ui.version.name"));
        sb.append("_");
        sb.append(VERSION.INCREMENTAL);
        return sb.toString();
    }

    /* renamed from: k */
    private static String m19428k() {
        String a = C9691d.m19332a();
        if (a == null || !a.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("_");
        sb.append(Build.DISPLAY);
        return sb.toString();
    }

    /* renamed from: n */
    private static String m19431n() {
        if (!m19430m()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("coloros_");
        sb.append(C9712s.m19432a("ro.build.version.opporom"));
        sb.append("_");
        sb.append(Build.DISPLAY);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m19418a() {
        if (C9691d.m19335b()) {
            return m19427j();
        }
        if (C9691d.m19337c()) {
            return m19429l();
        }
        if (m19430m()) {
            return m19431n();
        }
        String k = m19428k();
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        if (m19422e()) {
            return m19421d();
        }
        if (m19423f()) {
            return m19424g();
        }
        if (m19420c()) {
            return m19419b();
        }
        String h = m19425h();
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        return Build.DISPLAY;
    }
}
