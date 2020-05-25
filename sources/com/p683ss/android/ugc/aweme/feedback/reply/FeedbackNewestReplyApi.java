package com.p683ss.android.ugc.aweme.feedback.reply;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.C12690b;
import p2628d.p2639f.p2641b.C52707g;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.aweme.feedback.reply.FeedbackNewestReplyApi */
public final class FeedbackNewestReplyApi {

    /* renamed from: a */
    public static Api f82035a = ((Api) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(com.p683ss.android.ugc.aweme.app.api.Api.f61282b).mo19925a().mo19930a(Api.class));

    /* renamed from: b */
    public static final C31290a f82036b = new C31290a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.reply.FeedbackNewestReplyApi$Api */
    interface Api {
        @C53075f(mo110603a = "/api/feedback/v1/newest_reply/")
        C12690b<C31294c> getNewestReply();
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.reply.FeedbackNewestReplyApi$a */
    public static final class C31290a {
        private C31290a() {
        }

        public /* synthetic */ C31290a(C52707g gVar) {
            this();
        }
    }
}
