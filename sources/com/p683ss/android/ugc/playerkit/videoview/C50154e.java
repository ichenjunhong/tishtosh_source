package com.p683ss.android.ugc.playerkit.videoview;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.playerkit.videoview.e */
public final class C50154e implements C50159h {

    /* renamed from: a */
    public boolean f125667a;

    /* renamed from: b */
    public Set<C50161j> f125668b;

    /* renamed from: c */
    public int f125669c;

    /* renamed from: d */
    public int f125670d;

    /* renamed from: e */
    private final SurfaceView f125671e;

    /* renamed from: f */
    private boolean f125672f;

    /* renamed from: a */
    public final View mo97949a() {
        return this.f125671e;
    }

    /* renamed from: c */
    public final boolean mo97954c() {
        return this.f125667a;
    }

    /* renamed from: d */
    public final void mo97955d() {
    }

    /* renamed from: e */
    public final void mo97956e() {
    }

    /* renamed from: f */
    public final void mo97957f() {
    }

    /* renamed from: g */
    public final int mo97958g() {
        return 1;
    }

    /* renamed from: h */
    public final boolean mo97959h() {
        return this.f125672f;
    }

    /* renamed from: b */
    public final Surface mo97952b() {
        return this.f125671e.getHolder().getSurface();
    }

    /* renamed from: a */
    public final void mo97950a(C50161j jVar) {
        this.f125668b.add(jVar);
    }

    /* renamed from: b */
    public final void mo97953b(C50161j jVar) {
        this.f125668b.remove(jVar);
    }

    /* renamed from: a */
    public final void mo97951a(boolean z) {
        this.f125672f = z;
    }

    public C50154e(ViewGroup viewGroup) {
        this.f125671e = new SurfaceView(viewGroup.getContext());
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(this.f125671e, 0, new LayoutParams(-1, -1, 17));
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            viewGroup.addView(this.f125671e, 0, layoutParams);
        } else {
            viewGroup.addView(this.f125671e, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f125668b = new LinkedHashSet();
        this.f125671e.getHolder().addCallback(new Callback() {
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                C50154e.this.f125667a = false;
                for (C50161j aD_ : C50154e.this.f125668b) {
                    aD_.aD_();
                }
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C50154e.this.f125667a = true;
                for (C50161j a : C50154e.this.f125668b) {
                    a.mo54503a(C50154e.this.f125669c, C50154e.this.f125670d);
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C50154e.this.f125669c = i2;
                C50154e.this.f125670d = i3;
                for (C50161j b : C50154e.this.f125668b) {
                    b.mo54505b(i2, i3);
                }
            }
        });
    }
}
