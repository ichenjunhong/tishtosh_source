package com.p683ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30907dl;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget */
public class VideoDiggWidget extends AbsAsyncFeedWidget {

    /* renamed from: h */
    private final String f78991h;

    /* renamed from: i */
    private final String f78992i;

    /* renamed from: j */
    private final C30236a f78993j;

    /* renamed from: k */
    private final String f78994k;

    /* renamed from: l */
    private C30907dl f78995l;

    /* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget$a */
    public interface C30236a {
        /* renamed from: a */
        long mo60579a();
    }

    public void onCreate() {
        super.onCreate();
        this.f62238e.mo48226a("awesome_update_data", (C0199s<C23274a>) this).mo48226a("awesome_update_backup_data", (C0199s<C23274a>) this);
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        this.f78995l.onChanged(aVar);
    }

    /* renamed from: b */
    public final C30241a mo60577b(View view) {
        C30907dl dlVar = new C30907dl(view, this.f78991h, this.f78992i, this.f78994k, this.f78993j);
        this.f78995l = dlVar;
        return this.f78995l;
    }

    public VideoDiggWidget(String str, String str2, String str3, String str4, String str5, C30236a aVar) {
        this.f78991h = str;
        this.f78992i = str2;
        this.f78993j = aVar;
        this.f78994k = str5;
    }
}
