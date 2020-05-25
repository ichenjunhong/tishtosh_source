package com.p683ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.y */
final /* synthetic */ class C30125y implements OnClickListener {

    /* renamed from: a */
    private final C30124x f78647a;

    C30125y(C30124x xVar) {
        this.f78647a = xVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C30124x xVar = this.f78647a;
        if (xVar.f78644a != null) {
            C25280a.m61493a().setShouldSetTopWhenOpen(true);
            xVar.f78644a.mo48228a("video_open_comment_dialog", (Object) Boolean.valueOf(true));
        }
    }
}
