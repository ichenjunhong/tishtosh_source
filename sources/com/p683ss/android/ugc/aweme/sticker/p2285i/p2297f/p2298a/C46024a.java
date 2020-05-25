package com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2298a;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45904c;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45905d;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45907e;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46030a;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryIconsModel;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p683ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p094l.C2178a;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.f.a.a */
public final class C46024a implements C45904c, C45905d {

    /* renamed from: c */
    public static final C46025a f116157c = new C46025a(null);

    /* renamed from: b */
    public C2178a<CategoryEffectModel> f116158b;

    /* renamed from: d */
    private final C0199s<C37721a<FetchFavoriteListResponse>> f116159d = new C46028c(this);

    /* renamed from: e */
    private C1690c f116160e;

    /* renamed from: f */
    private final int f116161f;

    /* renamed from: g */
    private final EffectCategoryModel f116162g;

    /* renamed from: h */
    private final List<C46030a> f116163h;

    /* renamed from: i */
    private final C45904c f116164i;

    /* renamed from: j */
    private final C45907e f116165j;

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.f.a.a$a */
    public static final class C46025a {
        private C46025a() {
        }

        public /* synthetic */ C46025a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m100011a(EffectCategoryModel effectCategoryModel) {
            C52711k.m112240b(effectCategoryModel, "categoryModel");
            return C52711k.m112239a((Object) effectCategoryModel.getKey(), (Object) "sticker_category:favorite");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.f.a.a$b */
    static final class C46026b extends C52712l implements C52671b<EffectCategoryModel, C52860x> {

        /* renamed from: a */
        public static final C46026b f116166a = new C46026b();

        C46026b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) obj;
            C52711k.m112240b(effectCategoryModel, "$receiver");
            effectCategoryModel.setId("1");
            effectCategoryModel.setKey("sticker_category:favorite");
            effectCategoryModel.setName(C39629l.m88233b().getString(R.string.drn));
            C52671b bVar = C460271.f116167a;
            C52711k.m112240b(effectCategoryModel, "$this$icon");
            C52711k.m112240b(bVar, "init");
            EffectCategoryIconsModel effectCategoryIconsModel = new EffectCategoryIconsModel();
            bVar.invoke(effectCategoryIconsModel);
            effectCategoryModel.setIcon(effectCategoryIconsModel);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.f.a.a$c */
    static final class C46028c<T> implements C0199s<C37721a<FetchFavoriteListResponse>> {

        /* renamed from: a */
        final /* synthetic */ C46024a f116168a;

        C46028c(C46024a aVar) {
            this.f116168a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C37722a aVar;
            C37721a aVar2 = (C37721a) obj;
            if (aVar2 != null) {
                aVar = aVar2.f96126b;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                switch (C46029b.f116169a[aVar.ordinal()]) {
                    case 1:
                        this.f116168a.f116158b.onError(aVar2.f96128d);
                        C46024a aVar3 = this.f116168a;
                        C2178a<CategoryEffectModel> l = C2178a.m6527l();
                        C52711k.m112236a((Object) l, "BehaviorSubject.create()");
                        aVar3.f116158b = l;
                        return;
                    case 2:
                        FetchFavoriteListResponse fetchFavoriteListResponse = (FetchFavoriteListResponse) aVar2.f96125a;
                        if (fetchFavoriteListResponse == null) {
                            this.f116168a.f116158b.onError(new IllegalStateException("data invalid"));
                            C46024a aVar4 = this.f116168a;
                            C2178a<CategoryEffectModel> l2 = C2178a.m6527l();
                            C52711k.m112236a((Object) l2, "BehaviorSubject.create()");
                            aVar4.f116158b = l2;
                            break;
                        } else {
                            C2178a<CategoryEffectModel> aVar5 = this.f116168a.f116158b;
                            CategoryEffectModel categoryEffectModel = new CategoryEffectModel();
                            categoryEffectModel.setCategoryKey(this.f116168a.mo92494b().getKey());
                            C52711k.m112236a((Object) fetchFavoriteListResponse, "this@run");
                            categoryEffectModel.setEffects(fetchFavoriteListResponse.getEffects());
                            categoryEffectModel.setCollectEffects(fetchFavoriteListResponse.getCollectEffects());
                            aVar5.onNext(categoryEffectModel);
                            return;
                        }
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo92493a() {
        return this.f116161f;
    }

    /* renamed from: b */
    public final EffectCategoryModel mo92494b() {
        return this.f116162g;
    }

    /* renamed from: c */
    public final List<C46030a> mo92495c() {
        return this.f116163h;
    }

    /* renamed from: d */
    public final C45904c mo92496d() {
        return this.f116164i;
    }

    /* renamed from: e */
    public final void mo92497e() {
        C1690c cVar = this.f116160e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f116165j.mo92500a().mo92503b().removeObserver(this.f116159d);
    }

    public C46024a(C45907e eVar) {
        C52711k.m112240b(eVar, "editor");
        this.f116165j = eVar;
        C2178a<CategoryEffectModel> l = C2178a.m6527l();
        C52711k.m112236a((Object) l, "BehaviorSubject.create<CategoryEffectModel>()");
        this.f116158b = l;
        C52671b bVar = C46026b.f116166a;
        C52711k.m112240b(bVar, "init");
        EffectCategoryModel effectCategoryModel = new EffectCategoryModel();
        bVar.invoke(effectCategoryModel);
        this.f116162g = effectCategoryModel;
        this.f116164i = this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r3 == com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a.ERROR) goto L_0x002a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p064c.p065a.C2201v<com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel> mo92492a(com.p683ss.android.ugc.aweme.sticker.p2285i.p2296e.C46020a r3) {
        /*
            r2 = this;
            java.lang.String r0 = "request"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            com.ss.android.ugc.aweme.sticker.i.a.e r3 = r2.f116165j
            com.ss.android.ugc.aweme.sticker.i.a.f r3 = r3.mo92500a()
            android.arch.lifecycle.LiveData r3 = r3.mo92503b()
            android.arch.lifecycle.s<com.ss.android.ugc.aweme.mvp.b.a<com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse>> r0 = r2.f116159d
            r3.observeForever(r0)
            java.lang.Object r0 = r3.getValue()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r3 = r3.getValue()
            com.ss.android.ugc.aweme.mvp.b.a r3 = (com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a) r3
            if (r3 == 0) goto L_0x0025
            com.ss.android.ugc.aweme.mvp.b.a$a r3 = r3.f96126b
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            com.ss.android.ugc.aweme.mvp.b.a$a r0 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a.ERROR
            if (r3 != r0) goto L_0x0046
        L_0x002a:
            c.a.b.c r3 = r2.f116160e
            if (r3 == 0) goto L_0x0031
            r3.dispose()
        L_0x0031:
            com.ss.android.ugc.aweme.sticker.i.a.e r3 = r2.f116165j
            r0 = 0
            c.a.ad r3 = r3.mo92499a(r0)
            c.a.d.e r0 = p064c.p065a.p072e.p074b.C1723a.m6037b()
            c.a.d.e r1 = p064c.p065a.p072e.p074b.C1723a.m6037b()
            c.a.b.c r3 = r3.mo6152a(r0, r1)
            r2.f116160e = r3
        L_0x0046:
            c.a.l.a<com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel> r3 = r2.f116158b
            c.a.v r3 = r3.mo6542e()
            java.lang.String r0 = "favoriteSubject.hide()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2298a.C46024a.mo92492a(com.ss.android.ugc.aweme.sticker.i.e.a):c.a.v");
    }
}
