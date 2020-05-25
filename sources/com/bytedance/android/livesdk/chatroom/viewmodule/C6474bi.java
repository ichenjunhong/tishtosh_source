package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d.C5043c;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bi */
final /* synthetic */ class C6474bi implements C5043c {

    /* renamed from: a */
    private final LinkCrossRoomWidget f17774a;

    C6474bi(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f17774a = linkCrossRoomWidget;
    }

    /* renamed from: a */
    public final void mo10904a(View view) {
        ((TextView) view).setOnClickListener(new C6479bn(this.f17774a));
    }
}
