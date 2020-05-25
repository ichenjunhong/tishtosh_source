package com.p683ss.android.ugc.aweme.setting.api;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.setting.api.ABApi */
public interface ABApi {

    /* renamed from: a */
    public static final C41541a f105231a = C41541a.f105233b;

    /* renamed from: com.ss.android.ugc.aweme.setting.api.ABApi$a */
    public static final class C41541a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f105232a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C41541a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/setting/api/ABApi;"))};

        /* renamed from: b */
        static final /* synthetic */ C41541a f105233b = new C41541a();

        /* renamed from: c */
        private static final C52668f f105234c = C52732g.m112285a(C41542a.f105235a);

        /* renamed from: com.ss.android.ugc.aweme.setting.api.ABApi$a$a */
        static final class C41542a extends C52712l implements C52670a<ABApi> {

            /* renamed from: a */
            public static final C41542a f105235a = new C41542a();

            C41542a() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return (ABApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(ABApi.class);
            }
        }

        private C41541a() {
        }

        /* renamed from: a */
        public static ABApi m91370a() {
            return (ABApi) f105234c.getValue();
        }
    }

    @C12706h(mo23876a = "/aweme/v1/abtest/param/")
    C0013i<C18085o> querySettings(@C12724z(mo23894a = "last_settings_version") String str);
}
