package com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2295f;

import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45905d;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45910h;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d.f.a */
public final class C46019a implements C45910h {

    /* renamed from: a */
    private final LinkedHashMap<String, C45905d> f116138a = new LinkedHashMap<>();

    /* renamed from: b */
    private final Map<String, C45905d> f116139b = this.f116138a;

    /* renamed from: a */
    public final Map<String, C45905d> mo92505a() {
        return this.f116139b;
    }

    /* renamed from: b */
    public final void mo92508b() {
        Collection<C45905d> values = this.f116138a.values();
        C52711k.m112236a((Object) values, "_customCategories.values");
        for (C45905d e : values) {
            e.mo92497e();
        }
    }

    /* renamed from: a */
    public final void mo92506a(C45905d dVar) {
        C52711k.m112240b(dVar, "category");
        Map map = this.f116138a;
        String key = dVar.mo92494b().getKey();
        C52711k.m112236a((Object) key, "category.categoryModel.key");
        map.put(key, dVar);
    }

    /* renamed from: a */
    public final void mo92507a(List<EffectCategoryModel> list) {
        int i;
        C52711k.m112240b(list, "origin");
        for (Entry value : mo92505a().entrySet()) {
            C45905d dVar = (C45905d) value.getValue();
            if (dVar.mo92493a() < 0 || dVar.mo92493a() > list.size()) {
                i = -1;
            } else {
                i = dVar.mo92493a();
            }
            if (i >= 0) {
                list.add(i, dVar.mo92494b());
            } else {
                list.add(dVar.mo92494b());
            }
        }
    }
}
