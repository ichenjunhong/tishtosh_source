package com.p683ss.android.ugc.aweme.following.p1770ui.adapter;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.k */
final /* synthetic */ class C32120k implements OnClickListener {

    /* renamed from: a */
    private final ViewHolder f83809a;

    /* renamed from: b */
    private final User f83810b;

    C32120k(ViewHolder viewHolder, User user) {
        this.f83809a = viewHolder;
        this.f83810b = user;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        ViewHolder viewHolder = this.f83809a;
        User user = this.f83810b;
        String uid = user.getUid();
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", "friends_list");
        bundle.putString("to_user_id", uid);
        C26890h.m65009a("enter_chat", bundle);
        C32616c.m75399a().startChatActivity(viewHolder.itemView.getContext(), user);
    }
}
