package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48714s;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.t */
public final class C48845t extends C48653h<SearchEffectResponse> {

    /* renamed from: d */
    private final C48890g f122721d;

    /* renamed from: e */
    private final C48641b f122722e;

    /* renamed from: f */
    private int f122723f;

    /* renamed from: g */
    private final C48565a f122724g;

    /* renamed from: h */
    private final String f122725h;

    /* renamed from: i */
    private final String f122726i;

    /* renamed from: j */
    private final int f122727j;

    /* renamed from: k */
    private final int f122728k;

    /* renamed from: l */
    private final Map<String, String> f122729l;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.t$a */
    static final class C48846a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48845t f122730a;

        C48846a(C48845t tVar) {
            this.f122730a = tVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122730a.f122286b instanceof C48714s) {
                C48650e<T> eVar = this.f122730a.f122286b;
                if (eVar != null) {
                    ((C48714s) eVar).mo59196a(new C48649d(10001));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.t$b */
    static final class C48847b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48845t f122731a;

        /* renamed from: b */
        final /* synthetic */ SearchEffectResponse f122732b;

        C48847b(C48845t tVar, SearchEffectResponse searchEffectResponse) {
            this.f122731a = tVar;
            this.f122732b = searchEffectResponse;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122731a.f122286b;
            if (eVar != null) {
                eVar.mo8638a(this.f122732b);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.t$c */
    static final class C48848c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48845t f122733a;

        C48848c(C48845t tVar) {
            this.f122733a = tVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122733a.f122286b instanceof C48714s) {
                C48650e<T> eVar = this.f122733a.f122286b;
                if (eVar != null) {
                    ((C48714s) eVar).mo59196a(new C48649d(10014));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.t$d */
    static final class C48849d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48845t f122734a;

        /* renamed from: b */
        final /* synthetic */ Exception f122735b;

        C48849d(C48845t tVar, Exception exc) {
            this.f122734a = tVar;
            this.f122735b = exc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122734a.f122286b instanceof C48714s) {
                C48650e<T> eVar = this.f122734a.f122286b;
                if (eVar != null) {
                    ((C48714s) eVar).mo59196a(new C48649d(this.f122735b));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        if (this.f122286b instanceof C48714s) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48714s) eVar).mo59196a(new C48649d(10001));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener");
        }
    }

    /* renamed from: e */
    public final void mo96229e() {
        InputStream inputStream;
        SearchEffectResponse searchEffectResponse;
        String str;
        String str2;
        String str3 = this.f122726i;
        int i = this.f122727j;
        int i2 = this.f122728k;
        HashMap a = C48668f.f122308a.mo96252a(this.f122721d);
        Map map = a;
        map.put("panel", this.f122725h);
        map.put("keyword", str3);
        map.put("cursor", String.valueOf(i2));
        map.put("count", String.valueOf(i));
        if (this.f122729l != null) {
            a.putAll(this.f122729l);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122724g.mo96084a());
        sb.append(this.f122721d.f122955a);
        sb.append("/search");
        C48605b bVar = new C48605b("GET", C48676l.m105346a(map, sb.toString()));
        while (true) {
            int i3 = this.f122723f;
            this.f122723f = i3 - 1;
            if (i3 != 0) {
                try {
                    if (this.f122285a) {
                        mo96235a((C52670a<C52860x>) new C48846a<C52860x>(this));
                        return;
                    }
                    C48644a aVar = this.f122721d.f122977w;
                    String str4 = null;
                    if (aVar != null) {
                        inputStream = aVar.mo96221a(bVar);
                    } else {
                        inputStream = null;
                    }
                    if (this.f122721d.f122977w != null) {
                        searchEffectResponse = (SearchEffectResponse) C48644a.m105250a(bVar, inputStream, this.f122722e, SearchEffectResponse.class);
                    } else {
                        searchEffectResponse = null;
                    }
                    if (searchEffectResponse != null && searchEffectResponse.checkValid()) {
                        File file = this.f122721d.f122964j;
                        if (file != null) {
                            str = file.getAbsolutePath();
                        } else {
                            str = null;
                        }
                        C48669g.m105308a(str, this.f122725h, searchEffectResponse.getEffects());
                        File file2 = this.f122721d.f122964j;
                        if (file2 != null) {
                            str2 = file2.getAbsolutePath();
                        } else {
                            str2 = null;
                        }
                        C48669g.m105308a(str2, this.f122725h, searchEffectResponse.getCollection());
                        File file3 = this.f122721d.f122964j;
                        if (file3 != null) {
                            str4 = file3.getAbsolutePath();
                        }
                        C48669g.m105308a(str4, this.f122725h, searchEffectResponse.getBindEffects());
                        mo96235a((C52670a<C52860x>) new C48847b<C52860x>(this, searchEffectResponse));
                        return;
                    } else if (this.f122723f == 0) {
                        mo96235a((C52670a<C52860x>) new C48848c<C52860x>(this));
                    }
                } catch (Exception e) {
                    if (this.f122723f == 0 || (e instanceof C48636c)) {
                        mo96235a((C52670a<C52860x>) new C48849d<C52860x>(this, e));
                    }
                }
            } else {
                return;
            }
        }
        mo96235a((C52670a<C52860x>) new C48849d<C52860x>(this, e));
    }

    public C48845t(C48565a aVar, String str, String str2, int i, int i2, Map<String, String> map, Handler handler, String str3) {
        C52711k.m112240b(aVar, "mContext");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(str2, "keyword");
        C52711k.m112240b(str3, "taskFlag");
        super(handler, str3);
        this.f122724g = aVar;
        this.f122725h = str;
        this.f122726i = str2;
        this.f122727j = i;
        this.f122728k = i2;
        this.f122729l = map;
        C48890g gVar = this.f122724g.f122047a;
        C52711k.m112236a((Object) gVar, "mContext.effectConfiguration");
        this.f122721d = gVar;
        C48641b bVar = this.f122721d.f122976v;
        C52711k.m112236a((Object) bVar, "mConfiguration.jsonConverter");
        this.f122722e = bVar;
        C48890g gVar2 = this.f122724g.f122047a;
        C52711k.m112236a((Object) gVar2, "mContext.effectConfiguration");
        this.f122723f = gVar2.f122973s;
    }
}
