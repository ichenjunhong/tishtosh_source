package com.p683ss.android.ugc.aweme.filter.view.internal.main;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.LiveData;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31491d;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31492e;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31494g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1723a;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.FilterListViewStateViewModel */
public final class FilterListViewStateViewModel extends HumbleViewModel implements C31731q {

    /* renamed from: a */
    public final C0198r<Map<C31459g, C31494g>> f82701a = new C0198r<>();

    /* renamed from: b */
    public List<? extends C31459g> f82702b;

    /* renamed from: d */
    private C1690c f82703d;

    /* renamed from: e */
    private final C1710e<C31492e> f82704e = new C31662a(this);

    /* renamed from: f */
    private final C31499l f82705f;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.FilterListViewStateViewModel$a */
    static final class C31662a<T> implements C1710e<C31492e> {

        /* renamed from: a */
        final /* synthetic */ FilterListViewStateViewModel f82706a;

        C31662a(FilterListViewStateViewModel filterListViewStateViewModel) {
            this.f82706a = filterListViewStateViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            C31492e eVar = (C31492e) obj;
            C52711k.m112240b(eVar, "filterInfoEvent");
            C31491d dVar = eVar.f82403b;
            List<? extends C31459g> list = this.f82706a.f82702b;
            C31459g gVar = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((C31459g) next).f82324a == dVar.f82397a) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        gVar = next;
                        break;
                    }
                }
                gVar = gVar;
            }
            if (gVar != null) {
                Map map = (Map) this.f82706a.f82701a.getValue();
                if (map == null) {
                    map = C52550ab.m112045a();
                }
                C52711k.m112236a((Object) map, "_filterStates.value ?: emptyMap()");
                Map linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(map);
                linkedHashMap.put(gVar, dVar.f82398b);
                this.f82706a.f82701a.setValue(linkedHashMap);
            }
        }
    }

    /* renamed from: a */
    public final LiveData<Map<C31459g, C31494g>> mo64559a() {
        return this.f82701a;
    }

    public final void onCleared() {
        C1690c cVar = this.f82703d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f82703d = null;
    }

    /* renamed from: a */
    public final void mo64576a(List<? extends C31459g> list) {
        C52711k.m112240b(list, "list");
        this.f82702b = list;
        C0198r<Map<C31459g, C31494g>> rVar = this.f82701a;
        Iterable iterable = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C52753d.m112321c(C52550ab.m112044a(C52575l.m112104a(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(next, this.f82705f.mo64408a(((C31459g) next).f82324a));
        }
        rVar.setValue(linkedHashMap);
        if ((!list.isEmpty()) && !this.f125792c && this.f82703d == null) {
            this.f82703d = this.f82705f.mo64414d().mo6514a(C1667a.m5940a()).mo6505a(this.f82704e, C1723a.m6037b());
        }
    }

    public FilterListViewStateViewModel(C0184k kVar, C31499l lVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(lVar, "repository");
        super(kVar);
        this.f82705f = lVar;
    }
}
