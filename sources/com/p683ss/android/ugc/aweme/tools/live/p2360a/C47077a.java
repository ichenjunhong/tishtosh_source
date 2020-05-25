package com.p683ss.android.ugc.aweme.tools.live.p2360a;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.ApiCenter.C2755a;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.aweme.beauty.C23780d;
import com.p683ss.android.ugc.aweme.beauty.C23785h;
import com.p683ss.android.ugc.aweme.comment_sticker.C25465a;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45861d;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46297f;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.C46456e;
import com.p683ss.android.ugc.aweme.tools.live.C47069a;
import com.p683ss.android.ugc.aweme.tools.live.RecordLiveViewModel;
import com.p683ss.android.ugc.aweme.utils.C47911gc;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49576a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49579d;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49604i;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j.C49606a;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.tools.live.a.a */
public final class C47077a implements C49576a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f118873a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47077a.class), "liveScene", "getLiveScene()Lcom/ss/android/ugc/gamora/recorder/bottom/TabContentScene;"))};

    /* renamed from: b */
    public RecordStatusViewModel f118874b;

    /* renamed from: c */
    private final C52668f f118875c = C52732g.m112285a(C47079b.f118879a);

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a.a$a */
    public static final class C47078a implements C49605j {

        /* renamed from: a */
        final /* synthetic */ C47077a f118876a;

        /* renamed from: b */
        final /* synthetic */ C48923a f118877b;

        /* renamed from: c */
        private Effect f118878c;

        C47078a(C47077a aVar, C48923a aVar2) {
            this.f118876a = aVar;
            this.f118877b = aVar2;
        }

        /* renamed from: b */
        public final boolean mo49420b(C49579d dVar, C49606a aVar) {
            C52711k.m112240b(dVar, "model");
            C52711k.m112240b(aVar, "extraInfo");
            if (this.f118878c != null) {
                C50048n nVar = (C50048n) this.f118877b.mo96756g().getValue();
                if (nVar != null) {
                    C45861d.m99707a((C46297f) nVar, this.f118878c);
                }
            }
            if (!C23780d.m58365a()) {
                this.f118877b.mo96757h().mo86583h(this.f118877b.mo96752c().f107128u);
                if (C23785h.m58373a("2", "3")) {
                    this.f118877b.mo96757h().mo86580f(this.f118877b.mo96752c().f107128u);
                }
                this.f118877b.mo96757h().mo86572b(new ArrayList(), 10000);
            } else if (aVar.f124438a) {
                this.f118877b.mo96757h().bL_();
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo49419a(C49579d dVar, C49606a aVar) {
            Effect effect;
            C52711k.m112240b(dVar, "model");
            C52711k.m112240b(aVar, "extraInfo");
            this.f118877b.mo96757h().mo86555a(CustomActionPushReceiver.f104061f);
            C0209x a = C0214z.m440a(this.f118877b.mo96751b()).mo359a(ShortVideoContextViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ta…extViewModel::class.java)");
            ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) a;
            ApiCenter a2 = C2755a.m7851a(this.f118877b.mo96751b());
            ((C43859a) a2.mo7339a(C43859a.class)).mo89400c(false);
            if (shortVideoContextViewModel.f107134a.f107119l.isEmpty()) {
                this.f118877b.mo96755f().mo91323a(0);
                C50048n nVar = (C50048n) this.f118877b.mo96756g().getValue();
                if (nVar != null) {
                    effect = C45861d.m99705a(nVar);
                } else {
                    effect = null;
                }
                this.f118878c = effect;
                if (this.f118878c != null) {
                    C50048n nVar2 = (C50048n) this.f118877b.mo96756g().getValue();
                    if (nVar2 != null) {
                        C45861d.m99707a((C46297f) nVar2, (Effect) null);
                    }
                }
                this.f118877b.mo96757h().mo86583h(false);
                this.f118877b.mo96757h().mo86580f(false);
            }
            ((C49860a) a2.mo7339a(C49860a.class)).mo97693c(false);
            if (shortVideoContextViewModel.f107134a.f107126s != null) {
                C50048n nVar3 = (C50048n) this.f118877b.mo96756g().getValue();
                if (nVar3 != null) {
                    C46456e x = nVar3.mo97824x();
                    if (x != null) {
                        x.mo93193d();
                    }
                }
                C50048n nVar4 = (C50048n) this.f118877b.mo96756g().getValue();
                if (nVar4 != null) {
                    C46456e x2 = nVar4.mo97824x();
                    if (x2 != null) {
                        x2.mo93191b();
                    }
                }
            }
            RecordStatusViewModel recordStatusViewModel = this.f118876a.f118874b;
            if (recordStatusViewModel == null) {
                C52711k.m112237a("recordStatusViewModel");
            }
            recordStatusViewModel.mo92167l().setValue(Boolean.valueOf(true));
            C25465a aVar2 = (C25465a) a2.mo7341b(C25465a.class);
            if (aVar2 != null) {
                aVar2.mo52059a(false);
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a.a$b */
    static final class C47079b extends C52712l implements C52670a<C47069a> {

        /* renamed from: a */
        public static final C47079b f118879a = new C47079b();

        C47079b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C47069a();
        }
    }

    /* renamed from: a */
    public final C49604i mo49416a() {
        return (C49604i) this.f118875c.getValue();
    }

    /* renamed from: b */
    public final C49579d mo49418b(C48923a aVar) {
        C52711k.m112240b(aVar, "tabEnv");
        C49579d dVar = new C49579d(C47911gc.m103636a(R.string.bx8), C47911gc.m103636a(R.string.d5h), CustomActionPushReceiver.f104061f, aVar.mo96752c().f107056aH, new C47078a(this, aVar));
        return dVar;
    }

    /* renamed from: a */
    public final void mo49417a(C48923a aVar) {
        C52711k.m112240b(aVar, "tabEnv");
        RecordLiveViewModel recordLiveViewModel = (RecordLiveViewModel) C0214z.m440a(aVar.mo96751b()).mo359a(RecordLiveViewModel.class);
        recordLiveViewModel.f118856a = aVar.mo96750a();
        C45004a f = aVar.mo96755f();
        C52711k.m112240b(f, "<set-?>");
        recordLiveViewModel.f118857b = f;
        recordLiveViewModel.f118859d = aVar.mo96752c();
        C20426a d = aVar.mo96753d();
        C52711k.m112240b(d, "<set-?>");
        recordLiveViewModel.f118858c = d;
        C0209x a = C0214z.m440a(aVar.mo96751b()).mo359a(RecordStatusViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ta…tusViewModel::class.java)");
        this.f118874b = (RecordStatusViewModel) a;
    }
}
