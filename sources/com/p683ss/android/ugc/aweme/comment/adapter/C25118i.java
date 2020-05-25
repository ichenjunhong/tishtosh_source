package com.p683ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.comment.C25273o;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.i */
final /* synthetic */ class C25118i implements OnClickListener {

    /* renamed from: a */
    private final CommentReplyViewHolder f66545a;

    C25118i(CommentReplyViewHolder commentReplyViewHolder) {
        this.f66545a = commentReplyViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CommentReplyViewHolder commentReplyViewHolder = this.f66545a;
        if (commentReplyViewHolder.f66409a != null && C25273o.m61475b(commentReplyViewHolder.f66410b)) {
            commentReplyViewHolder.f66409a.mo51254a(commentReplyViewHolder.f66410b);
        }
    }
}
