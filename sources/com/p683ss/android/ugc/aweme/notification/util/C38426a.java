package com.p683ss.android.ugc.aweme.notification.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.notification.p2031ui.LiveCircleView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notification.util.a */
public final class C38426a {

    /* renamed from: a */
    public LiveCircleView f97808a;

    /* renamed from: b */
    public AvatarImageView f97809b;

    /* renamed from: c */
    public boolean f97810c;

    /* renamed from: d */
    public int f97811d;

    /* renamed from: e */
    public int f97812e;

    /* renamed from: f */
    public ValueAnimator f97813f;

    /* renamed from: g */
    public ValueAnimator f97814g;

    /* renamed from: h */
    public List<UrlModel> f97815h = new ArrayList();

    /* renamed from: a */
    public final void mo78328a() {
        if (this.f97809b != null && this.f97808a != null && !this.f97810c) {
            if (this.f97813f != null) {
                this.f97813f.start();
                return;
            }
            this.f97811d = 1;
            this.f97813f = ValueAnimator.ofInt(new int[]{0, 800});
            this.f97814g = ValueAnimator.ofInt(new int[]{0, 800});
            this.f97814g.setRepeatCount(-1);
            this.f97814g.setRepeatMode(1);
            this.f97814g.setDuration(800);
            this.f97813f.setRepeatCount(-1);
            this.f97813f.setRepeatMode(1);
            this.f97813f.setDuration(800);
            this.f97813f.start();
            this.f97814g.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (intValue >= 0 && intValue <= 640) {
                        C38426a.this.f97808a.setFraction((((float) intValue) * 1.0f) / 640.0f);
                    }
                }
            });
            this.f97813f.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f;
                    float f2;
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    if (C38426a.this.f97811d % 5 == 0) {
                        f = 1.0f;
                    } else {
                        f = 0.08f;
                    }
                    if (C38426a.this.f97811d % 5 == 0 && animatedFraction > 0.48f && animatedFraction < 0.52f && C38426a.this.f97815h.size() != 0) {
                        C23515d.m57669a((RemoteImageView) C38426a.this.f97809b, (UrlModel) C38426a.this.f97815h.get(C38426a.this.f97812e));
                        C38426a.this.f97812e = (C38426a.this.f97812e + 1) % C38426a.this.f97815h.size();
                    }
                    if (animatedFraction <= 0.5f) {
                        f2 = 1.0f - (f * (animatedFraction / 0.5f));
                    } else {
                        f2 = (1.0f - f) + (f * ((animatedFraction - 0.5f) / 0.5f));
                    }
                    C38426a.this.f97809b.setScaleX(f2);
                    C38426a.this.f97809b.setScaleY(f2);
                    if (intValue >= 730 && intValue < 740 && !C38426a.this.f97810c) {
                        C38426a.this.f97810c = true;
                        C38426a.this.f97814g.start();
                    }
                }
            });
            this.f97813f.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationCancel(Animator animator) {
                    C38426a.this.f97814g.cancel();
                    C38426a.this.f97810c = false;
                }

                public final void onAnimationRepeat(Animator animator) {
                    C38426a.this.f97811d = (C38426a.this.f97811d + 1) % 5;
                }
            });
        }
    }
}
