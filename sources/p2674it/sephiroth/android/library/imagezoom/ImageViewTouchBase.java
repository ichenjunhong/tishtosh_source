package p2674it.sephiroth.android.library.imagezoom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import p2674it.sephiroth.android.library.imagezoom.p2676a.C53187a;
import p2674it.sephiroth.android.library.p2675a.C53175a;
import p2674it.sephiroth.android.library.p2675a.C53176b;

/* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouchBase */
public abstract class ImageViewTouchBase extends ImageView {

    /* renamed from: a */
    private float f131716a;

    /* renamed from: b */
    private float f131717b;

    /* renamed from: c */
    private boolean f131718c;

    /* renamed from: d */
    private boolean f131719d;

    /* renamed from: e */
    private int f131720e;

    /* renamed from: f */
    private int f131721f;

    /* renamed from: g */
    private PointF f131722g;

    /* renamed from: h */
    private boolean f131723h;

    /* renamed from: i */
    private boolean f131724i;

    /* renamed from: j */
    private C53185b f131725j;

    /* renamed from: k */
    private C53186c f131726k;

    /* renamed from: m */
    protected C53176b f131727m;

    /* renamed from: n */
    protected Matrix f131728n;

    /* renamed from: o */
    protected Matrix f131729o;

    /* renamed from: p */
    protected Matrix f131730p;

    /* renamed from: q */
    protected Handler f131731q;

    /* renamed from: r */
    protected Runnable f131732r;

    /* renamed from: s */
    protected boolean f131733s;

    /* renamed from: t */
    protected final Matrix f131734t;

    /* renamed from: u */
    protected final float[] f131735u;

    /* renamed from: v */
    protected C53184a f131736v;

    /* renamed from: w */
    protected final int f131737w;

    /* renamed from: x */
    protected RectF f131738x;

    /* renamed from: y */
    protected RectF f131739y;

    /* renamed from: z */
    protected RectF f131740z;

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouchBase$a */
    public enum C53184a {
        NONE,
        FIT_TO_SCREEN,
        FIT_IF_BIGGER
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouchBase$b */
    public interface C53185b {
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouchBase$c */
    public interface C53186c {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo110686a(float f) {
    }

    /* access modifiers changed from: protected */
    public PointF getCenter() {
        return this.f131722g;
    }

    public C53184a getDisplayType() {
        return this.f131736v;
    }

