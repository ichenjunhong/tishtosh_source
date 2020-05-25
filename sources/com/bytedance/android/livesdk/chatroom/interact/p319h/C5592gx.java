package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.browser.jsbridge.p296a.C4763a;
import com.bytedance.android.livesdk.browser.jsbridge.p296a.C4768f;
import com.bytedance.android.livesdk.chatroom.presenter.C5868cl;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.message.model.C7825ba;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashSet;
import java.util.Set;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.gx */
public final class C5592gx extends C5868cl<C5593a> implements OnMessageListener {

    /* renamed from: a */
    LinkCrossRoomDataHolder f14670a = LinkCrossRoomDataHolder.m11103a();

    /* renamed from: b */
    private Set<C8629a> f14671b = new HashSet();

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.gx$a */
    public interface C5593a extends C6463ay {
        /* renamed from: a */
        void mo11487a();

        /* renamed from: a */
        void mo11488a(int i);
    }

    public final void onEvent(C4763a aVar) {
        ((C5593a) mo8518c()).mo11488a(aVar.f12965a);
    }

    /* renamed from: a */
    public final void mo8520a(C5593a aVar) {
        super.mo8520a(aVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.LINK_MIC_BATTLE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.LINK_MIC_BATTLE_TASK.getIntType(), this);
        }
        ((C4002ac) C4495a.m10823a().mo10300a(C4763a.class).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9405a((C1710e<? super T>) new C5594gy<Object>(this));
        ((C4002ac) C4495a.m10823a().mo10300a(C4768f.class).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9405a((C1710e<? super T>) new C5595gz<Object>(this));
    }

    public final void onEvent(C4768f fVar) {
        for (C8629a aVar : this.f14671b) {
            if (!fVar.mo10591a().contains(aVar)) {
                if (this.f15367t != null) {
                    this.f15367t.removeMessageListener(aVar.getIntType(), this);
                }
                this.f14671b.remove(aVar);
            }
        }
        for (C8629a aVar2 : fVar.mo10591a()) {
            if (!this.f14671b.contains(aVar2)) {
                if (this.f15367t != null) {
                    this.f15367t.addMessageListener(aVar2.getIntType(), this);
                }
                this.f14671b.add(aVar2);
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (mo8518c() != null) {
            if (iMessage instanceof C7825ba) {
                ((C5593a) mo8518c()).mo11487a();
                this.f14671b.clear();
                return;
            }
            ((C4002ac) C2201v.m6614b(iMessage).mo6529b(C2168a.m6519a()).mo6541d(C5597ha.f14685a).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9406a(new C5598hb(this), new C5599hc(this));
        }
    }
}
