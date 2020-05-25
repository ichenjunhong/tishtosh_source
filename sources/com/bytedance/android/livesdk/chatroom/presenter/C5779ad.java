package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.gift.relay.p381a.C7629a;
import com.bytedance.android.livesdk.message.model.C7804aj;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ad */
public final class C5779ad extends C5868cl<C5780a> implements OnMessageListener {

    /* renamed from: a */
    public C1690c f15227a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ad$a */
    public interface C5780a extends C6463ay {
        /* renamed from: a */
        void mo11669a(C7629a aVar);

        /* renamed from: a */
        void mo11670a(C7804aj ajVar);
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
        if (this.f15227a != null && !this.f15227a.isDisposed()) {
            this.f15227a.dispose();
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C7804aj) {
            ((C5780a) mo8518c()).mo11670a((C7804aj) iMessage);
        }
    }

    /* renamed from: a */
    public final void mo8520a(C5780a aVar) {
        super.mo8520a(aVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.FREE_CELL_GIFT_MESSAGE.getIntType(), this);
        }
    }
}
