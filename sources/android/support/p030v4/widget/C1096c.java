package android.support.p030v4.widget;

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
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.c */
final class C1096c extends ImageView {

    /* renamed from: a */
    int f3484a;

    /* renamed from: b */
    private AnimationListener f3485b;

    /* renamed from: android.support.v4.widget.c$a */
    class C1097a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f3487b;

        /* renamed from: c */
        private Paint f3488c = new Paint();

        /* renamed from: a */
        private void m3197a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C1096c.this.f3484a, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f3487b = radialGradient;
            this.f3488c.setShader(this.f3487b);
        }

        /* access modifiers changed from: protected */
        public final void onResize(float f, float f2) {
            super.onResize(f, f2);
            m3197a((int) f);
        }

        C1097a(int i) {
            C1096c.this.f3484a = i;
            m3197a((int) rect().width());
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = C1096c.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C1096c.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f3488c);
            canvas.drawCircle(f, height, (float) (width - C1096c.this.f3484a), paint);
        }
    }

    /* renamed from: a */
    private static boolean m3195a() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f3485b != null) {
            this.f3485b.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        if (this.f3485b != null) {
            this.f3485b.onAnimationStart(getAnimation());
        }
    }

    /* renamed from: a */
    public final void mo3497a(AnimationListener animationListener) {
        this.f3485b = animationListener;
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m3195a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f3484a * 2), getMeasuredHeight() + (this.f3484a * 2));
        }
    }

    C1096c(Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f3484a = (int) (3.5f * f);
        if (m3195a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C1056u.m3048c((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C1097a(this.f3484a));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f3484a, (float) i3, (float) i2, 503316480);
            int i4 = this.f3484a;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(-328966);
        C1056u.m3030a((View) this, (Drawable) shapeDrawable);
    }
}
