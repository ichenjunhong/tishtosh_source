package com.p683ss.android.ugc.aweme.greenscreen;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.greenscreen.C32922t.C32923a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49559f;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52847n;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2645i.C52744c;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenViewModel */
public final class GreenScreenViewModel extends BaseJediViewModel<GreenScreenViewState> {

    /* renamed from: d */
    C29252f f85466d;

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenViewModel$a */
    public static final class C32859a implements C48702g {

        /* renamed from: a */
        final /* synthetic */ GreenScreenViewModel f85467a;

        /* renamed from: b */
        final /* synthetic */ long f85468b;

        /* renamed from: a */
        public final void mo8637a(C48649d dVar) {
            Number number;
            String str = null;
            if (dVar != null) {
                number = Integer.valueOf(dVar.f122279a);
            } else {
                number = null;
            }
            if (dVar != null) {
                str = dVar.f122280b;
            }
            if (number != null) {
                C23569o.m57776a("aweme_greenscreen_effectModel_resource_rate", number.intValue(), C23088c.m56631a().mo47824a("errorMsg", str).mo47825b());
            }
            this.f85467a.mo69761a(2);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
            C52711k.m112240b(effectChannelResponse, "response");
            C23569o.m57776a("aweme_greenscreen_effectModel_resource_rate", 0, C23088c.m56631a().mo47823a("duration", Long.valueOf(System.currentTimeMillis() - this.f85468b)).mo47825b());
            List allCategoryEffects = effectChannelResponse.getAllCategoryEffects();
            C52711k.m112236a((Object) allCategoryEffects, "response.allCategoryEffects");
            Effect effect = (Effect) C52575l.m112140f(allCategoryEffects);
            if (effect != null) {
                C32888d.m75771a(effect);
                this.f85467a.mo69762a(effect);
                this.f85467a.mo69763a("");
                GreenScreenViewModel greenScreenViewModel = this.f85467a;
                if (!greenScreenViewModel.mo69767g()) {
                    greenScreenViewModel.mo69763a("");
                    greenScreenViewModel.mo69764a(GreenScreenViewModel.m75729e(), "");
                    greenScreenViewModel.mo69761a(1);
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    C29252f fVar = greenScreenViewModel.f85466d;
                    if (fVar != null) {
                        fVar.mo59134a("green-screen-library", "all", false, 0, 0, 0, "", new C32860b(greenScreenViewModel, currentTimeMillis));
                    }
                }
            } else {
                this.f85467a.mo69761a(2);
            }
        }

