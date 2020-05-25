package com.p683ss.android.ugc.tools.view.widget;

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

/* renamed from: com.ss.android.ugc.tools.view.widget.CircularProgressView */
public class CircularProgressView extends View {

    /* renamed from: a */
    public boolean f125978a;

    /* renamed from: b */
    public float f125979b;

    /* renamed from: c */
    public float f125980c;

    /* renamed from: d */
    public float f125981d;

    /* renamed from: e */
    private Paint f125982e;

    /* renamed from: f */
    private int f125983f;

    /* renamed from: g */
    private RectF f125984g;

    /* renamed from: h */
    private boolean f125985h;

    /* renamed from: i */
    private boolean f125986i;

    /* renamed from: j */
    private boolean f125987j;

    /* renamed from: k */
    private float f125988k;

    /* renamed from: l */
    private float f125989l;

    /* renamed from: m */
    private int f125990m;

    /* renamed from: n */
    private int f125991n;

    /* renamed from: o */
    private int f125992o;

    /* renamed from: p */
    private int f125993p;

    /* renamed from: q */
    private int f125994q;

    /* renamed from: r */
    private int f125995r;

    /* renamed from: s */
    private ValueAnimator f125996s;

    /* renamed from: t */
    private ValueAnimator f125997t;

    /* renamed from: u */
    private AnimatorSet f125998u;

    /* renamed from: v */
    private float f125999v;

    public int getColor() {
        return this.f125991n;
    }

    public float getMaxProgress() {
        return this.f125989l;
    }

    public float getProgress() {
        return this.f125988k;
    }

    public int getThickness() {
        return this.f125990m;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f125987j = false;
        mo98127b();
    }

    /* renamed from: d */
    private void m108488d() {
        this.f125982e.setColor(this.f125991n);
        this.f125982e.setStyle(Style.STROKE);
        this.f125982e.setStrokeWidth((float) this.f125990m);
        this.f125982e.setStrokeCap(Cap.ROUND);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f125987j = true;
        if (this.f125985h || this.f125986i) {
            mo98126a();
        }
    }

