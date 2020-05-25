package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView.ScaleType;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView */
public class PinchImageView extends AppCompatImageView {

    /* renamed from: a */
    public OnClickListener f103115a;

    /* renamed from: b */
    public OnLongClickListener f103116b;

    /* renamed from: c */
    public Matrix f103117c = new Matrix();

    /* renamed from: d */
    public RectF f103118d;

    /* renamed from: e */
    public int f103119e = 0;

    /* renamed from: f */
    public C40411f f103120f;

    /* renamed from: g */
    C40406a f103121g;

    /* renamed from: h */
    private boolean f103122h;

    /* renamed from: i */
    private Rect f103123i;

    /* renamed from: j */
    private List<Object> f103124j;

    /* renamed from: k */
    private List<Object> f103125k;

    /* renamed from: l */
    private int f103126l;

    /* renamed from: m */
    private PointF f103127m = new PointF();

    /* renamed from: n */
    private PointF f103128n = new PointF();

    /* renamed from: o */
    private float f103129o = 0.0f;

    /* renamed from: p */
    private GestureDetector f103130p = new GestureDetector(getContext(), new SimpleOnGestureListener() {
        public final void onLongPress(MotionEvent motionEvent) {
            if (PinchImageView.this.f103116b != null) {
                PinchImageView.this.f103116b.onLongClick(PinchImageView.this);
            }
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (PinchImageView.this.f103115a != null) {
                PinchImageView.this.f103115a.onClick(PinchImageView.this);
            }
            return true;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (PinchImageView.this.f103119e == 1 && (PinchImageView.this.f103120f == null || !PinchImageView.this.f103120f.isRunning())) {
                PinchImageView.this.mo82662b(motionEvent.getX(), motionEvent.getY());
            }
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (PinchImageView.this.f103119e == 0 && (PinchImageView.this.f103120f == null || !PinchImageView.this.f103120f.isRunning())) {
                PinchImageView pinchImageView = PinchImageView.this;
                if (pinchImageView.mo82663b()) {
                    pinchImageView.mo82664c();
                    pinchImageView.f103121g = new C40406a(f / 60.0f, f2 / 60.0f);
                    pinchImageView.f103121g.start();
                }
            }
            return true;
        }
    });

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$a */
    class C40406a extends ValueAnimator implements AnimatorUpdateListener {

        /* renamed from: b */
        private float[] f103133b;

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean a = PinchImageView.this.mo82661a(this.f103133b[0], this.f103133b[1]);
            float[] fArr = this.f103133b;
            fArr[0] = fArr[0] * 0.9f;
            float[] fArr2 = this.f103133b;
            fArr2[1] = fArr2[1] * 0.9f;
            if (!a || C40407b.m89800b(0.0f, 0.0f, this.f103133b[0], this.f103133b[1]) < 1.0f) {
                valueAnimator.cancel();
            }
        }

