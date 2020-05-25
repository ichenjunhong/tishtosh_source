package com.p683ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.p683ss.android.ugc.aweme.filter.repository.internal.C31591g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31482a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31489b;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31495h;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.a */
public final class C31572a implements C31495h {

    /* renamed from: a */
    private final Map<Integer, C31489b> f82559a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<Integer, C31489b> f82560b = new LinkedHashMap();

    /* renamed from: c */
    private final List<C52847n<EffectCategoryResponse, List<C31493f>>> f82561c;

    /* renamed from: d */
    private final C31482a f82562d;

    /* renamed from: e */
    private final C31499l f82563e;

    /* renamed from: f */
    private final C31591g f82564f;

    /* renamed from: a */
    public final C31482a mo64396a() {
        return this.f82562d;
    }

    /* renamed from: b */
    public final void mo64398b() {
        if (!this.f82559a.isEmpty()) {
            this.f82564f.mo64471a(this.f82559a.keySet());
        }
        if (!this.f82560b.isEmpty()) {
            this.f82564f.mo64472b(this.f82560b.keySet());
        }
    }

    /* renamed from: a */
    public final void mo64397a(C31489b bVar) {
        C52711k.m112240b(bVar, "filter");
        if (!bVar.f82394c) {
            this.f82560b.remove(Integer.valueOf(bVar.f82392a.f82404a));
            this.f82559a.put(Integer.valueOf(bVar.f82392a.f82404a), bVar);
        }
        this.f82563e.mo64407a(bVar.f82392a, this.f82561c);
    }

    /* renamed from: b */
    public final void mo64399b(C31489b bVar) {
        C52711k.m112240b(bVar, "filter");
        if (!bVar.f82394c) {
            this.f82560b.put(Integer.valueOf(bVar.f82392a.f82404a), bVar);
            this.f82559a.remove(Integer.valueOf(bVar.f82392a.f82404a));
            this.f82563e.mo64410a(bVar.f82392a);
        }
    }

    public C31572a(C31482a aVar, C31499l lVar, C31591g gVar) {
        C52711k.m112240b(aVar, "data");
        C52711k.m112240b(lVar, "filterRepository");
        C52711k.m112240b(gVar, "filterBoxDataSource");
        this.f82562d = aVar;
        this.f82563e = lVar;
        this.f82564f = gVar;
        Iterable<C52847n> iterable = this.f82562d.f82383b;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C52847n nVar : iterable) {
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) nVar.getFirst();
            C52711k.m112240b(effectCategoryModel, "$this$convertToEffectCategoryResponse");
            EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
            effectCategoryResponse.setId(effectCategoryModel.getId());
            effectCategoryResponse.setName(effectCategoryModel.getName());
            effectCategoryResponse.setKey(effectCategoryModel.getKey());
            Iterable<C31489b> iterable2 = (Iterable) nVar.getSecond();
            Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable2, 10));
            for (C31489b bVar : iterable2) {
                arrayList2.add(bVar.f82392a);
            }
            arrayList.add(C52856t.m112465a(effectCategoryResponse, (List) arrayList2));
        }
        this.f82561c = (List) arrayList;
    }
}
