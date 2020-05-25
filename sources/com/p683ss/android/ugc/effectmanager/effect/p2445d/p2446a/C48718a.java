package com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a;

import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.a.a */
public final class C48718a {

    /* renamed from: a */
    public final ConcurrentHashMap<String, Effect> f122362a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final ConcurrentHashMap<String, List<C48705j>> f122363b = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final List<Effect> mo96296a() {
        ArrayList arrayList = new ArrayList();
        Set<Entry> entrySet = this.f122362a.entrySet();
        C52711k.m112236a((Object) entrySet, "downloadingEffects.entries");
        for (Entry value : entrySet) {
            arrayList.add(value.getValue());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo96300a(String str) {
        if (str == null) {
            return false;
        }
        return this.f122362a.containsKey(str);
    }

    /* renamed from: a */
    public final void mo96297a(Effect effect) {
        if (effect != null) {
            this.f122362a.remove(effect.getEffectId());
            if (this.f122363b.containsKey(effect.getEffectId())) {
                List<C48705j> list = (List) this.f122363b.get(effect.getEffectId());
                if (list != null) {
                    for (C48705j a : list) {
                        a.mo8638a(effect);
                    }
                }
                this.f122363b.remove(effect.getEffectId());
            }
        }
    }

    /* renamed from: b */
    public final void mo96301b(Effect effect) {
        if (effect != null) {
            Map map = this.f122362a;
            String effectId = effect.getEffectId();
            C52711k.m112236a((Object) effectId, "effectId");
            map.put(effectId, effect);
            if (this.f122363b.containsKey(effect.getEffectId())) {
                List<C48705j> list = (List) this.f122363b.get(effect.getEffectId());
                if (list != null) {
                    for (C48705j a : list) {
                        a.mo8643a(effect);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo96298a(Effect effect, C48649d dVar) {
        C52711k.m112240b(dVar, "e");
        if (effect != null) {
            this.f122362a.remove(effect.getEffectId());
            if (this.f122363b.containsKey(effect.getEffectId())) {
                List<C48705j> list = (List) this.f122363b.get(effect.getEffectId());
                if (list != null) {
                    for (C48705j a : list) {
                        a.mo8644a(effect, dVar);
                    }
                }
                this.f122363b.remove(effect.getEffectId());
            }
        }
    }

    /* renamed from: a */
    public final void mo96299a(String str, C48705j jVar) {
        C52711k.m112240b(jVar, "iFetchEffectListener");
        if (mo96300a(str) && str != null) {
            if (this.f122363b.containsKey(str)) {
                List list = (List) this.f122363b.get(str);
                if (list != null) {
                    list.add(jVar);
                }
            } else {
                List synchronizedList = Collections.synchronizedList(C52575l.m112101c(jVar));
                Map map = this.f122363b;
                C52711k.m112236a((Object) synchronizedList, "list");
                map.put(str, synchronizedList);
            }
        }
    }
}
