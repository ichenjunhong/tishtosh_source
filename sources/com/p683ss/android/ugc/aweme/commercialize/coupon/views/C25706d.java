package com.p683ss.android.ugc.aweme.commercialize.coupon.views;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.views.d */
final /* synthetic */ class C25706d implements OnClickListener {

    /* renamed from: a */
    private final CouponListActivity f68016a;

    C25706d(CouponListActivity couponListActivity) {
        this.f68016a = couponListActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CouponListActivity couponListActivity = this.f68016a;
        C26890h.m65011a("enter_invalid_card_bag", C23089d.m56640a().mo47829a("enter_from", "card_bag").f61491a);
        Intent intent = new Intent(couponListActivity, CouponListActivity.class);
        intent.putExtra("is_coupon_valid", false);
        couponListActivity.startActivity(intent);
    }
}
