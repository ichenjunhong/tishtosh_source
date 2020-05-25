package com.p683ss.android.ugc.aweme.views;

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
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.imagepipeline.p970j.C14045f;

/* renamed from: com.ss.android.ugc.aweme.views.CircleDraweeView */
public class CircleDraweeView extends AnimateDraweeView {

    /* renamed from: a */
    public volatile boolean f121023a = true;

    /* renamed from: b */
    private Paint f121024b = new Paint();

    /* renamed from: c */
    private Bitmap f121025c;

    /* renamed from: d */
    private Drawable f121026d;

    /* renamed from: e */
    private BitmapShader f121027e;

    /* renamed from: f */
    private Canvas f121028f;

    /* renamed from: g */
    private int f121029g;

    /* renamed from: h */
    private boolean f121030h = false;

    /* renamed from: i */
    private C13791d<C14045f> f121031i = new C13790c<C14045f>() {
        public final void onFailure(String str, Throwable th) {
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        }

        public final void onRelease(String str) {
        }

        public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            CircleDraweeView.this.f121023a = true;
        }
    };

    /* renamed from: a */
    private void m104347a() {
        Config config;
        if (this.f121030h) {
            this.f121026d = getDrawable();
            if (this.f121026d != null && getWidth() > 0 && getHeight() > 0) {
                if (this.f121026d.getOpacity() != -1) {
                    config = Config.ARGB_8888;
                } else {
                    config = Config.RGB_565;
                }
                int intrinsicWidth = this.f121026d.getIntrinsicWidth();
                int intrinsicHeight = this.f121026d.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                if (this.f121025c != null) {
                    if (intrinsicWidth == this.f121025c.getWidth() && intrinsicHeight == this.f121025c.getHeight()) {
                        if (this.f121028f != null) {
                            this.f121028f.drawColor(0, Mode.CLEAR);
                        }
                        return;
                    } else if (!this.f121025c.isRecycled()) {
                        this.f121025c.recycle();
                    }
                }
                this.f121029g = intrinsicWidth / 2;
                this.f121025c = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                this.f121028f = new Canvas(this.f121025c);
                this.f121026d.setBounds(0, 0, this.f121028f.getWidth(), this.f121028f.getHeight());
                Bitmap bitmap = this.f121025c;
                TileMode tileMode = TileMode.CLAMP;
                this.f121027e = new BitmapShader(bitmap, tileMode, tileMode);
                this.f121024b.setAntiAlias(true);
                this.f121024b.setShader(this.f121027e);
            }
        }
    }

    public void setController(C13842a aVar) {
        if (this.f121030h) {
            this.f121023a = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    public CircleDraweeView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f121030h) {
            if (this.f121023a) {
                m104347a();
                this.f121023a = false;
            }
            if (!(this.f121026d == null || this.f121028f == null)) {
                this.f121026d.draw(this.f121028f);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f121029g, this.f121024b);
            return;
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    public final void mo95488a(boolean z, boolean z2) {
        this.f121030h = z;
        if (z2) {
            post(new C48185d(this));
        }
    }

    public CircleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircleDraweeView(Context context, C13833a aVar) {
        super(context, aVar);
    }

    public CircleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m104347a();
    }
}
