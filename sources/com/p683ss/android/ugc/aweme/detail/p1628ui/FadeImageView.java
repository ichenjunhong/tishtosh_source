package com.p683ss.android.ugc.aweme.detail.p1628ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.FadeImageView */
public class FadeImageView extends ImageView {

    /* renamed from: a */
    public C27482a f72277a;

    /* renamed from: b */
    private boolean f72278b;

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.FadeImageView$a */
    public interface C27482a {
        /* renamed from: a */
        void mo51833a(ImageView imageView);
    }

    public boolean isSelected() {
        return this.f72278b;
    }

    /* renamed from: a */
    public final void mo55892a() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f});
        ofFloat.setDuration(100);
        ofFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f});
        ofFloat2.setDuration(100);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (FadeImageView.this.f72277a != null) {
                    FadeImageView.this.f72277a.mo51833a(FadeImageView.this);
                }
            }
        });
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    public void setListener(C27482a aVar) {
        this.f72277a = aVar;
    }

    public void setSelected(boolean z) {
        this.f72278b = z;
    }

    public FadeImageView(Context context) {
        this(context, null);
    }

    public FadeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FadeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
