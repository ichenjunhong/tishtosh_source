package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48711p;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.f */
public final class C48794f extends C48653h<List<? extends String>> {

    /* renamed from: d */
    public final ArrayList<String> f122553d = new ArrayList<>();

    /* renamed from: e */
    private final C48565a f122554e;

    /* renamed from: f */
    private final C48890g f122555f;

    /* renamed from: g */
    private final C48641b f122556g;

    /* renamed from: h */
    private String f122557h;

    /* renamed from: i */
    private boolean f122558i;

    /* renamed from: j */
    private int f122559j;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.f$a */
    static final class C48795a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48794f f122560a;

        C48795a(C48794f fVar) {
            this.f122560a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122560a.f122286b;
            if (eVar != null) {
                eVar.mo8638a(this.f122560a.f122553d);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.f$b */
    static final class C48796b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48794f f122561a;

        /* renamed from: b */
        final /* synthetic */ C48649d f122562b;

        C48796b(C48794f fVar, C48649d dVar) {
            this.f122561a = fVar;
            this.f122562b = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122561a.f122286b instanceof C48711p) {
                C48650e<T> eVar = this.f122561a.f122286b;
                if (eVar != null) {
                    ((C48711p) eVar).mo92558a(this.f122562b);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        if (this.f122286b instanceof C48711p) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48711p) eVar).mo92558a(new C48649d(10001));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList");
        }
    }

    /* renamed from: e */
    public final void mo96229e() {
        int i = this.f122559j;
        int i2 = 0;
        while (i2 < i && !this.f122285a) {
            List list = this.f122553d;
            boolean z = this.f122558i;
            HashMap hashMap = new HashMap();
            hashMap.putAll(C48668f.f122308a.mo96252a(this.f122555f));
            if (!TextUtils.isEmpty(this.f122557h)) {
                Map map = hashMap;
                String str = "panel";
                String str2 = this.f122557h;
                if (str2 == null) {
                    C52711k.m112234a();
                }
                map.put(str, str2);
            }
            Map<String, Object> map2 = hashMap;
            map2.put("effect_ids", list);
            map2.put("type", Integer.valueOf(z ? 1 : 0));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f122554e.mo96084a());
            sb.append(this.f122555f.f122955a);
            sb.append("/v3/effect/favorite");
            C48605b bVar = new C48605b("POST", sb.toString());
            bVar.f122201e = map2;
            bVar.f122202f = "application/json";
            try {
                C48644a aVar = this.f122555f.f122977w;
                if (aVar != null) {
                    aVar.mo96220a(bVar, this.f122556g, BaseNetResponse.class);
                }
                mo96235a((C52670a<C52860x>) new C48795a<C52860x>(this));
                return;
            } catch (Exception e) {
                if (i2 == this.f122559j - 1 || (e instanceof C48636c)) {
                    mo96235a((C52670a<C52860x>) new C48796b<C52860x>(this, new C48649d(e)));
                    return;
                }
                i2++;
            }
        }
    }

    public C48794f(C48565a aVar, String str, String str2, Handler handler, List<String> list, boolean z) {
        C52711k.m112240b(aVar, "effectContext");
        C52711k.m112240b(str2, "taskFlag");
        super(handler, str2);
        this.f122554e = aVar;
        C48890g gVar = this.f122554e.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122555f = gVar;
        C48890g gVar2 = this.f122554e.f122047a;
        C52711k.m112236a((Object) gVar2, "mEffectContext.effectConfiguration");
        this.f122556g = gVar2.f122976v;
        this.f122553d.clear();
        if (list != null) {
            this.f122553d.addAll(list);
        }
        this.f122558i = z;
        this.f122557h = str;
        this.f122559j = this.f122555f.f122973s;
    }
}
