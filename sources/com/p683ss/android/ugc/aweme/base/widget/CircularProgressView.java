package com.p683ss.android.ugc.aweme.base.widget;

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

/* renamed from: com.ss.android.ugc.aweme.base.widget.CircularProgressView */
public class CircularProgressView extends View {

    /* renamed from: a */
    public boolean f63271a;

    /* renamed from: b */
    public float f63272b;

    /* renamed from: c */
    public float f63273c;

    /* renamed from: d */
    public float f63274d;

    /* renamed from: e */
    private Paint f63275e;

    /* renamed from: f */
    private int f63276f;

    /* renamed from: g */
    private RectF f63277g;

    /* renamed from: h */
    private boolean f63278h;

    /* renamed from: i */
    private boolean f63279i;

    /* renamed from: j */
    private boolean f63280j;

    /* renamed from: k */
    private float f63281k;

    /* renamed from: l */
    private float f63282l;

    /* renamed from: m */
    private int f63283m;

    /* renamed from: n */
    private int f63284n;

    /* renamed from: o */
    private int f63285o;

    /* renamed from: p */
    private int f63286p;

    /* renamed from: q */
    private int f63287q;

    /* renamed from: r */
    private int f63288r;

    /* renamed from: s */
    private ValueAnimator f63289s;

    /* renamed from: t */
    private ValueAnimator f63290t;

    /* renamed from: u */
    private AnimatorSet f63291u;

    /* renamed from: v */
    private float f63292v;

    public int getColor() {
        return this.f63284n;
    }

    public float getMaxProgress() {
        return this.f63282l;
    }

    public float getProgress() {
        return this.f63281k;
    }

    public int getThickness() {
        return this.f63283m;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f63280j = false;
        mo49173b();
    }

    /* renamed from: d */
    private void m58279d() {
        this.f63275e.setColor(this.f63284n);
        this.f63275e.setStyle(Style.STROKE);
        this.f63275e.setStrokeWidth((float) this.f63283m);
        this.f63275e.setStrokeCap(Cap.ROUND);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f63280j = true;
        if (this.f63278h || this.f63279i) {
            mo49172a();
        }
    }

