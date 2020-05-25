package com.bytedance.android.livesdk.chatroom.p325ui;

import android.net.Uri;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.an */
final /* synthetic */ class C5936an implements C1710e {

    /* renamed from: a */
    private final InRoomPKAnimationView f15623a;

    /* renamed from: b */
    private final Uri f15624b;

    C5936an(InRoomPKAnimationView inRoomPKAnimationView, Uri uri) {
        this.f15623a = inRoomPKAnimationView;
        this.f15624b = uri;
    }

    public final void accept(Object obj) {
        InRoomPKAnimationView inRoomPKAnimationView = this.f15623a;
        Long l = (Long) obj;
        inRoomPKAnimationView.f15505d.setController(((C13773e) C13771c.m27870a().mo25725b(this.f15624b).mo25762c(true)).mo25763d());
        inRoomPKAnimationView.f15505d.setVisibility(0);
    }
}
