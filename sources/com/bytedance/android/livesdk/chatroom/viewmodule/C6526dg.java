package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.core.p230g.C3889d;
import com.bytedance.android.livesdk.chatroom.event.C5156ab;
import com.bytedance.android.livesdk.drawerfeed.C6749b;
import com.bytedance.android.livesdk.p269aa.C4495a;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dg */
final /* synthetic */ class C6526dg implements OnClickListener {

    /* renamed from: a */
    private final LiveDrawerEntranceWidget f17839a;

    C6526dg(LiveDrawerEntranceWidget liveDrawerEntranceWidget) {
        this.f17839a = liveDrawerEntranceWidget;
    }

    public final void onClick(View view) {
        LiveDrawerEntranceWidget liveDrawerEntranceWidget = this.f17839a;
        Bundle bundle = new Bundle();
        bundle.putString("pull_type", "button");
        C6749b.m14143a(C3889d.m9831a(liveDrawerEntranceWidget.getContext()), Boolean.valueOf(true), bundle, "button");
        C4495a.m10823a().mo10301a((Object) new C5156ab("button"));
        LiveDrawerEntranceWidget.f17256b = false;
        LiveDrawerEntranceWidget.f17257c = 0;
        liveDrawerEntranceWidget.mo12444a();
    }
}
