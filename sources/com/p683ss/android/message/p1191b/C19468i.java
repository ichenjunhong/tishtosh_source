package com.p683ss.android.message.p1191b;

import android.os.Build;
import android.os.Build.VERSION;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.common.util.C18920g;

/* renamed from: com.ss.android.message.b.i */
public class C19468i {

    /* renamed from: a */
    public static String f53791a;

    /* renamed from: b */
    private static final String f53792b = String.valueOf(VERSION.SDK);

    /* renamed from: c */
    private static final C19469j f53793c = new C19469j();

    /* renamed from: d */
    private static String f53794d;

    /* renamed from: a */
    private static boolean m47647a() {
        String str = Build.MANUFACTURER;
        if (!C9431p.m18664a(str)) {
            return str.toLowerCase().contains("oppo");
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m47648b() {
        boolean z = false;
        try {
            String a = m47646a("ro.build.version.emui");
            f53794d = a;
            boolean a2 = C9431p.m18664a(a);
            if (!a2) {
                f53794d = f53794d.toLowerCase();
            }
            if (!a2) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        String str;
        boolean z;
        f53791a = f53792b;
        try {
            if (m47648b()) {
                if (C9431p.m18664a(f53794d)) {
                    f53794d = m47646a("ro.build.version.emui");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(f53794d);
                sb.append("_");
                sb.append(Build.DISPLAY);
                String lowerCase = sb.toString().toLowerCase();
                if (!C9431p.m18664a(lowerCase)) {
                    str = lowerCase.toLowerCase();
                } else {
                    str = f53792b;
                }
            } else {
                String a = m47646a("ro.vivo.os.build.display.id");
                if (C9431p.m18664a(a) || !a.toLowerCase().contains("funtouch")) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m47646a("ro.vivo.os.build.display.id"));
                    sb2.append("_");
                    sb2.append(m47646a("ro.vivo.product.version"));
                    str = sb2.toString().toLowerCase();
                } else if (m47647a()) {
                    if (m47647a()) {
                        StringBuilder sb3 = new StringBuilder("coloros_");
                        sb3.append(m47646a("ro.build.version.opporom"));
                        sb3.append("_");
                        sb3.append(Build.DISPLAY);
                        str = sb3.toString().toLowerCase();
                    } else {
                        str = f53792b;
                    }
                } else if (C18920g.m46054c()) {
                    StringBuilder sb4 = new StringBuilder("miui_");
                    sb4.append(m47646a("ro.miui.ui.version.name"));
                    sb4.append("_");
                    sb4.append(VERSION.INCREMENTAL);
                    str = sb4.toString().toLowerCase();
                } else {
                    str = f53792b;
                }
            }
        } catch (Throwable unused) {
            str = null;
        }
        if (C9431p.m18664a(str)) {
            str = f53792b;
        }
        f53791a = str;
    }

    /* renamed from: a */
    private static String m47646a(String str) {
        return f53793c.mo40601a(str);
    }
}
