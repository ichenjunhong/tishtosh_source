package com.p683ss.android.ugc.aweme.tools.draft.p2357c;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.c.c */
public final class C46983c extends C46981a<C42482c> {
    /* renamed from: b */
    public final boolean mo94274b(C29059c cVar) {
        C52711k.m112240b(cVar, "draft");
        C52711k.m112240b(cVar, "draft");
        ArrayList<C29059c> arrayList = this.f118686b;
        if (arrayList != null) {
            C29059c cVar2 = (C29059c) C52575l.m112140f((List<? extends T>) arrayList);
            if (cVar2 != null) {
                C42482c cVar3 = cVar2.f76147e;
                if (cVar3 != null) {
                    long id = cVar3.getId();
                    C42482c cVar4 = cVar.f76147e;
                    if (cVar4 != null && id == cVar4.getId()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
