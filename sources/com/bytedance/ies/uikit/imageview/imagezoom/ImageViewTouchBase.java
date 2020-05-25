package com.bytedance.ies.uikit.imageview.imagezoom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.ies.uikit.imageview.imagezoom.p700a.C11114a;
import com.bytedance.ies.uikit.imageview.imagezoom.p700a.C11115b;
import com.bytedance.ies.uikit.imageview.imagezoom.p701b.C11116a;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

public class ImageViewTouchBase extends ImageView {

    /* renamed from: A */
    protected boolean f29917A = false;

    /* renamed from: B */
    protected final float f29918B = 2.5f;

    /* renamed from: C */
    protected final int f29919C = 200;

    /* renamed from: D */
    protected RectF f29920D = new RectF();

    /* renamed from: E */
    protected RectF f29921E = new RectF();

    /* renamed from: F */
    protected RectF f29922F = new RectF();

    /* renamed from: G */
    protected boolean f29923G;

    /* renamed from: a */
    private C11113a f29924a;

    /* renamed from: o */
    protected C11115b f29925o = new C11114a();

    /* renamed from: p */
    protected Matrix f29926p = new Matrix();

    /* renamed from: q */
    protected Matrix f29927q = new Matrix();

    /* renamed from: r */
    protected Handler f29928r = new Handler();

    /* renamed from: s */
    protected Runnable f29929s = null;

    /* renamed from: t */
    protected float f29930t;

    /* renamed from: u */
    protected float f29931u = -1.0f;

    /* renamed from: v */
    protected final Matrix f29932v = new Matrix();

    /* renamed from: w */
    protected final float[] f29933w = new float[9];

    /* renamed from: x */
    protected int f29934x = -1;

    /* renamed from: y */
    protected int f29935y = -1;

    /* renamed from: z */
    protected boolean f29936z = false;

    /* renamed from: com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouchBase$a */
    public interface C11113a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20151a(float f) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20152a(Drawable drawable) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20156b(float f) {
    }

