package com.bytedance.android.livesdk.chatroom.viewmodule;

import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.n */
final /* synthetic */ class C6590n implements C1710e {

    /* renamed from: a */
    private final BottomRightBannerWidget f17929a;

    C6590n(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f17929a = bottomRightBannerWidget;
    }

    public final void accept(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f17929a;
        bottomRightBannerWidget.f16804d.mo10496a(bottomRightBannerWidget.f16801a, "H5_roomStatusChange", (JSONObject) obj);
    }
}
