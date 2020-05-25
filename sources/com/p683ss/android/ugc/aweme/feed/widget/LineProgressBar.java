package com.p683ss.android.ugc.aweme.feed.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.LineProgressBar */
public class LineProgressBar extends FrameLayout {

    /* renamed from: a */
    public View f81695a;

    /* renamed from: b */
    public ValueAnimator f81696b;

    /* renamed from: c */
    public AnimatorUpdateListener f81697c;

    /* renamed from: d */
    private View f81698d;

    /* renamed from: e */
    private View f81699e;

    /* renamed from: f */
    private float f81700f;

    /* renamed from: g */
    private ObjectAnimator f81701g;

    /* renamed from: h */
    private ObjectAnimator f81702h;

    /* renamed from: d */
    private void m72920d() {
        this.f81697c = new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float intValue = (float) ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue <= 0.0f || intValue > 100.0f) {
                    if (intValue > 100.0f && intValue <= 200.0f) {
                        float f = (intValue - 100.0f) / 100.0f;
                        LineProgressBar.this.f81695a.setAlpha(1.0f - f);
                        LineProgressBar.this.f81695a.setScaleX((f * 0.2f) + 0.8f);
                    }
                    return;
                }
                float f2 = intValue / 100.0f;
                LineProgressBar.this.f81695a.setAlpha(f2);
                LineProgressBar.this.f81695a.setScaleX(f2 * 0.8f);
            }
        };
    }

    /* renamed from: f */
    private void m72922f() {
        m72921e();
        this.f81701g.start();
    }

    /* renamed from: e */
    private void m72921e() {
        if (C9376b.m18558a((Collection<T>) this.f81701g.getListeners())) {
            this.f81701g.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    if (C9376b.m18558a((Collection<T>) LineProgressBar.this.f81696b.getListeners())) {
                        LineProgressBar.this.f81696b.addUpdateListener(LineProgressBar.this.f81697c);
                    }
                    LineProgressBar.this.f81696b.start();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo64035b() {
        this.f81702h = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
        this.f81702h.setDuration(300);
        this.f81702h.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (LineProgressBar.this.f81696b != null) {
                    LineProgressBar.this.f81696b.cancel();
                }
                LineProgressBar.this.setAlpha(1.0f);
                LineProgressBar.this.setVisibility(4);
            }
        });
        this.f81702h.start();
    }

    /* renamed from: c */
    public final void mo64036c() {
        if (this.f81696b != null) {
            this.f81696b.removeAllUpdateListeners();
            this.f81696b.cancel();
        }
        if (this.f81701g != null) {
            this.f81701g.removeAllListeners();
            this.f81701g.cancel();
        }
        if (this.f81702h != null) {
            this.f81702h.removeAllListeners();
            this.f81702h.cancel();
        }
    }

    /* renamed from: a */
    public final void mo64034a() {
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        if (this.f81696b == null) {
            this.f81696b = ValueAnimator.ofInt(new int[]{0, 200});
            this.f81696b.setDuration(600);
            this.f81696b.setRepeatCount(-1);
            this.f81696b.addUpdateListener(this.f81697c);
        }
        if (this.f81701g == null) {
            this.f81701g = ObjectAnimator.ofFloat(this.f81698d, "alpha", new float[]{0.0f, 1.0f});
            this.f81701g.setDuration(300);
            m72921e();
        }
        if (this.f81702h == null || !this.f81702h.isRunning()) {
            if (!this.f81701g.isRunning() && !this.f81696b.isRunning()) {
                m72922f();
            }
            return;
        }
        this.f81702h.cancel();
        m72922f();
    }

    public LineProgressBar(Context context) {
        super(context);
        m72919a(context);
    }

    /* renamed from: a */
    private void m72919a(Context context) {
        this.f81699e = LayoutInflater.from(context).inflate(R.layout.av1, this);
        this.f81695a = this.f81699e.findViewById(R.id.bb0);
        this.f81698d = this.f81699e.findViewById(R.id.baw);
        this.f81695a.setAlpha(0.0f);
        this.f81698d.setAlpha(0.0f);
        this.f81700f = ((float) C9432q.m18670a(getContext())) - C9432q.m18687b(getContext(), 30.0f);
        m72920d();
    }

    public LineProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m72919a(context);
    }

    public LineProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m72919a(context);
    }
}
