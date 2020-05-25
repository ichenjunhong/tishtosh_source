package com.p683ss.android.ugc.aweme.greenscreen;

import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.h */
public final class C32893h {

    /* renamed from: a */
    public static final C32893h f85524a = new C32893h();

    private C32893h() {
    }

    /* renamed from: a */
    public static String m75781a(String str) {
        String a = C39629l.m88232a().mo58577h().mo49489c().mo49495a("green_screen_picture");
        if (C52830p.m112413c(a, "/", false, 2, null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a);
        sb2.append(File.separator);
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    public static String m75782a(String str, String str2) {
        C52711k.m112240b(str2, "draftDir");
        if (C52830p.m112413c(str2, "/", false, 2, null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(File.separator);
        sb2.append(str);
        return sb2.toString();
    }
}