        C32859a(GreenScreenViewModel greenScreenViewModel, long j) {
            this.f85467a = greenScreenViewModel;
            this.f85468b = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenViewModel$b */
    public static final class C32860b implements C48701f {

        /* renamed from: a */
        final /* synthetic */ GreenScreenViewModel f85469a;

        /* renamed from: b */
        final /* synthetic */ long f85470b;

        /* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenViewModel$b$a */
        public static final class C32861a extends C32870a {

            /* renamed from: a */
            final /* synthetic */ C32860b f85471a;

            /* renamed from: b */
            final /* synthetic */ Effect f85472b;

            C32861a(C32860b bVar, Effect effect) {
                this.f85471a = bVar;
                this.f85472b = effect;
            }

            /* renamed from: a */
            public final void mo69768a(Integer num, String str) {
                super.mo69768a(num, str);
                this.f85471a.f85469a.mo69761a(2);
            }

            /* renamed from: a */
            public final void mo69769a(String str, String str2, Long l) {
                C52711k.m112240b(str, "imagePath");
                C52711k.m112240b(str2, "imageName");
                super.mo69769a(str, str2, l);
                C32888d.m75772a(str);
                this.f85471a.f85469a.mo69763a("");
                GreenScreenViewModel greenScreenViewModel = this.f85471a.f85469a;
                String e = GreenScreenViewModel.m75729e();
                Effect effect = this.f85472b;
                C52711k.m112236a((Object) effect, "randomEffect");
                greenScreenViewModel.mo69764a(e, effect.getEffectId());
                this.f85471a.f85469a.mo22530c(new C32863d(str2));
                this.f85471a.f85469a.mo69761a(1);
            }
        }

        /* renamed from: a */
        public final void mo59186a(C48649d dVar) {
            Number number;
            String str = null;
            if (dVar != null) {
                number = Integer.valueOf(dVar.f122279a);
            } else {
                number = null;
            }
            if (dVar != null) {
                str = dVar.f122280b;
            }
            if (number != null) {
                C23569o.m57776a("aweme_greenscreen_effect_rate", number.intValue(), C23088c.m56631a().mo47824a("errorMsg", str).mo47825b());
            }
            this.f85469a.mo69761a(2);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            String str;
            String str2;
            CategoryPageModel categoryPageModel = (CategoryPageModel) obj;
            C23569o.m57776a("aweme_greenscreen_effect_rate", 0, C23088c.m56631a().mo47823a("duration", Long.valueOf(System.currentTimeMillis() - this.f85470b)).mo47825b());
            if (categoryPageModel != null) {
                C32923a.m75826a().clear();
                CategoryEffectModel categoryEffects = categoryPageModel.getCategoryEffects();
                C52711k.m112236a((Object) categoryEffects, "response.categoryEffects");
                List effects = categoryEffects.getEffects();
                List url_prefix = categoryPageModel.getUrl_prefix();
                if (url_prefix != null) {
                    str = (String) url_prefix.get(0);
                } else {
                    str = null;
                }
                C52711k.m112236a((Object) effects, "effects");
                Iterable<Effect> iterable = effects;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (Effect effect : iterable) {
                    C52711k.m112236a((Object) effect, "it");
                    String effectId = effect.getEffectId();
                    UrlModel iconUrl = effect.getIconUrl();
                    if (iconUrl != null) {
                        List urlList = iconUrl.getUrlList();
                        if (urlList != null) {
                            str2 = (String) C52575l.m112118a(urlList, 0);
                            if (str2 != null) {
                                GreenScreenImage greenScreenImage = new GreenScreenImage(effectId, str2, C32889e.m75774a(effect, str), null, 8, null);
                                arrayList.add(greenScreenImage);
                            }
                        }
                    }
                    str2 = "";
                    GreenScreenImage greenScreenImage2 = new GreenScreenImage(effectId, str2, C32889e.m75774a(effect, str), null, 8, null);
                    arrayList.add(greenScreenImage2);
                }
                C32923a.m75826a().addAll((List) arrayList);
                Effect effect2 = (Effect) effects.get(C52744c.f130992c.mo110338b(effects.size()));
                C52711k.m112236a((Object) effect2, "randomEffect");
                C32920s.m75824a(C32889e.m75773a(effect2), C32889e.m75774a(effect2, str), new C32861a(this, effect2));
                return;
            }
            this.f85469a.mo69761a(2);
        }

        C32860b(GreenScreenViewModel greenScreenViewModel, long j) {
            this.f85469a = greenScreenViewModel;
            this.f85470b = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenViewModel$c */
    public static final class C32862c extends C52712l implements C52671b<GreenScreenViewState, GreenScreenViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f85473a;

        public C32862c(boolean z) {
            this.f85473a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GreenScreenViewState greenScreenViewState = (GreenScreenViewState) obj;
            C52711k.m112240b(greenScreenViewState, "$receiver");
            return GreenScreenViewState.copy$default(greenScreenViewState, null, null, null, Boolean.valueOf(this.f85473a), null, null, null, null, null, 503, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenViewModel$d */
    static final class C32863d extends C52712l implements C52671b<GreenScreenViewState, GreenScreenViewState> {

        /* renamed from: a */
        final /* synthetic */ String f85474a;

        C32863d(String str) {
            this.f85474a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GreenScreenViewState greenScreenViewState = (GreenScreenViewState) obj;
            C52711k.m112240b(greenScreenViewState, "$receiver");
            return GreenScreenViewState.copy$default(greenScreenViewState, null, null, null, null, null, null, null, null, new C49555b(this.f85474a), NormalGiftView.ALPHA_255, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenViewModel$e */
    static final class C32864e extends C52712l implements C52671b<GreenScreenViewState, GreenScreenViewState> {

        /* renamed from: a */
        final /* synthetic */ int f85475a;

        C32864e(int i) {
            this.f85475a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GreenScreenViewState greenScreenViewState = (GreenScreenViewState) obj;
            C52711k.m112240b(greenScreenViewState, "$receiver");
            return GreenScreenViewState.copy$default(greenScreenViewState, new C49555b(Integer.valueOf(this.f85475a)), null, null, null, null, null, null, null, null, 510, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenViewModel$f */
    static final class C32865f extends C52712l implements C52671b<GreenScreenViewState, GreenScreenViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f85476a;

        C32865f(boolean z) {
            this.f85476a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GreenScreenViewState greenScreenViewState = (GreenScreenViewState) obj;
            C52711k.m112240b(greenScreenViewState, "$receiver");
            return GreenScreenViewState.copy$default(greenScreenViewState, null, new C49562i(Boolean.valueOf(this.f85476a)), null, null, null, null, null, null, null, 509, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenViewModel$g */
    public static final class C32866g extends C52712l implements C52671b<GreenScreenViewState, GreenScreenViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f85477a;

        public C32866g(boolean z) {
            this.f85477a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GreenScreenViewState greenScreenViewState = (GreenScreenViewState) obj;
            C52711k.m112240b(greenScreenViewState, "$receiver");
            return GreenScreenViewState.copy$default(greenScreenViewState, null, null, new C49555b(Boolean.valueOf(this.f85477a)), null, null, null, null, null, null, 507, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenViewModel$h */
    static final class C32867h extends C52712l implements C52671b<GreenScreenViewState, GreenScreenViewState> {

        /* renamed from: a */
        final /* synthetic */ String f85478a;

        C32867h(String str) {
            this.f85478a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GreenScreenViewState greenScreenViewState = (GreenScreenViewState) obj;
            C52711k.m112240b(greenScreenViewState, "$receiver");
            return GreenScreenViewState.copy$default(greenScreenViewState, null, null, null, null, null, this.f85478a, null, null, null, 479, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenViewModel$i */
    static final class C32868i extends C52712l implements C52671b<GreenScreenViewState, GreenScreenViewState> {

        /* renamed from: a */
        final /* synthetic */ String f85479a;

        /* renamed from: b */
        final /* synthetic */ String f85480b;

        C32868i(String str, String str2) {
            this.f85479a = str;
            this.f85480b = str2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GreenScreenViewState greenScreenViewState = (GreenScreenViewState) obj;
            C52711k.m112240b(greenScreenViewState, "$receiver");
            return GreenScreenViewState.copy$default(greenScreenViewState, null, null, null, null, null, null, null, new C49559f(new C52847n(this.f85479a, this.f85480b)), null, 383, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.GreenScreenViewModel$j */
    static final class C32869j extends C52712l implements C52671b<GreenScreenViewState, GreenScreenViewState> {

        /* renamed from: a */
        final /* synthetic */ Effect f85481a;

        C32869j(Effect effect) {
            this.f85481a = effect;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GreenScreenViewState greenScreenViewState = (GreenScreenViewState) obj;
            C52711k.m112240b(greenScreenViewState, "$receiver");
            return GreenScreenViewState.copy$default(greenScreenViewState, null, null, null, null, null, null, new C49555b(this.f85481a), null, null, 447, null);
        }
    }

    /* renamed from: e */
    public static String m75729e() {
        return C32888d.f85514a;
    }

    /* renamed from: h */
    private static Effect m75730h() {
        return C32888d.f85515b;
    }

    /* renamed from: j */
    private final boolean m75732j() {
        if (m75730h() == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo69767g() {
        if (!C48016e.m103944b(m75729e())) {
            return true;
        }
        return false;
    }

    public final void onCleared() {
        super.onCleared();
        C32888d.m75772a((String) null);
        C32888d.m75771a((Effect) null);
    }

    /* renamed from: i */
    private final void m75731i() {
        long currentTimeMillis = System.currentTimeMillis();
        C29252f fVar = this.f85466d;
        if (fVar != null) {
            fVar.mo59143b("green-screen", true, (C48702g) new C32859a(this, currentTimeMillis));
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        GreenScreenViewState greenScreenViewState = new GreenScreenViewState(null, null, null, null, null, null, null, null, null, 511, null);
        return greenScreenViewState;
    }

    /* renamed from: f */
    public final void mo69766f() {
        if (m75732j() || mo69767g()) {
            mo69761a(0);
            m75731i();
            return;
        }
        mo69763a("");
        Effect h = m75730h();
        if (h == null) {
            C52711k.m112234a();
        }
        mo69762a(h);
        mo69764a(m75729e(), "");
        mo69761a(1);
    }

    /* renamed from: a */
    public final void mo69762a(Effect effect) {
        C52711k.m112240b(effect, "effect");
        mo22530c(new C32869j(effect));
    }

    /* renamed from: a */
    public final void mo69761a(int i) {
        mo22530c(new C32864e(i));
        if (i == 1) {
            mo69765a(true);
        }
    }

    /* renamed from: a */
    public final void mo69763a(String str) {
        mo22530c(new C32867h(str));
    }

    /* renamed from: a */
    public final void mo69765a(boolean z) {
        mo22530c(new C32865f(z));
    }

    /* renamed from: a */
    public final void mo69764a(String str, String str2) {
        mo22530c(new C32868i(str, str2));
    }
}
