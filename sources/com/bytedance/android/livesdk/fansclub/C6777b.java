package com.bytedance.android.livesdk.fansclub;

import com.bytedance.android.livesdk.chatroom.presenter.C5868cl;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.message.model.C7799af;
import com.bytedance.android.livesdk.message.model.C7801ag;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.message.model.FansclubStatisticMessage;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.fansclub.b */
public final class C6777b extends C5868cl<C6779a> implements OnMessageListener {

    /* renamed from: com.bytedance.android.livesdk.fansclub.b$a */
    public interface C6779a extends C6463ay {
        /* renamed from: a */
        void mo12913a(FansclubStatisticMessage fansclubStatisticMessage);

        /* renamed from: a */
        void mo12914a(C7799af afVar);

        /* renamed from: a */
        void mo12915a(C7801ag agVar);
    }

    /* renamed from: a */
    public final void mo8520a(C6779a aVar) {
        super.mo8520a(aVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.FANS_CLUB_STATISTICS.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.FANS_CLUB.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.FANS_CLUB_REVIEW.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (mo8518c() != null) {
            C7859c cVar = (C7859c) iMessage;
            switch (cVar.getMessageType()) {
                case FANS_CLUB_STATISTICS:
                    ((C6779a) mo8518c()).mo12913a((FansclubStatisticMessage) iMessage);
                    return;
                case FANS_CLUB:
                    C7799af afVar = (C7799af) iMessage;
                    if (afVar.f21449a == 2) {
                        ((C6779a) mo8518c()).mo12914a(afVar);
                        return;
                    }
                    break;
                case FANS_CLUB_REVIEW:
                    ((C6779a) mo8518c()).mo12915a((C7801ag) iMessage);
                    break;
            }
        }
    }
}
