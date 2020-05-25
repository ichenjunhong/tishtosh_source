package com.p683ss.android.ugc.aweme.commercialize.coupon.p1551a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.a.c */
final /* synthetic */ class C25674c implements OnClickListener {

    /* renamed from: a */
    private final C25672b f67909a;

    C25674c(C25672b bVar) {
        this.f67909a = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C25672b bVar = this.f67909a;
        if (bVar.f67904b.get() != null) {
            C26890h.m65011a("enter_invalid_card_bag", C23089d.m56640a().mo47829a("enter_from", "card_bag").f61491a);
            Intent intent = new Intent((Context) bVar.f67904b.get(), CouponListActivity.class);
            intent.putExtra("is_coupon_valid", false);
            ((Activity) bVar.f67904b.get()).startActivity(intent);
        }
    }
}
