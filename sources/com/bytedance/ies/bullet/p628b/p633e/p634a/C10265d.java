package com.bytedance.ies.bullet.p628b.p633e.p634a;

import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10270b;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10273h.C10274a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.ies.bullet.b.e.a.d */
public final class C10265d implements C10273h {

    /* renamed from: a */
    public static final C10266a f27667a = new C10266a(null);

    /* renamed from: b */
    private final String f27668b;

    /* renamed from: c */
    private final Map<String, C10273h> f27669c;

    /* renamed from: d */
    private final Map<String, C10268e> f27670d;

    /* renamed from: com.bytedance.ies.bullet.b.e.a.d$a */
    public static final class C10266a {
        private C10266a() {
        }

        public /* synthetic */ C10266a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C10273h m20762a(C10275i iVar, C10326b bVar) {
            C52711k.m112240b(iVar, "scopeProviderFactory");
            C52711k.m112240b(bVar, "contextProviderFactory");
            String a = iVar.mo18316a();
            Map linkedHashMap = new LinkedHashMap();
            for (C10275i iVar2 : (Iterable) iVar.mo18317b().invoke(bVar)) {
                linkedHashMap.put(iVar2.mo18316a(), m20762a(iVar2, bVar));
            }
            Map linkedHashMap2 = new LinkedHashMap();
            for (C10268e eVar : (Iterable) iVar.mo18318c().invoke(bVar)) {
                linkedHashMap2.put(eVar.mo18313d(), eVar);
            }
            return new C10265d(a, linkedHashMap, linkedHashMap2, null);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.e.a.d$b */
    static final class C10267b extends C52712l implements C52682m<List<? extends C10273h>, C10268e, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10265d f27671a;

        /* renamed from: b */
        final /* synthetic */ C52682m f27672b;

        C10267b(C10265d dVar, C52682m mVar) {
            this.f27671a = dVar;
            this.f27672b = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            C10268e eVar = (C10268e) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(eVar, "bridge");
            C52682m mVar = this.f27672b;
            List c = C52575l.m112101c(this.f27671a);
            c.addAll(list);
            mVar.invoke(c, eVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: b */
    public final String mo18309b() {
        return this.f27668b;
    }

    /* renamed from: c */
    public final Map<String, C10273h> mo18310c() {
        return this.f27669c;
    }

    /* renamed from: d */
    public final Map<String, C10268e> mo18311d() {
        return this.f27670d;
    }

    /* renamed from: a */
    public final void mo18295a() {
        for (Entry value : mo18310c().entrySet()) {
            ((C10273h) value.getValue()).mo18295a();
        }
        for (Entry value2 : mo18311d().entrySet()) {
            ((C10268e) value2.getValue()).mo18295a();
        }
    }

    /* renamed from: a */
    public final void mo18307a(C52682m<? super List<? extends C10273h>, ? super C10268e, C52860x> mVar) {
        C52711k.m112240b(mVar, "handler");
        for (Entry value : mo18310c().entrySet()) {
            ((C10273h) value.getValue()).mo18307a(new C10267b(this, mVar));
        }
        for (Entry value2 : mo18311d().entrySet()) {
            mVar.invoke(C52575l.m112092a(this), value2.getValue());
        }
    }

    /* renamed from: a */
    public final void mo18306a(C10273h hVar, boolean z) {
        boolean z2;
        C10265d dVar;
        C52711k.m112240b(hVar, "otherScope");
        for (Entry entry : hVar.mo18311d().entrySet()) {
            if (z || !mo18311d().containsKey(entry.getKey())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                dVar = this;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                mo18311d().put(entry.getKey(), entry.getValue());
            }
        }
        for (Entry entry2 : hVar.mo18310c().entrySet()) {
            if (mo18310c().containsKey(entry2.getKey())) {
                C10273h hVar2 = (C10273h) mo18310c().get(entry2.getKey());
                if (hVar2 != null) {
                    hVar2.mo18306a((C10273h) entry2.getValue(), z);
                }
            } else {
                mo18310c().put(entry2.getKey(), entry2.getValue());
            }
        }
    }

    private C10265d(String str, Map<String, C10273h> map, Map<String, C10268e> map2) {
        this.f27668b = str;
        this.f27669c = map;
        this.f27670d = map2;
    }

    public /* synthetic */ C10265d(String str, Map map, Map map2, C52707g gVar) {
        this(str, map, map2);
    }

    /* renamed from: a */
    public final void mo18308a(List<String> list, JSONObject jSONObject, C10270b bVar, C52671b<? super Throwable, C52860x> bVar2) {
        C52711k.m112240b(list, "scopeNames");
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(bVar, "callback");
        C52711k.m112240b(bVar2, "reject");
        switch (list.size()) {
            case 0:
                bVar2.invoke(new C10274a("[unknown]"));
                return;
            case 1:
                String str = (String) C52575l.m112137e((List) list);
                C10268e eVar = (C10268e) mo18311d().get(str);
                if (eVar == null) {
                    bVar2.invoke(new C10274a(str));
                    break;
                } else {
                    eVar.mo18312a(jSONObject, bVar);
                    return;
                }
            default:
                String str2 = (String) C52575l.m112137e((List) list);
                C10273h hVar = (C10273h) mo18310c().get(str2);
                if (hVar != null) {
                    hVar.mo18308a(list.subList(1, list.size()), jSONObject, bVar, bVar2);
                    break;
                } else {
                    bVar2.invoke(new C10274a(str2));
                    return;
                }
        }
    }
}
