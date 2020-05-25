package com.p683ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12718t;
import com.p683ss.android.ugc.aweme.language.C35837h;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.DonationTokenCreateApi */
public interface DonationTokenCreateApi {

    /* renamed from: a */
    public static final C45364a f114716a = C45364a.f114717a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.DonationTokenCreateApi$a */
    public static final class C45364a {

        /* renamed from: a */
        static final /* synthetic */ C45364a f114717a = new C45364a();

        private C45364a() {
        }

        /* renamed from: a */
        public final DonationTokenCreateApi mo91697a() {
            String str;
            IRetrofitFactory createIRetrofitFactorybyMonsterPlugin = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin();
            if (C35837h.m80977b()) {
                str = "https://webcast.tiktokv.com";
            } else {
                str = "https://webcast.musical.ly";
            }
            Object a = createIRetrofitFactorybyMonsterPlugin.createBuilder(str).mo19925a().mo19930a(DonationTokenCreateApi.class);
            C52711k.m112236a(a, "ServiceManager.get().get…kenCreateApi::class.java)");
            return (DonationTokenCreateApi) a;
        }
    }

    @C12718t(mo23886a = "/webcast/room/token_create/")
    @C12705g
    C2201v<DonationTokenResponse> tokenCreate(@C12703e(mo23873a = "item_type") int i, @C12703e(mo23873a = "item_id") long j);
}
