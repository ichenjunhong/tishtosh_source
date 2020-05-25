package com.p683ss.android.ugc.aweme.feed.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.p1397az.C23335b;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.utils.C47953s;
import com.ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout */
public class PeriscopeLayout extends FrameLayout {

    /* renamed from: a */
    int f81759a;

    /* renamed from: b */
    int f81760b;

    /* renamed from: c */
    LayoutParams f81761c;

    /* renamed from: d */
    Drawable[] f81762d;

    /* renamed from: e */
    public Random f81763e = new Random();

    /* renamed from: f */
    Queue<ImageView> f81764f;

    /* renamed from: g */
    int f81765g;

    /* renamed from: h */
    int f81766h;

    /* renamed from: i */
    int f81767i;

    /* renamed from: j */
    public int f81768j;

    /* renamed from: k */
    public Handler f81769k = new Handler(Looper.getMainLooper());

    /* renamed from: l */
    Runnable f81770l = new Runnable() {
        public final void run() {
            ImageView imageView;
            float f;
            float f2;
            PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
            if (periscopeLayout.f81764f.isEmpty()) {
                imageView = new ImageView(periscopeLayout.getContext());
                imageView.setLayoutParams(periscopeLayout.f81761c);
                periscopeLayout.addView(imageView);
            } else {
                imageView = (ImageView) periscopeLayout.f81764f.poll();
            }
            Drawable[] drawableArr = periscopeLayout.f81762d;
            int i = periscopeLayout.f81772n;
            periscopeLayout.f81772n = i + 1;
            imageView.setImageDrawable(drawableArr[i & 1]);
            if (periscopeLayout.f81778t == -1.0f) {
                periscopeLayout.f81778t = periscopeLayout.f81774p;
                float f3 = periscopeLayout.f81775q;
                periscopeLayout.f81779u = periscopeLayout.f81775q;
                if (periscopeLayout.f81771m) {
                    periscopeLayout.f81778t = (((float) periscopeLayout.f81760b) - periscopeLayout.f81778t) - periscopeLayout.f81779u;
                    f3 = (((float) periscopeLayout.f81760b) - f3) - periscopeLayout.f81779u;
                }
                periscopeLayout.f81780v = new PointF(periscopeLayout.f81778t, ((float) (periscopeLayout.f81759a - periscopeLayout.f81765g)) - periscopeLayout.f81776r);
                periscopeLayout.f81781w = new PointF(f3, periscopeLayout.f81773o);
                if (periscopeLayout.f81771m) {
                    f2 = ((float) periscopeLayout.f81766h) - periscopeLayout.f81779u;
                } else {
                    f2 = (float) (periscopeLayout.f81760b - periscopeLayout.f81766h);
                }
                periscopeLayout.f81782x = new PointF(f2, ((float) (periscopeLayout.f81759a - periscopeLayout.f81765g)) - periscopeLayout.f81777s);
            }
            C47953s sVar = new C47953s(periscopeLayout.f81780v, periscopeLayout.f81781w);
            Object[] objArr = new Object[2];
            objArr[0] = periscopeLayout.f81782x;
            if (periscopeLayout.f81771m) {
                f = (((float) periscopeLayout.f81760b) - periscopeLayout.f81779u) - C9432q.m18687b(periscopeLayout.getContext(), (float) (periscopeLayout.f81763e.nextInt(30) + 12));
            } else {
                f = C9432q.m18687b(periscopeLayout.getContext(), (float) (periscopeLayout.f81763e.nextInt(30) + 12));
            }
            objArr[1] = new PointF(f, 0.0f);
            ValueAnimator ofObject = ValueAnimator.ofObject(sVar, objArr);
            C31241a aVar = new C31241a(imageView);
            ofObject.addUpdateListener(aVar);
            ofObject.setTarget(imageView);
            imageView.setTag(R.id.cx_, aVar);
            ofObject.setDuration((long) periscopeLayout.f81768j);
            imageView.setTag(ofObject);
            ofObject.start();
            if (PeriscopeLayout.this.f81769k != null) {
                PeriscopeLayout.this.f81769k.postDelayed(this, (long) PeriscopeLayout.this.f81767i);
            }
        }
    };

    /* renamed from: m */
    boolean f81771m;

    /* renamed from: n */
    int f81772n = 0;

    /* renamed from: o */
    float f81773o;

    /* renamed from: p */
    float f81774p;

    /* renamed from: q */
    float f81775q;

    /* renamed from: r */
    float f81776r;

    /* renamed from: s */
    float f81777s;

    /* renamed from: t */
    float f81778t = -1.0f;

    /* renamed from: u */
    float f81779u = -1.0f;

    /* renamed from: v */
    PointF f81780v;

    /* renamed from: w */
    PointF f81781w;

    /* renamed from: x */
    PointF f81782x;

    /* renamed from: com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout$a */
    class C31241a implements AnimatorUpdateListener {

        /* renamed from: a */
        public View f81787a;

        /* renamed from: c */
        private int f81789c;

