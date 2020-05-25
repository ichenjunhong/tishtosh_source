package com.p683ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.comment.list.C25265n;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.g */
final /* synthetic */ class C25116g implements OnClickListener {

    /* renamed from: a */
    private final CommentReplyViewHolder f66543a;

    C25116g(CommentReplyViewHolder commentReplyViewHolder) {
        this.f66543a = commentReplyViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CommentReplyViewHolder commentReplyViewHolder = this.f66543a;
        if (commentReplyViewHolder.f66409a != null && commentReplyViewHolder.f66410b != null && commentReplyViewHolder.f66410b.getUser() != null && commentReplyViewHolder.f66410b.getCid() != null) {
            commentReplyViewHolder.f66409a.mo51253a((C25265n) commentReplyViewHolder.f66411c, commentReplyViewHolder.f66410b);
        }
    }
}
