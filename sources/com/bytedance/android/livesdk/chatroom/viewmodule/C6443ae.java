package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.event.C5176av;
import com.bytedance.android.livesdk.chatroom.widget.C6640a;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ae */
final /* synthetic */ class C6443ae implements Runnable {

    /* renamed from: a */
    private final DecorationWrapperWidget f17741a;

    /* renamed from: b */
    private final C5176av f17742b;

    C6443ae(DecorationWrapperWidget decorationWrapperWidget, C5176av avVar) {
        this.f17741a = decorationWrapperWidget;
        this.f17742b = avVar;
    }

    public final void run() {
        DecorationWrapperWidget decorationWrapperWidget = this.f17741a;
        decorationWrapperWidget.f16936c[1] = C9432q.m18688b(decorationWrapperWidget.context) - this.f17742b.f13868a;
        for (C6640a a : decorationWrapperWidget.f16937d) {
            a.mo12755a(decorationWrapperWidget.f16936c);
        }
    }
}
