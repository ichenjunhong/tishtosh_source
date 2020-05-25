package com.p683ss.android.ugc.aweme.greenscreen;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import com.bytedance.als.ApiCenter.C2755a;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2187e.C43306a;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45861d;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46297f;
import com.p683ss.android.ugc.aweme.tools.C46807aa;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49576a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49579d;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49604i;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j.C49606a;
import com.p683ss.android.ugc.gamora.recorder.p2468e.C49659a;
import com.p683ss.android.ugc.gamora.recorder.p2475i.C49829a;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.c */
public final class C32886c implements C49576a {

    /* renamed from: a */
    public C49860a f85506a;

    /* renamed from: b */
    public C49659a f85507b;

    /* renamed from: c */
    public RecordStatusViewModel f85508c;

    /* renamed from: d */
    private String f85509d;

    /* renamed from: e */
    private final String f85510e;

    /* renamed from: f */
    private final String f85511f;

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.c$a */
    public static final class C32887a implements C49605j {

        /* renamed from: a */
        final /* synthetic */ C32886c f85512a;

        /* renamed from: b */
        final /* synthetic */ C48923a f85513b;

        C32887a(C32886c cVar, C48923a aVar) {
            this.f85512a = cVar;
            this.f85513b = aVar;
        }

        /* renamed from: b */
        public final boolean mo49420b(C49579d dVar, C49606a aVar) {
            C52711k.m112240b(dVar, "model");
            C52711k.m112240b(aVar, "extraInfo");
            C45861d.m99707a((C46297f) C2755a.m7851a(this.f85513b.mo96751b()).mo7339a(C50048n.class), (Effect) null);
            ((C50048n) C2755a.m7851a(this.f85513b.mo96751b()).mo7339a(C50048n.class)).mo97801F();
            ((C49829a) C2755a.m7851a(this.f85513b.mo96751b()).mo7339a(C49829a.class)).mo97675j();
            C22795c.m56156a().mo47276c();
            return false;
        }

        /* renamed from: a */
        public final boolean mo49419a(C49579d dVar, C49606a aVar) {
            C52711k.m112240b(dVar, "model");
            C52711k.m112240b(aVar, "extraInfo");
            ((C43859a) C2755a.m7851a(this.f85513b.mo96751b()).mo7339a(C43859a.class)).mo89400c(true);
            ((C49860a) C2755a.m7851a(this.f85513b.mo96751b()).mo7339a(C49860a.class)).mo97693c(true);
            C49860a aVar2 = this.f85512a.f85506a;
            if (aVar2 == null) {
                C52711k.m112237a("controlProgressApiComponent");
            }
            aVar2.mo97694d();
            C32886c.m75765a(this.f85512a).mo97557a(4);
            C32886c.m75765a(this.f85512a).mo97559b(4);
            this.f85513b.mo96752c().f107081ag = 13;
            C43306a.m94994c(13);
            if (this.f85513b.f123096l != null) {
                C32888d.m75771a(this.f85513b.f123096l);
            }
            C48923a aVar3 = this.f85513b;
            ShortVideoContext c = this.f85513b.mo96752c();
            if (c.mo86361c()) {
                c.f107113f = 0;
                C43306a.m94986a(c.f107112e, C43214dh.m94817a().mo50201b(), c.f107113f);
                aVar3.mo96753d().mo43297a(c.f107112e, (long) c.f107113f, c.f107120m);
            }
            this.f85513b.mo96755f().mo91327a(new C46807aa(false, true));
            ((C49829a) C2755a.m7851a(this.f85513b.mo96751b()).mo7339a(C49829a.class)).mo97674g();
            RecordStatusViewModel recordStatusViewModel = this.f85512a.f85508c;
            if (recordStatusViewModel == null) {
                C52711k.m112237a("recordStatusViewModel");
            }
            recordStatusViewModel.mo92167l().setValue(Boolean.valueOf(false));
            return false;
        }
    }

    /* renamed from: a */
    public final C49604i mo49416a() {
        return new C32894i();
    }

    /* renamed from: a */
    public static final /* synthetic */ C49659a m75765a(C32886c cVar) {
        C49659a aVar = cVar.f85507b;
        if (aVar == null) {
            C52711k.m112237a("dockBarApiComponent");
        }
        return aVar;
    }

    /* renamed from: b */
    public final C49579d mo49418b(C48923a aVar) {
        boolean z;
        C52711k.m112240b(aVar, "tabEnv");
        String str = this.f85509d;
        String str2 = this.f85510e;
        String str3 = this.f85511f;
        if (aVar.mo96752c().mo86365f() || aVar.mo96752c().mo86366g()) {
            z = false;
        } else {
            z = aVar.mo96752c().mo86369j();
        }
        C49579d dVar = new C49579d(str, str2, str3, z, new C32887a(this, aVar));
        return dVar;
    }

    /* renamed from: a */
    public final void mo49417a(C48923a aVar) {
        C52711k.m112240b(aVar, "tabEnv");
        this.f85506a = (C49860a) C2755a.m7851a(aVar.mo96751b()).mo7339a(C49860a.class);
        this.f85507b = (C49659a) C2755a.m7851a(aVar.mo96751b()).mo7339a(C49659a.class);
        C0209x a = C0214z.m440a(aVar.mo96751b()).mo359a(RecordStatusViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ta…tusViewModel::class.java)");
        this.f85508c = (RecordStatusViewModel) a;
    }

    public C32886c(String str, String str2, String str3) {
        C52711k.m112240b(str, "text");
        C52711k.m112240b(str2, "tag");
        C52711k.m112240b(str3, "shootMode");
        this.f85509d = str;
        this.f85510e = str2;
        this.f85511f = str3;
    }
}
