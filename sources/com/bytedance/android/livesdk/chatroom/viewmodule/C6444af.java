package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdkapi.depend.model.live.C8721u;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.af */
final /* synthetic */ class C6444af implements Runnable {

    /* renamed from: a */
    private final DecorationWrapperWidget f17743a;

    /* renamed from: b */
    private final List f17744b;

    C6444af(DecorationWrapperWidget decorationWrapperWidget, List list) {
        this.f17743a = decorationWrapperWidget;
        this.f17744b = list;
    }

    public final void run() {
        DecorationWrapperWidget decorationWrapperWidget = this.f17743a;
        for (C8721u uVar : this.f17744b) {
            decorationWrapperWidget.mo12355a(uVar);
            decorationWrapperWidget.mo12359c(uVar);
        }
    }
}