    /* renamed from: c */
    private void m108487c() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f125984g.set((float) (this.f125990m + paddingLeft), (float) (this.f125990m + paddingTop), (float) ((this.f125983f - paddingLeft) - this.f125990m), (float) ((this.f125983f - paddingTop) - this.f125990m));
    }

    /* renamed from: b */
    public final void mo98127b() {
        this.f125986i = false;
        if (this.f125996s != null) {
            this.f125996s.cancel();
            this.f125996s = null;
        }
        if (this.f125997t != null) {
            this.f125997t.cancel();
            this.f125997t = null;
        }
        if (this.f125998u != null) {
            this.f125998u.cancel();
            this.f125998u = null;
        }
    }

    /* renamed from: a */
    public final void mo98126a() {
        if (!this.f125987j) {
            this.f125986i = true;
            return;
        }
        int i = 0;
        this.f125986i = false;
        if (this.f125996s != null && this.f125996s.isRunning()) {
            this.f125996s.cancel();
        }
        if (this.f125997t != null && this.f125997t.isRunning()) {
            this.f125997t.cancel();
        }
        if (this.f125998u != null && this.f125998u.isRunning()) {
            this.f125998u.cancel();
        }
        if (!this.f125978a) {
            this.f125981d = this.f125999v;
            this.f125996s = ValueAnimator.ofFloat(new float[]{this.f125981d, this.f125981d + 360.0f});
            this.f125996s.setDuration((long) this.f125993p);
            this.f125996s.setInterpolator(new DecelerateInterpolator(2.0f));
            this.f125996s.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f125981d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f125996s.start();
            return;
        }
        this.f125979b = 15.0f;
        this.f125998u = new AnimatorSet();
        Animator animator = null;
        while (i < this.f125995r) {
            AnimatorSet a = m108484a((float) i);
            Builder play = this.f125998u.play(a);
            if (animator != null) {
                play.after(animator);
            }
            i++;
            animator = a;
        }
        this.f125998u.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a */
            boolean f126001a;

            public final void onAnimationCancel(Animator animator) {
                this.f126001a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f126001a) {
                    CircularProgressView.this.mo98126a();
                }
            }
        });
        this.f125998u.start();
    }

    public void setMaxProgress(float f) {
        this.f125989l = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.f125988k = f;
        invalidate();
    }

    public CircularProgressView(Context context) {
        super(context);
        m108485a(null, 0);
    }

    public void setColor(int i) {
        this.f125991n = i;
        m108488d();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        boolean z2;
        if (this.f125978a != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f125978a = z;
            mo98126a();
        }
    }

    public void setThickness(int i) {
        this.f125990m = i;
        m108488d();
        m108487c();
        invalidate();
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i != visibility) {
            if (i == 0) {
                mo98126a();
            } else if (i == 8 || i == 4) {
                mo98127b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        isInEditMode();
        float f = (this.f125988k / this.f125989l) * 360.0f;
        if (!this.f125978a) {
            canvas.drawArc(this.f125984g, this.f125981d, f, false, this.f125982e);
            return;
        }
        canvas.drawArc(this.f125984g, this.f125981d + this.f125980c, this.f125979b, false, this.f125982e);
    }

    /* renamed from: a */
    private AnimatorSet m108484a(float f) {
        final float f2 = ((((float) (this.f125995r - 1)) * 360.0f) / ((float) this.f125995r)) + 15.0f;
        final float f3 = ((f2 - 15.0f) * f) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{15.0f, f2});
        ofFloat.setDuration((long) ((this.f125992o / this.f125995r) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f125979b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(f * 720.0f) / ((float) this.f125995r), f4 / ((float) this.f125995r)});
        ofFloat2.setDuration((long) ((this.f125992o / this.f125995r) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f125980c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f3, (f3 + f2) - 15.0f});
        ofFloat3.setDuration((long) ((this.f125992o / this.f125995r) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f125981d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.f125979b = (f2 - CircularProgressView.this.f125981d) + f3;
                CircularProgressView.this.invalidate();
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f4 / ((float) this.f125995r), ((f + 1.0f) * 720.0f) / ((float) this.f125995r)});
        ofFloat4.setDuration((long) ((this.f125992o / this.f125995r) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f125980c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m108485a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m108485a(AttributeSet attributeSet, int i) {
        m108486b(attributeSet, i);
        this.f125982e = new Paint(1);
        m108488d();
        this.f125984g = new RectF();
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
        this.f125983f = measuredWidth;
        setMeasuredDimension(this.f125983f + paddingLeft, this.f125983f + paddingTop);
    }

    /* renamed from: b */
    private void m108486b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ir, R.attr.is, R.attr.it, R.attr.iu, R.attr.iv, R.attr.iw, R.attr.ix, R.attr.iy, R.attr.iz, R.attr.j0, R.attr.j1}, i, 0);
        Resources resources = getResources();
        this.f125988k = obtainStyledAttributes.getFloat(8, (float) resources.getInteger(R.integer.t));
        this.f125989l = obtainStyledAttributes.getFloat(7, (float) resources.getInteger(R.integer.s));
        this.f125990m = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.f2));
        this.f125978a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.e));
        this.f125985h = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.d));
        this.f125999v = obtainStyledAttributes.getFloat(9, (float) resources.getInteger(R.integer.u));
        this.f125981d = this.f125999v;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.f125991n = obtainStyledAttributes.getColor(5, resources.getColor(R.color.k7));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.f125991n = typedValue.data;
        } else if (VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{16843829});
            this.f125991n = obtainStyledAttributes2.getColor(0, resources.getColor(R.color.k7));
            obtainStyledAttributes2.recycle();
        } else {
            this.f125991n = resources.getColor(R.color.k7);
        }
        this.f125992o = obtainStyledAttributes.getInteger(1, resources.getInteger(R.integer.o));
        this.f125993p = obtainStyledAttributes.getInteger(3, resources.getInteger(R.integer.q));
        this.f125994q = obtainStyledAttributes.getInteger(4, resources.getInteger(R.integer.r));
        this.f125995r = obtainStyledAttributes.getInteger(2, resources.getInteger(R.integer.p));
        obtainStyledAttributes.recycle();
    }

    public CircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m108485a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.f125983f = i;
        m108487c();
    }
}
