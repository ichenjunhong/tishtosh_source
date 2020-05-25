package com.bytedance.android.livesdk.chatroom.p325ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.p231a.C3859i;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.p269aa.C4495a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bw */
final /* synthetic */ class C6006bw implements OnClickListener {

    /* renamed from: a */
    static final OnClickListener f15924a = new C6006bw();

    private C6006bw() {
    }

    public final void onClick(View view) {
        Object a = C3859i.m9788a(view, String.valueOf(view.getId()));
        if (a != null) {
            C4495a.m10823a().mo10301a((Object) new UserProfileEvent((User) a, "guest_waiting_list"));
        }
    }
}