    public float getRotation() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20150a() {
        setScaleType(ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20153a(Drawable drawable, boolean z, Matrix matrix, float f) {
        if (drawable != null) {
            if (this.f29936z) {
                float[] fArr = new float[1];
                m22483a(drawable, this.f29926p, fArr);
                setMinZoom(fArr[0]);
            } else if (this.f29917A) {
                m22486b(drawable, this.f29926p);
                setMinZoom(m22488c(this.f29926p));
            } else {
                m22482a(drawable, this.f29926p);
                setMinZoom(getMinZoom());
            }
            super.setImageDrawable(drawable);
        } else {
            this.f29926p.reset();
            super.setImageDrawable(null);
        }
        if (z) {
            this.f29927q.reset();
            if (matrix != null) {
                this.f29927q = new Matrix(matrix);
            }
        }
        setImageMatrix(getImageViewMatrix());
        if (f < 1.0f) {
            this.f29930t = m22487c();
        } else {
            this.f29930t = f;
        }
        mo20152a(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20180a(boolean z, boolean z2) {
        if (getDrawable() != null) {
            RectF a = mo20174a(this.f29927q, true, true);
            if (!(a.left == 0.0f && a.top == 0.0f)) {
                mo20149a(a.left, a.top);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20177a(float f, float f2, float f3) {
        if (f > this.f29930t) {
            f = this.f29930t;
        }
        m22485b(f / getScale(), f2, f3);
        mo20151a(getScale());
        mo20180a(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20175a(double d, double d2) {
        RectF bitmapRect = getBitmapRect();
        this.f29922F.set((float) d, (float) d2, 0.0f, 0.0f);
        mo20179a(bitmapRect, this.f29922F);
        mo20149a(this.f29922F.left, this.f29922F.top);
        mo20180a(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20179a(RectF rectF, RectF rectF2) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        if (rectF.top >= 0.0f && rectF.bottom <= height) {
            rectF2.top = 0.0f;
        }
        if (rectF.left >= 0.0f && rectF.right <= width) {
            rectF2.left = 0.0f;
        }
        if (rectF.top + rectF2.top >= 0.0f && rectF.bottom > height) {
            rectF2.top = (float) ((int) (0.0f - rectF.top));
        }
        float f = height - 0.0f;
        if (rectF.bottom + rectF2.top <= f && rectF.top < 0.0f) {
            rectF2.top = (float) ((int) (f - rectF.bottom));
        }
        if (rectF.left + rectF2.left >= 0.0f) {
            rectF2.left = (float) ((int) (0.0f - rectF.left));
        }
        float f2 = width - 0.0f;
        if (rectF.right + rectF2.left <= f2) {
            rectF2.left = (float) ((int) (f2 - rectF.right));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20176a(float f, float f2, double d) {
        final double d2 = (double) f;
        final double d3 = (double) f2;
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.f29928r;
        C111112 r0 = new Runnable(300.0d) {

            /* renamed from: a */
            double f29942a;

            /* renamed from: b */
            double f29943b;

            public final void run() {
                double min = Math.min(300.0d, (double) (System.currentTimeMillis() - currentTimeMillis));
                double d = min;
                double a = ImageViewTouchBase.this.f29925o.mo20203a(d, ProfileUiInitOptimizeEnterThreshold.DEFAULT, d2, 300.0d);
                double a2 = ImageViewTouchBase.this.f29925o.mo20203a(d, ProfileUiInitOptimizeEnterThreshold.DEFAULT, d3, 300.0d);
                ImageViewTouchBase.this.mo20175a(a - this.f29942a, a2 - this.f29943b);
                this.f29942a = a;
                this.f29943b = a2;
                if (min < 300.0d) {
                    ImageViewTouchBase.this.f29928r.post(this);
                    return;
                }
                RectF a3 = ImageViewTouchBase.this.mo20174a(ImageViewTouchBase.this.f29927q, true, true);
                if (!(a3.left == 0.0f && a3.top == 0.0f)) {
                    ImageViewTouchBase.this.mo20184c(a3.left, a3.top);
                }
            }
        };
        handler.post(r0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20178a(float f, float f2, float f3, float f4) {
        if (f > getMaxZoom()) {
            f = getMaxZoom();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final float scale = getScale();
        final float f5 = f - scale;
        Matrix matrix = new Matrix(this.f29927q);
        matrix.postScale(f, f, f2, f3);
        RectF a = mo20174a(matrix, true, true);
        final float f6 = f2 + (a.left * f);
        final float f7 = f3 + (a.top * f);
        Handler handler = this.f29928r;
        final float f8 = f4;
        C111123 r0 = new Runnable() {
            public final void run() {
                float min = Math.min(f8, (float) (System.currentTimeMillis() - currentTimeMillis));
                ImageViewTouchBase.this.mo20177a(scale + ((float) ImageViewTouchBase.this.f29925o.mo20204b((double) min, ProfileUiInitOptimizeEnterThreshold.DEFAULT, (double) f5, (double) f8)), f6, f7);
                if (min < f8) {
                    ImageViewTouchBase.this.f29928r.post(this);
                } else if (ImageViewTouchBase.this.f29923G) {
                    ImageViewTouchBase.this.f29923G = false;
                } else {
                    ImageViewTouchBase.this.f29923G = true;
                    ImageViewTouchBase.this.mo20156b(ImageViewTouchBase.this.getScale());
                    ImageViewTouchBase.this.mo20180a(true, true);
                }
            }
        };
        handler.post(r0);
    }

    /* renamed from: b */
    public final void mo20181b() {
        m22479a((Bitmap) null, true);
    }

    /* access modifiers changed from: protected */
    public RectF getBitmapRect() {
        return m22484b(this.f29927q);
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.f29927q);
    }

    public Matrix getImageViewMatrix() {
        return m22477a(this.f29927q);
    }

    public float getScale() {
        return m22488c(this.f29927q);
    }

    public float getMinZoom() {
        if (this.f29931u < 0.0f) {
            this.f29931u = 1.0f;
        }
        return this.f29931u;
    }

    public float getMaxZoom() {
        if (this.f29930t < 1.0f) {
            this.f29930t = m22487c();
        }
        return this.f29930t;
    }

    /* renamed from: c */
    private float m22487c() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return 1.0f;
        }
        return Math.max(((float) drawable.getIntrinsicWidth()) / ((float) this.f29934x), ((float) drawable.getIntrinsicHeight()) / ((float) this.f29935y)) * 4.0f;
    }

    public void setMinZoom(float f) {
        this.f29931u = f;
    }

    public void setOnBitmapChangedListener(C11113a aVar) {
        this.f29924a = aVar;
    }

    /* renamed from: c */
    private float m22488c(Matrix matrix) {
        return m22476a(matrix, 0);
    }

    public void setImageBitmap(Bitmap bitmap) {
        m22479a(bitmap, true);
    }

    public void setImageDrawable(Drawable drawable) {
        mo20183b(drawable, true, null, -1.0f);
    }

    public void setFitToScreen(boolean z) {
        if (z != this.f29917A) {
            this.f29917A = z;
            requestLayout();
        }
    }

    public void setFitToWidth(boolean z) {
        if (z != this.f29936z) {
            this.f29936z = z;
            requestLayout();
        }
    }

    public void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    /* renamed from: a */
    private Matrix m22477a(Matrix matrix) {
        this.f29932v.set(this.f29926p);
        this.f29932v.postConcat(matrix);
        return this.f29932v;
    }

    /* renamed from: b */
    private RectF m22484b(Matrix matrix) {
        Drawable drawable = getDrawable();
        Matrix a = m22477a(matrix);
        if (drawable != null) {
            this.f29920D.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        } else {
            this.f29920D.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        a.mapRect(this.f29920D);
        return this.f29920D;
    }

    public ImageViewTouchBase(Context context) {
        super(context);
        mo20150a();
    }

    /* renamed from: a */
    private void m22479a(Bitmap bitmap, boolean z) {
        m22480a(bitmap, true, (Matrix) null);
    }

    /* renamed from: a */
    private float m22476a(Matrix matrix, int i) {
        matrix.getValues(this.f29933w);
        return this.f29933w[0];
    }

    /* renamed from: c */
    public final void mo20184c(float f, float f2) {
        mo20175a((double) f, (double) f2);
    }

    /* renamed from: b */
    public final void mo20182b(float f, float f2) {
        mo20178a(f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, f2);
    }

    /* renamed from: a */
    private void mo20149a(float f, float f2) {
        this.f29927q.postTranslate(f, f2);
        setImageMatrix(getImageViewMatrix());
    }

    /* renamed from: b */
    private void m22486b(Drawable drawable, Matrix matrix) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        matrix.reset();
        float min = Math.min(Math.min(width / intrinsicWidth, 2.5f), Math.min(height / intrinsicHeight, 2.5f));
        matrix.postScale(min, min);
        matrix.postTranslate((width - (intrinsicWidth * min)) / 2.0f, (height - (intrinsicHeight * min)) / 2.0f);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo20150a();
    }

    /* renamed from: a */
    private void m22482a(Drawable drawable, Matrix matrix) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        matrix.reset();
        if (intrinsicWidth > width || intrinsicHeight > height) {
            float min = Math.min(Math.min(width / intrinsicWidth, 2.0f), Math.min(height / intrinsicHeight, 2.0f));
            matrix.postScale(min, min);
            matrix.postTranslate((width - (intrinsicWidth * min)) / 2.0f, (height - (intrinsicHeight * min)) / 2.0f);
            return;
        }
        matrix.postTranslate((width - intrinsicWidth) / 2.0f, (height - intrinsicHeight) / 2.0f);
    }

    /* renamed from: b */
    private void m22485b(float f, float f2, float f3) {
        this.f29927q.postScale(f, f, f2, f3);
        setImageMatrix(getImageViewMatrix());
    }

    /* renamed from: a */
    private void m22480a(Bitmap bitmap, boolean z, Matrix matrix) {
        m22481a(bitmap, z, (Matrix) null, -1.0f);
    }

    /* renamed from: a */
    private void m22483a(Drawable drawable, Matrix matrix, float[] fArr) {
        float width = (float) getWidth();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        matrix.reset();
        float min = Math.min(width / intrinsicWidth, 2.5f);
        matrix.postScale(min, min);
        matrix.postTranslate((width - (intrinsicWidth * min)) / 2.0f, 0.0f);
        if (min > 1.0f) {
            fArr[0] = 1.0f / min;
        } else {
            fArr[0] = 1.0f;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.RectF mo20174a(android.graphics.Matrix r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.getDrawable()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r1, r1, r1, r1)
            return r6
        L_0x000d:
            android.graphics.RectF r0 = r5.f29921E
            r0.set(r1, r1, r1, r1)
            android.graphics.RectF r6 = r5.m22484b(r6)
            float r0 = r6.height()
            float r2 = r6.width()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x004a
            int r8 = r5.getHeight()
            float r8 = (float) r8
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0031
            float r8 = r8 - r0
            float r8 = r8 / r3
            float r0 = r6.top
            float r8 = r8 - r0
            goto L_0x004b
        L_0x0031:
            float r0 = r6.top
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            float r8 = r6.top
            float r8 = -r8
            goto L_0x004b
        L_0x003b:
            float r0 = r6.bottom
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x004a
            int r8 = r5.getHeight()
            float r8 = (float) r8
            float r0 = r6.bottom
            float r8 = r8 - r0
            goto L_0x004b
        L_0x004a:
            r8 = 0
        L_0x004b:
            if (r7 == 0) goto L_0x0072
            int r7 = r5.getWidth()
            float r7 = (float) r7
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            float r7 = r7 - r2
            float r7 = r7 / r3
            float r6 = r6.left
            float r6 = r7 - r6
            goto L_0x0073
        L_0x005d:
            float r0 = r6.left
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
            float r6 = r6.left
            float r6 = -r6
            goto L_0x0073
        L_0x0067:
            float r0 = r6.right
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0072
            float r6 = r6.right
            float r6 = r7 - r6
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            android.graphics.RectF r7 = r5.f29921E
            r7.set(r6, r8, r1, r1)
            android.graphics.RectF r6 = r5.f29921E
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouchBase.mo20174a(android.graphics.Matrix, boolean, boolean):android.graphics.RectF");
    }

    /* renamed from: a */
    private void m22481a(Bitmap bitmap, boolean z, Matrix matrix, float f) {
        if (bitmap != null) {
            mo20183b(new C11116a(bitmap), z, matrix, -1.0f);
        } else {
            mo20183b(null, z, matrix, -1.0f);
        }
    }

    /* renamed from: b */
    public final void mo20183b(Drawable drawable, boolean z, Matrix matrix, float f) {
        if (getWidth() <= 0) {
            final Drawable drawable2 = drawable;
            final boolean z2 = z;
            final Matrix matrix2 = matrix;
            final float f2 = f;
            C111101 r1 = new Runnable() {
                public final void run() {
                    ImageViewTouchBase.this.mo20183b(drawable2, z2, matrix2, f2);
                }
            };
            this.f29929s = r1;
            return;
        }
        mo20153a(drawable, z, matrix, f);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f29934x = i3 - i;
        this.f29935y = i4 - i2;
        Runnable runnable = this.f29929s;
        if (runnable != null) {
            this.f29929s = null;
            runnable.run();
        }
        if (getDrawable() != null) {
            float f = 1.0f;
            if (this.f29936z) {
                float[] fArr = new float[1];
                m22483a(getDrawable(), this.f29926p, fArr);
                setMinZoom(fArr[0]);
            } else if (this.f29917A) {
                m22486b(getDrawable(), this.f29926p);
                setMinZoom(1.0f);
                f = getMinZoom();
            } else {
                m22482a(getDrawable(), this.f29926p);
                setMinZoom(getMinZoom());
                f = getMinZoom();
            }
            setImageMatrix(getImageViewMatrix());
            mo20177a(f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        }
    }
}
