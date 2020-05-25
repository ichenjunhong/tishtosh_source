package com.p683ss.android.ugc.aweme.account.base.widget;

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

/* renamed from: com.ss.android.ugc.aweme.account.base.widget.CircularProgressView */
public class CircularProgressView extends View {

    /* renamed from: a */
    public boolean f56920a;

    /* renamed from: b */
    public float f56921b;

    /* renamed from: c */
    public float f56922c;

    /* renamed from: d */
    public float f56923d;

    /* renamed from: e */
    private Paint f56924e;

    /* renamed from: f */
    private int f56925f;

    /* renamed from: g */
    private RectF f56926g;

    /* renamed from: h */
    private boolean f56927h;

    /* renamed from: i */
    private float f56928i;

    /* renamed from: j */
    private float f56929j;

    /* renamed from: k */
    private int f56930k;

    /* renamed from: l */
    private int f56931l;

    /* renamed from: m */
    private int f56932m;

    /* renamed from: n */
    private int f56933n;

    /* renamed from: o */
    private int f56934o;

    /* renamed from: p */
    private int f56935p;

    /* renamed from: q */
    private ValueAnimator f56936q;

    /* renamed from: r */
    private ValueAnimator f56937r;

    /* renamed from: s */
    private AnimatorSet f56938s;

    /* renamed from: t */
    private float f56939t;

    public int getColor() {
        return this.f56931l;
    }

    public float getMaxProgress() {
        return this.f56929j;
    }

    public float getProgress() {
        return this.f56928i;
    }

