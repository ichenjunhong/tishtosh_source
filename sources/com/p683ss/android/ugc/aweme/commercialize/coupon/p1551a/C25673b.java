package com.p683ss.android.ugc.aweme.commercialize.coupon.p1551a;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.coupon.C25668a;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.a.b */
final /* synthetic */ class C25673b implements OnClickListener {

    /* renamed from: a */
    private final C25671a f67905a;

    /* renamed from: b */
    private final C25687b f67906b;

    /* renamed from: c */
    private final int f67907c;

    /* renamed from: d */
    private final boolean f67908d;

    C25673b(C25671a aVar, C25687b bVar, int i, boolean z) {
        this.f67905a = aVar;
        this.f67906b = bVar;
        this.f67907c = i;
        this.f67908d = z;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C25671a aVar = this.f67905a;
        C25687b bVar = this.f67906b;
        int i = this.f67907c;
        boolean z = this.f67908d;
        if (aVar.f67901g.get() != null) {
            Activity activity = (Activity) aVar.f67901g.get();
            int couponId = bVar.getCouponId();
            String codeId = bVar.getCodeId();
            int i2 = C25670a.f67889b;
            Intent intent = new Intent(activity, CouponDetailActivity.class);
            intent.putExtra("coupon_id", String.valueOf(couponId));
            intent.putExtra("code_id", codeId);
            intent.putExtra("coupon_list_position", i);
            intent.putExtra("previous_page", "card_bag");
            activity.startActivityForResult(intent, i2);
        }
        C26890h.m65011a("click_coupon", C23089d.m56640a().mo47829a("enter_from", z ? "card_bag" : "invalid_card_bag").mo47829a("previous_page", z ? "card_bag" : "invalid_card_bag").mo47829a("enter_method", "click_card_bag").mo47826a("coupon_id", bVar.getCouponId()).mo47829a("coupon_type", C25668a.m62225a(view.getContext(), bVar.getStatus(), true)).mo47829a("source_type", C25668a.m62226a(bVar)).f61491a);
    }
}
