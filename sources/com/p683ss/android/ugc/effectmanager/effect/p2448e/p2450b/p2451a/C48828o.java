package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import android.util.Log;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48642c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h;
import com.p683ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p683ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.InputStream;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.o */
public final class C48828o extends C48653h<PanelInfoModel> {

    /* renamed from: d */
    private final C48890g f122660d;

    /* renamed from: e */
    private final C48620c f122661e = this.f122660d.f122972r;

    /* renamed from: f */
    private final C48641b f122662f = this.f122660d.f122976v;

    /* renamed from: g */
    private final C48642c f122663g = this.f122660d.f122978x;

    /* renamed from: h */
    private final int f122664h = this.f122660d.f122975u;

    /* renamed from: i */
    private final C48565a f122665i;

    /* renamed from: j */
    private final String f122666j;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.o$a */
    static final class C48829a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48828o f122667a;

        C48829a(C48828o oVar) {
            this.f122667a = oVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122667a.f122286b instanceof C48707l) {
                C48650e<T> eVar = this.f122667a.f122286b;
                if (eVar != null) {
                    ((C48707l) eVar).mo59192a(new C48649d(10004));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.o$b */
    static final class C48830b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48828o f122668a;

        C48830b(C48828o oVar) {
            this.f122668a = oVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122668a.f122286b instanceof C48707l) {
                C48650e<T> eVar = this.f122668a.f122286b;
                if (eVar != null) {
                    ((C48707l) eVar).mo59192a(new C48649d(10004));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.o$c */
    static final class C48831c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48828o f122669a;

        /* renamed from: b */
        final /* synthetic */ PanelInfoModel f122670b;

        C48831c(C48828o oVar, PanelInfoModel panelInfoModel) {
            this.f122669a = oVar;
            this.f122670b = panelInfoModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122669a.f122286b;
            if (eVar != null) {
                PanelInfoModel panelInfoModel = this.f122670b;
                C52711k.m112236a((Object) panelInfoModel, "effectModel");
                eVar.mo8638a(panelInfoModel);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        if (this.f122286b instanceof C48707l) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48707l) eVar).mo59192a(new C48649d(10001));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener");
        }
    }

    /* renamed from: e */
    public final void mo96229e() {
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        C48620c cVar = this.f122661e;
        PanelInfoResponse panelInfoResponse = null;
        if (cVar != null) {
            String b = C48667e.m105300b(this.f122660d.f122960f, this.f122666j);
            C52711k.m112236a((Object) b, "EffectCacheKeyGenerator.…iguration.channel, panel)");
            inputStream = cVar.mo96152b(b);
        } else {
            inputStream = null;
        }
        if (inputStream == null) {
            mo96235a((C52670a<C52860x>) new C48829a<C52860x>(this));
            return;
        }
        try {
            C48641b bVar = this.f122662f;
            if (bVar != null) {
                panelInfoResponse = (PanelInfoResponse) bVar.mo59189a(inputStream, PanelInfoResponse.class);
            }
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (panelInfoResponse == null || !panelInfoResponse.checkValue()) {
            long j = currentTimeMillis2 - currentTimeMillis;
            C48642c cVar2 = this.f122663g;
            if (cVar2 != null) {
                cVar2.mo59187a("panel_info_success_rate", 0, C48670h.m105314a().mo96255a("app_id", this.f122660d.f122966l).mo96255a("access_key", this.f122660d.f122956b).mo96255a("panel", this.f122666j).mo96254a("duration", Long.valueOf(j)).mo96255a("from_cache", "true").mo96253a("request_strategy", Integer.valueOf(this.f122664h)).mo96256b());
            }
            mo96235a((C52670a<C52860x>) new C48830b<C52860x>(this));
        } else {
            mo96235a((C52670a<C52860x>) new C48831c<C52860x>(this, panelInfoResponse.getData()));
        }
        C48660a.m105288a(inputStream);
    }

    public C48828o(C48565a aVar, String str, String str2, Handler handler) {
        C52711k.m112240b(aVar, "mEffectContext");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(str2, "taskFlag");
        super(handler, str2);
        this.f122665i = aVar;
        this.f122666j = str;
        C48890g gVar = this.f122665i.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122660d = gVar;
    }
}
