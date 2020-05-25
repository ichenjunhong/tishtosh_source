package com.p683ss.android.ugc.aweme.feed.p1736ui;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bf */
public final class C30792bf {

    /* renamed from: a */
    public static final C30792bf f80671a = new C30792bf();

    private C30792bf() {
    }

    /* renamed from: a */
    public static void m72183a() {
        C26890h.m65011a("system_location_permission_show", (Map<String, String>) new HashMap<String,String>());
    }

    /* renamed from: a */
    public static void m72184a(int i) {
        C26890h.m65011a("location_permission_result", C23089d.m56640a().mo47826a("is_allow", i).f61491a);
    }

    /* renamed from: b */
    public static void m72185b(int i) {
        C26890h.m65011a("system_location_permission_result", C23089d.m56640a().mo47826a("is_allow", i).f61491a);
    }
}
