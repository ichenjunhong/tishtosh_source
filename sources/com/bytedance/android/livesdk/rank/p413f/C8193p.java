package com.bytedance.android.livesdk.rank.p413f;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.rank.model.C8219f;

/* renamed from: com.bytedance.android.livesdk.rank.f.p */
final /* synthetic */ class C8193p implements OnClickListener {

    /* renamed from: a */
    private final C8219f f22361a;

    C8193p(C8219f fVar) {
        this.f22361a = fVar;
    }

    public final void onClick(View view) {
        UserProfileEvent userProfileEvent = new UserProfileEvent(this.f22361a.f22442a.getId());
        userProfileEvent.setClickUserPosition("noble_rank");
        C4495a.m10823a().mo10301a((Object) userProfileEvent);
    }
}
