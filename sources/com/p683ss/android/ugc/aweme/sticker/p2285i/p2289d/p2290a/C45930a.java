package com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2290a;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45904c;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45905d;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45909g;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2296e.C46020a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p2628d.C52668f;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d.a.a */
public final class C45930a extends C11585a<C52860x, CategoryEffectModel, C46020a, CategoryEffectModel> {

    /* renamed from: a */
    public final String f115921a;

    /* renamed from: b */
    public final C29252f f115922b;

    /* renamed from: f */
    private final C52668f<C45909g> f115923f;

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.a.a$a */
    static final class C45931a<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ C45930a f115924a;

        /* renamed from: b */
        final /* synthetic */ C46020a f115925b;

        C45931a(C45930a aVar, C46020a aVar2) {
            this.f115924a = aVar;
            this.f115925b = aVar2;
        }

        public final void subscribe(final C2204x<CategoryEffectModel> xVar) {
            C52711k.m112240b(xVar, "emitter");
            this.f115924a.f115922b.mo59129a(this.f115924a.f115921a, this.f115925b.f116140a, this.f115925b.f116141b, this.f115925b.f116142c, this.f115925b.f116143d, this.f115925b.f116144e, new C48701f() {
                /* renamed from: a */
                public final void mo59186a(C48649d dVar) {
                    C52711k.m112240b(dVar, "e");
                    if (!xVar.isDisposed()) {
                        xVar.mo6274a((Throwable) dVar.f122281c);
                    }
                }

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    CategoryPageModel categoryPageModel = (CategoryPageModel) obj;
                    C52711k.m112240b(categoryPageModel, "response");
                    if (!xVar.isDisposed()) {
                        xVar.mo6282a(categoryPageModel.getCategoryEffects());
                        xVar.mo6273a();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C52711k.m112240b((C46020a) obj, "req");
        return C52860x.f131107a;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C46020a aVar = (C46020a) obj;
        C52711k.m112240b(aVar, "req");
        C45905d dVar = (C45905d) ((C45909g) this.f115923f.getValue()).mo92505a().get(aVar.f116140a);
        if (dVar != null) {
            C45904c d = dVar.mo92496d();
            if (d != null) {
                C2201v a = d.mo92492a(aVar);
                if (a != null) {
                    return a;
                }
            }
        }
        C2201v a2 = C2201v.m6601a((C2205y<T>) new C45931a<T>(this, aVar));
        C52711k.m112236a((Object) a2, "Observable.create { emit…     })\n                }");
        return a2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        CategoryEffectModel categoryEffectModel = (CategoryEffectModel) obj2;
        C52711k.m112240b((C46020a) obj, "req");
        C52711k.m112240b(categoryEffectModel, "resp");
        return categoryEffectModel;
    }

    public C45930a(String str, C29252f fVar, C52668f<? extends C45909g> fVar2) {
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(fVar, "effectPlatform");
        C52711k.m112240b(fVar2, "postProcessor");
        this.f115921a = str;
        this.f115922b = fVar;
        this.f115923f = fVar2;
    }
}
