package com.p683ss.android.ugc.aweme.friends.p1792ui;

import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31984a;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ak */
final /* synthetic */ class C32727ak implements C31984a {

    /* renamed from: a */
    private final C32720aj f85256a;

    C32727ak(C32720aj ajVar) {
        this.f85256a = ajVar;
    }

    /* renamed from: a */
    public final void mo56224a(FollowStatus followStatus) {
        C32720aj ajVar = this.f85256a;
        if (followStatus != null) {
            ajVar.f85235m.put(ajVar.f85229g.getUid(), Boolean.valueOf(true));
            ajVar.mo66305a(ajVar.f85229g, followStatus.followStatus);
            if (ajVar.f85234l) {
                if (followStatus.followStatus == 0) {
                    ajVar.f85231i.setVisibility(0);
                    return;
                }
                ajVar.f85231i.setVisibility(4);
            }
        }
    }
}
