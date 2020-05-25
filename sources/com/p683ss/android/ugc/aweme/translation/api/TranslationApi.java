package com.p683ss.android.ugc.aweme.translation.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.translation.p2371a.C47353a;
import com.p683ss.android.ugc.aweme.translation.p2371a.C47356c;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.translation.api.TranslationApi */
public final class TranslationApi {

    /* renamed from: a */
    private static IRetrofitService f119518a = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.ss.android.ugc.aweme.translation.api.TranslationApi$RealApi */
    public interface RealApi {
        @C53084o(mo110612a = "/aweme/v1/contents/translation/")
        @C53074e
        C17832m<C47353a> getMultiTranslation(@C53072c(mo110600a = "trg_lang") String str, @C53072c(mo110600a = "translation_info") String str2, @C53089t(mo110619a = "scene") int i);

        @C53075f(mo110603a = "/aweme/v1/content/translation/")
        C17832m<C47356c> getTranslation(@C53089t(mo110619a = "content") String str, @C53089t(mo110619a = "src_lang") String str2, @C53089t(mo110619a = "trg_lang") String str3, @C53089t(mo110619a = "group_id") String str4, @C53089t(mo110619a = "scene") int i);
    }

    /* renamed from: a */
    public static RealApi m102713a() {
        return (RealApi) f119518a.createNewRetrofit(C18845b.f52040e).create(RealApi.class);
    }

    /* renamed from: a */
    public static C47356c m102712a(String str, String str2, String str3, String str4, int i) throws Exception {
        try {
            return (C47356c) m102713a().getTranslation(str, str2, str3, str4, i).get();
        } catch (ExecutionException e) {
            throw f119518a.propagateCompatibleException(e);
        }
    }
}
