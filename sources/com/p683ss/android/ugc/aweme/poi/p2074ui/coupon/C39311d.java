package com.p683ss.android.ugc.aweme.poi.p2074ui.coupon;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.d */
final /* synthetic */ class C39311d implements OnClickListener {

    /* renamed from: a */
    private final GotCouponDialog f100495a;

    C39311d(GotCouponDialog gotCouponDialog) {
        this.f100495a = gotCouponDialog;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        GotCouponDialog gotCouponDialog = this.f100495a;
        gotCouponDialog.dismiss();
        C39452l.m87732a(gotCouponDialog.f100454a.f100479c, "click_coupon_toast", C23089d.m56640a().mo47829a("enter_from", "homepage_follow").mo47829a("enter_method", "click_publish").mo47826a("coupon_id", gotCouponDialog.f100454a.f100478b.getCouponId()).mo47829a("poi_id", gotCouponDialog.f100454a.f100477a));
    }
}
