package com.p683ss.android.ugc.playerkit.videoview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.p683ss.android.ugc.playerkit.p2494c.C50109a;

/* renamed from: com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView */
public class KeepSurfaceTextureView extends TextureView {

    /* renamed from: a */
    public SurfaceTexture f125611a;

    /* renamed from: b */
    public Surface f125612b;

    /* renamed from: c */
    public boolean f125613c;

    /* renamed from: d */
    public SurfaceTextureListener f125614d;

    /* renamed from: e */
    private boolean f125615e;

    public Surface getSurface() {
        return this.f125612b;
    }

    /* renamed from: b */
    public final void mo97905b() {
        m108120a(true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f125615e = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (m108121c()) {
            mo97905b();
        }
        this.f125615e = false;
    }

    /* renamed from: c */
    public static boolean m108121c() {
        if (VERSION.SDK_INT > 19 || !C50109a.m108068s().mo95433n()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo97904a() {
        if (this.f125611a == null || this.f125612b == null || !this.f125612b.isValid()) {
            m108120a(!m108121c());
        } else if (!this.f125613c) {
            if (this.f125611a != getSurfaceTexture()) {
                setSurfaceTexture(this.f125611a);
                this.f125613c = true;
                if (this.f125614d != null) {
                    this.f125614d.onSurfaceTextureAvailable(this.f125611a, getWidth(), getHeight());
                }
            } else {
                m108120a(!m108121c());
            }
        }
    }

    public void setSurfaceTextureListener(SurfaceTextureListener surfaceTextureListener) {
        this.f125614d = surfaceTextureListener;
    }

    public KeepSurfaceTextureView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0 && this.f125615e) {
            mo97904a();
        }
    }

    /* renamed from: a */
    private void m108120a(boolean z) {
        if (this.f125611a != null && z) {
            this.f125611a.release();
            this.f125611a = null;
        }
        if (this.f125612b != null) {
            this.f125612b.release();
            this.f125612b = null;
        }
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setSurfaceTextureListener(new SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (KeepSurfaceTextureView.this.f125614d != null) {
                    KeepSurfaceTextureView.this.f125614d.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z;
                boolean z2 = false;
                KeepSurfaceTextureView.this.f125613c = false;
                if (KeepSurfaceTextureView.this.f125614d == null || !KeepSurfaceTextureView.this.f125614d.onSurfaceTextureDestroyed(surfaceTexture)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && !KeepSurfaceTextureView.m108121c()) {
                    z2 = true;
                }
                if (z2) {
                    KeepSurfaceTextureView.this.mo97905b();
                }
                return z2;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (KeepSurfaceTextureView.this.f125614d != null) {
                    KeepSurfaceTextureView.this.f125614d.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (surfaceTexture != KeepSurfaceTextureView.this.f125611a) {
                    KeepSurfaceTextureView.this.mo97905b();
                }
                if (KeepSurfaceTextureView.this.f125611a == null) {
                    KeepSurfaceTextureView.this.f125611a = surfaceTexture;
                    KeepSurfaceTextureView.this.f125612b = new Surface(KeepSurfaceTextureView.this.f125611a);
                }
                KeepSurfaceTextureView.this.f125613c = true;
                if (KeepSurfaceTextureView.this.f125614d != null) {
                    KeepSurfaceTextureView.this.f125614d.onSurfaceTextureAvailable(KeepSurfaceTextureView.this.f125611a, i, i2);
                }
            }
        });
    }
}
