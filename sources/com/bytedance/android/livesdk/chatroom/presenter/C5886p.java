package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdk.chatroom.C4962a;
import com.bytedance.android.livesdk.chatroom.model.C5727ap;
import com.bytedance.android.livesdk.p399o.p400a.C8029a;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.p */
final /* synthetic */ class C5886p implements C1710e {

    /* renamed from: a */
    private final C5880m f15408a;

    C5886p(C5880m mVar) {
        this.f15408a = mVar;
    }

    public final void accept(Object obj) {
        C5880m mVar = this.f15408a;
        Throwable th = (Throwable) obj;
        C4962a aVar = mVar.f15395c;
        String message = th.getMessage();
        aVar.mo10722a();
        JSONObject jSONObject = new JSONObject();
        C4962a.m9730a(jSONObject, "error_code", 1);
        C4962a.m9731a(jSONObject, "error_msg", message);
        C3837e.m9749b("ttlive_load_decoration_list_all", 1, jSONObject);
        C3837e.m9744a("ttlive_load_decoration_list_error", 1, jSONObject);
        C8029a.m15933a().mo14190a(C8030b.Room.info, "ttlive_load_decoration_list", 1, jSONObject);
        mVar.mo11763a((C5727ap) null);
    }
}
