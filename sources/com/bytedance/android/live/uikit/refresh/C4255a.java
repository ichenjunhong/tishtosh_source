package com.bytedance.android.live.uikit.refresh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

/* renamed from: com.bytedance.android.live.uikit.refresh.a */
final class C4255a extends ImageView {

    /* renamed from: a */
    private AnimationListener f11658a;

    /* renamed from: b */
    private int f11659b;

    /* renamed from: com.bytedance.android.live.uikit.refresh.a$a */
    class C4256a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f11661b;

        /* renamed from: c */
        private int f11662c;

        /* renamed from: d */
        private Paint f11663d = new Paint();

        /* renamed from: e */
        private int f11664e;

        public final void draw(Canvas canvas, Paint paint) {
            float width = (float) (C4255a.this.getWidth() / 2);
            float height = (float) (C4255a.this.getHeight() / 2);
            canvas.drawCircle(width, height, (float) ((this.f11664e / 2) + this.f11662c), this.f11663d);
            canvas.drawCircle(width, height, (float) (this.f11664e / 2), paint);
        }

        public C4256a(int i, int i2) {
            this.f11662c = i;
            this.f11664e = i2;
            RadialGradient radialGradient = new RadialGradient((float) (this.f11664e / 2), (float) (this.f11664e / 2), (float) this.f11662c, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f11661b = radialGradient;
            this.f11663d.setShader(this.f11661b);
        }
    }

    /* renamed from: a */
    private static boolean m10516a() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f11658a != null) {
            this.f11658a.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        if (this.f11658a != null) {
            this.f11658a.onAnimationStart(getAnimation());
        }
    }

    /* renamed from: a */
    public final void mo9898a(AnimationListener animationListener) {
        this.f11658a = animationListener;
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(getResources().getColor(i));
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m10516a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f11659b * 2), getMeasuredHeight() + (this.f11659b * 2));
        }
    }

    public C4255a(Context context, int i, float f) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (20.0f * f2 * 2.0f);
        int i3 = (int) (1.75f * f2);
        int i4 = (int) (0.0f * f2);
        this.f11659b = (int) (3.5f * f2);
        if (m10516a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C1056u.m3048c((View) this, f2 * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new C4256a(this.f11659b, i2));
            C1056u.m3025a((View) this, 1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.f11659b, (float) i4, (float) i3, 503316480);
            int i5 = this.f11659b;
            setPadding(i5, i5, i5, i5);
        }
        shapeDrawable.getPaint().setColor(-328966);
        setBackgroundDrawable(shapeDrawable);
    }
}
