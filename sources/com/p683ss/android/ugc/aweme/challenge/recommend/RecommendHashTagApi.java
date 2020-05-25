package com.p683ss.android.ugc.aweme.challenge.recommend;

import android.arch.lifecycle.C0198r;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.challenge.recommend.p1499a.C24596a;
import com.p683ss.android.ugc.aweme.challenge.recommend.p1499a.C24598b;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi */
public final class RecommendHashTagApi {

    /* renamed from: a */
    public static final HashTagApi f65060a = ((HashTagApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(HashTagApi.class));

    /* renamed from: b */
    public static final RecommendHashTagApi f65061b = new RecommendHashTagApi();

    /* renamed from: com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi$HashTagApi */
    public interface HashTagApi {

        /* renamed from: a */
        public static final C24593a f65062a = C24593a.f65063a;

        /* renamed from: com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi$HashTagApi$a */
        public static final class C24593a {

            /* renamed from: a */
            static final /* synthetic */ C24593a f65063a = new C24593a();

            private C24593a() {
            }
        }

        @C53075f(mo110603a = "/aweme/v1/challenge/history/intervene/")
        C0013i<C24598b> fetchRecommendHashTagsMT(@C53089t(mo110619a = "debug") String str, @C53089t(mo110619a = "zip_uri") String str2, @C53089t(mo110619a = "effect_ids") String str3, @C53089t(mo110619a = "music_id") String str4, @C53089t(mo110619a = "video_id") String str5, @C53089t(mo110619a = "mac_address") String str6);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi$a */
    public static final class C24594a<TTaskResult, TContinuationResult> implements C0011g<C24598b, Void> {

        /* renamed from: a */
        final /* synthetic */ C0198r f65064a;

        public C24594a(C0198r rVar) {
            this.f65064a = rVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "task");
            if (iVar.mo26b()) {
                List<C24596a> list = ((C24598b) iVar.mo34e()).f65075a;
                C52711k.m112236a((Object) list, "task.result.data");
                C52575l.m112105a(list, C245951.f65065a);
                this.f65064a.setValue(iVar.mo34e());
            }
            return null;
        }
    }

    private RecommendHashTagApi() {
    }
}
