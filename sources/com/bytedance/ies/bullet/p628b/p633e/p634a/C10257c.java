package com.bytedance.ies.bullet.p628b.p633e.p634a;

import com.bytedance.ies.bullet.p628b.p633e.p634a.C10265d.C10266a;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10270b;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10273h.C10274a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10331b;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10333d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.ies.bullet.b.e.a.c */
public final class C10257c implements C10272g {

    /* renamed from: b */
    public static final C52671b<String, List<String>> f27650b = C10260c.f27658a;

    /* renamed from: c */
    public static final C52671b<List<String>, String> f27651c = C10259b.f27657a;

    /* renamed from: d */
    public static final C10258a f27652d = new C10258a(null);

    /* renamed from: a */
    public final C10326b f27653a;

    /* renamed from: e */
    private final Map<String, C10273h> f27654e = new LinkedHashMap();

    /* renamed from: f */
    private final Map<String, C10268e> f27655f = new LinkedHashMap();

    /* renamed from: g */
    private C10333d<C10255a> f27656g;

    /* renamed from: com.bytedance.ies.bullet.b.e.a.c$a */
    public static final class C10258a {
        private C10258a() {
        }

        public /* synthetic */ C10258a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.e.a.c$b */
    static final class C10259b extends C52712l implements C52671b<List<? extends String>, String> {

        /* renamed from: a */
        public static final C10259b f27657a = new C10259b();

        C10259b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            C52711k.m112240b(list, "it");
            return C52575l.m112120a(list, "/", null, null, 0, null, null, 62, null);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.e.a.c$c */
    static final class C10260c extends C52712l implements C52671b<String, List<? extends String>> {

        /* renamed from: a */
        public static final C10260c f27658a = new C10260c();

        C10260c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            return C52830p.m112452b((CharSequence) str, new String[]{"/"}, false, 0, 6, (Object) null);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.e.a.c$d */
    static final class C10261d extends C52712l implements C52671b<C10255a, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52687r f27659a;

