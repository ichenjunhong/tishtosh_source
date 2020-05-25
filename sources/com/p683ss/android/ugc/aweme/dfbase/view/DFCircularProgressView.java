package com.p683ss.android.ugc.aweme.dfbase.view;

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

/* renamed from: com.ss.android.ugc.aweme.dfbase.view.DFCircularProgressView */
public class DFCircularProgressView extends View {

    /* renamed from: a */
    public boolean f72461a;

    /* renamed from: b */
    public float f72462b;

    /* renamed from: c */
    public float f72463c;

    /* renamed from: d */
    public float f72464d;

    /* renamed from: e */
    private Paint f72465e;

    /* renamed from: f */
    private int f72466f;

    /* renamed from: g */
    private RectF f72467g;

    /* renamed from: h */
    private boolean f72468h;

    /* renamed from: i */
    private float f72469i;

    /* renamed from: j */
    private float f72470j;

    /* renamed from: k */
    private int f72471k;

    /* renamed from: l */
    private int f72472l;

    /* renamed from: m */
    private int f72473m;

    /* renamed from: n */
    private int f72474n;

    /* renamed from: o */
    private int f72475o;

    /* renamed from: p */
    private int f72476p;

    /* renamed from: q */
    private ValueAnimator f72477q;

    /* renamed from: r */
    private ValueAnimator f72478r;

    /* renamed from: s */
    private AnimatorSet f72479s;

    /* renamed from: t */
    private float f72480t;

    public int getColor() {
        return this.f72472l;
    }

    public float getMaxProgress() {
        return this.f72470j;
    }

    public float getProgress() {
        return this.f72469i;
    }

