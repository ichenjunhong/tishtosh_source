package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5727ap;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.o */
final /* synthetic */ class C5885o implements C1710e {

    /* renamed from: a */
    private final C5880m f15407a;

    C5885o(C5880m mVar) {
        this.f15407a = mVar;
    }

    public final void accept(Object obj) {
        C5880m mVar = this.f15407a;
        C4177d dVar = (C4177d) obj;
        C3837e.m9742a("ttlive_load_decoration_list_all", 0, mVar.f15395c.mo10722a(), new JSONObject());
        mVar.mo11763a((C5727ap) dVar.data);
    }
}
