package com.p683ss.android.ugc.tools.view.widget;

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
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p970j.C14045f;

/* renamed from: com.ss.android.ugc.tools.view.widget.CircleImageView */
public class CircleImageView extends SimpleDraweeView {

    /* renamed from: a */
    public volatile boolean f125968a = true;

    /* renamed from: b */
    private Paint f125969b = new Paint();

    /* renamed from: c */
    private Bitmap f125970c;

    /* renamed from: d */
    private Drawable f125971d;

    /* renamed from: e */
    private BitmapShader f125972e;

    /* renamed from: f */
    private Canvas f125973f;

    /* renamed from: g */
    private int f125974g;

    /* renamed from: h */
    private boolean f125975h = false;

    /* renamed from: i */
    private C13791d<C14045f> f125976i = new C13790c<C14045f>() {
        public final void onFailure(String str, Throwable th) {
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        }

        public final void onRelease(String str) {
        }

        public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            CircleImageView.this.f125968a = true;
        }
    };

    public C13791d<C14045f> getControllerListener() {
        return this.f125976i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo98118a() {
        C13837e eVar = new C13837e();
        eVar.mo25937a(true);
        ((C13833a) getHierarchy()).mo25899a(eVar);
        ((C13833a) getHierarchy()).mo25898a(C13818b.f36067g);
        m108482b();
    }

    /* renamed from: b */
    private void m108482b() {
        Config config;
        if (this.f125975h) {
            this.f125971d = getDrawable();
            if (this.f125971d != null && getWidth() > 0 && getHeight() > 0) {
                if (this.f125971d.getOpacity() != -1) {
                    config = Config.ARGB_8888;
                } else {
                    config = Config.RGB_565;
                }
                int intrinsicWidth = this.f125971d.getIntrinsicWidth();
                int intrinsicHeight = this.f125971d.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                if (this.f125970c != null) {
                    if (intrinsicWidth == this.f125970c.getWidth() && intrinsicHeight == this.f125970c.getHeight()) {
                        if (this.f125973f != null) {
                            this.f125973f.drawColor(0, Mode.CLEAR);
                        }
                        return;
                    } else if (!this.f125970c.isRecycled()) {
                        this.f125970c.recycle();
                    }
                }
                this.f125974g = intrinsicWidth / 2;
                this.f125970c = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                this.f125973f = new Canvas(this.f125970c);
                this.f125971d.setBounds(0, 0, this.f125973f.getWidth(), this.f125973f.getHeight());
                Bitmap bitmap = this.f125970c;
                TileMode tileMode = TileMode.CLAMP;
                this.f125972e = new BitmapShader(bitmap, tileMode, tileMode);
                this.f125969b.setAntiAlias(true);
                this.f125969b.setShader(this.f125972e);
            }
        }
    }

    public void setController(C13842a aVar) {
        if (this.f125975h) {
            this.f125968a = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    public CircleImageView(Context context) {
        super(context);
        mo98118a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f125975h) {
            if (this.f125968a) {
                m108482b();
                this.f125968a = false;
            }
            if (!(this.f125971d == null || this.f125973f == null)) {
                this.f125971d.draw(this.f125973f);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f125974g, this.f125969b);
            return;
        }
        super.onDraw(canvas);
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo98118a();
    }

    public CircleImageView(Context context, C13833a aVar) {
        super(context, aVar);
        mo98118a();
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo98118a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m108482b();
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo98118a();
    }
}
