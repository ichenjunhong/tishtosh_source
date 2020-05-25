package com.p683ss.android.ugc.aweme.feed;

import com.p683ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.ss.android.ugc.aweme.feed.c */
final /* synthetic */ class C30160c implements C2205y {

    /* renamed from: a */
    private final Aweme f78725a;

    C30160c(Aweme aweme) {
        this.f78725a = aweme;
    }

    public final void subscribe(C2204x xVar) {
        Aweme aweme = this.f78725a;
        try {
            String aid = aweme.getAid();
            User author = aweme.getAuthor();
            String uid = author != null ? author.getUid() : "";
            int i = 0;
            int followStatus = author != null ? author.getFollowStatus() : 0;
            if (author != null) {
                i = author.getFollowerStatus();
            }
            AwemeStatsApi.f78666a.awemeFamiliarStatsReport(aid, uid, followStatus, i).get();
        } catch (Exception unused) {
        } finally {
            xVar.mo6273a();
        }
    }
}
