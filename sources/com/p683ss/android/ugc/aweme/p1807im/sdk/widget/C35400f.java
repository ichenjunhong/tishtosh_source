package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.f */
final /* synthetic */ class C35400f implements Runnable {

    /* renamed from: a */
    private final DragView f90988a;

    C35400f(DragView dragView) {
        this.f90988a = dragView;
    }

    public final void run() {
        DragView dragView = this.f90988a;
        if (dragView.f90752a != null && dragView.f90753b != null) {
            dragView.mo73538b();
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(dragView.f90761j);
            C35398d dVar = new C35398d(dragView, 1.0f - dragView.f90758g, 1.0f - dragView.f90759h, (float) (dragView.f90767p - dragView.f90770s), (float) (dragView.f90768q - dragView.f90769r));
            duration.addUpdateListener(dVar);
            duration.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (DragView.this.f90764m != null) {
                        DragView.this.f90764m.mo71094c();
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    DragView.this.f90753b.setVisibility(0);
                    if (DragView.this.f90764m != null) {
                        DragView.this.f90764m.mo71091a();
                    }
                }
            });
            duration.start();
        }
    }
}
