package com.p683ss.android.ugc.aweme.shortvideo.record.p2223a;

import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a.f */
final class C44448f {

    /* renamed from: a */
    Context f112443a;

    /* renamed from: b */
    ViewGroup f112444b;

    /* renamed from: c */
    public TextView f112445c;

    /* renamed from: d */
    int f112446d;

    /* renamed from: e */
    int f112447e;

    /* renamed from: f */
    int f112448f;

    C44448f(ViewGroup viewGroup) {
        this.f112443a = viewGroup.getContext();
        this.f112444b = viewGroup;
    }

    /* renamed from: a */
    public final void mo90332a(boolean z) {
        if (this.f112445c != null && this.f112445c.getVisibility() == 0) {
            if (z) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(150);
                alphaAnimation.setAnimationListener(new AnimationListener() {
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        C44448f.this.f112445c.setVisibility(8);
                    }
                });
                this.f112445c.startAnimation(alphaAnimation);
                return;
            }
            this.f112445c.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo90331a(int i, int i2, int i3) {
        this.f112446d = i;
        this.f112447e = i2;
        this.f112448f = i3;
    }
}
