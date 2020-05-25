package com.p683ss.android.ugc.aweme.tools.draft.p2358d;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.ss.android.ugc.trill.R;
import java.util.Calendar;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.d.c */
public final class C46989c extends C46987a {
    /* renamed from: a */
    public final int mo94277a() {
        return R.string.dg1;
    }

    /* renamed from: b */
    public final boolean mo94280b(C29059c cVar) {
        C52711k.m112240b(cVar, "draft");
        C52711k.m112240b(cVar, "draft");
        Calendar instance = Calendar.getInstance();
        C52711k.m112236a((Object) instance, "current");
        instance.setTimeInMillis(System.currentTimeMillis());
        Calendar instance2 = Calendar.getInstance();
        C52711k.m112236a((Object) instance2, "draftCalendar");
        instance2.setTimeInMillis(cVar.f76129G);
        int i = instance.get(6) - instance2.get(6);
        if (instance.get(1) != instance2.get(1) || i < 7 || i >= 30) {
            return false;
        }
        return true;
    }
}
