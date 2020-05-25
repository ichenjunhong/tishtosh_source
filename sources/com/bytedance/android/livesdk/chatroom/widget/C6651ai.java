package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.ai */
final /* synthetic */ class C6651ai implements C1710e {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f18157a;

    C6651ai(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f18157a = liveRoomUserInfoWidget;
    }

    public final void accept(Object obj) {
        Long l = (Long) obj;
        this.f18157a.mo12740a(C3922z.m9903a((int) R.string.egq));
        C4525b.f12367aj.mo10346a(Boolean.valueOf(true));
    }
}
