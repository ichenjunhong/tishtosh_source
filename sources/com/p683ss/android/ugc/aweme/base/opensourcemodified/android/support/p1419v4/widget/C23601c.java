package com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget;

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

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.c */
final class C23601c extends Drawable implements Animatable {

    /* renamed from: a */
    static final Interpolator f62804a = new C1023b();

    /* renamed from: f */
    private static final Interpolator f62805f = new LinearInterpolator();

    /* renamed from: g */
    private static final int[] f62806g = {-16777216};

    /* renamed from: b */
    final C23605a f62807b;

    /* renamed from: c */
    public float f62808c;

    /* renamed from: d */
    float f62809d;

    /* renamed from: e */
    boolean f62810e;

    /* renamed from: h */
    private final ArrayList<Animation> f62811h = new ArrayList<>();

    /* renamed from: i */
    private Resources f62812i;

    /* renamed from: j */
    private View f62813j;

    /* renamed from: k */
    private Animation f62814k;

    /* renamed from: l */
    private double f62815l;

    /* renamed from: m */
    private double f62816m;

    /* renamed from: n */
    private final Callback f62817n = new Callback() {
        public final void invalidateDrawable(Drawable drawable) {
            C23601c.this.invalidateSelf();
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C23601c.this.unscheduleSelf(runnable);
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C23601c.this.scheduleSelf(runnable, j);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.c$a */
    static class C23605a {

        /* renamed from: a */
        final RectF f62823a = new RectF();

        /* renamed from: b */
        final Paint f62824b = new Paint();

        /* renamed from: c */
        final Paint f62825c = new Paint();

        /* renamed from: d */
        public float f62826d = 0.0f;

        /* renamed from: e */
        public float f62827e = 0.0f;

        /* renamed from: f */
        public float f62828f = 0.0f;

        /* renamed from: g */
        public float f62829g = 5.0f;

        /* renamed from: h */
        public float f62830h = 2.5f;

        /* renamed from: i */
        int[] f62831i;

        /* renamed from: j */
        int f62832j;

        /* renamed from: k */
        public float f62833k;

        /* renamed from: l */
        public float f62834l;

        /* renamed from: m */
        public float f62835m;

        /* renamed from: n */
        boolean f62836n;

        /* renamed from: o */
        Path f62837o;

        /* renamed from: p */
        float f62838p;

        /* renamed from: q */
        public double f62839q;

        /* renamed from: r */
        int f62840r;

        /* renamed from: s */
        int f62841s;

        /* renamed from: t */
        public int f62842t;

        /* renamed from: u */
        final Paint f62843u = new Paint(1);

        /* renamed from: v */
        public int f62844v;

        /* renamed from: w */
        public int f62845w;

        /* renamed from: x */
        private final Callback f62846x;

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo48870d() {
            this.f62846x.invalidateDrawable(null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo48861a() {
            return (this.f62832j + 1) % this.f62831i.length;
        }

        /* renamed from: b */
        public final void mo48866b() {
            this.f62833k = this.f62826d;
            this.f62834l = this.f62827e;
            this.f62835m = this.f62828f;
        }

        /* renamed from: c */
        public final void mo48868c() {
            this.f62833k = 0.0f;
            this.f62834l = 0.0f;
            this.f62835m = 0.0f;
            mo48862a(0.0f);
            mo48867b(0.0f);
            mo48869c(0.0f);
        }

        /* renamed from: a */
        public final void mo48862a(float f) {
            this.f62826d = f;
            mo48870d();
        }

        /* renamed from: b */
        public final void mo48867b(float f) {
            this.f62827e = f;
            mo48870d();
        }

        /* renamed from: c */
        public final void mo48869c(float f) {
            this.f62828f = f;
            mo48870d();
        }

        /* renamed from: a */
        public final void mo48863a(int i) {
            this.f62832j = i;
            this.f62845w = this.f62831i[this.f62832j];
        }

        /* renamed from: a */
        public final void mo48864a(boolean z) {
            if (this.f62836n != z) {
                this.f62836n = z;
                mo48870d();
            }
        }

        C23605a(Callback callback) {
            this.f62846x = callback;
            this.f62824b.setStrokeCap(Cap.SQUARE);
            this.f62824b.setAntiAlias(true);
            this.f62824b.setStyle(Style.STROKE);
            this.f62825c.setStyle(Style.FILL);
            this.f62825c.setAntiAlias(true);
        }

        /* renamed from: a */
        public final void mo48865a(int[] iArr) {
            this.f62831i = iArr;
            mo48863a(0);
        }
    }

    public final int getIntrinsicHeight() {
        return (int) this.f62816m;
    }

    public final int getIntrinsicWidth() {
        return (int) this.f62815l;
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getAlpha() {
        return this.f62807b.f62842t;
    }

    public final void stop() {
        this.f62813j.clearAnimation();
        mo48843c(0.0f);
        this.f62807b.mo48864a(false);
        this.f62807b.mo48863a(0);
        this.f62807b.mo48868c();
    }

    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.f62811h;
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
        this.f62814k.reset();
        this.f62807b.mo48866b();
        if (this.f62807b.f62827e != this.f62807b.f62826d) {
            this.f62810e = true;
            this.f62814k.setDuration(666);
            this.f62813j.startAnimation(this.f62814k);
            return;
        }
        this.f62807b.mo48863a(0);
        this.f62807b.mo48868c();
        this.f62814k.setDuration(1332);
        this.f62813j.startAnimation(this.f62814k);
    }

    /* renamed from: a */
    public final void mo48839a(boolean z) {
        this.f62807b.mo48864a(z);
    }

    /* renamed from: b */
    public final void mo48840b(float f) {
        this.f62807b.mo48869c(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo48843c(float f) {
        this.f62808c = f;
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.f62807b.f62842t = i;
    }

    /* renamed from: a */
    public final void mo48835a(float f) {
        C23605a aVar = this.f62807b;
        if (f != aVar.f62838p) {
            aVar.f62838p = f;
            aVar.mo48870d();
        }
    }

    /* renamed from: b */
    public final void mo48842b(int i) {
        this.f62807b.f62844v = i;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        C23605a aVar = this.f62807b;
        aVar.f62824b.setColorFilter(colorFilter);
        aVar.mo48870d();
    }

    /* renamed from: a */
    static float m57844a(C23605a aVar) {
        double d = (double) aVar.f62829g;
        double d2 = aVar.f62839q * 6.283185307179586d;
        Double.isNaN(d);
        return (float) Math.toRadians(d / d2);
    }

    /* renamed from: a */
    public final void mo48838a(int i) {
        if (i == 0) {
            m57845a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m57845a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f62808c, bounds.exactCenterX(), bounds.exactCenterY());
        C23605a aVar = this.f62807b;
        RectF rectF = aVar.f62823a;
        rectF.set(bounds);
        rectF.inset(aVar.f62830h, aVar.f62830h);
        float f = (aVar.f62826d + aVar.f62828f) * 360.0f;
        float f2 = ((aVar.f62827e + aVar.f62828f) * 360.0f) - f;
        aVar.f62824b.setColor(aVar.f62845w);
        canvas.drawArc(rectF, f, f2, false, aVar.f62824b);
        if (aVar.f62836n) {
            if (aVar.f62837o == null) {
                aVar.f62837o = new Path();
                aVar.f62837o.setFillType(FillType.EVEN_ODD);
            } else {
                aVar.f62837o.reset();
            }
            float f3 = ((float) (((int) aVar.f62830h) / 2)) * aVar.f62838p;
            double cos = aVar.f62839q * Math.cos(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
            double exactCenterX = (double) bounds.exactCenterX();
            Double.isNaN(exactCenterX);
            float f4 = (float) (cos + exactCenterX);
            double sin = aVar.f62839q * Math.sin(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
            double exactCenterY = (double) bounds.exactCenterY();
            Double.isNaN(exactCenterY);
            float f5 = (float) (sin + exactCenterY);
            aVar.f62837o.moveTo(0.0f, 0.0f);
            aVar.f62837o.lineTo(((float) aVar.f62840r) * aVar.f62838p, 0.0f);
            aVar.f62837o.lineTo((((float) aVar.f62840r) * aVar.f62838p) / 2.0f, ((float) aVar.f62841s) * aVar.f62838p);
            aVar.f62837o.offset(f4 - f3, f5);
            aVar.f62837o.close();
            aVar.f62825c.setColor(aVar.f62845w);
            canvas.rotate((f + f2) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(aVar.f62837o, aVar.f62825c);
        }
        if (aVar.f62842t < 255) {
            aVar.f62843u.setColor(aVar.f62844v);
            aVar.f62843u.setAlpha(NormalGiftView.ALPHA_255 - aVar.f62842t);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) (bounds.width() / 2), aVar.f62843u);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public final void mo48836a(float f, float f2) {
        this.f62807b.mo48862a(0.0f);
        this.f62807b.mo48867b(f2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo48841b(float f, C23605a aVar) {
        mo48837a(f, aVar);
        float floor = (float) (Math.floor((double) (aVar.f62835m / 0.8f)) + 1.0d);
        aVar.mo48862a(aVar.f62833k + (((aVar.f62834l - m57844a(aVar)) - aVar.f62833k) * f));
        aVar.mo48867b(aVar.f62834l);
        aVar.mo48869c(aVar.f62835m + ((floor - aVar.f62835m) * f));
    }

    C23601c(Context context, View view) {
        this.f62813j = view;
        this.f62812i = context.getResources();
        this.f62807b = new C23605a(this.f62817n);
        this.f62807b.mo48865a(f62806g);
        mo48838a(1);
        final C23605a aVar = this.f62807b;
        C236021 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                if (C23601c.this.f62810e) {
                    C23601c.this.mo48841b(f, aVar);
                    return;
                }
                float a = C23601c.m57844a(aVar);
                float f2 = aVar.f62834l;
                float f3 = aVar.f62833k;
                float f4 = aVar.f62835m;
                C23601c.this.mo48837a(f, aVar);
                if (f <= 0.5f) {
                    aVar.mo48862a(f3 + ((0.8f - a) * C23601c.f62804a.getInterpolation(f / 0.5f)));
                }
                if (f > 0.5f) {
                    aVar.mo48867b(f2 + ((0.8f - a) * C23601c.f62804a.getInterpolation((f - 0.5f) / 0.5f)));
                }
                aVar.mo48869c(f4 + (0.25f * f));
                C23601c.this.mo48843c((f * 216.0f) + ((C23601c.this.f62809d / 5.0f) * 1080.0f));
            }
        };
        r0.setRepeatCount(-1);
        r0.setRepeatMode(1);
        r0.setInterpolator(f62805f);
        r0.setAnimationListener(new AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                C23601c.this.f62809d = 0.0f;
            }

            public final void onAnimationRepeat(Animation animation) {
                aVar.mo48866b();
                C23605a aVar = aVar;
                aVar.mo48863a(aVar.mo48861a());
                aVar.mo48862a(aVar.f62827e);
                if (C23601c.this.f62810e) {
                    C23601c.this.f62810e = false;
                    animation.setDuration(1332);
                    aVar.mo48864a(false);
                    return;
                }
                C23601c.this.f62809d = (C23601c.this.f62809d + 1.0f) % 5.0f;
            }
        });
        this.f62814k = r0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo48837a(float f, C23605a aVar) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int i = aVar.f62831i[aVar.f62832j];
            int i2 = aVar.f62831i[aVar.mo48861a()];
            int i3 = (i >> 24) & NormalGiftView.ALPHA_255;
            int i4 = (i >> 16) & NormalGiftView.ALPHA_255;
            int i5 = (i >> 8) & NormalGiftView.ALPHA_255;
            int i6 = i & NormalGiftView.ALPHA_255;
            aVar.f62845w = ((i3 + ((int) (((float) (((i2 >> 24) & NormalGiftView.ALPHA_255) - i3)) * f2))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & NormalGiftView.ALPHA_255) - i4)) * f2))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & NormalGiftView.ALPHA_255) - i5)) * f2))) << 8) | (i6 + ((int) (f2 * ((float) ((i2 & NormalGiftView.ALPHA_255) - i6)))));
        }
    }

    /* renamed from: a */
    private void m57845a(double d, double d2, double d3, double d4, float f, float f2) {
        float f3;
        C23605a aVar = this.f62807b;
        float f4 = this.f62812i.getDisplayMetrics().density;
        double d5 = (double) f4;
        Double.isNaN(d5);
        this.f62815l = d * d5;
        Double.isNaN(d5);
        this.f62816m = d2 * d5;
        float f5 = ((float) d4) * f4;
        aVar.f62829g = f5;
        aVar.f62824b.setStrokeWidth(f5);
        aVar.mo48870d();
        Double.isNaN(d5);
        aVar.f62839q = d3 * d5;
        aVar.mo48863a(0);
        float f6 = f2 * f4;
        aVar.f62840r = (int) (f * f4);
        aVar.f62841s = (int) f6;
        float min = (float) Math.min((int) this.f62815l, (int) this.f62816m);
        if (aVar.f62839q <= ProfileUiInitOptimizeEnterThreshold.DEFAULT || min < 0.0f) {
            f3 = (float) Math.ceil((double) (aVar.f62829g / 2.0f));
        } else {
            double d6 = (double) (min / 2.0f);
            double d7 = aVar.f62839q;
            Double.isNaN(d6);
            f3 = (float) (d6 - d7);
        }
        aVar.f62830h = f3;
    }
}