    public float getRotation() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo110688a(Drawable drawable, Matrix matrix, float f, float f2) {
        if (drawable != null) {
            super.setImageDrawable(drawable);
        } else {
            this.f131728n.reset();
            super.setImageDrawable(null);
        }
        if (f == -1.0f || f2 == -1.0f) {
            this.f131717b = -1.0f;
            this.f131716a = -1.0f;
            this.f131719d = false;
            this.f131718c = false;
        } else {
            float min = Math.min(f, f2);
            float max = Math.max(min, f2);
            this.f131717b = min;
            this.f131716a = max;
            this.f131719d = true;
            this.f131718c = true;
            if (this.f131736v == C53184a.FIT_TO_SCREEN || this.f131736v == C53184a.FIT_IF_BIGGER) {
                if (this.f131717b >= 1.0f) {
                    this.f131719d = false;
                    this.f131717b = -1.0f;
                }
                if (this.f131716a <= 1.0f) {
                    this.f131718c = true;
                    this.f131716a = -1.0f;
                }
            }
        }
        if (matrix != null) {
            this.f131730p = new Matrix(matrix);
        }
        this.f131724i = true;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110716a(boolean z, boolean z2) {
        if (getDrawable() != null) {
            RectF a = mo110709a(this.f131729o, true, true);
            if (!(a.left == 0.0f && a.top == 0.0f)) {
                mo110685a(a.left, a.top);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110713a(float f, float f2, float f3) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        m112991b(f / getScale(), f2, f3);
        getScale();
        mo110716a(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110715a(RectF rectF, RectF rectF2) {
        if (rectF != null) {
            if (rectF.top >= 0.0f && rectF.bottom <= ((float) this.f131721f)) {
                rectF2.top = 0.0f;
            }
            if (rectF.left >= 0.0f && rectF.right <= ((float) this.f131720e)) {
                rectF2.left = 0.0f;
            }
            if (rectF.top + rectF2.top >= 0.0f && rectF.bottom > ((float) this.f131721f)) {
                rectF2.top = (float) ((int) (0.0f - rectF.top));
            }
            if (rectF.bottom + rectF2.top <= ((float) (this.f131721f + 0)) && rectF.top < 0.0f) {
                rectF2.top = (float) ((int) (((float) (this.f131721f + 0)) - rectF.bottom));
            }
            if (rectF.left + rectF2.left >= 0.0f) {
                rectF2.left = (float) ((int) (0.0f - rectF.left));
            }
            if (rectF.right + rectF2.left <= ((float) (this.f131720e + 0))) {
                rectF2.left = (float) ((int) (((float) (this.f131720e + 0)) - rectF.right));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110714a(float f, float f2, float f3, float f4) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final float scale = getScale();
        final float f5 = f - scale;
        Matrix matrix = new Matrix(this.f131729o);
        matrix.postScale(f, f, f2, f3);
        RectF a = mo110709a(matrix, true, true);
        final float f6 = f2 + (a.left * f);
        final float f7 = f3 + (a.top * f);
        Handler handler = this.f131731q;
        final float f8 = f4;
        C531833 r0 = new Runnable() {
            public final void run() {
                float min = Math.min(f8, (float) (System.currentTimeMillis() - currentTimeMillis));
                ImageViewTouchBase.this.mo110713a(scale + ((float) ImageViewTouchBase.this.f131727m.mo110684b((double) min, ProfileUiInitOptimizeEnterThreshold.DEFAULT, (double) f5, (double) f8)), f6, f7);
                if (min < f8) {
                    ImageViewTouchBase.this.f131731q.post(this);
                    return;
                }
                ImageViewTouchBase.this.mo110686a(ImageViewTouchBase.this.getScale());
                ImageViewTouchBase.this.mo110716a(true, true);
            }
        };
        handler.post(r0);
    }

    public float getBaseScale() {
        return m112992c(this.f131728n);
    }

    public RectF getBitmapRect() {
        return m112989b(this.f131729o);
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.f131729o);
    }

    public Matrix getImageViewMatrix() {
        return m112987a(this.f131729o);
    }

    public float getScale() {
        return m112992c(this.f131729o);
    }

    public float getMaxScale() {
        float f;
        if (this.f131716a == -1.0f) {
            Drawable drawable = getDrawable();
            if (drawable == null) {
                f = 1.0f;
            } else {
                f = Math.max(((float) drawable.getIntrinsicWidth()) / ((float) this.f131720e), ((float) drawable.getIntrinsicHeight()) / ((float) this.f131721f)) * 8.0f;
            }
            this.f131716a = f;
        }
        return this.f131716a;
    }

    public float getMinScale() {
        if (this.f131717b == -1.0f) {
            float f = 1.0f;
            if (getDrawable() != null) {
                f = Math.min(1.0f, 1.0f / m112992c(this.f131728n));
            }
            this.f131717b = f;
        }
        return this.f131717b;
    }

    /* renamed from: a */
    public final void mo110710a() {
        this.f131729o = new Matrix();
        float a = m112986a(this.f131736v);
        setImageMatrix(getImageViewMatrix());
        if (a != getScale()) {
            m112990b(a);
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void setMaxScale(float f) {
        this.f131716a = f;
    }

    /* access modifiers changed from: protected */
    public void setMinScale(float f) {
        this.f131717b = f;
    }

    public void setOnDrawableChangedListener(C53185b bVar) {
        this.f131725j = bVar;
    }

    public void setOnLayoutChangeListener(C53186c cVar) {
        this.f131726k = cVar;
    }

    public ImageViewTouchBase(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private float m112992c(Matrix matrix) {
        return m112985a(matrix, 0);
    }

    public void setImageDrawable(Drawable drawable) {
        mo110718b(drawable, null, -1.0f, -1.0f);
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType == ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public void setDisplayType(C53184a aVar) {
        if (aVar != this.f131736v) {
            this.f131733s = false;
            this.f131736v = aVar;
            this.f131723h = true;
            requestLayout();
        }
    }

    public void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    /* renamed from: a */
    private float m112986a(C53184a aVar) {
        if (aVar == C53184a.FIT_TO_SCREEN) {
            return 1.0f;
        }
        if (aVar == C53184a.FIT_IF_BIGGER) {
            return Math.min(1.0f, 1.0f / m112992c(this.f131728n));
        }
        return 1.0f / m112992c(this.f131728n);
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            mo110718b(new C53187a(bitmap), null, -1.0f, -1.0f);
        } else {
            mo110718b(null, null, -1.0f, -1.0f);
        }
    }

    public void setImageMatrix(Matrix matrix) {
        Matrix imageMatrix = getImageMatrix();
        if ((matrix != null || imageMatrix.isIdentity()) && matrix != null) {
            imageMatrix.equals(matrix);
        }
        super.setImageMatrix(matrix);
    }

    /* renamed from: a */
    private Matrix m112987a(Matrix matrix) {
        this.f131734t.set(this.f131728n);
        this.f131734t.postConcat(matrix);
        return this.f131734t;
    }

    /* renamed from: b */
    private RectF m112989b(Matrix matrix) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        Matrix a = m112987a(matrix);
        this.f131738x.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        a.mapRect(this.f131738x);
        return this.f131738x;
    }

    /* renamed from: b */
    private void m112990b(float f) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        if (f < getMinScale()) {
            f = getMinScale();
        }
        PointF center = getCenter();
        mo110713a(f, center.x, center.y);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private float m112985a(Matrix matrix, int i) {
        matrix.getValues(this.f131735u);
        return this.f131735u[0];
    }

    /* renamed from: c */
    public final void mo110719c(float f, float f2) {
        mo110711a((double) f, (double) f2);
    }

    /* renamed from: b */
    public final void mo110717b(float f, float f2) {
        PointF center = getCenter();
        mo110714a(f, center.x, center.y, 50.0f);
    }

    /* renamed from: a */
    private void mo110685a(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.f131729o.postTranslate(f, f2);
            setImageMatrix(getImageViewMatrix());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110711a(double d, double d2) {
        RectF bitmapRect = getBitmapRect();
        this.f131740z.set((float) d, (float) d2, 0.0f, 0.0f);
        mo110715a(bitmapRect, this.f131740z);
        mo110685a(this.f131740z.left, this.f131740z.top);
        mo110716a(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo110687a(Context context, AttributeSet attributeSet, int i) {
        setScaleType(ScaleType.MATRIX);
    }

    /* renamed from: b */
    private void m112991b(float f, float f2, float f3) {
        this.f131729o.postScale(f, f, f2, f3);
        setImageMatrix(getImageViewMatrix());
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f131727m = new C53175a();
        this.f131728n = new Matrix();
        this.f131729o = new Matrix();
        this.f131731q = new Handler();
        this.f131732r = null;
        this.f131733s = false;
        this.f131716a = -1.0f;
        this.f131717b = -1.0f;
        this.f131734t = new Matrix();
        this.f131735u = new float[9];
        this.f131720e = -1;
        this.f131721f = -1;
        this.f131722g = new PointF();
        this.f131736v = C53184a.NONE;
        this.f131737w = 200;
        this.f131738x = new RectF();
        this.f131739y = new RectF();
        this.f131740z = new RectF();
        mo110687a(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.RectF mo110709a(android.graphics.Matrix r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.getDrawable()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r1, r1, r1, r1)
            return r6
        L_0x000d:
            android.graphics.RectF r0 = r5.f131739y
            r0.set(r1, r1, r1, r1)
            android.graphics.RectF r6 = r5.m112989b(r6)
            float r0 = r6.height()
            float r2 = r6.width()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x0046
            int r8 = r5.f131721f
            float r8 = (float) r8
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x002f
            float r8 = r8 - r0
            float r8 = r8 / r3
            float r0 = r6.top
            float r8 = r8 - r0
            goto L_0x0047
        L_0x002f:
            float r0 = r6.top
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            float r8 = r6.top
            float r8 = -r8
            goto L_0x0047
        L_0x0039:
            float r0 = r6.bottom
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0046
            int r8 = r5.f131721f
            float r8 = (float) r8
            float r0 = r6.bottom
            float r8 = r8 - r0
            goto L_0x0047
        L_0x0046:
            r8 = 0
        L_0x0047:
            if (r7 == 0) goto L_0x006c
            int r7 = r5.f131720e
            float r7 = (float) r7
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            float r7 = r7 - r2
            float r7 = r7 / r3
            float r6 = r6.left
            float r6 = r7 - r6
            goto L_0x006d
        L_0x0057:
            float r0 = r6.left
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            float r6 = r6.left
            float r6 = -r6
            goto L_0x006d
        L_0x0061:
            float r0 = r6.right
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
            float r6 = r6.right
            float r6 = r7 - r6
            goto L_0x006d
        L_0x006c:
            r6 = 0
        L_0x006d:
            android.graphics.RectF r7 = r5.f131739y
            r7.set(r6, r8, r1, r1)
            android.graphics.RectF r6 = r5.f131739y
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p2674it.sephiroth.android.library.imagezoom.ImageViewTouchBase.mo110709a(android.graphics.Matrix, boolean, boolean):android.graphics.RectF");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110712a(float f, float f2, double d) {
        final double d2 = (double) f;
        final double d3 = (double) f2;
        final long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.f131731q;
        C531822 r0 = new Runnable(300.0d) {

            /* renamed from: a */
            double f131746a;

            /* renamed from: b */
            double f131747b;

            public final void run() {
                double min = Math.min(300.0d, (double) (System.currentTimeMillis() - currentTimeMillis));
                double d = min;
                double a = ImageViewTouchBase.this.f131727m.mo110683a(d, ProfileUiInitOptimizeEnterThreshold.DEFAULT, d2, 300.0d);
                double a2 = ImageViewTouchBase.this.f131727m.mo110683a(d, ProfileUiInitOptimizeEnterThreshold.DEFAULT, d3, 300.0d);
                ImageViewTouchBase.this.mo110711a(a - this.f131746a, a2 - this.f131747b);
                this.f131746a = a;
                this.f131747b = a2;
                if (min < 300.0d) {
                    ImageViewTouchBase.this.f131731q.post(this);
                    return;
                }
                RectF a3 = ImageViewTouchBase.this.mo110709a(ImageViewTouchBase.this.f131729o, true, true);
                if (!(a3.left == 0.0f && a3.top == 0.0f)) {
                    ImageViewTouchBase.this.mo110719c(a3.left, a3.top);
                }
            }
        };
        handler.post(r0);
    }

    /* renamed from: b */
    public final void mo110718b(Drawable drawable, Matrix matrix, float f, float f2) {
        if (getWidth() <= 0) {
            final Drawable drawable2 = drawable;
            final Matrix matrix2 = matrix;
            final float f3 = f;
            final float f4 = f2;
            C531811 r1 = new Runnable() {
                public final void run() {
                    ImageViewTouchBase.this.mo110718b(drawable2, matrix2, f3, f4);
                }
            };
            this.f131732r = r1;
            return;
        }
        mo110688a(drawable, matrix, f, f2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012d, code lost:
        if (r10 != getScale()) goto L_0x012f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            super.onLayout(r18, r19, r20, r21, r22)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r18 == 0) goto L_0x002e
            int r4 = r0.f131720e
            int r5 = r0.f131721f
            int r6 = r21 - r19
            r0.f131720e = r6
            int r6 = r22 - r20
            r0.f131721f = r6
            int r6 = r0.f131720e
            int r4 = r6 - r4
            int r6 = r0.f131721f
            int r5 = r6 - r5
            android.graphics.PointF r6 = r0.f131722g
            int r7 = r0.f131720e
            float r7 = (float) r7
            float r7 = r7 / r2
            r6.x = r7
            android.graphics.PointF r6 = r0.f131722g
            int r7 = r0.f131721f
            float r7 = (float) r7
            float r7 = r7 / r2
            r6.y = r7
            goto L_0x0030
        L_0x002e:
            r4 = 0
            r5 = 0
        L_0x0030:
            java.lang.Runnable r6 = r0.f131732r
            r7 = 0
            if (r6 == 0) goto L_0x003a
            r0.f131732r = r7
            r6.run()
        L_0x003a:
            android.graphics.drawable.Drawable r6 = r17.getDrawable()
            if (r6 == 0) goto L_0x015c
            if (r18 != 0) goto L_0x004a
            boolean r8 = r0.f131723h
            if (r8 != 0) goto L_0x004a
            boolean r8 = r0.f131724i
            if (r8 == 0) goto L_0x0169
        L_0x004a:
            it.sephiroth.android.library.imagezoom.ImageViewTouchBase$a r8 = r0.f131736v
            r0.m112986a(r8)
            android.graphics.Matrix r8 = r0.f131728n
            float r8 = r0.m112992c(r8)
            float r9 = r17.getScale()
            r10 = 1065353216(0x3f800000, float:1.0)
            float r11 = r10 / r8
            float r11 = java.lang.Math.min(r10, r11)
            android.graphics.Matrix r12 = r0.f131728n
            int r13 = r0.f131720e
            float r13 = (float) r13
            int r14 = r0.f131721f
            float r14 = (float) r14
            int r15 = r6.getIntrinsicWidth()
            float r15 = (float) r15
            int r6 = r6.getIntrinsicHeight()
            float r6 = (float) r6
            r12.reset()
            int r16 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r16 > 0) goto L_0x0096
            int r16 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x007f
            goto L_0x0096
        L_0x007f:
            float r10 = r13 / r15
            float r3 = r14 / r6
            float r3 = java.lang.Math.min(r10, r3)
            r12.postScale(r3, r3)
            float r15 = r15 * r3
            float r13 = r13 - r15
            float r13 = r13 / r2
            float r6 = r6 * r3
            float r14 = r14 - r6
            float r14 = r14 / r2
            r12.postTranslate(r13, r14)
            goto L_0x00ac
        L_0x0096:
            float r3 = r13 / r15
            float r10 = r14 / r6
            float r3 = java.lang.Math.min(r3, r10)
            r12.postScale(r3, r3)
            float r15 = r15 * r3
            float r13 = r13 - r15
            float r13 = r13 / r2
            float r6 = r6 * r3
            float r14 = r14 - r6
            float r14 = r14 / r2
            r12.postTranslate(r13, r14)
        L_0x00ac:
            android.graphics.Matrix r2 = r0.f131728n
            float r2 = r0.m112992c(r2)
            boolean r3 = r0.f131724i
            if (r3 != 0) goto L_0x0101
            boolean r3 = r0.f131723h
            if (r3 == 0) goto L_0x00bb
            goto L_0x0101
        L_0x00bb:
            if (r18 == 0) goto L_0x00fd
            boolean r1 = r0.f131719d
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x00c5
            r0.f131717b = r3
        L_0x00c5:
            boolean r1 = r0.f131718c
            if (r1 != 0) goto L_0x00cb
            r0.f131716a = r3
        L_0x00cb:
            android.graphics.Matrix r1 = r17.getImageViewMatrix()
            r0.setImageMatrix(r1)
            int r1 = -r4
            float r1 = (float) r1
            int r3 = -r5
            float r3 = (float) r3
            r0.mo110685a(r1, r3)
            boolean r1 = r0.f131733s
            if (r1 != 0) goto L_0x00e5
            it.sephiroth.android.library.imagezoom.ImageViewTouchBase$a r1 = r0.f131736v
            float r1 = r0.m112986a(r1)
            r10 = r1
            goto L_0x012f
        L_0x00e5:
            float r1 = r9 - r11
            float r1 = java.lang.Math.abs(r1)
            double r3 = (double) r1
            r5 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00fa
            float r8 = r8 / r2
            float r8 = r8 * r9
            r10 = r8
            goto L_0x012f
        L_0x00fa:
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x012f
        L_0x00fd:
            r1 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0133
        L_0x0101:
            android.graphics.Matrix r1 = r0.f131730p
            if (r1 == 0) goto L_0x0114
            android.graphics.Matrix r1 = r0.f131729o
            android.graphics.Matrix r2 = r0.f131730p
            r1.set(r2)
            r0.f131730p = r7
            float r1 = r17.getScale()
        L_0x0112:
            r10 = r1
            goto L_0x0120
        L_0x0114:
            android.graphics.Matrix r1 = r0.f131729o
            r1.reset()
            it.sephiroth.android.library.imagezoom.ImageViewTouchBase$a r1 = r0.f131736v
            float r1 = r0.m112986a(r1)
            goto L_0x0112
        L_0x0120:
            android.graphics.Matrix r1 = r17.getImageViewMatrix()
            r0.setImageMatrix(r1)
            float r1 = r17.getScale()
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0132
        L_0x012f:
            r0.m112990b(r10)
        L_0x0132:
            r1 = 0
        L_0x0133:
            r0.f131733s = r1
            float r1 = r17.getMaxScale()
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0145
            float r1 = r17.getMinScale()
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0148
        L_0x0145:
            r0.m112990b(r10)
        L_0x0148:
            r1 = 1
            r0.mo110716a(r1, r1)
            boolean r1 = r0.f131723h
            if (r1 == 0) goto L_0x0154
            r1 = 0
            r0.f131723h = r1
            goto L_0x0155
        L_0x0154:
            r1 = 0
        L_0x0155:
            boolean r2 = r0.f131724i
            if (r2 == 0) goto L_0x015b
            r0.f131724i = r1
        L_0x015b:
            return
        L_0x015c:
            r1 = 0
            boolean r2 = r0.f131724i
            if (r2 == 0) goto L_0x0163
            r0.f131724i = r1
        L_0x0163:
            boolean r2 = r0.f131723h
            if (r2 == 0) goto L_0x0169
            r0.f131723h = r1
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p2674it.sephiroth.android.library.imagezoom.ImageViewTouchBase.onLayout(boolean, int, int, int, int):void");
    }
}
