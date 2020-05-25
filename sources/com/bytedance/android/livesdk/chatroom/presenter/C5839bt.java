package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.livesdk.chatroom.api.PkPromotionApi;
import com.bytedance.android.livesdk.chatroom.model.C5715ah;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p064c.p065a.C1673aa;
import p064c.p065a.C2203w;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bt */
public final class C5839bt extends C5868cl<C5840a> implements OnMessageListener {

    /* renamed from: a */
    private Room f15303a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bt$a */
    public interface C5840a extends C6463ay {
        /* renamed from: a */
        void mo11717a(C5715ah ahVar, long j, boolean z);
    }

    public final void onMessage(IMessage iMessage) {
        m12718a(true);
    }

    /* renamed from: a */
    public final void mo8520a(C5840a aVar) {
        super.mo8520a(aVar);
        this.f15303a = (Room) this.f15366s.get("data_room");
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.LINK_MIC_BATTLE_FINISH.getIntType(), this);
        }
        m12718a(false);
    }

    /* renamed from: a */
    private void m12718a(boolean z) {
        ((C4002ac) ((PkPromotionApi) C4514j.m10883j().mo10321b().mo9550a(PkPromotionApi.class)).getCurrentMedal(this.f15303a.getOwner().getId()).mo6513a((C1673aa<? super T, ? extends R>) ((C5840a) mo8518c()).getAutoUnbindTransformer()).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5841bu(this, z), new C5842bv(this));
    }
}
