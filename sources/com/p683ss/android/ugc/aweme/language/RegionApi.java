package com.p683ss.android.ugc.aweme.language;

import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53088s;

/* renamed from: com.ss.android.ugc.aweme.language.RegionApi */
public interface RegionApi {

    /* renamed from: a */
    public static final C35829a f92002a = C35829a.f92004b;

    /* renamed from: com.ss.android.ugc.aweme.language.RegionApi$a */
    public static final class C35829a {

        /* renamed from: a */
        static final RegionApi f92003a = ((RegionApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("http://sf16-muse-va.ibytedtos.com").create(RegionApi.class));

        /* renamed from: b */
        static final /* synthetic */ C35829a f92004b = new C35829a();

        private C35829a() {
        }
    }

    @C53075f(mo110603a = "/obj/ttfe-maliva/ttarch/{country_json_file}")
    C2201v<C35831b> getCountryDetail(@C53088s(mo110617a = "country_json_file") String str);
}
