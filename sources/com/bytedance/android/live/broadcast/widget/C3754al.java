package com.bytedance.android.live.broadcast.widget;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.widget.al */
final /* synthetic */ class C3754al implements C1710e {

    /* renamed from: a */
    private final StickerTipWidget f10622a;

    C3754al(StickerTipWidget stickerTipWidget) {
        this.f10622a = stickerTipWidget;
    }

    public final void accept(Object obj) {
        Long l = (Long) obj;
        this.f10622a.contentView.setVisibility(8);
    }
}
