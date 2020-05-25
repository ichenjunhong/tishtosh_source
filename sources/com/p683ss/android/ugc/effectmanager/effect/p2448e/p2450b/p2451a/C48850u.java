package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48647b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
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

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.u */
public final class C48850u extends C48647b<ProviderEffectModel, ProviderEffectListResponse> {

    /* renamed from: d */
    public static final C48851a f122736d = new C48851a(null);

    /* renamed from: n */
    private static final String f122737n = f122737n;

    /* renamed from: e */
    private final C48890g f122738e;

    /* renamed from: f */
    private String f122739f;

    /* renamed from: g */
    private String f122740g;

    /* renamed from: h */
    private String f122741h;

    /* renamed from: i */
    private final C48565a f122742i;

    /* renamed from: j */
    private final String f122743j;

    /* renamed from: k */
    private final String f122744k;

    /* renamed from: l */
    private final int f122745l;

    /* renamed from: m */
    private final int f122746m;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.u$a */
    public static final class C48851a {
        private C48851a() {
        }

        public /* synthetic */ C48851a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.u$b */
    static final class C48852b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48850u f122747a;

        /* renamed from: b */
        final /* synthetic */ C48649d f122748b;

        C48852b(C48850u uVar, C48649d dVar) {
            this.f122747a = uVar;
            this.f122748b = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122747a.f122286b instanceof C48708m) {
                C48650e<T> eVar = this.f122747a.f122286b;
                if (eVar != null) {
                    ((C48708m) eVar).mo73920a(this.f122748b);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.u$c */
    static final class C48853c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48850u f122749a;

        /* renamed from: b */
        final /* synthetic */ ProviderEffectModel f122750b;

        C48853c(C48850u uVar, ProviderEffectModel providerEffectModel) {
            this.f122749a = uVar;
            this.f122750b = providerEffectModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122749a.f122286b;
            if (eVar != null) {
                ProviderEffectModel providerEffectModel = this.f122750b;
                C52711k.m112236a((Object) providerEffectModel, "effectModel");
                eVar.mo8638a(providerEffectModel);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: c */
    public final int mo96227c() {
        return 10002;
    }

    /* renamed from: d */
    public final Class<ProviderEffectListResponse> mo96228d() {
        return ProviderEffectListResponse.class;
    }

    /* renamed from: b */
    public final int mo96226b() {
        return this.f122738e.f122973s;
    }

    /* renamed from: h */
    public final void mo96236h() {
        C48649d dVar = new C48649d(10001);
        dVar.mo96230a(this.f122739f, this.f122740g, this.f122741h);
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
        HashMap a = C48668f.f122308a.mo96252a(this.f122738e);
        if (!TextUtils.isEmpty(this.f122744k)) {
            Map map = a;
            String str = "library";
            String str2 = this.f122744k;
            if (str2 == null) {
                C52711k.m112234a();
            }
            map.put(str, str2);
        }
        if (!TextUtils.isEmpty(this.f122743j)) {
            a.put("word", this.f122743j);
        }
        Map map2 = a;
        map2.put("cursor", String.valueOf(this.f122745l));
        map2.put("count", String.valueOf(this.f122746m));
        this.f122740g = this.f122742i.mo96084a();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122740g);
        sb.append(this.f122738e.f122955a);
        sb.append("/stickers/search");
        String a2 = C48676l.m105346a(map2, sb.toString());
        this.f122739f = a2;
        try {
            InetAddress byName = InetAddress.getByName(new URL(a2).getHost());
            C52711k.m112236a((Object) byName, "address");
            this.f122741h = byName.getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C48605b("GET", a2);
    }

    /* renamed from: a */
    public final void mo96224a(C48649d dVar) {
        C52711k.m112240b(dVar, "exceptionResult");
        dVar.mo96230a(this.f122739f, this.f122740g, this.f122741h);
        mo96235a((C52670a<C52860x>) new C48852b<C52860x>(this, dVar));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96225a(BaseNetResponse baseNetResponse) {
        ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) baseNetResponse;
        C52711k.m112240b(providerEffectListResponse, "netResponse");
        ProviderEffectModel data = providerEffectListResponse.getData();
        if (!(data == null || data.getStickerList() == null)) {
            for (ProviderEffect providerEffect : data.getStickerList()) {
                C52711k.m112236a((Object) providerEffect, "effect");
                StringBuilder sb = new StringBuilder();
                File file = this.f122738e.f122964j;
                C52711k.m112236a((Object) file, "mConfiguration.effectDir");
                sb.append(file.getAbsolutePath());
                sb.append(File.separator);
                sb.append(providerEffect.getId());
                sb.append(".gif");
                providerEffect.setPath(sb.toString());
            }
        }
        mo96235a((C52670a<C52860x>) new C48853c<C52860x>(this, data));
    }

    public C48850u(C48565a aVar, String str, String str2, String str3, int i, int i2, Handler handler) {
        C52711k.m112240b(aVar, "mEffectContext");
        C52711k.m112240b(str, "taskFlag");
        C52711k.m112240b(str2, "mSearchWord");
        C48890g gVar = aVar.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        C48644a aVar2 = gVar.f122977w;
        C48890g gVar2 = aVar.f122047a;
        C52711k.m112236a((Object) gVar2, "mEffectContext.effectConfiguration");
        C48641b bVar = gVar2.f122976v;
        C52711k.m112236a((Object) bVar, "mEffectContext.effectConfiguration.jsonConverter");
        super(aVar2, bVar, handler, str);
        this.f122742i = aVar;
        this.f122743j = str2;
        this.f122744k = str3;
        this.f122745l = i;
        this.f122746m = i2;
        C48890g gVar3 = this.f122742i.f122047a;
        C52711k.m112236a((Object) gVar3, "mEffectContext.effectConfiguration");
        this.f122738e = gVar3;
    }
}
