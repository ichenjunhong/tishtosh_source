package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.bb */
final /* synthetic */ class C40251bb implements OnClickListener {

    /* renamed from: a */
    private final I18nBaseUserProfileFragment f102791a;

    C40251bb(I18nBaseUserProfileFragment i18nBaseUserProfileFragment) {
        this.f102791a = i18nBaseUserProfileFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        I18nBaseUserProfileFragment i18nBaseUserProfileFragment = this.f102791a;
        C26890h.m65011a("remove_fans", C23089d.m56640a().mo47829a("enter_from", "others_homepage").f61491a);
        if (i18nBaseUserProfileFragment.f102219ay == null) {
            i18nBaseUserProfileFragment.f102219ay = new FollowViewModel(i18nBaseUserProfileFragment);
        }
        i18nBaseUserProfileFragment.f102219ay.mo82847a(i18nBaseUserProfileFragment.f103081w.getUid(), i18nBaseUserProfileFragment.f103081w.getSecUid(), new C40254be(i18nBaseUserProfileFragment), new C40255bf(i18nBaseUserProfileFragment));
    }
}
