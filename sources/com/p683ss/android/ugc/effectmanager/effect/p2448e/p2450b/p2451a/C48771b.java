package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48647b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.b */
public final class C48771b extends C48647b<List<? extends Effect>, EffectListResponse> {

    /* renamed from: d */
    private final C48890g f122498d;

    /* renamed from: e */
    private final C48565a f122499e;

    /* renamed from: f */
    private final List<String> f122500f;

    /* renamed from: g */
    private final Map<String, String> f122501g;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.b$a */
    static final class C48772a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48771b f122502a;

        /* renamed from: b */
        final /* synthetic */ C48649d f122503b;

        C48772a(C48771b bVar, C48649d dVar) {
            this.f122502a = bVar;
            this.f122503b = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122502a.f122286b instanceof C48704i) {
                C48650e<T> eVar = this.f122502a.f122286b;
                if (eVar != null) {
                    ((C48704i) eVar).mo77143a(this.f122503b);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.b$b */
    static final class C48773b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48771b f122504a;

        /* renamed from: b */
        final /* synthetic */ EffectListResponse f122505b;

        C48773b(C48771b bVar, EffectListResponse effectListResponse) {
            this.f122504a = bVar;
            this.f122505b = effectListResponse;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122504a.f122286b;
            if (eVar != null) {
                List data = this.f122505b.getData();
                C52711k.m112236a((Object) data, "netResponse.data");
                eVar.mo8638a(data);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: c */
    public final int mo96227c() {
        return 10014;
    }

    /* renamed from: d */
    public final Class<EffectListResponse> mo96228d() {
        return EffectListResponse.class;
    }

    /* renamed from: b */
    public final int mo96226b() {
        C48890g gVar = this.f122499e.f122047a;
        C52711k.m112236a((Object) gVar, "mContext.effectConfiguration");
        return gVar.f122973s;
    }

    /* renamed from: h */
    public final void mo96236h() {
        if (this.f122286b instanceof C48704i) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48704i) eVar).mo77143a(new C48649d(10001));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener");
        }
    }

    /* renamed from: a */
    public final C48605b mo96223a() {
        HashMap a = C48668f.f122308a.mo96252a(this.f122498d);
        if (this.f122501g != null) {
            a.putAll(this.f122501g);
        }
        Map map = a;
        String a2 = C48676l.m105345a(this.f122500f);
        C52711k.m112236a((Object) a2, "NetworkUtils.toJson(mEffectIds)");
        map.put("effect_ids", a2);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122499e.mo96084a());
        sb.append(this.f122498d.f122955a);
        sb.append("/v3/effect/list");
        return new C48605b("GET", C48676l.m105346a(map, sb.toString()));
    }

    /* renamed from: a */
    public final void mo96224a(C48649d dVar) {
        C52711k.m112240b(dVar, "exceptionResult");
        mo96235a((C52670a<C52860x>) new C48772a<C52860x>(this, dVar));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96225a(BaseNetResponse baseNetResponse) {
        EffectListResponse effectListResponse = (EffectListResponse) baseNetResponse;
        C52711k.m112240b(effectListResponse, "netResponse");
        File file = this.f122498d.f122964j;
        C52711k.m112236a((Object) file, "mConfiguration.effectDir");
        C48669g.m105309a(file.getAbsolutePath(), effectListResponse.getData());
        mo96235a((C52670a<C52860x>) new C48773b<C52860x>(this, effectListResponse));
    }

    public C48771b(C48565a aVar, List<String> list, Handler handler, String str, Map<String, String> map) {
        C52711k.m112240b(aVar, "mContext");
        C52711k.m112240b(str, "taskFlag");
        C48890g gVar = aVar.f122047a;
        C52711k.m112236a((Object) gVar, "mContext.effectConfiguration");
        C48644a aVar2 = gVar.f122977w;
        C48890g gVar2 = aVar.f122047a;
        C52711k.m112236a((Object) gVar2, "mContext.effectConfiguration");
        C48641b bVar = gVar2.f122976v;
        C52711k.m112236a((Object) bVar, "mContext.effectConfiguration.jsonConverter");
        super(aVar2, bVar, handler, str);
        this.f122499e = aVar;
        this.f122500f = list;
        this.f122501g = map;
        C48890g gVar3 = this.f122499e.f122047a;
        C52711k.m112236a((Object) gVar3, "mContext.effectConfiguration");
        this.f122498d = gVar3;
    }
}
