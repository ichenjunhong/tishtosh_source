package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteResponse;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteApi */
public interface VoteApi {

    /* renamed from: a */
    public static final C44584a f112798a = C44584a.f112800b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteApi$a */
    public static final class C44584a {

        /* renamed from: a */
        public static final IRetrofitService f112799a = RetrofitService.createIRetrofitServicebyMonsterPlugin();

        /* renamed from: b */
        static final /* synthetic */ C44584a f112800b = new C44584a();

        private C44584a() {
        }
    }

    @C53084o(mo110612a = "/aweme/v1/vote/option/")
    @C53074e
    C2201v<VoteResponse> vote(@C53072c(mo110600a = "vote_id") long j, @C53072c(mo110600a = "option_id") long j2);
}