    public int getThickness() {
        return this.f56930k;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m53275d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f56927h) {
            mo44881a();
        }
    }

    /* renamed from: c */
    private void m53274c() {
        this.f56924e.setColor(this.f56931l);
        this.f56924e.setStyle(Style.STROKE);
        this.f56924e.setStrokeWidth((float) this.f56930k);
        this.f56924e.setStrokeCap(Cap.ROUND);
    }

    /* renamed from: b */
    private void m53272b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f56926g.set((float) (this.f56930k + paddingLeft), (float) (this.f56930k + paddingTop), (float) ((this.f56925f - paddingLeft) - this.f56930k), (float) ((this.f56925f - paddingTop) - this.f56930k));
    }

    /* renamed from: d */
    private void m53275d() {
        if (this.f56936q != null) {
            this.f56936q.cancel();
            this.f56936q = null;
        }
        if (this.f56937r != null) {
            this.f56937r.cancel();
            this.f56937r = null;
        }
        if (this.f56938s != null) {
            this.f56938s.cancel();
            this.f56938s = null;
        }
    }

    /* renamed from: a */
    public final void mo44881a() {
        if (this.f56936q != null && this.f56936q.isRunning()) {
            this.f56936q.cancel();
        }
        if (this.f56937r != null && this.f56937r.isRunning()) {
            this.f56937r.cancel();
        }
        if (this.f56938s != null && this.f56938s.isRunning()) {
            this.f56938s.cancel();
        }
        int i = 0;
        if (!this.f56920a) {
            this.f56923d = this.f56939t;
            this.f56936q = ValueAnimator.ofFloat(new float[]{this.f56923d, this.f56923d + 360.0f});
            this.f56936q.setDuration((long) this.f56933n);
            this.f56936q.setInterpolator(new DecelerateInterpolator(2.0f));
            this.f56936q.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f56923d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f56936q.start();
            return;
        }
        this.f56921b = 15.0f;
        this.f56938s = new AnimatorSet();
        Animator animator = null;
        while (i < this.f56935p) {
            AnimatorSet a = m53270a((float) i);
            Builder play = this.f56938s.play(a);
            if (animator != null) {
                play.after(animator);
            }
            i++;
            animator = a;
        }
        this.f56938s.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a */
            boolean f56941a;

            public final void onAnimationCancel(Animator animator) {
                this.f56941a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f56941a) {
                    CircularProgressView.this.mo44881a();
                }
            }
        });
        this.f56938s.start();
    }

    public void setMaxProgress(float f) {
        this.f56929j = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.f56928i = f;
        invalidate();
    }

    public CircularProgressView(Context context) {
        super(context);
        m53271a(null, 0);
    }

    public void setColor(int i) {
        this.f56931l = i;
        m53274c();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        boolean z2;
        if (this.f56920a != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f56920a = z;
            mo44881a();
        }
    }

    public void setThickness(int i) {
        this.f56930k = i;
        m53274c();
        m53272b();
        invalidate();
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i != visibility) {
            if (i == 0) {
                mo44881a();
            } else if (i == 8 || i == 4) {
                m53275d();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        isInEditMode();
        float f = (this.f56928i / this.f56929j) * 360.0f;
        if (!this.f56920a) {
            canvas.drawArc(this.f56926g, this.f56923d, f, false, this.f56924e);
            return;
        }
        canvas.drawArc(this.f56926g, this.f56923d + this.f56922c, this.f56921b, false, this.f56924e);
    }

    /* renamed from: a */
    private AnimatorSet m53270a(float f) {
        final float f2 = ((((float) (this.f56935p - 1)) * 360.0f) / ((float) this.f56935p)) + 15.0f;
        final float f3 = ((f2 - 15.0f) * f) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{15.0f, f2});
        ofFloat.setDuration((long) ((this.f56932m / this.f56935p) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f56921b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(f * 720.0f) / ((float) this.f56935p), f4 / ((float) this.f56935p)});
        ofFloat2.setDuration((long) ((this.f56932m / this.f56935p) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f56922c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f3, (f3 + f2) - 15.0f});
        ofFloat3.setDuration((long) ((this.f56932m / this.f56935p) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f56923d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.f56921b = (f2 - CircularProgressView.this.f56923d) + f3;
                CircularProgressView.this.invalidate();
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f4 / ((float) this.f56935p), ((f + 1.0f) * 720.0f) / ((float) this.f56935p)});
        ofFloat4.setDuration((long) ((this.f56932m / this.f56935p) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f56922c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m53271a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m53271a(AttributeSet attributeSet, int i) {
        m53273b(attributeSet, i);
        this.f56924e = new Paint(1);
        m53274c();
        this.f56926g = new RectF();
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
        this.f56925f = measuredWidth;
        setMeasuredDimension(this.f56925f + paddingLeft, this.f56925f + paddingTop);
    }

    /* renamed from: b */
    private void m53273b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ir, R.attr.is, R.attr.it, R.attr.iu, R.attr.iv, R.attr.iw, R.attr.ix, R.attr.iy, R.attr.iz, R.attr.j0, R.attr.j1}, i, 0);
        Resources resources = getResources();
        this.f56928i = obtainStyledAttributes.getFloat(8, (float) resources.getInteger(R.integer.ae));
        this.f56929j = obtainStyledAttributes.getFloat(7, (float) resources.getInteger(R.integer.ad));
        this.f56930k = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.wz));
        this.f56920a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.p));
        this.f56927h = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.o));
        this.f56939t = obtainStyledAttributes.getFloat(9, (float) resources.getInteger(R.integer.af));
        this.f56923d = this.f56939t;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.f56931l = obtainStyledAttributes.getColor(5, resources.getColor(R.color.k7));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.f56931l = typedValue.data;
        } else if (VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{16843829});
            this.f56931l = obtainStyledAttributes2.getColor(0, resources.getColor(R.color.k7));
            obtainStyledAttributes2.recycle();
        } else {
            this.f56931l = resources.getColor(R.color.k7);
        }
        this.f56932m = obtainStyledAttributes.getInteger(1, resources.getInteger(R.integer.a_));
        this.f56933n = obtainStyledAttributes.getInteger(3, resources.getInteger(R.integer.ab));
        this.f56934o = obtainStyledAttributes.getInteger(4, resources.getInteger(R.integer.ac));
        this.f56935p = obtainStyledAttributes.getInteger(2, resources.getInteger(R.integer.aa));
        obtainStyledAttributes.recycle();
    }

    public CircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m53271a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.f56925f = i;
        m53272b();
    }
}
