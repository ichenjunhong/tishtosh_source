package com.soundcloud.android.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

abstract class ImageViewTouchBase extends ImageView {

    /* renamed from: a */
    private final Matrix f50593a = new Matrix();

    /* renamed from: b */
    private final float[] f50594b = new float[9];

    /* renamed from: c */
    private Runnable f50595c;

    /* renamed from: d */
    protected Matrix f50596d = new Matrix();

    /* renamed from: e */
    protected Matrix f50597e = new Matrix();

    /* renamed from: f */
    protected final C18340d f50598f = new C18340d(null, 0);

    /* renamed from: g */
    int f50599g = -1;

    /* renamed from: h */
    int f50600h = -1;

    /* renamed from: i */
    float f50601i;

    /* renamed from: j */
    protected Handler f50602j = new Handler();

    /* renamed from: k */
    private C18330a f50603k;

    /* renamed from: com.soundcloud.android.crop.ImageViewTouchBase$a */
    public interface C18330a {
        /* renamed from: a */
        void mo36737a(Bitmap bitmap);
    }

    /* renamed from: c */
    private void m44522c() {
        setScaleType(ScaleType.MATRIX);
    }

    /* renamed from: a */
    public void mo36746a() {
        mo36749a((Bitmap) null, true);
    }

    /* access modifiers changed from: protected */
    public float getScale() {
        this.f50597e.getValues(this.f50594b);
        return this.f50594b[0];
    }

    /* access modifiers changed from: protected */
    public Matrix getImageViewMatrix() {
        this.f50593a.set(this.f50596d);
        this.f50593a.postConcat(this.f50597e);
        return this.f50593a;
    }

    public Matrix getUnrotatedMatrix() {
        Matrix matrix = new Matrix();
        m44521a(this.f50598f, matrix, false);
        matrix.postConcat(this.f50597e);
        return matrix;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36760b() {
        float f;
        Bitmap bitmap = this.f50598f.f50647a;
        if (bitmap != null) {
            Matrix imageViewMatrix = getImageViewMatrix();
            float f2 = 0.0f;
            RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
            imageViewMatrix.mapRect(rectF);
            float height = rectF.height();
            float width = rectF.width();
            float height2 = (float) getHeight();
            if (height < height2) {
                f = ((height2 - height) / 2.0f) - rectF.top;
            } else if (rectF.top > 0.0f) {
                f = -rectF.top;
            } else if (rectF.bottom < height2) {
                f = ((float) getHeight()) - rectF.bottom;
            } else {
                f = 0.0f;
            }
            float width2 = (float) getWidth();
            if (width < width2) {
                f2 = ((width2 - width) / 2.0f) - rectF.left;
            } else if (rectF.left > 0.0f) {
                f2 = -rectF.left;
            } else if (rectF.right < width2) {
                f2 = width2 - rectF.right;
            }
            mo36747a(f2, f);
            setImageMatrix(getImageViewMatrix());
        }
    }

    public void setRecycler(C18330a aVar) {
        this.f50603k = aVar;
    }

    public void setImageBitmap(Bitmap bitmap) {
        m44520a(bitmap, 0);
    }

    public ImageViewTouchBase(Context context) {
        super(context);
        m44522c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36747a(float f, float f2) {
        this.f50597e.postTranslate(f, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36761b(float f, float f2) {
        mo36747a(f, f2);
        setImageMatrix(getImageViewMatrix());
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    /* renamed from: a */
    private void m44520a(Bitmap bitmap, int i) {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
        }
        Bitmap bitmap2 = this.f50598f.f50647a;
        this.f50598f.f50647a = bitmap;
        this.f50598f.f50648b = i;
        if (bitmap2 != null && bitmap2 != bitmap && this.f50603k != null) {
            this.f50603k.mo36737a(bitmap2);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4 || !keyEvent.isTracking() || keyEvent.isCanceled() || getScale() <= 1.0f) {
            return super.onKeyUp(i, keyEvent);
        }
        mo36748a(1.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        return true;
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m44522c();
    }

    /* renamed from: a */
    public void mo36749a(Bitmap bitmap, boolean z) {
        mo36750a(new C18340d(bitmap, 0), z);
    }

    /* renamed from: a */
    public void mo36750a(final C18340d dVar, final boolean z) {
        float f;
        if (getWidth() <= 0) {
            this.f50595c = new Runnable() {
                public final void run() {
                    ImageViewTouchBase.this.mo36750a(dVar, z);
                }
            };
            return;
        }
        if (dVar.f50647a != null) {
            m44521a(dVar, this.f50596d, true);
            m44520a(dVar.f50647a, dVar.f50648b);
        } else {
            this.f50596d.reset();
            setImageBitmap(null);
        }
        if (z) {
            this.f50597e.reset();
        }
        setImageMatrix(getImageViewMatrix());
        if (this.f50598f.f50647a == null) {
            f = 1.0f;
        } else {
            f = Math.max(((float) this.f50598f.mo36779c()) / ((float) this.f50599g), ((float) this.f50598f.mo36778b()) / ((float) this.f50600h)) * 4.0f;
        }
        this.f50601i = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36748a(float f, float f2, float f3) {
        if (f > this.f50601i) {
            f = this.f50601i;
        }
        float scale = f / getScale();
        this.f50597e.postScale(scale, scale, f2, f3);
        setImageMatrix(getImageViewMatrix());
        mo36760b();
    }

    /* renamed from: a */
    private void m44521a(C18340d dVar, Matrix matrix, boolean z) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float c = (float) dVar.mo36779c();
        float b = (float) dVar.mo36778b();
        matrix.reset();
        float min = Math.min(Math.min(width / c, 3.0f), Math.min(height / b, 3.0f));
        if (z) {
            matrix.postConcat(dVar.mo36777a());
        }
        matrix.postScale(min, min);
        matrix.postTranslate((width - (c * min)) / 2.0f, (height - (b * min)) / 2.0f);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m44522c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36759a(float f, float f2, float f3, float f4) {
        final float scale = (f - getScale()) / 300.0f;
        final float scale2 = getScale();
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.f50602j;
        final float f5 = f2;
        final float f6 = f3;
        C183292 r0 = new Runnable(300.0f) {
            public final void run() {
                float min = Math.min(300.0f, (float) (System.currentTimeMillis() - currentTimeMillis));
                ImageViewTouchBase.this.mo36748a(scale2 + (scale * min), f5, f6);
                if (min < 300.0f) {
                    ImageViewTouchBase.this.f50602j.post(this);
                }
            }
        };
        handler.post(r0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f50599g = i3 - i;
        this.f50600h = i4 - i2;
        Runnable runnable = this.f50595c;
        if (runnable != null) {
            this.f50595c = null;
            runnable.run();
        }
        if (this.f50598f.f50647a != null) {
            m44521a(this.f50598f, this.f50596d, true);
            setImageMatrix(getImageViewMatrix());
        }
    }
}
