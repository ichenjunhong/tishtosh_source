package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileTabView */
public class ProfileTabView extends RelativeLayout {

    /* renamed from: a */
    public TextView f102539a;

    /* renamed from: b */
    public boolean f102540b;

    /* renamed from: c */
    private TextView f102541c;

    /* renamed from: d */
    private int f102542d;

    /* renamed from: e */
    private int f102543e;

    /* renamed from: f */
    private ValueAnimator f102544f;

    /* renamed from: g */
    private ValueAnimator f102545g;

    /* renamed from: h */
    private boolean f102546h;

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f102541c = (TextView) findViewById(16908308);
        this.f102539a = (TextView) findViewById(R.id.a4m);
    }

    /* renamed from: a */
    private void m89359a() {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f102542d = (int) (8.0f * f);
        this.f102543e = (int) (f * 3.0f);
        m89360b();
        m89361c();
    }

    /* renamed from: b */
    private void m89360b() {
        this.f102544f = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f102544f.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProfileTabView.this.mo82351a(valueAnimator);
            }
        });
        this.f102544f.setDuration(300);
    }

    /* renamed from: c */
    private void m89361c() {
        this.f102545g = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f102545g.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProfileTabView.this.mo82351a(valueAnimator);
            }
        });
        this.f102545g.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ProfileTabView.this.f102539a.setVisibility(8);
            }
        });
        this.f102545g.setDuration(300);
    }

    public void setAnimationEnabled(boolean z) {
        this.f102546h = z;
    }

    public ProfileTabView(Context context) {
        super(context);
        m89359a();
    }

    public void setDescription(String str) {
        this.f102539a.setText(str);
    }

    public void setText(String str) {
        this.f102541c.setText(str);
    }

    public void setTextColor(int i) {
        this.f102541c.setTextColor(i);
    }

    public void setDrawableLeft(Drawable drawable) {
        this.f102541c.setCompoundDrawables(drawable, null, null, null);
        if (VERSION.SDK_INT >= 17) {
            this.f102541c.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, null, null, null);
        }
        this.f102541c.setCompoundDrawablePadding((int) C9432q.m18687b(getContext(), 3.5f));
    }

    /* renamed from: a */
    public final void mo82351a(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = floatValue - 1.0f;
        this.f102541c.setTranslationY(((float) this.f102542d) * f);
        float f2 = 1.0f - floatValue;
        float f3 = 1.0f - (0.13f * f2);
        this.f102541c.setScaleX(f3);
        this.f102541c.setScaleY(f3);
        this.f102539a.setTranslationY(f * ((float) (this.f102542d - this.f102543e)));
        this.f102539a.setAlpha(f2);
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f102544f.cancel();
        this.f102545g.cancel();
        if (z) {
            if (this.f102546h) {
                if (this.f102540b) {
                    this.f102541c.setAlpha(1.0f);
                } else {
                    this.f102539a.setVisibility(0);
                    this.f102544f.start();
                }
            }
        } else if (this.f102546h) {
            if (this.f102540b) {
                this.f102541c.setAlpha(0.6f);
                return;
            }
            this.f102545g.start();
        }
    }

    public ProfileTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m89359a();
    }

    public ProfileTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m89359a();
    }
}