        /* renamed from: d */
        private int f81790d;

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f81787a != null && this.f81787a.getTag() != null) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                this.f81787a.setX(pointF.x);
                this.f81787a.setY(pointF.y);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction <= 0.7f) {
                    float f = animatedFraction / 0.7f;
                    this.f81787a.setAlpha(0.7f * f);
                    float f2 = (f * 0.3f) + 0.3f;
                    this.f81787a.setScaleX(f2);
                    this.f81787a.setScaleY(f2);
                } else if (((double) animatedFraction) <= 0.8d) {
                    this.f81787a.setAlpha(0.7f);
                    this.f81787a.setScaleX(0.6f);
                    this.f81787a.setScaleY(0.6f);
                } else if (animatedFraction <= 1.0f) {
                    float f3 = (animatedFraction - 0.8f) / 0.2f;
                    this.f81787a.setAlpha((1.0f - f3) * 0.7f);
                    float f4 = (f3 * 0.1f) + 0.6f;
                    this.f81787a.setScaleX(f4);
                    this.f81787a.setScaleY(f4);
                    if (((double) (1.0f - animatedFraction)) < 1.0E-10d) {
                        PeriscopeLayout.this.mo64100a(this.f81787a);
                        return;
                    }
                }
                if (animatedFraction <= 0.5f) {
                    this.f81787a.setRotation((animatedFraction / 0.5f) * 20.0f * ((float) this.f81789c));
                } else {
                    this.f81787a.setRotation((((animatedFraction - 0.5f) / 0.5f) * 20.0f * ((float) this.f81790d)) + ((float) (this.f81789c * 20)));
                }
            }
        }

        public C31241a(View view) {
            int i;
            this.f81787a = view;
            int i2 = -1;
            if (PeriscopeLayout.this.f81763e.nextBoolean()) {
                i = 1;
            } else {
                i = -1;
            }
            this.f81789c = i;
            if (PeriscopeLayout.this.f81763e.nextBoolean()) {
                i2 = 1;
            }
            this.f81790d = i2;
        }
    }

    /* renamed from: e */
    private void m72944e() {
        this.f81769k.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo64098a() {
        m72944e();
        this.f81769k.removeCallbacks(this.f81770l);
        m72943d();
    }

    /* renamed from: b */
    public final void mo64101b() {
        m72943d();
        m72944e();
        this.f81769k.removeCallbacks(this.f81770l);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f81769k.removeCallbacksAndMessages(null);
    }

    /* renamed from: d */
    private void m72943d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            mo64100a(getChildAt(i));
        }
    }

    /* renamed from: c */
    private void m72942c() {
        this.f81764f = new LinkedList();
        this.f81762d = new Drawable[2];
        Drawable drawable = getResources().getDrawable(R.drawable.df_);
        Drawable drawable2 = getResources().getDrawable(R.drawable.dfa);
        this.f81762d[0] = drawable;
        this.f81762d[1] = drawable2;
        this.f81765g = drawable.getIntrinsicHeight();
        this.f81766h = drawable.getIntrinsicWidth();
        this.f81761c = new LayoutParams(this.f81766h, this.f81765g);
        this.f81773o = C9432q.m18687b(getContext(), 51.0f);
        this.f81774p = C9432q.m18687b(getContext(), 48.0f);
        this.f81775q = C9432q.m18687b(getContext(), 20.0f);
        this.f81776r = C9432q.m18687b(getContext(), 8.0f);
        this.f81777s = C9432q.m18687b(getContext(), 2.0f);
    }

    public PeriscopeLayout(Context context) {
        super(context);
        m72942c();
    }

    /* renamed from: a */
    public final void mo64100a(View view) {
        if (view.getTag() != null) {
            this.f81764f.add((ImageView) view);
            ValueAnimator valueAnimator = (ValueAnimator) view.getTag();
            if (valueAnimator != null) {
                valueAnimator.setTarget(null);
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            }
            if (view.getTag(R.id.cx_) instanceof C31241a) {
                C31241a aVar = (C31241a) view.getTag(R.id.cx_);
                if (aVar != null) {
                    aVar.f81787a = null;
                }
            }
            view.setAlpha(0.0f);
            view.setScaleX(0.3f);
            view.setScaleY(0.3f);
            view.setRotation(0.0f);
            view.setTag(null);
        }
    }

    /* renamed from: a */
    public final void mo64099a(int i, int i2) {
        C23337c.m57397a((C23335b) new C23335b(3000, 800) {
            /* renamed from: a */
            public final void mo48399a() {
                PeriscopeLayout.this.f81768j = 3000;
                PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
                periscopeLayout.f81767i = 800;
                periscopeLayout.f81769k.removeCallbacksAndMessages(null);
                periscopeLayout.f81769k.postDelayed(periscopeLayout.f81770l, (long) (periscopeLayout.f81763e.nextInt(4) * 100));
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f81760b = getMeasuredWidth();
        this.f81759a = getMeasuredHeight();
        boolean z = true;
        if (C1056u.m3055f(this) != 1) {
            z = false;
        }
        this.f81771m = z;
        this.f81778t = -1.0f;
    }

    public PeriscopeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m72942c();
    }

    public PeriscopeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m72942c();
    }

    public PeriscopeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m72942c();
    }
}
