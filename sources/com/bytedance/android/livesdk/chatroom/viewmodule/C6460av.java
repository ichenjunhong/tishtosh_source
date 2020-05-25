package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.core.p230g.C3889d;
import com.bytedance.android.livesdk.chatroom.event.C5156ab;
import com.bytedance.android.livesdk.drawerfeed.C6749b;
import com.bytedance.android.livesdk.p269aa.C4495a;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.av */
final /* synthetic */ class C6460av implements OnClickListener {

    /* renamed from: a */
    private final HourRankForDyWidget f17765a;

    C6460av(HourRankForDyWidget hourRankForDyWidget) {
        this.f17765a = hourRankForDyWidget;
    }

    public final void onClick(View view) {
        HourRankForDyWidget hourRankForDyWidget = this.f17765a;
        if (hourRankForDyWidget.f17070d != null) {
            C6461aw.m13901a(hourRankForDyWidget.f17070d);
        }
        C4495a.m10823a().mo10301a((Object) new C5156ab("toast"));
        C6749b.m14142a(C3889d.m9831a(hourRankForDyWidget.getContext()), Boolean.valueOf(true));
    }
}
