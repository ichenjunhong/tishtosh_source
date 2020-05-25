package com.p683ss.android.ugc.aweme.sticker.prop.api;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.port.p2082in.C39599bh;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39805i;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.sticker.model.C46070e;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.api.a */
public final class C46360a implements C39599bh {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f116964a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46360a.class), "stickerPropApi", "getStickerPropApi()Lcom/ss/android/ugc/aweme/sticker/prop/api/StickerPropApi;"))};

    /* renamed from: b */
    private final C52668f f116965b = C52732g.m112285a(C46361a.f116966a);

    /* renamed from: com.ss.android.ugc.aweme.sticker.prop.api.a$a */
    static final class C46361a extends C52712l implements C52670a<StickerPropApi> {

        /* renamed from: a */
        public static final C46361a f116966a = new C46361a();

        C46361a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (StickerPropApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(StickerPropApi.class);
        }
    }

    /* renamed from: a */
    public final C46070e mo80679a(String str) {
        C52711k.m112240b(str, "stickerIds");
        Object obj = ((StickerPropApi) this.f116965b.getValue()).getStickerDetail(str).get();
        C52711k.m112236a(obj, "stickerPropApi.getStickerDetail(stickerIds).get()");
        return (C46070e) obj;
    }

    /* renamed from: a */
    public final void mo80680a(String str, boolean z) {
        C52711k.m112240b(str, "id");
        C47718bf.m103288a(new C39805i());
    }
}
