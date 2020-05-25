package com.p683ss.android.ugc.aweme.filter;

import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.tools.view.p2509b.C50209b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.filter.e */
public final class C31456e {
    /* renamed from: a */
    public static List<C31459g> m73268a(Map<EffectCategoryResponse, List<C31459g>> map) {
        ArrayList arrayList = new ArrayList();
        for (Entry value : map.entrySet()) {
            boolean z = false;
            for (C31459g add : (List) value.getValue()) {
                arrayList.add(add);
                z = true;
            }
            if (z) {
                C31459g gVar = new C31459g();
                gVar.f82325b = "LINE";
                gVar.f82324a = -1;
                arrayList.add(gVar);
            }
        }
        if (arrayList.size() > 0 && ((C31459g) arrayList.get(arrayList.size() - 1)).f82325b.equals("LINE")) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m73267a(C50209b<C31459g> bVar, int i) {
        int i2 = 0;
        if (bVar == null) {
            return 0;
        }
        List b = bVar.mo92825b();
        int i3 = 0;
        while (i2 < b.size() && i2 < i) {
            if (((C31459g) b.get(i2)).f82325b.equals("LINE")) {
                i3++;
            }
            i2++;
        }
        return i3;
    }
}
