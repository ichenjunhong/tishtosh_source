package com.p683ss.android.ugc.aweme.profile.util;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.util.u */
public final class C40570u {

    /* renamed from: a */
    public static final C40570u f103512a = new C40570u();

    private C40570u() {
    }

    /* renamed from: a */
    public static void m90005a(String str, String str2) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(str2, "enterMethod");
        C26890h.m65011a(str, C23089d.m56640a().mo47829a("enter_method", str2).f61491a);
    }

    /* renamed from: a */
    public static void m90004a(int i, String str, String str2) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "clickMethod");
        C26890h.m65011a("modify_username_confirm", C23089d.m56640a().mo47829a("enter_from", str).mo47826a("status", i).mo47829a("click_method", str2).f61491a);
    }

    /* renamed from: b */
    public static void m90006b(int i, String str, String str2) {
        C52711k.m112240b(str, "enterFrom");
        C26890h.m65011a("save_username", C23089d.m56640a().mo47829a("enter_from", str).mo47826a("status", i).mo47829a("error_code", str2).f61491a);
    }

    /* renamed from: a */
    public final void mo82845a(int i, int i2, String str) {
        String str2;
        if (i2 != 4) {
            switch (i2) {
                case 1:
                    str2 = "personal_homepage";
                    break;
                case 2:
                    str2 = "modify_username_notify";
                    break;
                default:
                    str2 = "edit_profile_page";
                    break;
            }
        } else {
            str2 = "comment";
        }
        m90006b(i, str2, str);
    }
}
