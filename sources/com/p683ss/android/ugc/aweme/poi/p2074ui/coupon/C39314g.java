package com.p683ss.android.ugc.aweme.poi.p2074ui.coupon;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.g */
public final /* synthetic */ class C39314g implements OnClickListener {

    /* renamed from: a */
    private final PoiCouponLayout f100500a;

    /* renamed from: b */
    private final C25687b f100501b;

    public C39314g(PoiCouponLayout poiCouponLayout, C25687b bVar) {
        this.f100500a = poiCouponLayout;
        this.f100501b = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PoiCouponLayout poiCouponLayout = this.f100500a;
        C25687b bVar = this.f100501b;
        SmartRouter.buildRoute(poiCouponLayout.getContext(), "//coupon/detail").withParam("coupon_id", String.valueOf(bVar.getCouponId())).withParam("code_id", bVar.getCodeId()).withParam("previous_page", "poi_page").open();
        poiCouponLayout.mo80122a(bVar);
    }
}
