package com.p683ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import android.view.View.OnTouchListener;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31005fr;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoAuthorInfoWidget */
public final class VideoAuthorInfoWidget extends AbsAsyncFeedWidget {

    /* renamed from: h */
    private final OnTouchListener f78987h;

    public VideoAuthorInfoWidget(OnTouchListener onTouchListener) {
        this.f78987h = onTouchListener;
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        this.f79007a.onChanged(aVar);
    }

    /* renamed from: b */
    public final C30241a mo60577b(View view) {
        return new C31005fr(view, this.f78987h);
    }
}
