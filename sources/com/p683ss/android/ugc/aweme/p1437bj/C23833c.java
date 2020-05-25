package com.p683ss.android.ugc.aweme.p1437bj;

import com.bytedance.als.ApiCenter.C2755a;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.tutorial.C47368a;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49576a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49579d;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49604i;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j.C49606a;
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

/* renamed from: com.ss.android.ugc.aweme.bj.c */
public final class C23833c implements C49576a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f63493a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23833c.class), "creationTutorialScene", "getCreationTutorialScene()Lcom/ss/android/ugc/aweme/tutorial/CreationTutorialScene;"))};

    /* renamed from: b */
    public C48923a f63494b;

    /* renamed from: c */
    private final C52668f f63495c = C52732g.m112285a(new C23835b(this));

    /* renamed from: com.ss.android.ugc.aweme.bj.c$a */
    public static final class C23834a implements C49605j {

        /* renamed from: a */
        final /* synthetic */ C48923a f63496a;

        /* renamed from: b */
        public final boolean mo49420b(C49579d dVar, C49606a aVar) {
            C52711k.m112240b(dVar, "model");
            C52711k.m112240b(aVar, "extraInfo");
            return false;
        }

        C23834a(C48923a aVar) {
            this.f63496a = aVar;
        }

        /* renamed from: a */
        public final boolean mo49419a(C49579d dVar, C49606a aVar) {
            C52711k.m112240b(dVar, "model");
            C52711k.m112240b(aVar, "extraInfo");
            ((C43859a) C2755a.m7851a(this.f63496a.mo96751b()).mo7339a(C43859a.class)).mo89400c(false);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bj.c$b */
    static final class C23835b extends C52712l implements C52670a<C47368a> {

        /* renamed from: a */
        final /* synthetic */ C23833c f63497a;

        C23835b(C23833c cVar) {
            this.f63497a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48923a aVar = this.f63497a.f63494b;
            if (aVar == null) {
                C52711k.m112237a("tabEnv");
            }
            return new C47368a(aVar);
        }
    }

    /* renamed from: a */
    public final C49604i mo49416a() {
        return (C47368a) this.f63495c.getValue();
    }

    /* renamed from: a */
    public final void mo49417a(C48923a aVar) {
        C52711k.m112240b(aVar, "tabEnv");
        this.f63494b = aVar;
    }

    /* renamed from: b */
    public final C49579d mo49418b(C48923a aVar) {
        C52711k.m112240b(aVar, "tabEnv");
        String string = aVar.mo96751b().getString(R.string.g1v);
        C52711k.m112236a((Object) string, "tabEnv.activity.getStrin…tring.creation_tutorials)");
        String string2 = aVar.mo96751b().getString(R.string.h8n);
        C52711k.m112236a((Object) string2, "tabEnv.activity.getStrin…de_creation_tutorial_tag)");
        C49579d dVar = new C49579d(string, string2, "tutorial", false, new C23834a(aVar));
        dVar.f124358a = R.drawable.cog;
        return dVar;
    }
}
