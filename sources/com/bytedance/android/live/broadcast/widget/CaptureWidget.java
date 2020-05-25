package com.bytedance.android.live.broadcast.widget;

import android.opengl.GLSurfaceView;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.p213h.p214a.C3424f;
import com.ss.android.ugc.trill.R;

public class CaptureWidget extends AbsCaptureWidget {

    /* renamed from: d */
    C3424f f10395d;

    /* renamed from: e */
    GLSurfaceView f10396e;

    public int getLayoutId() {
        return R.layout.ar1;
    }

    public void onCreate() {
        super.onCreate();
        this.f10396e = (GLSurfaceView) this.contentView;
    }

    CaptureWidget(C3424f fVar, C3048a aVar) {
        super(aVar);
        this.f10395d = fVar;
    }
}
