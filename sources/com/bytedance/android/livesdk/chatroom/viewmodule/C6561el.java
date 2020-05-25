package com.bytedance.android.livesdk.chatroom.viewmodule;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.el */
final /* synthetic */ class C6561el implements C1710e {

    /* renamed from: a */
    private final RadioWidget f17894a;

    C6561el(RadioWidget radioWidget) {
        this.f17894a = radioWidget;
    }

    public final void accept(Object obj) {
        RadioWidget radioWidget = this.f17894a;
        Long l = (Long) obj;
        radioWidget.f17530e.setVisibility(0);
        radioWidget.f17530e.setOnClickListener(radioWidget);
        radioWidget.f17536k.setOnClickListener(radioWidget);
        radioWidget.f17531f.setVisibility(0);
        radioWidget.f17531f.mo6654b();
    }
}
