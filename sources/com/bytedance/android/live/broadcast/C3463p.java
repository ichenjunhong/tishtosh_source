package com.bytedance.android.live.broadcast;

import android.view.SurfaceView;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.ILiveSDKService;

/* renamed from: com.bytedance.android.live.broadcast.p */
final /* synthetic */ class C3463p implements Runnable {

    /* renamed from: a */
    private final C3134c f9905a;

    /* renamed from: b */
    private final SurfaceView f9906b;

    C3463p(C3134c cVar, SurfaceView surfaceView) {
        this.f9905a = cVar;
        this.f9906b = surfaceView;
    }

    public final void run() {
        C3134c cVar = this.f9905a;
        SurfaceView surfaceView = this.f9906b;
        if (!cVar.f10829E) {
            cVar.f9133g.removeAllViews();
            LayoutParams layoutParams = new LayoutParams(((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).linkCrossRoomWidget().mo9598a(), ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).linkCrossRoomWidget().mo9599b());
            if (C3894h.m9842a(cVar.getActivity())) {
                layoutParams.topMargin = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).linkCrossRoomWidget().mo9600c() + C3922z.m9912d();
            } else {
                layoutParams.topMargin = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).linkCrossRoomWidget().mo9600c();
            }
            layoutParams.leftMargin = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).linkCrossRoomWidget().mo9598a();
            surfaceView.setLayoutParams(layoutParams);
            cVar.f9133g.addView(surfaceView);
        }
    }
}
