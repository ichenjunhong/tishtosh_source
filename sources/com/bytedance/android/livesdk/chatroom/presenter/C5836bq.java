package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5772z;
import com.bytedance.android.livesdk.chatroom.presenter.C5821bf.C5824b;
import com.bytedance.android.livesdk.chatroom.presenter.C5821bf.C5825c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bq */
public final /* synthetic */ class C5836bq implements C1710e {

    /* renamed from: a */
    private final C5821bf f15299a;

    /* renamed from: b */
    private final C5825c f15300b;

    public C5836bq(C5821bf bfVar, C5825c cVar) {
        this.f15299a = bfVar;
        this.f15300b = cVar;
    }

    public final void accept(Object obj) {
        C5821bf bfVar = this.f15299a;
        C5825c cVar = this.f15300b;
        C4177d dVar = (C4177d) obj;
        cVar.f15284a.f21629x = (C5772z) dVar.data;
        bfVar.mo11705b(cVar.f15284a);
        ((C5824b) bfVar.mo8518c()).mo11715c();
        HashMap hashMap = new HashMap();
        hashMap.put("is_success", ((C5772z) dVar.data).f15212a ? "1" : "0");
        hashMap.put("money", String.valueOf(((C5772z) dVar.data).f15216e));
        hashMap.put("redpackage_type", cVar.f15284a.f21609d > 0 ? "countdown_five" : "immediate");
        if (cVar.f15284a.f21610e <= 1) {
            hashMap.put("redpackage_content", cVar.f15284a.f21610e == 1 ? "gift_redpackage" : "lucky_redpackage");
        }
        if (!(bfVar.f15274a.getOwner() == null || cVar.f15284a.f21606a == null)) {
            hashMap.put("is_anchor", bfVar.f15274a.getOwner().getId() == cVar.f15284a.f21606a.getId() ? "1" : "0");
        }
        C8049c a = C8049c.m15979a();
        String str = "redpackage_grab";
        Object[] objArr = new Object[3];
        objArr[0] = new C8059j().mo14213a(bfVar.f15275b ? "live_take_detail" : "live_detail").mo14217e(bfVar.f15276c).mo14218f("other").mo14214b("live_function").mo14215c("popup");
        objArr[1] = new C8060k();
        objArr[2] = Room.class;
        a.mo14202a(str, hashMap, objArr);
    }
}
