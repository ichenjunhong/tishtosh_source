package com.bytedance.android.livesdk.chatroom.p325ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.am */
final /* synthetic */ class C5935am implements AnimatorUpdateListener {

    /* renamed from: a */
    private final InRoomPKAnimationView f15622a;

    C5935am(InRoomPKAnimationView inRoomPKAnimationView) {
        this.f15622a = inRoomPKAnimationView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        InRoomPKAnimationView inRoomPKAnimationView = this.f15622a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C9432q.m18680a(inRoomPKAnimationView.f15503b, -3, -3, intValue, -3);
        C9432q.m18680a(inRoomPKAnimationView.f15502a, intValue, -3, -3, -3);
    }
}
