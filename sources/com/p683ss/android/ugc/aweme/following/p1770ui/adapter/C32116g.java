package com.p683ss.android.ugc.aweme.following.p1770ui.adapter;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.g */
final /* synthetic */ class C32116g implements OnClickListener {

    /* renamed from: a */
    private final ViewHolder f83802a;

    /* renamed from: b */
    private final User f83803b;

    C32116g(ViewHolder viewHolder, User user) {
        this.f83802a = viewHolder;
        this.f83803b = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ViewHolder viewHolder = this.f83802a;
        User user = this.f83803b;
        C26890h.m65011a("remove_fans", C23089d.m56640a().mo47829a("enter_from", "fans").f61491a);
        if (viewHolder.f83762b == null) {
            viewHolder.f83762b = new FollowViewModel(FollowingAdapter.this.f83759l);
        }
        viewHolder.f83762b.mo82847a(user.getUid(), user.getSecUid(), new C32117h(viewHolder, user), new C32118i(viewHolder));
    }
}
