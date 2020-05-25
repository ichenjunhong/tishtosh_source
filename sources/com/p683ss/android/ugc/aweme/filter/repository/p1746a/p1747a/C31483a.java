package com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a;

import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31490c;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52718r;
import p2628d.p2639f.p2641b.C52719s;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2647j.C52753d;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a.a */
public final class C31483a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f82384a = {C52728w.m112248a((C52718r) new C52719s(C52728w.m112246a(C31483a.class, "tools.core_tiktokI18nRelease"), "EMPTY_FILTER_BEAN", "getEMPTY_FILTER_BEAN()Lcom/ss/android/ugc/aweme/filter/FilterBean;"))};

    /* renamed from: b */
    public static final String f82385b = f82385b;

    /* renamed from: c */
    private static final C31490c f82386c = new C31490c(C52575l.m112097a(), C52575l.m112097a());

    /* renamed from: d */
    private static final C52668f f82387d = C52732g.m112285a(C31484a.f82389a);

    /* renamed from: e */
    private static final EffectCategoryResponse f82388e;

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a.a$a */
    static final class C31484a extends C52712l implements C52670a<C31459g> {

        /* renamed from: a */
        public static final C31484a f82389a = new C31484a();

        C31484a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C31483a.m73320c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a.a$b */
    static final class C31485b extends C52712l implements C52671b<K, Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f82390a;

        C31485b(Object obj) {
            this.f82390a = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(C52711k.m112239a(obj, this.f82390a));
        }
    }

    /* renamed from: a */
    public static final C31490c m73315a() {
        return f82386c;
    }

    /* renamed from: b */
    public static final C31459g m73318b() {
        return (C31459g) f82387d.getValue();
    }

    /* renamed from: c */
    public static final C31459g m73320c() {
        C31459g gVar = new C31459g();
        gVar.f82332i = "";
        StringBuilder sb = new StringBuilder();
        String str = C43308eb.f109504q;
        C52711k.m112236a((Object) str, "ShortVideoConfig2.sFilterDir");
        sb.append(C31486b.m73322a(str));
        sb.append("filter_00");
        gVar.f82331h = sb.toString();
        gVar.f82326c = f82385b;
        gVar.f82325b = "";
        return gVar;
    }

    static {
        EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse("", "", "", C52575l.m112097a(), C52575l.m112097a(), "");
        f82388e = effectCategoryResponse;
    }

    /* renamed from: a */
    public static final <K, V> List<K> m73316a(List<? extends C52847n<? extends K, ? extends List<? extends V>>> list) {
        C52711k.m112240b(list, "$this$keys");
        Iterable<C52847n> iterable = list;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C52847n first : iterable) {
            arrayList.add(first.getFirst());
        }
        return (List) arrayList;
    }

    /* renamed from: b */
    public static final <K, V> List<V> m73319b(List<? extends C52847n<? extends K, ? extends List<? extends V>>> list) {
        C52711k.m112240b(list, "$this$values");
        Iterable<C52847n> iterable = list;
        Collection arrayList = new ArrayList();
        for (C52847n second : iterable) {
            C52575l.m112108a(arrayList, (Iterable) (List) second.getSecond());
        }
        return (List) arrayList;
    }

    /* renamed from: c */
    public static final <K, V> Map<K, List<V>> m73321c(List<? extends C52847n<? extends K, ? extends List<? extends V>>> list) {
        if (list == null) {
            return C52550ab.m112045a();
        }
        Iterable<C52847n> iterable = list;
        Map<K, List<V>> linkedHashMap = new LinkedHashMap<>(C52753d.m112321c(C52550ab.m112044a(C52575l.m112104a(iterable, 10)), 16));
        for (C52847n nVar : iterable) {
            linkedHashMap.put(nVar.getFirst(), nVar.getSecond());
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static final <K, V> List<V> m73317a(List<? extends C52847n<? extends K, ? extends List<? extends V>>> list, K k) {
        Object obj;
        C52711k.m112240b(list, "$this$findValue");
        C52671b bVar = new C31485b(k);
        C52711k.m112240b(list, "$this$findValue");
        C52711k.m112240b(bVar, "predicate");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Boolean) bVar.invoke(((C52847n) obj).getFirst())).booleanValue()) {
                break;
            }
        }
        C52847n nVar = (C52847n) obj;
        if (nVar != null) {
            return (List) nVar.getSecond();
        }
        return null;
    }
}
