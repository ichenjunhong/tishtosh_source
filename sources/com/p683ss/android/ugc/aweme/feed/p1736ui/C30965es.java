package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.es */
final /* synthetic */ class C30965es implements OnClickListener {

    /* renamed from: a */
    private final C30964er f81095a;

    /* renamed from: b */
    private final Context f81096b;

    C30965es(C30964er erVar, Context context) {
        this.f81095a = erVar;
        this.f81096b = context;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C30964er erVar = this.f81095a;
        Context context = this.f81096b;
        if (!C32800a.m75679a(view)) {
            C26890h.m65011a("enter_appeal", new C23089d().mo47829a("enter_from", "personal_homepage").mo47829a("group_id", erVar.f81192l.getFromGroupId()).f61491a);
            String reviewDetailUrl = erVar.f81192l.getReviewDetailUrl();
            if (!TextUtils.isEmpty(reviewDetailUrl)) {
                Intent buildIntent = SmartRouter.buildRoute(context, "aweme://webview/").buildIntent();
                buildIntent.setData(Uri.parse(reviewDetailUrl));
                Activity g = C11016e.m22312g();
                if (g != null) {
                    g.startActivity(buildIntent);
                }
            }
        }
    }
}
