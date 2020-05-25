package com.p683ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.r */
final /* synthetic */ class C25131r implements OnClickListener {

    /* renamed from: a */
    private final CommentViewHolderNewStyle f66571a;

    C25131r(CommentViewHolderNewStyle commentViewHolderNewStyle) {
        this.f66571a = commentViewHolderNewStyle;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f66571a.mo51169a(view);
    }
}