        C40406a(float f, float f2) {
            setFloatValues(new float[]{0.0f, 1.0f});
            setDuration(1000000);
            addUpdateListener(this);
            this.f103133b = new float[]{f, f2};
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$b */
    public static class C40407b {

        /* renamed from: a */
        private static C40408c f103134a = new C40408c(16);

        /* renamed from: b */
        private static C40410e f103135b = new C40410e(16);

        /* renamed from: a */
        public static Matrix m89795a() {
            return (Matrix) f103134a.mo82683b();
        }

        /* renamed from: b */
        public static RectF m89801b() {
            return (RectF) f103135b.mo82683b();
        }

        /* renamed from: a */
        public static void m89798a(RectF rectF) {
            f103135b.mo82684b(rectF);
        }

        /* renamed from: b */
        public static void m89802b(Matrix matrix) {
            f103134a.mo82684b(matrix);
        }

        /* renamed from: a */
        public static Matrix m89796a(Matrix matrix) {
            Matrix matrix2 = (Matrix) f103134a.mo82683b();
            if (matrix != null) {
                matrix2.set(matrix);
            }
            return matrix2;
        }

        /* renamed from: c */
        public static float[] m89804c(Matrix matrix) {
            if (matrix == null) {
                return new float[2];
            }
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            return new float[]{fArr[0], fArr[4]};
        }

        /* renamed from: a */
        public static float[] m89799a(float[] fArr, Matrix matrix) {
            if (fArr == null || matrix == null) {
                return new float[2];
            }
            float[] fArr2 = new float[2];
            Matrix a = m89795a();
            matrix.invert(a);
            a.mapPoints(fArr2, fArr);
            m89802b(a);
            return fArr2;
        }

        /* renamed from: b */
        public static float m89800b(float f, float f2, float f3, float f4) {
            float f5 = f - f3;
            float f6 = f2 - f4;
            return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        }

        /* renamed from: c */
        public static float[] m89803c(float f, float f2, float f3, float f4) {
            return new float[]{(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        }

        /* renamed from: a */
        public static RectF m89797a(float f, float f2, float f3, float f4) {
            RectF rectF = (RectF) f103135b.mo82683b();
            rectF.set(0.0f, 0.0f, f3, f4);
            return rectF;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$c */
    static class C40408c extends C40409d<Matrix> {
        /* renamed from: c */
        private static Matrix m89805c() {
            return new Matrix();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo82681a() {
            return m89805c();
        }

        C40408c(int i) {
            super(16);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo82682a(Object obj) {
            Matrix matrix = (Matrix) obj;
            if (matrix == null) {
                return m89805c();
            }
            matrix.reset();
            return matrix;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$d */
    static abstract class C40409d<T> {

        /* renamed from: a */
        private int f103136a;

        /* renamed from: b */
        private Queue<T> f103137b = new LinkedList();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo82681a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo82682a(T t);

        /* renamed from: b */
        public final T mo82683b() {
            if (this.f103137b.size() == 0) {
                return mo82681a();
            }
            try {
                return mo82682a(this.f103137b.poll());
            } catch (NoSuchElementException unused) {
                return mo82681a();
            }
        }

        C40409d(int i) {
            this.f103136a = i;
        }

        /* renamed from: b */
        public final void mo82684b(T t) {
            if (t != null && this.f103137b.size() < this.f103136a) {
                this.f103137b.offer(t);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$e */
    static class C40410e extends C40409d<RectF> {
        /* renamed from: c */
        private static RectF m89812c() {
            return new RectF();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo82681a() {
            return m89812c();
        }

        C40410e(int i) {
            super(16);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo82682a(Object obj) {
            RectF rectF = (RectF) obj;
            if (rectF == null) {
                return m89812c();
            }
            rectF.setEmpty();
            return rectF;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$f */
    class C40411f extends ValueAnimator implements AnimatorUpdateListener {

        /* renamed from: b */
        private float[] f103139b;

        /* renamed from: c */
        private float[] f103140c;

        /* renamed from: d */
        private float[] f103141d;

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (int i = 0; i < 9; i++) {
                this.f103141d[i] = this.f103139b[i] + ((this.f103140c[i] - this.f103139b[i]) * floatValue);
            }
            PinchImageView.this.f103117c.setValues(this.f103141d);
            PinchImageView.this.mo82660a();
            PinchImageView.this.invalidate();
        }

        C40411f(PinchImageView pinchImageView, Matrix matrix, Matrix matrix2) {
            this(matrix, matrix2, 200);
        }

        private C40411f(Matrix matrix, Matrix matrix2, long j) {
            this.f103139b = new float[9];
            this.f103140c = new float[9];
            this.f103141d = new float[9];
            setFloatValues(new float[]{0.0f, 1.0f});
            setDuration(200);
            addUpdateListener(this);
            matrix.getValues(this.f103139b);
            matrix2.getValues(this.f103140c);
        }
    }

    public int getPinchMode() {
        return this.f103119e;
    }

    public void setScaleType(ScaleType scaleType) {
    }

    /* renamed from: d */
    private void m89788d() {
        super.setScaleType(ScaleType.MATRIX);
    }

    public RectF getMask() {
        if (this.f103118d != null) {
            return new RectF(this.f103118d);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo82664c() {
        if (this.f103120f != null) {
            this.f103120f.cancel();
            this.f103120f = null;
        }
        if (this.f103121g != null) {
            this.f103121g.cancel();
            this.f103121g = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo82663b() {
        if (getDrawable() == null || getDrawable().getIntrinsicWidth() <= 0 || getDrawable().getIntrinsicHeight() <= 0 || getWidth() <= 0 || getHeight() <= 0) {
            return false;
        }
        return true;
    }

    private float getMinScale() {
        if (!mo82663b() || this.f103123i == null) {
            return 1.0f;
        }
        float intrinsicWidth = ((float) getDrawable().getIntrinsicWidth()) / ((float) getDrawable().getIntrinsicHeight());
        float width = ((float) getWidth()) / ((float) getHeight());
        if (intrinsicWidth >= ((float) this.f103123i.width()) / ((float) this.f103123i.height()) && intrinsicWidth >= width) {
            return ((float) this.f103123i.height()) / (((float) getWidth()) / intrinsicWidth);
        }
        return (((float) this.f103123i.width()) / ((float) getWidth())) * (((float) getWidth()) / (C40407b.m89804c(m89785a((Matrix) null))[0] * ((float) getDrawable().getIntrinsicWidth())));
    }

    /* access modifiers changed from: protected */
    public float getMaxScale() {
        float f;
        if (!mo82663b()) {
            f = 4.0f;
        } else if (((float) getDrawable().getIntrinsicWidth()) / ((float) getDrawable().getIntrinsicHeight()) < ((float) getWidth()) / ((float) getHeight())) {
            f = ((float) getWidth()) / ((float) getDrawable().getIntrinsicWidth());
        } else {
            f = ((float) getHeight()) / ((float) getDrawable().getIntrinsicHeight());
        }
        return Math.max(f, 4.0f);
    }

    /* renamed from: a */
    public final void mo82660a() {
        if (this.f103124j != null) {
            this.f103126l++;
            Iterator it = this.f103124j.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.f103126l--;
            if (this.f103126l == 0 && this.f103125k != null) {
                this.f103124j = this.f103125k;
                this.f103125k = null;
            }
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f103115a = onClickListener;
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f103116b = onLongClickListener;
    }

    public void setDisplayWindowRect(Rect rect) {
        this.f103123i = rect;
        if (rect != null) {
            this.f103122h = true;
        }
    }

    /* renamed from: b */
    private Matrix m89787b(Matrix matrix) {
        Matrix a = m89785a(matrix);
        a.postConcat(this.f103117c);
        return a;
    }

    public PinchImageView(Context context) {
        super(context);
        m89788d();
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f103119e == 2) {
            return true;
        }
        RectF a = mo82659a((RectF) null);
        if (a == null || a.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (a.right > ((float) getWidth())) {
                return true;
            }
            return false;
        } else if (a.left < 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canScrollVertically(int i) {
        if (this.f103119e == 2) {
            return true;
        }
        RectF a = mo82659a((RectF) null);
        if (a == null || a.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (a.bottom > ((float) getHeight())) {
                return true;
            }
            return false;
        } else if (a.top < 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (mo82663b()) {
            Matrix a = C40407b.m89795a();
            setImageMatrix(m89787b(a));
            C40407b.m89802b(a);
        }
        if (this.f103118d != null) {
            canvas.save();
            canvas.clipRect(this.f103118d);
            super.onDraw(canvas);
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private Matrix m89785a(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (mo82663b()) {
            RectF a = C40407b.m89797a(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
            RectF a2 = C40407b.m89797a(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            matrix.setRectToRect(a, a2, ScaleToFit.CENTER);
            C40407b.m89798a(a2);
            C40407b.m89798a(a);
        }
        return matrix;
    }

    /* renamed from: a */
    public final RectF mo82659a(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (!mo82663b()) {
            return rectF;
        }
        Matrix a = C40407b.m89795a();
        m89787b(a);
        rectF.set(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
        a.mapRect(rectF);
        C40407b.m89802b(a);
        return rectF;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        int width;
        float f2;
        int height;
        int width2;
        int height2;
        float f3;
        boolean z;
        float f4;
        float f5;
        MotionEvent motionEvent2 = motionEvent;
        super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action == 1 || action == 3) {
            if (this.f103119e == 2 && mo82663b()) {
                Matrix a = C40407b.m89795a();
                m89787b(a);
                float f6 = C40407b.m89804c(a)[0];
                float f7 = C40407b.m89804c(this.f103117c)[0];
                if (this.f103122h) {
                    f = (float) this.f103123i.left;
                } else {
                    f = 0.0f;
                }
                if (this.f103122h) {
                    width = this.f103123i.right;
                } else {
                    width = getWidth();
                }
                float f8 = (float) width;
                if (this.f103122h) {
                    f2 = (float) this.f103123i.top;
                } else {
                    f2 = 0.0f;
                }
                if (this.f103122h) {
                    height = this.f103123i.bottom;
                } else {
                    height = getHeight();
                }
                float f9 = (float) height;
                if (this.f103122h) {
                    width2 = this.f103123i.width();
                } else {
                    width2 = getWidth();
                }
                float f10 = (float) width2;
                if (this.f103122h) {
                    height2 = this.f103123i.height();
                } else {
                    height2 = getHeight();
                }
                float f11 = (float) height2;
                float maxScale = getMaxScale();
                if (f6 > maxScale) {
                    f3 = maxScale / f6;
                } else {
                    f3 = 1.0f;
                }
                float minScale = getMinScale();
                if (f7 * f3 < minScale) {
                    f3 = minScale / f7;
                }
                if (f3 != 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                Matrix a2 = C40407b.m89796a(a);
                a2.postScale(f3, f3, this.f103127m.x, this.f103127m.y);
                RectF a3 = C40407b.m89797a(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
                a2.mapRect(a3);
                if (a3.right - a3.left < f10) {
                    f4 = ((f + f8) / 2.0f) - ((a3.right + a3.left) / 2.0f);
                } else if (a3.left > f) {
                    f4 = f - a3.left;
                } else if (a3.right < f8) {
                    f4 = f8 - a3.right;
                } else {
                    f4 = 0.0f;
                }
                if (a3.bottom - a3.top < f11) {
                    f5 = ((f2 + f9) / 2.0f) - ((a3.bottom + a3.top) / 2.0f);
                } else if (a3.top > f2) {
                    f5 = f2 - a3.top;
                } else if (a3.bottom < f9) {
                    f5 = f9 - a3.bottom;
                } else {
                    f5 = 0.0f;
                }
                if (!(f4 == 0.0f && f5 == 0.0f)) {
                    z = true;
                }
                if (z) {
                    Matrix a4 = C40407b.m89796a(this.f103117c);
                    a4.postScale(f3, f3, this.f103127m.x, this.f103127m.y);
                    a4.postTranslate(f4, f5);
                    mo82664c();
                    this.f103120f = new C40411f(this, this.f103117c, a4);
                    this.f103120f.start();
                    C40407b.m89802b(a4);
                }
                C40407b.m89798a(a3);
                C40407b.m89802b(a2);
                C40407b.m89802b(a);
            }
            this.f103119e = 0;
        } else if (action == 6) {
            if (this.f103119e == 2 && motionEvent.getPointerCount() > 2) {
                if ((motionEvent.getAction() >> 8) == 0) {
                    m89786a(motionEvent2.getX(1), motionEvent2.getY(1), motionEvent2.getX(2), motionEvent2.getY(2));
                } else if ((motionEvent.getAction() >> 8) == 1) {
                    m89786a(motionEvent2.getX(0), motionEvent2.getY(0), motionEvent2.getX(2), motionEvent2.getY(2));
                }
            }
        } else if (action == 0) {
            if (this.f103120f == null || !this.f103120f.isRunning()) {
                mo82664c();
                this.f103119e = 1;
                this.f103127m.set(motionEvent.getX(), motionEvent.getY());
            }
        } else if (action == 5) {
            mo82664c();
            this.f103119e = 2;
            m89786a(motionEvent2.getX(0), motionEvent2.getY(0), motionEvent2.getX(1), motionEvent2.getY(1));
        } else if (action == 2 && (this.f103120f == null || !this.f103120f.isRunning())) {
            if (this.f103119e == 1) {
                mo82661a(motionEvent.getX() - this.f103127m.x, motionEvent.getY() - this.f103127m.y);
                this.f103127m.set(motionEvent.getX(), motionEvent.getY());
            } else if (this.f103119e == 2 && motionEvent.getPointerCount() > 1) {
                float b = C40407b.m89800b(motionEvent2.getX(0), motionEvent2.getY(0), motionEvent2.getX(1), motionEvent2.getY(1));
                float[] c = C40407b.m89803c(motionEvent2.getX(0), motionEvent2.getY(0), motionEvent2.getX(1), motionEvent2.getY(1));
                this.f103127m.set(c[0], c[1]);
                PointF pointF = this.f103128n;
                float f12 = this.f103129o;
                PointF pointF2 = this.f103127m;
                if (mo82663b()) {
                    float f13 = f12 * b;
                    Matrix a5 = C40407b.m89795a();
                    a5.postScale(f13, f13, pointF.x, pointF.y);
                    a5.postTranslate(pointF2.x - pointF.x, pointF2.y - pointF.y);
                    this.f103117c.set(a5);
                    C40407b.m89802b(a5);
                    mo82660a();
                    invalidate();
                }
            }
        }
        this.f103130p.onTouchEvent(motionEvent2);
        return true;
    }

    public PinchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m89788d();
    }

    /* renamed from: b */
    public final void mo82662b(float f, float f2) {
        float f3;
        int width;
        float f4;
        int height;
        int width2;
        int height2;
        float f5;
        float f6;
        float f7;
        float f8 = f;
        float f9 = f2;
        if (mo82663b()) {
            Matrix a = C40407b.m89795a();
            m89785a(a);
            float f10 = C40407b.m89804c(a)[0];
            float f11 = C40407b.m89804c(this.f103117c)[0] * f10;
            if (this.f103122h) {
                f3 = (float) this.f103123i.left;
            } else {
                f3 = 0.0f;
            }
            if (this.f103122h) {
                width = this.f103123i.right;
            } else {
                width = getWidth();
            }
            float f12 = (float) width;
            if (this.f103122h) {
                f4 = (float) this.f103123i.top;
            } else {
                f4 = 0.0f;
            }
            if (this.f103122h) {
                height = this.f103123i.bottom;
            } else {
                height = getHeight();
            }
            float f13 = (float) height;
            if (this.f103122h) {
                width2 = this.f103123i.width();
            } else {
                width2 = getWidth();
            }
            float f14 = (float) width2;
            if (this.f103122h) {
                height2 = this.f103123i.height();
            } else {
                height2 = getHeight();
            }
            float f15 = (float) height2;
            float maxScale = getMaxScale();
            if (f11 < getMaxScale()) {
                f5 = getMaxScale();
            } else {
                f5 = f10;
            }
            if (f5 <= maxScale) {
                maxScale = f5;
            }
            if (maxScale < f10) {
                maxScale = f10;
            }
            Matrix a2 = C40407b.m89796a(this.f103117c);
            float f16 = maxScale / f11;
            a2.postScale(f16, f16, f8, f9);
            float f17 = f14 / 2.0f;
            float f18 = f15 / 2.0f;
            a2.postTranslate(f17 - f8, f18 - f9);
            Matrix a3 = C40407b.m89796a(a);
            a3.postConcat(a2);
            RectF a4 = C40407b.m89797a(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
            a3.mapRect(a4);
            if (a4.right - a4.left < f14) {
                f6 = f17 - ((a4.right + a4.left) / 2.0f);
            } else if (a4.left > f3) {
                f6 = f3 - a4.left;
            } else if (a4.right < f12) {
                f6 = f12 - a4.right;
            } else {
                f6 = 0.0f;
            }
            if (a4.bottom - a4.top < f15) {
                f7 = f18 - ((a4.bottom + a4.top) / 2.0f);
            } else if (a4.top > f4) {
                f7 = f4 - a4.top;
            } else if (a4.bottom < f13) {
                f7 = f13 - a4.bottom;
            } else {
                f7 = 0.0f;
            }
            a2.postTranslate(f6, f7);
            mo82664c();
            this.f103120f = new C40411f(this, this.f103117c, a2);
            this.f103120f.start();
            C40407b.m89798a(a4);
            C40407b.m89802b(a3);
            C40407b.m89802b(a2);
            C40407b.m89802b(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo82661a(float r12, float r13) {
        /*
            r11 = this;
            boolean r0 = r11.mo82663b()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.graphics.RectF r0 = com.p683ss.android.ugc.aweme.profile.p2090ui.widget.PinchImageView.C40407b.m89801b()
            r11.mo82659a(r0)
            boolean r2 = r11.f103122h
            r3 = 0
            if (r2 == 0) goto L_0x001a
            android.graphics.Rect r2 = r11.f103123i
            int r2 = r2.left
            float r2 = (float) r2
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            boolean r4 = r11.f103122h
            if (r4 == 0) goto L_0x0025
            android.graphics.Rect r4 = r11.f103123i
            int r4 = r4.right
        L_0x0023:
            float r4 = (float) r4
            goto L_0x002a
        L_0x0025:
            int r4 = r11.getWidth()
            goto L_0x0023
        L_0x002a:
            boolean r5 = r11.f103122h
            if (r5 == 0) goto L_0x0034
            android.graphics.Rect r5 = r11.f103123i
            int r5 = r5.top
            float r5 = (float) r5
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            boolean r6 = r11.f103122h
            if (r6 == 0) goto L_0x003f
            android.graphics.Rect r6 = r11.f103123i
            int r6 = r6.bottom
        L_0x003d:
            float r6 = (float) r6
            goto L_0x0044
        L_0x003f:
            int r6 = r11.getHeight()
            goto L_0x003d
        L_0x0044:
            boolean r7 = r11.f103122h
            if (r7 == 0) goto L_0x0050
            android.graphics.Rect r7 = r11.f103123i
            int r7 = r7.width()
        L_0x004e:
            float r7 = (float) r7
            goto L_0x0055
        L_0x0050:
            int r7 = r11.getWidth()
            goto L_0x004e
        L_0x0055:
            boolean r8 = r11.f103122h
            if (r8 == 0) goto L_0x0061
            android.graphics.Rect r8 = r11.f103123i
            int r8 = r8.height()
        L_0x005f:
            float r8 = (float) r8
            goto L_0x0066
        L_0x0061:
            int r8 = r11.getHeight()
            goto L_0x005f
        L_0x0066:
            float r9 = r0.right
            float r10 = r0.left
            float r9 = r9 - r10
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0093
            float r7 = r0.left
            float r7 = r7 + r12
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0081
            float r12 = r0.left
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x0093
            float r12 = r0.left
            float r12 = r2 - r12
            goto L_0x0094
        L_0x0081:
            float r2 = r0.right
            float r2 = r2 + r12
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0094
            float r12 = r0.right
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0093
            float r12 = r0.right
            float r12 = r4 - r12
            goto L_0x0094
        L_0x0093:
            r12 = 0
        L_0x0094:
            float r2 = r0.bottom
            float r4 = r0.top
            float r2 = r2 - r4
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x00c1
            float r2 = r0.top
            float r2 = r2 + r13
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x00af
            float r13 = r0.top
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L_0x00c1
            float r13 = r0.top
            float r13 = r5 - r13
            goto L_0x00c2
        L_0x00af:
            float r2 = r0.bottom
            float r2 = r2 + r13
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c2
            float r13 = r0.bottom
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x00c1
            float r13 = r0.bottom
            float r13 = r6 - r13
            goto L_0x00c2
        L_0x00c1:
            r13 = 0
        L_0x00c2:
            com.p683ss.android.ugc.aweme.profile.p2090ui.widget.PinchImageView.C40407b.m89798a(r0)
            android.graphics.Matrix r0 = r11.f103117c
            r0.postTranslate(r12, r13)
            r11.mo82660a()
            r11.invalidate()
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x00da
            int r12 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            return r1
        L_0x00da:
            r12 = 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.widget.PinchImageView.mo82661a(float, float):boolean");
    }

    public PinchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m89788d();
    }

    /* renamed from: a */
    private void m89786a(float f, float f2, float f3, float f4) {
        this.f103129o = C40407b.m89804c(this.f103117c)[0] / C40407b.m89800b(f, f2, f3, f4);
        float[] a = C40407b.m89799a(C40407b.m89803c(f, f2, f3, f4), this.f103117c);
        this.f103128n.set(a[0], a[1]);
    }
}
