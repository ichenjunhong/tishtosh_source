package com.p683ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31009h;
import com.p683ss.android.ugc.aweme.feed.p1736ui.FeedLiveWindowView;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.FeedLiveWindowWidget */
public class FeedLiveWindowWidget extends AbsFeedWidget {

    /* renamed from: a */
    public View f78983a;

    /* renamed from: h */
    private FeedLiveWindowView f78984h;

    /* renamed from: d */
    public final FrameLayout mo60578d() {
        if (this.f78984h == null) {
            return null;
        }
        return this.f78984h.mVideoContainer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C31009h mo49728b(View view) {
        this.f78984h = new FeedLiveWindowView(view);
        this.f78983a = this.f78984h.f81199s;
        return this.f78984h;
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        super.onChanged(aVar);
        if (aVar != null && aVar.mo48246a() != null && (aVar.mo48246a() instanceof VideoItemParams) && "awesome_update_data".equals(aVar.f62242a)) {
            mo60576b(aVar);
        }
    }
}
