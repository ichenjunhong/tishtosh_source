package com.p683ss.android.ugc.aweme.notification.util;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.util.i */
public final class C38442i {

    /* renamed from: a */
    public static final C38442i f97841a = new C38442i();

    private C38442i() {
    }

    /* renamed from: a */
    public static final void m85757a(String str, String str2, int i) {
        C52711k.m112240b(str, "accountType");
        C52711k.m112240b(str2, "actionType");
        if (!TextUtils.isEmpty(str)) {
            C26890h.m65011a("notification_notice", C23089d.m56640a().mo47829a("notice_type", "number_dot").mo47829a("account_type", str).mo47829a("action_type", str2).mo47826a("show_cnt", i).f61491a);
        }
    }
}