    public int getThickness() {
        return this.f72471k;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m66265d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f72468h) {
            mo56022a();
        }
    }

    /* renamed from: c */
    private void m66264c() {
        this.f72465e.setColor(this.f72472l);
        this.f72465e.setStyle(Style.STROKE);
        this.f72465e.setStrokeWidth((float) this.f72471k);
        this.f72465e.setStrokeCap(Cap.ROUND);
    }

    /* renamed from: b */
    private void m66262b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f72467g.set((float) (this.f72471k + paddingLeft), (float) (this.f72471k + paddingTop), (float) ((this.f72466f - paddingLeft) - this.f72471k), (float) ((this.f72466f - paddingTop) - this.f72471k));
    }

    /* renamed from: d */
    private void m66265d() {
        if (this.f72477q != null) {
            this.f72477q.cancel();
            this.f72477q = null;
        }
        if (this.f72478r != null) {
            this.f72478r.cancel();
            this.f72478r = null;
        }
        if (this.f72479s != null) {
            this.f72479s.cancel();
            this.f72479s = null;
        }
    }

    /* renamed from: a */
    public final void mo56022a() {
        if (this.f72477q != null && this.f72477q.isRunning()) {
            this.f72477q.cancel();
        }
        if (this.f72478r != null && this.f72478r.isRunning()) {
            this.f72478r.cancel();
        }
        if (this.f72479s != null && this.f72479s.isRunning()) {
            this.f72479s.cancel();
        }
        int i = 0;
        if (!this.f72461a) {
            this.f72464d = this.f72480t;
            this.f72477q = ValueAnimator.ofFloat(new float[]{this.f72464d, this.f72464d + 360.0f});
            this.f72477q.setDuration((long) this.f72474n);
            this.f72477q.setInterpolator(new DecelerateInterpolator(2.0f));
            this.f72477q.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DFCircularProgressView.this.f72464d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    DFCircularProgressView.this.invalidate();
                }
            });
            this.f72477q.start();
            return;
        }
        this.f72462b = 15.0f;
        this.f72479s = new AnimatorSet();
        Animator animator = null;
        while (i < this.f72476p) {
            AnimatorSet a = m66260a((float) i);
            Builder play = this.f72479s.play(a);
            if (animator != null) {
                play.after(animator);
            }
            i++;
            animator = a;
        }
        this.f72479s.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a */
            boolean f72482a;

            public final void onAnimationCancel(Animator animator) {
                this.f72482a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f72482a) {
                    DFCircularProgressView.this.mo56022a();
                }
            }
        });
        this.f72479s.start();
    }

    public void setMaxProgress(float f) {
        this.f72470j = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.f72469i = f;
        invalidate();
    }

    public DFCircularProgressView(Context context) {
        super(context);
        m66261a(null, 0);
    }

    public void setColor(int i) {
        this.f72472l = i;
        m66264c();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        boolean z2;
        if (this.f72461a != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f72461a = z;
            mo56022a();
        }
    }

    public void setThickness(int i) {
        this.f72471k = i;
        m66264c();
        m66262b();
        invalidate();
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i != visibility) {
            if (i == 0) {
                mo56022a();
            } else if (i == 8 || i == 4) {
                m66265d();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        isInEditMode();
        float f = (this.f72469i / this.f72470j) * 360.0f;
        if (!this.f72461a) {
            canvas.drawArc(this.f72467g, this.f72464d, f, false, this.f72465e);
            return;
        }
        canvas.drawArc(this.f72467g, this.f72464d + this.f72463c, this.f72462b, false, this.f72465e);
    }

    /* renamed from: a */
    private AnimatorSet m66260a(float f) {
        final float f2 = ((((float) (this.f72476p - 1)) * 360.0f) / ((float) this.f72476p)) + 15.0f;
        final float f3 = ((f2 - 15.0f) * f) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{15.0f, f2});
        ofFloat.setDuration((long) ((this.f72473m / this.f72476p) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DFCircularProgressView.this.f72462b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DFCircularProgressView.this.invalidate();
            }
        });
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(f * 720.0f) / ((float) this.f72476p), f4 / ((float) this.f72476p)});
        ofFloat2.setDuration((long) ((this.f72473m / this.f72476p) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DFCircularProgressView.this.f72463c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f3, (f3 + f2) - 15.0f});
        ofFloat3.setDuration((long) ((this.f72473m / this.f72476p) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DFCircularProgressView.this.f72464d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DFCircularProgressView.this.f72462b = (f2 - DFCircularProgressView.this.f72464d) + f3;
                DFCircularProgressView.this.invalidate();
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f4 / ((float) this.f72476p), ((f + 1.0f) * 720.0f) / ((float) this.f72476p)});
        ofFloat4.setDuration((long) ((this.f72473m / this.f72476p) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DFCircularProgressView.this.f72463c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    public DFCircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m66261a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m66261a(AttributeSet attributeSet, int i) {
        m66263b(attributeSet, i);
        this.f72465e = new Paint(1);
        m66264c();
        this.f72467g = new RectF();
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
        this.f72466f = measuredWidth;
        setMeasuredDimension(this.f72466f + paddingLeft, this.f72466f + paddingTop);
    }

    /* renamed from: b */
    private void m66263b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ir, R.attr.is, R.attr.it, R.attr.iu, R.attr.iv, R.attr.iw, R.attr.ix, R.attr.iy, R.attr.iz, R.attr.j0, R.attr.j1}, i, 0);
        Resources resources = getResources();
        this.f72469i = obtainStyledAttributes.getFloat(8, (float) resources.getInteger(R.integer.t));
        this.f72470j = obtainStyledAttributes.getFloat(7, (float) resources.getInteger(R.integer.s));
        this.f72471k = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.f2));
        this.f72461a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.e));
        this.f72468h = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.d));
        this.f72480t = obtainStyledAttributes.getFloat(9, (float) resources.getInteger(R.integer.u));
        this.f72464d = this.f72480t;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.f72472l = obtainStyledAttributes.getColor(5, resources.getColor(R.color.k7));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.f72472l = typedValue.data;
        } else if (VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{16843829});
            this.f72472l = obtainStyledAttributes2.getColor(0, resources.getColor(R.color.k7));
            obtainStyledAttributes2.recycle();
        } else {
            this.f72472l = resources.getColor(R.color.k7);
        }
        this.f72473m = obtainStyledAttributes.getInteger(1, resources.getInteger(R.integer.o));
        this.f72474n = obtainStyledAttributes.getInteger(3, resources.getInteger(R.integer.q));
        this.f72475o = obtainStyledAttributes.getInteger(4, resources.getInteger(R.integer.r));
        this.f72476p = obtainStyledAttributes.getInteger(2, resources.getInteger(R.integer.p));
        obtainStyledAttributes.recycle();
    }

    public DFCircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66261a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.f72466f = i;
        m66262b();
    }
}
