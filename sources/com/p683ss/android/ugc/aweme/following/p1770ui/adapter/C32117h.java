package com.p683ss.android.ugc.aweme.following.p1770ui.adapter;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.h */
final /* synthetic */ class C32117h implements C1710e {

    /* renamed from: a */
    private final ViewHolder f83804a;

    /* renamed from: b */
    private final User f83805b;

    C32117h(ViewHolder viewHolder, User user) {
        this.f83804a = viewHolder;
        this.f83805b = user;
    }

    public final void accept(Object obj) {
        ViewHolder viewHolder = this.f83804a;
        User user = this.f83805b;
        BaseResponse baseResponse = (BaseResponse) obj;
        user.setFollowerStatus(0);
        if (user.getFollowStatus() == 2) {
            user.setFollowStatus(1);
        }
        int indexOf = FollowingAdapter.this.mo50673a().indexOf(user);
        FollowingAdapter.this.mo50673a().remove(indexOf);
        FollowingAdapter.this.notifyItemRemoved(indexOf);
    }
}
