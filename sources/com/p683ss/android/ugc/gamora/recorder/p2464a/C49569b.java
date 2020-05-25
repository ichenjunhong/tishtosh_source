package com.p683ss.android.ugc.gamora.recorder.p2464a;

import com.bytedance.als.C2759d;
import com.bytedance.als.C2764h;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.scene.p837a.C12837c;
import com.bytedance.scene.p837a.p838a.C12830b;
import com.bytedance.scene.p840b.C12861f.C12863a;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.a.b */
public final class C49569b extends C2764h<C49568a> implements C49568a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f124341a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49569b.class), "beautyScene", "getBeautyScene()Lcom/ss/android/ugc/gamora/recorder/beauty/RecordBeautyScene;"))};

    /* renamed from: b */
    public final C49568a f124342b = this;

    /* renamed from: c */
    public final C12896b f124343c;

    /* renamed from: d */
    public final C48923a f124344d;

    /* renamed from: e */
    private final C52668f f124345e = C52732g.m112285a(new C49570a(this));

    /* renamed from: com.ss.android.ugc.gamora.recorder.a.b$a */
    static final class C49570a extends C52712l implements C52670a<C49571c> {

        /* renamed from: a */
        final /* synthetic */ C49569b f124346a;

        C49570a(C49569b bVar) {
            this.f124346a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C49571c(this.f124346a.f124344d);
        }
    }

    /* renamed from: h */
    private final C49571c m106946h() {
        return (C49571c) this.f124345e.getValue();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f124342b;
    }

    /* renamed from: b */
    public final boolean mo97480b() {
        C12942d dVar = this.f124343c.f33837e;
        if (dVar == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) dVar, "parent.navigationScene!!");
        return C18998a.m46171a(dVar, (C12924i) m106946h());
    }

    /* renamed from: a */
    public final void mo97479a(boolean z) {
        C12942d dVar = this.f124343c.f33837e;
        if (dVar == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) dVar, "parent.navigationScene!!");
        if (!z || C18998a.m46171a(dVar, (C12924i) m106946h())) {
            if (C18998a.m46171a(dVar, (C12924i) m106946h())) {
                dVar.mo24531d();
            }
            return;
        }
        dVar.mo24522a((C12924i) m106946h(), new C12863a().mo24324a(true).mo24323a((C12837c) new C12830b()).mo24325a());
    }

    public C49569b(C12896b bVar, C48923a aVar) {
        C52711k.m112240b(bVar, "parent");
        C52711k.m112240b(aVar, "recordEnv");
        this.f124343c = bVar;
        this.f124344d = aVar;
    }
}
