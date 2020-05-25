package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.event.C5158ad;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.p269aa.C4495a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aw */
final /* synthetic */ class C4853aw implements C1710e {

    /* renamed from: a */
    static final C1710e f13078a = new C4853aw();

    private C4853aw() {
    }

    public final void accept(Object obj) {
        C4177d dVar = (C4177d) obj;
        if (dVar != null && dVar.data != null && ((ShareReportResult) dVar.data).getDeltaIntimacy() > 0) {
            C4495a.m10823a().mo10301a((Object) new C5158ad((ShareReportResult) dVar.data));
        }
    }
}
