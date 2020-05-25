package com.p683ss.android.ugc.aweme.commercialize;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.p */
final /* synthetic */ class C26151p implements OnClickListener {

    /* renamed from: a */
    private final PoiCouponRedeemActivity f69054a;

    C26151p(PoiCouponRedeemActivity poiCouponRedeemActivity) {
        this.f69054a = poiCouponRedeemActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f69054a.mo52726a();
    }
}
