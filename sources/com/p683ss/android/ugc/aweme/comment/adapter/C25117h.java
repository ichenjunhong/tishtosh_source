package com.p683ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.p683ss.android.ugc.aweme.comment.list.C25265n;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.h */
final /* synthetic */ class C25117h implements OnLongClickListener {

    /* renamed from: a */
    private final CommentReplyViewHolder f66544a;

    C25117h(CommentReplyViewHolder commentReplyViewHolder) {
        this.f66544a = commentReplyViewHolder;
    }

    public final boolean onLongClick(View view) {
        CommentReplyViewHolder commentReplyViewHolder = this.f66544a;
        if (!(commentReplyViewHolder.f66409a == null || commentReplyViewHolder.f66410b == null)) {
            commentReplyViewHolder.f66409a.mo51259b((C25265n) commentReplyViewHolder.f66411c, commentReplyViewHolder.f66410b);
        }
        return true;
    }
}
