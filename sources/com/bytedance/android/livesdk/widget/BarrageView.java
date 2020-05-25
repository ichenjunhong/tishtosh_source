package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

public class BarrageView extends RelativeLayout {

    /* renamed from: a */
    View f22983a;

    /* renamed from: b */
    View f22984b;

    /* renamed from: c */
    public boolean f22985c;

    /* renamed from: d */
    public boolean f22986d;

    public View getDanmuContainer() {
        return this.f22983a;
    }

    public View getDanmuInput() {
        return this.f22984b;
    }

    /* renamed from: a */
    private void m16659a() {
        inflate(getContext(), getLayoutId(), this);
        this.f22983a = findViewById(R.id.a3c);
        this.f22984b = findViewById(R.id.a3a);
    }

    private int getLayoutId() {
        if (C4206c.m10426a(getContext())) {
            return R.layout.ap3;
        }
        return R.layout.ap2;
    }

    public BarrageView(Context context) {
        super(context);
        m16659a();
    }

    /* renamed from: b */
    public final void mo14684b(boolean z) {
        if (!this.f22985c && !this.f22986d) {
            if (C4206c.m10426a(getContext())) {
                m16663f(true);
            } else {
                m16661d(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo14683a(boolean z) {
        if (!this.f22985c && !this.f22986d) {
            if (C4206c.m10426a(getContext())) {
                m16662e(z);
            } else {
                m16660c(z);
            }
        }
    }

    /* renamed from: c */
    private void m16660c(boolean z) {
        this.f22984b.setSelected(true);
        if (z) {
            ((TransitionDrawable) this.f22983a.getBackground()).startTransition(100);
            ((TransitionDrawable) this.f22984b.getBackground()).startTransition(100);
            this.f22984b.animate().translationXBy(C9432q.m18687b(getContext(), 22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f22983a.getBackground()).startTransition(0);
        ((TransitionDrawable) this.f22984b.getBackground()).startTransition(0);
        this.f22984b.setTranslationX(C9432q.m18687b(getContext(), 22.0f));
    }

    /* renamed from: d */
    private void m16661d(boolean z) {
        this.f22984b.setSelected(false);
        if (z) {
            ((TransitionDrawable) this.f22983a.getBackground()).reverseTransition(100);
            ((TransitionDrawable) this.f22984b.getBackground()).reverseTransition(100);
            this.f22984b.animate().translationXBy(-C9432q.m18687b(getContext(), 22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f22983a.getBackground()).reverseTransition(0);
        ((TransitionDrawable) this.f22984b.getBackground()).reverseTransition(0);
        this.f22984b.setTranslationX(0.0f);
    }

    /* renamed from: e */
    private void m16662e(boolean z) {
        this.f22984b.setSelected(true);
        if (z) {
            ((TransitionDrawable) this.f22983a.getBackground()).startTransition(100);
            ((TransitionDrawable) this.f22984b.getBackground()).startTransition(100);
            this.f22984b.animate().setListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    BarrageView.this.f22985c = false;
                }

                public final void onAnimationStart(Animator animator) {
                    BarrageView.this.f22985c = true;
                }
            }).translationXBy(C9432q.m18687b(getContext(), -22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f22983a.getBackground()).startTransition(0);
        ((TransitionDrawable) this.f22984b.getBackground()).startTransition(0);
        this.f22984b.setTranslationX(C9432q.m18687b(getContext(), -22.0f));
    }

    /* renamed from: f */
    private void m16663f(boolean z) {
        this.f22984b.setSelected(false);
        if (z) {
            ((TransitionDrawable) this.f22983a.getBackground()).reverseTransition(100);
            ((TransitionDrawable) this.f22984b.getBackground()).reverseTransition(100);
            this.f22984b.animate().setListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    BarrageView.this.f22986d = true;
                }

                public final void onAnimationEnd(Animator animator) {
                    BarrageView.this.f22986d = false;
                    BarrageView.this.f22984b.setTranslationX(0.0f);
                }
            }).translationXBy(C9432q.m18687b(getContext(), 22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f22983a.getBackground()).reverseTransition(0);
        ((TransitionDrawable) this.f22984b.getBackground()).reverseTransition(0);
        this.f22984b.setTranslationX(0.0f);
    }

    public BarrageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16659a();
    }

    public BarrageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16659a();
    }

    public BarrageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m16659a();
    }
}
