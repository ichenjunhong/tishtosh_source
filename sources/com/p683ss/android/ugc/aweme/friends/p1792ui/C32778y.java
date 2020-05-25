package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.y */
final /* synthetic */ class C32778y implements AnimatorUpdateListener {

    /* renamed from: a */
    private final InviteFriendsActivity f85358a;

    C32778y(InviteFriendsActivity inviteFriendsActivity) {
        this.f85358a = inviteFriendsActivity;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f85358a.mBtnFloatInviteAllContainer.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
