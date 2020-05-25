package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.C26721r;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.e */
final /* synthetic */ class C25365e implements OnClickListener {

    /* renamed from: a */
    private final CommentInputFragment f67054a;

    /* renamed from: b */
    private final Aweme f67055b;

    C25365e(CommentInputFragment commentInputFragment, Aweme aweme) {
        this.f67054a = commentInputFragment;
        this.f67055b = aweme;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CommentInputFragment commentInputFragment = this.f67054a;
        Aweme aweme = this.f67055b;
        if (aweme.isAd()) {
            C25282a.m61494a().logDetailAdMaskClickReplay(commentInputFragment.getContext(), aweme.getAwemeRawAd().getCreativeIdStr(), "background", aweme.getAwemeRawAd().getLogExtra());
        }
        C47718bf.m103288a(new C26721r(true, aweme.getAid()));
        commentInputFragment.mo51236f();
    }
}
