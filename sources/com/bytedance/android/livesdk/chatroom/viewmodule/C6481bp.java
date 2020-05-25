package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d.C5043c;
import com.bytedance.android.livesdk.widget.VHeadView;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bp */
final /* synthetic */ class C6481bp implements C5043c {

    /* renamed from: a */
    private final LinkCrossRoomWidget f17781a;

    C6481bp(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f17781a = linkCrossRoomWidget;
    }

    /* renamed from: a */
    public final void mo10904a(View view) {
        ((VHeadView) view).setOnClickListener(new C6478bm(this.f17781a));
    }
}
