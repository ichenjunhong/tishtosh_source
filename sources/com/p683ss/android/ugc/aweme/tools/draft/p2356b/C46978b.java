package com.p683ss.android.ugc.aweme.tools.draft.p2356b;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.LivePublishModel;
import com.p683ss.android.ugc.aweme.tools.draft.p2357c.C46982b;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.b.b */
public final class C46978b {
    /* renamed from: a */
    public static final boolean m102027a(C46982b bVar, C29059c cVar) {
        String str;
        C52711k.m112240b(cVar, "draft");
        if (bVar != null) {
            ArrayList<C29059c> arrayList = bVar.f118686b;
            if (arrayList != null) {
                C29059c cVar2 = (C29059c) C52575l.m112140f((List<? extends T>) arrayList);
                if (cVar2 != null) {
                    LivePublishModel ay = cVar2.mo58788ay();
                    if (ay != null) {
                        String roomId = ay.getRoomId();
                        if (roomId != null) {
                            LivePublishModel ay2 = cVar.mo58788ay();
                            if (ay2 != null) {
                                str = ay2.getRoomId();
                            } else {
                                str = null;
                            }
                            return C52711k.m112239a((Object) roomId, (Object) str);
                        }
                    }
                }
            }
        }
        return false;
    }
}
