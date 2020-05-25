package com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.utils.GenericWidget;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbsAsyncFeedWidget */
public abstract class AbsAsyncFeedWidget extends GenericWidget {

    /* renamed from: a */
    protected C30241a f79007a;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C30241a mo60577b(View view);

    public void onStop() {
        if (this.f79007a != null) {
            this.f79007a.mo60583a();
        }
    }

    public void onPause() {
        if (this.f79007a != null) {
            C30241a aVar = this.f79007a;
            if (aVar.f79008a) {
                C30255o.f79039a.mo60617a(new C30256p(aVar.f79008a, new C30245e(aVar)));
            }
        }
    }

    public void onResume() {
        if (this.f79007a != null) {
            C30241a aVar = this.f79007a;
            if (aVar.f79008a) {
                C30255o.f79039a.mo60617a(new C30256p(aVar.f79008a, new C30243c(aVar)));
            }
        }
    }

    public void onStart() {
        if (this.f79007a != null) {
            C30241a aVar = this.f79007a;
            if (aVar.f79008a) {
                C30255o.f79039a.mo60617a(new C30256p(aVar.f79008a, new C30242b(aVar)));
            }
        }
    }

    public void onDestroy() {
        if (this.f79007a == null) {
            super.onDestroy();
        } else if (this.f79007a.f79008a) {
            this.f79007a.mo60591b();
            C30241a aVar = this.f79007a;
            if (aVar.f79008a) {
                C30255o.f79039a.mo60617a(new C30256p(false, new C30248h(aVar)));
            } else {
                aVar.mo60599e();
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        if (this.f79007a != null) {
            C30241a aVar = this.f79007a;
            aVar.f79016i.mo48226a("video_params", (C0199s<C23274a>) aVar.f79009b).mo48226a("on_viewpager_page_selected", (C0199s<C23274a>) aVar.f79009b).mo48226a("async_widget_unsafe_data", (C0199s<C23274a>) aVar.f79009b);
            if (aVar.f79008a) {
                C30255o.f79039a.mo60617a(new C30256p(aVar.f79008a, new C30249i(aVar)));
                return;
            }
            VideoItemParams videoItemParams = (VideoItemParams) aVar.f79016i.mo48229a("video_params");
            if (videoItemParams != null) {
                aVar.onChanged(new C23274a("video_params", videoItemParams));
            }
        }
    }

    /* renamed from: a */
    public final void mo48241a(View view) {
        C30255o.f79039a.mo60618a();
        super.mo48241a(view);
        this.f79007a = mo60577b(view);
        this.f79007a.f79009b = this;
        this.f79007a.mo60592b(this.f62238e);
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
            if (c == 0) {
                VideoItemParams videoItemParams = (VideoItemParams) aVar.mo48246a();
                if (this.f79007a != null) {
                    this.f79007a.mo60587a(videoItemParams);
                }
            }
        }
    }
}
