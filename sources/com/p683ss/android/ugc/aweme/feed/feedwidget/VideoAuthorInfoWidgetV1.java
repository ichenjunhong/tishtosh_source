package com.p683ss.android.ugc.aweme.feed.feedwidget;

import android.view.View;
import android.view.View.OnTouchListener;
import com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30864cn;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31007fs;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31009h;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoAuthorInfoWidgetV1 */
public final class VideoAuthorInfoWidgetV1 extends AbsFeedWidget {

    /* renamed from: a */
    private final OnTouchListener f78988a;

    public VideoAuthorInfoWidgetV1(OnTouchListener onTouchListener) {
        this.f78988a = onTouchListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C31009h mo49728b(View view) {
        if (PlayerRedesignExperiment.m70953a() == 0) {
            return new C31007fs(view, this.f78988a);
        }
        return new C30864cn(view, this.f78988a);
    }
}
