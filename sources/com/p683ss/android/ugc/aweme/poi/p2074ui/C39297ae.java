package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.ae */
final /* synthetic */ class C39297ae implements OnClickListener {

    /* renamed from: a */
    private final PoiRoutePresenter f100446a;

    C39297ae(PoiRoutePresenter poiRoutePresenter) {
        this.f100446a = poiRoutePresenter;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PoiRoutePresenter poiRoutePresenter = this.f100446a;
        if (poiRoutePresenter.mo80069g() != null) {
            poiRoutePresenter.mo80069g().mo79285a();
        }
    }
}
