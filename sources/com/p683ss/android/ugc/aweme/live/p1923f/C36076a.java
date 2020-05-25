package com.p683ss.android.ugc.aweme.live.p1923f;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* renamed from: com.ss.android.ugc.aweme.live.f.a */
public final class C36076a {
    /* renamed from: a */
    public static void m81448a(View view, Rect rect, Runnable runnable, View... viewArr) {
        if (view == null) {
            runnable.run();
            return;
        }
        view.setPivotX((float) rect.centerX());
        view.setPivotY((float) rect.centerY());
        view.animate().scaleX(0.0f).scaleY(0.0f).setDuration(200).setInterpolator(new DecelerateInterpolator()).withEndAction(runnable).start();
    }
}
