package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.b */
final /* synthetic */ class C24981b implements C0199s {

    /* renamed from: a */
    private final ChooseMusicFragmentView f66145a;

    C24981b(ChooseMusicFragmentView chooseMusicFragmentView) {
        this.f66145a = chooseMusicFragmentView;
    }

    public final void onChanged(Object obj) {
        ChooseMusicFragmentView chooseMusicFragmentView = this.f66145a;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            KeyboardUtils.m58184c(chooseMusicFragmentView.mSearchEditView);
        }
    }
}
