package com.p683ss.android.vesdk.p2535e;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;

/* renamed from: com.ss.android.vesdk.e.b */
public final class C50687b extends C50688c implements SurfaceTextureListener {

    /* renamed from: a */
    public TextureView f127117a;

    /* renamed from: b */
    public SurfaceTextureListener f127118b;

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f127118b != null) {
            this.f127118b.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z;
        if (this.f127118b != null) {
            z = this.f127118b.onSurfaceTextureDestroyed(surfaceTexture);
        } else {
            z = false;
        }
        if (this.f127122e != null) {
            this.f127122e.release();
            this.f127122e = null;
        }
        return z;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f127118b != null) {
            this.f127118b.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
        mo98905a(this.f127122e, 0, i, i2);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f127118b != null) {
            this.f127118b.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
        this.f127120c = i;
        this.f127121d = i2;
        mo98904a(new Surface(surfaceTexture));
    }
}
