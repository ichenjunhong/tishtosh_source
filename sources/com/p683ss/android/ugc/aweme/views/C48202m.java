package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.p030v4.view.p042b.C1023b;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.views.m */
final class C48202m extends Drawable implements Animatable {

    /* renamed from: a */
    static final Interpolator f121273a = new C1023b();

    /* renamed from: f */
    private static final Interpolator f121274f = new LinearInterpolator();

    /* renamed from: g */
    private static final int[] f121275g = {-16777216};

    /* renamed from: b */
    final C48206a f121276b;

    /* renamed from: c */
    public float f121277c;

    /* renamed from: d */
    float f121278d;

    /* renamed from: e */
    boolean f121279e;

    /* renamed from: h */
    private final ArrayList<Animation> f121280h = new ArrayList<>();

    /* renamed from: i */
    private Resources f121281i;

    /* renamed from: j */
    private View f121282j;

    /* renamed from: k */
    private Animation f121283k;

    /* renamed from: l */
    private double f121284l;

    /* renamed from: m */
    private double f121285m;

    /* renamed from: n */
    private final Callback f121286n = new Callback() {
        public final void invalidateDrawable(Drawable drawable) {
            C48202m.this.invalidateSelf();
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C48202m.this.unscheduleSelf(runnable);
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C48202m.this.scheduleSelf(runnable, j);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.views.m$a */
    static class C48206a {

        /* renamed from: a */
        final RectF f121292a = new RectF();

        /* renamed from: b */
        final Paint f121293b = new Paint();

        /* renamed from: c */
        final Paint f121294c = new Paint();

        /* renamed from: d */
        public float f121295d = 0.0f;

        /* renamed from: e */
        public float f121296e = 0.0f;

        /* renamed from: f */
        public float f121297f = 0.0f;

        /* renamed from: g */
        public float f121298g = 5.0f;

        /* renamed from: h */
        public float f121299h = 2.5f;

        /* renamed from: i */
        int[] f121300i;

        /* renamed from: j */
        int f121301j;

        /* renamed from: k */
        public float f121302k;

        /* renamed from: l */
        public float f121303l;

        /* renamed from: m */
        public float f121304m;

        /* renamed from: n */
        boolean f121305n;

        /* renamed from: o */
        Path f121306o;

        /* renamed from: p */
        float f121307p;

        /* renamed from: q */
        public double f121308q;

        /* renamed from: r */
        int f121309r;

        /* renamed from: s */
        int f121310s;

        /* renamed from: t */
        public int f121311t;

        /* renamed from: u */
        final Paint f121312u = new Paint(1);

        /* renamed from: v */
        public int f121313v;

        /* renamed from: w */
        public int f121314w;

        /* renamed from: x */
        private final Callback f121315x;

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo95666d() {
            this.f121315x.invalidateDrawable(null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo95657a() {
            return (this.f121301j + 1) % this.f121300i.length;
        }

        /* renamed from: b */
        public final void mo95662b() {
            this.f121302k = this.f121295d;
            this.f121303l = this.f121296e;
            this.f121304m = this.f121297f;
        }

        /* renamed from: c */
        public final void mo95664c() {
            this.f121302k = 0.0f;
            this.f121303l = 0.0f;
            this.f121304m = 0.0f;
            mo95658a(0.0f);
            mo95663b(0.0f);
            mo95665c(0.0f);
        }

        /* renamed from: a */
        public final void mo95658a(float f) {
            this.f121295d = f;
            mo95666d();
        }

        /* renamed from: b */
        public final void mo95663b(float f) {
            this.f121296e = f;
            mo95666d();
        }

        /* renamed from: c */
        public final void mo95665c(float f) {
            this.f121297f = f;
            mo95666d();
        }

        /* renamed from: d */
        public final void mo95667d(float f) {
            if (f != this.f121307p) {
                this.f121307p = f;
                mo95666d();
            }
        }

        /* renamed from: a */
        public final void mo95659a(int i) {
            this.f121301j = i;
            this.f121314w = this.f121300i[this.f121301j];
        }

        /* renamed from: a */
        public final void mo95660a(boolean z) {
            if (this.f121305n != z) {
                this.f121305n = z;
                mo95666d();
            }
        }

        C48206a(Callback callback) {
            this.f121315x = callback;
            this.f121293b.setStrokeCap(Cap.SQUARE);
            this.f121293b.setAntiAlias(true);
            this.f121293b.setStyle(Style.STROKE);
            this.f121294c.setStyle(Style.FILL);
            this.f121294c.setAntiAlias(true);
        }

        /* renamed from: a */
        public final void mo95661a(int[] iArr) {
            this.f121300i = iArr;
            mo95659a(0);
        }
    }

    public final int getIntrinsicHeight() {
        return (int) this.f121285m;
    }

    public final int getIntrinsicWidth() {
        return (int) this.f121284l;
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getAlpha() {
        return this.f121276b.f121311t;
    }

    public final void stop() {
        this.f121282j.clearAnimation();
        mo95639c(0.0f);
        this.f121276b.mo95660a(false);
        this.f121276b.mo95659a(0);
        this.f121276b.mo95664c();
    }

    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.f121280h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = (Animation) arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    public final void start() {
        this.f121283k.reset();
        this.f121276b.mo95662b();
        if (this.f121276b.f121296e != this.f121276b.f121295d) {
            this.f121279e = true;
            this.f121283k.setDuration(666);
            this.f121282j.startAnimation(this.f121283k);
            return;
        }
        this.f121276b.mo95659a(0);
        this.f121276b.mo95664c();
        this.f121283k.setDuration(1332);
        this.f121282j.startAnimation(this.f121283k);
    }

    /* renamed from: a */
    public final void mo95631a(float f) {
        this.f121276b.mo95667d(f);
    }

    /* renamed from: b */
    public final void mo95636b(float f) {
        this.f121276b.mo95665c(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo95639c(float f) {
        this.f121277c = f;
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.f121276b.f121311t = i;
    }

    /* renamed from: b */
    public final void mo95638b(int i) {
        this.f121276b.f121313v = i;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        C48206a aVar = this.f121276b;
        aVar.f121293b.setColorFilter(colorFilter);
        aVar.mo95666d();
    }

    /* renamed from: a */
    static float m104433a(C48206a aVar) {
        double d = (double) aVar.f121298g;
        double d2 = aVar.f121308q * 6.283185307179586d;
        Double.isNaN(d);
        return (float) Math.toRadians(d / d2);
    }

    /* renamed from: a */
    public final void mo95634a(int i) {
        if (i == 0) {
            m104434a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m104434a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    /* renamed from: a */
    public final void mo95635a(boolean z) {
        this.f121276b.mo95660a(z);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f121277c, bounds.exactCenterX(), bounds.exactCenterY());
        C48206a aVar = this.f121276b;
        RectF rectF = aVar.f121292a;
        rectF.set(bounds);
        rectF.inset(aVar.f121299h, aVar.f121299h);
        float f = (aVar.f121295d + aVar.f121297f) * 360.0f;
        float f2 = ((aVar.f121296e + aVar.f121297f) * 360.0f) - f;
        aVar.f121293b.setColor(aVar.f121314w);
        canvas.drawArc(rectF, f, f2, false, aVar.f121293b);
        if (aVar.f121305n) {
            if (aVar.f121306o == null) {
                aVar.f121306o = new Path();
                aVar.f121306o.setFillType(FillType.EVEN_ODD);
            } else {
                aVar.f121306o.reset();
            }
            float f3 = ((float) (((int) aVar.f121299h) / 2)) * aVar.f121307p;
            double cos = aVar.f121308q * Math.cos(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
            double exactCenterX = (double) bounds.exactCenterX();
            Double.isNaN(exactCenterX);
            float f4 = (float) (cos + exactCenterX);
            double sin = aVar.f121308q * Math.sin(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
            double exactCenterY = (double) bounds.exactCenterY();
            Double.isNaN(exactCenterY);
            float f5 = (float) (sin + exactCenterY);
            aVar.f121306o.moveTo(0.0f, 0.0f);
            aVar.f121306o.lineTo(((float) aVar.f121309r) * aVar.f121307p, 0.0f);
            aVar.f121306o.lineTo((((float) aVar.f121309r) * aVar.f121307p) / 2.0f, ((float) aVar.f121310s) * aVar.f121307p);
            aVar.f121306o.offset(f4 - f3, f5);
            aVar.f121306o.close();
            aVar.f121294c.setColor(aVar.f121314w);
            canvas.rotate((f + f2) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(aVar.f121306o, aVar.f121294c);
        }
        if (aVar.f121311t < 255) {
            aVar.f121312u.setColor(aVar.f121313v);
            aVar.f121312u.setAlpha(NormalGiftView.ALPHA_255 - aVar.f121311t);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) (bounds.width() / 2), aVar.f121312u);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public final void mo95632a(float f, float f2) {
        this.f121276b.mo95658a(0.0f);
        this.f121276b.mo95663b(f2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo95637b(float f, C48206a aVar) {
        mo95633a(f, aVar);
        float floor = (float) (Math.floor((double) (aVar.f121304m / 0.8f)) + 1.0d);
        aVar.mo95658a(aVar.f121302k + (((aVar.f121303l - m104433a(aVar)) - aVar.f121302k) * f));
        aVar.mo95663b(aVar.f121303l);
        aVar.mo95665c(aVar.f121304m + ((floor - aVar.f121304m) * f));
    }

    C48202m(Context context, View view) {
        this.f121282j = view;
        this.f121281i = context.getResources();
        this.f121276b = new C48206a(this.f121286n);
        this.f121276b.mo95661a(f121275g);
        mo95634a(1);
        final C48206a aVar = this.f121276b;
        C482031 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                if (C48202m.this.f121279e) {
                    C48202m.this.mo95637b(f, aVar);
                    return;
                }
                float a = C48202m.m104433a(aVar);
                float f2 = aVar.f121303l;
                float f3 = aVar.f121302k;
                float f4 = aVar.f121304m;
                C48202m.this.mo95633a(f, aVar);
                if (f <= 0.5f) {
                    aVar.mo95658a(f3 + ((0.8f - a) * C48202m.f121273a.getInterpolation(f / 0.5f)));
                }
                if (f > 0.5f) {
                    aVar.mo95663b(f2 + ((0.8f - a) * C48202m.f121273a.getInterpolation((f - 0.5f) / 0.5f)));
                }
                aVar.mo95665c(f4 + (0.25f * f));
                C48202m.this.mo95639c((f * 216.0f) + ((C48202m.this.f121278d / 5.0f) * 1080.0f));
            }
        };
        r0.setRepeatCount(-1);
        r0.setRepeatMode(1);
        r0.setInterpolator(f121274f);
        r0.setAnimationListener(new AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                C48202m.this.f121278d = 0.0f;
            }

            public final void onAnimationRepeat(Animation animation) {
                aVar.mo95662b();
                C48206a aVar = aVar;
                aVar.mo95659a(aVar.mo95657a());
                aVar.mo95658a(aVar.f121296e);
                if (C48202m.this.f121279e) {
                    C48202m.this.f121279e = false;
                    animation.setDuration(1332);
                    aVar.mo95660a(false);
                    return;
                }
                C48202m.this.f121278d = (C48202m.this.f121278d + 1.0f) % 5.0f;
            }
        });
        this.f121283k = r0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo95633a(float f, C48206a aVar) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int i = aVar.f121300i[aVar.f121301j];
            int i2 = aVar.f121300i[aVar.mo95657a()];
            int i3 = (i >> 24) & NormalGiftView.ALPHA_255;
            int i4 = (i >> 16) & NormalGiftView.ALPHA_255;
            int i5 = (i >> 8) & NormalGiftView.ALPHA_255;
            int i6 = i & NormalGiftView.ALPHA_255;
            aVar.f121314w = ((i3 + ((int) (((float) (((i2 >> 24) & NormalGiftView.ALPHA_255) - i3)) * f2))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & NormalGiftView.ALPHA_255) - i4)) * f2))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & NormalGiftView.ALPHA_255) - i5)) * f2))) << 8) | (i6 + ((int) (f2 * ((float) ((i2 & NormalGiftView.ALPHA_255) - i6)))));
        }
    }

    /* renamed from: a */
    private void m104434a(double d, double d2, double d3, double d4, float f, float f2) {
        float f3;
        C48206a aVar = this.f121276b;
        float f4 = this.f121281i.getDisplayMetrics().density;
        double d5 = (double) f4;
        Double.isNaN(d5);
        this.f121284l = d * d5;
        Double.isNaN(d5);
        this.f121285m = d2 * d5;
        float f5 = ((float) d4) * f4;
        aVar.f121298g = f5;
        aVar.f121293b.setStrokeWidth(f5);
        aVar.mo95666d();
        Double.isNaN(d5);
        aVar.f121308q = d3 * d5;
        aVar.mo95659a(0);
        float f6 = f2 * f4;
        aVar.f121309r = (int) (f * f4);
        aVar.f121310s = (int) f6;
        float min = (float) Math.min((int) this.f121284l, (int) this.f121285m);
        if (aVar.f121308q <= ProfileUiInitOptimizeEnterThreshold.DEFAULT || min < 0.0f) {
            f3 = (float) Math.ceil((double) (aVar.f121298g / 2.0f));
        } else {
            double d6 = (double) (min / 2.0f);
            double d7 = aVar.f121308q;
            Double.isNaN(d6);
            f3 = (float) (d6 - d7);
        }
        aVar.f121299h = f3;
    }
}
