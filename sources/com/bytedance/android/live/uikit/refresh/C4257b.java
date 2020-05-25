package com.bytedance.android.live.uikit.refresh;

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
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.uikit.refresh.b */
final class C4257b extends Drawable implements Animatable {

    /* renamed from: a */
    public static final Interpolator f11665a = new C4261a();

    /* renamed from: b */
    public static final Interpolator f11666b = new C4263c();

    /* renamed from: g */
    private static final Interpolator f11667g = new LinearInterpolator();

    /* renamed from: h */
    private static final Interpolator f11668h = new AccelerateDecelerateInterpolator();

    /* renamed from: c */
    final C4262b f11669c;

    /* renamed from: d */
    public float f11670d;

    /* renamed from: e */
    public float f11671e;

    /* renamed from: f */
    boolean f11672f;

    /* renamed from: i */
    private final int[] f11673i = {-16777216};

    /* renamed from: j */
    private final ArrayList<Animation> f11674j = new ArrayList<>();

    /* renamed from: k */
    private Resources f11675k;

    /* renamed from: l */
    private View f11676l;

    /* renamed from: m */
    private Animation f11677m;

    /* renamed from: n */
    private double f11678n;

    /* renamed from: o */
    private double f11679o;

    /* renamed from: p */
    private final Callback f11680p = new Callback() {
        public final void invalidateDrawable(Drawable drawable) {
            C4257b.this.invalidateSelf();
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C4257b.this.unscheduleSelf(runnable);
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C4257b.this.scheduleSelf(runnable, j);
        }
    };

    /* renamed from: com.bytedance.android.live.uikit.refresh.b$a */
    static class C4261a extends AccelerateDecelerateInterpolator {
        private C4261a() {
        }

