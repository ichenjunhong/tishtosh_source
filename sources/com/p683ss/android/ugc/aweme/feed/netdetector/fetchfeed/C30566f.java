package com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.feed.netdetector.p1734a.C30542a;
import com.p683ss.android.ugc.network.observer.C50088b;
import com.p683ss.android.ugc.network.observer.bean.C50095d;
import com.p683ss.android.ugc.network.observer.p2491b.C50090b;
import java.util.HashMap;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.f */
public final class C30566f extends C30542a {

    /* renamed from: g */
    public static final C30567a f79846g = new C30567a(null);

    /* renamed from: f */
    public final C30552a f79847f;

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.f$a */
    public static final class C30567a {
        private C30567a() {
        }

        public /* synthetic */ C30567a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.f$b */
    static final class C30568b extends C52712l implements C52671b<Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C30566f f79848a;

        /* renamed from: b */
        final /* synthetic */ C50088b f79849b;

        /* renamed from: c */
        final /* synthetic */ HashMap f79850c;

        C30568b(C30566f fVar, C50088b bVar, HashMap hashMap) {
            this.f79848a = fVar;
            this.f79849b = bVar;
            this.f79850c = hashMap;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).longValue();
            this.f79848a.f79847f.mo62745a(this.f79848a, this.f79849b, this.f79850c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: c */
    public final void mo62741c() {
        super.mo62741c();
        this.f79847f.mo62744a();
    }

    public C30566f(C30552a aVar) {
        C52711k.m112240b(aVar, "fetchFeedDetectorCallBack");
        this.f79847f = aVar;
    }

    /* renamed from: a */
    public final void mo62738a(C23089d dVar) {
        C52711k.m112240b(dVar, "builder");
        dVar.mo47827a(C50095d.f125473c, this.f79811a);
        dVar.mo47827a(C50095d.f125478h, System.currentTimeMillis() - this.f79811a);
        Long l = this.f79812b;
        if (l != null) {
            dVar.mo47827a(C50095d.f125477g, l.longValue() - this.f79811a);
        }
    }

    /* renamed from: a */
    public final void mo62739a(C50088b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
        C52860x xVar;
        C52711k.m112240b(bVar, "networkState");
        C52711k.m112240b(hashMap, "detailMap");
        try {
            C30566f fVar = this;
            if (!hashMap.containsKey("extra_info")) {
                hashMap.put("extra_info", new HashMap());
            }
            HashMap hashMap2 = (HashMap) hashMap.get("extra_info");
            if (hashMap2 != null) {
                C52711k.m112236a((Object) hashMap2, "map");
                hashMap2.put("start_time", Long.valueOf(fVar.f79811a));
                xVar = C52860x.f131107a;
            } else {
                xVar = null;
            }
            C52848o.m114620constructorimpl(xVar);
        } catch (Throwable th) {
            C52848o.m114620constructorimpl(C52851p.m112464a(th));
        }
        if (bVar == C50088b.NETWORK_GOOD || bVar == C50088b.UNKNOWN_STATUS) {
            new C50090b().mo97855a(10000, new C30568b(this, bVar, hashMap));
        } else {
            this.f79847f.mo62745a(this, bVar, hashMap);
        }
    }
}
