package com.p683ss.android.ugc.playerkit.videoview;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.playerkit.videoview.f */
public final class C50156f implements C50159h {

    /* renamed from: a */
    public Set<C50161j> f125674a = new LinkedHashSet(1);

    /* renamed from: b */
    public boolean f125675b;

    /* renamed from: c */
    private final KeepSurfaceTextureView f125676c;

    /* renamed from: a */
    public final View mo97949a() {
        return this.f125676c;
    }

    /* renamed from: a */
    public final void mo97951a(boolean z) {
    }

    /* renamed from: e */
    public final void mo97956e() {
        this.f125675b = true;
    }

    /* renamed from: f */
    public final void mo97957f() {
        this.f125675b = false;
    }

    /* renamed from: g */
    public final int mo97958g() {
        return 0;
    }

    /* renamed from: h */
    public final boolean mo97959h() {
        return false;
    }

    /* renamed from: b */
    public final Surface mo97952b() {
        return this.f125676c.getSurface();
    }

    /* renamed from: c */
    public final boolean mo97954c() {
        return this.f125676c.f125613c;
    }

    /* renamed from: d */
    public final void mo97955d() {
        this.f125676c.mo97904a();
    }

    /* renamed from: i */
    private void m108224i() {
        this.f125676c.setSurfaceTextureListener(new SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                Iterator it = C50156f.this.f125674a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                for (C50161j aD_ : C50156f.this.f125674a) {
                    aD_.aD_();
                }
                if (!C50156f.this.f125675b) {
                    return true;
                }
                return false;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C50156f.this.f125675b = false;
                for (C50161j a : C50156f.this.f125674a) {
                    a.mo54503a(i, i2);
                }
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                for (C50161j b : C50156f.this.f125674a) {
                    b.mo54505b(i, i2);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo97950a(C50161j jVar) {
        this.f125674a.add(jVar);
    }

    /* renamed from: b */
    public final void mo97953b(C50161j jVar) {
        this.f125674a.remove(jVar);
    }

    public C50156f(KeepSurfaceTextureView keepSurfaceTextureView) {
        this.f125676c = keepSurfaceTextureView;
        m108224i();
    }

    public C50156f(ViewGroup viewGroup) {
        this.f125676c = new KeepSurfaceTextureView(viewGroup.getContext());
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(this.f125676c, 0, new LayoutParams(-1, -1, 17));
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            viewGroup.addView(this.f125676c, 0, layoutParams);
        } else {
            viewGroup.addView(this.f125676c, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        m108224i();
    }
}
