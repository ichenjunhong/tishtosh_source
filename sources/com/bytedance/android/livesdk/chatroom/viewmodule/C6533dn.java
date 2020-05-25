package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.p306bl.C5007d;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dn */
final /* synthetic */ class C6533dn implements Runnable {

    /* renamed from: a */
    private final C5007d f17857a;

    C6533dn(C5007d dVar) {
        this.f17857a = dVar;
    }

    public final void run() {
        this.f17857a.onMessageFinish();
    }
}
