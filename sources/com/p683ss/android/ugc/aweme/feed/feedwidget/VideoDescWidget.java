package com.p683ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30787bb;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30890cy;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoDescWidget */
public class VideoDescWidget extends AbsAsyncFeedWidget {

    /* renamed from: h */
    private final C30787bb f78989h;

    /* renamed from: i */
    private C30890cy f78990i;

    public VideoDescWidget() {
        this(null);
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        this.f78990i.onChanged(aVar);
    }

    public VideoDescWidget(C30787bb bbVar) {
        this.f78989h = bbVar;
    }

    /* renamed from: b */
    public final C30241a mo60577b(View view) {
        this.f78990i = new C30890cy(view, this.f78989h, C10181b.m20511a().mo18172a(WidgetAsyncAB.class, true, "widget_open", 31744, false));
        return this.f78990i;
    }
}
