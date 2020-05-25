package com.p683ss.android.p1103ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ad.splash.core.video2.BDASplashVideoView */
public class BDASplashVideoView extends FrameLayout implements SurfaceTextureListener, C18716f {

    /* renamed from: a */
    private BDASplashVideoTextureView f51759a;

    /* renamed from: b */
    private C18717g f51760b;

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public Context getApplicationContext() {
        return getContext().getApplicationContext();
    }

    public Surface getSurface() {
        if (this.f51759a != null) {
            return this.f51759a.getSurface();
        }
        return null;
    }

    public void setVideoViewCallback(C18717g gVar) {
        this.f51760b = gVar;
    }

    public BDASplashVideoView(Context context) {
        super(context);
        m45571a(context);
    }

    public void setSurfaceLayoutParams(LayoutParams layoutParams) {
        if (layoutParams != null) {
            this.f51759a.setLayoutParams(layoutParams);
        }
    }

    public void setTextureViewOnTouchListener(OnTouchListener onTouchListener) {
        this.f51759a.setOnTouchListener(onTouchListener);
    }

    /* renamed from: a */
    public final void mo38285a(boolean z) {
        if (this.f51759a != null) {
            this.f51759a.mo38276a(false);
        }
    }

    public void setSurfaceViewVisibility(int i) {
        if (this.f51759a != null) {
            this.f51759a.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m45571a(Context context) {
        this.f51759a = new BDASplashVideoTextureView(context);
        this.f51759a.setSurfaceTextureListener(this);
        addView(this.f51759a, new FrameLayout.LayoutParams(-1, -1));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z;
        this.f51759a.setKeepScreenOn(false);
        BDASplashVideoTextureView bDASplashVideoTextureView = this.f51759a;
        if (!bDASplashVideoTextureView.f51748b || !bDASplashVideoTextureView.f51750d) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public BDASplashVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m45571a(context);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f51759a.setKeepScreenOn(true);
        if (this.f51760b != null) {
            this.f51760b.mo38298a(surfaceTexture, i, i2);
        }
    }

    public BDASplashVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m45571a(context);
    }
}
