package com.zego.p2623ve;

import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;

/* renamed from: com.zego.ve.VTextureViewListener */
public class VTextureViewListener implements SurfaceTextureListener {
    private final Object lock = new Object();
    private TextureView mView;
    private long pthis;

    private static native int on_surface_texture_changed(long j, SurfaceTexture surfaceTexture, int i, int i2);

    private static native int on_surface_texture_created(long j, SurfaceTexture surfaceTexture, int i, int i2);

    private static native int on_surface_texture_destroyed(long j, SurfaceTexture surfaceTexture);

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public boolean isAvailable() {
        if (this.mView == null || !this.mView.isAvailable()) {
            return false;
        }
        return true;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        synchronized (this.lock) {
            if (this.pthis != 0) {
                on_surface_texture_destroyed(this.pthis, surfaceTexture);
            }
        }
        return true;
    }

    public int setThis(long j, TextureView textureView) {
        synchronized (this.lock) {
            if (this.mView != null && this.mView.getSurfaceTextureListener().equals(this)) {
                this.mView.setSurfaceTextureListener(null);
            }
            if (textureView != null) {
                textureView.setSurfaceTextureListener(this);
            }
            this.pthis = j;
            this.mView = textureView;
        }
        return 0;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this.lock) {
            if (this.pthis != 0) {
                if (VERSION.SDK_INT >= 15) {
                    surfaceTexture.setDefaultBufferSize(i, i2);
                }
                on_surface_texture_created(this.pthis, surfaceTexture, i, i2);
            }
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this.lock) {
            if (this.pthis != 0) {
                on_surface_texture_changed(this.pthis, surfaceTexture, i, i2);
            }
        }
    }
}
