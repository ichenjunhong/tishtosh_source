package com.p683ss.android.ugc.aweme.wiki;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.wiki.CheckWikiWordService */
public interface CheckWikiWordService {

    /* renamed from: a */
    public static final C48406a f121763a = C48406a.f121765b;

    /* renamed from: com.ss.android.ugc.aweme.wiki.CheckWikiWordService$a */
    public static final class C48406a {

        /* renamed from: a */
        static final CheckWikiWordService f121764a = ((CheckWikiWordService) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(CheckWikiWordService.class));

        /* renamed from: b */
        static final /* synthetic */ C48406a f121765b = new C48406a();

        private C48406a() {
        }
    }

    @C53075f(mo110603a = "/aweme/v1/check/antidirt/")
    C17832m<C48407a> checkKeyword(@C53089t(mo110619a = "scene") String str, @C53089t(mo110619a = "lang") String str2, @C53089t(mo110619a = "keyword") String str3);
}
