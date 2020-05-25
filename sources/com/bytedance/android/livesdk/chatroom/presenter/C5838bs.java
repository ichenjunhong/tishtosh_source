package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.view.C6236b;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bs */
public final class C5838bs implements OnMessageListener {

    /* renamed from: a */
    public C6236b f15302a;

    public final void onMessage(IMessage iMessage) {
        if (this.f15302a != null) {
            this.f15302a.mo11906a((C7859c) iMessage);
        }
    }
}
