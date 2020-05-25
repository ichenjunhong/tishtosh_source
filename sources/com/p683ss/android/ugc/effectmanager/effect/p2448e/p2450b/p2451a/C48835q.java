package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48647b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.net.ProviderEffectListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48708m;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.File;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.q */
public final class C48835q extends C48647b<ProviderEffectModel, ProviderEffectListResponse> {

    /* renamed from: d */
    public static final C48836a f122691d = new C48836a(null);

    /* renamed from: o */
    private static final String f122692o = f122692o;

    /* renamed from: e */
    private final C48890g f122693e;

    /* renamed from: f */
    private final C48620c f122694f = this.f122693e.f122972r;

    /* renamed from: g */
    private final C48641b f122695g = this.f122693e.f122976v;

    /* renamed from: h */
    private String f122696h;

    /* renamed from: i */
    private String f122697i;

    /* renamed from: j */
    private String f122698j;

    /* renamed from: k */
    private final C48565a f122699k;

    /* renamed from: l */
    private final String f122700l;

    /* renamed from: m */
    private final int f122701m;

    /* renamed from: n */
    private final int f122702n;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.q$a */
    public static final class C48836a {
        private C48836a() {
        }

        public /* synthetic */ C48836a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.q$b */
    static final class C48837b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48835q f122703a;

        /* renamed from: b */
        final /* synthetic */ C48649d f122704b;

        C48837b(C48835q qVar, C48649d dVar) {
            this.f122703a = qVar;
            this.f122704b = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122703a.f122286b instanceof C48708m) {
                C48650e<T> eVar = this.f122703a.f122286b;
                if (eVar != null) {
                    ((C48708m) eVar).mo73920a(this.f122704b);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.q$c */
    static final class C48838c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48835q f122705a;

        /* renamed from: b */
        final /* synthetic */ ProviderEffectModel f122706b;

        C48838c(C48835q qVar, ProviderEffectModel providerEffectModel) {
            this.f122705a = qVar;
            this.f122706b = providerEffectModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122705a.f122286b;
            if (eVar != null) {
                ProviderEffectModel providerEffectModel = this.f122706b;
                C52711k.m112236a((Object) providerEffectModel, "effectModel");
                eVar.mo8638a(providerEffectModel);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: d */
    public final Class<ProviderEffectListResponse> mo96228d() {
        return ProviderEffectListResponse.class;
    }

    /* renamed from: b */
    public final int mo96226b() {
        return this.f122693e.f122973s;
    }

    /* renamed from: h */
    public final void mo96236h() {
        C48649d dVar = new C48649d(10001);
        dVar.mo96230a(this.f122696h, this.f122697i, this.f122698j);
        if (this.f122286b instanceof C48708m) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48708m) eVar).mo73920a(dVar);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect");
        }
    }

    /* renamed from: a */
    public final C48605b mo96223a() {
        HashMap a = C48668f.f122308a.mo96252a(this.f122693e);
        if (!TextUtils.isEmpty(this.f122700l)) {
            Map map = a;
            String str = "library";
            String str2 = this.f122700l;
            if (str2 == null) {
                C52711k.m112234a();
            }
            map.put(str, str2);
        }
        Map map2 = a;
        map2.put("cursor", String.valueOf(this.f122701m));
        map2.put("count", String.valueOf(this.f122702n));
        this.f122697i = this.f122699k.mo96084a();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122697i);
        sb.append(this.f122693e.f122955a);
        sb.append("/stickers/recommend");
        String a2 = C48676l.m105346a(map2, sb.toString());
        this.f122696h = a2;
        try {
            InetAddress byName = InetAddress.getByName(new URL(a2).getHost());
            C52711k.m112236a((Object) byName, "address");
            this.f122698j = byName.getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C48605b("GET", a2);
    }

    /* renamed from: a */
    public final void mo96224a(C48649d dVar) {
        C52711k.m112240b(dVar, "exceptionResult");
        dVar.mo96230a(this.f122696h, this.f122697i, this.f122698j);
        mo96235a((C52670a<C52860x>) new C48837b<C52860x>(this, dVar));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96225a(BaseNetResponse baseNetResponse) {
        String str;
        ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) baseNetResponse;
        C52711k.m112240b(providerEffectListResponse, "netResponse");
        ProviderEffectModel data = providerEffectListResponse.getData();
        if (!(data == null || data.getStickerList() == null)) {
            for (ProviderEffect providerEffect : data.getStickerList()) {
                C52711k.m112236a((Object) providerEffect, "effect");
                StringBuilder sb = new StringBuilder();
                File file = this.f122693e.f122964j;
                C52711k.m112236a((Object) file, "mConfiguration.effectDir");
                sb.append(file.getAbsolutePath());
                sb.append(File.separator);
                sb.append(providerEffect.getId());
                sb.append(".gif");
                providerEffect.setPath(sb.toString());
            }
        }
        if (data != null) {
            try {
                String a = C48667e.m105298a(this.f122693e.f122960f, this.f122700l);
                C48641b bVar = this.f122695g;
                if (bVar != null) {
                    str = bVar.mo59190a(data);
                } else {
                    str = null;
                }
                if (str != null) {
                    C48620c cVar = this.f122694f;
                    if (cVar != null) {
                        C52711k.m112236a((Object) a, "key");
                        cVar.mo96148a(a, str);
                    }
                }
            } catch (Exception unused) {
            }
        }
        mo96235a((C52670a<C52860x>) new C48838c<C52860x>(this, data));
    }

    public C48835q(C48565a aVar, String str, String str2, int i, int i2, Handler handler) {
        C52711k.m112240b(aVar, "mEffectContext");
        C52711k.m112240b(str, "taskFlag");
        C48890g gVar = aVar.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        C48644a aVar2 = gVar.f122977w;
        C48890g gVar2 = aVar.f122047a;
        C52711k.m112236a((Object) gVar2, "mEffectContext.effectConfiguration");
        C48641b bVar = gVar2.f122976v;
        C52711k.m112236a((Object) bVar, "mEffectContext.effectConfiguration.jsonConverter");
        super(aVar2, bVar, handler, str);
        this.f122699k = aVar;
        this.f122700l = str2;
        this.f122701m = i;
        this.f122702n = i2;
        C48890g gVar3 = this.f122699k.f122047a;
        C52711k.m112236a((Object) gVar3, "mEffectContext.effectConfiguration");
        this.f122693e = gVar3;
    }
}
