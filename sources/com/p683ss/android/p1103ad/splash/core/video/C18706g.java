package com.p683ss.android.p1103ad.splash.core.video;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ad.splash.core.video.g */
public final class C18706g implements Callback {

    /* renamed from: a */
    WeakReference<Callback> f51746a;

    public C18706g(Callback callback) {
        this.f51746a = new WeakReference<>(callback);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Callback callback = (Callback) this.f51746a.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Callback callback = (Callback) this.f51746a.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Callback callback = (Callback) this.f51746a.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }
}
