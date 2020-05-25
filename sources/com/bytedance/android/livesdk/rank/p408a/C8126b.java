package com.bytedance.android.livesdk.rank.p408a;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.p269aa.C4495a;

/* renamed from: com.bytedance.android.livesdk.rank.a.b */
final /* synthetic */ class C8126b implements OnClickListener {

    /* renamed from: a */
    static final OnClickListener f22191a = new C8126b();

    private C8126b() {
    }

    public final void onClick(View view) {
        if (view.getTag() != null && (view.getTag() instanceof User)) {
            C4495a.m10823a().mo10301a((Object) new UserProfileEvent((User) view.getTag(), "guest_contribution_list"));
        }
    }
}
