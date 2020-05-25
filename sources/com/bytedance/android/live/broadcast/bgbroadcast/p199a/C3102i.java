package com.bytedance.android.live.broadcast.bgbroadcast.p199a;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.widget.C3764d.C3769c;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.floatwindow.C7176g;
import com.bytedance.android.livesdk.floatwindow.C7182h;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.i */
final /* synthetic */ class C3102i implements C3769c {

    /* renamed from: a */
    static final C3769c f9060a = new C3102i();

    private C3102i() {
    }

    /* renamed from: a */
    public final void mo8423a(boolean z) {
        if (!z) {
            C7176g gVar = (C7176g) C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW);
            if (gVar != null && gVar.mo13316c()) {
                float b = (float) C9432q.m18688b(C3922z.m9915e());
                if (((float) gVar.f19485a.mo13311b()) > b - C9432q.m18687b(C3922z.m9915e(), 220.0f)) {
                    gVar.f19485a.mo13312b((int) (b - C9432q.m18687b(C3922z.m9915e(), 220.0f)));
                }
            }
        }
    }
}
