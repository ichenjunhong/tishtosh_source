package com.p683ss.android.ugc.aweme.live.alphaplayer;

import android.content.Context;
import android.content.res.TypedArray;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.Surface;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36038g.C36039a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.AlphaVideoView */
public class AlphaVideoView extends GLSurfaceView {

    /* renamed from: a */
    public volatile boolean f92297a;

    /* renamed from: b */
    public C36038g f92298b;

    /* renamed from: c */
    public C36037f f92299c;

    /* renamed from: d */
    public Surface f92300d;

    /* renamed from: e */
    C36039a f92301e = new C36039a() {
        /* renamed from: a */
        public final void mo74755a() {
            if (AlphaVideoView.this.f92300d != null) {
                AlphaVideoView.this.f92300d.release();
            }
            AlphaVideoView.this.f92297a = false;
            AlphaVideoView.this.f92300d = null;
        }

        /* renamed from: a */
        public final void mo74756a(Surface surface) {
            if (AlphaVideoView.this.f92300d != null) {
                AlphaVideoView.this.f92300d.release();
            }
            AlphaVideoView.this.f92300d = surface;
            AlphaVideoView.this.f92297a = true;
            AlphaVideoView.this.f92299c.mo74760a(AlphaVideoView.this.f92300d);
            AlphaVideoView.this.f92299c.mo74758a();
        }
    };

    /* renamed from: f */
    private float f92302f;

    /* renamed from: g */
    private float f92303g;

    /* renamed from: h */
    private C36030a f92304h;

    public C36030a getScaleType() {
        return this.f92304h;
    }

    /* renamed from: a */
    private void m81216a() {
        if (this.f92298b != null) {
            this.f92298b.mo74791a(this.f92301e);
        }
    }

    public void setPlayerController(C36037f fVar) {
        this.f92299c = fVar;
    }

    public void setScaleType(C36030a aVar) {
        this.f92304h = aVar;
        if (this.f92298b != null) {
            this.f92298b.mo74790a(aVar);
        }
    }

    public void setVideoRenderer(C36041i iVar) {
        this.f92298b = iVar;
        setRenderer(iVar);
        m81216a();
        setRenderMode(0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo74748a(this.f92302f, this.f92303g);
    }

    /* renamed from: a */
    public final void mo74748a(float f, float f2) {
        if (f > 0.0f && f2 > 0.0f) {
            this.f92302f = f;
            this.f92303g = f2;
        }
        if (this.f92298b != null) {
            final float measuredWidth = (float) getMeasuredWidth();
            final float measuredHeight = (float) getMeasuredHeight();
            final float f3 = f;
            final float f4 = f2;
            C360101 r1 = new Runnable() {
                public final void run() {
                    AlphaVideoView.this.f92298b.mo74789a(measuredWidth, measuredHeight, f3, f4);
                }
            };
            queueEvent(r1);
        }
    }

    public AlphaVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            setEGLContextClientVersion(2);
            setEGLConfigChooser(8, 8, 8, 8, 16, 0);
            getHolder().setFormat(-3);
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a1l});
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    this.f92298b.mo74792a(string);
                }
                obtainStyledAttributes.recycle();
            }
            m81216a();
            setZOrderOnTop(true);
            setPreserveEGLContextOnPause(true);
        }
    }
}
