package com.airbnb.lottie.p114f;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.airbnb.lottie.f.a */
public abstract class C2449a extends ValueAnimator {

    /* renamed from: a */
    final Set<AnimatorListener> f7550a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private final Set<AnimatorUpdateListener> f7551b = new CopyOnWriteArraySet();

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f7550a.clear();
    }

    public void removeAllUpdateListeners() {
        this.f7551b.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6788a() {
        for (AnimatorUpdateListener onAnimationUpdate : this.f7551b) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public void addListener(AnimatorListener animatorListener) {
        this.f7550a.add(animatorListener);
    }

    public void addUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.f7551b.add(animatorUpdateListener);
    }

    public void removeListener(AnimatorListener animatorListener) {
        this.f7550a.remove(animatorListener);
    }

    public void removeUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.f7551b.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6789a(boolean z) {
        for (AnimatorListener animatorListener : this.f7550a) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }
}
