package com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a;

import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.j */
public final class C31539j {
    /* renamed from: a */
    public static final Map<String, Effect> m73401a(List<? extends EffectCategoryResponse> list) {
        Map<String, Effect> linkedHashMap = new LinkedHashMap<>();
        for (EffectCategoryResponse totalEffects : list) {
            List<Effect> totalEffects2 = totalEffects.getTotalEffects();
            if (totalEffects2 != null) {
                for (Effect effect : totalEffects2) {
                    if (!(effect == null || effect.getName() == null)) {
                        String name = effect.getName();
                        C52711k.m112236a((Object) name, "effect.name");
                        linkedHashMap.put(name, effect);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static final List<C52847n<EffectCategoryResponse, List<C31459g>>> m73400a(List<? extends C52847n<? extends EffectCategoryResponse, ? extends List<C31493f>>> list, List<? extends C31459g> list2) {
        Object obj;
        boolean z;
        List<C52847n<EffectCategoryResponse, List<C31459g>>> arrayList = new ArrayList<>();
        for (C52847n nVar : list) {
            List arrayList2 = new ArrayList();
            for (C31493f fVar : (Iterable) nVar.getSecond()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C31459g) obj).f82324a == fVar.f82404a) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C31459g gVar = (C31459g) obj;
                if (gVar != null) {
                    arrayList2.add(gVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(C52856t.m112465a(nVar.getFirst(), arrayList2));
            }
        }
        return arrayList;
    }
}
