package com.bytedance.android.livesdk.chatroom.viewmodule;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.by */
final /* synthetic */ class C6490by implements C1710e {

    /* renamed from: a */
    private final LinkInRoomAudioWidget f17791a;

    /* renamed from: b */
    private final long f17792b;

    /* renamed from: c */
    private final String f17793c;

    C6490by(LinkInRoomAudioWidget linkInRoomAudioWidget, long j, String str) {
        this.f17791a = linkInRoomAudioWidget;
        this.f17792b = j;
        this.f17793c = str;
    }

    public final void accept(Object obj) {
        LinkInRoomAudioWidget linkInRoomAudioWidget = this.f17791a;
        long j = this.f17792b;
        String str = this.f17793c;
        Long l = (Long) obj;
        if (linkInRoomAudioWidget.f17156b != null) {
            linkInRoomAudioWidget.f17156b.mo11371b(j, str);
            linkInRoomAudioWidget.f17168n.remove(Long.valueOf(j));
        }
    }
}
