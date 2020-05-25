package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.imagepipeline.p970j.C14045f;

/* renamed from: com.ss.android.ugc.aweme.base.ui.CircleImageView */
public class CircleImageView extends AnimatedImageView {

    /* renamed from: e */
    public volatile boolean f62914e = true;

    /* renamed from: f */
    private Paint f62915f = new Paint();

    /* renamed from: g */
    private Bitmap f62916g;

    /* renamed from: h */
    private Drawable f62917h;

    /* renamed from: i */
    private BitmapShader f62918i;

    /* renamed from: j */
    private Canvas f62919j;

    /* renamed from: k */
    private int f62920k;

    /* renamed from: l */
    private boolean f62921l = false;

    /* renamed from: m */
    private C13791d<C14045f> f62922m = new C13790c<C14045f>() {
        public final void onFailure(String str, Throwable th) {
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        }

        public final void onRelease(String str) {
        }

        public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            CircleImageView.this.f62914e = true;
        }
    };

    public C13791d<C14045f> getControllerListener() {
        return this.f62922m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo48929a() {
        super.mo48929a();
        C13837e eVar = new C13837e();
        eVar.mo25937a(true);
        ((C13833a) getHierarchy()).mo25899a(eVar);
        ((C13833a) getHierarchy()).mo25898a(C13818b.f36067g);
        mo82245d();
    }

    /* renamed from: d */
    private void mo82245d() {
        Config config;
        if (this.f62921l) {
            this.f62917h = getDrawable();
            if (this.f62917h != null && getWidth() > 0 && getHeight() > 0) {
                if (this.f62917h.getOpacity() != -1) {
                    config = Config.ARGB_8888;
                } else {
                    config = Config.RGB_565;
                }
                int intrinsicWidth = this.f62917h.getIntrinsicWidth();
                int intrinsicHeight = this.f62917h.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                if (this.f62916g != null) {
                    if (intrinsicWidth == this.f62916g.getWidth() && intrinsicHeight == this.f62916g.getHeight()) {
                        if (this.f62919j != null) {
                            this.f62919j.drawColor(0, Mode.CLEAR);
                        }
                        return;
                    } else if (!this.f62916g.isRecycled()) {
                        this.f62916g.recycle();
                    }
                }
                this.f62920k = intrinsicWidth / 2;
                this.f62916g = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                this.f62919j = new Canvas(this.f62916g);
                this.f62917h.setBounds(0, 0, this.f62919j.getWidth(), this.f62919j.getHeight());
                Bitmap bitmap = this.f62916g;
                TileMode tileMode = TileMode.CLAMP;
                this.f62918i = new BitmapShader(bitmap, tileMode, tileMode);
                this.f62915f.setAntiAlias(true);
                this.f62915f.setShader(this.f62918i);
            }
        }
    }

    public void setController(C13842a aVar) {
        if (this.f62921l) {
            this.f62914e = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    public CircleImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f62921l) {
            if (this.f62914e) {
                mo82245d();
                this.f62914e = false;
            }
            if (!(this.f62917h == null || this.f62919j == null)) {
                this.f62917h.draw(this.f62919j);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f62920k, this.f62915f);
            return;
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    public final void mo48984a(boolean z, boolean z2) {
        this.f62921l = z;
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircleImageView(Context context, C13833a aVar) {
        super(context, aVar);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo82245d();
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
