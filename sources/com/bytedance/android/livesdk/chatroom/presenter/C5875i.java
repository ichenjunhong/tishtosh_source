package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdk.chatroom.view.C6235a;
import com.bytedance.android.livesdk.message.model.C8009t;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.i */
public final class C5875i implements OnMessageListener {

    /* renamed from: a */
    public C6235a f15381a;

    /* renamed from: b */
    public DataCenter f15382b;

    /* renamed from: c */
    public IMessageManager f15383c;

    public C5875i(DataCenter dataCenter) {
        this.f15382b = dataCenter;
    }

    public final void onMessage(IMessage iMessage) {
        if (this.f15381a != null) {
            this.f15381a.mo11907a((C8009t) iMessage);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", Integer.valueOf(((C8009t) iMessage).f21914a));
        C3837e.m9743a("ttlive_control_message_status", 1, (Map<String, Object>) hashMap);
    }
}
