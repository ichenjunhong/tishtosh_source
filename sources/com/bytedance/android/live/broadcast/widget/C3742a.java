package com.bytedance.android.live.broadcast.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.bytedance.android.live.core.p224c.C3831a;

/* renamed from: com.bytedance.android.live.broadcast.widget.a */
final /* synthetic */ class C3742a implements AnimatorUpdateListener {

    /* renamed from: a */
    private final AudioWidget f10609a;

    C3742a(AudioWidget audioWidget) {
        this.f10609a = audioWidget;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AudioWidget audioWidget = this.f10609a;
        if (audioWidget.f10384c != null) {
            try {
                audioWidget.f10384c.unlockCanvasAndPost(audioWidget.f10384c.lockCanvas(null));
            } catch (Throwable th) {
                C3831a.m9714b("AudioWidget", th);
            }
        }
    }
}
