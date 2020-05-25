package com.p683ss.android.p1103ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;

/* renamed from: com.ss.android.ad.splash.core.video2.BDASplashVideoTextureView */
public class BDASplashVideoTextureView extends TextureView {

    /* renamed from: a */
    public SurfaceTextureListener f51747a;

    /* renamed from: b */
    public boolean f51748b;

    /* renamed from: c */
    public boolean f51749c;

    /* renamed from: d */
    public boolean f51750d;

    /* renamed from: e */
    public boolean f51751e;

    /* renamed from: f */
    public Surface f51752f;

    /* renamed from: g */
    public SurfaceTexture f51753g;

    /* renamed from: h */
    private final String f51754h;

    /* renamed from: i */
    private Context f51755i;

    /* renamed from: j */
    private int f51756j;

    /* renamed from: k */
    private int f51757k;

    public Surface getSurface() {
        return this.f51752f;
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setSurfaceTextureListener(SurfaceTextureListener surfaceTextureListener) {
        this.f51747a = surfaceTextureListener;
    }

    public BDASplashVideoTextureView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo38276a(boolean z) {
        if (z && this.f51748b) {
            if (this.f51753g != null) {
                this.f51753g.release();
                this.f51753g = null;
            }
            if (this.f51752f != null) {
                this.f51752f.release();
                this.f51752f = null;
            }
        }
        this.f51749c = false;
        this.f51750d = false;
        this.f51752f = null;
        this.f51753g = null;
    }

    public BDASplashVideoTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51754h = "TextureVideoView";
        this.f51748b = true;
        this.f51755i = context;
        DisplayMetrics displayMetrics = this.f51755i.getResources().getDisplayMetrics();
        this.f51757k = displayMetrics.heightPixels;
        this.f51756j = displayMetrics.widthPixels;
        super.setSurfaceTextureListener(new SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (BDASplashVideoTextureView.this.f51747a != null) {
                    BDASplashVideoTextureView.this.f51747a.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z;
                if (BDASplashVideoTextureView.this.f51748b && !BDASplashVideoTextureView.this.f51749c && BDASplashVideoTextureView.this.f51752f != null) {
                    BDASplashVideoTextureView.this.f51752f.release();
                    BDASplashVideoTextureView.this.f51752f = null;
                    BDASplashVideoTextureView.this.f51753g = null;
                }
                BDASplashVideoTextureView.this.f51751e = false;
                if (BDASplashVideoTextureView.this.f51747a == null || !BDASplashVideoTextureView.this.f51747a.onSurfaceTextureDestroyed(surfaceTexture)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    BDASplashVideoTextureView.this.mo38276a(false);
                }
                return z;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (BDASplashVideoTextureView.this.f51747a != null) {
                    BDASplashVideoTextureView.this.f51747a.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (BDASplashVideoTextureView.this.f51748b) {
                    BDASplashVideoTextureView.this.f51750d = true;
                    if (BDASplashVideoTextureView.this.f51752f != null && (!BDASplashVideoTextureView.this.f51749c || !BDASplashVideoTextureView.this.f51752f.isValid())) {
                        BDASplashVideoTextureView.this.f51752f.release();
                        BDASplashVideoTextureView.this.f51752f = null;
                        BDASplashVideoTextureView.this.f51753g = null;
                    }
                    if (BDASplashVideoTextureView.this.f51752f == null) {
                        BDASplashVideoTextureView.this.f51752f = new Surface(surfaceTexture);
                        BDASplashVideoTextureView.this.f51753g = surfaceTexture;
                    } else {
                        try {
                            if (VERSION.SDK_INT >= 16) {
                                if (BDASplashVideoTextureView.this.f51753g != null) {
                                    BDASplashVideoTextureView.this.setSurfaceTexture(BDASplashVideoTextureView.this.f51753g);
                                }
                            } else if (BDASplashVideoTextureView.this.f51753g != null) {
                                BDASplashVideoTextureView.this.f51752f = new Surface(surfaceTexture);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    BDASplashVideoTextureView.this.f51751e = true;
                    BDASplashVideoTextureView.this.f51749c = true;
                } else {
                    BDASplashVideoTextureView.this.f51752f = new Surface(surfaceTexture);
                    BDASplashVideoTextureView.this.f51753g = surfaceTexture;
                }
                if (BDASplashVideoTextureView.this.f51747a != null) {
                    BDASplashVideoTextureView.this.f51747a.onSurfaceTextureAvailable(BDASplashVideoTextureView.this.f51753g, i, i2);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
