package com.p683ss.android.ugc.aweme.money.growth;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.android.gms.ads.p1029b.C14902a;
import com.google.android.gms.ads.p1029b.C14902a.C14903a;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi */
public final class GoogleCampaignInfoApi {

    /* renamed from: a */
    public static final GoogleCampaignApi f94822a = ((GoogleCampaignApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(GoogleCampaignApi.class));

    /* renamed from: b */
    public static final C37150a f94823b = new C37150a(null);

    /* renamed from: com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi$GoogleCampaignApi */
    public interface GoogleCampaignApi {
        @C53075f(mo110603a = "/aweme/v1/activity/campaign/")
        C0013i<C37153a> querySettings(@C53089t(mo110619a = "google_aid") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi$a */
    public static final class C37150a {

        /* renamed from: com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi$a$a */
        static final class C37151a<V> implements Callable<TResult> {

            /* renamed from: a */
            public static final C37151a f94824a = new C37151a();

            C37151a() {
            }

            public final /* synthetic */ Object call() {
                C14903a a = C14902a.m30575a(C11010c.m22280a());
                GoogleCampaignApi googleCampaignApi = GoogleCampaignInfoApi.f94822a;
                C52711k.m112236a((Object) a, "info");
                String str = a.f38442a;
                C52711k.m112236a((Object) str, "info.id");
                return googleCampaignApi.querySettings(str).mo20a((C0011g<TResult, TContinuationResult>) C371521.f94825a, (Executor) C0013i.f24a);
            }
        }

        private C37150a() {
        }

        public /* synthetic */ C37150a(C52707g gVar) {
            this();
        }
    }
}
