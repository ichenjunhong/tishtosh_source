package com.p683ss.android.ugc.aweme.commercialize.anchor;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.d */
public final class C25621d {

    /* renamed from: a */
    public static final C25621d f67820a = new C25621d();

    private C25621d() {
    }

    /* renamed from: a */
    public static void m62152a() {
        C26890h.m65011a("request_anchor_list", C23089d.m56640a().f61491a);
    }

    /* renamed from: a */
    public static void m62153a(List<C25626g> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (C25626g gVar : list) {
                arrayList.add(Integer.valueOf(gVar.f67830a));
            }
        }
        C26890h.m65011a("anchor_list_success", C23089d.m56640a().mo47829a("anchor_type", arrayList.toString()).f61491a);
    }
}
