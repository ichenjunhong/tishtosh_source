package com.p683ss.android.ugc.aweme.share;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.app.services.C23165l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26132m;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.share.e */
final /* synthetic */ class C42005e implements OnClickListener {

    /* renamed from: a */
    private final C26132m f106324a;

    C42005e(C26132m mVar) {
        this.f106324a = mVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C26132m mVar = this.f106324a;
        if (!TextUtils.isEmpty(mVar.getOpenUrl())) {
            C23165l.m56764c().mo47880a(view.getContext(), mVar.getOpenUrl(), false);
        } else if (!TextUtils.isEmpty(mVar.getWebUrl())) {
            C23165l.m56764c().mo47879a(view.getContext(), mVar.getWebUrl(), mVar.getWebUrlTitle());
        }
        C26890h.m65011a("click_link", C23089d.m56640a().mo47827a("prop_id", mVar.getCommerceStickerId()).mo47829a("enter_from", "release").mo47829a("link_type", "web_link").f61491a);
    }
}
