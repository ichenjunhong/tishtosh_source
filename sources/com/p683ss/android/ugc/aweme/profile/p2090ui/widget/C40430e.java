package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.C23287at;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.e */
public final /* synthetic */ class C40430e implements OnClickListener {

    /* renamed from: a */
    private final ProfileStarRankView f103215a;

    /* renamed from: b */
    private final User f103216b;

    public C40430e(ProfileStarRankView profileStarRankView, User user) {
        this.f103215a = profileStarRankView;
        this.f103216b = user;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        ProfileStarRankView profileStarRankView = this.f103215a;
        User user = this.f103216b;
        if (profileStarRankView.f103158c && profileStarRankView.f103159d != null) {
            C26890h.m65011a("enter_billboard_star", C23089d.m56640a().mo47829a("enter_from", "challenge").mo47829a("tag_id", profileStarRankView.f103159d.getCid()).f61491a);
        }
        C41302w.m91042a().mo83861a(C23287at.m57275a().getRankHelperService().mo56650b(profileStarRankView.getEnterFrom(), user.getUid(), user.getSecUid()));
    }
}
