package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h;
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

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.l */
public final class C48817l extends C48653h<EffectListResponse> {

    /* renamed from: d */
    private final C48890g f122631d;

    /* renamed from: e */
    private int f122632e;

    /* renamed from: f */
    private final C48565a f122633f;

    /* renamed from: g */
    private final List<String> f122634g;

    /* renamed from: h */
    private final Map<String, String> f122635h;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.l$a */
    static final class C48818a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48817l f122636a;

        /* renamed from: b */
        final /* synthetic */ EffectListResponse f122637b;

        C48818a(C48817l lVar, EffectListResponse effectListResponse) {
            this.f122636a = lVar;
            this.f122637b = effectListResponse;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122636a.f122286b;
            if (eVar != null) {
                eVar.mo8638a(this.f122637b);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.l$b */
    static final class C48819b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48817l f122638a;

        C48819b(C48817l lVar) {
            this.f122638a = lVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122638a.f122286b instanceof C48703h) {
                C48650e<T> eVar = this.f122638a.f122286b;
                if (eVar != null) {
                    ((C48703h) eVar).mo89462a(new C48649d(10014));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.l$c */
    static final class C48820c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48817l f122639a;

        /* renamed from: b */
        final /* synthetic */ Exception f122640b;

        C48820c(C48817l lVar, Exception exc) {
            this.f122639a = lVar;
            this.f122640b = exc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122639a.f122286b instanceof C48703h) {
                C48650e<T> eVar = this.f122639a.f122286b;
                if (eVar != null) {
                    ((C48703h) eVar).mo89462a(new C48649d(this.f122640b));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        if (this.f122286b instanceof C48703h) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48703h) eVar).mo89462a(new C48649d(10001));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener");
        }
    }

    /* renamed from: e */
    public final void mo96229e() {
        EffectListResponse effectListResponse;
        while (true) {
            int i = this.f122632e;
            this.f122632e = i - 1;
            if (i != 0) {
                try {
                    List<String> list = this.f122634g;
                    HashMap a = C48668f.f122308a.mo96252a(this.f122631d);
                    if (this.f122635h != null) {
                        a.putAll(this.f122635h);
                    }
                    String a2 = C48676l.m105345a(list);
                    C52711k.m112236a((Object) a2, "NetworkUtils.toJson(effect_ids)");
                    a.put("effect_ids", a2);
                    Map map = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f122633f.mo96084a());
                    sb.append(this.f122631d.f122955a);
                    sb.append("/v3/effect/list");
                    C48605b bVar = new C48605b("GET", C48676l.m105346a(map, sb.toString()));
                    C48644a aVar = this.f122631d.f122977w;
                    if (aVar != null) {
                        effectListResponse = (EffectListResponse) aVar.mo96220a(bVar, this.f122631d.f122976v, EffectListResponse.class);
                    } else {
                        effectListResponse = null;
                    }
                    if (effectListResponse != null && effectListResponse.checkValue()) {
                        File file = this.f122631d.f122964j;
                        C52711k.m112236a((Object) file, "mConfiguration.effectDir");
                        C48669g.m105309a(file.getAbsolutePath(), effectListResponse.getData());
                        File file2 = this.f122631d.f122964j;
                        C52711k.m112236a((Object) file2, "mConfiguration.effectDir");
                        C48669g.m105309a(file2.getAbsolutePath(), effectListResponse.getCollection());
                        mo96235a((C52670a<C52860x>) new C48818a<C52860x>(this, effectListResponse));
                        return;
                    } else if (this.f122632e == 0) {
                        mo96235a((C52670a<C52860x>) new C48819b<C52860x>(this));
                    }
                } catch (Exception e) {
                    if (this.f122632e == 0 || (e instanceof C48636c)) {
                        mo96235a((C52670a<C52860x>) new C48820c<C52860x>(this, e));
                    }
                }
            } else {
                return;
            }
        }
        mo96235a((C52670a<C52860x>) new C48820c<C52860x>(this, e));
    }

    public C48817l(C48565a aVar, List<String> list, Handler handler, String str, Map<String, String> map) {
        C52711k.m112240b(aVar, "mContext");
        C52711k.m112240b(str, "taskFlag");
        super(handler, str);
        this.f122633f = aVar;
        this.f122634g = list;
        this.f122635h = map;
        C48890g gVar = this.f122633f.f122047a;
        C52711k.m112236a((Object) gVar, "mContext.effectConfiguration");
        this.f122631d = gVar;
        C48890g gVar2 = this.f122633f.f122047a;
        C52711k.m112236a((Object) gVar2, "mContext.effectConfiguration");
        this.f122632e = gVar2.f122973s;
    }
}
