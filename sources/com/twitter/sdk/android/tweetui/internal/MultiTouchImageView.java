package com.twitter.sdk.android.tweetui.internal;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.twitter.sdk.android.tweetui.internal.C52296f.C52298b;

public class MultiTouchImageView extends ImageView implements C52298b {

    /* renamed from: a */
    final ScaleGestureDetector f130158a;

    /* renamed from: b */
    final GestureDetector f130159b;

    /* renamed from: c */
    final Matrix f130160c;

    /* renamed from: d */
    final Matrix f130161d;

    /* renamed from: e */
    final Matrix f130162e;

    /* renamed from: f */
    final RectF f130163f;

    /* renamed from: g */
    final RectF f130164g;

    /* renamed from: h */
    final float[] f130165h;

    /* renamed from: i */
    boolean f130166i;

    /* renamed from: c */
    private boolean m111697c() {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo109036a() {
        m111698d();
        setScaleType(ScaleType.MATRIX);
        setImageMatrix(getDrawMatrix());
    }

    /* renamed from: b */
    public final boolean mo109041b() {
        if (getScale() == 1.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public float getScale() {
        this.f130162e.getValues(this.f130165h);
        return this.f130165h[0];
    }

    /* access modifiers changed from: 0000 */
    public Matrix getDrawMatrix() {
        this.f130160c.set(this.f130161d);
        this.f130160c.postConcat(this.f130162e);
        return this.f130160c;
    }

    /* renamed from: d */
    private void m111698d() {
        float f;
        Matrix drawMatrix = getDrawMatrix();
        Drawable drawable = getDrawable();
        float f2 = 0.0f;
        if (drawable != null) {
            this.f130164g.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            drawMatrix.mapRect(this.f130164g);
        }
        RectF rectF = this.f130164g;
        if (rectF.height() <= this.f130163f.height()) {
            f = ((this.f130163f.height() - rectF.height()) / 2.0f) - rectF.top;
        } else if (rectF.top > 0.0f) {
            f = -rectF.top;
        } else if (rectF.bottom < this.f130163f.height()) {
            f = this.f130163f.height() - rectF.bottom;
        } else {
            f = 0.0f;
        }
        if (rectF.width() <= this.f130163f.width()) {
            this.f130166i = true;
            f2 = ((this.f130163f.width() - rectF.width()) / 2.0f) - rectF.left;
        } else if (rectF.left > 0.0f) {
            this.f130166i = true;
            f2 = -rectF.left;
        } else if (rectF.right < this.f130163f.width()) {
            this.f130166i = true;
            f2 = this.f130163f.width() - rectF.right;
        } else {
            this.f130166i = false;
        }
        mo109037a(f2, f);
    }

    public MultiTouchImageView(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!m111697c()) {
            return false;
        }
        mo109040a(true);
        boolean onTouchEvent = this.f130158a.onTouchEvent(motionEvent);
        if (this.f130159b.onTouchEvent(motionEvent) || onTouchEvent) {
            z = true;
        } else {
            z = false;
        }
        if (z || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo109040a(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo109037a(float f, float f2) {
        this.f130162e.postTranslate(f, f2);
    }

    public MultiTouchImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo109038a(float f, float f2, float f3) {
        this.f130162e.postScale(f, f, f2, f3);
    }

    public MultiTouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f130160c = new Matrix();
        this.f130161d = new Matrix();
        this.f130162e = new Matrix();
        this.f130163f = new RectF();
        this.f130164g = new RectF();
        this.f130165h = new float[9];
        this.f130158a = new ScaleGestureDetector(context, new SimpleOnScaleGestureListener() {
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                MultiTouchImageView.this.mo109038a(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                MultiTouchImageView.this.mo109036a();
                return true;
            }

            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                if (MultiTouchImageView.this.getScale() < 1.0f) {
                    MultiTouchImageView.this.f130162e.reset();
                    MultiTouchImageView.this.mo109036a();
                }
            }
        });
        this.f130159b = new GestureDetector(context, new SimpleOnGestureListener() {
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                if (MultiTouchImageView.this.getScale() > 1.0f) {
                    MultiTouchImageView.this.mo109039a(MultiTouchImageView.this.getScale(), 1.0f, motionEvent.getX(), motionEvent.getY());
                } else {
                    MultiTouchImageView.this.mo109039a(MultiTouchImageView.this.getScale(), 2.0f, motionEvent.getX(), motionEvent.getY());
                }
                return true;
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                MultiTouchImageView.this.mo109037a(-f, -f2);
                MultiTouchImageView.this.mo109036a();
                if (MultiTouchImageView.this.f130166i && !MultiTouchImageView.this.f130158a.isInProgress()) {
                    MultiTouchImageView.this.mo109040a(false);
                }
                return true;
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo109039a(float f, float f2, float f3, float f4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new C52293d(this, f3, f4));
        ofFloat.start();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (m111697c()) {
            this.f130163f.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
            Drawable drawable = getDrawable();
            RectF rectF = new RectF(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            this.f130161d.reset();
            this.f130161d.setRectToRect(rectF, this.f130163f, ScaleToFit.CENTER);
            mo109036a();
        }
    }
}
