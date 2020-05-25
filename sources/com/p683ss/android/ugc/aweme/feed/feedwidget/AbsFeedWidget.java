package com.p683ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31009h;
import com.p683ss.android.ugc.aweme.utils.GenericWidget;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.AbsFeedWidget */
public abstract class AbsFeedWidget extends GenericWidget implements C0199s<C23274a> {

    /* renamed from: a */
    private C31009h f78982a;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C31009h mo49728b(View view);

    public final void onDestroy() {
        super.onDestroy();
        if (this.f78982a != null) {
            this.f78982a.mo49781a();
        }
    }

    public final void onStop() {
        super.onStop();
        if (this.f78982a != null) {
            this.f78982a.mo63316h();
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f62238e.mo48226a("video_params", (C0199s<C23274a>) this).mo48226a("on_viewpager_page_selected", (C0199s<C23274a>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo60576b(C23274a aVar) {
        VideoItemParams videoItemParams = (VideoItemParams) aVar.mo48246a();
        if (this.f78982a != null) {
            this.f78982a.mo58323a(videoItemParams);
        }
    }

    /* renamed from: a */
    public final void mo48241a(View view) {
        super.mo48241a(view);
        this.f78982a = mo49728b(view);
        this.f78982a.mo60581b(this.f62238e);
        VideoItemParams videoItemParams = (VideoItemParams) this.f62238e.mo48229a("video_params");
        if (videoItemParams != null) {
            this.f78982a.mo58323a(videoItemParams);
        }
    }

    /* renamed from: a */
    public void onChanged(C23274a aVar) {
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1180796502) {
                if (hashCode == -98766390 && str.equals("video_params")) {
                    c = 0;
                }
            } else if (str.equals("on_viewpager_page_selected")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    mo60576b(aVar);
                    return;
                case 1:
                    if (this.f78982a != null) {
                        this.f78982a.mo63327i();
                        break;
                    }
                    break;
            }
        }
    }
}
