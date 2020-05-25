package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d.C5043c;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.cg */
final /* synthetic */ class C6499cg implements C5043c {

    /* renamed from: a */
    private final LinkPKMvpWidget f17808a;

    C6499cg(LinkPKMvpWidget linkPKMvpWidget) {
        this.f17808a = linkPKMvpWidget;
    }

    /* renamed from: a */
    public final void mo10904a(View view) {
        ((LinearLayout) view).setOnClickListener(new C6508cp(this.f17808a));
    }
}
