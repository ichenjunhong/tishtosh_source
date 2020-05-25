package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.C7877cq;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.ies.p619a.C10175a;
import com.bytedance.ies.p619a.C10176b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p064c.p065a.C1683ag;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ce */
public final class C5859ce extends C10176b<C10175a> implements OnMessageListener {

    /* renamed from: a */
    private IMessageManager f15343a;

    /* renamed from: b */
    private DataCenter f15344b;

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
        if (this.f15343a != null) {
            this.f15343a.removeMessageListener(this);
        }
    }

    public C5859ce(DataCenter dataCenter) {
        this.f15344b = dataCenter;
    }

    /* renamed from: a */
    public final void mo8520a(C10175a aVar) {
        super.mo8520a(aVar);
        this.f15343a = (IMessageManager) this.f15344b.get("data_message_manager");
        if (this.f15343a != null) {
            this.f15343a.addMessageListener(C8629a.USER_STATS.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage != null) {
            C7877cq cqVar = (C7877cq) iMessage;
            if (cqVar != null && cqVar.f21828b == TTLiveSDKContext.getHostService().mo10315h().mo14529b() && 1 == cqVar.f21829c) {
                TTLiveSDKContext.getHostService().mo10315h().mo14535e().mo6159b((C1683ag<? super T>) new C8335g<Object>());
                this.f15344b.lambda$put$1$DataCenter("cmd_refresh_user_in_room", new Object());
            }
        }
    }
}
