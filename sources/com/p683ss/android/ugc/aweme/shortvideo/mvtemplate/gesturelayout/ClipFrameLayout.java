package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.ClipFrameLayout */
abstract class ClipFrameLayout extends FrameLayout {

    /* renamed from: a */
    final RectF f111871a = new RectF();

    /* renamed from: b */
    final Path f111872b = new Path();

    /* renamed from: c */
    final RectF f111873c = new RectF();

    /* renamed from: d */
    boolean f111874d = false;

    /* renamed from: e */
    boolean f111875e = false;

    /* renamed from: f */
    boolean f111876f = false;

    /* renamed from: g */
    Rect f111877g;

    /* renamed from: h */
    Rect f111878h;

    /* renamed from: i */
    float f111879i;

    /* renamed from: j */
    final Rect f111880j = new Rect();

    /* renamed from: k */
    final C44202g f111881k = new C44202g(new Rect());

    /* renamed from: l */
    final C44202g f111882l = new C44202g(new Rect());

    public ClipFrameLayout(Context context) {
        super(context);
    }

    public ClipFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo90038a(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f111876f) {
            canvas.save();
            canvas.clipRect(this.f111873c);
            if (this.f111875e) {
                canvas.save();
                canvas.clipPath(this.f111872b);
                z = mo90038a(canvas, view, j);
                canvas.restore();
            } else if (this.f111874d) {
                canvas.save();
                canvas.clipRect(this.f111871a);
                z = mo90038a(canvas, view, j);
                canvas.restore();
            } else {
                z = mo90038a(canvas, view, j);
            }
            canvas.restore();
            return z;
        } else if (this.f111875e) {
            canvas.save();
            canvas.clipPath(this.f111872b);
            boolean a = mo90038a(canvas, view, j);
            canvas.restore();
            return a;
        } else if (!this.f111874d) {
            return mo90038a(canvas, view, j);
        } else {
            canvas.save();
            canvas.clipRect(this.f111871a);
            boolean a2 = mo90038a(canvas, view, j);
            canvas.restore();
            return a2;
        }
    }

    public ClipFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f111880j.set(0, 0, getWidth(), getHeight());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Animator mo90037a(Rect rect, Rect rect2, float f, final boolean z) {
        this.f111877g = new Rect(rect);
        this.f111878h = new Rect(rect2);
        this.f111879i = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ClipFrameLayout clipFrameLayout = ClipFrameLayout.this;
                if (z) {
                    floatValue = 1.0f - floatValue;
                }
                if (clipFrameLayout.f111877g != null && clipFrameLayout.f111878h != null && !clipFrameLayout.f111880j.isEmpty()) {
                    Rect a = clipFrameLayout.f111881k.evaluate(floatValue, clipFrameLayout.f111877g, clipFrameLayout.f111880j);
                    Rect a2 = clipFrameLayout.f111882l.evaluate(floatValue, clipFrameLayout.f111878h, clipFrameLayout.f111880j);
                    float f = clipFrameLayout.f111879i * (1.0f - floatValue);
                    if (!a.equals(clipFrameLayout.f111880j) || !a2.equals(clipFrameLayout.f111880j) || f != 0.0f) {
                        clipFrameLayout.f111871a.set(a);
                        if (VERSION.SDK_INT < 18 || f <= 0.0f) {
                            clipFrameLayout.f111874d = true;
                        } else {
                            clipFrameLayout.f111872b.rewind();
                            clipFrameLayout.f111872b.addRoundRect(clipFrameLayout.f111871a, f, f, Direction.CCW);
                            clipFrameLayout.f111875e = true;
                        }
                        clipFrameLayout.f111873c.set(a2);
                        clipFrameLayout.f111876f = !clipFrameLayout.f111873c.equals(clipFrameLayout.f111871a);
                        clipFrameLayout.invalidate();
                        return;
                    }
                    clipFrameLayout.f111874d = false;
                    clipFrameLayout.f111875e = false;
                    clipFrameLayout.f111876f = false;
                }
            }
        });
        return ofFloat;
    }

    public ClipFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
