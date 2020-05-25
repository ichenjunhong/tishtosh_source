package com.bytedance.android.livesdk.chatroom.presenter;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.model.C5743c;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.message.model.C7816au;
import com.bytedance.android.livesdk.message.model.C7824b;
import com.bytedance.android.livesdk.message.model.C7848bq;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.a */
public final class C5774a extends C5868cl<C5775a> implements OnMessageListener {

    /* renamed from: a */
    public final boolean f15221a;

    /* renamed from: b */
    public Room f15222b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.a$a */
    public interface C5775a extends C6463ay {
        /* renamed from: a */
        void mo11665a(C5743c cVar);

        /* renamed from: a */
        void mo11666a(C7816au auVar);

        /* renamed from: a */
        void mo11667a(C7848bq bqVar);
    }

    /* renamed from: a */
    public final void mo8520a(C5775a aVar) {
        super.mo8520a(aVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.D_H5_MESSAGE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.BANNER_UPDATE.getIntType(), this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (mo8518c() != null) {
            if (iMessage instanceof C7816au) {
                C7816au auVar = (C7816au) iMessage;
                if (auVar.f21522b == 1) {
                    ((C5775a) mo8518c()).mo11666a(auVar);
                    return;
                }
            }
            if (iMessage instanceof C7848bq) {
                C7848bq bqVar = (C7848bq) iMessage;
                if (!TextUtils.isEmpty(bqVar.f21684b)) {
                    ((C5775a) mo8518c()).mo11667a(bqVar);
                }
            } else if (iMessage instanceof C7824b) {
                C7824b bVar = (C7824b) iMessage;
                if (bVar.f21538a != null) {
                    ((C5775a) mo8518c()).mo11665a(bVar.f21538a);
                }
            }
        }
    }

    public C5774a(Room room, boolean z) {
        this.f15222b = room;
        this.f15221a = z;
    }
}
