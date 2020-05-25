package com.p683ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30874co;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidget */
public class VideoCommentWidget extends AbsAsyncFeedWidget {
    public void onCreate() {
        super.onCreate();
        this.f62238e.mo48226a("awesome_update_data", (C0199s<C23274a>) this).mo48226a("awesome_update_backup_data", (C0199s<C23274a>) this);
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        this.f79007a.onChanged(aVar);
    }

    /* renamed from: b */
    public final C30241a mo60577b(View view) {
        return new C30874co(view);
    }
}
