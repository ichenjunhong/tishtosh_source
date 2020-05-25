package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.df */
final /* synthetic */ class C40323df implements OnClickListener {

    /* renamed from: a */
    private final ProfileMoreFragment f102928a;

    C40323df(ProfileMoreFragment profileMoreFragment) {
        this.f102928a = profileMoreFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ProfileMoreFragment profileMoreFragment = this.f102928a;
        C26890h.m65011a("remove_fans", C23089d.m56640a().mo47829a("enter_from", "others_homepage").f61491a);
        if (profileMoreFragment.f102508c == null) {
            profileMoreFragment.f102508c = new FollowViewModel(profileMoreFragment);
        }
        profileMoreFragment.f102508c.mo82847a(profileMoreFragment.f102506a.getUid(), profileMoreFragment.f102506a.getSecUid(), new C40325dh(profileMoreFragment), new C40326di(profileMoreFragment));
    }
}
