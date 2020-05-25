package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48706k;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.n */
public final class C48825n extends C48653h<FetchFavoriteListResponse> {

    /* renamed from: d */
    private final C48890g f122651d;

    /* renamed from: e */
    private final C48641b f122652e;

    /* renamed from: f */
    private final int f122653f = this.f122651d.f122973s;

    /* renamed from: g */
    private final C48565a f122654g;

    /* renamed from: h */
    private final String f122655h;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.n$a */
    static final class C48826a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48825n f122656a;

        /* renamed from: b */
        final /* synthetic */ FetchFavoriteListResponse f122657b;

        C48826a(C48825n nVar, FetchFavoriteListResponse fetchFavoriteListResponse) {
            this.f122656a = nVar;
            this.f122657b = fetchFavoriteListResponse;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122656a.f122286b;
            if (eVar != null) {
                eVar.mo8638a(this.f122657b);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.n$b */
    static final class C48827b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48825n f122658a;

        /* renamed from: b */
        final /* synthetic */ C48649d f122659b;

        C48827b(C48825n nVar, C48649d dVar) {
            this.f122658a = nVar;
            this.f122659b = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122658a.f122286b instanceof C48706k) {
                C48650e<T> eVar = this.f122658a.f122286b;
                if (eVar != null) {
                    ((C48706k) eVar).mo92557a(this.f122659b);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        if (this.f122286b instanceof C48706k) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48706k) eVar).mo92557a(new C48649d(10001));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList");
        }
    }

    /* renamed from: e */
    public final void mo96229e() {
        FetchFavoriteListResponse fetchFavoriteListResponse;
        HashMap a = C48668f.f122308a.mo96252a(this.f122651d);
        if (!TextUtils.isEmpty(this.f122655h)) {
            Map map = a;
            String str = "panel";
            String str2 = this.f122655h;
            if (str2 == null) {
                C52711k.m112234a();
            }
            map.put(str, str2);
        }
        Map map2 = a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122654g.mo96084a());
        sb.append(this.f122651d.f122955a);
        sb.append("/v3/effect/my");
        C48605b bVar = new C48605b("GET", C48676l.m105346a(map2, sb.toString()));
        int i = 0;
        int i2 = this.f122653f;
        while (i < i2) {
            try {
                if (!this.f122285a) {
                    C48644a aVar = this.f122651d.f122977w;
                    if (aVar != null) {
                        fetchFavoriteListResponse = (FetchFavoriteListResponse) aVar.mo96220a(bVar, this.f122652e, FetchFavoriteListResponse.class);
                    } else {
                        fetchFavoriteListResponse = null;
                    }
                    if (fetchFavoriteListResponse != null) {
                        if (fetchFavoriteListResponse.checkValue()) {
                            File file = this.f122651d.f122964j;
                            C52711k.m112236a((Object) file, "mConfiguration.effectDir");
                            C48669g.m105309a(file.getAbsolutePath(), fetchFavoriteListResponse.getEffects());
                            File file2 = this.f122651d.f122964j;
                            C52711k.m112236a((Object) file2, "mConfiguration.effectDir");
                            C48669g.m105309a(file2.getAbsolutePath(), fetchFavoriteListResponse.getCollectEffects());
                            mo96235a((C52670a<C52860x>) new C48826a<C52860x>(this, fetchFavoriteListResponse));
                            return;
                        }
                    }
                    m105552a(new C48649d(10002));
                    i++;
                } else {
                    return;
                }
            } catch (Exception e) {
                if (i == this.f122653f - 1) {
                    m105552a(new C48649d(e));
                }
            }
        }
    }

    /* renamed from: a */
    private final void m105552a(C48649d dVar) {
        mo96235a((C52670a<C52860x>) new C48827b<C52860x>(this, dVar));
    }

    public C48825n(C48565a aVar, String str, String str2, Handler handler) {
        C52711k.m112240b(aVar, "mEffectContext");
        C52711k.m112240b(str2, "taskFlag");
        super(handler, str2);
        this.f122654g = aVar;
        this.f122655h = str;
        C48890g gVar = this.f122654g.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122651d = gVar;
        C48890g gVar2 = this.f122654g.f122047a;
        C52711k.m112236a((Object) gVar2, "mEffectContext.effectConfiguration");
        this.f122652e = gVar2.f122976v;
    }
}
