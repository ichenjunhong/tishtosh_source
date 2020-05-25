package com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.widget;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.widget.KeepSurfaceTextureView */
public class KeepSurfaceTextureView extends TextureView {

    /* renamed from: a */
    public SurfaceTexture f90725a;

    /* renamed from: b */
    public Surface f90726b;

    /* renamed from: c */
    public boolean f90727c;

    /* renamed from: d */
    public SurfaceTextureListener f90728d;

    public Surface getSurface() {
        return this.f90726b;
    }

    /* renamed from: a */
    public final void mo73505a() {
        if (this.f90725a != null) {
            this.f90725a.release();
            this.f90725a = null;
        }
        if (this.f90726b != null) {
            this.f90726b.release();
            this.f90726b = null;
        }
    }

    public void setSurfaceTextureListener(SurfaceTextureListener surfaceTextureListener) {
        this.f90728d = surfaceTextureListener;
    }

    public KeepSurfaceTextureView(Context context) {
        this(context, null);
    }

    public void setClipBorder(final float f) {
        if (VERSION.SDK_INT > 20) {
            setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    Rect rect = new Rect();
                    view.getGlobalVisibleRect(rect);
                    outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), f);
                }
            });
            setClipToOutline(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            if (this.f90725a == null || this.f90726b == null || !this.f90726b.isValid()) {
                mo73505a();
            } else if (!this.f90727c) {
                if (this.f90725a != getSurfaceTexture()) {
                    setSurfaceTexture(this.f90725a);
                    this.f90727c = true;
                    if (this.f90728d != null) {
                        this.f90728d.onSurfaceTextureAvailable(this.f90725a, getWidth(), getHeight());
                    }
                } else {
                    mo73505a();
                }
            }
        }
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setSurfaceTextureListener(new SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (KeepSurfaceTextureView.this.f90728d != null) {
                    KeepSurfaceTextureView.this.f90728d.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z = false;
                KeepSurfaceTextureView.this.f90727c = false;
                if (KeepSurfaceTextureView.this.f90728d != null && KeepSurfaceTextureView.this.f90728d.onSurfaceTextureDestroyed(surfaceTexture)) {
                    z = true;
                }
                if (z) {
                    KeepSurfaceTextureView.this.mo73505a();
                }
                return z;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (KeepSurfaceTextureView.this.f90728d != null) {
                    KeepSurfaceTextureView.this.f90728d.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                KeepSurfaceTextureView.this.mo73505a();
                if (KeepSurfaceTextureView.this.f90725a == null) {
                    KeepSurfaceTextureView.this.f90725a = surfaceTexture;
                    KeepSurfaceTextureView.this.f90726b = new Surface(KeepSurfaceTextureView.this.f90725a);
                }
                KeepSurfaceTextureView.this.f90727c = true;
                if (KeepSurfaceTextureView.this.f90728d != null) {
                    KeepSurfaceTextureView.this.f90728d.onSurfaceTextureAvailable(KeepSurfaceTextureView.this.f90725a, i, i2);
                }
            }
        });
    }
}
