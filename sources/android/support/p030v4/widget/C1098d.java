package android.support.p030v4.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
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
import android.support.p030v4.p038f.C0799m;
import android.support.p030v4.view.p042b.C1023b;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: android.support.v4.widget.d */
public final class C1098d extends Drawable implements Animatable {

    /* renamed from: e */
    private static final Interpolator f3489e = new LinearInterpolator();

    /* renamed from: f */
    private static final Interpolator f3490f = new C1023b();

    /* renamed from: g */
    private static final int[] f3491g = {-16777216};

    /* renamed from: a */
    final C1101a f3492a = new C1101a();

    /* renamed from: b */
    public float f3493b;

    /* renamed from: c */
    float f3494c;

    /* renamed from: d */
    boolean f3495d;

    /* renamed from: h */
    private Resources f3496h;

    /* renamed from: i */
    private Animator f3497i;

    /* renamed from: android.support.v4.widget.d$a */
    static class C1101a {

        /* renamed from: a */
        final RectF f3502a = new RectF();

        /* renamed from: b */
        final Paint f3503b = new Paint();

        /* renamed from: c */
        final Paint f3504c = new Paint();

        /* renamed from: d */
        final Paint f3505d = new Paint();

        /* renamed from: e */
        public float f3506e = 0.0f;

        /* renamed from: f */
        public float f3507f = 0.0f;

        /* renamed from: g */
        public float f3508g = 0.0f;

        /* renamed from: h */
        public float f3509h = 5.0f;

        /* renamed from: i */
        public int[] f3510i;

        /* renamed from: j */
        int f3511j;

        /* renamed from: k */
        public float f3512k;

        /* renamed from: l */
        public float f3513l;

        /* renamed from: m */
        public float f3514m;

        /* renamed from: n */
        public boolean f3515n;

        /* renamed from: o */
        Path f3516o;

        /* renamed from: p */
        public float f3517p = 1.0f;

        /* renamed from: q */
        public float f3518q;

        /* renamed from: r */
        int f3519r;

        /* renamed from: s */
        int f3520s;

        /* renamed from: t */
        public int f3521t = NormalGiftView.ALPHA_255;

