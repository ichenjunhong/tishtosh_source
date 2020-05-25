package com.p683ss.android.ugc.aweme.commercialize.widget;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget */
public abstract class AbsAdFeedWidget extends Widget implements C0199s<C23274a> {

    /* renamed from: h */
    public Aweme f70584h;

    /* renamed from: i */
    public Fragment f70585i;

    public void onCreate() {
        super.onCreate();
        mo54694d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo54694d() {
        DataCenter dataCenter = this.f62238e;
        if (dataCenter != null) {
            dataCenter.mo48226a("ad_feed_video_params", (C0199s<C23274a>) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54693a(C26816b bVar) {
        C52711k.m112240b(bVar, "params");
        this.f70584h = bVar.f70647a;
        this.f70585i = bVar.f70648b;
    }

    /* renamed from: a */
    public final void mo48241a(View view) {
        super.mo48241a(view);
        DataCenter dataCenter = this.f62238e;
        if (dataCenter != null) {
            C26816b bVar = (C26816b) dataCenter.mo48229a("ad_feed_video_params");
            if (bVar != null) {
                mo54693a(bVar);
            }
        }
    }

    /* renamed from: a */
    public void onChanged(C23274a aVar) {
        String str;
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        if (str != null && str.hashCode() == 1512987055 && str.equals("ad_feed_video_params")) {
            C26816b bVar = (C26816b) aVar.mo48246a();
            if (bVar != null) {
                mo54693a(bVar);
            }
        }
    }
}
