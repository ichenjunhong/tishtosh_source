package com.p683ss.android.ugc.aweme.tools.draft.p2358d;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.ss.android.ugc.trill.R;
import java.util.Calendar;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.d.d */
public final class C46990d extends C46987a {
    /* renamed from: a */
    public final int mo94277a() {
        return R.string.dg2;
    }

    /* renamed from: b */
    public final boolean mo94280b(C29059c cVar) {
        C52711k.m112240b(cVar, "draft");
        C52711k.m112240b(cVar, "draft");
        Calendar instance = Calendar.getInstance();
        C52711k.m112236a((Object) instance, "current");
        instance.setTimeInMillis(System.currentTimeMillis());
        if (instance.getTimeInMillis() < cVar.f76129G) {
            return true;
        }
        Calendar instance2 = Calendar.getInstance();
        C52711k.m112236a((Object) instance2, "draftCalendar");
        instance2.setTimeInMillis(cVar.f76129G);
        if (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) {
            return true;
        }
        return false;
    }
}
