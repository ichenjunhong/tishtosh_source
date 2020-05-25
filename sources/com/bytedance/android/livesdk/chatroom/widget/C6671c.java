package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.livesdk.chatroom.p305b.C4997a.C4999a;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.c */
final /* synthetic */ class C6671c implements C4999a {

    /* renamed from: a */
    private final DebugInfoView f18216a;

    C6671c(DebugInfoView debugInfoView) {
        this.f18216a = debugInfoView;
    }

    /* renamed from: a */
    public final void mo10877a(C8629a aVar, long j) {
        DebugInfoView debugInfoView = this.f18216a;
        switch (aVar) {
            case GIFT:
                debugInfoView.f17995a.setText(String.valueOf(j));
                return;
            case DIGG:
                debugInfoView.f17997c.setText(String.valueOf(j));
                return;
            case CHAT:
                debugInfoView.f17996b.setText(String.valueOf(j));
                return;
            case MEMBER:
                debugInfoView.f17998d.setText(String.valueOf(j));
                break;
        }
    }
}
