package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.model.TaskGiftEvent;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.assets.C7209f;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.message.model.C7793a;
import com.bytedance.android.livesdk.message.model.C7804aj;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.message.model.C7811ap;
import com.bytedance.android.livesdk.message.model.C7944f;
import com.bytedance.android.livesdk.message.model.C8017z;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.p449g.C8745a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedList;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.y */
public final class C5899y extends C5868cl<C5901a> implements OnMessageListener {

    /* renamed from: a */
    public boolean f15431a;

    /* renamed from: b */
    public Room f15432b;

    /* renamed from: c */
    private C1690c f15433c;

    /* renamed from: d */
    private boolean f15434d;

    /* renamed from: e */
    private boolean f15435e;

    /* renamed from: f */
    private boolean f15436f;

    /* renamed from: g */
    private LinkedList<C7810ao> f15437g = new LinkedList<>();

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.y$a */
    public interface C5901a extends C6463ay {
        /* renamed from: a */
        void mo11795a(C7514m mVar);

        /* renamed from: a */
        void mo11796a(C7793a aVar);

        /* renamed from: a */
        void mo11797a(C7810ao aoVar, boolean z);

        /* renamed from: a */
        void mo11798a(C8017z zVar, boolean z);

        /* renamed from: a */
        void mo11799a(List<TaskGiftEvent> list);

        /* renamed from: b */
        void mo11800b(Throwable th);
    }

    /* renamed from: a */
    public final void mo8247a() {
        if (this.f15433c != null && !this.f15433c.isDisposed()) {
            this.f15433c.dispose();
        }
        super.mo8247a();
    }

    public final void onEvent(C8745a aVar) {
        if (aVar.f24023b == 3) {
            this.f15434d = true;
            return;
        }
        if (aVar.f24023b == 4) {
            this.f15434d = false;
        }
    }

    /* renamed from: a */
    public final void mo8520a(C5901a aVar) {
        super.mo8520a(aVar);
        this.f15432b = (Room) this.f15366s.get("data_room");
        this.f15436f = ((Boolean) this.f15366s.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        this.f15435e = ((Boolean) this.f15366s.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.GIFT_UPDATE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.GIFT.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.DOODLE_GIFT.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.FREE_CELL_GIFT_MESSAGE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.ASSET_MESSAGE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.BINDING_GIFT_MESSAGE.getIntType(), this);
        }
        if (this.f15433c != null && !this.f15433c.isDisposed()) {
            this.f15433c.dispose();
        }
        this.f15433c = C4495a.m10823a().mo10300a(C8745a.class).mo6545f((C1710e<? super T>) new C1710e<C8745a>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                C5899y.this.onEvent((C8745a) obj);
            }
        });
    }

    public final void onMessage(IMessage iMessage) {
        if (mo8518c() != null) {
            boolean z = true;
            if (iMessage instanceof C7811ap) {
                int i = ((C7811ap) iMessage).f21507a;
                if (i == 1) {
                    GiftManager.inst().syncGiftList(null, this.f15432b.getId(), 5, this.f15436f);
                } else {
                    if (i == 2) {
                        C7209f.m14962a("effects").mo13427a(5, this.f15436f);
                    }
                }
            } else if (iMessage instanceof C7810ao) {
                C7810ao aoVar = (C7810ao) iMessage;
                C5901a aVar = (C5901a) mo8518c();
                if (this.f15435e || !this.f15434d) {
                    z = false;
                }
                aVar.mo11797a(aoVar, z);
            } else if (iMessage instanceof C8017z) {
                C8017z zVar = (C8017z) iMessage;
                C5901a aVar2 = (C5901a) mo8518c();
                if (this.f15435e || !this.f15434d) {
                    z = false;
                }
                aVar2.mo11798a(zVar, z);
            } else if (iMessage instanceof C7804aj) {
                C7810ao a = C7804aj.m15865a((C7804aj) iMessage);
                if (a != null) {
                    C5901a aVar3 = (C5901a) mo8518c();
                    if (this.f15435e || !this.f15434d) {
                        z = false;
                    }
                    aVar3.mo11797a(a, z);
                }
            } else if (iMessage instanceof C7793a) {
                ((C5901a) mo8518c()).mo11796a((C7793a) iMessage);
            } else if (iMessage instanceof C7944f) {
                C7944f fVar = (C7944f) iMessage;
                if (fVar.f21846a != null) {
                    C5901a aVar4 = (C5901a) mo8518c();
                    C7810ao aoVar2 = fVar.f21846a;
                    if (this.f15435e || !this.f15434d) {
                        z = false;
                    }
                    aVar4.mo11797a(aoVar2, z);
                }
            }
        }
    }
}
