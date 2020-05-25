package com.p683ss.android.ugc.aweme.following.p1770ui.adapter;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31984a;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.util.C40556o;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.d */
final /* synthetic */ class C32113d implements C31984a {

    /* renamed from: a */
    private final ViewHolder f83792a;

    /* renamed from: b */
    private final User f83793b;

    C32113d(ViewHolder viewHolder, User user) {
        this.f83792a = viewHolder;
        this.f83793b = user;
    }

    /* renamed from: a */
    public final void mo56224a(FollowStatus followStatus) {
        ViewHolder viewHolder = this.f83792a;
        User user = this.f83793b;
        if (followStatus != null) {
            if (FollowingAdapter.this.f83758k != null) {
                FollowingAdapter.this.f83758k.put(user.getUid(), Boolean.valueOf(true));
            }
            viewHolder.mo65288b(user, followStatus.followStatus);
            viewHolder.mo65287a(user, followStatus.followStatus);
            if (viewHolder.itemView != null) {
                C40556o.m89968a(viewHolder.itemView.getContext(), user, followStatus);
            }
            if (followStatus.followStatus == 0 && !TextUtils.isEmpty(user.getRemarkName())) {
                user.setRemarkName("");
                viewHolder.mo65287a(user, followStatus.followStatus);
            }
        }
    }
}
