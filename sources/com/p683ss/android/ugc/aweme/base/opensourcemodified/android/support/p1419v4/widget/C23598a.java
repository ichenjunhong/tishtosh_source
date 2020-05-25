package com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.AppCompatImageView;
import android.view.View;
import android.view.animation.Animation.AnimationListener;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.a */
final class C23598a extends AppCompatImageView {

    /* renamed from: a */
    int f62797a;

    /* renamed from: b */
    public ShapeDrawable f62798b;

    /* renamed from: c */
    private AnimationListener f62799c;

    /* renamed from: d */
    private boolean f62800d;

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.a$a */
    class C23599a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f62802b;

        /* renamed from: c */
        private Paint f62803c = new Paint();

        /* renamed from: a */
        private void m57841a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C23598a.this.f62797a, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f62802b = radialGradient;
            this.f62803c.setShader(this.f62802b);
        }

        /* access modifiers changed from: protected */
        public final void onResize(float f, float f2) {
            super.onResize(f, f2);
            m57841a((int) f);
        }

        C23599a(int i) {
            C23598a.this.f62797a = i;
            m57841a((int) rect().width());
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = C23598a.this.getWidth();
            int height = C23598a.this.getHeight();
            int i = width / 2;
            if (i >= 0 && i - C23598a.this.f62797a >= 0) {
                float f = (float) i;
                float f2 = (float) (height / 2);
                canvas.drawCircle(f, f2, f, this.f62803c);
                canvas.drawCircle(f, f2, (float) (i - C23598a.this.f62797a), paint);
            }
        }
    }

    /* renamed from: a */
    private static boolean m57839a() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f62799c != null) {
            this.f62799c.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        if (this.f62799c != null) {
            this.f62799c.onAnimationStart(getAnimation());
        }
    }

    /* renamed from: a */
    public final void mo48827a(AnimationListener animationListener) {
        this.f62799c = animationListener;
    }

    public final void draw(Canvas canvas) {
        if (!this.f62800d) {
            super.draw(canvas);
        }
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m57839a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f62797a * 2), getMeasuredHeight() + (this.f62797a * 2));
        }
    }

    C23598a(Context context, int i) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f62797a = (int) (3.5f * f);
        if (m57839a()) {
            this.f62798b = new ShapeDrawable(new OvalShape());
            C1056u.m3048c((View) this, f * 4.0f);
        } else {
            this.f62798b = new ShapeDrawable(new C23599a(this.f62797a));
            C1056u.m3025a((View) this, 1, this.f62798b.getPaint());
            this.f62798b.getPaint().setShadowLayer((float) this.f62797a, (float) i3, (float) i2, 503316480);
            int i4 = this.f62797a;
            setPadding(i4, i4, i4, i4);
        }
        this.f62798b.getPaint().setColor(-328966);
        C1056u.m3030a((View) this, (Drawable) this.f62798b);
    }
}
