package com.p683ss.android.ugc.aweme.feed.p1736ui;

import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.newfollow.live.C37899a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ah */
final /* synthetic */ class C30752ah implements Runnable {

    /* renamed from: a */
    private final FeedLiveWindowView f80587a;

    /* renamed from: b */
    private final UrlModel f80588b;

    C30752ah(FeedLiveWindowView feedLiveWindowView, UrlModel urlModel) {
        this.f80587a = feedLiveWindowView;
        this.f80588b = urlModel;
    }

    public final void run() {
        FeedLiveWindowView feedLiveWindowView = this.f80587a;
        UrlModel urlModel = this.f80588b;
        if (feedLiveWindowView.mCoverIv.getWidth() != 0) {
            C23515d.m57671a(feedLiveWindowView.mCoverIv, urlModel, feedLiveWindowView.mCoverIv.getWidth(), feedLiveWindowView.mCoverIv.getHeight(), (C14234d) new C37899a(5, (((float) feedLiveWindowView.mCoverIv.getWidth()) * 1.0f) / ((float) feedLiveWindowView.mCoverIv.getWidth()), null));
        }
    }
}
