package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.app.Activity;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48162f;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.c */
final /* synthetic */ class C37953c implements C48162f {

    /* renamed from: a */
    private final CommentFollowFeedMomentViewHolder f96636a;

    C37953c(CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder) {
        this.f96636a = commentFollowFeedMomentViewHolder;
    }

    /* renamed from: a */
    public final void mo51166a(View view, TextExtraStruct textExtraStruct) {
        CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder = this.f96636a;
        if (C11016e.m22312g() != null) {
            C41302w a = C41302w.m91042a();
            Activity g = C11016e.m22312g();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(textExtraStruct.getUserId());
            a.mo83858a(g, C41311y.m91065a(sb.toString()).mo83870a("sec_user_id", textExtraStruct.getSecUid()).mo83871a());
        }
        C26890h.m65005a(commentFollowFeedMomentViewHolder.mTvComment.getContext(), LeakCanaryFileProvider.f132049i, "comment_at", textExtraStruct.getUserId(), 0);
        C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", commentFollowFeedMomentViewHolder.f96611b).mo47829a("to_user_id", textExtraStruct.getUserId()).mo47829a("group_id", commentFollowFeedMomentViewHolder.f96613d).mo47829a("author_id", commentFollowFeedMomentViewHolder.f96614e).mo47829a("enter_method", "click_comment_name").f61491a);
        C30578o.m71566a(C29988ad.PROFILE);
    }
}