        C10261d(C52687r rVar) {
            this.f27659a = rVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C10255a aVar = (C10255a) obj;
            C52711k.m112240b(aVar, "it");
            this.f27659a.mo18305a(aVar.f27643a, aVar.f27644b, aVar.f27645c, aVar.f27646d);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.e.a.c$e */
    static final class C10262e extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52687r f27660a;

        /* renamed from: b */
        final /* synthetic */ String f27661b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f27662c;

        /* renamed from: d */
        final /* synthetic */ C10270b f27663d;

        /* renamed from: e */
        final /* synthetic */ C52671b f27664e;

        C10262e(C52687r rVar, String str, JSONObject jSONObject, C10270b bVar, C52671b bVar2) {
            this.f27660a = rVar;
            this.f27661b = str;
            this.f27662c = jSONObject;
            this.f27663d = bVar;
            this.f27664e = bVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((Throwable) obj, "it");
            this.f27660a.mo18305a(this.f27661b, this.f27662c, this.f27663d, this.f27664e);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.e.a.c$f */
    static final class C10263f extends C52712l implements C52687r<String, JSONObject, C10270b, C52671b<? super Throwable, ? extends C52860x>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10257c f27665a;

        C10263f(C10257c cVar) {
            this.f27665a = cVar;
            super(4);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo18305a(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            JSONObject jSONObject = (JSONObject) obj2;
            C10270b bVar = (C10270b) obj3;
            C52671b bVar2 = (C52671b) obj4;
            C52711k.m112240b(str, "funcName");
            C52711k.m112240b(jSONObject, "params");
            C52711k.m112240b(bVar, "callback");
            C52711k.m112240b(bVar2, "reject");
            C10257c cVar = this.f27665a;
            List list = (List) C10257c.f27650b.invoke(str);
            C52711k.m112240b(list, "scopeNames");
            C52711k.m112240b(jSONObject, "params");
            C52711k.m112240b(bVar, "callback");
            C52711k.m112240b(bVar2, "reject");
            switch (list.size()) {
                case 0:
                    bVar2.invoke(new C10274a("[unknown]"));
                    break;
                case 1:
                    String str2 = (String) C52575l.m112137e(list);
                    C10268e eVar = (C10268e) cVar.mo18303c().get(str2);
                    if (eVar != null) {
                        eVar.mo18312a(jSONObject, bVar);
                        break;
                    } else {
                        bVar2.invoke(new C10274a(str2));
                        break;
                    }
                default:
                    String str3 = (String) C52575l.m112137e(list);
                    C10273h hVar = (C10273h) cVar.mo18302b().get(str3);
                    if (hVar != null) {
                        hVar.mo18308a(list.subList(1, list.size()), jSONObject, bVar, bVar2);
                        break;
                    } else {
                        bVar2.invoke(new C10274a(str3));
                        break;
                    }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.e.a.c$g */
    static final class C10264g extends C52712l implements C52682m<List<? extends C10273h>, C10268e, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52682m f27666a;

        C10264g(C52682m mVar) {
            this.f27666a = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str;
            List list = (List) obj;
            C10268e eVar = (C10268e) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(eVar, "bridge");
            C52682m mVar = this.f27666a;
            if (list.isEmpty()) {
                str = eVar.mo18313d();
            } else {
                Iterable<C10273h> iterable = list;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (C10273h b : iterable) {
                    arrayList.add(b.mo18309b());
                }
                List e = C52575l.m112139e((Collection) (List) arrayList);
                e.add(eVar.mo18313d());
                str = (String) C10257c.f27651c.invoke(e);
            }
            mVar.invoke(str, eVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: b */
    public final Map<String, C10273h> mo18302b() {
        return this.f27654e;
    }

    /* renamed from: c */
    public final Map<String, C10268e> mo18303c() {
        return this.f27655f;
    }

    /* renamed from: d */
    public final C10333d<C10255a> mo18304d() {
        return this.f27656g;
    }

    /* renamed from: a */
    public final void mo18295a() {
        for (Entry value : this.f27654e.entrySet()) {
            ((C10273h) value.getValue()).mo18295a();
        }
        for (Entry value2 : this.f27655f.entrySet()) {
            ((C10268e) value2.getValue()).mo18295a();
        }
        this.f27654e.clear();
        this.f27655f.clear();
    }

    /* renamed from: a */
    private void m20746a(C10333d<C10255a> dVar) {
        this.f27656g = dVar;
    }

    /* renamed from: a */
    public final void mo18300a(C52682m<? super String, ? super C10268e, C52860x> mVar) {
        C52711k.m112240b(mVar, "handler");
        C52682m gVar = new C10264g(mVar);
        C52711k.m112240b(gVar, "handler");
        for (Entry value : this.f27654e.entrySet()) {
            ((C10273h) value.getValue()).mo18307a(gVar);
        }
        for (Entry value2 : this.f27655f.entrySet()) {
            gVar.invoke(C52575l.m112097a(), value2.getValue());
        }
    }

    /* renamed from: a */
    public final void mo18299a(C10272g gVar, boolean z) {
        C52711k.m112240b(gVar, "otherRegistry");
        for (Entry entry : gVar.mo18302b().entrySet()) {
            if (mo18302b().containsKey(entry.getKey())) {
                C10273h hVar = (C10273h) this.f27654e.get(entry.getKey());
                if (hVar != null) {
                    hVar.mo18306a((C10273h) entry.getValue(), false);
                }
            } else {
                this.f27654e.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = gVar.mo18303c().entrySet().iterator();
        while (true) {
            C10257c cVar = null;
            if (!it.hasNext()) {
                break;
            }
            Entry entry2 = (Entry) it.next();
            if (true ^ this.f27655f.containsKey(entry2.getKey())) {
                cVar = this;
            }
            if (cVar != null) {
                this.f27655f.put(entry2.getKey(), entry2.getValue());
            }
        }
        if (mo18304d() == null) {
            m20746a(gVar.mo18304d());
            return;
        }
        C10333d d = mo18304d();
        if (d == null) {
            C52711k.m112234a();
        }
        C10333d d2 = gVar.mo18304d();
        if (d2 != null) {
            List b = C52575l.m112099b((Object[]) new C10333d[]{d, d2});
            if (b != null) {
                m20746a((C10333d<C10255a>) new C10331b<C10255a>(b, null, 2, null));
            }
        }
    }

    public C10257c(List<? extends C10275i> list, List<? extends C10268e> list2, C10326b bVar, C10333d<C10255a> dVar) {
        C52711k.m112240b(list, "scopeProviderFactories");
        C52711k.m112240b(list2, "bridges");
        C52711k.m112240b(bVar, "contextProviderFactory");
        this.f27653a = bVar;
        this.f27656g = dVar;
        for (C10275i iVar : list) {
            this.f27654e.put(iVar.mo18316a(), C10266a.m20762a(iVar, this.f27653a));
        }
        for (C10268e eVar : list2) {
            this.f27655f.put(eVar.mo18313d(), eVar);
        }
    }

    /* renamed from: a */
    public final void mo18301a(String str, JSONObject jSONObject, C10270b bVar, C52671b<? super Throwable, C52860x> bVar2) {
        C52711k.m112240b(str, "funcName");
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(bVar, "callback");
        C52711k.m112240b(bVar2, "reject");
        C52687r fVar = new C10263f(this);
        if (mo18304d() == null) {
            fVar.mo18305a(str, jSONObject, bVar, bVar2);
            return;
        }
        C10333d d = mo18304d();
        if (d == null) {
            C52711k.m112234a();
        }
        C10255a aVar = new C10255a(str, jSONObject, bVar, bVar2);
        C52671b dVar = new C10261d(fVar);
        C10262e eVar = new C10262e(fVar, str, jSONObject, bVar, bVar2);
        d.mo18267a(aVar, dVar, eVar);
    }
}
