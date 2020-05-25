package com.p683ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31009h;
import com.p683ss.android.ugc.aweme.feed.p1736ui.FeedAvatarViewV1;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.FeedAvatarWidgetV1 */
public class FeedAvatarWidgetV1 extends AbsFeedWidget {
    public void onCreate() {
        super.onCreate();
        this.f62238e.mo48226a("awesome_update_data", (C0199s<C23274a>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C31009h mo49728b(View view) {
        return new FeedAvatarViewV1(view);
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        super.onChanged(aVar);
        if (aVar != null && aVar.mo48246a() != null && (aVar.mo48246a() instanceof VideoItemParams) && C26235d.m63570a(((VideoItemParams) aVar.mo48246a()).mAweme) && "awesome_update_data".equals(aVar.f62242a)) {
            mo60576b(aVar);
        }
    }
}
