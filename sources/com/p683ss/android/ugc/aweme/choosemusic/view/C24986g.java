package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.utils.C47842ed;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.g */
public final /* synthetic */ class C24986g implements AnimatorUpdateListener {

    /* renamed from: a */
    private final ChooseMusicFragmentView f66151a;

    /* renamed from: b */
    private final int f66152b;

    /* renamed from: c */
    private final LayoutParams f66153c;

    public C24986g(ChooseMusicFragmentView chooseMusicFragmentView, int i, LayoutParams layoutParams) {
        this.f66151a = chooseMusicFragmentView;
        this.f66152b = i;
        this.f66153c = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ChooseMusicFragmentView chooseMusicFragmentView = this.f66151a;
        int i = this.f66152b;
        LayoutParams layoutParams = this.f66153c;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (C47842ed.m103485a(chooseMusicFragmentView.f66106a.getContext())) {
            chooseMusicFragmentView.endTextContainer.setTranslationX(((float) i) * (floatValue - 1.0f));
        } else {
            chooseMusicFragmentView.endTextContainer.setTranslationX(((float) i) * (1.0f - floatValue));
        }
        if (layoutParams != null) {
            layoutParams.width = (int) (((float) (chooseMusicFragmentView.f66112g - (C23728o.m58241a(16.0d) * 2))) - (((float) i) * floatValue));
            chooseMusicFragmentView.mSearchEditTextContainer.setLayoutParams(layoutParams);
        }
    }
}
