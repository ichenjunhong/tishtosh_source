package com.github.rahatarmanahmed.cpv;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CircularProgressView extends View {

    /* renamed from: a */
    public boolean f38147a;

    /* renamed from: b */
    public float f38148b;

    /* renamed from: c */
    public float f38149c;

    /* renamed from: d */
    public List<Object> f38150d;

    /* renamed from: e */
    public float f38151e;

    /* renamed from: f */
    public float f38152f;

    /* renamed from: g */
    private Paint f38153g;

    /* renamed from: h */
    private int f38154h;

    /* renamed from: i */
    private RectF f38155i;

    /* renamed from: j */
    private boolean f38156j;

    /* renamed from: k */
    private float f38157k;

    /* renamed from: l */
    private float f38158l;

    /* renamed from: m */
    private int f38159m;

    /* renamed from: n */
    private int f38160n;

    /* renamed from: o */
    private int f38161o;

    /* renamed from: p */
    private int f38162p;

    /* renamed from: q */
    private int f38163q;

    /* renamed from: r */
    private int f38164r;

    /* renamed from: s */
    private ValueAnimator f38165s;

    /* renamed from: t */
    private ValueAnimator f38166t;

    /* renamed from: u */
    private AnimatorSet f38167u;

    /* renamed from: v */
    private float f38168v;

    /* renamed from: a */
    public final void mo26995a() {
        mo26996b();
    }

    public int getColor() {
        return this.f38160n;
    }

    public float getMaxProgress() {
        return this.f38158l;
    }

    public float getProgress() {
        return this.f38157k;
    }

    public int getThickness() {
        return this.f38159m;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo26997c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f38156j) {
            mo26995a();
        }
    }

    /* renamed from: e */
    private void m30112e() {
        this.f38153g.setColor(this.f38160n);
        this.f38153g.setStyle(Style.STROKE);
        this.f38153g.setStrokeWidth((float) this.f38159m);
        this.f38153g.setStrokeCap(Cap.BUTT);
    }

    /* renamed from: d */
    private void m30111d() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f38155i.set((float) (this.f38159m + paddingLeft), (float) (this.f38159m + paddingTop), (float) ((this.f38154h - paddingLeft) - this.f38159m), (float) ((this.f38154h - paddingTop) - this.f38159m));
    }

    /* renamed from: c */
    public final void mo26997c() {
        if (this.f38165s != null) {
            this.f38165s.cancel();
            this.f38165s = null;
        }
        if (this.f38166t != null) {
            this.f38166t.cancel();
            this.f38166t = null;
        }
        if (this.f38167u != null) {
            this.f38167u.cancel();
            this.f38167u = null;
        }
    }

    /* renamed from: b */
    public final void mo26996b() {
        if (this.f38165s != null && this.f38165s.isRunning()) {
            this.f38165s.cancel();
        }
        if (this.f38166t != null && this.f38166t.isRunning()) {
            this.f38166t.cancel();
        }
        if (this.f38167u != null && this.f38167u.isRunning()) {
            this.f38167u.cancel();
        }
        int i = 0;
        if (!this.f38147a) {
            this.f38151e = this.f38168v;
            this.f38165s = ValueAnimator.ofFloat(new float[]{this.f38151e, this.f38151e + 360.0f});
            this.f38165s.setDuration((long) this.f38162p);
            this.f38165s.setInterpolator(new DecelerateInterpolator(2.0f));
            this.f38165s.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f38151e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f38165s.start();
            this.f38152f = 0.0f;
            this.f38166t = ValueAnimator.ofFloat(new float[]{this.f38152f, this.f38157k});
            this.f38166t.setDuration((long) this.f38163q);
            this.f38166t.setInterpolator(new LinearInterpolator());
            this.f38166t.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f38152f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f38166t.start();
            return;
        }
        this.f38148b = 15.0f;
        this.f38167u = new AnimatorSet();
        Animator animator = null;
        while (i < this.f38164r) {
            AnimatorSet a = m30108a((float) i);
            Builder play = this.f38167u.play(a);
            if (animator != null) {
                play.after(animator);
            }
            i++;
            animator = a;
        }
        this.f38167u.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a */
            boolean f38174a;

            public final void onAnimationCancel(Animator animator) {
                this.f38174a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f38174a) {
                    CircularProgressView.this.mo26996b();
                }
            }
        });
        this.f38167u.start();
        Iterator it = this.f38150d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void setMaxProgress(float f) {
        this.f38158l = f;
        invalidate();
    }

    public CircularProgressView(Context context) {
        super(context);
        m30109a(null, 0);
    }

    public void setColor(int i) {
        this.f38160n = i;
        m30112e();
        invalidate();
    }

    public void setThickness(int i) {
        this.f38159m = i;
        m30112e();
        m30111d();
        invalidate();
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i != visibility) {
            if (i == 0) {
                mo26996b();
            } else if (i == 8 || i == 4) {
                mo26997c();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (isInEditMode()) {
            f = this.f38157k;
        } else {
            f = this.f38152f;
        }
        float f2 = (f / this.f38158l) * 360.0f;
        if (!this.f38147a) {
            canvas.drawArc(this.f38155i, this.f38151e, f2, false, this.f38153g);
            return;
        }
        canvas.drawArc(this.f38155i, this.f38151e + this.f38149c, this.f38148b, false, this.f38153g);
    }

    public void setIndeterminate(boolean z) {
        boolean z2;
        boolean z3 = this.f38147a;
        if (this.f38147a == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f38147a = z;
        if (z2) {
            mo26996b();
        }
        if (z3 != z) {
            Iterator it = this.f38150d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setProgress(final float f) {
        this.f38157k = f;
        if (!this.f38147a) {
            if (this.f38166t != null && this.f38166t.isRunning()) {
                this.f38166t.cancel();
            }
            this.f38166t = ValueAnimator.ofFloat(new float[]{this.f38152f, f});
            this.f38166t.setDuration((long) this.f38163q);
            this.f38166t.setInterpolator(new LinearInterpolator());
            this.f38166t.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f38152f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f38166t.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    Iterator it = CircularProgressView.this.f38150d.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
            this.f38166t.start();
        }
        invalidate();
        Iterator it = this.f38150d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    private AnimatorSet m30108a(float f) {
        final float f2 = ((((float) (this.f38164r - 1)) * 360.0f) / ((float) this.f38164r)) + 15.0f;
        final float f3 = ((f2 - 15.0f) * f) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{15.0f, f2});
        ofFloat.setDuration((long) ((this.f38161o / this.f38164r) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f38148b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(f * 720.0f) / ((float) this.f38164r), f4 / ((float) this.f38164r)});
        ofFloat2.setDuration((long) ((this.f38161o / this.f38164r) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f38149c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f3, (f3 + f2) - 15.0f});
        ofFloat3.setDuration((long) ((this.f38161o / this.f38164r) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f38151e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.f38148b = (f2 - CircularProgressView.this.f38151e) + f3;
                CircularProgressView.this.invalidate();
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f4 / ((float) this.f38164r), ((f + 1.0f) * 720.0f) / ((float) this.f38164r)});
        ofFloat4.setDuration((long) ((this.f38161o / this.f38164r) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f38149c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30109a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m30109a(AttributeSet attributeSet, int i) {
        this.f38150d = new ArrayList();
        m30110b(attributeSet, i);
        this.f38153g = new Paint(1);
        m30112e();
        this.f38155i = new RectF();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int measuredWidth = getMeasuredWidth() - paddingLeft;
        int measuredHeight = getMeasuredHeight() - paddingTop;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.f38154h = measuredWidth;
        setMeasuredDimension(this.f38154h + paddingLeft, this.f38154h + paddingTop);
    }

    /* renamed from: b */
    private void m30110b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ir, R.attr.is, R.attr.it, R.attr.iu, R.attr.iv, R.attr.iw, R.attr.ix, R.attr.iy, R.attr.iz, R.attr.j0, R.attr.j1}, i, 0);
        Resources resources = getResources();
        this.f38157k = obtainStyledAttributes.getFloat(8, (float) resources.getInteger(R.integer.t));
        this.f38158l = obtainStyledAttributes.getFloat(7, (float) resources.getInteger(R.integer.s));
        this.f38159m = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.f2));
        this.f38147a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.e));
        this.f38156j = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.d));
        this.f38168v = obtainStyledAttributes.getFloat(9, (float) resources.getInteger(R.integer.u));
        this.f38151e = this.f38168v;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.f38160n = obtainStyledAttributes.getColor(5, resources.getColor(R.color.k7));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.f38160n = typedValue.data;
        } else if (VERSION.SDK_INT >= 21) {
            this.f38160n = getContext().obtainStyledAttributes(new int[]{16843829}).getColor(0, resources.getColor(R.color.k7));
        } else {
            this.f38160n = resources.getColor(R.color.k7);
        }
        this.f38161o = obtainStyledAttributes.getInteger(1, resources.getInteger(R.integer.o));
        this.f38162p = obtainStyledAttributes.getInteger(3, resources.getInteger(R.integer.q));
        this.f38163q = obtainStyledAttributes.getInteger(4, resources.getInteger(R.integer.r));
        this.f38164r = obtainStyledAttributes.getInteger(2, resources.getInteger(R.integer.p));
        obtainStyledAttributes.recycle();
    }

    public CircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30109a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.f38154h = i;
        m30111d();
    }
}
