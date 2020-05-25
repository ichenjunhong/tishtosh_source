package com.p683ss.android.vesdk.p2535e;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

/* renamed from: com.ss.android.vesdk.e.a */
public final class C50686a extends C50688c implements Callback {

    /* renamed from: a */
    public SurfaceView f127116a;

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        mo98906b(surfaceHolder.getSurface());
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f127116a != null) {
            this.f127120c = this.f127116a.getWidth();
            this.f127121d = this.f127116a.getHeight();
        }
        mo98904a(surfaceHolder.getSurface());
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        mo98905a(surfaceHolder.getSurface(), i, i2, i3);
    }
}