        public final float getInterpolation(float f) {
            return super.getInterpolation(Math.max(0.0f, (f - 0.5f) * 2.0f));
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.refresh.b$b */
    static class C4262b {

        /* renamed from: a */
        final RectF f11686a = new RectF();

        /* renamed from: b */
        final Paint f11687b = new Paint();

        /* renamed from: c */
        final Paint f11688c = new Paint();

        /* renamed from: d */
        public float f11689d = 0.0f;

        /* renamed from: e */
        public float f11690e = 0.0f;

        /* renamed from: f */
        public float f11691f = 0.0f;

        /* renamed from: g */
        public float f11692g = 5.0f;

        /* renamed from: h */
        public float f11693h = 2.5f;

        /* renamed from: i */
        int[] f11694i;

        /* renamed from: j */
        public int f11695j;

        /* renamed from: k */
        public float f11696k;

        /* renamed from: l */
        public float f11697l;

        /* renamed from: m */
        public float f11698m;

        /* renamed from: n */
        boolean f11699n;

        /* renamed from: o */
        Path f11700o;

        /* renamed from: p */
        float f11701p;

        /* renamed from: q */
        public double f11702q;

        /* renamed from: r */
        int f11703r;

        /* renamed from: s */
        int f11704s;

        /* renamed from: t */
        public int f11705t;

        /* renamed from: u */
        final Paint f11706u = new Paint();

        /* renamed from: v */
        public int f11707v;

        /* renamed from: w */
        private final Callback f11708w;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo9933c() {
            this.f11708w.invalidateDrawable(null);
        }

        /* renamed from: a */
        public final void mo9927a() {
            this.f11696k = this.f11689d;
            this.f11697l = this.f11690e;
            this.f11698m = this.f11691f;
        }

        /* renamed from: b */
        public final void mo9931b() {
            this.f11696k = 0.0f;
            this.f11697l = 0.0f;
            this.f11698m = 0.0f;
            mo9928a(0.0f);
            mo9932b(0.0f);
            mo9934c(0.0f);
        }

        /* renamed from: a */
        public final void mo9928a(float f) {
            this.f11689d = f;
            mo9933c();
        }

        /* renamed from: b */
        public final void mo9932b(float f) {
            this.f11690e = f;
            mo9933c();
        }

        /* renamed from: c */
        public final void mo9934c(float f) {
            this.f11691f = f;
            mo9933c();
        }

        /* renamed from: a */
        public final void mo9929a(boolean z) {
            if (this.f11699n != z) {
                this.f11699n = z;
                mo9933c();
            }
        }

        /* renamed from: a */
        public final void mo9930a(int[] iArr) {
            this.f11694i = iArr;
            this.f11695j = 0;
        }

        public C4262b(Callback callback) {
            this.f11708w = callback;
            this.f11687b.setStrokeCap(Cap.SQUARE);
            this.f11687b.setAntiAlias(true);
            this.f11687b.setStyle(Style.STROKE);
            this.f11688c.setStyle(Style.FILL);
            this.f11688c.setAntiAlias(true);
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.refresh.b$c */
    static class C4263c extends AccelerateDecelerateInterpolator {
        private C4263c() {
        }

        public final float getInterpolation(float f) {
            return super.getInterpolation(Math.min(1.0f, f * 2.0f));
        }
    }

    public final int getIntrinsicHeight() {
        return (int) this.f11679o;
    }

    public final int getIntrinsicWidth() {
        return (int) this.f11678n;
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getAlpha() {
        return this.f11669c.f11705t;
    }

    public final void stop() {
        this.f11676l.clearAnimation();
        mo9904a(0.0f);
        this.f11669c.mo9929a(false);
        this.f11669c.f11695j = 0;
        this.f11669c.mo9931b();
    }

    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.f11674j;
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
        this.f11677m.reset();
        this.f11669c.mo9927a();
        if (this.f11669c.f11690e != this.f11669c.f11689d) {
            this.f11672f = true;
            this.f11677m.setDuration(666);
            this.f11676l.startAnimation(this.f11677m);
            return;
        }
        this.f11669c.f11695j = 0;
        this.f11669c.mo9931b();
        this.f11677m.setDuration(1333);
        this.f11676l.startAnimation(this.f11677m);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9904a(float f) {
        this.f11670d = f;
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo9908b(int i) {
        this.f11669c.f11707v = i;
    }

    public final void setAlpha(int i) {
        this.f11669c.f11705t = i;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        C4262b bVar = this.f11669c;
        bVar.f11687b.setColorFilter(colorFilter);
        bVar.mo9933c();
    }

    /* renamed from: a */
    public final void mo9907a(boolean z) {
        this.f11669c.mo9929a(z);
    }

    /* renamed from: a */
    public final void mo9906a(int i) {
        if (i == 0) {
            m10518a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m10518a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f11670d, bounds.exactCenterX(), bounds.exactCenterY());
        C4262b bVar = this.f11669c;
        RectF rectF = bVar.f11686a;
        rectF.set(bounds);
        rectF.inset(bVar.f11693h, bVar.f11693h);
        float f = (bVar.f11689d + bVar.f11691f) * 360.0f;
        float f2 = ((bVar.f11690e + bVar.f11691f) * 360.0f) - f;
        bVar.f11687b.setColor(bVar.f11694i[bVar.f11695j]);
        canvas.drawArc(rectF, f, f2, false, bVar.f11687b);
        if (bVar.f11699n) {
            if (bVar.f11700o == null) {
                bVar.f11700o = new Path();
                bVar.f11700o.setFillType(FillType.EVEN_ODD);
            } else {
                bVar.f11700o.reset();
            }
            float f3 = ((float) (((int) bVar.f11693h) / 2)) * bVar.f11701p;
            double cos = bVar.f11702q * Math.cos(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
            double exactCenterX = (double) bounds.exactCenterX();
            Double.isNaN(exactCenterX);
            float f4 = (float) (cos + exactCenterX);
            double sin = bVar.f11702q * Math.sin(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
            double exactCenterY = (double) bounds.exactCenterY();
            Double.isNaN(exactCenterY);
            float f5 = (float) (sin + exactCenterY);
            bVar.f11700o.moveTo(0.0f, 0.0f);
            bVar.f11700o.lineTo(((float) bVar.f11703r) * bVar.f11701p, 0.0f);
            bVar.f11700o.lineTo((((float) bVar.f11703r) * bVar.f11701p) / 2.0f, ((float) bVar.f11704s) * bVar.f11701p);
            bVar.f11700o.offset(f4 - f3, f5);
            bVar.f11700o.close();
            bVar.f11688c.setColor(bVar.f11694i[bVar.f11695j]);
            canvas.rotate((f + f2) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(bVar.f11700o, bVar.f11688c);
        }
        if (bVar.f11705t < 255) {
            bVar.f11706u.setColor(bVar.f11707v);
            bVar.f11706u.setAlpha(NormalGiftView.ALPHA_255 - bVar.f11705t);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) (bounds.width() / 2), bVar.f11706u);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public final void mo9905a(float f, float f2) {
        this.f11669c.mo9928a(0.0f);
        this.f11669c.mo9932b(f2);
    }

    public C4257b(Context context, View view) {
        this.f11676l = view;
        this.f11675k = context.getResources();
        this.f11669c = new C4262b(this.f11680p);
        this.f11669c.mo9930a(this.f11673i);
        mo9906a(1);
        final C4262b bVar = this.f11669c;
        C42581 r6 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                if (C4257b.this.f11672f) {
                    C4262b bVar = bVar;
                    float floor = (float) (Math.floor((double) (bVar.f11698m / 0.8f)) + 1.0d);
                    bVar.mo9928a(bVar.f11696k + ((bVar.f11697l - bVar.f11696k) * f));
                    bVar.mo9934c(bVar.f11698m + ((floor - bVar.f11698m) * f));
                    return;
                }
                double d = (double) bVar.f11692g;
                double d2 = bVar.f11702q * 6.283185307179586d;
                Double.isNaN(d);
                float radians = (float) Math.toRadians(d / d2);
                float f2 = bVar.f11697l;
                float f3 = bVar.f11696k;
                float f4 = bVar.f11698m;
                bVar.mo9932b(f2 + ((0.8f - radians) * C4257b.f11666b.getInterpolation(f)));
                bVar.mo9928a(f3 + (C4257b.f11665a.getInterpolation(f) * 0.8f));
                bVar.mo9934c(f4 + (0.25f * f));
                C4257b.this.mo9904a((f * 144.0f) + ((C4257b.this.f11671e / 5.0f) * 720.0f));
            }
        };
        r6.setRepeatCount(-1);
        r6.setRepeatMode(1);
        r6.setInterpolator(f11667g);
        r6.setAnimationListener(new AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                C4257b.this.f11671e = 0.0f;
            }

            public final void onAnimationRepeat(Animation animation) {
                bVar.mo9927a();
                C4262b bVar = bVar;
                bVar.f11695j = (bVar.f11695j + 1) % bVar.f11694i.length;
                bVar.mo9928a(bVar.f11690e);
                if (C4257b.this.f11672f) {
                    C4257b.this.f11672f = false;
                    animation.setDuration(1333);
                    bVar.mo9929a(false);
                    return;
                }
                C4257b.this.f11671e = (C4257b.this.f11671e + 1.0f) % 5.0f;
            }
        });
        this.f11677m = r6;
    }

    /* renamed from: a */
    private void m10518a(double d, double d2, double d3, double d4, float f, float f2) {
        float f3;
        C4262b bVar = this.f11669c;
        float f4 = this.f11675k.getDisplayMetrics().density;
        double d5 = (double) f4;
        Double.isNaN(d5);
        this.f11678n = d * d5;
        Double.isNaN(d5);
        this.f11679o = d2 * d5;
        float f5 = ((float) d4) * f4;
        bVar.f11692g = f5;
        bVar.f11687b.setStrokeWidth(f5);
        bVar.mo9933c();
        Double.isNaN(d5);
        bVar.f11702q = d3 * d5;
        bVar.f11695j = 0;
        float f6 = f2 * f4;
        bVar.f11703r = (int) (f * f4);
        bVar.f11704s = (int) f6;
        float min = (float) Math.min((int) this.f11678n, (int) this.f11679o);
        if (bVar.f11702q <= ProfileUiInitOptimizeEnterThreshold.DEFAULT || min < 0.0f) {
            f3 = (float) Math.ceil((double) (bVar.f11692g / 2.0f));
        } else {
            double d6 = (double) (min / 2.0f);
            double d7 = bVar.f11702q;
            Double.isNaN(d6);
            f3 = (float) (d6 - d7);
        }
        bVar.f11693h = f3;
    }
}
