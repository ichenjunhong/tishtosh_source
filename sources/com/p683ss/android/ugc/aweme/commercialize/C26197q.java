package com.p683ss.android.ugc.aweme.commercialize;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.commercialize.api.CouponRedeemApi;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.q */
final /* synthetic */ class C26197q implements OnClickListener {

    /* renamed from: a */
    private final PoiCouponRedeemActivity f69178a;

    C26197q(PoiCouponRedeemActivity poiCouponRedeemActivity) {
        this.f69178a = poiCouponRedeemActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PoiCouponRedeemActivity poiCouponRedeemActivity = this.f69178a;
        C26890h.m65011a("verify_coupon", C23089d.m56640a().mo47829a("coupon_id", poiCouponRedeemActivity.f67729a).mo47829a("action_type", poiCouponRedeemActivity.f67730b).f61491a);
        view.setEnabled(false);
        C17832m a = CouponRedeemApi.m62162a(poiCouponRedeemActivity.f67729a);
        a.mo6039a(new C26198r(poiCouponRedeemActivity, view, a), C23551l.f62672a);
    }
}
