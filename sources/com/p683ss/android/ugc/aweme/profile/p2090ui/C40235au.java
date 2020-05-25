package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.Profile;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30471a;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30478c.C30479a;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.qrcode.C40952c.C40954a;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.au */
final /* synthetic */ class C40235au implements OnClickListener {

    /* renamed from: a */
    private final I18nBaseMyProfileFragment f102768a;

    C40235au(I18nBaseMyProfileFragment i18nBaseMyProfileFragment) {
        this.f102768a = i18nBaseMyProfileFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        I18nBaseMyProfileFragment i18nBaseMyProfileFragment = this.f102768a;
        if (!C32800a.m75679a(view)) {
            User curUser = C20854a.m53167g().getCurUser();
            String o = C47915gg.m103666o(curUser);
            if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle(Profile.f35248a)) {
                o = C47915gg.m103656e(curUser);
            }
            C40026s.f101964a.startQRCodeActivityV2(i18nBaseMyProfileFragment.getContext(), new C40954a().mo83446a(4, C47915gg.m103665n(curUser), "personal_homepage").mo83449a(o, C47915gg.m103667p(curUser), C47915gg.m103661j(curUser)).f104177a);
            if (curUser != null) {
                C26851b bVar = new C26851b();
                bVar.mo54799a(new C30471a());
                bVar.mo44934a_(new C30479a().mo60897a(curUser.getUid()).mo60896a(1).mo60899b(-1).mo60902d(4).mo60900b("qr_code").mo60898a());
            }
        }
    }
}
