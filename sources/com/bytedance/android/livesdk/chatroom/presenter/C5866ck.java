package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Looper;
import android.os.Message;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.chatroom.p306bl.C5014i;
import com.bytedance.android.livesdk.chatroom.view.C6237c;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.message.model.C7867ch;
import com.bytedance.android.livesdk.message.model.C8008s;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ck */
public final class C5866ck extends C5868cl<C6237c> implements C9382a, OnMessageListener {

    /* renamed from: a */
    private C9381g f15362a = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: b */
    private boolean f15363b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ck$1 */
    static /* synthetic */ class C58671 {

        /* renamed from: a */
        static final /* synthetic */ int[] f15364a = new int[C8629a.values().length];

        static {
            try {
                f15364a[C8629a.USER_SEQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
        this.f15362a = new C9381g(Looper.getMainLooper(), this);
        this.f15363b = false;
    }

    /* renamed from: a */
    public final void mo8520a(C6237c cVar) {
        super.mo8520a(cVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.USER_SEQ.getIntType(), this);
        }
    }

    public final void handleMsg(Message message) {
        int i = message.what;
        if (mo8518c() != null && i == 24) {
            if (message.obj instanceof Exception) {
                Object obj = message.obj;
            } else if (message.obj instanceof C4175b) {
                C4175b bVar = (C4175b) message.obj;
                if (bVar.data instanceof CurrentRankListResponse) {
                    CurrentRankListResponse currentRankListResponse = (CurrentRankListResponse) bVar.data;
                    int i2 = (int) currentRankListResponse.total;
                    ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).updateGameMsgViewUserCount(i2);
                    ((C6237c) mo8518c()).mo12295a(i2);
                    if (!C9376b.m18558a((Collection<T>) currentRankListResponse.ranks) || !C9376b.m18558a((Collection<T>) currentRankListResponse.seats)) {
                        ((C6237c) mo8518c()).mo12296a(currentRankListResponse.seats, currentRankListResponse.ranks);
                    } else {
                        return;
                    }
                }
            }
            this.f15363b = false;
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (!(mo8518c() == null || iMessage == null || !(iMessage instanceof C7859c))) {
            if (C58671.f15364a[((C7859c) iMessage).getMessageType().ordinal()] == 1 && (iMessage instanceof C7867ch)) {
                C7867ch chVar = (C7867ch) iMessage;
                int i = (int) chVar.f21779a;
                ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).updateGameMsgViewUserCount(i);
                ((C6237c) mo8518c()).mo12295a(i);
                if (chVar.f21780b != null || i >= 0) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    if (!C9376b.m18558a((Collection<T>) chVar.f21782d)) {
                        for (C8008s sVar : chVar.f21782d) {
                            if (sVar != null) {
                                C8219f fVar = new C8219f();
                                fVar.f22442a = sVar.f21910a;
                                fVar.f22443b = sVar.f21911b;
                                fVar.f22444c = (int) sVar.f21912c;
                                fVar.f22446e = sVar.f21913d;
                                arrayList2.add(fVar);
                            }
                        }
                    }
                    if (!C9376b.m18558a((Collection<T>) chVar.f21780b)) {
                        for (C8008s sVar2 : chVar.f21780b) {
                            if (sVar2 != null) {
                                C8219f fVar2 = new C8219f();
                                fVar2.f22442a = sVar2.f21910a;
                                fVar2.f22443b = sVar2.f21911b;
                                fVar2.f22444c = (int) sVar2.f21912c;
                                fVar2.f22446e = sVar2.f21913d;
                                arrayList.add(fVar2);
                            }
                        }
                    }
                    ((C6237c) mo8518c()).mo12296a(arrayList2, arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11749a(long j, long j2, int i) {
        if (!this.f15363b) {
            this.f15363b = true;
            C5014i.m11509a(this.f15362a, j, j2, 18);
        }
    }
}
