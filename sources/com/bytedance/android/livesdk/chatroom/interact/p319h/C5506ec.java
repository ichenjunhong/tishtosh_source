package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.presenter.C5868cl;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.message.model.C7829bd;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.ec */
public final class C5506ec extends C5868cl<C5507a> implements OnMessageListener {

    /* renamed from: a */
    LinkCrossRoomDataHolder f14538a = LinkCrossRoomDataHolder.m11103a();

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.ec$a */
    public interface C5507a extends C6463ay {
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
    }

    /* renamed from: a */
    public final void mo8520a(C5507a aVar) {
        super.mo8520a(aVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.LINK_MIC.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (mo8518c() != null && (iMessage instanceof C7829bd)) {
            ((C4002ac) C2201v.m6614b(iMessage).mo6529b(C2168a.m6519a()).mo6541d(C5508ed.f14539a).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9406a(new C5509ee(this), new C5510ef(this));
        }
    }
}
