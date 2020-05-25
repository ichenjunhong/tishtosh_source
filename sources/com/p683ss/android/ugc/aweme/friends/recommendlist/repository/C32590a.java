package com.p683ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.p683ss.android.ugc.aweme.friends.recommendlist.repository.RecommendApi.C32588a;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.a */
public final class C32590a extends C11585a<String, String, DislikeRecommendParams, String> {

    /* renamed from: a */
    private final RecommendApi f84826a = C32588a.m75381a();

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.a$a */
    static final class C32591a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ DislikeRecommendParams f84827a;

        C32591a(DislikeRecommendParams dislikeRecommendParams) {
            this.f84827a = dislikeRecommendParams;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52711k.m112240b((C52860x) obj, "it");
            return this.f84827a.uid;
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        DislikeRecommendParams dislikeRecommendParams = (DislikeRecommendParams) obj;
        C52711k.m112240b(dislikeRecommendParams, "req");
        return dislikeRecommendParams.uid;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        DislikeRecommendParams dislikeRecommendParams = (DislikeRecommendParams) obj;
        C52711k.m112240b(dislikeRecommendParams, "req");
        C2201v d = this.f84826a.dislikeRecommend(dislikeRecommendParams.uid, dislikeRecommendParams.secUid).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6541d((C1711f<? super T, ? extends R>) new C32591a<Object,Object>(dislikeRecommendParams));
        C52711k.m112236a((Object) d, "service.dislikeRecommend…Thread()).map { req.uid }");
        return d;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        String str = (String) obj2;
        C52711k.m112240b((DislikeRecommendParams) obj, "req");
        C52711k.m112240b(str, "resp");
        return str;
    }
}
