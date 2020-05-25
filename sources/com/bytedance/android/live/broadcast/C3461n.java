package com.bytedance.android.live.broadcast;

import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.ILiveSDKService;

/* renamed from: com.bytedance.android.live.broadcast.n */
final /* synthetic */ class C3461n implements Runnable {

    /* renamed from: a */
    private final C3134c f9903a;

    C3461n(C3134c cVar) {
        this.f9903a = cVar;
    }

    public final void run() {
        C3134c cVar = this.f9903a;
        if (!cVar.f10829E) {
            LayoutParams layoutParams = (LayoutParams) cVar.f9132f.getLayoutParams();
            layoutParams.width = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).linkCrossRoomWidget().mo9598a();
            layoutParams.height = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).linkCrossRoomWidget().mo9599b();
            layoutParams.gravity = 3;
            if (C3894h.m9842a(cVar.getContext())) {
                layoutParams.topMargin = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).linkCrossRoomWidget().mo9600c() + C3922z.m9912d();
            } else {
                layoutParams.topMargin = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).linkCrossRoomWidget().mo9600c();
            }
            cVar.f9132f.setLayoutParams(layoutParams);
            if (cVar.f9145s != null) {
                cVar.f9145s.mo8501a(true);
            }
        }
    }
}
