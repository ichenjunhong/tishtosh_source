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
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.InputStream;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.g */
public final class C48797g extends C48653h<CategoryPageModel> {

    /* renamed from: d */
    private final C48890g f122563d;

    /* renamed from: e */
    private final C48620c f122564e = this.f122563d.f122972r;

    /* renamed from: f */
    private final C48641b f122565f = this.f122563d.f122976v;

    /* renamed from: g */
    private final C48642c f122566g = this.f122563d.f122978x;

    /* renamed from: h */
    private final int f122567h = this.f122563d.f122975u;

    /* renamed from: i */
    private final C48565a f122568i;

    /* renamed from: j */
    private final String f122569j;

    /* renamed from: k */
    private final String f122570k;

    /* renamed from: l */
    private final int f122571l;

    /* renamed from: m */
    private final int f122572m;

    /* renamed from: n */
    private final int f122573n;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.g$a */
    static final class C48798a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48797g f122574a;

        C48798a(C48797g gVar) {
            this.f122574a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122574a.f122286b instanceof C48701f) {
                C48650e<T> eVar = this.f122574a.f122286b;
                if (eVar != null) {
                    ((C48701f) eVar).mo59186a(new C48649d(10004));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.g$b */
    static final class C48799b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48797g f122575a;

        C48799b(C48797g gVar) {
            this.f122575a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122575a.f122286b instanceof C48701f) {
                C48650e<T> eVar = this.f122575a.f122286b;
                if (eVar != null) {
                    ((C48701f) eVar).mo59186a(new C48649d(10004));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.g$c */
    static final class C48800c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48797g f122576a;

        /* renamed from: b */
        final /* synthetic */ CategoryPageModel f122577b;

        C48800c(C48797g gVar, CategoryPageModel categoryPageModel) {
            this.f122576a = gVar;
            this.f122577b = categoryPageModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122576a.f122286b;
            if (eVar != null) {
                CategoryPageModel categoryPageModel = this.f122577b;
                C52711k.m112236a((Object) categoryPageModel, "effectModel");
                eVar.mo8638a(categoryPageModel);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        if (this.f122286b instanceof C48701f) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48701f) eVar).mo59186a(new C48649d(10001));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener");
        }
    }

    /* renamed from: e */
    public final void mo96229e() {
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        C48620c cVar = this.f122564e;
        CategoryEffectListResponse categoryEffectListResponse = null;
        if (cVar != null) {
            String a = C48667e.m105299a(this.f122569j, this.f122570k, this.f122571l, this.f122572m, this.f122573n);
            C52711k.m112236a((Object) a, "EffectCacheKeyGenerator\n… cursor, sortingPosition)");
            inputStream = cVar.mo96152b(a);
        } else {
            inputStream = null;
        }
        if (inputStream == null) {
            mo96235a((C52670a<C52860x>) new C48798a<C52860x>(this));
            return;
        }
        try {
            C48641b bVar = this.f122565f;
            if (bVar != null) {
                categoryEffectListResponse = (CategoryEffectListResponse) bVar.mo59189a(inputStream, CategoryEffectListResponse.class);
            }
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (categoryEffectListResponse == null || !categoryEffectListResponse.checkValue()) {
            long j = currentTimeMillis2 - currentTimeMillis;
            C48642c cVar2 = this.f122566g;
            if (cVar2 != null) {
                cVar2.mo59187a("category_list_success_rate", 0, C48670h.m105314a().mo96255a("app_id", this.f122563d.f122966l).mo96255a("access_key", this.f122563d.f122956b).mo96255a("panel", this.f122569j).mo96255a("category", this.f122570k).mo96254a("duration", Long.valueOf(j)).mo96255a("from_cache", "true").mo96253a("request_strategy", Integer.valueOf(this.f122567h)).mo96256b());
            }
            mo96235a((C52670a<C52860x>) new C48799b<C52860x>(this));
        } else {
            mo96235a((C52670a<C52860x>) new C48800c<C52860x>(this, categoryEffectListResponse.getData()));
        }
        C48660a.m105288a(inputStream);
    }

    public C48797g(C48565a aVar, String str, String str2, String str3, int i, int i2, int i3, String str4, Handler handler) {
        C52711k.m112240b(aVar, "mEffectContext");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(str2, "taskFlag");
        super(handler, str2);
        this.f122568i = aVar;
        this.f122569j = str;
        this.f122570k = str3;
        this.f122571l = i;
        this.f122572m = i2;
        this.f122573n = i3;
        C48890g gVar = this.f122568i.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122563d = gVar;
    }
}
