package com.bytedance.android.livesdk.gift.dialog.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.ss.android.ugc.trill.R;

public class LiveGiftComboView extends FrameLayout {

    /* renamed from: a */
    public View f19708a;

    /* renamed from: b */
    public View f19709b;

    /* renamed from: c */
    public boolean f19710c;

    /* renamed from: d */
    private Context f19711d;

    /* renamed from: e */
    private AnimatorSet f19712e;

    /* renamed from: f */
    private long f19713f;

    /* renamed from: a */
    public final void mo13485a() {
        if (this.f19712e != null && this.f19712e.isRunning()) {
            this.f19712e.cancel();
            this.f19712e.removeAllListeners();
            this.f19712e = null;
        }
        this.f19709b.setVisibility(8);
        this.f19708a.setVisibility(8);
    }

    public void setCountDownTime(long j) {
        this.f19713f = j;
    }

    public LiveGiftComboView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo13486a(final Runnable runnable) {
        if (this.f19712e != null && this.f19712e.isRunning()) {
            this.f19712e.cancel();
            this.f19712e.removeAllListeners();
            this.f19712e = null;
        }
        this.f19712e = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f19709b, "alpha", new float[]{0.0f, 1.0f}).setDuration(200);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f19708a, "scaleX", new float[]{0.0f, 1.0f}).setDuration(200);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.f19708a, "scaleY", new float[]{0.0f, 1.0f}).setDuration(200);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.f19708a, "alpha", new float[]{0.0f, 1.0f}).setDuration(200);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(this.f19708a, "rotation", new float[]{0.0f, 360.0f}).setDuration(this.f19713f);
        this.f19712e.playTogether(new Animator[]{duration, duration2, duration3, duration4, duration5});
        this.f19712e.addListener(new AnimatorListener() {
            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                LiveGiftComboView.this.f19710c = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!LiveGiftComboView.this.f19710c) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    LiveGiftComboView.this.f19709b.setVisibility(8);
                    LiveGiftComboView.this.f19708a.setVisibility(8);
                }
            }
        });
        this.f19710c = false;
        this.f19712e.start();
        this.f19709b.setVisibility(0);
        this.f19708a.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo13487b(final Runnable runnable) {
        if (this.f19712e != null && this.f19712e.isRunning()) {
            this.f19712e.cancel();
            this.f19712e.removeAllListeners();
            this.f19712e = null;
        }
        if (((Boolean) LiveConfigSettingKeys.LIVE_NEW_COMBO_STYLE.mo9431a()).booleanValue()) {
            this.f19708a.setAlpha(1.0f);
            this.f19709b.setAlpha(1.0f);
        }
        this.f19712e = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f19709b, "scaleX", new float[]{1.0f, 0.9f, 1.0f}).setDuration(133);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f19709b, "scaleY", new float[]{1.0f, 0.9f, 1.0f}).setDuration(133);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.f19708a, "scaleX", new float[]{1.0f, 0.9f, 1.0f}).setDuration(133);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.f19708a, "scaleY", new float[]{1.0f, 0.9f, 1.0f}).setDuration(133);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(this.f19708a, "rotation", new float[]{0.0f, 360.0f}).setDuration(this.f19713f);
        this.f19712e.playTogether(new Animator[]{duration, duration2, duration3, duration4, duration5});
        this.f19712e.addListener(new AnimatorListener() {
            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                LiveGiftComboView.this.f19710c = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!LiveGiftComboView.this.f19710c) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    LiveGiftComboView.this.f19709b.setVisibility(8);
                    LiveGiftComboView.this.f19708a.setVisibility(8);
                }
            }
        });
        this.f19710c = false;
        this.f19712e.start();
        this.f19709b.setVisibility(0);
        this.f19708a.setVisibility(0);
    }

    public LiveGiftComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveGiftComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19713f = 3000;
        this.f19711d = context;
        View.inflate(this.f19711d, R.layout.bvh, this);
        this.f19708a = findViewById(R.id.e2o);
        this.f19709b = findViewById(R.id.e2p);
    }
}
