package com.p683ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.sticker.model.C46067b;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.l */
final /* synthetic */ class C46397l implements OnClickListener {

    /* renamed from: a */
    private final C46067b f117059a;

    C46397l(C46067b bVar) {
        this.f117059a = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C46067b bVar = this.f117059a;
        C26890h.m65011a("click_aduser_head", new C23089d().mo47829a("enter_from", "prop_page").mo47829a("to_user_id", bVar.getAdOwnerId()).mo47829a("prop_id", bVar.getId()).f61491a);
        C26890h.m65011a("enter_personal_detail", new C23089d().mo47829a("enter_from", "prop_page").mo47829a("to_user_id", bVar.getAdOwnerId()).mo47829a("prop_id", bVar.getId()).f61491a);
        C41302w a = C41302w.m91042a();
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        sb.append(bVar.getAdOwnerId());
        a.mo83861a(sb.toString());
    }
}
