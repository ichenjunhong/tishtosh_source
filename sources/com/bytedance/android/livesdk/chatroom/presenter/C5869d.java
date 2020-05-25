package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C5167am;
import com.bytedance.android.livesdk.chatroom.event.C5168an;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.chatroom.presenter.C5807b.C5809a;
import com.bytedance.android.livesdk.message.model.C8001m;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.message.C8845b;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.android.livesdkapi.message.C8853i;
import com.bytedance.common.utility.p522b.C9376b;
import java.util.Collection;
import java.util.Iterator;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.d */
final /* synthetic */ class C5869d implements C1710e {

    /* renamed from: a */
    private final C5807b f15368a;

    /* renamed from: b */
    private final C5168an f15369b;

    C5869d(C5807b bVar, C5168an anVar) {
        this.f15368a = bVar;
        this.f15369b = anVar;
    }

    public final void accept(Object obj) {
        C5807b bVar = this.f15368a;
        C4177d dVar = (C4177d) obj;
        C4495a.m10823a().mo10301a((Object) new C5167am(this.f15369b, true));
        bVar.f15258b = true;
        if (bVar.mo8518c() != null) {
            ChatResult chatResult = (ChatResult) dVar.data;
            long id = bVar.f15259c.getId();
            User user = chatResult.getUser();
            C8001m mVar = new C8001m();
            mVar.f21868a = chatResult.getMsgId();
            C8845b bVar2 = new C8845b();
            bVar2.f24132c = id;
            bVar2.f24133d = chatResult.getMsgId();
            bVar2.f24136g = true;
            bVar2.f24139j = chatResult.getDisplayText();
            mVar.baseMessage = bVar2;
            C8851g displayText = chatResult.getDisplayText();
            User user2 = null;
            if (displayText != null && !C9376b.m18558a((Collection<T>) displayText.f24158d)) {
                Iterator it = displayText.f24158d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C8853i iVar = (C8853i) it.next();
                    if (!(iVar.f24165d == null || iVar.f24165d.f24174a == null)) {
                        if (iVar.f24165d.f24174a.getId() == TTLiveSDKContext.getHostService().mo10315h().mo14529b()) {
                            user2 = iVar.f24165d.f24174a;
                            break;
                        }
                    }
                }
            }
            mVar.f21872e = chatResult.getBackground();
            mVar.f21869b = chatResult.getContent();
            mVar.f21873f = chatResult.getFullScreenTextColor();
            if (user2 != null) {
                mVar.f21870c = user2;
            } else if (user != null) {
                mVar.f21870c = user;
            } else {
                mVar.f21870c = User.from(TTLiveSDKContext.getHostService().mo10315h().mo14521a());
            }
            mVar.f21874g = String.valueOf(chatResult.getMsgId());
            ((C5809a) bVar.mo8518c()).mo11691a(mVar);
        }
    }
}
