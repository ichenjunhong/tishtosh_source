package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.av */
final /* synthetic */ class C33773av implements OnClickListener {

    /* renamed from: a */
    private final C33767at f87619a;

    C33773av(C33767at atVar) {
        this.f87619a = atVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C33767at atVar = this.f87619a;
        C33849j.m77600e().f87812a = !C33849j.m77600e().f87812a;
        atVar.f87603w.setImageResource(C33849j.m77600e().f87812a ? R.drawable.dc_ : R.drawable.dca);
        C26890h.m65011a(C33849j.m77600e().f87812a ? "volumn_off" : "volumn_on", C23089d.m56640a().mo47829a("enter_from", "chat").f61491a);
        if (atVar.f87604x != null) {
            atVar.f87604x.mo70352a(C33849j.m77600e().f87812a);
        }
    }
}
