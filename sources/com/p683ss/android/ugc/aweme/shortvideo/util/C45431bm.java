package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bm */
public final class C45431bm {
    /* renamed from: a */
    public static int m99002a(Context context, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return -(iArr[0] + view.getWidth());
    }

    /* renamed from: a */
    public static void m99003a(View view, float f, float f2, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{f, f2});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }
}
