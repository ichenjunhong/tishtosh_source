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
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.p683ss.android.ugc.effectmanager.effect.model.net.ResourceListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48709n;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.HashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.r */
public final class C48839r extends C48653h<ResourceListModel> {

    /* renamed from: d */
    private final C48890g f122707d;

    /* renamed from: e */
    private int f122708e;

    /* renamed from: f */
    private final C48565a f122709f;

    /* renamed from: g */
    private final Map<String, String> f122710g;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.r$a */
    static final class C48840a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48839r f122711a;

        /* renamed from: b */
        final /* synthetic */ ResourceListResponse f122712b;

        C48840a(C48839r rVar, ResourceListResponse resourceListResponse) {
            this.f122711a = rVar;
            this.f122712b = resourceListResponse;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122711a.f122286b;
            if (eVar != null) {
                ResourceListModel data = this.f122712b.getData();
                C52711k.m112236a((Object) data, "response.data");
                eVar.mo8638a(data);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.r$b */
    static final class C48841b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48839r f122713a;

        /* renamed from: b */
        final /* synthetic */ Exception f122714b;

        C48841b(C48839r rVar, Exception exc) {
            this.f122713a = rVar;
            this.f122714b = exc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122713a.f122286b instanceof C48709n) {
                C48650e<T> eVar = this.f122713a.f122286b;
                if (eVar != null) {
                    ((C48709n) eVar).mo92994a(new C48649d(this.f122714b));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchResourceListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        if (this.f122286b instanceof C48709n) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48709n) eVar).mo92994a(new C48649d(10001));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchResourceListener");
        }
    }

    /* renamed from: e */
    public final void mo96229e() {
        ResourceListResponse resourceListResponse;
        while (true) {
            int i = this.f122708e;
            this.f122708e = i - 1;
            if (i != 0) {
                try {
                    HashMap a = C48668f.f122308a.mo96252a(this.f122707d);
                    if (this.f122710g != null) {
                        a.putAll(this.f122710g);
                    }
                    Map map = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f122709f.mo96084a());
                    sb.append(this.f122707d.f122955a);
                    sb.append("/moji/resource");
                    C48605b bVar = new C48605b("GET", C48676l.m105346a(map, sb.toString()));
                    C48644a aVar = this.f122707d.f122977w;
                    if (aVar != null) {
                        resourceListResponse = (ResourceListResponse) aVar.mo96220a(bVar, this.f122707d.f122976v, ResourceListResponse.class);
                    } else {
                        resourceListResponse = null;
                    }
                    if (resourceListResponse != null && resourceListResponse.checkValue()) {
                        mo96235a((C52670a<C52860x>) new C48840a<C52860x>(this, resourceListResponse));
                        return;
                    }
                } catch (Exception e) {
                    if (this.f122708e == 0 || (e instanceof C48636c)) {
                        mo96235a((C52670a<C52860x>) new C48841b<C52860x>(this, e));
                    }
                }
            } else {
                return;
            }
        }
        mo96235a((C52670a<C52860x>) new C48841b<C52860x>(this, e));
    }

    public C48839r(C48565a aVar, Handler handler, String str, Map<String, String> map) {
        C52711k.m112240b(aVar, "mContext");
        C52711k.m112240b(str, "taskFlag");
        super(handler, str);
        this.f122709f = aVar;
        this.f122710g = map;
        C48890g gVar = this.f122709f.f122047a;
        C52711k.m112236a((Object) gVar, "mContext.effectConfiguration");
        this.f122707d = gVar;
        C48890g gVar2 = this.f122709f.f122047a;
        C52711k.m112236a((Object) gVar2, "mContext.effectConfiguration");
        this.f122708e = gVar2.f122973s;
    }
}
