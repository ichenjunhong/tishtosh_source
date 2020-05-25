package com.p683ss.android.ugc.aweme.feed.adapter;

import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25880al;
import com.p683ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.p683ss.android.ugc.aweme.feed.experiment.DebugWidgetExperiment;
import com.p683ss.android.ugc.aweme.feed.feedwidget.VideoDescDebugWidget;
import com.p683ss.android.ugc.aweme.feed.feedwidget.VideoFeedTagWidget;
import com.p683ss.android.ugc.aweme.feed.feedwidget.VideoFeedTagWidgetV1;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bi */
public final class C30070bi implements C30021al {
    /* renamed from: a */
    public final Widget mo60293a() {
        if (C10181b.m20511a().mo18172a(WidgetAsyncAB.class, true, "widget_open", 31744, false)) {
            return new VideoFeedTagWidget();
        }
        return new VideoFeedTagWidgetV1();
    }

    /* renamed from: b */
    public final Widget mo60295b() {
        if (C10181b.m20511a().mo18172a(DebugWidgetExperiment.class, true, "feed_debug_widegt_never_use_in_server", 31744, false)) {
            return new VideoDescDebugWidget();
        }
        return null;
    }

    /* renamed from: a */
    public final C25880al mo60294a(C30016ag agVar, View view, int i, String str, C30313ae<C30332aw> aeVar, Fragment fragment) {
        CommerceVideoDelegate commerceVideoDelegate = new CommerceVideoDelegate(agVar, view, i, str, aeVar, fragment);
        return commerceVideoDelegate;
    }
}
