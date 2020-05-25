package com.bytedance.android.live.broadcast.widget;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.widget.b */
final /* synthetic */ class C3762b implements C1710e {

    /* renamed from: a */
    private final BroadcastInfoWidget f10630a;

    /* renamed from: b */
    private final int f10631b;

    C3762b(BroadcastInfoWidget broadcastInfoWidget, int i) {
        this.f10630a = broadcastInfoWidget;
        this.f10631b = i;
    }

    public final void accept(Object obj) {
        BroadcastInfoWidget broadcastInfoWidget = this.f10630a;
        int i = this.f10631b;
        Integer num = (Integer) obj;
        if (i == 0) {
            broadcastInfoWidget.f10390d.setVisibility(0);
            broadcastInfoWidget.f10387a.setVisibility(4);
            return;
        }
        broadcastInfoWidget.f10390d.setVisibility(4);
        broadcastInfoWidget.f10387a.setVisibility(0);
        broadcastInfoWidget.f10387a.setImageLevel(i);
    }
}
