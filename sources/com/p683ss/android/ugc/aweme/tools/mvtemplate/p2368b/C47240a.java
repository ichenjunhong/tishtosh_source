package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2368b;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.ApiCenter.C2755a;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.comment_sticker.C25465a;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.C46456e;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.C47303s;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47251c;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49576a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49579d;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49604i;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j.C49606a;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a.C49608a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.b.a */
public final class C47240a implements C49576a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f119305a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47240a.class), "mvTemplateScene", "getMvTemplateScene()Lcom/ss/android/ugc/gamora/recorder/bottom/TabContentScene;"))};

    /* renamed from: b */
    public RecordMVViewModel f119306b;

    /* renamed from: c */
    public RecordStatusViewModel f119307c;

    /* renamed from: d */
    private final C52668f f119308d = C52732g.m112285a(C47242b.f119311a);

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.b.a$a */
    public static final class C47241a implements C49605j {

        /* renamed from: a */
        final /* synthetic */ C47240a f119309a;

        /* renamed from: b */
        final /* synthetic */ C48923a f119310b;

        C47241a(C47240a aVar, C48923a aVar2) {
            this.f119309a = aVar;
            this.f119310b = aVar2;
        }

        /* renamed from: b */
        public final boolean mo49420b(C49579d dVar, C49606a aVar) {
            C52711k.m112240b(dVar, "model");
            C52711k.m112240b(aVar, "extraInfo");
            if (C47240a.m102551a(this.f119309a).mo94494e().f107126s != null) {
                C50048n nVar = (C50048n) this.f119310b.mo96756g().getValue();
                if (nVar != null) {
                    C46456e x = nVar.mo97824x();
                    if (x != null) {
                        x.mo93194e();
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo49419a(C49579d dVar, C49606a aVar) {
            C52711k.m112240b(dVar, "model");
            C52711k.m112240b(aVar, "extraInfo");
            ApiCenter a = C2755a.m7851a(this.f119310b.mo96751b());
            ((C43859a) a.mo7339a(C43859a.class)).mo89400c(false);
            C49608a.m107072a(this.f119310b.mo96751b()).mo97523k();
            RecordStatusViewModel recordStatusViewModel = this.f119309a.f119307c;
            if (recordStatusViewModel == null) {
                C52711k.m112237a("recordStatusViewModel");
            }
            recordStatusViewModel.mo92167l().setValue(Boolean.valueOf(true));
            if (C47240a.m102551a(this.f119309a).mo94494e().f107126s != null) {
                C50048n nVar = (C50048n) this.f119310b.mo96756g().getValue();
                if (nVar != null) {
                    C46456e x = nVar.mo97824x();
                    if (x != null) {
                        x.mo93193d();
                    }
                }
            }
            C25465a aVar2 = (C25465a) a.mo7341b(C25465a.class);
            if (aVar2 != null) {
                aVar2.mo52059a(false);
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.b.a$b */
    static final class C47242b extends C52712l implements C52670a<C47303s> {

        /* renamed from: a */
        public static final C47242b f119311a = new C47242b();

        C47242b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C47303s();
        }
    }

    /* renamed from: a */
    public final C49604i mo49416a() {
        return (C49604i) this.f119308d.getValue();
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordMVViewModel m102551a(C47240a aVar) {
        RecordMVViewModel recordMVViewModel = aVar.f119306b;
        if (recordMVViewModel == null) {
            C52711k.m112237a("mvViewModel");
        }
        return recordMVViewModel;
    }

    /* renamed from: a */
    public final void mo49417a(C48923a aVar) {
        C52711k.m112240b(aVar, "tabEnv");
        JediViewModel a = C48927d.m105736a(aVar.mo96751b()).mo96760a(RecordMVViewModel.class);
        C52711k.m112236a((Object) a, "JediViewModelProviders.o…dMVViewModel::class.java)");
        this.f119306b = (RecordMVViewModel) a;
        RecordMVViewModel recordMVViewModel = this.f119306b;
        if (recordMVViewModel == null) {
            C52711k.m112237a("mvViewModel");
        }
        ShortVideoContext c = aVar.mo96752c();
        C52711k.m112240b(c, "<set-?>");
        recordMVViewModel.f119251e = c;
        RecordMVViewModel recordMVViewModel2 = this.f119306b;
        if (recordMVViewModel2 == null) {
            C52711k.m112237a("mvViewModel");
        }
        recordMVViewModel2.f119250d = aVar.f123095k;
        C0209x a2 = C0214z.m440a(aVar.mo96751b()).mo359a(RecordStatusViewModel.class);
        C52711k.m112236a((Object) a2, "ViewModelProviders.of(ta…tusViewModel::class.java)");
        this.f119307c = (RecordStatusViewModel) a2;
    }

    /* renamed from: b */
    public final C49579d mo49418b(C48923a aVar) {
        C52711k.m112240b(aVar, "tabEnv");
        String string = aVar.mo96751b().getString(R.string.d5i);
        C52711k.m112236a((Object) string, "tabEnv.activity.getString(R.string.record_mode_mv)");
        String string2 = aVar.mo96751b().getString(R.string.d5j);
        C52711k.m112236a((Object) string2, "tabEnv.activity.getStrin…tring.record_mode_mv_tag)");
        String str = "mv";
        RecordMVViewModel recordMVViewModel = this.f119306b;
        if (recordMVViewModel == null) {
            C52711k.m112237a("mvViewModel");
        }
        boolean z = false;
        if (C47251c.m102584a(recordMVViewModel.mo94494e())) {
            RecordMVViewModel recordMVViewModel2 = this.f119306b;
            if (recordMVViewModel2 == null) {
                C52711k.m112237a("mvViewModel");
            }
            if (recordMVViewModel2.f119250d != null) {
                C47251c.m102593d("mv_reuse");
                z = true;
            }
        }
        C49579d dVar = new C49579d(string, string2, str, z, new C47241a(this, aVar));
        return dVar;
    }
}
