package com.bytedance.ies.p675g.p678c;

import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10779d.C10781b;
import com.bytedance.ies.p675g.p677b.C10805r;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.g.c.h */
public final class C10836h {

    /* renamed from: b */
    public static final C10838a f29099b = new C10838a(null);

    /* renamed from: a */
    public final C10847l f29100a;

    /* renamed from: c */
    private final C10825a f29101c;

    /* renamed from: d */
    private final Map<String, C52670a<Boolean>> f29102d;

    /* renamed from: com.bytedance.ies.g.c.h$a */
    static final class C10838a {
        private C10838a() {
        }

        public /* synthetic */ C10838a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.g.c.h$b */
    static final class C10839b implements C10781b {

        /* renamed from: a */
        final /* synthetic */ C10836h f29104a;

        C10839b(C10836h hVar) {
            this.f29104a = hVar;
        }

        /* renamed from: a */
        public final /* synthetic */ C10779d mo10575a() {
            return new C10842j(this.f29104a);
        }
    }

    /* renamed from: a */
    public final C10805r mo19620a(C10805r rVar) {
        if (rVar != null) {
            return rVar.mo19578a("__prefetch", (C10781b) new C10839b(this));
        }
        return null;
    }

    /* renamed from: a */
    public final C10843k mo19621a(C10853m mVar) {
        long j;
        C52711k.m112240b(mVar, "request");
        C10847l lVar = this.f29100a;
        C52711k.m112240b(mVar, "request");
        C10843k kVar = (C10843k) lVar.f29121a.mo19633a(mVar.toString());
        if (kVar == null || C10847l.m22009a(kVar)) {
            if (kVar != null) {
                j = kVar.f29118i;
            } else {
                j = -1;
            }
            return lVar.mo19625a(mVar, j);
        }
        lVar.mo19625a(mVar, kVar.f29118i);
        kVar.f29114e = 2;
        return kVar;
    }

    /* renamed from: a */
    public final void mo19622a(String str, C10805r rVar) {
        String str2;
        C52711k.m112240b(str, "pageUrl");
        StringBuilder sb = new StringBuilder("Start prefetch, page url: ");
        sb.append(str);
        C10833f.m21990a(sb.toString());
        Uri parse = Uri.parse(str);
        C52711k.m112236a((Object) parse, "uri");
        C52711k.m112240b(parse, "$this$toBasicUri");
        Uri build = new Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).build();
        C52711k.m112236a((Object) build, "Uri.Builder()\n        .s…is.path)\n        .build()");
        String uri = build.toString();
        C52711k.m112236a((Object) uri, "uri.toBasicUri().toString()");
        SortedMap a = C10862r.m22022a(parse);
        List<C10858n> a2 = this.f29101c.mo19603a(uri);
        if (a2 == null) {
            C10833f fVar = C10833f.f29097a;
            StringBuilder sb2 = new StringBuilder("No config found for page ");
            sb2.append(str);
            sb2.append(", skipping...");
            C10833f.m21991a(sb2.toString(), null);
            return;
        }
        this.f29100a.mo19627a();
        for (C10858n nVar : a2) {
            List<String> list = nVar.f29149d;
            if (list == null) {
                C52711k.m112237a("conditions");
            }
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    str2 = (String) it.next();
                    C52670a aVar = (C52670a) this.f29102d.get(str2);
                    if (aVar != null) {
                        if (!((Boolean) aVar.invoke()).booleanValue()) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    C10847l lVar = this.f29100a;
                    C52711k.m112240b(a, "queryMap");
                    C52711k.m112240b(nVar, "config");
                    StringBuilder sb3 = new StringBuilder("Start request: ");
                    sb3.append(nVar);
                    C10833f.m21990a(sb3.toString());
                    SortedMap<String, C10861q> sortedMap = nVar.f29151f;
                    if (sortedMap == null) {
                        C52711k.m112237a("paramMap");
                    }
                    SortedMap a3 = lVar.mo19626a(a, sortedMap);
                    if (a3 == null) {
                        C10833f.m21991a("Params error, skipping request.", null);
                    } else {
                        SortedMap<String, C10861q> sortedMap2 = nVar.f29152g;
                        if (sortedMap2 == null) {
                            C52711k.m112237a("dataMap");
                        }
                        SortedMap a4 = lVar.mo19626a(a, sortedMap2);
                        if (a4 == null) {
                            C10833f.m21991a("Data error, skipping request.", null);
                        } else {
                            String str3 = nVar.f29146a;
                            if (str3 == null) {
                                C52711k.m112237a("apiUrl");
                            }
                            String str4 = nVar.f29147b;
                            if (str4 == null) {
                                C52711k.m112237a("method");
                            }
                            SortedMap<String, String> sortedMap3 = nVar.f29150e;
                            if (sortedMap3 == null) {
                                C52711k.m112237a("headerMap");
                            }
                            C10853m mVar = new C10853m(str3, str4, sortedMap3, a3, a4);
                            lVar.mo19625a(mVar, nVar.f29148c);
                        }
                    }
                }
            }
            StringBuilder sb4 = new StringBuilder("Condition ");
            sb4.append(str2);
            sb4.append(" returned false, skipping this page.");
            C10833f.m21990a(sb4.toString());
        }
        mo19620a(rVar);
    }

    public C10836h(C10847l lVar, C10825a aVar, Map<String, ? extends C52670a<Boolean>> map) {
        C52711k.m112240b(lVar, "processManager");
        C52711k.m112240b(aVar, "configManager");
        C52711k.m112240b(map, "conditionMap");
        this.f29100a = lVar;
        this.f29101c = aVar;
        this.f29102d = map;
        C10825a aVar2 = this.f29101c;
        C52670a r3 = new C52670a<C52860x>(this) {

            /* renamed from: a */
            final /* synthetic */ C10836h f29103a;

            {
                this.f29103a = r1;
            }

            public final /* synthetic */ Object invoke() {
                C10847l lVar = this.f29103a.f29100a;
                lVar.f29124d.execute(new C10850c(lVar));
                return C52860x.f131107a;
            }
        };
        C52711k.m112240b(r3, "onSucceed");
        if (aVar2.f29081a) {
            r3.invoke();
        } else {
            aVar2.f29083c.execute(new C10826a(aVar2, r3));
        }
    }
}
