package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.commercialize.log.C26052as;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.utils.C38455d;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.notification.a.i */
final /* synthetic */ class C38126i implements OnClickListener {

    /* renamed from: a */
    private final C38125h f97072a;

    C38126i(C38125h hVar) {
        this.f97072a = hVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C38125h hVar = this.f97072a;
        int i = 0;
        int i2 = hVar.f97062d.getUser().getFollowStatus() != 0 ? 1 : 0;
        int i3 = i2 ^ 1;
        if (i2 == 0) {
            i = C38455d.m85781a(hVar.f97062d.getUser(), false) ? 4 : 1;
        }
        C47718bf.m103288a(new C24530d(i, hVar.f97062d.getUser()));
        hVar.f97061c.mo66349a(new C39970a().mo81871a(hVar.f97062d.getUser().getUid()).mo81869a(i3).mo81877d(hVar.f97062d.getUser().getFollowerStatus()).mo81872a());
        C26890h.onEvent(new MobClick().setEventName(i2 != 0 ? "follow_cancel" : "follow").setLabelName("message").setValue(hVar.f97062d.getUser().getUid()));
        if (i2 == 0) {
            C26052as.m63104a().logFollowUserEventI18n("message", hVar.f97062d.getUser().getUid(), "previous_page", "other_places");
            C38415g.m85726a(hVar.f97063e, hVar.f97062d);
        }
        hVar.mo78102b(i);
    }
}
