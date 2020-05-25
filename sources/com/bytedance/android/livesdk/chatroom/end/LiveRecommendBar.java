package com.bytedance.android.livesdk.chatroom.end;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.common.utility.C9432q;

public class LiveRecommendBar extends View {

    /* renamed from: a */
    public int f13665a = -1;

    /* renamed from: b */
    public ValueAnimator f13666b;

    /* renamed from: c */
    private C5116a f13667c;

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar$a */
    class C5116a implements Runnable {

        /* renamed from: a */
        public C5118b f13668a;

        public final void run() {
            if (LiveRecommendBar.this.f13665a <= 0) {
                LiveRecommendBar.this.f13665a = LiveRecommendBar.this.getMeasuredWidth();
            }
            LiveRecommendBar.this.mo10997a();
            LiveRecommendBar.this.f13666b = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            LiveRecommendBar.this.f13666b.setDuration(5000);
            LiveRecommendBar.this.f13666b.setInterpolator(new LinearInterpolator());
            LiveRecommendBar.this.f13666b.addUpdateListener(new C5146l(this));
            LiveRecommendBar.this.f13666b.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (C5116a.this.f13668a != null) {
                        C5116a.this.f13668a.mo11004a();
                    }
                }
            });
            LiveRecommendBar.this.f13666b.start();
        }

        public C5116a(C5118b bVar) {
            this.f13668a = bVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar$b */
    public interface C5118b {
        /* renamed from: a */
        void mo11004a();
    }

    /* renamed from: a */
    public final void mo10997a() {
        removeCallbacks(this.f13667c);
        if (this.f13666b != null) {
            this.f13666b.removeAllUpdateListeners();
            this.f13666b.removeAllListeners();
            this.f13666b.cancel();
            C9432q.m18679a((View) this, this.f13665a, -3);
            this.f13666b = null;
        }
    }

    public LiveRecommendBar(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo10998a(C5118b bVar) {
        removeCallbacks(this.f13667c);
        this.f13667c = new C5116a(bVar);
        post(this.f13667c);
    }

    public LiveRecommendBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveRecommendBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LiveRecommendBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
