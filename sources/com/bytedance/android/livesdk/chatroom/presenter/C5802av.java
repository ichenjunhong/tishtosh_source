package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Message;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5750h;
import com.bytedance.android.livesdk.chatroom.model.C5750h.C5751a;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.av */
final /* synthetic */ class C5802av implements C1710e {

    /* renamed from: a */
    private final C5793ao f15252a;

    C5802av(C5793ao aoVar) {
        this.f15252a = aoVar;
    }

    public final void accept(Object obj) {
        C5793ao aoVar = this.f15252a;
        C4177d dVar = (C4177d) obj;
        if (dVar != null && dVar.data != null && ((C5750h) dVar.data).f15115b != null) {
            List<C5751a> list = ((C5750h) dVar.data).f15115b;
            if (list.size() > 0) {
                C2201v.m6613b((Iterable<? extends T>) list).mo6522a(C5798ar.f15248a).mo6541d(C5799as.f15249a).mo6552k().mo6148a(C1667a.m5940a()).mo6155b(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C5800at<Object>(aoVar), C5801au.f15251a);
                if (((C5750h) dVar.data).f15114a) {
                    aoVar.f15241e += aoVar.f15242f;
                    Message message = new Message();
                    message.what = 100;
                    aoVar.f15238b.sendMessageDelayed(message, 1000);
                }
            }
        }
    }
}
