package com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a;

import android.support.p030v4.p033b.C0703a;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31494g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31501n;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p2628d.C52847n;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a.c */
public final class C31487c {

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a.c$a */
    static final class C31488a extends C52712l implements C52671b<C31459g, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31459g f82391a;

        C31488a(C31459g gVar) {
            this.f82391a = gVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            C31459g gVar = (C31459g) obj;
            C52711k.m112240b(gVar, "it");
            if (gVar.f82324a == this.f82391a.f82324a) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static final boolean m73325a(C31499l lVar, C31459g gVar) {
        C31494g gVar2;
        C52711k.m112240b(lVar, "$this$isFilterAvailable");
        if (gVar != null) {
            gVar2 = lVar.mo64408a(gVar.f82324a);
        } else {
            gVar2 = null;
        }
        if (gVar2 == C31494g.FILTER_STATE_DOWNLOAD_SUCCESS) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final int m73323a(C31501n nVar, C31459g gVar) {
        Integer num;
        C52711k.m112240b(nVar, "$this$getAvailableIndexByFilter");
        if (gVar != null) {
            List list = (List) nVar.mo64418a().getValue();
            if (list != null) {
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (C52711k.m112239a((Object) (C31459g) it.next(), (Object) gVar)) {
                        break;
                    } else {
                        i++;
                    }
                }
                num = Integer.valueOf(i);
            } else {
                num = null;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static final C31459g m73326b(C31501n nVar, int i) {
        boolean z;
        C52711k.m112240b(nVar, "$this$getAvailableFilterById");
        List list = (List) nVar.mo64418a().getValue();
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C31459g) next).f82324a == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (C31459g) obj;
    }

    /* renamed from: c */
    public static final Effect m73328c(C31501n nVar, C31459g gVar) {
        C52711k.m112240b(nVar, "$this$findEffectOrNull");
        Effect effect = null;
        if (gVar != null) {
            Map map = (Map) nVar.mo64420c().getValue();
            if (map == null) {
                return null;
            }
            effect = (Effect) map.get(gVar.f82325b);
            if (effect == null) {
                effect = (Effect) map.get(gVar.f82326c);
            }
        }
        return effect;
    }

    /* renamed from: a */
    public static final C31459g m73324a(C31501n nVar, int i) {
        int i2;
        C52711k.m112240b(nVar, "$this$getAvailableFilterByIndex");
        List list = (List) nVar.mo64418a().getValue();
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        int a = C0703a.m2034a(i, 0, i2);
        if (list != null) {
            C31459g gVar = (C31459g) C52575l.m112118a(list, a);
            if (gVar != null) {
                return gVar;
            }
        }
        return C31483a.m73318b();
    }

    /* renamed from: b */
    public static final EffectCategoryResponse m73327b(C31501n nVar, C31459g gVar) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        C52711k.m112240b(nVar, "$this$findCategoryOrFirst");
        C52711k.m112240b(gVar, "filterBean");
        List list = (List) nVar.mo64419b().getValue();
        EffectCategoryResponse effectCategoryResponse = null;
        if (list != null) {
            C52711k.m112236a((Object) list, "table");
            C52671b aVar = new C31488a(gVar);
            C52711k.m112240b(list, "$this$findKey");
            C52711k.m112240b(aVar, "predicate");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Iterator it2 = ((Iterable) ((C52847n) obj).getSecond()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (((Boolean) aVar.invoke(obj3)).booleanValue()) {
                        break;
                    }
                }
                if (obj3 != null) {
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
            C52847n nVar2 = (C52847n) obj;
            if (nVar2 != null) {
                obj2 = nVar2.getFirst();
            } else {
                obj2 = null;
            }
            EffectCategoryResponse effectCategoryResponse2 = (EffectCategoryResponse) obj2;
            if (effectCategoryResponse2 == null) {
                C52847n nVar3 = (C52847n) C52575l.m112118a(list, 0);
                if (nVar3 != null) {
                    effectCategoryResponse = (EffectCategoryResponse) nVar3.getFirst();
                } else {
                    effectCategoryResponse2 = null;
                }
            }
            return effectCategoryResponse2;
        }
        return effectCategoryResponse;
    }
}
