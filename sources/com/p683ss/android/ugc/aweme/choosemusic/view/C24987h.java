package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.utils.C47842ed;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.h */
public final /* synthetic */ class C24987h implements AnimatorUpdateListener {

    /* renamed from: a */
    private final ChooseMusicFragmentView f66154a;

    /* renamed from: b */
    private final int f66155b;

    /* renamed from: c */
    private final LayoutParams f66156c;

    public C24987h(ChooseMusicFragmentView chooseMusicFragmentView, int i, LayoutParams layoutParams) {
        this.f66154a = chooseMusicFragmentView;
        this.f66155b = i;
        this.f66156c = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ChooseMusicFragmentView chooseMusicFragmentView = this.f66154a;
        int i = this.f66155b;
        LayoutParams layoutParams = this.f66156c;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (C47842ed.m103485a(chooseMusicFragmentView.f66106a.getContext())) {
            chooseMusicFragmentView.endTextContainer.setTranslationX(((float) (-i)) * floatValue);
        } else {
            chooseMusicFragmentView.endTextContainer.setTranslationX(((float) i) * floatValue);
        }
        if (layoutParams != null) {
            layoutParams.width = (int) (((float) (chooseMusicFragmentView.f66112g - (C23728o.m58241a(16.0d) * 2))) - (((float) i) * (1.0f - floatValue)));
            chooseMusicFragmentView.mSearchEditTextContainer.setLayoutParams(layoutParams);
        }
        if (floatValue == 1.0f) {
            chooseMusicFragmentView.mLinearSearch.setVisibility(8);
            chooseMusicFragmentView.mRelativeSearch.setVisibility(0);
        }
    }
}
