package com.bytedance.android.livesdk.kickout.p391c;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.p269aa.C4495a;

/* renamed from: com.bytedance.android.livesdk.kickout.c.c */
final /* synthetic */ class C7729c implements OnClickListener {

    /* renamed from: a */
    private final User f21258a;

    C7729c(User user) {
        this.f21258a = user;
    }

    public final void onClick(View view) {
        C4495a.m10823a().mo10301a((Object) new UserProfileEvent(this.f21258a));
    }
}
