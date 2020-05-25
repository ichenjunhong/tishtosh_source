package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d.C5043c;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.cj */
final /* synthetic */ class C6502cj implements C5043c {

    /* renamed from: a */
    private final LinkPKMvpWidget f17811a;

    C6502cj(LinkPKMvpWidget linkPKMvpWidget) {
        this.f17811a = linkPKMvpWidget;
    }

    /* renamed from: a */
    public final void mo10904a(View view) {
        ((LinearLayout) view).setOnClickListener(new C6507co(this.f17811a));
    }
}
