package com.p683ss.android.ugc.aweme.profile.survey;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.p1465bs.C24047a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.profile.survey.SurveyApi */
public final class SurveyApi {

    /* renamed from: a */
    private static final boolean f101969a = false;

    /* renamed from: b */
    private static final SurveyRetrofit f101970b = ((SurveyRetrofit) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(SurveyRetrofit.class));

    /* renamed from: com.ss.android.ugc.aweme.profile.survey.SurveyApi$SurveyRetrofit */
    interface SurveyRetrofit {
        @C53075f(mo110603a = "/aweme/v1/survey/get/")
        C0013i<C24047a> getSurveyData();

        @C53075f(mo110603a = "/aweme/v1/survey/record/")
        C0013i<Object> recordAnswer(@C53089t(mo110619a = "action_type") int i, @C53089t(mo110619a = "dialog_id") int i2, @C53089t(mo110619a = "original_id") int i3);
    }

    /* renamed from: a */
    public static C0013i<C24047a> m88997a() {
        try {
            return f101970b.getSurveyData();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static C0013i<Object> m88998a(C40030b bVar) {
        try {
            return f101970b.recordAnswer(bVar.f101971a, bVar.f101972b, bVar.f101973c);
        } catch (Throwable unused) {
            return null;
        }
    }
}
