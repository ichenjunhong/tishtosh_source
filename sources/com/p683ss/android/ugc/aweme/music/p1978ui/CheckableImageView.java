package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;

/* renamed from: com.ss.android.ugc.aweme.music.ui.CheckableImageView */
public class CheckableImageView extends RemoteImageView {

    /* renamed from: a */
    public C37446a f95494a;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.CheckableImageView$a */
    public interface C37446a {
        /* renamed from: a */
        void mo50574a();

        /* renamed from: a */
        void mo50575a(int i);
    }

    /* renamed from: b */
    public final void mo76959b() {
        mo76958a(1.0f);
    }

    public void setOnStateChangeListener(C37446a aVar) {
        this.f95494a = aVar;
    }

    public CheckableImageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo76958a(float f) {
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", new float[]{1.0f, 1.08f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", new float[]{1.0f, 1.08f});
        ofFloat.setDuration(100);
        ofFloat2.setDuration(100);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "scaleX", new float[]{1.08f, 0.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "scaleY", new float[]{1.08f, 0.0f});
        ofFloat3.setDuration(100);
        ofFloat4.setDuration(100);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, f});
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, "alpha", new float[]{f, 0.0f});
        ofFloat6.setDuration(100);
        ofFloat5.setDuration(100);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).with(ofFloat6).after(ofFloat);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this, "scaleX", new float[]{0.0f, 1.08f});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this, "scaleY", new float[]{0.0f, 1.08f});
        ofFloat7.setDuration(100);
        ofFloat8.setDuration(100);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this, "scaleX", new float[]{1.08f, 1.0f});
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this, "scaleY", new float[]{1.08f, 1.0f});
        ofFloat9.setDuration(100);
        ofFloat9.setDuration(100);
        final AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat7).with(ofFloat8).with(ofFloat5);
        animatorSet2.play(ofFloat9).with(ofFloat10).after(ofFloat7);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                if (CheckableImageView.this.f95494a != null) {
                    CheckableImageView.this.f95494a.mo50575a(0);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                animatorSet2.start();
                if (CheckableImageView.this.f95494a != null) {
                    CheckableImageView.this.f95494a.mo50575a(1);
                }
            }
        });
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (CheckableImageView.this.f95494a != null) {
                    CheckableImageView.this.f95494a.mo50574a();
                }
            }
        });
        animatorSet.start();
    }

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
