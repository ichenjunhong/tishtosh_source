package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.h */
final /* synthetic */ class C44144h implements Runnable {

    /* renamed from: a */
    private final FastScroller f111838a;

    C44144h(FastScroller fastScroller) {
        this.f111838a = fastScroller;
    }

    public final void run() {
        FastScroller fastScroller = this.f111838a;
        fastScroller.f111481j = true;
        fastScroller.f111477f = fastScroller.f111476e.animate().translationX(C9432q.m18687b((Context) C39618d.f101160a, fastScroller.f111483l)).alpha(0.0f).setDuration(300).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                FastScroller.this.mo89871d();
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                FastScroller.this.mo89871d();
            }
        });
    }
}
