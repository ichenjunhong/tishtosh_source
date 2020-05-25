package com.p683ss.android.ugc.aweme.profile.jedi.p2089a;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.profile.service.C40027t;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43891e;
import org.greenrobot.eventbus.C53771m;
import p064c.p065a.C1680ad;
import p064c.p065a.C2206z;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.a.c */
final class C39883c {

    /* renamed from: a */
    public static final C39883c f101733a = new C39883c();

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.a.c$a */
    public static final class C39884a implements DraftListener {
        C39884a() {
        }

        public final void onDraftCheckedChanged(C29059c cVar, boolean z) {
            C52711k.m112240b(cVar, "draft");
        }

        public final void onDraftClean() {
            C39879b.m88655c();
        }

        public final void onDraftDelete(C29059c cVar) {
            C39879b.m88655c();
            C39879b.m88654b().mo6158b();
        }

        public final void onDraftUpdate(C29059c cVar) {
            C52711k.m112240b(cVar, "draft");
            C52711k.m112240b(cVar, "awemeDraft");
            C1680ad a = C1680ad.m5960a((C2206z<? extends T>) C39879b.f101728b.mo22318c(cVar));
            C52711k.m112236a((Object) a, "Single.fromObservable(up…cher.request(awemeDraft))");
            a.mo6158b();
        }
    }

    private C39883c() {
    }

    @C53771m
    public final void onPublishStatusUpdate(C43891e eVar) {
        C52711k.m112240b(eVar, "event");
        if (eVar.f111148b == 9 && !C40027t.f101966a.mo47103a()) {
            C39879b.m88654b().mo6158b();
        }
    }
}
