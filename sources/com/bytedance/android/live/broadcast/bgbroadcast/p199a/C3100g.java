package com.bytedance.android.live.broadcast.bgbroadcast.p199a;

import android.os.Build.VERSION;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.widget.C3786r;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.floatwindow.C7182h;
import com.bytedance.android.livesdk.floatwindow.C7184i;
import com.bytedance.android.livesdk.p272ad.C4525b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g */
final /* synthetic */ class C3100g implements C1710e {

    /* renamed from: a */
    private final C3089f f9058a;

    C3100g(C3089f fVar) {
        this.f9058a = fVar;
    }

    public final void accept(Object obj) {
        C3089f fVar = this.f9058a;
        Long l = (Long) obj;
        if (fVar.f9066c != null && C7184i.m14909a(fVar.f9066c) && (VERSION.SDK_INT < 17 || !fVar.f9066c.isDestroyed())) {
            boolean z = false;
            if (((Integer) LiveSettingKeys.LIVE_ENABLE_TT_CAPTURE.mo9431a()).intValue() != 1 || fVar.f9033e == null || !fVar.f9033e.isShowing() || !fVar.f9037i) {
                if (C7182h.m14893a("control_view") != null) {
                    C7182h.m14893a("control_view").mo13314a();
                    C3786r rVar = (C3786r) C7182h.m14893a("control_view").mo13317d();
                    if (rVar != null) {
                        if (((Integer) C4525b.f12363af.mo10345a()).intValue() != 1) {
                            z = true;
                        }
                        rVar.setMsgBtn(z);
                    }
                    fVar.mo8401j();
                }
                if (C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW) != null) {
                    if (((Integer) C4525b.f12363af.mo10345a()).intValue() == 1) {
                        C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW).mo13315b();
                        return;
                    }
                    C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW).mo13314a();
                }
            } else {
                fVar.f9037i = false;
            }
        }
    }
}
