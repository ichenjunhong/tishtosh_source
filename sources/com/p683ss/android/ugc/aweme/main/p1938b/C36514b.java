package com.p683ss.android.ugc.aweme.main.p1938b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.main.b.b */
public final class C36514b {

    /* renamed from: a */
    public View f93586a;

    /* renamed from: b */
    public ViewStub f93587b;

    /* renamed from: c */
    private Handler f93588c;

    /* renamed from: d */
    private Runnable f93589d = new Runnable() {
        public final void run() {
            C36514b.this.mo75644b();
        }
    };

    /* renamed from: c */
    private void m82424c() {
        C47718bf.m103291d(this);
        if (this.f93588c != null) {
            this.f93588c.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: b */
    public final void mo75644b() {
        if (this.f93586a != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f93586a, "scaleX", new float[]{1.0f, 0.0f, 0.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f93586a, "scaleY", new float[]{1.0f, 0.0f, 0.0f});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(200);
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (C36514b.this.f93587b != null) {
                        C36514b.this.f93587b.setVisibility(8);
                    }
                    if (C36514b.this.f93586a != null) {
                        C36514b.this.f93586a.clearAnimation();
                        C36514b.this.f93586a.setVisibility(8);
                    }
                }
            });
            animatorSet.start();
            m82424c();
        }
    }

    /* renamed from: a */
    public final void mo75643a() {
        if (this.f93586a == null) {
            this.f93586a = this.f93587b.inflate();
        }
        this.f93588c = new Handler(Looper.getMainLooper());
        C26890h.onEvent(MobClick.obtain().setEventName("photo_notice").setLabelName("shoot_bottom_tab"));
        C47718bf.m103290c(this);
        this.f93586a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C36514b.this.mo75644b();
                C26890h.onEvent(MobClick.obtain().setEventName("photo_notice_click").setLabelName("shoot_bottom_tab"));
            }
        });
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f93586a, "scaleX", new float[]{0.0f, 1.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f93586a, "scaleY", new float[]{0.0f, 1.0f, 1.0f});
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(800);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                C36514b.this.f93586a.setVisibility(0);
            }
        });
        animatorSet.play(ofFloat).with(ofFloat2);
        this.f93588c.post(new Runnable() {
            public final void run() {
                animatorSet.start();
            }
        });
        this.f93588c.postDelayed(this.f93589d, 6000);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onEventMainThread(C36513a aVar) {
        mo75644b();
    }

    public C36514b(ViewStub viewStub) {
        this.f93587b = viewStub;
    }
}
