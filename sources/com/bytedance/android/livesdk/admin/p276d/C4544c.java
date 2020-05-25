package com.bytedance.android.livesdk.admin.p276d;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.p269aa.C4495a;

/* renamed from: com.bytedance.android.livesdk.admin.d.c */
final /* synthetic */ class C4544c implements OnClickListener {

    /* renamed from: a */
    private final User f12498a;

    C4544c(User user) {
        this.f12498a = user;
    }

    public final void onClick(View view) {
        C4495a.m10823a().mo10301a((Object) new UserProfileEvent(this.f12498a));
    }
}
