package com.p683ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48162f;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.j */
final /* synthetic */ class C25119j implements C48162f {

    /* renamed from: a */
    private final CommentReplyViewHolder f66546a;

    C25119j(CommentReplyViewHolder commentReplyViewHolder) {
        this.f66546a = commentReplyViewHolder;
    }

    /* renamed from: a */
    public final void mo51166a(View view, TextExtraStruct textExtraStruct) {
        CommentReplyViewHolder commentReplyViewHolder = this.f66546a;
        if (C11016e.m22312g() != null) {
            SmartRouter.buildRoute((Context) C11016e.m22312g(), "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam(C22835a.f61196a, textExtraStruct.getSecUid()).open();
        }
        C26890h.m65005a(commentReplyViewHolder.mContentView.getContext(), LeakCanaryFileProvider.f132049i, "comment_at", textExtraStruct.getUserId(), 0);
        C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", commentReplyViewHolder.f66414f).mo47829a("to_user_id", textExtraStruct.getUserId()).mo47829a("group_id", commentReplyViewHolder.f66415g).mo47829a("author_id", commentReplyViewHolder.f66416h).mo47829a("enter_method", "comment_at").f61491a);
    }
}
