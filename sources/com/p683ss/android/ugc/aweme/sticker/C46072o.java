package com.p683ss.android.ugc.aweme.sticker;

import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.sticker.o */
public final class C46072o {
    /* renamed from: a */
    public static final String m100125a(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        if (m100126b(str) || m100127c(str)) {
            return str;
        }
        return "other";
    }

    /* renamed from: b */
    private static final boolean m100126b(String str) {
        if (str == null || !C52830p.m112411b(str, "prop_panel_", false, 2, null) || !(!C52711k.m112239a((Object) str, (Object) "prop_panel_prop_reuse")) || !(!C52711k.m112239a((Object) str, (Object) "prop_panel_challenge"))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static final boolean m100127c(String str) {
        if (C52711k.m112239a((Object) str, (Object) "prop_reuse") || C52711k.m112239a((Object) str, (Object) "prop_collect") || C52711k.m112239a((Object) str, (Object) "homepage_prop_maker") || C52711k.m112239a((Object) str, (Object) "favorite_prop") || C52711k.m112239a((Object) str, (Object) "prop_single_song") || C52711k.m112239a((Object) str, (Object) "prop_page") || C52711k.m112239a((Object) str, (Object) "qr_code") || C52711k.m112239a((Object) str, (Object) "challenge")) {
            return true;
        }
        return false;
    }
}
