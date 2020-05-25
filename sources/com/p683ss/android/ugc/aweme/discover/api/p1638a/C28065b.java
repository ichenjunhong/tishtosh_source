package com.p683ss.android.ugc.aweme.discover.api.p1638a;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.api.a.b */
public final class C28065b {

    /* renamed from: a */
    public static final IRetrofit f73738a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f73742e);

    /* renamed from: b */
    public static final IRetrofit f73739b = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(TutorialVideoApiManager.f96873a);

    /* renamed from: c */
    public static final IRetrofit f73740c = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("https://i.isnssdk.com");

    /* renamed from: d */
    public static final C28066a f73741d = new C28066a(null);

    /* renamed from: e */
    private static final String f73742e = Api.f61282b;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.a.b$a */
    public static final class C28066a {
        private C28066a() {
        }

        public /* synthetic */ C28066a(C52707g gVar) {
            this();
        }
    }
}
