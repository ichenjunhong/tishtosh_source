package com.p683ss.android.ugc.aweme.feed.helper;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p064c.p065a.C1680ad;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.FeedSurveyApi */
public interface FeedSurveyApi {

    /* renamed from: a */
    public static final C30359a f79273a = C30359a.f79274a;

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.FeedSurveyApi$a */
    public static final class C30359a {

        /* renamed from: a */
        static final /* synthetic */ C30359a f79274a = new C30359a();

        private C30359a() {
        }
    }

    @C53084o(mo110612a = "/aweme/v1/survey/set/")
    @C53074e
    C1680ad<BaseResponse> submitFeedSurvey(@C53072c(mo110600a = "item_id") String str, @C53072c(mo110600a = "source") int i, @C53072c(mo110600a = "operation") int i2, @C53072c(mo110600a = "feed_survey") String str2);
}