        /* renamed from: u */
        public int f3522u;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo3528b() {
            return this.f3510i[this.f3511j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo3523a() {
            return (this.f3511j + 1) % this.f3510i.length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo3529c() {
            this.f3512k = this.f3506e;
            this.f3513l = this.f3507f;
            this.f3514m = this.f3508g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo3530d() {
            this.f3512k = 0.0f;
            this.f3513l = 0.0f;
            this.f3514m = 0.0f;
            this.f3506e = 0.0f;
            this.f3507f = 0.0f;
            this.f3508g = 0.0f;
        }

        C1101a() {
            this.f3503b.setStrokeCap(Cap.SQUARE);
            this.f3503b.setAntiAlias(true);
            this.f3503b.setStyle(Style.STROKE);
            this.f3504c.setStyle(Style.FILL);
            this.f3504c.setAntiAlias(true);
            this.f3505d.setColor(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3524a(float f) {
            this.f3509h = f;
            this.f3503b.setStrokeWidth(f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3525a(int i) {
            this.f3511j = i;
            this.f3522u = this.f3510i[this.f3511j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3526a(boolean z) {
            if (this.f3515n != z) {
                this.f3515n = z;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3527a(int[] iArr) {
            this.f3510i = iArr;
            mo3525a(0);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getAlpha() {
        return this.f3492a.f3521t;
    }

    public final boolean isRunning() {
        return this.f3497i.isRunning();
    }

    public final void stop() {
        this.f3497i.cancel();
        this.f3493b = 0.0f;
        this.f3492a.mo3526a(false);
        this.f3492a.mo3525a(0);
        this.f3492a.mo3530d();
        invalidateSelf();
    }

    public final void start() {
        this.f3497i.cancel();
        this.f3492a.mo3529c();
        if (this.f3492a.f3507f != this.f3492a.f3506e) {
            this.f3495d = true;
            this.f3497i.setDuration(666);
            this.f3497i.start();
            return;
        }
        this.f3492a.mo3525a(0);
        this.f3492a.mo3530d();
        this.f3497i.setDuration(1332);
        this.f3497i.start();
    }

    public final void setAlpha(int i) {
        this.f3492a.f3521t = i;
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo3504a(float f) {
        C1101a aVar = this.f3492a;
        if (f != aVar.f3517p) {
            aVar.f3517p = f;
        }
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3492a.f3503b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C1098d(Context context) {
        this.f3496h = ((Context) C0799m.m2267a(context)).getResources();
        this.f3492a.mo3527a(f3491g);
        this.f3492a.mo3524a(2.5f);
        invalidateSelf();
        final C1101a aVar = this.f3492a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C1098d.this.mo3506a(floatValue, aVar);
                C1098d.this.mo3507a(floatValue, aVar, false);
                C1098d.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f3489e);
        ofFloat.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                C1098d.this.f3494c = 0.0f;
            }

            public final void onAnimationRepeat(Animator animator) {
                C1098d.this.mo3507a(1.0f, aVar, true);
                aVar.mo3529c();
                C1101a aVar = aVar;
                aVar.mo3525a(aVar.mo3523a());
                if (C1098d.this.f3495d) {
                    C1098d.this.f3495d = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    aVar.mo3526a(false);
                    return;
                }
                C1098d.this.f3494c += 1.0f;
            }
        });
        this.f3497i = ofFloat;
    }

    /* renamed from: a */
    public final void mo3508a(int i) {
        if (i == 0) {
            m3198a(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m3198a(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f3493b, bounds.exactCenterX(), bounds.exactCenterY());
        C1101a aVar = this.f3492a;
        RectF rectF = aVar.f3502a;
        float f = aVar.f3518q + (aVar.f3509h / 2.0f);
        if (aVar.f3518q <= 0.0f) {
            f = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) aVar.f3519r) * aVar.f3517p) / 2.0f, aVar.f3509h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f, ((float) bounds.centerY()) - f, ((float) bounds.centerX()) + f, ((float) bounds.centerY()) + f);
        float f2 = (aVar.f3506e + aVar.f3508g) * 360.0f;
        float f3 = ((aVar.f3507f + aVar.f3508g) * 360.0f) - f2;
        aVar.f3503b.setColor(aVar.f3522u);
        aVar.f3503b.setAlpha(aVar.f3521t);
        float f4 = aVar.f3509h / 2.0f;
        rectF.inset(f4, f4);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f3505d);
        float f5 = -f4;
        rectF.inset(f5, f5);
        canvas.drawArc(rectF, f2, f3, false, aVar.f3503b);
        if (aVar.f3515n) {
            if (aVar.f3516o == null) {
                aVar.f3516o = new Path();
                aVar.f3516o.setFillType(FillType.EVEN_ODD);
            } else {
                aVar.f3516o.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f6 = (((float) aVar.f3519r) * aVar.f3517p) / 2.0f;
            aVar.f3516o.moveTo(0.0f, 0.0f);
            aVar.f3516o.lineTo(((float) aVar.f3519r) * aVar.f3517p, 0.0f);
            aVar.f3516o.lineTo((((float) aVar.f3519r) * aVar.f3517p) / 2.0f, ((float) aVar.f3520s) * aVar.f3517p);
            aVar.f3516o.offset((min + rectF.centerX()) - f6, rectF.centerY() + (aVar.f3509h / 2.0f));
            aVar.f3516o.close();
            aVar.f3504c.setColor(aVar.f3522u);
            aVar.f3504c.setAlpha(aVar.f3521t);
            canvas.save();
            canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f3516o, aVar.f3504c);
            canvas.restore();
        }
        canvas.restore();
    }

    /* renamed from: a */
    public final void mo3509a(boolean z) {
        this.f3492a.mo3526a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo3505a(float f, float f2) {
        this.f3492a.f3506e = 0.0f;
        this.f3492a.f3507f = f2;
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3506a(float f, C1101a aVar) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int b = aVar.mo3528b();
            int i = aVar.f3510i[aVar.mo3523a()];
            int i2 = (b >> 24) & NormalGiftView.ALPHA_255;
            int i3 = (b >> 16) & NormalGiftView.ALPHA_255;
            int i4 = (b >> 8) & NormalGiftView.ALPHA_255;
            int i5 = b & NormalGiftView.ALPHA_255;
            aVar.f3522u = ((i2 + ((int) (((float) (((i >> 24) & NormalGiftView.ALPHA_255) - i2)) * f2))) << 24) | ((i3 + ((int) (((float) (((i >> 16) & NormalGiftView.ALPHA_255) - i3)) * f2))) << 16) | ((i4 + ((int) (((float) (((i >> 8) & NormalGiftView.ALPHA_255) - i4)) * f2))) << 8) | (i5 + ((int) (f2 * ((float) ((i & NormalGiftView.ALPHA_255) - i5)))));
            return;
        }
        aVar.f3522u = aVar.mo3528b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3507a(float f, C1101a aVar, boolean z) {
        float f2;
        float f3;
        if (this.f3495d) {
            mo3506a(f, aVar);
            float floor = (float) (Math.floor((double) (aVar.f3514m / 0.8f)) + 1.0d);
            aVar.f3506e = aVar.f3512k + (((aVar.f3513l - 0.01f) - aVar.f3512k) * f);
            aVar.f3507f = aVar.f3513l;
            aVar.f3508g = aVar.f3514m + ((floor - aVar.f3514m) * f);
            return;
        }
        if (f != 1.0f || z) {
            float f4 = aVar.f3514m;
            if (f < 0.5f) {
                float f5 = f / 0.5f;
                float f6 = aVar.f3512k;
                float f7 = f6;
                f2 = (f3490f.getInterpolation(f5) * 0.79f) + 0.01f + f6;
                f3 = f7;
            } else {
                f2 = aVar.f3512k + 0.79f;
                f3 = f2 - (((1.0f - f3490f.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            float f8 = f4 + (0.20999998f * f);
            float f9 = (f + this.f3494c) * 216.0f;
            aVar.f3506e = f3;
            aVar.f3507f = f2;
            aVar.f3508g = f8;
            this.f3493b = f9;
        }
    }

    /* renamed from: a */
    private void m3198a(float f, float f2, float f3, float f4) {
        C1101a aVar = this.f3492a;
        float f5 = this.f3496h.getDisplayMetrics().density;
        aVar.mo3524a(f2 * f5);
        aVar.f3518q = f * f5;
        aVar.mo3525a(0);
        float f6 = f4 * f5;
        aVar.f3519r = (int) (f3 * f5);
        aVar.f3520s = (int) f6;
    }
}