    /* renamed from: c */
    private void m58278c() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f63277g.set((float) (this.f63283m + paddingLeft), (float) (this.f63283m + paddingTop), (float) ((this.f63276f - paddingLeft) - this.f63283m), (float) ((this.f63276f - paddingTop) - this.f63283m));
    }

    /* renamed from: b */
    public final void mo49173b() {
        this.f63279i = false;
        if (this.f63289s != null) {
            this.f63289s.cancel();
            this.f63289s = null;
        }
        if (this.f63290t != null) {
            this.f63290t.cancel();
            this.f63290t = null;
        }
        if (this.f63291u != null) {
            this.f63291u.cancel();
            this.f63291u = null;
        }
    }

    /* renamed from: a */
    public final void mo49172a() {
        if (!this.f63280j) {
            this.f63279i = true;
            return;
        }
        int i = 0;
        this.f63279i = false;
        if (this.f63289s != null && this.f63289s.isRunning()) {
            this.f63289s.cancel();
        }
        if (this.f63290t != null && this.f63290t.isRunning()) {
            this.f63290t.cancel();
        }
        if (this.f63291u != null && this.f63291u.isRunning()) {
            this.f63291u.cancel();
        }
        if (!this.f63271a) {
            this.f63274d = this.f63292v;
            this.f63289s = ValueAnimator.ofFloat(new float[]{this.f63274d, this.f63274d + 360.0f});
            this.f63289s.setDuration((long) this.f63286p);
            this.f63289s.setInterpolator(new DecelerateInterpolator(2.0f));
            this.f63289s.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.this.f63274d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CircularProgressView.this.invalidate();
                }
            });
            this.f63289s.start();
            return;
        }
        this.f63272b = 15.0f;
        this.f63291u = new AnimatorSet();
        Animator animator = null;
        while (i < this.f63288r) {
            AnimatorSet a = m58275a((float) i);
            Builder play = this.f63291u.play(a);
            if (animator != null) {
                play.after(animator);
            }
            i++;
            animator = a;
        }
        this.f63291u.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a */
            boolean f63294a;

            public final void onAnimationCancel(Animator animator) {
                this.f63294a = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f63294a) {
                    CircularProgressView.this.mo49172a();
                }
            }
        });
        this.f63291u.start();
    }

    public void setMaxProgress(float f) {
        this.f63282l = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.f63281k = f;
        invalidate();
    }

    public CircularProgressView(Context context) {
        super(context);
        m58276a(null, 0);
    }

    public void setColor(int i) {
        this.f63284n = i;
        m58279d();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        boolean z2;
        if (this.f63271a != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f63271a = z;
            mo49172a();
        }
    }

    public void setThickness(int i) {
        this.f63283m = i;
        m58279d();
        m58278c();
        invalidate();
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i != visibility) {
            if (i == 0) {
                mo49172a();
            } else if (i == 8 || i == 4) {
                mo49173b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        isInEditMode();
        float f = (this.f63281k / this.f63282l) * 360.0f;
        if (!this.f63271a) {
            canvas.drawArc(this.f63277g, this.f63274d, f, false, this.f63275e);
            return;
        }
        canvas.drawArc(this.f63277g, this.f63274d + this.f63273c, this.f63272b, false, this.f63275e);
    }

    /* renamed from: a */
    private AnimatorSet m58275a(float f) {
        final float f2 = ((((float) (this.f63288r - 1)) * 360.0f) / ((float) this.f63288r)) + 15.0f;
        final float f3 = ((f2 - 15.0f) * f) - 0.049804688f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{15.0f, f2});
        ofFloat.setDuration((long) ((this.f63285o / this.f63288r) / 2));
        ofFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f63272b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.invalidate();
            }
        });
        float f4 = (0.5f + f) * 720.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(f * 720.0f) / ((float) this.f63288r), f4 / ((float) this.f63288r)});
        ofFloat2.setDuration((long) ((this.f63285o / this.f63288r) / 2));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f63273c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{f3, (f3 + f2) - 15.0f});
        ofFloat3.setDuration((long) ((this.f63285o / this.f63288r) / 2));
        ofFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        ofFloat3.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f63274d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressView.this.f63272b = (f2 - CircularProgressView.this.f63274d) + f3;
                CircularProgressView.this.invalidate();
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{f4 / ((float) this.f63288r), ((f + 1.0f) * 720.0f) / ((float) this.f63288r)});
        ofFloat4.setDuration((long) ((this.f63285o / this.f63288r) / 2));
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressView.this.f63273c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat2);
        return animatorSet;
    }

    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m58276a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m58276a(AttributeSet attributeSet, int i) {
        m58277b(attributeSet, i);
        this.f63275e = new Paint(1);
        m58279d();
        this.f63277g = new RectF();
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
        this.f63276f = measuredWidth;
        setMeasuredDimension(this.f63276f + paddingLeft, this.f63276f + paddingTop);
    }

    /* renamed from: b */
    private void m58277b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ir, R.attr.is, R.attr.it, R.attr.iu, R.attr.iv, R.attr.iw, R.attr.ix, R.attr.iy, R.attr.iz, R.attr.j0, R.attr.j1}, i, 0);
        Resources resources = getResources();
        this.f63281k = obtainStyledAttributes.getFloat(8, (float) resources.getInteger(R.integer.t));
        this.f63282l = obtainStyledAttributes.getFloat(7, (float) resources.getInteger(R.integer.s));
        this.f63283m = obtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.f2));
        this.f63271a = obtainStyledAttributes.getBoolean(6, resources.getBoolean(R.bool.e));
        this.f63278h = obtainStyledAttributes.getBoolean(0, resources.getBoolean(R.bool.d));
        this.f63292v = obtainStyledAttributes.getFloat(9, (float) resources.getInteger(R.integer.u));
        this.f63274d = this.f63292v;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.f63284n = obtainStyledAttributes.getColor(5, resources.getColor(R.color.k7));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.f63284n = typedValue.data;
        } else if (VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{16843829});
            this.f63284n = obtainStyledAttributes2.getColor(0, resources.getColor(R.color.k7));
            obtainStyledAttributes2.recycle();
        } else {
            this.f63284n = resources.getColor(R.color.k7);
        }
        this.f63285o = obtainStyledAttributes.getInteger(1, resources.getInteger(R.integer.o));
        this.f63286p = obtainStyledAttributes.getInteger(3, resources.getInteger(R.integer.q));
        this.f63287q = obtainStyledAttributes.getInteger(4, resources.getInteger(R.integer.r));
        this.f63288r = obtainStyledAttributes.getInteger(2, resources.getInteger(R.integer.p));
        obtainStyledAttributes.recycle();
    }

    public CircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m58276a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.f63276f = i;
        m58278c();
    }
}
