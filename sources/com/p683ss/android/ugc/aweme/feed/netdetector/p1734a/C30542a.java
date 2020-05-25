package com.p683ss.android.ugc.aweme.feed.netdetector.p1734a;

import android.util.Log;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.experiment.DetectorParamSettings;
import com.p683ss.android.ugc.network.observer.C50088b;
import com.p683ss.android.ugc.network.observer.C50096c;
import com.p683ss.android.ugc.network.observer.bean.C50094c;
import com.p683ss.android.ugc.network.observer.bean.C50095d;
import java.util.HashMap;
import java.util.Map.Entry;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.a.a */
public abstract class C30542a implements C30549e {

    /* renamed from: a */
    public long f79811a = -1;

    /* renamed from: b */
    public Long f79812b;

    /* renamed from: c */
    public C30543a f79813c;

    /* renamed from: d */
    public boolean f79814d;

    /* renamed from: e */
    public boolean f79815e;

    /* renamed from: f */
    private long f79816f = -1;

    /* renamed from: g */
    private final C52682m<C50088b, HashMap<String, HashMap<String, Object>>, C52860x> f79817g = new C30544b(this);

    /* renamed from: h */
    private final C52671b<HashMap<String, Object>, C52860x> f79818h = new C30545c(this);

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.a.a$a */
    static final class C30543a {

        /* renamed from: a */
        public final C50088b f79819a;

        /* renamed from: b */
        public final HashMap<String, HashMap<String, Object>> f79820b;

        public C30543a(C50088b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            C52711k.m112240b(bVar, "networkState");
            C52711k.m112240b(hashMap, "detailMap");
            this.f79819a = bVar;
            this.f79820b = hashMap;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.a.a$b */
    static final class C30544b extends C52712l implements C52682m<C50088b, HashMap<String, HashMap<String, Object>>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C30542a f79821a;

        C30544b(C30542a aVar) {
            this.f79821a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C50088b bVar = (C50088b) obj;
            HashMap hashMap = (HashMap) obj2;
            C52711k.m112240b(bVar, "networkState");
            C52711k.m112240b(hashMap, "detailMap");
            if (!this.f79821a.f79814d) {
                this.f79821a.f79814d = true;
                this.f79821a.f79812b = Long.valueOf(System.currentTimeMillis());
                this.f79821a.f79813c = new C30543a(bVar, hashMap);
                StringBuilder sb = new StringBuilder("detectResultCallback -> networkState:");
                sb.append(bVar);
                sb.append(", detailMap:");
                sb.append(hashMap);
                sb.append('}');
                C30542a.m71517a(sb.toString());
                this.f79821a.mo62739a(bVar, hashMap);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.a.a$c */
    static final class C30545c extends C52712l implements C52671b<HashMap<String, Object>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C30542a f79822a;

        C30545c(C30542a aVar) {
            this.f79822a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            HashMap hashMap = (HashMap) obj;
            C52711k.m112240b(hashMap, "map");
            if (!this.f79822a.f79815e) {
                this.f79822a.f79815e = true;
                C23089d dVar = new C23089d();
                for (Entry entry : hashMap.entrySet()) {
                    dVar.mo47828a((String) entry.getKey(), entry.getValue());
                }
                C26890h.m65011a(C50095d.m108048a(), dVar.f61491a);
                StringBuilder sb = new StringBuilder("detectResultReportCallback -> networkState:");
                sb.append(hashMap);
                sb.append('}');
                C30542a.m71517a(sb.toString());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public abstract void mo62738a(C23089d dVar);

    /* renamed from: a */
    public abstract void mo62739a(C50088b bVar, HashMap<String, HashMap<String, Object>> hashMap);

    /* renamed from: b */
    public final void mo62740b() {
        mo62741c();
    }

    /* renamed from: e */
    private final void m71518e() {
        C50096c.m108053a(this.f79816f);
    }

    /* renamed from: d */
    public final void mo62742d() {
        try {
            C30542a aVar = this;
            aVar.f79814d = true;
            aVar.f79815e = true;
            aVar.m71518e();
            C52848o.m114620constructorimpl(C52860x.f131107a);
        } catch (Throwable th) {
            C52848o.m114620constructorimpl(C52851p.m112464a(th));
        }
    }

    /* renamed from: a */
    public final void mo62737a() {
        try {
            C30542a aVar = this;
            aVar.f79811a = System.currentTimeMillis();
            aVar.f79816f = C50096c.f125485b.mo97879a(DetectorParamSettings.getParameters(), new C50094c(C30578o.m71570d(), C30578o.m71569c()), aVar.f79817g, aVar.f79818h);
            StringBuilder sb = new StringBuilder("requestStart -> Create NoNet-Detect. detector id : ");
            sb.append(aVar.f79816f);
            C52848o.m114620constructorimpl(Integer.valueOf(m71517a(sb.toString())));
        } catch (Throwable th) {
            C52848o.m114620constructorimpl(C52851p.m112464a(th));
        }
    }

    /* renamed from: c */
    public void mo62741c() {
        C52860x xVar;
        try {
            C30542a aVar = this;
            m71517a("requestFinish -> report and try to cancel NoNet-Detect");
            C30543a aVar2 = aVar.f79813c;
            if (aVar2 != null) {
                if (aVar2.f79819a == C50088b.NO_NETWORK) {
                    C23089d a = new C23089d().mo47828a(C50095d.m108050c(), (Object) aVar2.f79820b);
                    C52711k.m112236a((Object) a, "builder");
                    aVar.mo62738a(a);
                    C26890h.m65011a(C50095d.f125471a, a.f61491a);
                }
                xVar = C52860x.f131107a;
            } else {
                xVar = null;
            }
            C52848o.m114620constructorimpl(xVar);
        } catch (Throwable th) {
            C52848o.m114620constructorimpl(C52851p.m112464a(th));
        }
        mo62742d();
    }

    /* renamed from: a */
    public static int m71517a(String str) {
        return Log.d("NetDetectInterceptor", str);
    }
}
