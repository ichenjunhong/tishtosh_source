package com.p683ss.android.ugc.aweme.following.p1770ui.adapter;

import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31984a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.j */
final /* synthetic */ class C32119j implements C31984a {

    /* renamed from: a */
    private final ViewHolder f83807a;

    /* renamed from: b */
    private final IMUser f83808b;

    C32119j(ViewHolder viewHolder, IMUser iMUser) {
        this.f83807a = viewHolder;
        this.f83808b = iMUser;
    }

    /* renamed from: a */
    public final void mo56224a(FollowStatus followStatus) {
        this.f83807a.mo65293a(this.f83808b, followStatus);
    }
}
