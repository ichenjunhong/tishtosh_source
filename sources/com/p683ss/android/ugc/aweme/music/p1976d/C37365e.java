package com.p683ss.android.ugc.aweme.music.p1976d;

import android.app.Activity;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.network.observer.C50088b;
import com.p683ss.android.ugc.network.observer.C50096c;
import com.p683ss.android.ugc.network.observer.bean.C50094c;
import com.p683ss.android.ugc.network.observer.bean.DetectorParam;
import java.util.HashMap;
import org.json.JSONObject;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.music.d.e */
public final class C37365e implements C37369f {

    /* renamed from: a */
    public long f95331a = -1;

    /* renamed from: b */
    public Long f95332b;

    /* renamed from: c */
    public C37366a f95333c;

    /* renamed from: d */
    public boolean f95334d;

    /* renamed from: e */
    public boolean f95335e;

    /* renamed from: f */
    final C37362c f95336f;

    /* renamed from: g */
    private boolean f95337g = true;

    /* renamed from: h */
    private long f95338h = -1;

    /* renamed from: i */
    private final C52682m<C50088b, HashMap<String, HashMap<String, Object>>, C52860x> f95339i = new C37367b(this);

    /* renamed from: j */
    private final C52671b<HashMap<String, Object>, C52860x> f95340j = new C37368c(this);

    /* renamed from: com.ss.android.ugc.aweme.music.d.e$a */
    static final class C37366a {

        /* renamed from: a */
        public final C50088b f95341a;

        /* renamed from: b */
        public final HashMap<String, HashMap<String, Object>> f95342b;

        public C37366a(C50088b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            C52711k.m112240b(bVar, "networkState");
            C52711k.m112240b(hashMap, "detailMap");
            this.f95341a = bVar;
            this.f95342b = hashMap;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.d.e$b */
    static final class C37367b extends C52712l implements C52682m<C50088b, HashMap<String, HashMap<String, Object>>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37365e f95343a;

        C37367b(C37365e eVar) {
            this.f95343a = eVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C50088b bVar = (C50088b) obj;
            HashMap hashMap = (HashMap) obj2;
            C52711k.m112240b(bVar, "networkState");
            C52711k.m112240b(hashMap, "detailMap");
            if (!this.f95343a.f95334d) {
                this.f95343a.f95334d = true;
                this.f95343a.f95332b = Long.valueOf(System.currentTimeMillis());
                this.f95343a.f95333c = new C37366a(bVar, hashMap);
                C37365e eVar = this.f95343a;
                C52711k.m112240b(bVar, "networkState");
                C52711k.m112240b(hashMap, "detailMap");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("start_time", eVar.f95331a);
                jSONObject.put("duration", System.currentTimeMillis() - eVar.f95331a);
                jSONObject.put("detect_result", bVar.name());
                eVar.f95336f.mo76648a(eVar, bVar, hashMap, jSONObject);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.d.e$c */
    static final class C37368c extends C52712l implements C52671b<HashMap<String, Object>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37365e f95344a;

        C37368c(C37365e eVar) {
            this.f95344a = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((HashMap) obj, "map");
            if (!this.f95344a.f95335e) {
                this.f95344a.f95335e = true;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: b */
    public final boolean mo76651b() {
        return this.f95337g;
    }

    /* renamed from: c */
    public final void mo76652c() {
        mo76653d();
    }

    /* renamed from: e */
    private final void m83653e() {
        C50096c.m108053a(this.f95338h);
    }

    /* renamed from: d */
    public final void mo76653d() {
        try {
            C37365e eVar = this;
            eVar.f95334d = true;
            eVar.f95335e = true;
            eVar.m83653e();
            C52848o.m114620constructorimpl(C52860x.f131107a);
        } catch (Throwable th) {
            C52848o.m114620constructorimpl(C52851p.m112464a(th));
        }
    }

    /* renamed from: a */
    public final void mo76646a() {
        String str;
        try {
            C37365e eVar = this;
            C50096c cVar = C50096c.f125485b;
            DetectorParam detectorParam = new DetectorParam(new String[]{"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"});
            Activity g = C11016e.m22312g();
            if (g != null) {
                Class cls = g.getClass();
                if (cls != null) {
                    str = cls.getSimpleName();
                    eVar.f95338h = cVar.mo97879a(detectorParam, new C50094c(str, ""), eVar.f95339i, eVar.f95340j);
                    eVar.f95331a = System.currentTimeMillis();
                    C52848o.m114620constructorimpl(C52860x.f131107a);
                }
            }
            str = null;
            eVar.f95338h = cVar.mo97879a(detectorParam, new C50094c(str, ""), eVar.f95339i, eVar.f95340j);
            eVar.f95331a = System.currentTimeMillis();
            C52848o.m114620constructorimpl(C52860x.f131107a);
        } catch (Throwable th) {
            C52848o.m114620constructorimpl(C52851p.m112464a(th));
        }
    }

    /* renamed from: a */
    public final void mo76650a(boolean z) {
        this.f95337g = false;
    }

    public C37365e(C37362c cVar) {
        C52711k.m112240b(cVar, "detectorCallBack");
        this.f95336f = cVar;
    }
}
