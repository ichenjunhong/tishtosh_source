package com.bytedance.android.live.broadcast.widget;

import android.view.SurfaceView;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.p213h.p214a.C3424f;
import com.ss.android.ugc.trill.R;

public class CaptureWidget2 extends AbsCaptureWidget {

    /* renamed from: c */
    C3424f f10397c;

    /* renamed from: d */
    SurfaceView f10398d;

    public int getLayoutId() {
        return R.layout.ar2;
    }

    public void onCreate() {
        super.onCreate();
        this.f10398d = (SurfaceView) this.contentView;
    }

    CaptureWidget2(C3424f fVar, C3048a aVar) {
        super(aVar);
        this.f10397c = fVar;
    }
}
