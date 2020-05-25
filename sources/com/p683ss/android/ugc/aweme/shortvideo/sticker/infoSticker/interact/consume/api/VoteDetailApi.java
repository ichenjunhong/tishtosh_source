package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteDetailApi */
public interface VoteDetailApi {

    /* renamed from: a */
    public static final C44585a f112801a = C44585a.f112802a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteDetailApi$a */
    public static final class C44585a {

        /* renamed from: a */
        static final /* synthetic */ C44585a f112802a = new C44585a();

        private C44585a() {
        }
    }

    @C53075f(mo110603a = "/aweme/v1/vote/option/userlist/")
    C2201v<VoteDetailResponse> getVoteDetail(@C53089t(mo110619a = "vote_id") long j, @C53089t(mo110619a = "option_id") long j2, @C53089t(mo110619a = "offset") int i);
}
