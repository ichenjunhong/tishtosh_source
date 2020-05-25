package com.p683ss.android.ugc.aweme.comment.api;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.comment.model.GifEmojiResponse;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.IMainService;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.comment.api.GifEmojiApi */
public interface GifEmojiApi {

    /* renamed from: a */
    public static final C25135a f66575a = C25135a.f66578c;

    /* renamed from: com.ss.android.ugc.aweme.comment.api.GifEmojiApi$a */
    public static final class C25135a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f66576a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C25135a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/comment/api/GifEmojiApi;"))};

        /* renamed from: b */
        public static final C52668f f66577b;

        /* renamed from: c */
        static final /* synthetic */ C25135a f66578c;

        /* renamed from: com.ss.android.ugc.aweme.comment.api.GifEmojiApi$a$a */
        static final class C25136a extends C52712l implements C52670a<GifEmojiApi> {

            /* renamed from: a */
            final /* synthetic */ C25135a f66579a;

            C25136a(C25135a aVar) {
                this.f66579a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
                IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin();
                C52711k.m112236a((Object) createIMainServicebyMonsterPlugin, "ServiceManager.get().get…IMainService::class.java)");
                Object create = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(createIMainServicebyMonsterPlugin.getApiUrlPrefix()).create(GifEmojiApi.class);
                C52711k.m112236a(create, "ServiceManager.get()\n   …(GifEmojiApi::class.java)");
                return (GifEmojiApi) create;
            }
        }

        private C25135a() {
        }

        static {
            C25135a aVar = new C25135a();
            f66578c = aVar;
            f66577b = C52732g.m112285a(new C25136a(aVar));
        }
    }

    @C53075f(mo110603a = "aweme/v1/im/resources/sticker/collect/")
    C2201v<BaseResponse> collectGifEmoji(@C53089t(mo110619a = "action") int i, @C53089t(mo110619a = "sticker_ids") String str, @C53089t(mo110619a = "sticker_source") int i2);

    @C53075f(mo110603a = "aweme/v1/im/resources/emoticon/search/")
    C2201v<GifEmojiResponse> searchGifEmoji(@C53089t(mo110619a = "keyword") String str, @C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "source") String str2, @C53089t(mo110619a = "group_id") String str3);
}
