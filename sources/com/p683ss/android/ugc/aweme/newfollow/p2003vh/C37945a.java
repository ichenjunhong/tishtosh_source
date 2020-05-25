package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.comment.list.C25265n;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.a */
final /* synthetic */ class C37945a implements OnClickListener {

    /* renamed from: a */
    private final CommentFollowFeedMomentViewHolder f96622a;

    /* renamed from: b */
    private final C25147a f96623b;

    C37945a(CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder, C25147a aVar) {
        this.f96622a = commentFollowFeedMomentViewHolder;
        this.f96623b = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder = this.f96622a;
        C25147a aVar = this.f96623b;
        if (aVar != null) {
            aVar.mo51253a((C25265n) null, commentFollowFeedMomentViewHolder.f96610a);
        }
    }
}
